import java.math.BigDecimal;

public class Desafio {
    
    public static void main(String[] args) {
        BigDecimal base = new BigDecimal(2022);

        System.out.println(puzzle(new BigDecimal(10)));
        System.out.println(puzzle(new BigDecimal(100)));
        System.out.println(puzzle(base.pow(100)));
    }

    public static BigDecimal puzzle(BigDecimal n){
        BigDecimal A = new BigDecimal(1);
        BigDecimal B = new BigDecimal(1);
        BigDecimal C = new BigDecimal(1);
        BigDecimal D = new BigDecimal(1);
        BigDecimal X = new BigDecimal(0); 
        BigDecimal divisor = new BigDecimal("10000000000");
        
        for (BigDecimal i = BigDecimal.ZERO; i.compareTo(n) < 0; i = i.add(BigDecimal.ONE)){
            BigDecimal newC= C.multiply(new BigDecimal(2));
            BigDecimal newB= B.multiply(new BigDecimal(3));
            BigDecimal newA= A.multiply(new BigDecimal(4));

            X = D.add(newC);
            
            X = X.add(newB);
            
            X = X.add(newA);

            A=B;
            B=C;
            C=D;
            D=X;
        }

        return D.remainder(divisor);

        

    }
}
