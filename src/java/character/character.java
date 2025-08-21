package java.character;

class Character {
    String name;
    int health;

    public Character (String name, int health){
        this.name = name;
        this.health = health;
    }


    public void takeDamage(int amount){
        health -= amount;
        System.out.println(name + "takes " + amount + " damage. Remaining HP: " + health);
    }

}
