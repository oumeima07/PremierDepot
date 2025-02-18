import java.util.Scanner;


public class Calculatrice {
    public int addition(int a, int b) {
        return a + b;
    }

    public int soustraction(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public double division(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division par zéro !");
        }
        return (double) a / b;
    }
}

public class Test {
    public static void main(String[] args) {
        Calculatrice calc = new Calculatrice();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez la première valeur:");
        int a = scanner.nextInt();
        
        System.out.println("Entrez la deuxième valeur:");
        int b = scanner.nextInt();
        
        System.out.println("Choisissez une opération: +, -, *, /");
        char operation = scanner.next().charAt(0);

        try {
            switch (operation) {
                case '+':
                    System.out.println("Résultat: " + calc.addition(a, b));
                    break;
                case '-':
                    System.out.println("Résultat: " + calc.soustraction(a, b));
                    break;
                case '*':
                    System.out.println("Résultat: " + calc.multiplication(a, b));
                    break;
                case '/':
                    System.out.println("Résultat: " + calc.division(a, b));
                    break;
                default:
                    System.out.println("Opération non valide");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        
        scanner.close();
    }
}