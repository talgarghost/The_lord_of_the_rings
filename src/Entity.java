public interface Entity {
    void accept(Visitor visitor);

    int getHealth();
    void setHealth(int health);

    int getMaxHealth(); // Добавили максимальное здоровье
    int getArmor();     // Добавили показатель брони
}