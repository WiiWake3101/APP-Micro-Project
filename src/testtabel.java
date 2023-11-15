import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.GridLayout;



import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class testtabel 
{

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();


    testtabel()
    {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // 
        frame.setSize(200,200); // frame size
        frame.setLocationRelativeTo(null);  // display frame in center of screen
        //frame.setUndecorated(true);
        frame.setIconImage(new ImageIcon("lib\\images\\companylogo.png").getImage());
        frame.setLayout(new BorderLayout());

        //panel.setBounds(10, 10, 150, 150);
        panel.setLayout(new GridLayout(50, 2, 50, 10));
        
        
        for(int i = 1; i<101 ; i++)
        {
            JLabel label = new JLabel();
            if(i<=7)
            {
                label.setOpaque(true);
                label.setBackground(Color.BLUE);
            }
            
            label.setBorder(BorderFactory.createRaisedBevelBorder());
            String txt = String.valueOf(i); 
            label.setText(txt);
            panel.add(label);
        }

        


        frame.add(new JScrollPane(panel,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED));




        frame.setVisible(true);
    }


    public static void main(String[] args) {
        new testtabel();
    }
}
