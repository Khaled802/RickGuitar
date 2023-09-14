package Guitar;

import Guitar.types.Builder;
import Guitar.types.Type;
import Guitar.types.Wood;

import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List<Guitar> guitars;
    public Inventory() {
        this.guitars = new LinkedList<Guitar>();
    }

    public void AddGuitar(
        String serialNumber,
        Builder builder,
        String model,
        Type type,
        Wood backWood,
        Wood topWood,
        double price
    ) {
        var newGuitar = new Guitar(serialNumber, builder, model, type, backWood, topWood, price);
        this.guitars.add(newGuitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for (var guitar : this.guitars) {
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public List<Guitar> search(GuitarSpec searchGuitar) {
        List<Guitar> results = new LinkedList<Guitar>();
        for (var guitar : this.guitars) {
            var guitarSpec = guitar.getGuitarSpec();
            if (guitarSpec.match(searchGuitar))
                results.add(guitar);
        }
        return results;
    }
}
