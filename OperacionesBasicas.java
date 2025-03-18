
public class OperacionesBasicas {
    
    // Suma
    public int suma(int a, int b) {
        return a + b;
    }

    // Resta
    public int resta(int a, int b) {
        return a - b;
    }

    // Multiplicación
    public int multiplicacion(int a, int b) {
        return a * b;
    }

    // División con residuo
    public String divisionConResiduo(int a, int b) {
        if (b == 0) {
            return "Error: División entre cero";
        }
        int cociente = a / b;
        int residuo = a % b;
        return "Cociente: " + cociente + ", Residuo: " + residuo;
    }

    // Factorial
    public long factorial(int n) {
        if (n < 0) {
            return -1; // Indica que el factorial de un número negativo no está definido
        }
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    // Verificar si un número es primo
    public boolean esPrimo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Fórmula general (para ecuación cuadrática ax^2 + bx + c = 0)
    public String formulaGeneral(double a, double b, double c) {
        double discriminante = b * b - 4 * a * c;
        
        if (a == 0) {
            return "No es una ecuación cuadrática";
        }
        
        if (discriminante > 0) {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            return "Raíces reales: x1 = " + x1 + ", x2 = " + x2;
        } else if (discriminante == 0) {
            double x = -b / (2 * a);
            return "Raíz única: x = " + x;
        } else {
            return "Raíces complejas";
        }
    }
}

