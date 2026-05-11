//Poderia fazer uma funçãozinha para validar se o valor é maior ou igual a zero, mas quis acoplar a validação para que cada função não precise de nada fora dela mesma.

public class Fibonacci {

    // Recursiva
    public static long fibonacciRecursivo(int n) {
        if (n < 0) throw new IllegalArgumentException("N deve ser  >= 0");
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
    }

    // Linear
    public static long fibonacciLinear(int n) {
        if (n < 0) throw new IllegalArgumentException("N deve ser >= 0");
        if (n == 0) return 0;
        if (n == 1) return 1;

        long anterior = 0, atual = 1;
        for (int i = 2; i <= n; i++) {
            long proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
        return atual;
    }
}

//Execução teste REMOVER MAIS TARDE (não foi pedido)
void main() {
    int n = 10; // Exemplo de entrada
    System.out.println("Fibonacci recursivo de  " + n + ": " + Fibonacci.fibonacciRecursivo(n));
    System.out.println("Fibonacci linear de " + n  + ": " + Fibonacci.fibonacciLinear(n));
}
