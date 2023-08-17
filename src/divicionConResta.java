import java.util.Scanner;
public class divicionConResta {

        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int divisor, dividendo;
        System.out.println("incgrese el dividendo");
        dividendo = s.nextInt();
        System.out.println("ingrese el divisor");
        divisor = s.nextInt();
        int resultado = divisionRecursiva(dividendo, divisor);
        System.out.println("Resultado de la división: " + resultado);
    }
    public static int divisionRecursiva(int dividendo, int divisor) {
        // Caso base: si el dividendo es menor que el divisor, el resultado es 0
        if (dividendo < divisor) {
            return 0;
        }
        
        // Caso recursivo: restar el divisor del dividendo y llamar a la función recursivamente
        return 1 + divisionRecursiva(dividendo - divisor, divisor);
    }
}
