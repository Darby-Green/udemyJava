import java.util.Scanner;

public class ParsingValues {
    public static void main(String[] args) {
        int currentYear = 2023;
        System.out.println(getInputFromScanner(currentYear));
    }
    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, what is your name?");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + ", Thanks for taking the course!");

//        String dateOfBirth = System.console().readLine("What year were you born? "); // previous method
        System.out.println("What year were you born? ");

        boolean validDOB = false;
        int age = 0;
        do {
            System.out.println("Enter a year of birth >= " +
                    (currentYear - 125) + " and <= " + (currentYear));
            try {
                age = checkData(currentYear, scanner.nextLine());
                validDOB = age < 0 ? false : true;
            } catch (NumberFormatException badUserData) {
                System.out.println("Characters not allowed!!!");
            }
        } while (!validDOB);
            return "So you are " + age + " years old.";
        }
        public static int checkData ( int currentYear, String dateOfBirth){
            int dob = Integer.parseInt(dateOfBirth);
            int minimumYear = currentYear - 125;

            if ((dob < minimumYear) || (dob > currentYear)) {
                return -1;
            }
            return (currentYear - dob);
        }
    }

