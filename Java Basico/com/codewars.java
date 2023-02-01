package com;
import java.util.Iterator;
import java.util.ArrayList;
public class codewars {
    
    public static void main(String[] args) {
 
        int valor= 456;
        String cadena = String.valueOf(valor);

        System.out.println("Lenght: "+cadena.length());
        

        System.out.println("cadena " + cadena);
        DRoot.digital_root(valor);
        

    }

    public class DRoot {
        public static int digital_root(int n) {
        //   ArrayList <String> cadena = new ArrayList(String.valueOf(n));
          ArrayList <Integer> enteros = new ArrayList<Integer>(n);
          Iterator <Integer> iterator = enteros.iterator();


          while(iterator.hasNext()){
            Integer i = iterator.next();
              System.out.println("i"+i);
        }
            

        //   System.out.println("-- Inicio Programa --");
        //   System.out.println("cadena en funcion "+cadena);
        //   int sumatoria= 0; 
        //   Iterator <String> iterator = cadena.iterator();
        //   while(iterator.hasNext()){
        //       System.out.println(iterator.next());

        //   }
            // for( char c: cadena.toCharArray()){
            //     System.out.print(c);
            // sumatoria+= Character.getNumericValue(c);
            // if( System.out.print(" + ");
        // }
        // System.out.println(" = "+sumatoria);

          return 0;
        }
      }
}
