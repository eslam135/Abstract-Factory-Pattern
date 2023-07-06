class HumanWarriorFactory implements CharacterFactory, FactionFactory {
    public Warrior createWarrior() {
        return new HumanWarrior();
    }

    public Mage createMage() {
        return new HumanMage();
    }

    public Human createHuman() {
        return new Human();
    }

    public Elf createElf() {
        return new NullElf();
    }

    public Dwarf createDwarf() {
        return new NullDwarf();
    }
}
