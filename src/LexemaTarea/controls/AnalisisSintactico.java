package LexemaTarea.controls;

import LexemaTarea.view.Ventana;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class AnalisisSintactico {//Solamente estan los tokens y no escribe los lexemas

    public static int contadorLexema;
    private Ventana v;
    ArrayList<Integer> arregloToken = new ArrayList<Integer>();
    ArrayList<String> arregloLexemas = new ArrayList<String>();

// ArrayList<Lexema> lexemas = null;
    //Para el getToken
    int idx = 0;
    int token = 0;
    String simbolo = "";
    int index = 0;
    //Para el getSimbolo
    //int idz = 0;
    //int simbolo = 0;

    public AnalisisSintactico(ArrayList<String> arregloLexemas, ArrayList<Integer> arregloToken, Ventana v) {
        this.arregloToken = arregloToken;
        this.arregloLexemas = arregloLexemas;

        this.v = v;
    }

    private int getToken() {
        int tok = -1;
        if (idx < arregloToken.size()) {
            tok = arregloToken.get(idx);
            idx++;
        }
        return tok;
    }

    //Me quede aqui
    private String getLexe() {
        String lex = "";
        if (index < arregloLexemas.size()) {
            lex = arregloLexemas.get(index);
            index++;
        }
        return lex;
    }

    public void programa() {
        token = getToken();
        simbolo = getLexe();
        v.getTxtaLexema().append(simbolo + " ");
        bloque();
        if (token != 160) {
            v.getTxtaErrores().append("Error se esperaba un punto Final\n");
            return;
        } else {
            v.getTxtaErrores().setText("");
            JOptionPane.showMessageDialog(null, "Compile success");
        }
    }

    public void bloque() {
        A();
        C();
        E();
        proposicion();
    }

    public void A() {
        if (token == 400) {
            if (token == 400) {
                token = getToken();
                simbolo = getLexe();
                v.getTxtaLexema().append(simbolo + " ");
            } else {
                v.getTxtaErrores().append("Error Const\n");
                return;
            }
            B();
            if (token == 180) {

                token = getToken();
                simbolo = getLexe();
                v.getTxtaLexema().append(simbolo + " ");
            } else {
                v.getTxtaErrores().append("Error ;\n");
                return;
            }
        }
        return;
    }

    public void B() {
        if (token != 10) {
            v.getTxtaErrores().append("Error id\n");//aqui
            return;
        }
        token = getToken();
        simbolo = getLexe();
        v.getTxtaLexema().append(simbolo + " ");
        if (token != 200) {
            v.getTxtaErrores().append("Error =\n");
            return;
        }
        token = getToken();
        simbolo = getLexe();
        v.getTxtaLexema().append(simbolo + " ");
        if (token != 20) {
            v.getTxtaErrores().append("Error num\n");
            return;
        }
        token = getToken();
        simbolo = getLexe();
        v.getTxtaLexema().append(simbolo + " ");
        NB();
    }

    public void NB() {
        if (token == 170) {
            token = getToken();
            simbolo = getLexe();
            v.getTxtaLexema().append(simbolo + " ");
            B();
        } else {
            return;
        }
    }

    public void C() {//aqui
        if (token == 410) {
            if (token == 410) {
                token = getToken();
                simbolo = getLexe();
                v.getTxtaLexema().append(simbolo + " ");
            } else {
                v.getTxtaErrores().append("Error var\n");
                return;
            }
            D();
            if (token == 180) {
                token = getToken();
                simbolo = getLexe();
                v.getTxtaLexema().append(simbolo + " ");
            } else {
                v.getTxtaErrores().append("Error ;\n");
                return;
            }
        }
        return;
    }

    public void D() {
        if (token == 10) {
            token = getToken();
            simbolo = getLexe();
            v.getTxtaLexema().append(simbolo + " ");
            ND();
        } else {
            v.getTxtaErrores().append("Error id\n");
            return;
        }
    }

    public void ND() {
        if (token == 170) {
            token = getToken();
            simbolo = getLexe();
            v.getTxtaLexema().append(simbolo + " ");
            D();
        } else {
            return;
        }
    }

    public void E() {
        if (token == 420) {
            if (token == 420) {
                token = getToken();
                simbolo = getLexe();
                v.getTxtaLexema().append(simbolo + " ");
            } else {
                v.getTxtaErrores().append("Error proced\n");
                return;
            }
            if (token == 10) {
                token = getToken();
                simbolo = getLexe();
                v.getTxtaLexema().append(simbolo + " ");
            } else {
                v.getTxtaErrores().append("Error id\n");
                return;
            }
            if (token == 180) {
                token = getToken();
                simbolo = getLexe();
                v.getTxtaLexema().append(simbolo + " ");
            } else {
                v.getTxtaErrores().append("Error ;\n");
                return;
            }
            bloque();//regresa
            if (token == 180) {
                token = getToken();
                simbolo = getLexe();
                v.getTxtaLexema().append(simbolo + " ");
            } else {
                v.getTxtaErrores().append("Error ;\n");
                return;
            }
            E();
        }
        return;
    }

    private void condicion() {
        switch (token) {
            case 300:
                token = getToken();
                simbolo = getLexe();
                v.getTxtaLexema().append(simbolo + " ");
                expre();
                break;
            case 350:
                token = getToken();
                simbolo = getLexe();
                v.getTxtaLexema().append(simbolo + " ");
                expre();
                break;
            case 310:
                token = getToken();
                simbolo = getLexe();
                v.getTxtaLexema().append(simbolo + " ");
                expre();
                break;
            case 330:
                token = getToken();
                simbolo = getLexe();
                v.getTxtaLexema().append(simbolo + " ");
                expre();
                break;
            case 320:
                token = getToken();
                simbolo = getLexe();
                v.getTxtaLexema().append(simbolo + " ");
                expre();
                break;
            case 340:
                token = getToken();
                simbolo = getLexe();
                v.getTxtaLexema().append(simbolo + " ");
                expre();
                break;
            default:
                v.getTxtaErrores().append("Error ==, !=, <,>,<= o =>\n");
                return;
        }
    }

    private void proposicion() {
        switch (token) {
            case 430:
                token = getToken();
                simbolo = getLexe();
                v.getTxtaLexema().append(simbolo + " ");
                cicloprop();
                if (token != 440) {
                    v.getTxtaErrores().append("Error End\n");
                    return;
                }
                token = getToken();
                break;
            case 10:
                token = getToken();
                simbolo = getLexe();
                v.getTxtaLexema().append(simbolo + " ");
                if (token != 200) {
                    v.getTxtaErrores().append("Error ;\n");
                    return;
                }
                token = getToken();
                simbolo = getLexe();
                v.getTxtaLexema().append(simbolo + " ");
                expre();
                break;
            case 450:
                token = getToken();
                simbolo = getLexe();
                v.getTxtaLexema().append(simbolo + " ");
                propwrite();
                break;
            case 460:
                token = getToken();
                simbolo = getLexe();
                v.getTxtaLexema().append(simbolo + " ");
                if (token != 10) {
                    v.getTxtaErrores().append("Error id\n");
                    return;
                }
                token = getToken();
                simbolo = getLexe();
                v.getTxtaLexema().append(simbolo + " ");//aqui acaba
                break;
            case 470:
                token = getToken();
                simbolo = getLexe();
                v.getTxtaLexema().append(simbolo + " ");
                if (token != 10) {
                    v.getTxtaErrores().append("Error id\n");
                    return;
                }
                token = getToken();
                simbolo = getLexe();
                v.getTxtaLexema().append(simbolo + " ");
                break;
            case 480:
                token = getToken();
                simbolo = getLexe();
                v.getTxtaLexema().append(simbolo + " ");
                condicion();
                if (token != 490) {
                    v.getTxtaErrores().append("Error then\n");
                    return;
                }
                proposicion();
                break;
            case 500:
                token = getToken();
                simbolo = getLexe();
                v.getTxtaLexema().append(simbolo + " ");
                condicion();
                if (token != 510) {
                    v.getTxtaErrores().append("Error then\n");
                    return;
                }
                proposicion();
                break;
            case 520:
                token = getToken();
                simbolo = getLexe();
                v.getTxtaLexema().append(simbolo + " ");
                if (token != 10) {
                    v.getTxtaErrores().append("Error id\n");
                    return;
                }
                token = getToken();
                simbolo = getLexe();
                v.getTxtaLexema().append(simbolo + " ");
                if (token != 200) {
                    v.getTxtaErrores().append("Error =\n");
                    return;
                }
                token = getToken();
                simbolo = getLexe();
                v.getTxtaLexema().append(simbolo + " ");
                expre();
                todto();
                expre();
                if (token != 510) {
                    v.getTxtaErrores().append("Error do");
                    return;
                }
                proposicion();
                break;
            default:
                v.getTxtaErrores().append("Error se esperaba begin,id, write, call, if, while o for\n");
                return;
        }
    }

    public void cicloprop() {
        proposicion();
        cproptemp();
    }

    public void cproptemp() {
        if (token == 180) {
            if (token == 180) {
                token = getToken();
                simbolo = getLexe();
                v.getTxtaLexema().append(simbolo + " ");
                cicloprop();
            } else {
                v.getTxtaErrores().append("Se esperaba ;\n");
                return;
            }
        }
    }

    public void propwrite() {
        if (token == 10 || token == 20) {
            token = getToken();
            simbolo = getLexe();
            v.getTxtaLexema().append(simbolo + " ");
        } else {
            v.getTxtaErrores().append("Error id o num\n");
            return;
        }
    }

    public void todto() {
        if (token == 510 || token == 540) {
            token = getToken();
            simbolo = getLexe();
            v.getTxtaLexema().append(simbolo + " ");
        } else {
            v.getTxtaErrores().append("Error do o dto\n");
            return;
        }
    }

    public void expre() {
        termino();
        g1expre();
    }

    public void g1expre() {
        if (token == 100 || token == 110) {
            sr();
            expre();
        }
    }

    public void sr() {
        if (token == 100 || token == 110) {
            token = getToken();
            simbolo = getLexe();
            v.getTxtaLexema().append(simbolo + " ");
        } else {
            v.getTxtaErrores().append("Error + o -\n");
            return;
        }
    }

    public void termino() {
        factor();
        g1term();
    }

    public void g1term() {
        if (token == 120 || token == 130) {
            md();
            termino();
        }
    }

    public void md() {
        if (token == 120 || token == 130) {
            token = getToken();
            simbolo = getLexe();
            v.getTxtaLexema().append(simbolo + " ");
        } else {
            v.getTxtaErrores().append("Error * o /\n");
            return;
        }
    }

    public void factor() {
        switch (token) {
            case 140:
                token = getToken();
                simbolo = getLexe();
                v.getTxtaLexema().append(simbolo + " ");
                expre();
                if (token != 150) {
                    v.getTxtaErrores().append("Error )\n");
                    return;
                }
                token = getToken();
                simbolo = getLexe();
                v.getTxtaLexema().append(simbolo + " ");
                break;
            case 10:
                token = getToken();
                simbolo = getLexe();
                v.getTxtaLexema().append(simbolo + " ");
                break;
            case 20:
                token = getToken();
                simbolo = getLexe();
                v.getTxtaLexema().append(simbolo + " ");
                break;
            default:
                v.getTxtaErrores().append("Error (, id o num\n");
                return;
        }
    }
}
