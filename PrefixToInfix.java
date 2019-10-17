package github1;

import java.util.ArrayList;

/**
 * PrefixtoInfix Converter. for any Question, suggestions you can contact me to
 * briyant_zeuz21@hotmail.com
 *
 * @author DotExe
 */
public class PrefixToInfix {

    static String temp = "";
    static String d = "";

    static String FinalStringConversion = "";

    public static void main(String[] args) {
        // you have to use "," like separator for numbers and operators and obviously in Prefix mode.
        String exampleInput = "-,+,-,+,49,*,8,2,/,20,5,13,*,/,100,50,2";
        System.out.println("Prefix example:\n" + exampleInput);

        System.out.println("Infix converted:\n" + inputStringStartConversion(exampleInput));

    }

    /**
     * inputStringStartConversion() receive an String Prefix like input and
     * using "," like separator between numbers and operators.
     *
     * @param c String Prefix example.
     * @return an Infix String converted.
     */
    private static String inputStringStartConversion(String c) {
        stackConversion pila = new stackConversion();

        String[] ca = c.split(",");

        for (int i = ca.length - 1; i >= 0; i--) {
            temp = "";

            if (ca[i].matches("[0-9]*")) {

                d += ca[i];
                pila.Push(d);
                d = "";
            } else if (ca[i].matches("[+]|[-]|[/]|[*]|[(]")) {

                temp = "";
                temp += pila.operadorPreInfija(ca[i]);

            }

        }

        return FinalStringConversion = temp;

    }

    /**
     * stackConversion uses an ArrayList like stack to do all conversion
     * process.
     */
    static class stackConversion {

        ArrayList<String> pil = new ArrayList<>();

        public void Push(String text) {
            pil.add(text);
        }

        public String operadorPreInfija(String operador) {
            String s = "";

            if ((pil.size() - 1) - 1 < 0) {

            }
            s += "(" + pil.get(pil.size() - 1) + operador + pil.get(pil.size() - 2) + ")";
            pil.remove(pil.size() - 1);
            pil.remove(pil.size() - 1);

            pil.add(s);
            return s;

        }

    }

}
