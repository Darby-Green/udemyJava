public class recordProject {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            LPAstudent s = new LPAstudent("s92300" + i,
                    switch (i) {
                case 1 -> "Mary";
                case 2 -> "Carol";
                case 3 -> "Tim";
                case 4 -> "Harry";
                case 5 -> "Lisa";
                default -> "Anonymous";
                },
                    "05/11/1985",
                    "JavaMasterClass");
            System.out.println(s);
        }
    }
}
