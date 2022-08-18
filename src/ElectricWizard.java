public class ElectricWizard extends Wizard
{
    //1) instance variables
        int zappies;
        boolean clouds;
        String elecGiantName;

    //2)constructors
        public ElectricWizard(String name, int powerLevel, int zappies, boolean clouds, String elecGiantName)
        {
            super(name, powerLevel);
            this.zappies = zappies;
            this.clouds = clouds;
            this.elecGiantName = elecGiantName;
        }

    //4) getters
        @Override
        public String getName()
        {
            return super.getName();
        }
        @Override
        public int getPowerLevel()
        {
            return super.getPowerLevel();
        }
        public int getZappies()
        {
            return zappies;
        }
        public boolean isClouds()
        {
            return clouds;
        }
        public String getElecGiantName()
        {
            return elecGiantName;
        }

    //5) setters
        @Override
        public void setName(String name)
        {
            super.setName(name);
        }
        @Override
        public void setPowerLevel(int powerLevel)
        {
            super.setPowerLevel(powerLevel);
        }
        public void setZappies(int zappies)
        {
            this.zappies = zappies;
        }
        public void setClouds(boolean clouds)
        {
            this.clouds = clouds;
        }
        public void setElecGiantName(String elecGiantName)
        {
            this.elecGiantName = elecGiantName;
        }

    //3) toString
    @Override
    public String toString()
    {
        return "ElectricWizard{" +
                "name= '" + name + "\'" +
                ", powerLevel= " + powerLevel +
                ", zappies=" + zappies +
                ", clouds=" + clouds +
                ", electricGiantName='" + elecGiantName + '\'' +
                '}';
    }
}
