package Factory;

public class Flute implements Instruments {
    @Override
    public String getMaterial() {
        return "Gold and silver";
    }

    @Override
    public Integer getMaterialAge() {
        return 15;
    }

    @Override
    public Integer getNumberOfStrings() {
        return 0;
    }

    @Override
    public String getType() {
        return "Yamaha" ;
    }

    @Override
    public String toString() {
        return "Flute";
    }
}
