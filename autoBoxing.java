public class autoBoxing {
    public static void main(String[] args) {

        Integer autoBoxed = 15;
        int autoUnboxed = autoBoxed;
        System.out.println(autoBoxed.getClass().getName());

        Double resultBoxed = getLiteralDoublePrim();
        double resultUnboxed = getDoubleObject();
    }
    private static Double getDoubleObject() {
        return Double.valueOf(100.00);
    }
    private static double getLiteralDoublePrim() {
        return 100.0;
    }
}
