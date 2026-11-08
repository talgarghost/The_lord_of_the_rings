public class Orc implements Entity {
    private int health;
    private int maxHealth;
    private int armor;

    public Orc(int health, int armor) {
        this.maxHealth = health;
        this.health = health;
        this.armor = armor;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitOrc(this);
    }

    // Геттеры и сеттеры (как у Эльфа)
    @Override public int getHealth() { return health; }
    @Override public void setHealth(int health) { this.health = health; }
    @Override public int getMaxHealth() { return maxHealth; }
    @Override public int getArmor() { return armor; }
}