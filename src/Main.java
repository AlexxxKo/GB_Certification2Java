public class Main {
    public static void main(String[] args) {
        ToyStore toyStore = new ToyStore();

        Toy toy1 = new Toy("Doll", 10, 30);
        Toy toy2 = new Toy("Car", 15, 20);

        toyStore.addToy(toy1);
        toyStore.addToy(toy2);

        toyStore.print();
        System.out.println();

        toyStore.givePrizeToy();

        toyStore.print();
        System.out.println();

        Toy toy3 = new Toy("Car2", 15, 20);
        Toy toy4 = new Toy("Car3", 15, 20);

        toyStore.addToy(toy3);
        toyStore.addToy(toy4);

        toyStore.print();
        System.out.println();
    }
}