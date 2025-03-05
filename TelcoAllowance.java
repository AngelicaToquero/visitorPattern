public class TelcoAllowance implements UsagePromo {
    @Override
    public String showAllowance(String telcoName, double price) {
        return telcoName + " offers a data plan for ₱" + price + ".";
    }


    public String showAllowance(String telcoName, int dataAllowance, double price) {
        return telcoName + " offers " + dataAllowance + "GB data plan for ₱" + price + ".";
    }
}
