public class Wizard
{
    //1) instance variables
        String name;
        int powerLevel;

    //2) constructors
        public Wizard(String name, int powerLevel)
        {
            this.name = name;
            this.powerLevel = powerLevel;
        }

    //4) getters
        public String getName()
        {
            return name;
        }
        public int getPowerLevel()
        {
            return powerLevel;
        }

    //5) setters
        public void setName(String name)
        {
            this.name = name;
        }
        public void setPowerLevel(int powerLevel)
        {
            this.powerLevel = powerLevel;
        }

    //6) brain methods

    //3) toString

    @Override
    public String toString()
    {
        return "Wizard{" +
                "name='" + name + '\'' +
                ", powerLevel=" + powerLevel +
                '}';
    }
}
