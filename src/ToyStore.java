import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ToyStore {

    public void addToy(Toy toy) {
        toys.add(toy);
    }

    public void updateToyWeight(String toyName, int weight) {
        for (Toy toy : toys) {
            if (toy.getName().equals(toyName)) {
                toy.setWeight(weight);
                break;
            }
        }
    }

    public String selectPrizeToy() {
        int totalWeight = 0;
        for (Toy toy : toys) {
            totalWeight += toy.getWeight();
        }

        if (totalWeight > 0) {
            Random random = new Random();
            int randomNumber = random.nextInt(totalWeight);

            int currentWeight = 0;
            for (Toy toy : toys) {
                currentWeight += toy.getWeight();
                if (randomNumber < currentWeight) {
                    selectedPrizeToys.add(toy.getName());
                    toy.decreaseQuantity();
                    if (toy.getQuantity() == 0) toys.remove(toy);
                    return toy.getName();
                }
            }
        }
        return null;
    }

    public String givePrizeToy(String toyzName) {
        String isPrize = null;
        for (String prize : selectedPrizeToys) {
            if (prize.equals(toyzName)) {
                isPrize = prize;
                break;
            }
        }

        if (isPrize != null) {
            selectedPrizeToys.remove(isPrize);

            try {
                FileWriter writer = new FileWriter("./toysRemoved.txt", true);
                writer.write(isPrize + "\n");
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return isPrize;
    }

    public void print() {
        for (Toy toy : toys) {
            System.out.println(toy);
        }
    }

    private List<Toy> toys;
    private List<String> selectedPrizeToys = new ArrayList<>();

    public ToyStore() {
        toys = new ArrayList<>();
    }

    public List<String> getSelectedPrizeToys() {
        return selectedPrizeToys;
    }
}
