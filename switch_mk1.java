public class switch_mk1 {
    public static void main(String[] args) {
        int value = 1;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }
        switch (value) {
            case 1:
                System.out.println("value was: 1");
                break;
            case 2:
                System.out.println("value was: 2");
                break;
            default:
                System.out.println("The value was neither: 1 or 2");
        }
    }
}
