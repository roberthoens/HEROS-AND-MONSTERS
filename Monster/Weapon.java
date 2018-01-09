

public class Weapon
{
    private int posX; 
    private int posY;
    private int healthBoost;
    public Weapon(int posX , int posY, int healthBoost)
    {
           this.posX = posX;
           this.posY = posY;
           this.healthBoost = healthBoost;
    }
    public Weapon()
    {
           this.posX = 0;
           this.posY = 0;
    }
    public String type()
    {
        return "P";
    }
    public int getX()
    {
        return posX;
    }
    public int getY() 
    {
        return posY;
    }
    public void setX(int x)
    {
        posX = x;
    }
    public void setY(int y)
    {
        posY= y;
    }
    public String effect(Hero huro)
    {
        huro.setHealth(healthBoost);
        return ("your health has been boosted by: " + healthBoost);
    }
}

    
