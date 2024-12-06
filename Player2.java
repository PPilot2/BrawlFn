
import mayflower.*;

public class Player2 extends MovePlayerTwo{
    
    private int score;
    private int health;
    private int lives;
    
    public Player2(){
        //setImage("");
        score = 0;
        health = 50;
        lives = 3;
    }
    
    public void act(){
        super.act();
    }
    
    
    public void setPlayer2Score(int x){
        score += x;
    }
    
    public void setPlayer2Health(int x){
        health += x;
    }
    
    public void setPlayer2Lives(int x){
        lives -= x;
    }
    
}