import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.io.*;
/**
 * Main World with Player
 * 
 * @author Enoch Poon
 * 
 */
public class theWorld extends World
{
    boolean reveal=false;
    private static int level=1;
    private int timer=100;
    /**
     * Constructor for objects of class theWorld.
     * 
     */
    public theWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 400, 1, false);
        level=1;
        Greenfoot.setWorld(new Title());
        try{
            prepare();
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public boolean toggleFakeBlock(){
        if (reveal==false){
            reveal=true;
        }else{
            reveal=false;
        }
        return reveal;
    }

    public void started(){
    }

    public void act(){
        if(level==10){
            timer--;
            if(timer==0){
                addObject(new Rocket(Greenfoot.getRandomNumber(5)+5),700,Greenfoot.getRandomNumber(400));
                timer=50;
            }
        }
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    public void prepare() throws IOException
    {
        
        BufferedReader bf = new BufferedReader(new FileReader("theWorld.txt"));
        try{
            int count = Integer.parseInt(bf.readLine());
            while(count-- > 0){
                String[]tokens = bf.readLine().split(" ");
                int x = Integer.parseInt(tokens[1]);
                int y = Integer.parseInt(tokens[2]);
                if(tokens[0].equals("deathnumber")){
                    addObject(new DeathNumber(), x, y);
                }else if(tokens[0].equals("finish")){
                    addObject(new Finish(), x, y);
                }else if(tokens[0].equals("hippo")){
                    addObject(new Hippo(), x, y);
                }else if(tokens[0].equals("spike")){
                    addObject(new Spike(), x, y);
                }else if(tokens[0].equals("block")){
                    addObject(new Block(), x, y);
                }else if(tokens[0].equals("message")){
                    addObject(new Message(), x, y);
                }else if(tokens[0].equals("redgun")){
                    addObject(new RedGun(), x, y);
                }else if(tokens[0].equals("fakeblock")){
                    addObject(new FakeBlock(), x, y);
                }else if(tokens[0].equals("lvtext")){
                    addObject(new LvText(), x, y);
                }
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void saveTheWorld()throws IOException{
        List<Actor> lst = getObjects(Actor.class);
        PrintWriter pw = new PrintWriter("theWorld.txt");
        pw.print(lst.size());
        for(Actor actor : lst){
            Class clazz = actor.getClass();
            String clazzname = "";
            if(clazz.equals(DeathNumber.class)){
                clazzname = "deathnumber";
            }else if(clazz.equals(Finish.class)){
                clazzname = "finish";
            }else if(clazz.equals(Hippo.class)){
                clazzname = "hippo";
            }else if(clazz.equals(Spike.class)){
                clazzname = "spike";
            }else if(clazz.equals(Block.class)){
                clazzname = "block";
            }else if(clazz.equals(Message.class)){
                clazzname = "message";
            }else if(clazz.equals(RedGun.class)){
                clazzname = "redgun";
            }else if(clazz.equals(FakeBlock.class)){
                clazzname = "fakeblock";
            }else if(clazz.equals(LvText.class)){
                clazzname = "lvtext";
            }
            if(!clazzname.equals("")){
                pw.printf("%s %d %d%n", clazzname, actor.getX(), actor.getY());
            }else{
                System.err.println("Bad actor in world");
                break;
            }
        }
        pw.close();
    }

    public static int lv(){
        return level;
    }

    public static void lvup(){
        level++;

    }

    public void cheat(int l){
        level=l;
    }
}
