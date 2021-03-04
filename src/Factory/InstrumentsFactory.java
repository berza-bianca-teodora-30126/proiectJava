package Factory;

public class InstrumentsFactory {
    public static Instruments getInstruments(String type) {
        if ("Violin".equals(type)) {
            return new Violin();
        } else if ("Guitar".equals(type)) {
            return new Guitar();
        } else if ("Flute".equals(type)) {
            return new Flute();
        }
        return null;

    }


}
