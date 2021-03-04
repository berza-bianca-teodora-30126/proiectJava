package Visitor;

public class Vegetables implements ItemElement {
    private int pricePerKg;
    private int weight;
    private String name;

    public Vegetables(int priceKg, int wt, String nm){
        this.pricePerKg=priceKg;
        this.weight=wt;
        this.name = nm;
    }

    public int getPricePerKg() {
        return pricePerKg;
    }


    public int getWeight() {
        return weight;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public int accept(ShoppingVisitor visitor) {
        return visitor.visit(this);
    }
}
