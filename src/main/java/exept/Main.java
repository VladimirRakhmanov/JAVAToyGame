package exept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

//        Toy Urs = new Toy(1, "Медведь", 5, 10);
//        Toy Horse = new Toy(2, "Лошадь", 2, 30);
//        Toy Dove = new Toy(3, "Голубь", 10, 80);
//        Toy Fox = new Toy(4, "Лиса", 7, 50);
        ArrayList<Toy> toyList = new ArrayList<>();
        toyList.addFirst(new Toy(1, "Медведь", 5, 15));
        toyList.add(new Toy(2, "Лошадь", 2, 25));
        toyList.add(new Toy(3, "Голубь", 10, 15));
        toyList.add(new Toy(4, "Лиса", 7, 45));


        ToysToObtainList toysToObtainList = new ToysToObtainList(toyList);
        toysToObtainList.showAllToys();

        Play play = new Play();
        Decorator decorator = new Decorator();
        decorator.decorate(play.generate_v1(toyList), toyList);
        toysToObtainList.showAllToys();
    }
}