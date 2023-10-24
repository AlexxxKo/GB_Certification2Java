public class Main {
    public static void main(String[] args) {
        ToyStore toyStore = new ToyStore();

        Toy toy1 = new Toy("Doll", 3, 30);
        Toy toy2 = new Toy("Car", 3, 20);

        toyStore.addToy(toy1);
        toyStore.addToy(toy2);

        toyStore.print();
        System.out.println();

        String prize = toyStore.selectPrizeToy();
        if (prize != null) System.out.printf("Вы выиграли %s!\n", prize);
        prize = toyStore.selectPrizeToy();
        if (prize != null) System.out.printf("Вы выиграли %s!\n", prize);

        toyStore.updateToyWeight("Car", 40);

        prize = toyStore.selectPrizeToy();
        if (prize != null) System.out.printf("Вы выиграли %s!\n", prize);
        prize = toyStore.selectPrizeToy();
        if (prize != null) System.out.printf("Вы выиграли %s!\n", prize);
        prize = toyStore.selectPrizeToy();
        if (prize != null) System.out.printf("Вы выиграли %s!\n", prize);
        prize = toyStore.selectPrizeToy();
        if (prize != null) System.out.printf("Вы выиграли %s!\n", prize);
        prize = toyStore.selectPrizeToy();
        if (prize != null) System.out.printf("Вы выиграли %s!\n", prize);
        prize = toyStore.selectPrizeToy();
        if (prize != null) System.out.printf("Вы выиграли %s!\n", prize);

        toyStore.print();
        System.out.println();

        System.out.println(toyStore.getSelectedPrizeToys());

        String getPrize = toyStore.givePrizeToy("Doll");
        if (getPrize != null) System.out.printf("Вот ваш выигрыш - %s\n", getPrize);
        else System.out.println("Наверное, вы ошибаетесь. Такой игрушки среди выигрышей нет");
        System.out.println(toyStore.getSelectedPrizeToys());
        getPrize = toyStore.givePrizeToy("Doll");
        if (getPrize != null) System.out.printf("Вот ваш выигрыш - %s\n", getPrize);
        else System.out.println("Наверное, вы ошибаетесь. Такой игрушки среди выигрышей нет");
        System.out.println(toyStore.getSelectedPrizeToys());
        getPrize = toyStore.givePrizeToy("Doll");
        if (getPrize != null) System.out.printf("Вот ваш выигрыш - %s\n", getPrize);
        else System.out.println("Наверное, вы ошибаетесь. Такой игрушки среди выигрышей нет");
        System.out.println(toyStore.getSelectedPrizeToys());
        getPrize = toyStore.givePrizeToy("Doll");
        if (getPrize != null) System.out.printf("Вот ваш выигрыш - %s\n", getPrize);
        else System.out.println("Наверное, вы ошибаетесь. Такой игрушки среди выигрышей нет");
        System.out.println(toyStore.getSelectedPrizeToys());
    }
}