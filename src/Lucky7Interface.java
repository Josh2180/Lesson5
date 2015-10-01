
import hsa.*;
import java.util.Random;

public class Lucky7Interface {

    public static void main(String[] args) {
        Console c = new Console();
        Random rn = new Random();
        int dollars, turn = 1, maxturn = 0, skip = 0;
        char decision;
        char decision2;

        c.println("Would you like to play LUCKY7?\nY or N?");
        while (true) {
            decision = c.getChar();
            if (decision == 'n' || decision == 'N') {
                System.exit(0);
            }
            if (decision == 'y' || decision == 'Y') {
                break;
            }
        }

        while (true) {
            while (true) {
                c.print("\nEnter the amount of money you have to start: ");
                dollars = c.readInt();
                if (dollars > 0) {
                    break;
                } else {
                    c.print("\nYou must enter a value above 0.");
                }
            }

            int maxmoney = dollars;

            while (true) {
                if (skip == 0) {
                    c.print("\nYou can press S at any time to speed up the process.");
                    c.print("\nPress any key to roll the first die.");
                    decision2 = c.getChar();
                    if (decision2 == 's') {
                        skip = 1;
                    }
                }
                int roll1 = rn.nextInt(6) + 1;
                if (skip == 0) {
                    c.print("\nYou rolled a " + roll1 + ".");
                    c.print("\nPress any key to roll the second die");
                    decision2 = c.getChar();
                    if (decision2 == 's') {
                        skip++;
                    }
                }
                int roll2 = rn.nextInt(6) + 1;
                if (skip == 0) {
                    c.print("\nYou rolled a " + roll2 + ".");
                }
                int sum = roll1 + roll2;
                if (skip == 0) {
                    c.print("\n" + roll1 + "+" + roll2 + "=" + sum);
                }
                if (sum == 7) {
                    if (skip == 0) {
                        c.print("\nYou rolled a sum of " + sum + ".\nand won $4!");
                    }
                    dollars += 4;
                } else {
                    if (skip == 0) {
                        c.print("\nYou rolled a sum of " + sum + ".\nand lost $1.");
                    }
                    dollars -= 1;
                }
                if (dollars > maxmoney) {
                    maxmoney = dollars;
                    maxturn = turn + 1;
                }
                if (skip == 0) {
                    c.print("\nYou now have $" + dollars + ".\n");
                }
                if (dollars <= 0) {
                    break;
                }
                turn++;
            }
            c.print("\n\nYou are broke after " + turn + " rolls.\n");
            c.print("You should have quit after " + maxturn + " rolls when you had $" + maxmoney + ".\n");
            skip = 0;

            c.print("\nWould you like to play again?\nY or N?\n");
            while (true) {
                decision = c.getChar();
                if (decision == 'n' || decision == 'N') {
                    System.exit(0);
                }
                if (decision == 'y' || decision == 'Y') {
                    turn = 1;
                    maxturn = turn;
                    break;
                }
            }
        }
    }
}
