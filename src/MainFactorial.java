public class MainFactorial {

        public static void main(String[] args) {
            double numero = 10;

            // Calcula el factorial utilizando recursión
            double factorialRecursivo = FactorialCalculator.calcularFactorial(numero);
            System.out.println("Factorial (Recursión) de " + numero + ": " + factorialRecursivo);

            // Calcula el factorial utilizando iteración
            double factorialIterativo = FactorialCalculator.calcularFactorial(numero, true);
            System.out.println("Factorial (Iteración) de " + numero + ": " + factorialIterativo);
        }
    }

