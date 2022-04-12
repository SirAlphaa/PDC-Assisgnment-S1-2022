
public class UserCharacter {

    String name, weapon, gender, role;
    int heathPoints;

    public void setCharacter(String n, Integer attribute) {

        name = n;
        String strAttribute = Integer.toString(attribute);

        //=== Asignning the Attributes ============================================================
        char[] attributeArray = new char[strAttribute.length()];
        for (int i = 0; i < strAttribute.length(); i++) {
            attributeArray[i] = strAttribute.charAt(i);
        }
        switch (Integer.parseInt(String.valueOf(attributeArray[0]))) {
            case 1:
                gender = "Male";
                break;
            case 2:
                gender = "Female";
                break;
        }
        switch (Integer.parseInt(String.valueOf(attributeArray[1]))) {
            case 1:
                role = "Mage";
                break;
            case 2:
                role = "Knight";
                break;
        }
        switch (Integer.parseInt(String.valueOf(attributeArray[2]))) {
            case 1:
                weapon = "Staff";
                break;
            case 2:
                weapon = "Sword";
                break;
        }
    
        //=== Calculating the HP ==================================================================
        int tempHP = 0;
        switch (gender) {
            case "Male":
                tempHP = tempHP + 100;
                break;
            case "Female":
                tempHP = tempHP + 95;
                break;
        }
        switch (role) {
            case "Mage":
                tempHP = tempHP - 2;
                break;
            case "Knight":
                tempHP = tempHP + 2;
                break;
        }
        heathPoints = tempHP;
    } 

    public void printStats() {
        System.out.println(name);
        System.out.println(gender);
        System.out.println(role);
        System.out.println(weapon);
        System.out.println(heathPoints);

    }
}

//Integer.parseInt(String.valueOf(arr))