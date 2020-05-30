public enum PlaneType {
    BOEING747(20, 5000);

    private final int capacity;
    private final double totalWeight;

    PlaneType(int capacity, float totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public double getTotalWeight() {
        return this.totalWeight;
    }
}
