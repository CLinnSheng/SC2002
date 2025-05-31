public class VendingMachineApp {
    
    public static void main(String [] args) {
  
        VendingMachine vm = new VendingMachine();
        double cost_of_drink = vm.selectDrink();
        double amt_insert = vm.insertCoins(cost_of_drink);
        vm.checkChange(amt_insert, cost_of_drink);
        vm.printReceipt();

    }
}
