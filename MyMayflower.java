
import mayflower.*;

public class MyMayflower extends Mayflower{
    
    public MyMayflower(){
        
        super("Project", 1080, 720);
    }
    
    public void init(){
        World w = new MyWorld();
        Mayflower.setWorld(w);
    }
    
    
}