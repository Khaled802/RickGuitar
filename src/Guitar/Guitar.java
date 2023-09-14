package Guitar;

import Guitar.types.Builder;
import Guitar.types.Type;
import Guitar.types.Wood;

public class Guitar {
    private final String serialNumber;
    private final GuitarSpec guitarSpec;
    private double price;

    public Guitar(
            String serialNumber,
            Builder builder,
            String model,
            Type type,
            Wood backWood,
            Wood topWood,
            double price
    ) {
        this.serialNumber = serialNumber;
        this.guitarSpec = new GuitarSpec(builder, model, type, backWood, topWood);
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public GuitarSpec getGuitarSpec() {
        return this.guitarSpec;
    }

    @Override
    public String toString() {
        return "Guitar:"+this.serialNumber;
    }
}
