package Guitar.types;

public enum Builder {
    FENDER, MARTIN, GIBSON, COLLINGS,
    OLSON, RYAN, PRS, ANY;



    public boolean equels(Object obj) {
        if (obj == ANY) return true;
        if (this == ANY) return true;
        return obj == this;
    }
//    public String toString() {
//        switch (this) {
//            case FENDER: return "Fender";
//            case MARTIN: return "Martin";
//            case GIBSON: return "Gibson";
//            case COLLINGS: return "Collings";
//            case OLSON: return "Olson";
//            case RYAN: return "Ryan";
//            case PRS: return "Pys";
//            default: return "";
//        }
//    }
}
