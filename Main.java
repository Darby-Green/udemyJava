public class Main {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2280", "Dell",
                "240");
        Monitor theMonitor = new Monitor("27in the Bease", "Acer", 27,
                "2540 x 1440");
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus",
                4,6,"v2.44");
        personalComputer thePC = new personalComputer("2208", "Dell",
                theCase, theMonitor, theMotherboard);

//        thePC.getMonitor().drawPixelAt(10,10,"red");
//        thePC.getMotherboard().loadProgram("Windows O.S.");
//        thePC.getComputerCase().pressPowerButton();   direct call of methods in 'Product'

        thePC.powerUp(); // indirect call to 'personalComputer' and then to 'Product'
    }
}