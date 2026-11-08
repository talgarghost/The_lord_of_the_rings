public interface Visitor {
    void visitElf(Elf elf);
    void visitDwarf(Dwarf dwarf);
    void visitOrc(Orc orc);
}