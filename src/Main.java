import java.util.Scanner;

public class Main {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void main(String[] args) throws Exception {
        SQLConnect sql = new SQLConnect();
        int choice = 0;
        String stone;
        Necklace necklace = new Necklace();
        String format = "%-15s%s%15s%n";
        Scanner scanner = new Scanner(System.in);
        while(choice != 3) {
            System.out.printf(format, "1. Add", "2. Show us stones", "3. Exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    sql.getStones();
                    stone = scanner.next();
                    if (sql.idStone(stone).equals("precious")) {
                        Precious ps = sql.getStone(stone);
                        necklace.addPrecious(ps);
                    }
                    else {
                        SemiPrecious sps = sql.getSemiStone(stone);
                        necklace.addSemiPrecious(sps);
                    }
                    break;
                case 2:
                    necklace.GetStones();
                    break;
                case 3:
                    System.out.println("You're done! Thanks!");
                    necklace.getCost();
                    System.out.println("Cost is " + necklace.getTotalCost() + " Weight is " + necklace.getTotalWeight());
                    break;
            }
        }
    }
}
