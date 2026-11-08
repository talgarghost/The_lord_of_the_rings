public class DamageCalculatorVisitor implements Visitor {
    private int baseDamage;

    public DamageCalculatorVisitor(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    @Override
    public void visitElf(Elf elf) {
        // У эльфа шанс уклониться, игнорируем броню
        System.out.println("Эльф уклоняется! Урон заблокирован ловкостью.");
    }

    @Override
    public void visitDwarf(Dwarf dwarf) {
        // Гном использует показатель брони для снижения урона
        int actualDamage = Math.max(0, baseDamage - dwarf.getArmor());
        dwarf.setHealth(dwarf.getHealth() - actualDamage);
        System.out.println("Гном принимает удар! Броня (" + dwarf.getArmor() + ") снизила урон. Получено " + actualDamage + " урона.");
    }

    @Override
    public void visitOrc(Orc orc) {
        // Орк тоже использует броню
        int actualDamage = Math.max(0, baseDamage - orc.getArmor());
        orc.setHealth(orc.getHealth() - actualDamage);
        System.out.println("Орк получает " + actualDamage + " урона (броня: " + orc.getArmor() + ").");
    }
}