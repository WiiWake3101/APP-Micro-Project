import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


class failedMessage 
{
    JLabel ok_botton;
    JLabel close;
    JFrame messageframe;

    failedMessage()
    {
        messageframe  = new JFrame();
        ImageIcon mainicon = new ImageIcon("images\\companylogo.png");
        JPanel panel = new JPanel();
        JPanel tilebar = new JPanel();
        JLabel message = new JLabel();
        JLabel failedicon = new JLabel(new ImageIcon("images\\wrong.png"));
        ok_botton = new JLabel("OK",SwingConstants.CENTER);
        close = new JLabel(new ImageIcon("images\\close.png"));


        messageframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        messageframe.setSize(new Dimension(430,200));  // messageframe size
        messageframe.setLocationRelativeTo(null);  // display messageframe in center of screen
        messageframe.setIconImage(mainicon.getImage());
        messageframe.setLayout(null);
        messageframe.setUndecorated(true); // removes the title bar
        
        
        tilebar.setBounds(0, 0, 430, 35);
        tilebar.setBackground(new Color(25, 29, 136));
        tilebar.setLayout(null);

        close.setBounds(397,0, 35, 35);
        close.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent e)
            {
                closeClicked(e);
            }
        });


        tilebar.add(close);

        
        panel.setPreferredSize(new Dimension(430, 300));
        panel.setBounds(0,35, 420, 165);
        panel.setLayout(null);
        panel.setBackground(new Color(235, 240, 246));


        failedicon.setBounds(5,30,60,60);


        message.setText("Invalid Username or password or privilege");
        message.setFont(new Font("Times New Roman",Font.PLAIN,20));
        message.setBounds(70, 50, 345, 25);


        ok_botton.setBorder(BorderFactory.createRaisedBevelBorder());
        ok_botton.setFont(new Font("Dubai Medium",Font.BOLD,25));
        ok_botton.setBounds(175,105, 80 ,35);
        ok_botton.setBackground(new Color(6, 143, 255));
        ok_botton.setForeground(Color.WHITE);
        ok_botton.setOpaque(true);
        ok_botton.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent e)
            {
                ok_bottonclicked(e);
            }

            public void mouseEntered(java.awt.event.MouseEvent e)
            {
                ok_bottonentered(e);
            }

            public void mouseExited(java.awt.event.MouseEvent e)
            {
                ok_bottonexited(e);
            }
            
        });

        panel.add(failedicon);
        panel.add(message);
        panel.add(ok_botton);

        messageframe.add(tilebar);
        messageframe.add(panel);
        

        messageframe.setVisible(true);
    }


    public void closeClicked(java.awt.event.MouseEvent e)
    {
        System.exit(0);
    }


    public void ok_bottonclicked(java.awt.event.MouseEvent e)
    {
        messageframe.dispose();
    }
    public void ok_bottonentered(java.awt.event.MouseEvent e)
    {
        ok_botton.setBackground(Color.WHITE);
        ok_botton.setForeground(new Color(6, 143, 255));
    }
    public void ok_bottonexited(java.awt.event.MouseEvent e)
    {
        ok_botton.setBackground(new Color(6, 143, 255));
        ok_botton.setForeground(Color.WHITE);
    }

    
}
