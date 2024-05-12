public class Calculadora {
    public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public static void main(String[] args) {
        int resultado = multiplicar(5, 3);
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }
}
