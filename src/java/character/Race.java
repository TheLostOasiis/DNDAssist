package java.character;

import java.util.HashMap;

public class Race {
    String name;
    HashMap<String, Integer> abilityModifiers; // e.g., Strength +2, Dexterity +1
    String specialTrait;

    public Race(String name) {
        this.name = name;
        this.abilityModifiers = new HashMap<>();
    }

    public void addAbilityModifier(String ability, int value) {
        abilityModifiers.put(ability, value);
    }

    public int getModifier(String ability) {
        return abilityModifiers.getOrDefault(ability, 0);
    }

    public void setSpecialTrait(String trait) {
        specialTrait = trait;
    }

    public String getSpecialTrait() {
        return specialTrait;
    }
}
