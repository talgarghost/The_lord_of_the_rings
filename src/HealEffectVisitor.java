public class HealEffectVisitor implements Visitor {
    @Override
    public void visitElf(Elf elf) {
        // Эльф исцеляется до максимума
        elf.setHealth(elf.getMaxHealth());
        System.out.println("Лембас полностью восстановил здоровье Эльфа до " + elf.getMaxHealth() + " HP!");
    }

    @Override
    public void visitDwarf(Dwarf dwarf) {
        // Гном лечится на 20 HP, но не больше максимума
        int newHealth = Math.min(dwarf.getMaxHealth(), dwarf.getHealth() + 20);
        dwarf.setHealth(newHealth);
        System.out.println("Гном восстановил здоровье. Текущее HP: " + dwarf.getHealth());
    }

    @Override
    public void visitOrc(Orc orc) {
        // Орк получает урон от эльфийского хлеба
        orc.setHealth(orc.getHealth() - 10);
        System.out.println("Орк обжегся Лембасом! Потеряно 10 HP.");
    }
}