package LexemaTarea.controls;

import LexemaTarea.view.Ventana;
import LexemaTarea.view.VentanaSimbolos;
import java.util.ArrayList;

public class TablaSimbolos {

    private Ventana v;

    // AnalisisLexico anaLex = new AnalisisLexico();
    ArrayList<Integer> arregloToken = new ArrayList<Integer>();
    ArrayList<String> arregloLexemas = new ArrayList<String>();
    
    //CONSTRUCTORES
    public TablaSimbolos() {

    }

    public TablaSimbolos(Ventana v) {
        this.v = v;
    }

    //METODOS
    public ArrayList<Integer> clonarArreglo(ArrayList<Integer> arregloToken1){
        arregloToken1 = (ArrayList<Integer>) arregloToken.clone();
        return arregloToken1;
    }
    
    public void llenarTablaSintactica() {
        VentanaSimbolos vs = new VentanaSimbolos();
        String matris[][] = new String[arregloLexemas.size()][2];

        //para las filas
        for (int i = 0; i < arregloLexemas.size(); i++) {
            matris[i][0] = arregloLexemas.get(i);
            matris[i][1] = Integer.toString(arregloToken.get(i));
        }

        vs.getTableSimbolos().setModel(new javax.swing.table.DefaultTableModel(
                matris,
                new String[]{
                    "Lexemas", "Tokens"
                }
        ));
    }

    public void getAnalisisSintactico(ArrayList<String> arreglo) {
        String lexemas = "";
        for (int i = 0; i < arreglo.size(); i++) {
            lexemas = lexemas + arreglo.get(i);
        }
        //String lexemas = v.getTxtaSalida().getText();
        String[] PalabrasSeparadas = lexemas.split("\n");

        for (int i = 0; i < PalabrasSeparadas.length; i++) {
            String palabra = PalabrasSeparadas[i];

            if (isNumeric(palabra)) {
                arregloLexemas.add(palabra);
                arregloToken.add(20);
                i++;
                palabra = PalabrasSeparadas[i];
            }

            switch (palabra) {
                case "/":
                    arregloLexemas.add(palabra);
                    arregloToken.add(130);
                    break;

                case "-":
                    arregloLexemas.add(palabra);
                    arregloToken.add(110);
                    break;

                case "*":
                    arregloLexemas.add(palabra);
                    arregloToken.add(120);
                    break;

                case "(":
                    arregloLexemas.add(palabra);
                    arregloToken.add(140);
                    break;

                case ")":
                    arregloLexemas.add(palabra);
                    arregloToken.add(150);
                    break;

                case ".":
                    arregloLexemas.add(palabra);
                    arregloToken.add(160);
                    break;

                case ";":
                    arregloLexemas.add(palabra);
                    arregloToken.add(180);
                    break;

                case ",":
                    arregloLexemas.add(palabra);
                    arregloToken.add(170);
                    break;

                case "<":
                    arregloLexemas.add(palabra);
                    arregloToken.add(310);
                    break;

                case ">":
                    arregloLexemas.add(palabra);
                    arregloToken.add(330);
                    break;

                case "=":
                    arregloLexemas.add(palabra);
                    arregloToken.add(200);
                    break;

                case "+":
                    arregloLexemas.add(palabra);
                    arregloToken.add(100);
                    break;

                case ">=":
                    arregloLexemas.add(palabra);
                    arregloToken.add(340);
                    break;
                case "<=":
                    arregloLexemas.add(lexemas);
                    arregloToken.add(320);
                    break;
                case "==":
                    arregloLexemas.add(palabra);
                    arregloToken.add(300);
                    break;
                case "+=":
                    arregloLexemas.add(palabra);
                    arregloToken.add(360);
                    break;
                case "!=":
                    arregloLexemas.add(palabra);
                    arregloToken.add(350);
                    break;

                case "const":
                    arregloLexemas.add(palabra);
                    arregloToken.add(400);
                    break;

                case "var":
                    arregloLexemas.add(palabra);
                    arregloToken.add(410);
                    break;

                case "proced":
                    arregloLexemas.add(palabra);
                    arregloToken.add(420);
                    break;

                case "begin":
                    arregloLexemas.add(palabra);
                    arregloToken.add(430);
                    break;

                case "end":
                    arregloLexemas.add(palabra);
                    arregloToken.add(440);
                    break;

                case "write":
                    arregloLexemas.add(palabra);
                    arregloToken.add(450);
                    break;

                case "read":
                    arregloLexemas.add(palabra);
                    arregloToken.add(460);
                    break;

                case "call":
                    arregloLexemas.add(palabra);
                    arregloToken.add(470);
                    break;

                case "if":
                    arregloLexemas.add(palabra);
                    arregloToken.add(480);
                    break;

                case "then":
                    arregloLexemas.add(palabra);
                    arregloToken.add(490);
                    break;

                case "while":
                    arregloLexemas.add(palabra);
                    arregloToken.add(500);
                    break;

                case "do":
                    arregloLexemas.add(palabra);
                    arregloToken.add(510);
                    break;

                case "for":
                    arregloLexemas.add(palabra);
                    arregloToken.add(520);
                    break;

                case "to":
                    arregloLexemas.add(palabra);
                    arregloToken.add(530);
                    break;

                case "dto":
                    arregloLexemas.add(palabra);
                    arregloToken.add(540);
                    break;

                default:
                    arregloLexemas.add(palabra);
                    arregloToken.add(10);

            }
        }
    }

    public static boolean isNumeric(String cadena) {
        boolean resultado;
        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    }
    
    public void LimpiarArreglos(){
        arregloToken.clear();
        arregloToken.clear();
    }
}
