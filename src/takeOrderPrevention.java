public class takeOrderPrevention {
    boolean check(int id){
        if(id%2 == 0){
            return true;
        }
        System.out.println("Order ID is incorrect, please contact the company about this problem");
        return false;
    }
}
