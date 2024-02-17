public class someMoreOnStrings {
    public static void main(String[] args) {
        printInfo("Hello World");
        printInfo("");
        printInfo("\t   \n");
        String hello = "Hello World";
        System.out.printf("index of r = %d %n", hello.indexOf("r"));
        System.out.printf("index of world = %d %n", hello.indexOf("world"));

        String hello2 = hello.toLowerCase();
        if (hello.equals(hello2)) {
            System.out.println("Values match exactly");
        }
        if (hello.equalsIgnoreCase(hello2)) {
            System.out.println("Values match ignoring case");
        }
    }
    public static void printInfo(String string) {
        int length = string.length();
        System.out.printf("Length = %d %n", length);
        if (string.isEmpty()) {
            System.out.println("String is Empty");
            return;
        }
        if (string.isBlank()) {
            System.out.println("String is Blank");
        }
        System.out.printf("First char = %c %n", string.charAt(0));

        System.out.printf("Last char = %c %n", string.charAt(length-1));
    }
}
