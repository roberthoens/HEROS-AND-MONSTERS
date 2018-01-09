
public class Farmer
{
    private int posX; 
    private int posY;      
    public Farmer(int posX , int posY)
    {
           this.posX = posX;
           this.posY = posY;
    }
    public Farmer()
    {
           this.posX = 0;
           this.posY = 0;
    }
    public String type()
    {
        return "F";
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
}
