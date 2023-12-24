package exept;

import java.util.ArrayList;

public class Decorator {

    public Decorator() {
    }

    public void decorate(int playResult, ArrayList<Toy> toyList) {

        String nameOfToy = "";
        for (Toy toy : toyList) {
            if (playResult == toy.getID())
                nameOfToy = toy.getToyName();
        }

       // System.out.println("++++++++++++++++++++++++++++");
        System.out.println("++++++++++++++++++++++++++++");
        System.out.println("+++++++++  " + nameOfToy + "  +++++++++");
        System.out.println("++++++++++++++++++++++++++++");
        System.out.println();

    }
}
