package head.and.tail;

public enum Side {

    HEAD("head"), TAIL("tail");

    private final String sideName;

    Side(String sideName) {
        this.sideName = sideName;
    }

    @Override
    public String toString() {
        return sideName;
    }
}
