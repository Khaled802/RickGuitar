import Guitar.GuitarSpec;
import Guitar.Inventory;
import Guitar.types.Builder;
import Guitar.types.Type;
import Guitar.types.Wood;

public class Main {
    public static void main(String[] args) {
        var inventory = new Inventory();
        // we add three guitars
        inventory.AddGuitar("isdo390", Builder.FENDER, "stratocastor",
                Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 10.0);
        inventory.AddGuitar("isd43i90", Builder.GIBSON, "stratocastor",
                Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 10.0);
        inventory.AddGuitar("irei830", Builder.GIBSON, "stratocastor",
                Type.ELECTRIC, Wood.INDIAN_ROSEWOOD, Wood.ALDER, 10.0);

        // add search info
        var guitar = new GuitarSpec(Builder.ANY, "StratocastoR",
                Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
        // printing the result of search
        System.out.println(inventory.search(guitar));
    }
}