package exept;

import java.util.ArrayList;
import java.util.Random;

public class Play {

    public Play() {
    }
// функция случайного выбора игрушек из массива, где игрушки повторяются с определенной в их свойствах частотой.
    public int generate_v1(ArrayList<Toy> toyList, ArrayList<Toy> toyWonList) {
        Random rnd = new Random();
        int x = rnd.nextInt(1, 10) * 10;
        int[] chances = new int[100];

        int sizeToyList = toyList.size();
        int[] freq = new int[sizeToyList]; // массив, который содержит в себе частоты выпадения игрушки

        for (int j = 0; j < sizeToyList; j++)
            freq[j] = toyList.get(j).getFrequency();

        int limiter = 0;
        for (int k = 0; k < freq.length; k++) {

            for (int i = 0; i < freq[k]; i++)
                chances[i + limiter] = toyList.get(k).getID();

            limiter = freq[k] + limiter;

        }
        int winner = chances[x];
        for (int i = 0; i < toyList.size(); i++) {
            Toy toy = toyList.get(i);

            if (toy.getID() == winner) {
                toy.setQuantity(toy.getQuantity() - 1);
                toyWonList.add(new Toy(i, toy.getToyName(), 1, 0));

            }
        }


        return winner;
    }

}
