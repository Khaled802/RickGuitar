package Guitar.types;

public enum Wood {
    INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY,
    MAPLE, COCOBOLO, CEDAR, ADIRONDACK, ALDER, SITKA, ANY;

    public boolean equels(Object obj) {
        if (obj == ANY) return true;
        if (this == ANY) return true;
        return this == obj;
    }
}
