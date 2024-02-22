import java.util.ArrayList;
import java.util.Arrays;

public class autoBoxing {
    public static void main(String[] args) {

        Integer autoBoxed = 15;
        int autoUnboxed = autoBoxed;
        System.out.println(autoBoxed.getClass().getName());

        Double resultBoxed = getLiteralDoublePrim();
        double resultUnboxed = getDoubleObject();

        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 50; // sets 1st element to 50, rest elements will be null
        System.out.println(Arrays.toString(wrapperArray));

        System.out.println(wrapperArray[0].getClass().getName());

        Character[] characterArray = {'a', 'b', 'c', 'd'};
        System.out.println(Arrays.toString(characterArray));

        var ourList = getList(1,2,3,4,5);
        System.out.println(ourList);
    }

    private static ArrayList<Integer> getList(Integer...varargs) { // Will work with int or Integer values
        ArrayList<Integer> aList = new ArrayList<>();
        for (int i : varargs) {
            aList.add(i);
        }
        return aList;
    }
    private static int returnInt (Integer i) {
        return i;
    }
    private static Integer returnInteger (int i) {
        return i;
    }
    private static Double getDoubleObject() {
        return Double.valueOf(100.00);
    }
    private static double getLiteralDoublePrim() {
        return 100.0;
    }
}
