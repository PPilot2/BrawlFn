
import mayflower.*;

public class Player1 extends MovePlayerOne{
    
    private int score;
    private int health;
    private int lives;
    
    public Player1(){
        //setImage("");
        score = 0;
        health = 50;
        lives = 3;
    }
    
    
    public void act(){
        
        super.act();
    }
    
    public void setPlayer1Score(int x){
        score += x;
    }
    
    public void setPlayer1Health(int x){
        health += x;
    }
    
    public void setPlayer1Lives(int x){
        lives -= x;
    }
    
    public void setBackground(){
        
    }
    
}