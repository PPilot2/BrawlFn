
import mayflower.*;

public class MovePlayerOne extends AnimatedActor{
    
    public MovePlayerOne(){
        
    }
    
    public void act(){
        if(Mayflower.isKeyDown(Keyboard.KEY_RIGHT)){
            setLocation(getX() + 2, getY());
        }else if(Mayflower.isKeyDown(Keyboard.KEY_LEFT)){
            setLocation(getX()-2, getY());
        }else if(Mayflower.isKeyDown(Keyboard.KEY_DOWN)){
            setLocation(getX(), getY()+2);
        }else if(Mayflower.isKeyDown(Keyboard.KEY_UP)){
            setLocation(getX(), getY() - 2);
        }
    }
}