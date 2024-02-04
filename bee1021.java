import java.util.Scanner;

public class bee1021 {
    public static void main(String[] args) {
        Scanner amount = new Scanner(System.in);
        System.out.println("Enter the amount of money: ");

        double money = amount.nextDouble();
        int[] notes = {100, 50, 20, 10, 5};
        double[] coins = {1, 0.50, 0.25, 0.10, 0.05, 0.01};
        int i = 0;

        while (i < notes.length) {
            int count = (int) (money / notes[i]);
            if (count > 0) {
                System.out.println("Note(s) of " + notes[i] + " is: " + count);
                money -= count * notes[i];
            }
            i += 1;
        }

        int j = 0;
        while (j < coins.length) {
            int count = (int) (money / coins[j]);
            if (count > 0) {
                System.out.println("Coin(s) of " + coins[j] + " is: " + count);
                money -= count * coins[j];
            }
            j += 1;
        }

        amount.close();
    }
}


