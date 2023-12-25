package exept;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ToyQuantityInputException {

        ArrayList<Toy> toyList = new ArrayList<>();
        ArrayList<Toy> toyWonList = new ArrayList<>();

        ToysToObtainList toysToObtainList = new ToysToObtainList(toyList);
        Decorator decorator = new Decorator();
        WonToysDelivery wonToys = new WonToysDelivery();
        Play play = new Play();
        Interface interf = new Interface();
        Scanner scanner = new Scanner(System.in);


        toyList.addFirst(new Toy(1, "Медведь", 2, 15));
        toyList.add(new Toy(2, "Лошадь", 2, 25));
        toyList.add(new Toy(3, "Голубь", 2, 15));
        toyList.add(new Toy(4, "Лиса", 2, 45));

        toysToObtainList.showAllToys();

        String flag;
        System.out.print("Введите команду ( g - играть, все прочее - выход): ");
        flag = scanner.nextLine();
        while (flag.equals("g")) {
            decorator.decorate(play.generate_v1(toyList, toyWonList), toyList);
            interf.showGame(toyList, scanner);

//            for (Toy toy : toyList) {
//                if (toy.getQuantity() == 0) {
//
//                    System.out.println("Игрушка закончилась: " + toy.getToyName());
//                    System.out.print("Добавьте игрушку " + toy.getToyName() + " (поместится не более 5 шт.): ");
//
//                    try {
//                        toy.setQuantity(Integer.parseInt((scanner.nextLine())));
//                        toy.limiter(); // обрежет количество введенных игрушек в диапазоне 1..5
//                    } catch (NumberFormatException nfe) {
//                        throw new ToyQuantityInputException();
//                    }
//                }
//            }
            System.out.print("Введите команду ( g - играть, все прочее - выход): ");
            flag = scanner.nextLine();
        }

        toysToObtainList.showAllToys();
        wonToys.deliver(toyWonList);
    }
}