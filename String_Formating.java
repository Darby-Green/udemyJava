public class String_Formating {
    public static void main(String[] args) {
        String bullet = "List\n" +
                "\t\u2022 First Point \n" +
                "\t\t\u2022 Second Point \n";
        System.out.println(bullet);
        String textBlock = """
                List 2:
                    \u2022 Point 1
                        \u2002 Point 2""";
        System.out.println(textBlock);

        int age = 21;
        System.out.printf("your age = %d%n", age);
        int birthYear = 2023 - age;
        System.out.printf("Age = %d,%nBirth year = %d%n", age, birthYear);
    }
}
