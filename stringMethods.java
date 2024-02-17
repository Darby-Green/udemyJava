public class stringMethods {
    public static void main(String[] args) {
        String birthDate = "31/01/2002";
        int startingIndex = birthDate.indexOf("2002");
        System.out.println("startingIndex = " + startingIndex);
        System.out.println("Birth Year = " + birthDate.substring(startingIndex));

        System.out.println("Month = " + birthDate.substring(3,5));
        String newDate = String.join("/", "23","03","2004");
        System.out.println(newDate);
    }
}
