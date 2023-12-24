package exept;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        ArrayList<Toy> toyList = new ArrayList<>();
        ToysToObtainList toysToObtainList = new ToysToObtainList(toyList);
        Decorator decorator = new Decorator();
        WonToysDelivery wonToys = new WonToysDelivery();
        Play play = new Play();
        Scanner scanner = new Scanner(System.in);

        String flag = "";

        toyList.addFirst(new Toy(1, "Медведь", 2, 15));
        toyList.add(new Toy(2, "Лошадь", 2, 25));
        toyList.add(new Toy(3, "Голубь", 2, 15));
        toyList.add(new Toy(4, "Лиса", 2, 45));

        toysToObtainList.showAllToys();

        while (!Objects.equals(flag, "e")) {
            decorator.decorate(play.generate_v1(toyList), toyList);
            System.out.print("Введите команду (e - выход): ");
            flag = scanner.nextLine();

            for (Toy toy : toyList) {
                if (toy.getQuantity() == 0) {

                    flag = "e";
                    System.out.println("Игрушка закончилась: " + toy.getToyName());
                }
            }

            toysToObtainList.showAllToys();
            wonToys.deliver(toyList);
        }
    }
}