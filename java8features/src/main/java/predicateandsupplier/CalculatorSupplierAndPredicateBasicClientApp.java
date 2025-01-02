package predicateandsupplier;


import org.example.bo.CalculatorService;


import java.util.Scanner;

public class CalculatorSupplierAndPredicateBasicClientApp {


    public static void main(String[] args) {

        CalculatorService service = new CalculatorService();
        Scanner scanner = new Scanner(System.in);
        boolean wantToContinue = true;
        while (wantToContinue) {
            int value1, value2;
            System.out.println("Choose the below options");
            System.out.println("1. Addition");
            System.out.println("2. Substraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.println("Enter Your Choice");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Value1");
                    value1 = scanner.nextInt();
                    System.out.println("Enter Value2");
                    value2 = scanner.nextInt();
                    int addition = service.addition(() -> value1, () -> value2);
                    System.out.println("addition of two is -- " + addition);
                    break;
                case 2:
                    System.out.println("Enter Value1");
                    value1 = scanner.nextInt();
                    System.out.println("Enter Value2");
                    value2 = scanner.nextInt();
                    int subtraction = service.sub(() -> value1, () -> value2);
                    System.out.println("Subtraction of two is -- " + subtraction);
                    break;
                case 3: {
                    System.out.println("Enter Value1");
                    value1 = scanner.nextInt();
                    System.out.println("Enter Value2");
                    value2 = scanner.nextInt();
                    int mul = service.multiplication(() -> value1, () -> value2);
                    System.out.println("multiplication of two is -- " + mul);
                    break;
                }
                case 4: {
                    System.out.println("Enter Value1");
                    value1 = scanner.nextInt();
                    System.out.println("Enter Value2");
                    value2 = scanner.nextInt();
                    int mul = service.divsion(() -> value1, () -> value2);
                    System.out.println("division of two is -- " + mul);
                    break;
                }
                case 5: {
                    System.out.println("Existing the Application");
                    wantToContinue = false;
                    break;
                }
                default:
                    System.out.println("Please Enter Correct Choice");
                    break;
            }
        }
    }
}


