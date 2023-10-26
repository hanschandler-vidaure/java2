public class Item {
    private double cost;
    private int number;
    private String name;
    public Item(float v, int i, String socks) {
        this.cost = v;
        this.number = i;
        this.name = socks;
    }

    public double getCost() {
        return cost;
    }

    public int getNumber() {
        return number;
    }
    public String getName()
    {
        return name;
    }
}
