package LexemaTarea.controls;

import LexemaTarea.view.Ventana;
import java.util.ArrayList;

public class AnalisisLexico {

    Ventana v;
    int contadorLineas = 1;
    AnalisisSintactico anaSint;

    public AnalisisLexico(Ventana v) {
        this.v = v;
    }

    public ArrayList<String> getLexemas(ArrayList<String> arreglo) {
        String contenido = v.getTxtaLexema().getText(); //agregamos el contenido del txt area del archivo

        elFor1:
        for (int i = 0; i <= contenido.length(); i++) {
            if (isFin(i, contenido.length())) {
                continue elFor1;
            }
            String lexPal = "";
            char c = contenido.charAt(i);

            if (Character.isLetter(c)) {
                while (Character.isLetterOrDigit(c) || c == '_') {
                    lexPal += c;
                    i++;
                    if (isFin(i, contenido.length())) {
                        lexPal = lexPal.replace(" ", "");
                        arreglo.add(lexPal);
                        continue elFor1;
                    }
                    c = contenido.charAt(i);
                }
                lexPal = lexPal.replace(" ", "");
                lexPal = lexPal + "\n";
                arreglo.add(lexPal);
                lexPal = "";
                //System.out.println(lexPal);

            }

            if (Character.isDigit(c)) {
                while (Character.isDigit(c) || c == '_') {
                    lexPal += c;
                    i++;
                    if (isFin(i, contenido.length())) {
                        lexPal = lexPal.replace(" ", "");
                        arreglo.add(lexPal);
                        continue elFor1;
                    }
                    c = contenido.charAt(i);
                }
                lexPal = lexPal.replace(" ", "");
                lexPal = lexPal + "\n";
                arreglo.add(lexPal);
                lexPal = "";
            }

            switch (c) {
                case ' ':
                    break;
                case '\n':
                    contadorLineas += 1;
                    break;
                case '-':
                case '/':
                case '*':
                case '(':
                case ')':
                case '.':
                case ';':
                case ',':
                    lexPal = c + "\n";
                    arreglo.add(lexPal);
                    break;

                case '!':
                    i++;
                    if (isFin(i, contenido.length())) {
                        arreglo.add(lexPal);
                        continue elFor1;
                    }
                    c = contenido.charAt(i);
                    if (c == '=') {
                        lexPal = "!=\n";
                        arreglo.add(lexPal);
                    } else {

                        lexPal = "!\n" + c;
                        arreglo.add(lexPal);
                    }

                    break;

                case '<':
                    i++;
                    /*if (isFin(i, contenido.length())) {
                        arreglo.add(lexPal);
                        continue elFor1;
                    }*/
                    c = contenido.charAt(i);
                    if (c == '=') {
                        lexPal = "<=\n";
                        arreglo.add(lexPal);
                    } else {

                        lexPal = "<\n" + c;
                        arreglo.add(lexPal);
                    }
                    break;

                case '>':
                    i++;
                    c = contenido.charAt(i);
                    if (c == '=') {
                        lexPal = ">=\n";
                        arreglo.add(lexPal);
                    } else {
                        lexPal = ">\n" + c;
                        arreglo.add(lexPal);
                    }
                    break;

                case '=':
                    //aumento a uno
                    i++;
                    c = contenido.charAt(i);
                    if (c == '=') {
                        lexPal = "==\n";
                        arreglo.add(lexPal);
                    } else {
                        //regulo el index
                        lexPal = "=\n" + c;
                        arreglo.add(lexPal);
                    }
                    break;

                case '+':
                    i++;
                    if (isFin(i, contenido.length())) {
                        arreglo.add(lexPal);
                        continue elFor1;
                    }
                    c = contenido.charAt(i);
                    if (c == '=') {
                        lexPal = "+=\n";
                        arreglo.add(lexPal);
                    } else {
                        lexPal = "+\n" + c;
                        arreglo.add(lexPal);
                    }
                    break;

                default:
                    v.getTxtaErrores().append("El caracter: " + c + " no es valido, error en la linea: " + contadorLineas + "\n");
            }
        }
        return arreglo;
    }

    private boolean isFin(int idx, int longitud) {
        return idx >= longitud;
    }
}
