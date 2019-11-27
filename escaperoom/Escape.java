package escaperoom;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class Escape extends JFrame {
    
    public Escape() {
        initUI();
    }
    
    private void initUI() {
        add(new EscapeRoom());
        
        setResizable(false);
        pack();
        
        setTitle("CITCScape");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            Escape ex = new Escape();
            ex.setVisible(true);
        });
    }
}

