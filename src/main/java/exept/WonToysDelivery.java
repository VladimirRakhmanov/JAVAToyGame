package exept;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WonToysDelivery {

    public WonToysDelivery() {

    }

    public void deliver(ArrayList<Toy> toyList) {
        try (FileWriter fileWriter = new FileWriter("delivery.txt")) {
            for (Toy toy : toyList) {
                fileWriter.write(toy.getToyName() + "\n");
            }

        } catch (IOException fwe) {
            throw new RuntimeException("Не удалось доставить игрушку в файл");
        }

    }
}
