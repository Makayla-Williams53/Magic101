public class Main
{
    public static void main(String[] args)
    {
        Wizard testWizard = new Wizard("Gandalf", 8);
        System.out.println(testWizard);

        Wizard testFireWizard = new FireWizard("S'more", 9, 3, false, "Astro");
        System.out.println(testFireWizard);

        Wizard testIceWizard = new IceWizard("Frosty", 6, 5, true, "Jack Frost");
        System.out.println(testIceWizard);

        Wizard testElecWizard = new ElectricWizard("Pikachu", 12, 3, true, "Sparky");
        System.out.println(testElecWizard);

        Dragon testDragon = new Dragon("water");
        System.out.println(testDragon);
    }
}
