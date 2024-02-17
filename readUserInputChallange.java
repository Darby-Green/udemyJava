import java.util.Scanner;

public class readUserInputChallange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        double sum = 0;
        while (counter <= 5) {
            System.out.println("Enter No. " + counter + ":");
            String nextNumber = scanner.nextLine();
            try {
//                int number = Integer.parseInt(nextNumber); for using integers
                double number = Double.parseDouble(nextNumber);
                counter++;
                sum += number;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid Number!!");
            }
        }
        System.out.println("The sum of the 5 No. is: " + sum);
    }
}
