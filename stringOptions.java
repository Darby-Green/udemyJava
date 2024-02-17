public class stringOptions {
    public static void main(String[] args) {
        String helloWorld = "Hello " + "World";

        StringBuilder helloWorldBuilder = new StringBuilder("Hello " + "World");

        printInfo(helloWorld);
        printInfo(helloWorldBuilder);

        StringBuilder emptyStart = new StringBuilder();
        StringBuilder emptyStart32 = new StringBuilder(32);

        printInfo(emptyStart);
        printInfo(emptyStart32);

    }

    public static void printInfo(String string) {

        System.out.println("String = " + string);
        System.out.println("Length = " + string.length());
    }

    public static void printInfo(StringBuilder builder) {

        System.out.println("StringBuilder = " + builder);
        System.out.println("Length = " + builder.length());
        System.out.println("Capasity = " + builder.capacity());
    }
}
