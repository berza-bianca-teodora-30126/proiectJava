package Visitor;

public class Main {
    public static void main(String[] args) {
        ItemElement[] items = new ItemElement[]{new Scheduler(25, "3234"),new Scheduler(160, "5678"),
                new Vegetables(16, 2, "Potato"), new Vegetables(5, 5, "Tomato")};

        int total = calculatePrice(items);
        System.out.println("Total Cost = "+total);
    }

    private static int calculatePrice(ItemElement[] items) {
        ShoppingVisitor visitor = new ShoppingVisitorImpl();
        int sum=0;
        for(ItemElement item : items){
            sum = sum + item.accept(visitor);
        }
        return sum;
    }
}
