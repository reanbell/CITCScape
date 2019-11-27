package escaperoom;

import java.awt.event.KeyEvent;

public class Character extends Sprite{
    private String link = "src\\escaperoom\\resources\\front.png";
    private int count;
    private boolean up, down, left, right;
    public boolean inGame = false;
    public boolean gameComplete = false;
    public boolean gameOver = false;
    
    public Character(int x, int y) {
        super(x, y);
        initChar();
    }

    private void initChar() {
        loadImage(link);
        getImageDimensions();
    }
    
    public boolean isInGame(){
        return inGame;
    }

    public void move() {
        if (up == true){
            count++;
            switch (count % 32){
                case 0:
                    link = "src\\escaperoom\\resources\\back.png";
                    loadImage(link);
                    break;
                case 8:
                    link = "src\\escaperoom\\resources\\backL.png";
                    loadImage(link);
                    break;
                case 16:
                    link = "src\\escaperoom\\resources\\back.png";
                    loadImage(link);
                    break;
                case 24:
                    link = "src\\escaperoom\\resources\\backR.png";
                    loadImage(link);
                    break;
            }
        }
        
        if (down == true){    
            count++;
            switch (count % 32){
                case 0:
                    link = "src\\escaperoom\\resources\\front.png";
                    loadImage(link);
                    break;
                case 8:
                    link = "src\\escaperoom\\resources\\frontL.png";
                    loadImage(link);
                    break;
                case 16:
                    link = "src\\escaperoom\\resources\\front.png";
                    loadImage(link);
                    break;
                case 24:
                    link = "src\\escaperoom\\resources\\frontR.png";
                    loadImage(link);
                    break;
            }
        }
        
        if (left == true){
            count++;
            switch (count % 32){
                case 0:
                    link = "src\\escaperoom\\resources\\left.png";
                    loadImage(link);
                    break;
                case 8:
                    link = "src\\escaperoom\\resources\\leftR.png";
                    loadImage(link);
                    break;
                case 16:
                    link = "src\\escaperoom\\resources\\left.png";
                    loadImage(link);
                    break;
                case 24:
                    link = "src\\escaperoom\\resources\\leftL.png";
                    loadImage(link);
                    break;
            }
        }
        
        if (right == true){
            count++;
            switch (count % 32){
                case 0:
                    link = "src\\escaperoom\\resources\\right.png";
                    loadImage(link);
                    break;
                case 8:
                    link = "src\\escaperoom\\resources\\rightR.png";
                    loadImage(link);
                    break;
                case 16:
                    link = "src\\escaperoom\\resources\\right.png";
                    loadImage(link);
                    break;
                case 24:
                    link = "src\\escaperoom\\resources\\rightL.png";
                    loadImage(link);
                    break;
            }
        }
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_W){
            up = true;
        }
        if (key == KeyEvent.VK_S){
            down = true;
        }
         if (key == KeyEvent.VK_A){
            left = true;
        }
        if (key == KeyEvent.VK_D){
            right = true;
        }
        
        if (key == KeyEvent.VK_E){
            inGame = true;
        }
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_W){
            up = false;
            link = "src\\escaperoom\\resources\\back.png";
            loadImage(link);
        }
        if (key == KeyEvent.VK_S){
            down = false;
            link = "src\\escaperoom\\resources\\front.png";
            loadImage(link);
        }
        if (key == KeyEvent.VK_A){
            left = false;
            link = "src\\escaperoom\\resources\\left.png";
            loadImage(link);
        }
        if (key == KeyEvent.VK_D){
            right = false;
            link = "src\\escaperoom\\resources\\right.png";
            loadImage(link);
        }
    }
}