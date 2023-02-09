public class Ejercicio3 {
    
    public static void main(String[] args) {
    
        String[] cadenas = {"Hola","Como","Estas"};

        String textoResultado="";
        for(String cadena:cadenas){
            textoResultado=textoResultado + " " + cadena;
        }

    System.out.println("Texto Final: "+textoResultado);
    }


}
