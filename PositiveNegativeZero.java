public class PositiveNegativeZero {
    public static void main(String[] args) {
        System.out.println(checkNumber());
    }
    public static String checkNumber() {
        int numb = -2;
        if (numb > 0) {
            return "positive";
        } else if (numb < 0) {
            return "negative";
        }
            return "zero";
        }
    }

