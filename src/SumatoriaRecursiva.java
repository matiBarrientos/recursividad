public class SumatoriaRecursiva {

    // Método recursivo para calcular la sumatoria
    public static int calcularSumatoria(int n) {
        if (n == 1) {
            return 1;
        }
        return n + calcularSumatoria(n - 1);
    }

    public static void main(String[] args) {
        int numero = 5;

        // Calcula la sumatoria utilizando recursión
        int sumatoria = calcularSumatoria(numero);
        System.out.println("La sumatoria de los números enteros desde 1 hasta " + numero + " es: " + sumatoria);
    }
}




