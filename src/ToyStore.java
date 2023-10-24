import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ToyStore {

    public void addToy(Toy toy) {
        toys.add(toy);
    }

    public void updateToyWeight(int toyName, int weight) {
        for (Toy toy : toys) {
            if (toy.getName().equals(toyName)) {
                toy.setWeight(weight);
                break;
            }
        }
    }

    public Toy findToyByName(String toyName) {
        for (Toy toy : toys) {
            if (toy.getName().equals(toyName)) {
                return toy;
            }
        }
        return null;
    }

    public void updateToyQuantity(int toyName, int quantity) {
        for (Toy toy : toys) {
            if (toy.getName().equals(toyName)) {
                toy.setQuantity(quantity);
                break;
            }
        }
    }

    public Toy selectPrizeToy() {
        int totalWeight = 0;
        for (Toy toy : toys) {
            totalWeight += toy.getWeight();
        }

        Random random = new Random();
        int randomNumber = random.nextInt(totalWeight);

        int currentWeight = 0;
        for (Toy toy : toys) {
            currentWeight += toy.getWeight();
            if (randomNumber < currentWeight) {
                return toy;
            }
        }

        return null;
    }

    public void givePrizeToy() {
        Toy prizeToy = selectPrizeToy();

        if (prizeToy != null) {
            toys.remove(prizeToy);

            try {
                FileWriter writer = new FileWriter("./toysRemoved.txt", true);
                writer.write(prizeToy.toString() + "\n");
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            prizeToy.decreaseQuantity();
        }
    }

    public void print() {
        for (Toy toy : toys) {
            System.out.println(toy);
        }
    }

    private List<Toy> toys;

    public ToyStore() {
        toys = new ArrayList<>();
    }
}
