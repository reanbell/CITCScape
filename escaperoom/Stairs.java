package escaperoom;

public class Stairs extends Objects{
    
    public Stairs(int x, int y) {
        super(x, y);
        initStairs();
    }
    
    private void initStairs(){
        loadImage("src\\escaperoom\\resources\\stairs.png");
        width = 300;
        height = 850;
    }
    
}
