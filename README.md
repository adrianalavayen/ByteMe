Creacion de la clase Calculadora con el metodo sumar (agregar en una clase diferente)

```java
public class Calculadora {
    public double sumar(double num1, double num2) {
        Suma suma = new Suma();
        return suma.operar(num1, num2);
    }
}
```

Adicion del metodo restar en la clase Calculadora

```java
public double restar(double num1, double num2) {
        Resta resta = new Resta();
        return resta.operar(num1, num2);
    }
```

Adicion del metodo multiplicar en la clase Calculadora

```java
public double multiplicar(double num1, double num2) {
        Multiplicacion multiplicacion = new Multiplicacion();
        return multiplicacion.operar(num1, num2);
    }
```
Adicion del metodo dividir en la clase Calculadora

```java
public double dividir(double num1, double num2) {
        Division division = new Division();
        return division.operar(num1, num2);
    }
```
Adicion de la clase suma 
```java
public class Suma {
    public double operar(double num1, double num2) {
        return num1 + num2;
    }
}
```
