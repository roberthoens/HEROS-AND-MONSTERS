
public class Monsters
{
    private int posX; 
    private int posY;      
    private double health; 
    private double speed; 
    private double attack;
    public Monsters(int posX , int posY, double attack, double health, double speed)
    {
           this.posX = posX;
           this.posY = posY;
           this.health = health;
           this.speed = speed;
           this.attack = attack;
    }
    public Monsters()
    {
           this.posX = 0;
           this.posY = 0;
           this.health = 0.0;
           this.speed = 0.0;
           this.attack = 0.0;
    }
    public String type()
    {
        return "M";
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
     public double getHealth()
    {
        return health;
    }
    public void setHealth(double amount)
    {
        health += amount;
    }
    public double getAttack() 
    {
        return attack;
    }
}
