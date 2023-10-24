public class Main {
    public static void main(String[] args) {
        ToyStore toyStore = new ToyStore();

        Toy toy1 = new Toy("Doll", 1, 30);
        Toy toy2 = new Toy("Car", 1, 20);

        toyStore.addToy(toy1);
        toyStore.addToy(toy2);

        toyStore.print();
        System.out.println();

        String prize = toyStore.selectPrizeToy();
        if (prize != null) System.out.printf("Вы выиграли %s!\n", prize);

        toyStore.print();
        System.out.println();

        String getPrize = toyStore.givePrizeToy("Doll");
        if (getPrize != null) System.out.printf("Вот ваш выигрыш - %s\n", getPrize);
        else System.out.println("Наверное, вы ошибаетесь. Такой игрушки среди выигрышей нет");
//
//        toyStore.print();
//        System.out.println();
//
//        Toy toy3 = new Toy("Car2", 15, 20);
//        Toy toy4 = new Toy("Car3", 15, 20);
//
//        toyStore.addToy(toy3);
//        toyStore.addToy(toy4);
//
//        toyStore.print();
//        System.out.println();
    }
}