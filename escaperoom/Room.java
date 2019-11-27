package escaperoom;

public class Room extends Objects{
    
    public Room(int x, int y) {
        super(x, y);
        initRoom();
    }
    
    private void initRoom(){
        width = 1100;
        height = 800;
    }
    
}
