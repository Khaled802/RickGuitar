package Guitar.types;

public enum Type {
    ACOUSTIC, ELECTRIC, ANY;

    public boolean equels(Object obj) {
        if (obj == ANY) return true;
        if (this == ANY) return true;
        return this == obj;
    }
}
