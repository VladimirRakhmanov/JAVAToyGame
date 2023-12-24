package exept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Play {

    public Play() {
    }

    public int generate(Random random, int[] numbers, int[] chances) {
        int x = random.nextInt(chances[chances.length - 1]);
        int i = Arrays.binarySearch(chances, x);
        if (i < 0) i = -1 - i;
        return numbers[i];
    }

    public int generate_v1(ArrayList<Toy> toyList) {
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
        for (Toy toy : toyList) {
            if (toy.getID() == winner)
                toy.setQuantity(toy.getQuantity() - 1);
        }


        return winner;
    }

}
