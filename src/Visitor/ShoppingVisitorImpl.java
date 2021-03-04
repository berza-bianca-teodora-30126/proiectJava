package Visitor;

public class ShoppingVisitorImpl implements ShoppingVisitor {
    @Override
    public int visit(Scheduler scheduler) {
        int cost=0;
        if(scheduler.getPrice() > 50){
            cost = scheduler.getPrice()-5;
        }else cost = scheduler.getPrice();
        System.out.println("IdentifierNumber::"+scheduler.getIdentifierNumber() + " cost ="+cost);
        return cost;
    }
    @Override
    public int visit(Vegetables vegetables) {
        int cost = vegetables.getPricePerKg()*vegetables.getWeight();
        System.out.println(vegetables.getName() + " cost = "+cost);
        return cost;
    }
}
