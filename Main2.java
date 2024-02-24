public class Main2 {
    public static void main(String[] args) {
        smartKitchen kitchen = new smartKitchen();

//        kitchen.getDishWasher().setHasWorkToDo(true);
//        kitchen.getDishWasher().doDishes();
//        kitchen.getIceBox().setHasWorkToDo(true);
//        kitchen.getIceBox().orderFood();
//        kitchen.getBrewMaster().setHasWorkToDo(true);
//        kitchen.getBrewMaster().brewCoffee();

        kitchen.setKitchenState(true,false,true);
        kitchen.doKitchenWork();
    }
}
