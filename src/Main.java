import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any integer number: ");
        sqrt(scanner.nextInt());

    }

    public static UnaryOperator<Double> sqrt(int x) {
        UnaryOperator<Double> unaryOperator = () -> System.out.println(Math.sqrt(x));
        unaryOperator.method();
        return unaryOperator;
    }
}