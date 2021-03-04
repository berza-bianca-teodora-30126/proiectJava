package Visitor;

public class Scheduler implements ItemElement{
    private int price;
    private String identifierNumber;

    public Scheduler(int cost, String identifier){
        this.price=cost;
        this.identifierNumber=identifier;
    }

    public int getPrice() {
        return price;
    }

    public String getIdentifierNumber() {
        return identifierNumber;
    }

    @Override
    public int accept(ShoppingVisitor visitor) {
        return visitor.visit(this);
    }
}
