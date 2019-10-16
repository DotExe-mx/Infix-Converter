/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package github1;

import java.util.ArrayList;

/**
 *PostfixtoInfix Converter.
 * for any Question, suggestions you can contact me to briyant_zeuz21@hotmail.com
 * @author DotExe
 */
public class PostfixToInfix {
        static String temp="";
        static String d="";
        static String salida="";
        static stackConversion pila;
        static String FinalConversionString;
   
        public static void main(String[] args) {
            // you have to use "," like separator for numbers and operators and obviously in Postfix mode.
            String exampleInput="27,2,*,8,2,/,9,9,3,+,*,+,+,8,-,7,+,5,+";
            System.out.println("Postfix example:\n"+ exampleInput);
            System.out.println("--- Infix output ----------->\n"+inputStringStartConversion(exampleInput));
    }
    
   
        /**
         * inputStringStartConversion() receive an String Postfix like input and using "," like separator between numbers and operators. 
         * @param c String Postfix example.
         * @return an Infix String converted. 
         */
    static private String inputStringStartConversion(String c) {
        pila = new stackConversion();
        String []ca = c.split(",");
        temp = "";
        d = "";
       

        for (int i = 0; i < ca.length; i++) {
            temp = "";

            if (ca[i].matches("[0-9]*")) {
                
                d += ca[i];
                pila.Push(d);
                d = "";
            } else if (ca[i].matches("[+]|[-]|[/]|[*]|[(]")) {

                temp = "";
                temp += pila.operadorPostInfija(ca[i]);

            }

        }
        return FinalConversionString = temp;
        

    } 
    /**
     * stackConversion uses an ArrayList like stack to do all conversion process.
     */
    static class stackConversion {

    ArrayList<String> pil = new ArrayList<>();

    public void Push(String text) {
        pil.add(text);
    }
    public String operadorPostInfija(String operador){
        String s="";
        if((pil.size()-1)-1<0){
            
        }
        s+="("+pil.get(pil.size()-2)+ operador +pil.get(pil.size()-1)+")" ;
        pil.remove(pil.size()-1);
        pil.remove(pil.size()-1);
        
        pil.add(s);
        return s;
        
        
    }
  
}
}



