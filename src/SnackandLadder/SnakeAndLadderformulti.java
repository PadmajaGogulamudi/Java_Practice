package SnackandLadder;


import java.util.*;

public class SnakeAndLadderformulti {

    // ANSI color codes
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";

    public static void play(List<Player> players) {
        boolean flag = true;
        int rank = 1;
        Random rd = new Random();
        Scanner scn = new Scanner(System.in);

        Map<Integer, Integer> ladder = new HashMap<>();
        ladder.put(10, 50);
        ladder.put(21, 76);
        ladder.put(35, 97);
        ladder.put(88, 91);

        Map<Integer, Integer> snakes = new HashMap<>();
        snakes.put(54, 5);
        snakes.put(98, 1);
        snakes.put(90, 9);
        snakes.put(80, 30);

        System.out.println(CYAN + "\n🎮 Welcome to Snake 🐍 and Ladder 🪜 Game!" + RESET);

        while (flag) {
            for (Player current : players) {
                if (!current.isIswin()) {
                    int temp;
                    do {
                        System.out.println(YELLOW + current.getName() + " 🎲 please roll the dice (press Enter)" + RESET);
                        scn.nextLine();
                        int rdvalue = rd.nextInt(6) + 1;
                        temp = rdvalue;

                        System.out.println(GREEN + "🎲 Dice value is: " + rdvalue + RESET);
                        int pos = current.getPos();
                        pos += rdvalue;

                        if (pos > 100) {
                            System.out.println(RED + "❌ Can't move! Need exact roll to reach 100." + RESET);
                            continue;
                        } else if (pos == 100) {
                            current.setPos(pos);
                            current.setIswin(true);
                            current.setRank(rank);
                            System.out.println(PURPLE + "🌟 " + current.getName() + " reached 100 and won rank #" + rank + "!" + RESET);
                            rank++;
                        }

                        if (ladder.containsKey(pos)) {
                            int value = ladder.get(pos);
                            System.out.println(BLUE + "🪜 Lucky! You climbed a ladder 📈 from " + pos + " to " + value + RESET);
                            pos = value;
                        }

                        if (snakes.containsKey(pos)) {
                            int value = snakes.get(pos);
                            System.out.println(RED + "🐍 Oh no! Bitten by a snake 📉 from " + pos + " to " + value + RESET);
                            pos = value;
                        }

                        current.setPos(pos);

                    } while (temp == 6);

                    System.out.println(current.getName() + " is now at position " + CYAN + current.getPos() + RESET);
                    System.out.println("--------------------------------------------------");

                    int count = 0;
                    for (Player p1 : players) {
                        if (p1.isIswin()) {
                            count++;
                        }
                    }

                    if (count == players.size() - 1) {
                        flag = false;
                        break;
                    }
                }
            }
        }

        for (Player p : players) {
            if (p.getRank() == 0) {
                p.setRank(players.size());
            }
        }

        Collections.sort(players);
        System.out.println(GREEN + "\n🏁 Final Rankings 🏁" + RESET);
        for (Player p : players) {
            System.out.println(p.getName() + " 🏅 Rank: " + p.getRank());
        }
    }
}