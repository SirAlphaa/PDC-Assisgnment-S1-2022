
public class UserCharacter extends Character{

    @Override
    public void setCharacter(String n, Integer attributes) {

        name = n;

        //=== Asignning the Attributes ============================================================
        assignAttributes(attributes);
    
        //=== Calculating the HP ==================================================================
        calculateHP(gender, role);
    } 

    @Override
    public int attack() {
        // TODO Make the attack method
        return 0;
    }

    public void printStats() {
        System.out.println(name);
        System.out.println(gender);
        System.out.println(role);
        System.out.println(weapon);
        System.out.println(healthPoints);

    }

}