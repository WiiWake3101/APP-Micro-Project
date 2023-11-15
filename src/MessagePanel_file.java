import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;





class MessagePanel_file implements ActionListener
{
    JFrame frame = new JFrame();
    GradientPanel message_panel = new GradientPanel(new Color(245,245,245),new Color(245,245,245),30);
    GradientButton ok = new GradientButton(Color.decode("#004FF9"),Color.decode("#56CCF2"));
    //GradientButton cancel = new GradientButton(Color.decode("#004FF9"),Color.decode("#56C56CCF2CF2"));

    JLabel heading = new JLabel();
    JLabel content = new JLabel();
    
    MessagePanel_file(String h,String c1)
    {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // 
        frame.setSize(1920,1080); // frame size
        frame.setLocationRelativeTo(null);  // display frame in center of screen
        frame.setUndecorated(true);
        frame.setLayout(null);
        //getContentPane().setBackground(new Color(0,0,0));
        frame.setIconImage(new ImageIcon("lib\\images\\companylogo.png").getImage());
        frame.setBackground(new Color(0.f,0.0f,0.0f,0.6f));

        message_panel.setBounds(700,400, 500, 200);
        message_panel.setOpaque(true);
        message_panel.setLayout(null);
        //message_panel.setBackground(Color.BLACK);//(new Color(1.0f,1.0f,1.0f,0.0f));
        
        ok.setBounds(320 ,140, 150, 40);
        ok.setBorder(BorderFactory.createEmptyBorder());
        ok.setText("OK");
        ok.setFont(new Font("Roboto", Font.BOLD, 25));
        ok.setForeground(new Color(240,240, 240));
        ok.setFocusable(false);
        ok.addActionListener(this);

        //heading.setBackground(Color.BLACK);
        //heading.setOpaque(true);
        heading.setBounds(50 , 30, 400, 40);
        heading.setText(h);
        heading.setFont(new Font("Roboto", Font.BOLD, 30));
        heading.setForeground(Color.decode("#004FF9"));

        //content.setBackground(Color.BLACK);
        //content.setOpaque(true);
        content.setBounds(50 , 85, 400, 30);
        content.setText(c1);
        content.setFont(new Font("Roboto", Font.PLAIN, 20));
        content.setForeground(Color.BLACK);

        message_panel.add(ok);
        message_panel.add(heading);
        message_panel.add(content);
        
        frame.add(message_panel);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        frame.dispose();
    }
    
    public static void main(String[] args) {
        new MessagePanel_file("LOGIN", "Invalid Username or password or privilege");
    }
}
