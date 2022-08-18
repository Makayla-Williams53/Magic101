public class IceWizard extends Wizard
{
    //1) instance variables
    int snowball;
    boolean iceSpear;
    String gollumName;

    //2) constructors
    public IceWizard(String name, int powerLevel, int snowball, boolean iceSpear, String gollumName)
    {
        super(name, powerLevel);
        this.snowball = snowball;
        this.iceSpear = iceSpear;
        this.gollumName = gollumName;
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
        public int getSnowball()
        {
            return snowball;
        }
        public boolean isIceSpear()
        {
            return iceSpear;
        }
        public String getGollumName()
        {
            return gollumName;
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
        public void setSnowball(int snowball)
        {
            this.snowball = snowball;
        }
        public void setIceSpear(boolean iceSpear)
        {
            this.iceSpear = iceSpear;
        }
        public void setGollumName(String gollumName)
        {
            this.gollumName = gollumName;
        }

    //3) toString
    @Override
    public String toString()
    {
        return "IceWizard{" +
                "name= '" + super.getName() + "\'" +
                ", powerLevel= " + super.getPowerLevel() +
                ", snowball=" + snowball +
                ", iceSpear=" + iceSpear +
                ", gollumName='" + gollumName + '\'' +
                '}';
    }
}
