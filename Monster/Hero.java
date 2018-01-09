import java.util.List;
import java.util.ArrayList;
public class Hero
{
    private int posX;
    private int posY;
    private int mapLength;
    private int mapHeight;
    private double health; 
    private double speed; 
    private double attack;
    public Hero(int posX, int posY, int mapXL, int mapYL,double attack, double health, double speed)
    {
           this.posX = posX;
           this.posY = posY;
           mapLength = mapXL;
           mapHeight = mapYL;
           this.health = health;
           this.speed = speed;
           this.attack = attack;
    }
    public String checkPosMonster(Object map[][],int x, int y)
    {
        boolean returner = false;
        Monsters monster = new Monsters();
        boolean detector = false;
        String obj = "never to be used like thsi";
        int[] places = {1,1, 0,1, -1,1, -1,0, 1,0, 0,-1, -1,-1, 1,-1};
        for(int i = 0; i < places.length-1;i+=2)
        {
            if((x + places[i] >= 0 && x + places[i] < mapLength)  && (y+places[i+1] < mapLength && y+places[i+1] >= 0))
            {
                if(map[x + places[i]][y+places[i+1]] != null )
                {
                    obj = objector(map,x,y,places[i],places[i+1]);
                    detector = true;
                }
            }
        }
        if(detector)
        {
            return obj;
        }
        else
        {
            return "nothing";
        }
    }
    private String objector(Object map[][],int x, int y, int addX, int addY)
    {
        Monsters monster = new Monsters();
        if(map[x+addX][y+addY]instanceof Potion)
                {
                    Potion pot = (Potion)map[x+addX][y+addY];
                    return pot.type()+ addX + addY;
                }else if(map[x+addX][y+addY]instanceof Farmer)
                {
                    Farmer farm = (Farmer)map[x+addX][y+addY];
                    return farm.type()+ addX + addY;                
                }else if(map[x+addX][y+addY]instanceof Monsters)
                {
                   monster = (Monsters)map[x+addX][y+addY];
                   return monster.type() + addX + addY;
                }
                else
                {
                    return "nothing";
                }
    }
    public void move(String input)
    {
        if(input.equals("w"))
            {
                if(posY > 0)
                {
                    posY--;
                }else
                {
                    System.out.println("cant go up anymore");
                }
            }
            else if(input.equals("a"))
            {
                if(posX > 0)
                {
                    posX--;
                }else
                {
                    System.out.println("cant go left anymore");
                }
            }
            else if(input.equals("s"))
            {
                System.out.println("pos Y:"+ posY + "mapL:" + mapLength);
                
                if(posY < mapLength)
                {
                    posY++;
                }else
                {
                    System.out.println("cant go down anymore");
                }
            }
            else if(input.equals("d"))
            {
                if(posX < mapLength)
                {
                    posX++;
                }else
                {
                    System.out.println("cant go right anymore");
                }
            }
    }
    public int getX()
    {
        return posX;
    }
    public int getY()
    {
        return posY;
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
                           