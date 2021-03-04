package Factory;


public class Main {
    public static void main(String[] args) {
        Logistics violinStock = new Logistics("Violin", 2);
        Logistics guitarStock = new Logistics("Guitar", 80);
        Logistics fluteStock = new Logistics("Flute", 47);

        buy(violinStock,5 );
        buy(guitarStock,14 );
        buy(fluteStock,30 );

        checkStock(violinStock);
        checkStock(guitarStock);
        checkStock(fluteStock);

        sell(violinStock,2 );
        sell(guitarStock,9 );
        sell(fluteStock,16 );

        checkStock(violinStock);
        checkStock(guitarStock);
        checkStock(fluteStock);

    }
    public static void buy (Logistics stock, Integer amount){
        stock.setAmount(stock.getAmount() + amount);
    }

    public static void sell (Logistics stock, Integer amount){
        stock.setAmount(stock.getAmount() - amount);
        System.out.println("The buyer has purchased " + amount + " " + InstrumentsFactory.getInstruments(stock.getType()) );
    }

    public static void checkStock (Logistics stock) {
        System.out.println(stock);
    }
}

