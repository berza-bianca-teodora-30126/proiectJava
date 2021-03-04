package Factory;

public class Guitar implements Instruments {
    @Override
    public String getMaterial() {
        return "rosewood and mahogany";
    }

    @Override
    public Integer getMaterialAge() {
        return 25;
    }

    @Override
    public Integer getNumberOfStrings() {
        return 6;
    }

    @Override
    public String getType() {
        return "Yamaha clasic";
    }

    @Override
    public String toString() {
        return "Guitar";
    }
}
