public class Dog {

    // private variables not shown. Other methods not shown
    private String name;
    private double weight;
    private int medals;

    public Dog(String name, double weight, int medals) {
        this.name = name;
        this.weight = weight;
        this.medals = medals;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getMedals() {
        return medals;
    }
}
