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

