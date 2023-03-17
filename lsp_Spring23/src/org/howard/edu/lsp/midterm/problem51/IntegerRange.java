package org.howard.edu.lsp.midterm.problem51;


public class IntegerRange implements Range {
    private int lower;
    private int upper;
public IntegerRange(int lower, int upper) {
    this.lower = lower;
    this.upper = upper;
}

public int getLower() {
    return lower;
}

public int getUpper() {
    return upper;
}

public boolean contains(int value) {
    return value >= lower && value <= upper;
}

public boolean overlaps(Range other) throws EmptyException {
    if (other == null) {
        throw new EmptyException("");
    }
    return !(other.getUpper() < lower || other.getLower() > upper);
}

public int size() {
    return upper - lower + 1;
}
}



