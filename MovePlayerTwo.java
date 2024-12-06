
import mayflower.*;

public class MovePlayerTwo extends AnimatedActor{

    private String lastKey = "W";
    public MovePlayerTwo(){

        lastKey = null;
        
    }

    public void act(){
        
        if(Mayflower.isKeyDown(Keyboard.KEY_D) && Mayflower.isKeyDown(Keyboard.KEY_W)){
            if(lastKey != null && lastKey.equals("W")){
                setLocation(getX() + 2, getY()); 
            }
            else{
                setLocation(getX()+2, getY()-50);
            }
            lastKey = "W";
        }
        else if(Mayflower.isKeyDown(Keyboard.KEY_D)){
            lastKey = "D";
            setLocation(getX() + 2, getY());
        }
        else if(Mayflower.isKeyDown(Keyboard.KEY_A)){
            lastKey = "A";
            setLocation(getX()-2, getY());
        }
        else if(Mayflower.isKeyDown(Keyboard.KEY_W)){
            //lastKey = "W";
            if(lastKey != null && lastKey.equals("W")){
                setLocation(getX(), getY()); 
            }
            else{
                Mayflower.setSpeed(10);
                setLocation(getX(), getY()-50);
            }
            lastKey = "W";
        }
        else if(Mayflower.isKeyDown(Keyboard.KEY_S)){
            lastKey = "S";
            setLocation(getX(), getY() + 2);
        }
    }
}