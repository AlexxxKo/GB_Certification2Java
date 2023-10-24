public class Toy {

    public void decreaseQuantity() {
        quantity--;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity;
    }

    private int id;
    private String name;
    private int quantity;
    private int weight;
    static int count = 0;

    public Toy(String name, int quantity, int weight) {
        this.name = name;
        this.quantity = quantity;
        this.weight = weight;
        id = ++count;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
