import java.util.Scanner;

public class minAndMaxChalange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double max = 0;
        double min = 0;
        int loopCount = 0;
        while (true) {

            System.out.println("Enter a number, or any character to exit: ");
            String nextEntry = scanner.nextLine();
            try {
                double validNumb = Double.parseDouble(nextEntry);
                if (loopCount == 0 || validNumb < min) {
                    min = validNumb;
                }
                if (loopCount == 0 || validNumb > max) {
                    max = validNumb;
                }
                loopCount++;
            } catch (NumberFormatException nfe) {
                break;
            }
        }
        if (loopCount > 0) {
            System.out.println("Min= " + min + ",Max= " + max);
        } else {
            System.out.println("No valid data was entered!!");
        }
    }
}
