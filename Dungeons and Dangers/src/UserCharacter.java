

public class UserCharacter extends Character{

    @Override
    public void setCharacter(String n, Integer attributes) {
        name = n;
        assignAttributes(attributes);
        calculateHP(gender, role);
    } 

    /**
     * This class is the attack class for the character
     */
    @Override
    public int attack() {
        int uInput, damage = 0;
        String attackChoice = "";
        FancyPrint.setDelay("Pick one of your available attacks", 20, true);

        switch (role) {

            case "Staff":
                FancyPrint.setDelay("1) FireBall", 20, true);
                FancyPrint.setDelay("2) Ice Spikes", 20, true);
                FancyPrint.setDelay("3) Final Spark", 20, true);
                uInput = CustomScan.scanIntBetween(1, 3);
                switch (uInput) {
                    case 1:
                        attackChoice = "FireBall";
                        damage = 10;
                        break;
                    case 2:
                        attackChoice = "Ice Spikes";
                        damage = 12;
                        break;
                    case 3:
                        attackChoice = "Final Spark";
                        damage = 20;
                        break;
                    default:
                        System.out.println("Character Attack Switch Case Error");
                        break;
                }
                break;

            case "Sword":
                FancyPrint.setDelay("1) Slash", 20, true);
                FancyPrint.setDelay("2) Stab", 20, true);
                FancyPrint.setDelay("3) Demacian Justice", 20, true);
                uInput = CustomScan.scanIntBetween(1, 3);
                switch (uInput) {
                    case 1:
                        attackChoice = "Slash";
                        damage = 11;
                        break;
                    case 2:
                        attackChoice = "Stab";
                        damage = 11;
                        break;
                    case 3:
                        attackChoice = "Demacian Justice";
                        damage = 20;
                        break;
                    default:
                        System.out.println("Character Attack Switch Case Error");
                        break;
                }
                break;

            case "Dagger":
                FancyPrint.setDelay("1) Poke", 20, true);
                FancyPrint.setDelay("2) Sectumsempra", 20, true);
                FancyPrint.setDelay("3) Death Lotus", 20, true);
                uInput = CustomScan.scanIntBetween(1, 3);
                switch (uInput) {
                    case 1:
                        attackChoice = "Poke";
                        damage = 9;
                        break;
                    case 2:
                        attackChoice = "Sectumsempra";
                        damage = 13;
                        break;
                    case 3:
                        attackChoice = "Death Lotus";
                        damage = 20;
                        break;
                    default:
                        System.out.println("Character Attack Switch Case Error");
                        break;
                }
                break;

            case "Gun":
                FancyPrint.setDelay("1) Handgun", 20, true);
                FancyPrint.setDelay("2) Rocket", 20, true);
                FancyPrint.setDelay("3) Super Mega Death Rocket", 20, true);
                uInput = CustomScan.scanIntBetween(1, 3);
                switch (uInput) {
                    case 1:
                        attackChoice = "Handgun";
                        damage = 10;
                        break;
                    case 2:
                        attackChoice = "Rocket";
                        damage = 14;
                        break;
                    case 3:
                        attackChoice = "Super Mega Death Rocket";
                        damage = 23;
                        break;
                    default:
                        System.out.println("Character Attack Switch Case Error");
                        break;
                }
                break;
            }

        FancyPrint.newLine();
        FancyPrint.setDelay("You attacked with " + attackChoice, 30, true);
        return damage;
    }
}