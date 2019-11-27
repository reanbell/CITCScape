package escaperoom;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.Timer;

public class EscapeRoom extends JPanel implements ActionListener {
    private Timer timer;
    public boolean wrongkey;
    public boolean finished;
    private Objects border;
    
    private final int B_WIDTH = 1000;
    private final int B_HEIGHT = 800;
    private final int DELAY = 10;
    
    private Character chara;
    private final int ICHAR_X = 450;
    private final int ICHAR_Y = 350;
    
    private Objects title;
    
    private Objects instructions;
    private final int instructions_x = 630;
    private final int instructions_y = 20;
    
    private Objects doormid;
    private final int doormid_x = 50;
    private final int doormid_y = -200;
    
    private Objects doorleft;
    private final int doorleft_x = -1075;
    private final int doorleft_y = -200;
    
    private Objects doorright;
    private final int doorright_x = 1175;
    private final int doorright_y = -200;
    
    private Stairs stairsLeft;
    private final int stairsLeft_x = -1235;
    private final int stairsLeft_y = -1270;
    
    private Stairs stairsRight;
    private final int stairsRight_x = 1935;
    private final int stairsRight_y = -1270;
    
    private Room topleftRoom;
    private final int topleftRoom_x = -935;
    private final int topleftRoom_y = -1220;
    
    private Room topmidRoom;
    private final int topmidRoom_x = -300;
    private final int topmidRoom_y = -1270;
    
    private Objects doortopmid;
    private final int doortopmid_x = 623;
    private final int doortopmid_y = -710;
    
    private Objects doortopright;
    private final int doortopright_x = 1764;
    private final int doortopright_y = -710;
    
    private Room toprightRoom;
    private final int toprightRoom_x = 825;
    private final int toprightRoom_y = -1270;
    
    private Room botleftRoom;
    private final int botleftRoom_x = -1135;
    private final int botleftRoom_y = -50;
    
    private Room botmidRoom;
    private final int botmidRoom_x = -10;
    private final int botmidRoom_y = -50;
    
    private Room botrightRoom;
    private final int botrightRoom_x = 1115;
    private final int botrightRoom_y = -50;
    
    private Objects topWall;
    private final int topWall_x = -1755;
    private final int topWall_y = -570;
    
    private Objects topWall2;
    private final int topWall2_x = -1755;
    private final int topWall2_y = -530;
    
    private Objects topleftWall;
    private final int topleftWall_x = -300;
    private final int topleftWall_y = -1270;
    
    private Objects toprightWall1;
    private final int toprightWall1_x = 815;
    private final int toprightWall1_y = -1270;
    
    private Objects toprightWall2;
    private final int toprightWall2_x = 825;
    private final int toprightWall2_y = -1270;
    
    private Objects toprightWall3;
    private final int toprightWall3_x = 1930;
    private final int toprightWall3_y = -1270;
    
    private Room hallway;
    private final int hallway_x = -1135;
    private final int hallway_y = -420;
    
    private Room botleftWall1;
    private final int botleftWall1_x = -20;
    private final int botleftWall1_y = -50;
    
    private Room botleftWall2;
    private final int botleftWall2_x = -10;
    private final int botleftWall2_y = -50;
    
    private Room botrightWall1;
    private final int botrightWall1_x = 1100;
    private final int botrightWall1_y = -50;
    
    private Room botrightWall2;
    private final int botrightWall2_x = 1110;
    private final int botrightWall2_y = -50;
    
    private Room botWall1;
    private final int botWall1_x = -1200;
    private final int botWall1_y = -55;
    
    private Room botWall2;
    private final int botWall2_x = -1200;
    private final int botWall2_y = -50;
    
    private Room botbotWall;
    private final int botbotWall_x = -1200;
    private final int botbotWall_y = 800;
    
    private Objects leftmostWall;
    private final int leftmostWall_x = -1135;
    private final int leftmostWall_y = -1275;
    
    private Objects rightmostWall;
    private final int rightmostWall_x = 2235;
    private final int rightmostWall_y = -1270;
    
    private Objects topmostWall;
    private final int topmostWall_x = -1130;
    private final int topmostWall_y = -1250;
    
    private Objects keyRed;
    private final int keyRed_x = 1050;
    private final int keyRed_y = 650;
    
    private Objects keyRed1;
    private final int keyRed1_x = 1050;
    private final int keyRed1_y = 120;
    
    private Objects keyRed2;
    private final int keyRed2_x = 50;
    private final int keyRed2_y = 650;
    
    private Objects keyBlue;
    private final int keyBlue_x = -150;
    private final int keyBlue_y = -1100;
    
    private Objects keyOrange;
    private final int keyOrange_x = -1100;
    private final int keyOrange_y = -400;
    
    private Objects keyGreen;
    private final int keyGreen_x = 2100;
    private final int keyGreen_y = 400;
    
    private Objects keyPurple;
    private final int keyPurple_x = -1085;
    private final int keyPurple_y = 700;
    
    private Objects ghostComputer;
    private Objects ghostComputerDialogue;
    private final int ghostComputer_x = 1900;
    private final int ghostComputer_y = 355;
    
    private Objects mouse;
    private final int mouse_x = 150;
    private final int mouse_y = -1100;
    private Objects keyboard;
    private final int keyboard_x = -150;
    private final int keyboard_y = -1100;
    private Objects monitor;
    private final int monitor_x = 450;
    private final int monitor_y = -1100;
    
    private Objects ans1;
    private final int ans1_x = 955;
    private final int ans1_y = -770;
    private Objects ans2;
    private final int ans2_x = 1105;
    private final int ans2_y = -770;
    private Objects ans3;
    private final int ans3_x = 1255;
    private final int ans3_y = -770;
    private Objects ans4;
    private final int ans4_x = 1405;
    private final int ans4_y = -770;
    private Objects ans5;
    private final int ans5_x = 1555;
    private final int ans5_y = -770;
    private Objects ans6;
    private final int ans6_x = 1705;
    private final int ans6_y = -770;
    
    private Objects textBox;
    private final int textBox_x = 10;
    private final int textBox_y = 590;
    
    public EscapeRoom(){
        initGame();
    }
    
    private void initGame(){
        addKeyListener(new TAdapter());
        setFocusable(true);
        setBackground(Color.BLACK);
        
        setPreferredSize(new Dimension(B_WIDTH,B_HEIGHT));
        title = new Objects(0, 0);
        title.loadImage("src\\escaperoom\\resources\\titlescreen.png");
        
        border = new Objects(0,0);
        border.loadImage("src\\escaperoom\\resources\\border.png");
        
        chara = new Character(ICHAR_X, ICHAR_Y);
        
        instructions = new Objects (instructions_x, instructions_y);
        instructions.loadImage("src\\escaperoom\\resources\\inst.png");
        
        topmostWall = new Objects(topmostWall_x, topmostWall_y);
        topmostWall.setH(5);
        topmostWall.setW(4000);
        
        stairsLeft = new Stairs(stairsLeft_x, stairsLeft_y);
        stairsRight = new Stairs(stairsRight_x, stairsRight_y);
        
        topleftWall = new Objects(topleftWall_x, topleftWall_y);
        topleftWall.setW(5);
        topleftWall.setH(650);
        
        topleftRoom = new Room(topleftRoom_x, topleftRoom_y);
        topleftRoom.setW(350);
        
        topmidRoom = new Room(topmidRoom_x, topmidRoom_y);
        topmidRoom.loadImage("src\\escaperoom\\resources\\topmidroom.png");
        
        toprightWall1 = new Objects(toprightWall1_x, toprightWall1_y);
        toprightWall1.setW(5);
        toprightWall1.setH(650);
        
        toprightWall2 = new Objects(toprightWall2_x, toprightWall2_y);
        toprightWall2.setH(650);
        toprightWall2.setW(5);
        
        toprightWall3 = new Objects(toprightWall3_x, toprightWall3_y);
        toprightWall3.setH(650);
        toprightWall3.setW(5);
        
        toprightRoom = new Room(toprightRoom_x, toprightRoom_y);
        toprightRoom.loadImage("src\\escaperoom\\resources\\toprightroom.png");
        
        botWall1 = new Room(botWall1_x, botWall1_y);
        botWall1.setH(5);
        botWall1.setW(4000);
        botWall1.dialogue = false;
        
        botWall2 = new Room(botWall2_x, botWall2_y);
        botWall2.setH(20);
        botWall2.setW(4000);
        botWall2.dialogue = false;
        
        botleftRoom = new Room(botleftRoom_x, botleftRoom_y);
        leftmostWall = new Objects(leftmostWall_x, leftmostWall_y);
        leftmostWall.setH(2300);
        leftmostWall.setW(5);
        
        botleftWall1 = new Room(botleftWall1_x, botleftWall1_y);
        botleftWall1.setH(850);
        botleftWall1.setW(10);
        botleftWall2 = new Room(botleftWall2_x, botleftWall2_y);
        botleftWall2.setH(850);
        botleftWall2.setW(10);
        botmidRoom = new Room(botmidRoom_x, botmidRoom_y);
        
        doortopmid = new Objects(doortopmid_x, doortopmid_y);
        doortopmid.setH(400);
        doortopmid.setW(140);
        
        doortopright = new Objects(doortopright_x, doortopright_y);
        doortopright.setH(400);
        doortopright.setW(140);
        
        doormid = new Objects(doormid_x, doormid_y);
        doormid.setH(400);
        doormid.setW(140);
        
        doorleft = new Objects(doorleft_x, doorleft_y);
        doorleft.setH(400);
        doorleft.setW(140);
        
        doorright = new Objects(doorright_x, doorright_y);
        doorright.setH(400);
        doorright.setW(140);
        
        botrightWall1 = new Room(botrightWall1_x, botrightWall1_y);
        botrightWall1.setH(850);
        botrightWall1.setW(10);
        botrightWall2 = new Room(botrightWall2_x, botrightWall2_y);
        botrightWall2.setH(850);
        botrightWall2.setW(10);
        botrightRoom = new Room(botrightRoom_x, botrightRoom_y);
        rightmostWall = new Objects(rightmostWall_x, rightmostWall_y);
        rightmostWall.setH(2300);
        rightmostWall.setW(5);
        
        topWall = new Objects(topWall_x, topWall_y);
        topWall.loadImage("src\\escaperoom\\resources\\topwall.png");
        topWall.setH(5);
        topWall.setW(4000);
        
        topWall2 = new Objects(topWall2_x, topWall2_y);
        topWall2.setH(5);
        topWall2.setW(4000);
        
        hallway = new Room(hallway_x, hallway_y);
        hallway.setH(500);
        hallway.setW(3370);
        
        botbotWall = new Room(botbotWall_x, botbotWall_y);
        botbotWall.setW(4000);
        botbotWall.setH(5);
        
        setKeys();
        setAnswers();
        
        timer = new Timer(DELAY, this);
        timer.start();
        
        ghostComputer = new Objects (ghostComputer_x, ghostComputer_y);
        ghostComputer.loadImage("src\\escaperoom\\resources\\ghostComp.png");
        ghostComputer.getImageDimensions();
        ghostComputerDialogue = new Objects (ghostComputer_x, ghostComputer_y);
        ghostComputerDialogue.loadImage("src\\escaperoom\\resources\\ghostCompD.png");
        ghostComputerDialogue.getImageDimensions();
        
        mouse = new Objects(mouse_x, mouse_y);
        mouse.loadImage("src\\escaperoom\\resources\\mouse.png");
        mouse.getImageDimensions();
        keyboard = new Objects(keyboard_x, keyboard_y);
        keyboard.loadImage("src\\escaperoom\\resources\\keyboard.png");
        keyboard.getImageDimensions();
        monitor = new Objects(monitor_x, monitor_y);
        monitor.loadImage("src\\escaperoom\\resources\\monitor.png");
        monitor.getImageDimensions();
        
        textBox = new Objects (textBox_x, textBox_y);
        textBox.setH(200);
        textBox.setW(975);
        textBox.setVisible(false);
    }
    
    private void setKeys(){
        keyRed = new Objects(keyRed_x, keyRed_y);
        keyRed.loadImage("src\\escaperoom\\resources\\keyRed.png");
        keyRed.getImageDimensions();
        
        keyRed1 = new Objects (keyRed1_x, keyRed1_y);
        keyRed1.loadImage("src\\escaperoom\\resources\\keyRed1.png");
        keyRed1.getImageDimensions();
        
        keyRed2 = new Objects (keyRed2_x, keyRed2_y);
        keyRed2.loadImage("src\\escaperoom\\resources\\keyRed2.png");
        keyRed2.getImageDimensions();
        
        keyOrange = new Objects (keyOrange_x, keyOrange_y);
        keyOrange.loadImage("src\\escaperoom\\resources\\keyOrange.png");
        keyOrange.getImageDimensions();
        
        keyBlue = new Objects(keyBlue_x, keyBlue_y);
        keyBlue.loadImage("src\\escaperoom\\resources\\keyBlue.png");
        keyBlue.getImageDimensions();
        
        keyGreen = new Objects(keyGreen_x, keyGreen_y);
        keyGreen.loadImage("src\\escaperoom\\resources\\keyGreen.png");
        keyGreen.getImageDimensions();
        
        keyPurple = new Objects(keyPurple_x, keyPurple_y);
        keyPurple.loadImage("src\\escaperoom\\resources\\keyPurple.png");
        keyPurple.getImageDimensions();
    }
    
    private void setAnswers(){
        ans1 = new Objects(ans1_x, ans1_y);
        ans1.loadImage("src\\escaperoom\\resources\\a1.png");
        ans1.getImageDimensions();
        ans2 = new Objects(ans2_x, ans2_y);
        ans2.loadImage("src\\escaperoom\\resources\\a2.png");
        ans2.getImageDimensions();
        ans3 = new Objects(ans3_x, ans3_y);
        ans3.loadImage("src\\escaperoom\\resources\\a3.png");
        ans3.getImageDimensions();
        ans4 = new Objects(ans4_x, ans4_y);
        ans4.loadImage("src\\escaperoom\\resources\\a4.png");
        ans4.getImageDimensions();
        ans5 = new Objects(ans5_x, ans5_y);
        ans5.loadImage("src\\escaperoom\\resources\\a5.png");
        ans5.getImageDimensions();
        ans6 = new Objects(ans6_x, ans6_y);
        ans6.loadImage("src\\escaperoom\\resources\\a6.png");
        ans6.getImageDimensions();
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawObjects(g);
        Toolkit.getDefaultToolkit().sync();
    }
    
    private void drawObjects(Graphics g) {
        if (chara.isInGame() == true){
            g.setColor(Color.GRAY);
            if(doormid.isOpen() == true)
                g.fillRect(hallway.getX(), hallway.getY(), hallway.width, hallway.height);

            g.setColor(Color.white);
            g.fillRect(topleftRoom.getX(), topleftRoom.getY(), topleftRoom.width, topleftRoom.height);

            g.drawImage(stairsLeft.getImage(), stairsLeft.getX(), stairsLeft.getY(), this);
            g.drawImage(stairsRight.getImage(), stairsRight.getX(), stairsRight.getY(), this);

            if (doortopmid.isOpen() == true)
                g.drawImage(topmidRoom.getImage(), topmidRoom.getX(), topmidRoom.getY(), this);

            if (doortopright.isOpen() == true)
                g.drawImage(toprightRoom.getImage(), toprightRoom.getX(), toprightRoom.getY(), this);

            if (doortopmid.isOpen() == true)
                topWall.loadImage("src\\escaperoom\\resources\\topwallgreenopen.png");
            if (doortopright.isOpen() == true)
                topWall.loadImage("src\\escaperoom\\resources\\topwallpurpleopen.png");
            g.drawImage(topWall.getImage(), topWall.getX(), topWall.getY(), this);

            if(doorleft.isOpen() == true){
                botleftRoom.loadImage("src\\escaperoom\\resources\\botleftopen.png");
            }else{
                if (doormid.isOpen() == true)
                    botleftRoom.loadImage("src\\escaperoom\\resources\\botleft.png");
            }
            g.drawImage(botleftRoom.getImage(), botleftRoom.getX(), botleftRoom.getY(), this);

            if (doormid.isOpen() == true){
                botmidRoom.loadImage("src\\escaperoom\\resources\\botdooropen.png");
                g.drawImage(botmidRoom.getImage(), botmidRoom.getX(), botmidRoom.getY(), this);
            }else{
                botmidRoom.loadImage("src\\escaperoom\\resources\\botmid.png");
                g.drawImage(botmidRoom.getImage(), botmidRoom.getX(), botmidRoom.getY(), this);
            }

            if (doorright.isOpen() == true){
                botrightRoom.loadImage("src\\escaperoom\\resources\\botdooropen.png");
            }else{
                if (doormid.isOpen() == true)
                    botrightRoom.loadImage("src\\escaperoom\\resources\\botright.png");
            }
            g.drawImage(botrightRoom.getImage(), botrightRoom.getX(), botrightRoom.getY(), this);

            g.drawImage(ghostComputerDialogue.getImage(), ghostComputer.getX() - 100, ghostComputer.getY() - 100, this);
            
            g.drawImage(mouse.getImage(), mouse.getX(), mouse.getY(), this);
            g.drawImage(keyboard.getImage(), keyboard.getX(), keyboard.getY(), this);
            g.drawImage(monitor.getImage(), monitor.getX(), monitor.getY(), this);
            
            if(doortopright.isOpen() == true)
                drawAnswers(g);
            
            g.drawImage(chara.getImage(), chara.getX(), chara.getY(), this);

            if(doormid.isOpen() == false)
                drawKeys1(g);

            drawKeys2(g);

            g.drawImage(ghostComputer.getImage(), ghostComputer.getX(), ghostComputer.getY(),this);
            
            if(ghostComputer.hasTextbox() == true){
                textBox.setVisible(true);
                textBox.loadImage("src\\escaperoom\\resources\\CGdialogue.png");
                g.drawImage(textBox.getImage(), textBox.getX(), textBox.getY(), this);
            }
            
            g.drawImage(instructions.getImage(), instructions.getX(), instructions.getY(), this);
            g.drawImage(border.getImage(), 0, 0, this);

            if(doormid.hasTextbox() == true){
                if(doormid.isOpen() == false){
                    textBox.setVisible(true);
                    textBox.loadImage("src\\escaperoom\\resources\\needkey.png");
                    if (wrongkey == true){
                        textBox.loadImage("src\\escaperoom\\resources\\wrongkey.png");
                    }
                    g.drawImage(textBox.getImage(), textBox.getX(), textBox.getY(), this);
                }
            }
            
            if(doorleft.hasTextbox() == true){
                if(doorleft.isOpen() == false){
                    textBox.setVisible(true);
                    textBox.loadImage("src\\escaperoom\\resources\\needkey.png");
                    g.drawImage(textBox.getImage(), textBox.getX(), textBox.getY(), this);
                }
            }
            
            if(doorright.hasTextbox() == true){
                if(doorright.isOpen() == false){
                    textBox.setVisible(true);
                    textBox.loadImage("src\\escaperoom\\resources\\needkey.png");
                    g.drawImage(textBox.getImage(), textBox.getX(), textBox.getY(), this);
                }
            }
            
            if(doortopmid.hasTextbox() == true){
                if(doortopmid.isOpen() == false){
                    textBox.setVisible(true);
                    textBox.loadImage("src\\escaperoom\\resources\\needkey.png");
                    g.drawImage(textBox.getImage(), textBox.getX(), textBox.getY(), this);
                }
            }
            
            if(doortopright.hasTextbox() == true){
                if(doortopright.isOpen() == false){
                    textBox.setVisible(true);
                    textBox.loadImage("src\\escaperoom\\resources\\needkey.png");
                    g.drawImage(textBox.getImage(), textBox.getX(), textBox.getY(), this);
                }
            }
            
            if(mouse.hasTextbox() == true || monitor.hasTextbox() == true){
                textBox.setVisible(true);
                textBox.loadImage("src\\escaperoom\\resources\\wronganswer.png");
                g.drawImage(textBox.getImage(), textBox.getX(), textBox.getY(), this);
            }
            
            if(ans1.hasTextbox() == true || ans2.hasTextbox() == true || ans3.hasTextbox() == true || ans4.hasTextbox() == true || ans5.hasTextbox() == true || ans6.hasTextbox() == true){
                if(chara.gameComplete == true){
                    title.loadImage("src\\escaperoom\\resources\\gamecomplete.png");
                    g.drawImage(title.getImage(), 0, 0, this);
                    chara.inGame = false;
                }else if(chara.gameOver ==  true){
                    title.loadImage("src\\escaperoom\\resources\\gameover.png");
                    g.drawImage(title.getImage(), 0, 0, this);
                    chara.inGame = false;
                }
            }
        }else{
            g.drawImage(title.getImage(), 0, 0, this);
        }
    }
    
    public void drawKeys1(Graphics g){
        g.setColor(Color.RED);
        if(keyRed.isHeld() == true){
            g.drawImage(keyRed.getImage(), chara.getX() + 15, chara.getY() - 50, this);
        } else {
            if(keyRed.used == false)
                g.drawImage(keyRed.getImage(), keyRed.getX(), keyRed.getY(), this);
        }
        
        if(keyRed1.isHeld() == true){
            g.drawImage(keyRed1.getImage(), chara.getX() + 15, chara.getY() - 50, this);
        } else {
            if(keyRed1.used == false)
                g.drawImage(keyRed1.getImage(), keyRed1.getX(), keyRed1.getY(), this);
        }
        
        if(keyRed2.isHeld() == true){
            g.drawImage(keyRed2.getImage(), chara.getX() + 15, chara.getY() - 50, this);
        } else {
            if(keyRed2.used == false)
                g.drawImage(keyRed2.getImage(), keyRed2.getX(), keyRed2.getY(), this);
        }
    }
    
    public void drawKeys2(Graphics g){
        if(keyBlue.isHeld() == true){
            g.drawImage(keyBlue.getImage(), chara.getX() + 15, chara.getY() - 50, this);
        }
        
        if(keyOrange.isHeld() == true){
            g.drawImage(keyOrange.getImage(), chara.getX() + 15, chara.getY() - 50, this);
        } else {
            if(keyOrange.used == false)
                g.drawImage(keyOrange.getImage(), keyOrange.getX(), keyOrange.getY(), this);
        }
        
        if(keyGreen.isHeld() == true){
            g.drawImage(keyGreen.getImage(), chara.getX() + 15, chara.getY() - 50, this);
        } else {
            if(keyGreen.used == false)
                g.drawImage(keyGreen.getImage(), keyGreen.getX(), keyGreen.getY(), this);
        }
        
        if(keyPurple.isHeld() == true){
            g.drawImage(keyPurple.getImage(), chara.getX() + 15, chara.getY() - 50, this);
        }
    }
    
    public void drawAnswers(Graphics g){
        g.drawImage(ans1.getImage(), ans1.getX(), ans1.getY(), this);
        g.drawImage(ans2.getImage(), ans2.getX(), ans2.getY(), this);
        g.drawImage(ans3.getImage(), ans3.getX(), ans3.getY(), this);
        g.drawImage(ans4.getImage(), ans4.getX(), ans4.getY(), this);
        g.drawImage(ans5.getImage(), ans5.getX(), ans5.getY(), this);
        g.drawImage(ans6.getImage(), ans6.getX(), ans6.getY(), this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        updateChara();
        checkCollisions();
        repaint();
        
    }
    
    private void updateChara(){
        chara.move();

        ans1.move();
        ans2.move();
        ans3.move();
        ans4.move();
        ans5.move();
        ans6.move();

        mouse.move();
        keyboard.move();
        monitor.move();

        ghostComputer.move();

        keyRed.move();
        keyRed1.move();
        keyRed2.move();
        keyBlue.move();
        keyOrange.move();
        keyGreen.move();
        keyPurple.move();

        leftmostWall.move();
        stairsLeft.move();
        stairsRight.move();

        topmostWall.move();
        rightmostWall.move();
        topleftRoom.move();
        topleftWall.move();

        topmidRoom.move();
        doortopmid.move();

        toprightWall1.move();
        toprightWall2.move();
        toprightWall3.move();
        toprightRoom.move();
        doortopright.move();

        topWall.move();
        topWall2.move();
        hallway.move();
        botWall1.move();
        botWall2.move();

        botleftRoom.move();
        doorleft.move();

        botleftWall1.move();
        botleftWall2.move();

        botmidRoom.move();
        doormid.move();

        botrightWall1.move();
        botrightWall2.move();

        botrightRoom.move();
        doorright.move();

        botbotWall.move();
    }
    
    public class TAdapter extends KeyAdapter {
        @Override
        public void keyReleased(KeyEvent e) {
            chara.keyReleased(e);
            
            ans1.keyReleased(e);
            ans2.keyReleased(e);
            ans3.keyReleased(e);
            ans4.keyReleased(e);
            ans5.keyReleased(e);
            ans6.keyReleased(e);
            
            mouse.keyReleased(e);
            keyboard.keyReleased(e);
            monitor.keyReleased(e);
            
            ghostComputer.keyReleased(e);
            
            keyRed.keyReleased(e);
            keyRed1.keyReleased(e);
            keyRed2.keyReleased(e);
            keyBlue.keyReleased(e);
            keyOrange.keyReleased(e);
            keyGreen.keyReleased(e);
            keyPurple.keyReleased(e);
            
            leftmostWall.keyReleased(e);
            topmostWall.keyReleased(e);
            rightmostWall.keyReleased(e);
            stairsLeft.keyReleased(e);
            stairsRight.keyReleased(e);
            
            topleftRoom.keyReleased(e);
            topleftWall.keyReleased(e);
            
            topmidRoom.keyReleased(e);
            doortopmid.keyReleased(e);
            toprightWall1.keyReleased(e);
            toprightWall2.keyReleased(e);
            toprightWall3.keyReleased(e);
            
            toprightRoom.keyReleased(e);
            doortopright.keyReleased(e);
            
            topWall.keyReleased(e);
            topWall2.keyReleased(e);
            hallway.keyReleased(e);
            botWall1.keyReleased(e);
            botWall2.keyReleased(e);
            
            botleftRoom.keyReleased(e);
            doorleft.keyReleased(e);
            
            botleftWall1.keyReleased(e);
            botleftWall2.keyReleased(e);
            
            botmidRoom.keyReleased(e);
            doormid.keyReleased(e);
            
            botrightWall1.keyReleased(e);
            botrightWall2.keyReleased(e);
            
            botrightRoom.keyReleased(e);
            doorright.keyReleased(e);
            
            botbotWall.keyReleased(e);
        }
        
        @Override
        public void keyPressed(KeyEvent e) {
            chara.keyPressed(e);
            if (chara.isInGame() == true){
                ans1.keyPressed(e);
                ans2.keyPressed(e);
                ans3.keyPressed(e);
                ans4.keyPressed(e);
                ans5.keyPressed(e);
                ans6.keyPressed(e);

                mouse.keyPressed(e);
                keyboard.keyPressed(e);
                monitor.keyPressed(e);

                ghostComputer.keyPressed(e);

                keyRed.keyPressed(e);
                keyRed1.keyPressed(e);
                keyRed2.keyPressed(e);
                keyBlue.keyPressed(e);
                keyOrange.keyPressed(e);
                keyGreen.keyPressed(e);
                keyPurple.keyPressed(e);

                leftmostWall.keyPressed(e);
                topmostWall.keyPressed(e);
                rightmostWall.keyPressed(e);
                stairsLeft.keyPressed(e);
                stairsRight.keyPressed(e);

                topleftRoom.keyPressed(e);
                topleftWall.keyPressed(e);

                topmidRoom.keyPressed(e);
                doortopmid.keyPressed(e);
                toprightWall1.keyPressed(e);
                toprightWall2.keyPressed(e);
                toprightWall3.keyPressed(e);

                toprightRoom.keyPressed(e);
                doortopright.keyPressed(e);

                topWall.keyPressed(e);
                topWall2.keyPressed(e);
                hallway.keyPressed(e);
                botWall1.keyPressed(e);
                botWall2.keyPressed(e);

                botleftRoom.keyPressed(e);
                doorleft.keyPressed(e);

                botleftWall1.keyPressed(e);
                botleftWall2.keyPressed(e);

                botmidRoom.keyPressed(e);
                doormid.keyPressed(e);

                botrightWall1.keyPressed(e);
                botrightWall2.keyPressed(e);

                botrightRoom.keyPressed(e);
                doorright.keyPressed(e);

                botbotWall.keyPressed(e);
            }
        }
    }
   
    public void checkCollisions() {
        Rectangle charaR = chara.getBounds();
        
        Rectangle tlw = topleftWall.getBounds();
        Rectangle trw1 = toprightWall1.getBounds();
        Rectangle trw2 = toprightWall2.getBounds();
        Rectangle trw3 = toprightWall3.getBounds();
        
        Rectangle blwall2 = botleftWall2.getBounds();
        Rectangle blwall1 = botleftWall1.getBounds();
        
        Rectangle tmw = topmostWall.getBounds();
        Rectangle lmw = leftmostWall.getBounds();
        Rectangle rmw = rightmostWall.getBounds();
        Rectangle tw = topWall.getBounds();
        Rectangle tw2 = topWall2.getBounds();
        
        Rectangle dtm = doortopmid.getBounds();
        Rectangle dtr = doortopright.getBounds();
        Rectangle dm = doormid.getBounds();
        Rectangle dl = doorleft.getBounds();
        Rectangle dr = doorright.getBounds();
        
        Rectangle bwall1 = botWall1.getBounds();
        Rectangle bwall2 = botWall2.getBounds();
        
        Rectangle bbwall = botbotWall.getBounds();
        Rectangle brwall1 = botrightWall1.getBounds();
        Rectangle brwall2 = botrightWall2.getBounds();
        
        Rectangle rk = keyRed.getBounds();
        Rectangle rk1 = keyRed1.getBounds();
        Rectangle rk2 = keyRed2.getBounds();
        Rectangle bk = keyBlue.getBounds();
        Rectangle ok = keyOrange.getBounds();
        Rectangle gk = keyGreen.getBounds();
        Rectangle pk = keyPurple.getBounds();
        
        Rectangle ms = mouse.getBounds();
        Rectangle kb = keyboard.getBounds();
        Rectangle mt = monitor.getBounds();
        
        Rectangle gc = ghostComputer.getBounds();
        
        Rectangle a1 = ans1.getBounds();
        Rectangle a2 = ans2.getBounds();
        Rectangle a3 = ans3.getBounds();
        Rectangle a4 = ans4.getBounds();
        Rectangle a5 = ans5.getBounds();
        Rectangle a6 = ans6.getBounds();
        
        if(rk.intersects(charaR)){
            if(keyRed1.held == false && keyRed2.held == false){
                keyRed.interact = true;
                wrongkey = false;
            }
        } else {
            keyRed.interact = false;
        }
        
        if(rk1.intersects(charaR)){
            if(keyRed.held == false && keyRed2.held == false){
                keyRed1.interact = true;
                wrongkey = true;
            }
        } else {
            keyRed1.interact = false;
        }
        
        if(rk2.intersects(charaR)){
            if(keyRed1.held == false && keyRed.held == false){
                keyRed2.interact = true;
                wrongkey = true;
            }
        }else {
            keyRed2.interact = false;
        }
        
        if(ok.intersects(charaR)){
            keyOrange.interact = true;
        } else {
            keyOrange.interact = false;
        }
        
        if(bk.intersects(charaR)){
            keyBlue.interact = true;
        } else {
            keyBlue.interact = false;
        }
        
        if(pk.intersects(charaR)){
            keyPurple.interact = true;
        } else {
            keyPurple.interact = false;
        }
        
        if(trw1.intersects(charaR)){
            if(charaR.x > trw1.y){
                addX();
            }
        }
        
        if(trw2.intersects(charaR)){
            if (charaR.x < trw2.x + toprightWall2.width){  
                subtractX();
            }
        }
        
        if(trw3.intersects(charaR)){
            if(charaR.x > trw3.y){
                addX();
            }
        }

        if (blwall2.intersects(charaR)){
            if (charaR.x < blwall2.x + blwall2.width){
                subtractX();
            }
        }
        
        if (blwall1.intersects(charaR)){
            if (charaR.x < blwall1.x){
                addX();
            }
        }
        
        toprightRoom(charaR, a1, a2, a3, a4, a5, a6);
        topmidRoom(charaR, ms, kb, mt, tlw);
        topMainWall(tw, charaR, dtm, dtr, tw2);
        botMainWall(charaR, bwall1, dm, dr, dl, bwall2);
        botrightRoom(charaR, brwall1, brwall2, gk, gc);
        borderWalls(charaR, lmw, rmw, bbwall, tmw);
    }
    
    public void toprightRoom(Rectangle charaR, Rectangle a1, Rectangle a2, Rectangle a3, Rectangle a4, Rectangle a5, Rectangle a6){
        if(a1.intersects(charaR)){
            ans1.dialogue = true;
            if (textBox.isVisible() == true){
                chara.gameComplete = true;
            }
        } else{
            ans1.dialogue = false;
        }
        if(a2.intersects(charaR)){
            ans2.dialogue = true;
            if (textBox.isVisible() == true){
                chara.gameOver = true;
            }
        } else{
            ans2.dialogue = false;
        }
        if(a3.intersects(charaR)){
            ans3.dialogue = true;
            if (textBox.isVisible() == true){
                chara.gameOver = true;
            }
        } else{
            ans3.dialogue = false;
        }
        if(a4.intersects(charaR)){
            ans4.dialogue = true;
            if (textBox.isVisible() == true){
                chara.gameOver = true;
            }
        } else{
            ans4.dialogue = false;
        }
        if(a5.intersects(charaR)){
            ans5.dialogue = true;
            if (textBox.isVisible() == true){
                chara.gameOver = true;
            }
        } else{
            ans5.dialogue = false;
        }
        if(a6.intersects(charaR)){
            ans6.dialogue = true;
            if (textBox.isVisible() == true){
                chara.gameOver = true;
            }
        } else{
            ans6.dialogue = false;
        }
    }
    
    public void topmidRoom(Rectangle charaR, Rectangle ms, Rectangle kb, Rectangle mt, Rectangle tlw){
        if(kb.intersects(charaR)){
            keyBlue.interact = true;
        } else {
            keyBlue.interact = false;
        }
        
        if(ms.intersects(charaR)){
            mouse.dialogue = true;
        }
        
        if(mt.intersects(charaR)){
            monitor.dialogue = true;
        }
        
        if(tlw.intersects(charaR)){
            if (charaR.x < tlw.x + topleftWall.width){
                subtractX();
            }
        }
    }
    
    public void topMainWall(Rectangle tw, Rectangle charaR, Rectangle dtm, Rectangle dtr, Rectangle tw2){
        if(tw.intersects(charaR)){
            if (dtm.contains(charaR)){
                if (keyGreen.isHeld() == true){
                    doortopmid.interact = true;
                    if (doortopmid.isOpen() == true){
                        keyGreen.held = false;
                        keyGreen.used = true;
                    }
                }else{
                    doortopmid.dialogue = true;
                }
                if (doortopmid.open == false){
                    addY();
                }
            }else if(dtr.contains(charaR)){
                if (keyPurple.isHeld() == true){
                    doortopright.interact = true;
                    if (doortopright.isOpen() == true){
                        keyPurple.held = false;
                        keyPurple.used = true;
                    }
                }else{
                    doortopright.dialogue = true;
                }
                if (doortopright.open == false){
                    addY();
                }
            }else {
                if(charaR.y < tw.y + 100){
                    addY();
                }
            }
        }
        
        if(tw2.intersects(charaR)){
            if (dtm.contains(charaR)){
                if (keyGreen.isHeld() == true){
                    doortopmid.interact = true;
                    if (doortopmid.isOpen() == true){
                        keyGreen.held = false;
                        keyGreen.used = true;
                    }
                }else{
                    doortopmid.dialogue = true;
                }
                if (doortopmid.open == false){
                    subtractY();
                }
            }else if(dtr.contains(charaR)){
                if (keyPurple.isHeld() == true){
                    doortopright.interact = true;
                    if (doortopright.isOpen() == true){
                        keyPurple.held = false;
                        keyPurple.used = true;
                    }
                }else{
                    doortopright.dialogue = true;
                }
                if (doortopright.open == false){
                    subtractY();
                }
            }else {
                if(charaR.y < tw.y + 100){
                    subtractY();
                }
            }
        }
    }
    
    public void botMainWall(Rectangle charaR, Rectangle bwall1, Rectangle dm, Rectangle dr, Rectangle dl, Rectangle bwall2){
        if (bwall1.intersects(charaR)){
            if(dm.contains(charaR)){
                if (keyRed.isHeld() == true){
                    doormid.interact = true;
                    if (doormid.isOpen() == true){
                        keyRed.held = false;
                        keyRed.used = true;
                    }
                }else if (keyRed1.isHeld() == true){
                    doormid.dialogue = true;
                    if (textBox.isVisible() == true){
                        keyRed1.held = false;
                        keyRed1.used = true;
                    }
                }else if (keyRed2.isHeld() == true){
                    doormid.dialogue = true;
                    if (textBox.isVisible() == true){
                        keyRed2.held = false;
                        keyRed2.used = true;
                    }
                }else{
                    doormid.dialogue = true;
                }
                if (doormid.open == false)
                    addY();
            } else if (dl.contains(charaR)){
                if (keyBlue.isHeld() == true){
                    doorleft.interact = true;
                    if (doorleft.isOpen() == true){
                        keyBlue.held = false;
                        keyBlue.used = true;
                    }
                }else {
                    doorleft.dialogue = true;
                }
                if (doorleft.open == false)
                    addY();
            }else if (dr.contains(charaR)){ 
                if (keyOrange.isHeld() == true){
                    doorright.interact = true;
                    if (doorright.isOpen() == true){
                        keyOrange.held = false;
                        keyOrange.used = true;
                    }
                }else {
                    doorright.dialogue = true;
                }
                if (doorright.open == false)
                    addY();
            }else {
                if(charaR.y < bwall1.y + botWall1.height)
                    addY();
            }
        }
        
        if (bwall2.intersects(charaR)){
            if(dm.contains(charaR)){
                if (keyRed.isHeld() == true){
                    doormid.interact = true;
                    if (textBox.isVisible() == true){
                        keyRed.held = false;
                        keyRed.used = true;
                    }
                }else if (keyRed1.isHeld() == true){
                    doormid.dialogue = true;
                    if (textBox.isVisible() == true){
                        keyRed1.held = false;
                        keyRed1.used = true;
                    }
                }else if (keyRed2.isHeld() == true){
                    doormid.dialogue = true;
                    if (textBox.isVisible() == true){
                        keyRed2.held = false;
                        keyRed2.used = true;
                    }
                }else{
                    doormid.dialogue = true;
                }
                if (doormid.open == false)
                    subtractY();
            } else if (dl.contains(charaR)){    
                if (keyBlue.isHeld() == true){
                    doorleft.interact = true;
                    if (doorleft.isOpen() == true){
                        keyBlue.held = false;
                        keyBlue.used = true;
                    }
                }else {
                    doorleft.dialogue = true;
                }
                if (doorleft.open == false)
                    addY();
            }else{
                if (charaR.y < bwall2.y + botWall2.height)
                    subtractY();
            }
        }
    }
    
    public void botrightRoom(Rectangle charaR, Rectangle brwall1, Rectangle brwall2, Rectangle gk, Rectangle gc){
        if (brwall1.intersects(charaR)){
            if (charaR.x < brwall1.x + brwall1.width)
                addX();
        }
        
        if (brwall2.intersects(charaR)){
            if (charaR.x < brwall2.x)
                addX();
        }
        
        if(gk.intersects(charaR)){
            keyGreen.interact = true;
        } else {
            keyGreen.interact = false;
        }
        
        if(gc.intersects(charaR)){
            ghostComputer.dialogue = true;
        }
    }
    
    public void borderWalls(Rectangle charaR, Rectangle lmw, Rectangle rmw, Rectangle bbwall, Rectangle tmw){
        if (lmw.intersects(charaR)){
            if (charaR.x < lmw.x + leftmostWall.width){
                subtractX();
            }
        }
        
        if (rmw.intersects(charaR)){
            if (charaR.x < rmw.x){
                addX();
            }
        }
        
        if (bbwall.intersects(charaR)){
            if (charaR.y < bbwall.y + botbotWall.height){
                addY();
            }
        }
                
        if(tmw.intersects(charaR)){
            if(charaR.y > tmw.y){
                subtractY();
                }
        }
    }
    
    public void addX(){
        ans1.x += 3;
        ans2.x += 3;
        ans3.x += 3;
        ans4.x += 3;
        ans5.x += 3;
        ans6.x += 3;
        
        mouse.x += 3;
        keyboard.x += 3;
        monitor.x += 3;
        
        ghostComputer.x += 3;
        
        keyRed.x += 3;
        keyRed1.x += 3;
        keyRed2.x += 3;
        keyOrange.x += 3;
        keyBlue.x += 3;
        keyGreen.x +=3;
        keyPurple.x += 3;
        
        leftmostWall.x += 3;
        topmostWall.x += 3;
        rightmostWall.x += 3;
                
        stairsLeft.x += 3;
        stairsRight.x += 3;
                    
        topleftWall.x += 3;
        toprightWall1.x += 3;
        toprightWall2.x += 3;
        toprightWall3.x += 3;
        topleftRoom.x += 3;
        topmidRoom.x += 3;
        doortopmid.x += 3;
        doortopright.x += 3;
        toprightRoom.x += 3;
                    
        topWall.x += 3;
        topWall2.x += 3;
        hallway.x += 3;
        botWall1.x += 3;
        botWall2.x += 3;
                    
        botleftRoom.x += 3;
        doorleft.x += 3;
                    
        botleftWall1.x += 3;
        botleftWall2.x += 3;
                    
        botmidRoom.x += 3;
        doormid.x += 3;
                    
        botrightWall1.x += 3;
        botrightWall2.x += 3;
                
        botrightRoom.x += 3;
        doorright.x += 3;
                
        botbotWall.x += 3;
    }
    
    public void subtractX(){
        ans1.x -= 3;
        ans2.x -= 3;
        ans3.x -= 3;
        ans4.x -= 3;
        ans5.x -= 3;
        ans6.x -= 3;
        
        mouse.x -= 3;
        keyboard.x -= 3;
        monitor.x -= 3;
        
        ghostComputer.x -= 3;
        
        keyRed.x -= 3;
        keyRed1.x -= 3;
        keyRed2.x -= 3;
        keyOrange.x -= 3;
        keyBlue.x -= 3;
        keyGreen.x -=3;
        keyPurple.x -= 3;
                
        leftmostWall.x -= 3;
        topmostWall.x -= 3;
        rightmostWall.x -= 3;
                
        stairsLeft.x -= 3;
        stairsRight.x -= 3;
                
        topleftWall.x -= 3;
        toprightWall1.x -= 3;
        toprightWall2.x -= 3;
        toprightWall3.x -= 3;
        topleftRoom.x -= 3;
        topmidRoom.x -= 3;
        doortopmid.x -= 3;
        doortopright.x -= 3;
        toprightRoom.x -= 3;

        topWall.x -= 3;
        topWall2.x -= 3;
        hallway.x -= 3;
        botWall1.x -= 3;
        botWall2.x -= 3;

        botleftRoom.x -= 3;
        doorleft.x -= 3;

        botleftWall1.x -= 3;
        botleftWall2.x -= 3;

        botmidRoom.x -= 3;
        doormid.x -= 3;
                    
        botrightWall1.x -= 3;
        botrightWall2.x -= 3;

        botrightRoom.x -= 3;
        doorright.x -= 3;

        botbotWall.x -= 3;
    }
    
    public void addY(){
        ans1.y += 3;
        ans2.y += 3;
        ans3.y += 3;
        ans4.y += 3;
        ans5.y += 3;
        ans6.y += 3;
        
        mouse.y += 3;
        keyboard.y += 3;
        monitor.y += 3;
        
        ghostComputer.y += 3;
        
        keyRed.y += 3;
        keyRed1.y += 3;
        keyRed2.y += 3;
        keyOrange.y += 3;
        keyBlue.y += 3;
        keyGreen.y +=3;
        keyPurple.y += 3;
                
        leftmostWall.y += 3;
        topmostWall.y += 3;
        rightmostWall.y += 3;

        stairsLeft.y += 3;
        stairsRight.y += 3;

        topleftWall.y += 3;
        toprightWall1.y += 3;
        toprightWall2.y += 3;
        toprightWall3.y += 3;
        topleftRoom.y += 3;
        topmidRoom.y += 3;
        doortopmid.y += 3;
        doortopright.y += 3;
        toprightRoom.y += 3;
                    
        topWall.y += 3;
        topWall2.y += 3;
        hallway.y += 3;
        botWall1.y += 3;
        botWall2.y += 3;

        botleftRoom.y += 3;
        doorleft.y += 3;

        botleftWall1.y += 3;
        botleftWall2.y += 3;

        botmidRoom.y += 3;
        doormid.y += 3;

        botrightWall1.y += 3;
        botrightWall2.y += 3;

        botrightRoom.y += 3;
        doorright.y += 3;

        botbotWall.y += 3;
    }
    
    public void subtractY(){
        ans1.y -= 3;
        ans2.y -= 3;
        ans3.y -= 3;
        ans4.y -= 3;
        ans5.y -= 3;
        ans6.y -= 3;
        
        mouse.y -= 3;
        keyboard.y -= 3;
        monitor.y -= 3;
        
        ghostComputer.y -= 3;
        
        keyRed.y -= 3;
        keyRed1.y -= 3;
        keyRed2.y -= 3;
        keyOrange.y -= 3;
        keyBlue.y -= 3;
        keyGreen.y -=3;
        keyPurple.y -= 3;
                    
        leftmostWall.y -= 3;
        topmostWall.y -= 3;
        rightmostWall.y -= 3;

        stairsLeft.y -= 3;
        stairsRight.y -= 3;

        topleftWall.y -= 3;
        toprightWall1.y -= 3;
        toprightWall2.y -= 3;
        toprightWall3.y -= 3;
        topleftRoom.y -= 3;
        topmidRoom.y -= 3;
        doortopmid.y -= 3;
        doortopright.y -= 3;
        toprightRoom.y -= 3;

        topWall.y -= 3;
        topWall2.y -= 3;
        hallway.y -= 3;
        botWall1.y -= 3;
        botWall2.y -= 3;
                    
        botleftRoom.y -= 3;
        doorleft.y -= 3;

        botleftWall1.y -= 3;
        botleftWall2.y -= 3;

        botmidRoom.y -= 3;
        doormid.y -= 3;

        botrightWall1.y -= 3;
        botrightWall2.y -= 3;

        botrightRoom.y -= 3;
        doorright.y -= 3;

        botbotWall.y -= 3;
    }

}


