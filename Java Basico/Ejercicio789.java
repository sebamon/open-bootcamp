import java.util.Vector;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.io.FileInputStream;
import java.io.IOException;


public class Ejercicio789 {
    
    public static void main(String[] args) {
        
        String cadena = "Hola Mundo!!!!";
        System.out.println("Llamada a funcion reverse con cadena: "+cadena);
        System.out.println("Cadena Inversa: "+reverse(cadena) + "\n");
        //1. Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
        
        String arrayUnidimensional[] = {"Hola", "Que", "tal", "mundo"}; 
        for(String palabra:arrayUnidimensional){
            System.out.println(palabra);
        }
        System.out.println("// Fin Ejercicio 1 //\n");
        // Fin Ejercicio 1

        //2. Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
        int matriz[][] = {
            {1,2,3},
            {10,20,30}
        };
        
        for(int i=0;i<matriz.length;i++){
            for(int j=0; j<matriz[i].length;j++){
                System.out.println("Elemento Indice: "+i +" "+ j + " Valor: "+matriz[i][j]);
            }
        }

        //Impresión : Formato Matriz
        for(int i=0;i<matriz.length;i++){
            System.out.print("[");
            for(int j=0; j<matriz[i].length;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("]");
        }
        System.out.println("// Fin Ejercicio 2 //\n");
        // Fin Ejercicio 2

        //3. Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
        Vector<Integer> unVector = new Vector<Integer>();
        for(int i=0;i<5;i++){
            unVector.add(i);
        }
        System.out.println("Vector Original: "+unVector);
        unVector.remove(1); //Elimino el segundo elemento que se encuentra en la posición 2;
        unVector.remove(1); //Elimino el tercer elemento que al eliminar un elemento queda en la posicion 2 nuevamente;
        System.out.println("Vector Nuevo: "+unVector);

        System.out.println("// Fin Ejercicio 3 //\n");
        //  Fin Ejercicio 3

        //4. Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
        /*
         * El problema es que el vector al ser declarado con la capacidad por defecto, no alcanza el límite de 1000, y va a estar creando un nuevo vector, y copiando el viejo al nuevo varias veces.
         * Al Principio, la capacidad es 10, luego 20, 40, 80, 160....duplica su capacidad hasta alcanzar el límite de 1000.
         * 
         */

        //5. Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
        ArrayList<String> unArrayList = new ArrayList<String>();
        unArrayList.add("Hola");
        unArrayList.add("Como");
        unArrayList.add("Estas");
        unArrayList.add("?");
        LinkedList<String> unLinkedList = new LinkedList<String>(unArrayList);
        System.out.println("Recorriendo ArrayList");
        for(String elemento:unArrayList){
            System.out.println(elemento);
        }
        System.out.println("Recorriendo LinkedList");
        for(String elemento:unLinkedList){
            System.out.println(elemento);
        }
        System.out.println("// Fin Ejercicio 5 //\n");
        // Fin Ejercicio 5

        //6. Ejercicio 6
        

        // Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
        ArrayList<Integer> arrayListInteger = new ArrayList<Integer>();
        for(int i=1; i<=10;i++){
            arrayListInteger.add(i);
        }
        System.out.println("ArrayList Integer Original: "+arrayListInteger);

        // A continuación, con otro bucle, recórrelo y elimina los numeros pares. 
        for(int i=0;i<=arrayListInteger.size();i++){
            if(arrayListInteger.get(i) % 2==0){
                arrayListInteger.remove(i);
            }
        }
         // Por último, vuelve a recorrerlo y muestra el ArrayList final. 
        System.out.println("ArrayList Integer sin numeros pares: ");
        for(Integer elemento:arrayListInteger){
            System.out.print(elemento);
        }
        System.out.println("\n// Fin Ejercicio 6 //\n");
        
        /*7.
         * Crea una función DividePorCero. 
         * Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException 
         * que será capturada por su llamante (desde "main", por ejemplo). 
         * Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". 
         * Finalmente, mostraremos en cualquier caso: "Demo de código".
         */
        try{
            float resultado = DividePorCero(10,0);
            System.out.println("Resultado de la division: "+resultado);
        }catch(ArithmeticException e){
            System.out.println("Esto no puede hacerse: "+e.getMessage());
        }finally{
            System.out.println("Demo de código");
        }
        System.out.println("// Fin Ejercicio 7 // \n");


        /*8.
         * Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut". 
         * La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
         */
        try{
            InputStream ficheroIn = new FileInputStream("archivo.txt");
            PrintStream ficheroOut =  new PrintStream("Salida.txt");
            CopiarFichero(ficheroIn, ficheroOut);
        }catch(IOException e){
            System.out.println("Catch: "+e.getMessage());
        }
        System.out.println("// Fin Ejercicio 8 //\n");


        /*9.
         * Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones,
         *  un HashMap y un ArrayList, LinkedList o array.
         *
         *Se generará un HashMap<String,String> donde la KEY son paises y los VALUES sus capitales, y se exportará a un archivo llamado Capitales.txt
         */

         HashMap<String,String> capitales = new HashMap<String,String>();
         capitales.put("Argentina","Buenos Aires");
         capitales.put("Chile","Santiago");
         capitales.put("España","Madrid");
         capitales.put("Francia","Paris");
         capitales.put("Italia","Roma");
         ExportarCapitales(capitales);

    }

    public static String reverse(String texto){
        String reverse = "";
        for (int i = texto.length() - 1; i >= 0; i--)
        reverse += texto.charAt(i);

        return reverse;
    }

    public static float DividePorCero(int divisor, int dividendo) throws ArithmeticException{
        return divisor / dividendo;
    }
    public static void CopiarFichero(InputStream fileIn, PrintStream fileOut) throws IOException{
        boolean ok=false;
        try{
            byte []datos = fileIn.readAllBytes();
            fileIn.close();

            fileOut.write(datos);
            fileOut.close();
            ok=true;

        }catch(IOException e){
            System.out.println("Archivo no encontrado: "+e.getMessage());
        }
        finally{
            String mensaje = ok ? "El archivo se copio de forma exitosa" : "Error al copiar el archivo" ;
            if(ok){
                System.out.println(mensaje);
            }
        }
    }
    public static void ExportarCapitales(HashMap<String,String> capitales){
        try{
            PrintStream fileOut = new PrintStream("Capitales.txt");    
            
            for(Map.Entry<String,String> capital:capitales.entrySet()){
                fileOut.println(capital);
            }
        fileOut.close();
        }catch(IOException e){
            System.out.println("Error al exportar capitales: "+e.getMessage());
        }
        

    }
}
