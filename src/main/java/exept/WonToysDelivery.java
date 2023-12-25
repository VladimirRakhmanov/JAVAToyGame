package exept;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WonToysDelivery {

    public WonToysDelivery() {
    }

    public void deliver(ArrayList<Toy> toyWonList) {
        System.out.println("Игрушки успешно отправлены в файл выдачи.");
        try (FileWriter fileWriter = new FileWriter("delivery.txt")) {
            for (Toy toy : toyWonList) {
                fileWriter.write(toy.getToyName() + " " + toy.getQuantity() + " шт." + "\n");
            }

        } catch (IOException fwe) {
            throw new RuntimeException("Не удалось доставить игрушку в файл");
        }

    }
}
