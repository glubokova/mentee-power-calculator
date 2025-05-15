package ru.mentee.power;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Welcome to the Java Calculator! ");
        Calculator calculator = new Calculator();

        System.out.println("Addition: 5 + 3 = " + calculator.add(5, 3));
        System.out.println("Subtraction: 10 - 4 = " + calculator.subtract(10, 4));
        System.out.println("Multiplication: 6 * 7 = " + calculator.multiply(6, 7));

        try {
            System.out.println("Division: 20 / 4 = " + calculator.divide(20, 4));
            System.out.println("Division: 10 / 3 = " + calculator.divide(10, 3));
            System.out.println("Division by zero: " + calculator.divide(5, 1));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n Try the calculator mini-game!");
        playGame();
    }

    private static void playGame() {
        Calculator calculator = new Calculator();
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Try the calculator mini-game!I guessed two numbers and performed the operation. Guess the result!");

        int a = (int) (Math.random() * 10) + 1;
        int b = (int) (Math.random() * 10) + 1;
        int operation = (int) (Math.random() * 4);

        int result;
        String operationName;

        switch (operation) {
            case 0:
                result = calculator.add(a, b);
                operationName = "additions";
                break;
            case 1:
                result = calculator.subtract(a, b);
                operationName = "subtractions";
                break;
            case 2:
                result = calculator.multiply(a, b);
                operationName = "multiplications";
                break;
            default:
                if (b == 0) b = 1;
                result = (int) calculator.divide(a, b);
                operationName = "divisions (whole part)";
                break;
        }

        System.out.println("Enter the result " + operationName + " numbers " + a + " and " + b + ":");

        int userAnswer = scanner.nextInt();

        if (userAnswer == result) {
            System.out.println("Right! You are magnificent! ");
        } else {
            System.out.println("Not really! Right answer: " + result);
        }
    }
}
