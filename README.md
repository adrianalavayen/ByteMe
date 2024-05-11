Creacion de la clase Calculadora con el metodo sumar (agregar en una clase diferente)

```java
public class Calculadora {
    public double sumar(double num1, double num2) {
        Suma suma = new Suma();
        return suma.operar(num1, num2);
    }
}
```