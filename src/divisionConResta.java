import java.util.Scanner;

public class divisionConResta {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int divisor, dividendo, resultadoRecursivo, resultadoIterativo;
        
        // Solicita al usuario ingresar el dividendo y el divisor
        System.out.println("Ingrese el dividendo:");
        dividendo = s.nextInt();
        System.out.println("Ingrese el divisor:");
        divisor = s.nextInt();
        
        // Calcula los resultados utilizando funciones recursivas e iterativas
        resultadoRecursivo = divisionRecursiva(dividendo, divisor);
        resultadoIterativo = divisionIterativa(dividendo, divisor);
        
        // Muestra los resultados en la consola
        System.out.println("Resultado de la división con una función recursiva: " + resultadoRecursivo);
        System.out.println("Resultado de la división con una función iterativa: " + resultadoIterativo);
    }
    
    // Función para realizar la división de manera iterativa
    private static int divisionIterativa(int dividendo, int divisor) {
        int result = 0;
        while (dividendo >= divisor) {
            dividendo -= divisor;
            result++;
        }
        return result;
    }

    // Función para realizar la división de manera recursiva
    public static int divisionRecursiva(int dividendo, int divisor) {
        // Caso base: si el dividendo es menor que el divisor, el resultado es 0
        if (dividendo < divisor) {
            return 0;
        }
        
        // Caso recursivo: restar el divisor del dividendo y llamar a la función recursivamente
        return 1 + divisionRecursiva(dividendo - divisor, divisor);
    }
}
