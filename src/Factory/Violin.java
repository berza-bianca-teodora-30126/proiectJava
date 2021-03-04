package Factory;

public class Violin implements Instruments {

    @Override
    public String getMaterial() { return "spruce wood and willow";}

    @Override
    public Integer getMaterialAge() {
        return 300;
    }

    @Override
    public Integer getNumberOfStrings() {
        return 4;
    }

    @Override
    public String getType() {
        return "Stradivarius";
    }

    @Override
    public String toString() {
        return "Violin";

    }
}
