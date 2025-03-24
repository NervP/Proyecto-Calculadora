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
// Número Primo---Maleny
    public boolean esPrimo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
// Factorial 
    public double factorial(int n) {
        if (n < 0) {
            return -1; 
        }
        double resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
// Fórmula general
    public String formulaGeneral(double a, double b, double c) {
        double resultado = b * b - 4 * a * c; 

        if (a == 0 || resultado < 0) {
            return "No se puede resolver";
        }

        if (resultado == 0) {
            double x = -b / (2 * a);
            return "Raíz única: x = " + x;
        } else {
            double x1 = (-b + Math.sqrt(resultado)) / (2 * a);
            double x2 = (-b - Math.sqrt(resultado)) / (2 * a);
            return "Raíces reales: x1 = " + x1 + ", x2 = " + x2;
        }
    }
 }
