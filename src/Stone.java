public abstract class Stone {
    private String name;
    private double weight;
    private double costPerCarat;
    public Stone() {}
    public Stone(String name, double newWeight, double newCost) {
        this.name = name;
        this.weight = newWeight;
        this.costPerCarat = newCost;
    }
    public double getCost() {
        return weight * costPerCarat;
    }
    public double getCostPerCarat() {
        return costPerCarat;
    }
    public double getWeight() {
        return weight;
    }
    public String getName() {
        return name;
    }
}
