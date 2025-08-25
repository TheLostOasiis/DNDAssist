package java.character;

class Character {
    String name;
    int health;
    int level = 1;
    boolean deathSavingThrows = false;
    int fails = 0;
    int succeeds = 0;
    int Strength, Dexterity, Constitution, Intelligence, Wisdom, Charisma;
    Race race;


    public Character (String name, int health, int level, int Strength,int Dexterity,int Constitution,int Intelligence,int Wisdom,int Charisma, Race race){
        this.name = name;
        this.health = health;
        this.level = level;

        // Apply base stats + racial modifiers
        this.Strength = Strength + race.getModifier("Strength");
        this.Dexterity = Dexterity + race.getModifier("Dexterity");
        this.Constitution = Constitution + race.getModifier("Constitution");
        this.Intelligence = Intelligence + race.getModifier("Intelligence");
        this.Wisdom = Wisdom + race.getModifier("Wisdom");
        this.Charisma = Charisma + race.getModifier("Charisma");

        this.health = health + race.getModifier("Constitution");
        this.race = race;
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
            succeeds++;
        }else {
            System.out.println("Your roll has FAILED, Adding one roll to your FAILS.");
            fails++;
        }

        if (succeeds == 3){
            health ++;
        }

        if (fails == 3){
            System.out.println(name + " has died, R.I.P Brave Adventurer");
        }
    }

    public void rollSkillCheck(int roll,String skill){

    }

}
