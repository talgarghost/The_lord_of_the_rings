public class BattleCryVisitor implements Visitor {

    @Override
    public void visitElf(Elf elf) {
        System.out.println("Эльф кричит: \"А Элберет Гилтониэль!\"");
    }

    @Override
    public void visitDwarf(Dwarf dwarf) {
        System.out.println("Гном кричит: \"Барук Кхазад! Кхазад ай-мену!\"");
    }

    @Override
    public void visitOrc(Orc orc) {
        System.out.println("Орк рычит: \"Мясо на столе, парни!\"");
    }
}