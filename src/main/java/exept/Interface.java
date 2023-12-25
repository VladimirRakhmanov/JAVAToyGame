package exept;

import java.util.ArrayList;
import java.util.Scanner;

public class Interface {
    public Interface() {
    }
    public void showGame (ArrayList<Toy> toyList, Scanner scanner) throws ToyQuantityInputException {
//        Scanner scanner = new Scanner(System.in);
        for (Toy toy : toyList) {
            if (toy.getQuantity() == 0) {

                System.out.println("Игрушка закончилась: " + toy.getToyName());
                System.out.print("Добавьте игрушку " + toy.getToyName() + " (поместится не более 5 шт.): ");

                try {
                    toy.setQuantity(Integer.parseInt((scanner.nextLine())));
                    toy.limiter(); // обрежет количество введенных игрушек в диапазоне 1..5
                } catch (NumberFormatException nfe) {
                    throw new ToyQuantityInputException();
                }
            }
        }
    }
}
