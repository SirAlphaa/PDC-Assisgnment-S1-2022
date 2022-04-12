import java.util.Random;

public class RandomGenerator {
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