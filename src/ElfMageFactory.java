class ElfMageFactory implements CharacterFactory, FactionFactory {
    public Warrior createWarrior() {
        return new NullWarrior();
    }

    public Mage createMage() {
        return new ElfMage();
    }

    public Human createHuman() {
        return new NullHuman();
    }

    public Elf createElf() {
        return new Elf();
    }

    public Dwarf createDwarf() {
        return new NullDwarf();
    }
}
