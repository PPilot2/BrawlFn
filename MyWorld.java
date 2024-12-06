
import mayflower.*;
public class MyWorld extends World{
    
    private String[][] tiles;
    public MyWorld(){
        addObject(new Player1(), 500, 500);
        addObject(new Player2(), 200, 300);
        
        tiles = new String[11][7];
    }
    
    public void act(){
        
    }
    
    public void buildWorld(){
        for(int r = 0; r<tiles.length; r++){
            for(int c = 0; c < tiles[r].length; c++){
                tiles[r][c] = "";
            }
        }
    }
    
    public void setLevelOneBackground(){
        MayflowerImage levelOneBackground = new MayflowerImage("Images/Background/level1background.png");
        levelOneBackground.scale(1100, 700);
        setBackground(levelOneBackground);
    }
    
    public void setLevelTwoBackground(){
        MayflowerImage levelTwoBackground = new MayflowerImage("Images/Background/level2background.png");
        levelTwoBackground.scale(1100,700);
        setBackground(levelTwoBackground);
    }
    
    public void setLevelThreeBackground(){
        MayflowerImage levelThreeBackground = new MayflowerImage("Images/Background/level3background.png");
        levelThreeBackground.scale(1100,700);
        setBackground(levelThreeBackground);
    }
}