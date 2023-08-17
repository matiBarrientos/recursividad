import java.util.Scanner;

public class SumatoriaRecursiva {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //
        System.out.println("ingrese el numero");
        int numero = s.nextInt();

        // Calcula la sumatoria utilizando recursión
        int sumatoria = calcularSumatoria(numero);
        System.out.println("La sumatoria de los números enteros desde 1 hasta " + numero + " es: " + sumatoria);
    }
}
    // Método recursivo para calcular la sumatoria
    public static int calcularSumatoria(int n) {
        if (n == 1) {
            return 1;
        }
        return n + calcularSumatoria(n - 1);
    }





