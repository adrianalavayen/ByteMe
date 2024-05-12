AgreCreacion de la clase Calculadora con el metodo dividir

    public class Calculadora {
    public static int dividir(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        int resultado = dividir(10, 2);
        System.out.println("El resultado de la división es: " + resultado);
    }
    }

"AgreCreacion de la clase Calculadora con el metodo multiplicar
actualizado por errores anteriores "

    public class Calculadora {
    public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public static void main(String[] args) {
        int resultado = multiplicar(5, 3);
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }
    }
