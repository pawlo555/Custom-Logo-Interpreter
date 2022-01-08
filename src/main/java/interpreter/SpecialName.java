package interpreter;

public enum SpecialName {
    GETX, getx, gety, GETY;

    static public SpecialName checkValue(String string) {
        try {
            return SpecialName.valueOf(string);
        }
        catch (Exception ignored) {}
        return null;
    }
}
