public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Darby");

        boolean isAlien = true;
        if (isAlien == true) {
            System.out.println("Is not Alien!");
            System.out.println("And I am scared af aliens!!");
        }
        int topscore = 80;
        if (topscore < 100) {
            System.out.println("You got the high score!");
        }

        int secondtopscore = 60;
        if ((topscore > secondtopscore) && (topscore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topscore > 90) || (secondtopscore <= 90)) {
            System.out.println("Either or both conditions are true");
        }
        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is True!!");
        }
        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not soupost to happen!!");
        }
        String makeOfCar = "Volkswagon";
        boolean isDomestic = makeOfCar == "Volkswagon" ? false : true;

        if (isDomestic) {
            System.out.println("This car is domestic to our country");
        }
        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";

        System.out.println(s);

        double dank1 = 20.00d;
        double dank2 = 80.00d;
        double dank3 = (dank1 + dank2) * 100d;
        System.out.println(dank3);
        double remander = dank3 % 40.00d;
        System.out.println(remander);
        boolean t = (remander == 0) ? true : false;
        System.out.println(t);
        if (!t) {
            System.out.println("Got some remender: " + remander);
        }
        }
    }



