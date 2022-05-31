package group69salmannathan;

import java.util.Random;

public class RandomGenerator {

  /**
   * Generates a random number
   * @param min the minimum possable number
   * @param max the maximum possable number
   * @return
   */
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

}

//=== This is for testing purposes only ===========================================================
  // public static int userDamageChance(int damage) {
  //   Random userDamageChance = new Random(10);
  //   int damageChance = userDamageChance.nextInt(10) + 1;
  //   damage = damageChance;
  //   return damage;
  // }