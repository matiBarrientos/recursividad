public class FactorialCalculator {

    // Método para calcular factorial utilizando recursión
    public static double calcularFactorial(double n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calcularFactorial(n - 1);
    }

    // Método para calcular factorial utilizando iteración
    public static double calcularFactorial(double n, boolean iterativo) {
        if (iterativo) {
            double factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            return factorial;
        } else {
            return calcularFactorial(n);
        }
    }
}