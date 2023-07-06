// Client code
public class Main {
    public static void main(String[] args) {
        // Create a human warrior faction
        CharacterFactory characterFactory1 = new HumanWarriorFactory();
        FactionFactory factionFactory1 = new HumanWarriorFactory();

        Warrior warrior1 = characterFactory1.createWarrior();
        Mage mage1 = characterFactory1.createMage();
        Human human1 = factionFactory1.createHuman();
        Elf elf1 = factionFactory1.createElf();
        Dwarf dwarf1 = factionFactory1.createDwarf();

        System.out.println("Human Warrior faction:");
        System.out.println("Warrior attack power: " + warrior1.getAttackPower());
        System.out.println("Warrior defense: " + warrior1.getDefense());
        System.out.println("Mage magic power: " + mage1.getMagicPower());
        System.out.println("Human faction: " + human1.getName());
        System.out.println("Elf faction: " + elf1.getName());
        System.out.println("Dwarf faction: " + dwarf1.getName());

        // Create an elf mage faction
        CharacterFactory characterFactory2 = new ElfMageFactory();
        FactionFactory factionFactory2 = new ElfMageFactory();

        Warrior warrior2 = characterFactory2.createWarrior();
        Mage mage2 = characterFactory2.createMage();
        Human human2 = factionFactory2.createHuman();
        Elf elf2 = factionFactory2.createElf();
        Dwarf dwarf2 = factionFactory2.createDwarf();

        System.out.println("\nElf Mage faction:");
        System.out.println("Warrior attack power: " + warrior2.getAttackPower());
        System.out.println("Warrior defense: " + warrior2.getDefense());
        System.out.println("Mage magic power: " + mage2.getMagicPower());
        System.out.println("Human faction: " + human2.getName());
        System.out.println("Elf faction: " + elf2.getName());
        System.out.println("Dwarf faction: " + dwarf2.getName());
    }
}