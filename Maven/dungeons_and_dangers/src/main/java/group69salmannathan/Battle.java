package group69salmannathan;

public class Battle {


    /**
     * This class will start a battle and assign a random enemy to fight the player
     * @param player input the player object
     * @param difficulty input the difficulty of the battle (1 = Normal; 2 = Medium; 3 = Hard;)
     */
    public static void start(UserCharacter player, int difficulty) {
        String[] enemies = FileInterface.readRecordsString("enemies.txt", "Enemies");
        int rand = RandomGenerator.randomNumber(0, enemies.length);

        String[] a = enemies[rand].split(" ");

        Enemy randEnemy = new Enemy();
        randEnemy.setCharacter(a[0], Integer.parseInt(a[1]));

        start(player, randEnemy, difficulty);

    }

    /**
     * This class will start a battle 
     * @param player input the player object
     * @param enemy input the enemy object
     * @param difficulty input the difficulty of the battle (1 = Easy; 2 = Normal; 3 = Hard;)
     */
    public static void start(UserCharacter player, Enemy enemy, int difficulty) {

        double damageMod = 0;

        switch (difficulty) {
            case 1:
                damageMod = 0.5;
                break;
            case 2:
                damageMod = 1.0;
                break;
            case 3:
                damageMod = 1.5;
                break;
            default:
                System.out.println("Error with Battle start switch");
                break;
        }

        FancyPrint.clearScreen();
        FancyPrint.setDelay("You have been challenged by " + enemy.name, 30, true);
        FancyPrint.newLine();
        player.printStats();
        FancyPrint.newLine();
        FancyPrint.setDelay("         === VS ===", 20, true);
        FancyPrint.newLine();
        enemy.printStats();
        FancyPrint.newLine();
        CustomScan.enterToContinue();
        FancyPrint.clearScreen();

        while ((player.isAlive()) && (enemy.isAlive())) {
            if (player.isAlive()) {
                enemy.damage(player.attack());
            }
            Main.sleep(2000);
            if (enemy.isAlive()) {
                player.damage((int)(enemy.attack()*damageMod));
            }
        }

        Main.sleep(3000);

        if (player.isAlive()) {
            FancyPrint.clearScreen();
            FancyPrint.setDelay("You Win!!", 40, true);
            FancyPrint.newLine();
            player.printStats();
            FancyPrint.newLine();
            CustomScan.enterToContinue();
            FancyPrint.clearScreen();
        } else if (enemy.isAlive()) {
            FancyPrint.clearScreen();
            FancyPrint.setDelay("You Lose :(", 40, true);
            FancyPrint.setDelay("Good luck next time " + player.getName(), 40, true);
            CustomScan.enterToContinue();
            System.exit(0);
        }

    }
}