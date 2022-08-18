public class FireWizard extends Wizard
{
    //1) instance variables
    int fireBalls;
    boolean fireSword;
    String PhoenixName;

    //2) constructors
    public FireWizard(String name, int powerLevel, int fireBalls, boolean fireSword, String PhoenixName)
    {
        super(name, powerLevel);
        this.fireBalls = fireBalls;
        this.fireSword = fireSword;
        this.PhoenixName = PhoenixName;
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
        public int getFireBalls()
        {
            return fireBalls;
        }
        public boolean isFireSword()
        {
            return fireSword;
        }
        public String getPhoenixName()
        {
            return PhoenixName;
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
    public void setFireBalls(int fireBalls)
    {
        this.fireBalls = fireBalls;
    }
    public void setFireSword(boolean fireSword)
    {
        this.fireSword = fireSword;
    }
    public void setPhoenixName(String phoenixName)
    {
        PhoenixName = phoenixName;
    }

    //3) toString

    @Override
    public String toString()
    {
        return "FireWizard{" +
                "name= '" + super.getName() + "\'" +
                ", powerLevel= " + super.getPowerLevel() +
                ", fireBalls= " + fireBalls +
                ", fireSlash= " + fireSword +
                ", PhoenixName= '" + PhoenixName + '\'' +
                '}';
    }
}
