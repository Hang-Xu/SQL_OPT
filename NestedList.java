import java.util.ArrayList;
import java.util.List;

/**
 * A simple representation of a nested list where each element can be
 * either an integer value or another nested list.
 */
public class NestedList {
    private Integer value;
    private List<NestedList> list;

    /**
     * Creates an empty nested list.
     */
    public NestedList() {
        this.list = new ArrayList<>();
    }

    /**
     * Creates a nested list that stores a single integer value.
     *
     * @param value integer value to store
     */
    public NestedList(int value) {
        this.value = value;
    }

    /**
     * Adds another NestedList to this list.
     *
     * @param nested nested list to add
     */
    public void add(NestedList nested) {
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(nested);
    }

    /**
     * Returns true if this instance holds a single integer.
     */
    public boolean isInteger() {
        return value != null;
    }

    /**
     * Returns the stored integer or null if this instance represents a list.
     */
    public Integer getValue() {
        return value;
    }

    /**
     * Returns the nested list of elements or an empty list if this instance
     * stores an integer value.
     */
    public List<NestedList> getList() {
        if (list == null) {
            return new ArrayList<>();
        }
        return list;
    }
}
