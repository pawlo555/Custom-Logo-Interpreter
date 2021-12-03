package interpreter;

public class Variable {
    private final String stringValue;
    private final Double numericValue;

    public Variable(String value) {
        stringValue = value;
        numericValue = null;
    }

    public Variable(Double numeric) {
        stringValue = null;
        numericValue = numeric;
    }

    public double getNumericValue() {
        assert numericValue != null: "Tryin to get numericValue form null";
        return numericValue;
    }

    public String getStringValue() {
        assert stringValue != null: "Trying to get stringValue from null";
        return stringValue;
    }
}
