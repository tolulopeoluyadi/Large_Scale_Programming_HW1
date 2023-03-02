package org.howard.edu.lsp.assignment4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerSet {
	private List<Integer> set;
	
	public IntegerSet() {
        set = new ArrayList<>();
	}
	public void clear() {
        set.clear();
	}
	
	// Returns the length of the set
	public int length() {
        return set.size(); // returns the length
	}
	

    /*
     * Returns true if the 2 sets are equal, false otherwise;
     * Two sets are equal if they contain all of the same values in ANY order.
     */
    public boolean equals(IntegerSet b) {
        if (this.set.size() != b.length()) {
            return false;
        }
        List<Integer> bSet = new ArrayList<>(b.set);
        for (int i = 0; i < set.size(); i++) {
            if (!bSet.remove(set.get(i))) {
                return false;
            }
        }
        return true;
    }

    // Returns true if the set contains the value, otherwise false
    public boolean contains(int value) {
        return set.contains(value);
    }

    // Returns the largest item in the set; Throws a IntegerSetException if the set is empty
    public int largest() throws IntegerSetException {
        if (set.isEmpty()) {
            throw new IntegerSetException("Set is empty");
        }
        return Collections.max(set);
    }

    // Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
    public int smallest() throws IntegerSetException {
        if (set.isEmpty()) {
            throw new IntegerSetException("Set is empty");
        }
        return Collections.min(set);
    }

    // Adds an item to the set or does nothing it already there
    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }
    }

    // Removes an item from the set or does nothing if not there
    public void remove(int item) {
        set.remove(Integer.valueOf(item));
    }

    // Set union
    public void union(IntegerSet intSetb) {
        for (int i = 0; i < intSetb.length(); i++) {
            int item = intSetb.set.get(i);
            if (!set.contains(item)) {
                set.add(item);
            }
        }
    }

    // Set intersection
    public void intersect(IntegerSet intSetb) {
        List<Integer> intersection = new ArrayList<>();
        for (int i = 0; i < intSetb.length(); i++) {
            int item = intSetb.set.get(i);
            if (set.contains(item)) {
                intersection.add(item);
            }
        }
        set = intersection;
    }

    // Set difference, i.e., s1 –s2
    public void diff(IntegerSet intSetb) {
        for (int i = 0; i < intSetb.length(); i++) {
            int item = intSetb.set.get(i);
            set.remove(Integer.valueOf(item));
        }
    }

    // Returns true if the set is empty, false otherwise
    public boolean isEmpty() {
        return set.isEmpty();
    }

    // Return String representation of your set
    public String toString() {
        return set.toString();
    }

}
	

