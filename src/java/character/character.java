package java.character;

class Character {
    String name;
    int health;
    boolean deathSavingThrows = false;
    int fails = 0;
    int Succseed = 0;

    public Character (String name, int health){
        this.name = name;
        this.health = health;
    }


    public void takeDamage(int amount){
        health -= amount;
        System.out.println(name + "takes " + amount + " damage. Remaining HP: " + health);

        if (health <= 0) {
            System.out.println(name + " has been knocked unconscious, Death saving throws active");
            deathSavingThrows = true;
        }
    }

    public void deathSavingThrows(int roll){
        if (roll >= 10){
            System.out.println("Your roll has succeeded, Adding one roll to your successes.");
            Succseed ++;
        }else {
            System.out.println("Your roll has FAILED, Adding one roll to your FAILS.");
            fails ++;
        }
    }

}
