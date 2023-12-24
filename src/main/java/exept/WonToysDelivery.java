package exept;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WonToysDelivery {

//    FileWriter fileWriter = new FileWriter("delivery.txt");

    public WonToysDelivery(ArrayList<Toy> toysToDeliveryList) throws IOException {

        try (FileWriter fileWriter = new FileWriter("delivery.txt")) {
            for (Toy toy : toysToDeliveryList) {
                fileWriter.write(toy.getToyName());
            }

        } catch (IOException fwe) {
            throw new RuntimeException("Не удалось доставить игрушку в файл");
        }
    }
}
