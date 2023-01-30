
import java.text.DecimalFormat;
import java.util.Scanner;  // Import the Scanner class

public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);

        Scanner scanner = new Scanner(System.in);
        float precioInicial;
        float precioConIVa;
        System.out.println("Ingrese el valor al que desea calcular el iva: ");
        precioInicial = scanner.nextFloat();
        
        
        precioConIVa =Float.valueOf(df.format(SumarIva(precioInicial)));
        System.out.println(precioConIVa);
    }
    
    public static float SumarIva(float precio){
        int iva = 21;

        return  precio * (1 + (iva/100f));

    }
}
