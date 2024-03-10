import java.util.Scanner;

public class SwitchCaseExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 5:");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You chose One.");
                break;
            case 2:
                System.out.println("You chose Two.");
                break;
            case 3:
                System.out.println("You chose Three.");
                break;
            case 4:
                System.out.println("You chose Four.");
                break;
            case 5:
                System.out.println("You chose Five.");
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 5.");
        }

        scanner.close();
    }
}
