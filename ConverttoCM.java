public class ConverttoCM {
    public static void main(String[] args) {
        System.out.println(feet_inch(6,0));
    }
    public static int convertToCm(int hightIn) {

        int hightCM = (int) (hightIn * 2.54);
        return hightCM;
    }
    public static int feet_inch(int foot,int inch) {
       int convert = (foot*12) + inch;
       int dank = convertToCm(convert);
       return dank;

    }
}
