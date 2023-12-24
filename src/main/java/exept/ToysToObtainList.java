package exept;

import java.util.ArrayList;

public class ToysToObtainList {
    ArrayList<Toy> toyList;

    public ToysToObtainList(ArrayList<Toy> toyList) {
        this.toyList = toyList;
    }

    public void showAllToys() {
        for (Toy toy : toyList) {
            System.out.println(toy);
        }
    }

}
