/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author monst
 */


public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OperacionesBasicas op = new OperacionesBasicas();
        
        System.out.println("Seleccione una operación:");
        System.out.println("1. Suma\n2. Resta\n3. Multiplicación\n4. División con residuo");
        System.out.println("5. Factorial\n6. Número primo\n7. Fórmula general");
        
        int opcion = sc.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.print("Ingrese dos números: ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("Resultado: " + op.suma(a, b));
                break;
                
            case 2:
                System.out.print("Ingrese dos números: ");
                a = sc.nextInt();
                b = sc.nextInt();
                System.out.println("Resultado: " + op.resta(a, b));
                break;
                
            case 3:
                System.out.print("Ingrese dos números: ");
                a = sc.nextInt();
                b = sc.nextInt();
                System.out.println("Resultado: " + op.multiplicacion(a, b));
                break;
                
            case 4:
                System.out.print("Ingrese dos números: ");
                a = sc.nextInt();
                b = sc.nextInt();
                System.out.println(op.divisionConResiduo(a, b));
                break;
                
            case 5:
                System.out.print("Ingrese un número para calcular su factorial: ");
                int n = sc.nextInt();
                long fact = op.factorial(n);
                if (fact == -1) {
                    System.out.println("No se puede calcular el factorial de un número negativo.");
                } else {
                    System.out.println("Factorial: " + fact);
                }
                break;
                
            case 6:
                System.out.print("Ingrese un número para verificar si es primo: ");
                n = sc.nextInt();
                if (op.esPrimo(n)) {
                    System.out.println(n + " es un número primo.");
                } else {
                    System.out.println(n + " no es un número primo.");
                }
                break;
                
            case 7:
                System.out.print("Ingrese los coeficientes a, b y c: ");
                double coefA = sc.nextDouble();
                double coefB = sc.nextDouble();
                double coefC = sc.nextDouble();
                System.out.println(op.formulaGeneral(coefA, coefB, coefC));
                break;
                
            default:
                System.out.println("Opción no válida.");
        }
        
        sc.close();
    }
}

