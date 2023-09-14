package Guitar;

import Guitar.types.Builder;
import Guitar.types.Type;
import Guitar.types.Wood;

public class GuitarSpec {
    private final String model;
    private final Builder builder;
    private final Type type;
    private final Wood backWood, topWood;
    public GuitarSpec(
            Builder builder,
            String model,
            Type type,
            Wood backWood,
            Wood topWood
    ) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public Builder getBuilder() {
        return builder;
    }
    public String getModel() {
        return model;
    }
    public Type getType() {
        return type;
    }
    public Wood getBackWood() {
        return backWood;
    }
    public Wood getTopWood() {
        return topWood;
    }
    public boolean match(GuitarSpec guitarSpec) {
        Builder builder = guitarSpec.getBuilder();
        if (!builder.equels(this.getBuilder()))
            return false;
        String model = guitarSpec.getModel();
        if ((model != null) && (!model.isEmpty()) &&
                (!model.equalsIgnoreCase(this.getModel())))
            return false;
        Type type = guitarSpec.getType();
        if (!type.equals(this.getType()))
            return false;
        Wood backWood = guitarSpec.getBackWood();
        if (!backWood.equels(this.getBackWood()))
            return false;
        Wood topWood = guitarSpec.getTopWood();
        if (!topWood.equels(this.getTopWood()))
            return false;
        return true;
    }
}
