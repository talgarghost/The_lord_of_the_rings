import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Формируем список бойцов (Здоровье, Броня)
        List<Entity> battlefield = new ArrayList<>();
        battlefield.add(new Elf(100, 5));    // Мало брони
        battlefield.add(new Dwarf(120, 25)); // Много брони
        battlefield.add(new Orc(80, 10));    // Средняя броня

        // 2. Создаем посетителей
        Visitor battleCry = new BattleCryVisitor();
        Visitor aoeAttack = new DamageCalculatorVisitor(30); // Базовый урон атаки = 30
        Visitor lembasFeast = new HealEffectVisitor();

        // 3. Выполняем действия
        System.out.println("--- НАЧАЛО БОЯ ---");
        for (Entity entity : battlefield) entity.accept(battleCry);

        System.out.println("\n--- МАССОВАЯ АТАКА (Урон: 30) ---");
        for (Entity entity : battlefield) entity.accept(aoeAttack);

        System.out.println("\n--- ПРИВАЛ И ЛЕМБАС ---");
        for (Entity entity : battlefield) entity.accept(lembasFeast);
    }
}