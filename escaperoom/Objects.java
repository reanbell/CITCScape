package escaperoom;

import java.awt.event.KeyEvent;

public class Objects extends Sprite {
    private int dx;
    private int dy;
    public boolean held = false;
    public boolean open = false;
    public boolean interact = false;
    public boolean dialogue = false;
    public boolean textbox = false;
    public boolean used = false;
    public boolean wrong = false;
    
    public Objects(int x, int y) {
        super(x, y);
        initObject();
    }

    private void initObject() {
        width = 0;
        height = 0;
    }
    
    public void setW(int w){
        width = w;
    }
    
    public void setH(int h){
        height = h;
    }
    
    public boolean isHeld(){
        return held;
    }
    
    public boolean isOpen(){
        return open;
    }
    
    public boolean canInteract(){
        return interact;
    }
    
    public boolean hasDialogue(){
        return dialogue;
    }
    
    public boolean hasTextbox(){
        return textbox;
    }
    
    
    public void move(){
        x += dx;
        y += dy;
    }
    
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_A){
            dx = 3;
            textbox = false;
            dialogue = false;
        }

        if (key == KeyEvent.VK_D){
            dx = -3;
            textbox = false;
            dialogue = false;
        }

        if (key == KeyEvent.VK_W) {
            dy = 3;
            textbox = false;
            dialogue = false;
        }
        
        if (key == KeyEvent.VK_S){
            dy = -3;
            textbox = false;
            dialogue = false;
        }
        
        if (key == KeyEvent.VK_E){
            if (interact == true){
                held = true;
                open = true;
            }
            if (dialogue == true){
                textbox = true;
            }
        }
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_A){
            dx = 0;
        }

        if (key == KeyEvent.VK_D){
            dx = 0;
        }

        if (key == KeyEvent.VK_W) {
            dy = 0;
        }

        if (key == KeyEvent.VK_S) {
            dy = 0;
        }
        
        if (key == KeyEvent.VK_E) {
            
        }
    }
}
