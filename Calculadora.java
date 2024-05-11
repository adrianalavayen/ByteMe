public class Calculadora {
    public double sumar(double num1, double num2) {
        Suma suma = new Suma();
        return suma.operar(num1, num2);
    }
    public double restar(double num1, double num2) {
        Resta resta = new Resta();
        return resta.operar(num1, num2);
    }
    public double multiplicar(double num1, double num2) {
        Multiplicacion multiplicacion = new Multiplicacion();
        return multiplicacion.operar(num1, num2);
    }
    public double dividir(double num1, double num2) {
        Division division = new Division();
        return division.operar(num1, num2);
    }
}