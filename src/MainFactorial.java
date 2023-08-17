import java.util.Scanner;
public class MainFactorial {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        // Solicita al usuario ingresar un número para calcular su factorial
        System.out.println("ingrese el numero para sacar el factorial");
        double numero = s.nextDouble();

        // Calcula el factorial utilizando recursión
        double factorialRecursivo = FactorialCalculator.calcularFactorial(numero);
        System.out.println("Factorial (Recursión) de " + numero + ": " + factorialRecursivo);

        // Calcula el factorial utilizando iteración
        double factorialIterativo = FactorialCalculator.calcularFactorial(numero, true);
        System.out.println("Factorial (Iteración) de " + numero + ": " + factorialIterativo);
    }
}
