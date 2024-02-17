public class SecondsandMunitesChallange {
    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(-65,45));
        System.out.println(getDurationString(65,145));
    }
    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Input for seconds is not valid, "
                    + seconds + " Must be a positive intager";
        }
        return getDurationString( seconds / 60,seconds % 60);
    }
    public static String getDurationString(int minutes,int seconds) {
        if (minutes <= 0) {
            return "Input for minutes is not valid, "
                    + minutes + " Must be a positive intager";
        }
        if (seconds <= 0 || seconds >= 59) {
            return "Input for seconds not valid, "
                    + seconds + " must be between 0 and 59";
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        return hours +  "h " + remainingMinutes + "m " + seconds + "s ";

    }
}


