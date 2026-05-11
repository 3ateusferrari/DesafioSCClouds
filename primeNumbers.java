import java.util.ArrayList;
import java.util.List;



public class primeNumbers {

    // Decidi fazer uma função dessa vez porque ficaria muito verboso para demonstrar acoplamento. Decidi desacoplar (melhor prática :))
    private static boolean ehPrimo(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Recursiva
    public static List<Integer> primosRecursivo(int n) {
        if (n <= 1) throw new IllegalArgumentException("N deve ser > 1");

        if (n == 2) return new ArrayList<>(List.of(2));

        List<Integer> resultado = primosRecursivo(n - 1);
        if (ehPrimo(n)) resultado.add(n);
        return resultado;
    }

    // LInear
    public static List<Integer> primosLinear(int n) {
        if (n <= 1) throw new IllegalArgumentException("N deve ser > 1");

        List<Integer> resultado = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (ehPrimo(i)) resultado.add(i);
        }
        return resultado;
    }

    // Apagar depois, isso não foi pedido
    //void main(){
    //    int n = 10; //entrada
    //    System.out.println("Primos recursivo até " + n + ": " + primosRecursivo(n));
    //    System.out.println("Primos linear até " + n + ": " + primosLinear(n));
    //}
}

