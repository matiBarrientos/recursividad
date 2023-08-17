import java.util.Scanner;
public class divisionConResta {

        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int divisor, dividendo,resultadoRecursivo,resultadoIterativo;
        System.out.println("ingrese el dividendo");
        dividendo = s.nextInt();
        System.out.println("ingrese el divisor");
        divisor = s.nextInt();
        resultadoRecursivo = divisionRecursiva(dividendo, divisor);
        resultadoIterativo = divisionIterativa(dividendo,divisor);
        System.out.println("Resultado de la división con una funcion recursiva: " + resultadoRecursivo);
        System.out.println("Resultado de la división con una funcion iterativa: " + resultadoIterativo);
    }
    private static int divisionIterativa (int a , int b){
        int result=0;
        while(a>=b){
            a-=b;
            result++;
        
        }
        return result;
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
