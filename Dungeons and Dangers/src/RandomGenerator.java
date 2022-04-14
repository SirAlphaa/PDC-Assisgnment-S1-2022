import java.util.Random;

public class RandomGenerator {

  public static int randomNumber (int min, int max) {
    int output = 0;
    Random rand = new Random();
    boolean loopyboi = true;

    while (loopyboi) {
      output = rand.nextInt(max + 1);
      if ((output >= min)&&(output <= max)) {
        loopyboi =  false;
      }
    }

    return output;
}

  public static int userDamageChance(int damage) {
    Random userDamageChance = new Random(10);
    int damageChance = userDamageChance.nextInt(10) + 1;
    damage = damageChance;
    return damage;
  }

  public static void userDefendChance() {

  }

  public static void enemyDamageChance() {

  }

  public static void enemyDefendChance() {

  }
}