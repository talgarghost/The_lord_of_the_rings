public class Elf implements Entity {
    private int health;
    private int maxHealth;
    private int armor;

    public Elf(int health, int armor) {
        this.maxHealth = health;
        this.health = health;
        this.armor = armor; // У эльфов обычно мало брони
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitElf(this);
    }

    @Override
    public int getHealth() { return health; }

    @Override
    public void setHealth(int health) { this.health = health; }

    @Override
    public int getMaxHealth() { return maxHealth; }

    @Override
    public int getArmor() { return armor; }
}