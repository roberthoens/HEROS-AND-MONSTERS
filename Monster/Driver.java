import java.util.List;
import java.util.ArrayList;
import java.io.*;
import java.util.*;
public class Driver
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        boolean runner = true;
        int mapLength = 20;
        int mapHeight = 20;
        int mapSize = mapHeight * mapLength;
        Hero good = new Hero(0,0,mapLength,mapHeight,(Math.random() * 29)+1, (Math.random() * 40)+60 , (Math.random() * 3));
        ArrayList<Monsters> monsterList = new ArrayList();
        ArrayList<Farmer> farmerList = new ArrayList();
        ArrayList<Potion> potionList = new ArrayList();
        Monsters monster1 = new Monsters((int)(Math.random() * mapLength), (int)(Math.random() * mapHeight),(Math.random() * 29)+1, (Math.random() * 99)+1 , (Math.random() * 3));
        Monsters monster2 = new Monsters((int)(Math.random() * mapLength), (int)(Math.random() * mapHeight),(Math.random() * 29)+1, (Math.random() * 99)+1 , (Math.random() * 3));
        Monsters monster3 = new Monsters((int)(Math.random() * mapLength), (int)(Math.random() * mapHeight),(Math.random() * 29)+1, (Math.random() * 99)+1 , (Math.random() * 3));
        Monsters monster4 = new Monsters((int)(Math.random() * mapLength), (int)(Math.random() * mapHeight),(Math.random() * 29)+1, (Math.random() * 99)+1 , (Math.random() * 3));
        Monsters monster5 = new Monsters((int)(Math.random() * mapLength), (int)(Math.random() * mapHeight),(Math.random() * 29)+1, (Math.random() * 99)+1 , (Math.random() * 3));
        Monsters monster6 = new Monsters((int)(Math.random() * mapLength), (int)(Math.random() * mapHeight),(Math.random() * 29)+1, (Math.random() * 99)+1 , (Math.random() * 3));
        monsterList.add(monster1);
        monsterList.add(monster2);
        monsterList.add(monster3);
        monsterList.add(monster4); 
        monsterList.add(monster5);
        monsterList.add(monster6);
        
        Farmer farmer1 = new Farmer((int)(Math.random() * mapLength), (int)(Math.random() * mapHeight));
        Farmer farmer2 = new Farmer((int)(Math.random() * mapLength), (int)(Math.random() * mapHeight));
        farmerList.add(farmer1);
        farmerList.add(farmer2);
        
        Potion pot = new Potion((int)(Math.random() * mapLength), (int)(Math.random() * mapHeight), (int)(Math.random() * 50));
        Potion pot1 = new Potion((int)(Math.random() * mapLength), (int)(Math.random() * mapHeight),(int)(Math.random() * 50));
        Potion pot2 = new Potion((int)(Math.random() * mapLength), (int)(Math.random() * mapHeight), (int)(Math.random() * 50));
        potionList.add(pot);
        potionList.add(pot1);
        potionList.add(pot2);
        
        
        String mapString = "";
        Object[][] map = new Object[mapHeight][mapLength];
        map[good.getX()][good.getY()] = good;
        
        
        for(int i = 0; i < farmerList.size();i++)
        {
            while(true)
            {
                if(map[farmerList.get(i).getX()][farmerList.get(i).getY()] == null && farmerList.get(i).getX() + farmerList.get(i).getY() != 0) 
                {
                    map[farmerList.get(i).getX()][farmerList.get(i).getY()] = farmerList.get(i);
                    break;
                }
                else
                {
                   farmerList.get(i).setX((int)(Math.random() * mapLength));
                   farmerList.get(i).setY((int)(Math.random() * mapHeight));
                }
            }
        }
        for(int i = 0; i < potionList.size();i++)
        {
            while(true)
            {
                if(map[potionList.get(i).getX()][potionList.get(i).getY()] == null && potionList.get(i).getX() + potionList.get(i).getY() != 0) 
                {
                    map[potionList.get(i).getX()][potionList.get(i).getY()] = potionList.get(i);
                    break;
                }
                else
                {
                   potionList.get(i).setX((int)(Math.random() * mapLength));
                   potionList.get(i).setY((int)(Math.random() * mapHeight));
                }
            }
        }
        for(int i = 0; i < monsterList.size();i++)
        {
            while(true)
            {
                if(map[monsterList.get(i).getX()][monsterList.get(i).getY()] == null && monsterList.get(i).getX() + monsterList.get(i).getY() != 0) 
                {
                    map[monsterList.get(i).getX()][monsterList.get(i).getY()] = monsterList.get(i);
                    break;
                }
                else
                {
                    monsterList.get(i).setX((int)(Math.random() * mapLength));
                    monsterList.get(i).setY((int)(Math.random() * mapHeight));
                }
            }
        }
        System.out.println("-"+ "\n"+"-"+ "\n"+"-"+ "\n"+"-"+ "\n"+"-"+ "\n"+"-"+ "\n");
            mapString = "";
            for(int y = 0; y < mapLength;y++)
            {
                for(int x = 0; x < mapHeight;x++)
                {
                    if(map[x][y] == null)
                    {
                        mapString += "* ";
                    }
                    if(map[x][y] instanceof Monsters)
                    {
                        mapString += "M ";
                    }
                    if(map[x][y] instanceof Hero)
                    {
                        mapString += "H ";
                    }
                    if(map[x][y] instanceof Farmer)
                    {
                        mapString += "F ";
                    }
                    if(map[x][y] instanceof Potion)
                    {
                        mapString += "P ";
                    }
                }
                mapString+= "\n";
            }
            System.out.println(mapString);
        while(runner)
        {
            System.out.println("nigel was here xD hehe");
            System.out.println("Choose wic direction you would like to go using: \n w \nasd");
            String input = in.nextLine(); //never want to use next() always nextLine()...
            map[good.getX()][good.getY()] = null;
            if(input.equals("w") || input.equals("W"))
            {
                good.move("w");
            }
            else if(input.equals("a")|| input.equals("A"))
            {
                good.move("a");
            }
            else if(input.equals("s")|| input.equals("S"))
            {
                good.move("s");
            }
            else if(input.equals("d")|| input.equals("D"))
            {
                good.move("d");
            }else
            {
                System.out.println("not a valid input");
            }
            for(int i = 0; i < monsterList.size();i++)
            {
                int randX = (int)Math.round((Math.random() * -2.0)+1.0);
                int randY = (int)Math.round((Math.random() * -2)+1);
                if(monsterList.get(i).getX()+ randX < mapLength && monsterList.get(i).getX()+ randX >= 0)
                {
                    map[monsterList.get(i).getX()][monsterList.get(i).getY()] = null;
                    monsterList.get(i).setX(monsterList.get(i).getX()+ randX);
                }
                if(monsterList.get(i).getY()+ randY < mapLength && monsterList.get(i).getY()+ randY >= 0)
                {
                   map[monsterList.get(i).getX()][monsterList.get(i).getY()] = null;
                   monsterList.get(i).setY(monsterList.get(i).getY()+ randY);
                }
            }
            for(int i = 0; i < monsterList.size();i++)
            {
                    map[monsterList.get(i).getX()][monsterList.get(i).getY()] = monsterList.get(i);
            }
            for(int i = 0; i < potionList.size();i++)
            {
                    map[potionList.get(i).getX()][potionList.get(i).getY()] = potionList.get(i);
            }
            for(int i = 0; i < farmerList.size();i++)
            {
                    map[farmerList.get(i).getX()][farmerList.get(i).getY()] = farmerList.get(i);
            }
            map[good.getX()][good.getY()] = good;
            System.out.println("-"+ "\n"+"-"+ "\n"+"-"+ "\n"+"-"+ "\n"+"-"+ "\n"+"-"+ "\n");
            mapString = "";
            for(int y = 0; y < mapLength;y++)
            {
                for(int x = 0; x < mapHeight;x++)
                {
                    if(map[x][y] == null)
                    {
                        mapString += "* ";
                    }
                    if(map[x][y] instanceof Monsters)
                    {
                        mapString += "M ";
                    }
                     if(map[x][y] instanceof Hero)
                    {
                        mapString += "H ";
                    }
                    if(map[x][y] instanceof Farmer)
                    {
                        mapString += "F ";
                    }
                    if(map[x][y] instanceof Potion)
                    {
                        mapString += "P ";
                    }
                }
                mapString+= "\n";
            }
            System.out.println(mapString);
            if (good.checkPosMonster(map,good.getX(),good.getY()).substring(0,1).equals("M"))
            {
                System.out.println("OH NURRR A MUNSTERRRRR \n u gon run or fight cuz");
                input = in.nextLine();
                if(input.equals("fight"))
                {
                    boolean attackFase = true;
                    String SxAdd = (good.checkPosMonster(map,good.getX(),good.getY()));
                    String SyAdd = (good.checkPosMonster(map,good.getX(),good.getY()));
                    int xAdd;
                    int yAdd;
                    if(SxAdd.indexOf("-") ==1)
                    {
                        xAdd = Integer.parseInt(good.checkPosMonster(map,good.getX(),good.getY()).substring(SxAdd.indexOf("-"),SxAdd.indexOf("-")+2));
                    }
                    else
                    {
                         xAdd = Integer.parseInt(good.checkPosMonster(map,good.getX(),good.getY()).substring(1,2));
                    }
                    if(SyAdd.lastIndexOf("-") > 1)
                    {
                        yAdd = Integer.parseInt(good.checkPosMonster(map,good.getX(),good.getY()).substring(SyAdd.lastIndexOf("-"),SyAdd.lastIndexOf("-")+2));

                    }
                    else
                    {   
                        if(SyAdd.lastIndexOf("-")==3)
                        {
                            yAdd = Integer.parseInt(((good.checkPosMonster(map,good.getX(),good.getY()).substring(3))));
                        
                        }
                        else if(!(SyAdd.lastIndexOf("-") > 0))
                        {
                            yAdd = Integer.parseInt(((good.checkPosMonster(map,good.getX(),good.getY()).substring(2))));
                        }
                        else if(SyAdd.lastIndexOf("-")==1)
                        {
                            yAdd = Integer.parseInt(((good.checkPosMonster(map,good.getX(),good.getY()).substring(3))));
                        }
                        else
                        {
                            yAdd = 500;
                        }
                        
                        //the negative in the x makes it so that the position of y cord could aslo be three use if statment to narrow it down FUTURE ROB
                    }
                    Monsters attacker = (Monsters)map[good.getX()+ xAdd][good.getY()+yAdd];
                    while(attackFase)
                    {
                        attacker.setHealth((double)-1.0* (double)good.getAttack());
                        good.setHealth(-1*attacker.getAttack());
                        System.out.println("Your health: " + good.getHealth() + "Monster Health: " + attacker.getHealth());
                        if(attacker.getHealth() < 0)
                        {
                            map[attacker.getX()][attacker.getY()]= null;
                            monsterList.remove(attacker);
                            System.out.println("the moster has been defeated");
                            attackFase = false;
                        
                        }
                        else if(good.getHealth() < 0)
                        {
                            System.out.println(" YOU LOOSE FOOOLIO");
                            runner = false;
                            break;
                        }
                        else
                        {
                            System.out.println("keep fighting?");
                            input = in.nextLine();
                            if( input.equals("no"))
                            {
                                attackFase = false;
                            }
                        }
                    }
                }
                }
            if (good.checkPosMonster(map,good.getX(),good.getY()).substring(0,1).equals("P"))
            {
                    System.out.println("AYY U GOT A POTION OR AS THE COOL KIDS SAY POT");
                    String SxAdd = (good.checkPosMonster(map,good.getX(),good.getY()));
                    String SyAdd = (good.checkPosMonster(map,good.getX(),good.getY()));
                    int xAdd;
                    int yAdd;
                    if(SxAdd.indexOf("-") ==1)
                    {
                        xAdd = Integer.parseInt(good.checkPosMonster(map,good.getX(),good.getY()).substring(SxAdd.indexOf("-"),SxAdd.indexOf("-")+2));
                    }
                    else
                    {
                         xAdd = Integer.parseInt(good.checkPosMonster(map,good.getX(),good.getY()).substring(1,2));
                    }
                    if(SyAdd.lastIndexOf("-") > 1)
                    {
                        yAdd = Integer.parseInt(good.checkPosMonster(map,good.getX(),good.getY()).substring(SyAdd.lastIndexOf("-"),SyAdd.lastIndexOf("-")+2));
                    }
                    else
                    {   
                        if(SyAdd.lastIndexOf("-")==3)
                        {
                            yAdd = Integer.parseInt(((good.checkPosMonster(map,good.getX(),good.getY()).substring(3))));
                        
                        }
                        else
                        {
                            if(SyAdd.lastIndexOf("-")==3)
                            {
                                yAdd = Integer.parseInt(((good.checkPosMonster(map,good.getX(),good.getY()).substring(3))));
                            
                            }
                            else if(!(SyAdd.lastIndexOf("-") > 0))
                            {
                                yAdd = Integer.parseInt(((good.checkPosMonster(map,good.getX(),good.getY()).substring(2))));
                            }
                            else if(SyAdd.lastIndexOf("-")==1)
                            {
                                yAdd = Integer.parseInt(((good.checkPosMonster(map,good.getX(),good.getY()).substring(3))));
                            }
                            else
                            {
                                yAdd = 500;
                            }
                        }//the negative in the x makes it so that the position of y cord could aslo be three use if statment to narrow it down FUTURE ROB
                    }
                    Potion pot_now = (Potion)map[good.getX()+ xAdd][good.getY()+yAdd];
                    System.out.println(pot_now.effect(good));
                    potionList.remove(pot_now);
                    map[good.getX()+ xAdd][good.getY()+yAdd] = null;
                    
                }
                }
                System.out.println(good.checkPosMonster(map,good.getX(),good.getY()));
            }
        }

