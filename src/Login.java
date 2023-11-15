import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class Login implements ActionListener
{

    // Database connection details
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/employee_payroll_system";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "3101";


    JFrame frame;
    JPanel left_panel;
    JLabel close ;
    JLabel min ;
    JLabel passwordicon;
    JPasswordField password_passwordfield;
    JTextField username_textfield;
    JButton login_button;
    JLabel admin_label;
    JLabel admin_icon;
    JLabel selectAdmin1;JLabel selectAdmin2;
    JLabel employee_icon;
    JLabel employee_Label;
    JLabel selectEmployee1;JLabel selectEmployee2;
    

    String username,password,privilege;

    JFrame message_frame = new JFrame();
    GradientButton messagebox_ok = new GradientButton(Color.decode("#004FF9"),Color.decode("#56CCF2"));

    
    Login()
    {

        // Initialize frame
        frame = new JFrame();
        ImageIcon mainicon = new ImageIcon("lib\\images\\companylogo.png");

        // Initilize leftpanel
        left_panel = new JPanel();

        // Initilize components used in leftpanel
        JLabel login_label = new JLabel("LOGIN");
        JLabel usernamelabel = new JLabel("Username");
        username_textfield = new JTextField();
        JLabel userline = new JLabel("________________________");
        JLabel usernameicon = new JLabel();
        JLabel passwordlabel = new JLabel("Password");
        password_passwordfield = new JPasswordField();
        JLabel passwordline = new JLabel("________________________");
        passwordicon = new JLabel();
        JLabel privilegelabel = new JLabel("Privilege");
        admin_icon = new JLabel(); 
        admin_label = new JLabel("Admin");
        JLabel employee_icon = new JLabel();
        JLabel employee_Label = new JLabel("Employee");
        selectAdmin1 = new JLabel("_______");
        selectAdmin2 = new JLabel("|");
        selectEmployee1 = new JLabel("_________");
        selectEmployee2= new JLabel("|");
        login_button = new JButton();


        // Initilize rightpanel
        JPanel right_Panel = new JPanel();

        // Initilize components used in rightpanel
        JLabel mainlogo = new JLabel();
        JLabel companyname = new JLabel("VK TECH");
        JLabel loginimage_label = new JLabel();
        ImageIcon loginicon = new ImageIcon("lib\\images\\login_photo.jpg");
        close = new JLabel(" X ");
        min = new JLabel("-");
        JLabel WelcomeLabel = new JLabel("WELCOME");


        //---------------------------------------------------F R A M E--------------------------------------------------//
        // Defining frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // 
        frame.setSize(new Dimension(850,550));  // frame size
        frame.setLocationRelativeTo(null);  // display frame in center of screen
        frame.setIconImage(mainicon.getImage());
        frame.setLayout(new BorderLayout());
        frame.setUndecorated(true); // removes the title bar
        
        //-----------------------------------------------L E F T P A N E L----------------------------------------------//
        // Defining leftpanel
        left_panel.setPreferredSize(new Dimension(450, 600));  // use preferdsize for panel
        left_panel.setBackground(new Color(6, 143, 255));
        left_panel.setLayout(null); // no layout

        // Defining label
        login_label.setFont(new Font("Roboto", Font.PLAIN, 30)); // Modify fonts
        login_label.setForeground(Color.WHITE); // Font color
        login_label.setBounds(180, 55, 150, 30); // position of label(null Layout)

        // Defining usernamelabel
        usernamelabel.setFont(new Font("Roboto", Font.PLAIN, 18)); 
        usernamelabel.setForeground(Color.WHITE);
        usernamelabel.setBounds(50, 145, 150, 18); 

        // Defining username_textfield
        username_textfield.setFont(new Font("Roboto", Font.PLAIN, 20));
        username_textfield.setBounds(50, 167, 300, 35);
        username_textfield.setBorder(null);
        username_textfield.setFont(new Font("Roboto", Font.PLAIN, 20));
        username_textfield.setBackground(new Color(6, 143, 255));
        username_textfield.setForeground(Color.BLACK);
        userline.setFont(new Font("Roboto", Font.PLAIN, 25));
        userline.setBounds(50, 180, 360, 30);

        // Defining usernameicon
        usernameicon.setIcon(new ImageIcon("lib\\images\\user.png")); 
        usernameicon.setBounds(360, 165, 35, 35);

        // Defining passwordlabel
        passwordlabel.setFont(new Font("Roboto", Font.PLAIN, 18));
        passwordlabel.setForeground(Color.WHITE);
        passwordlabel.setBounds(50, 235, 100, 18);

        // Defining password_passwordfield
        password_passwordfield.setFont(new Font("Roboto", Font.PLAIN, 20));
        password_passwordfield.setBounds(50, 257, 300, 35);
        password_passwordfield.setBorder(null);
        password_passwordfield.setBackground(new Color(6, 143, 255));
        password_passwordfield.setForeground(Color.BLACK);
        passwordline.setFont(new Font("Roboto", Font.PLAIN, 25));
        passwordline.setBounds(50, 270, 360, 30);

        // Defining username_textfield
        passwordicon.setIcon(new ImageIcon("lib\\images\\invisible.png"));
        passwordicon.setBounds(360, 255, 35, 35);
        passwordicon.addMouseListener(new java.awt.event.MouseAdapter() // react to the mouse pointer
        {
            public void mousePressed(java.awt.event.MouseEvent e)  
            {
                passwordiconPressed(e);
            }
            public void mouseReleased(java.awt.event.MouseEvent e)
            {
                passwordiconReleased(e);
            }
        });


        // Defining privilegelabel
        privilegelabel.setFont(new Font("Roboto", Font.PLAIN, 18));
        privilegelabel.setForeground(Color.WHITE);
        privilegelabel.setBounds(50, 330, 100, 19);
    
        // Defining admin_icon
        admin_icon.setIcon(new ImageIcon("lib\\images\\admin.png"));
        admin_icon.setBounds(65, 360, 35, 32);
        admin_icon.setOpaque(true); // Background
        admin_icon.setBackground(new Color(6, 143, 255));
        
        // Defining selectAdmin1
        selectAdmin1.setFont(new Font("Roboto", Font.BOLD, 30));
        selectAdmin1.setBounds(52, 360, 150, 40);
        selectAdmin1.setForeground(Color.BLACK);
        selectAdmin1.setVisible(false);

        // Defining selectAdmin2
        selectAdmin2.setFont(new Font("Roboto", Font.BOLD, 30));
        selectAdmin2.setBounds(50, 330, 50, 100);
        selectAdmin2.setForeground(Color.BLACK);
        selectAdmin2.setVisible(false);

        // Adding  Mouse listener to admin_icon
        admin_icon.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent e)
            {
                adminiconClicked(e);
            }
        });

        // Defining admin_label
        admin_label.setFont(new Font("Roboto", Font.BOLD, 20));
        admin_label.setBounds(110,374, 80, 20);
        admin_label.setForeground(Color.BLACK);
        admin_label.setOpaque(true);
        admin_label.setBackground(new Color(6, 143, 255));
        admin_label.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent e)
            {
                adminiconClicked(e);
            }
        });
        
        // Defining employee_icon
        employee_icon.setIcon(new ImageIcon("lib\\images\\employee.png"));
        employee_icon.setBounds(253, 360, 35, 32);
        employee_icon.setOpaque(true);
        employee_icon.setBackground(new Color(6, 143, 255));

        // Defining selectEmployee1
        selectEmployee1.setFont(new Font("Roboto", Font.BOLD, 30));
        selectEmployee1.setBounds(238, 360, 180, 40);
        selectEmployee1.setForeground(Color.BLACK);
        selectEmployee1.setVisible(false);

        // Defining selectEmployee2
        selectEmployee2.setFont(new Font("Roboto", Font.BOLD, 30));
        selectEmployee2.setBounds(235, 330, 30, 100);
        selectEmployee2.setForeground(Color.BLACK);
        selectEmployee2.setVisible(false);

        // Adding Mouse listener to employee_icon
        employee_icon.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent e)
            {
                employeeiconClicked(e);
            }
        });

        // Defining employee_Label
        employee_Label.setFont(new Font("Roboto", Font.BOLD, 19));
        employee_Label.setBounds(296, 370, 100, 25);
        employee_Label.setForeground(Color.BLACK);
        employee_Label.setOpaque(true);
        employee_Label.setBackground(new Color(6, 143, 255));
        employee_Label.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent e)
            {
                employeeiconClicked(e);
            }
        });

        // Defining login_button
        login_button.setText("Login");
        login_button.setFont(new Font("Roboto", Font.BOLD, 25));
        login_button.setForeground(new Color(6, 143, 255));
        login_button.setBounds(50, 440, 340, 35);
        login_button.setBorder(null);
        login_button.setFocusable(false); // Inside button, box around the text
        login_button.addActionListener(this);

        
        // Adding defined component to the left_panel
        left_panel.add(login_label);
        left_panel.add(usernamelabel);
        left_panel.add(username_textfield);
        left_panel.add(userline);
        left_panel.add(usernameicon);
        left_panel.add(passwordlabel);
        left_panel.add(password_passwordfield);
        left_panel.add(passwordline);
        left_panel.add(passwordicon);
        left_panel.add(privilegelabel);
        left_panel.add(admin_icon);
        left_panel.add(admin_label);
        left_panel.add(employee_icon);
        left_panel.add(employee_Label);
        left_panel.add(login_button);
        left_panel.add(selectAdmin1);
        left_panel.add(selectAdmin2);
        left_panel.add(selectEmployee1);
        left_panel.add(selectEmployee2);
        
        
        //----------------------------------------------R I G H T P A N E L---------------------------------------------//
        // Defining right_Panel
        right_Panel.setPreferredSize(new Dimension(400, 600));
        right_Panel.setBackground(Color.WHITE);
        right_Panel.setLayout(null);

        // Defining mainlogo
        mainlogo.setBounds(5, 5, 50, 50);
        mainlogo.setIcon(new ImageIcon("lib\\images\\companylogo.png"));
        
        // Defining companyname
        companyname.setFont(new Font("Roboto", Font.BOLD, 17));
        companyname.setBounds(13, 52, 75, 20);

        // Defining loginimage_label
        loginimage_label.setSize(400,450); // Size of label

        // Different label and image size
        // fit the image int the label
        Image img = loginicon.getImage();  // get the image from the Imageicon
        // Resisizing image to the size of label
        Image resizeimage = img.getScaledInstance(loginimage_label.getWidth(), loginimage_label.getHeight(),Image.SCALE_SMOOTH);
        // store resized image to Imageicon
        ImageIcon finalimage = new ImageIcon(resizeimage);
        loginimage_label.setIcon(finalimage);
        loginimage_label.setBounds(0, 90, 350 , 450);
        
        // Defining close
        close.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
        close.setBounds(370, 5, 25, 25);
        close.setOpaque(true);
        close.setBackground(Color.WHITE);
        close.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent e)
            {
                closeclicked(e);
            }

            public void mouseEntered(java.awt.event.MouseEvent e)
            {
                closeentered(e);
            }

            public void mouseExited(java.awt.event.MouseEvent e)
            {
                closeexited(e);
            }
        });
        
        // Defining min
        min.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 40));
        min.setBounds(345, 6, 15, 15);
        min.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent e)
            {
                minclicked(e);
            }

            public void mouseEntered(java.awt.event.MouseEvent e)
            {
                minentered(e);
            }

            public void mouseExited(java.awt.event.MouseEvent e)
            {
                minexited(e);
            }
            
        });

        // Defining WelcomeLabel
        WelcomeLabel.setFont(new Font("Roboto", Font.BOLD, 30));
        WelcomeLabel.setForeground(new Color(6, 143, 255));
        WelcomeLabel.setBounds(125,58, 165, 25);


        // Adding defined components to the right_Panel
        right_Panel.add(mainlogo);
        right_Panel.add(loginimage_label);
        right_Panel.add(close);
        right_Panel.add(min);
        right_Panel.add(WelcomeLabel);
        right_Panel.add(companyname);


        //---------------------------------------------------F R A M E--------------------------------------------------//
        // Adding defined panels in the frame
        frame.add(left_panel,BorderLayout.WEST);
        frame.add(right_Panel,BorderLayout.EAST);

        // dispay the frame
        frame.setVisible(true);
    }
    
    //---------------------------------------------M O U S E L I S T E N E R--------------------------------------------//
    public void closeclicked(java.awt.event.MouseEvent e)
    {
        System.exit(0);
    }
    public void closeentered(java.awt.event.MouseEvent e)
    {
        close.setForeground(Color.RED);
    }
    public void closeexited(java.awt.event.MouseEvent e)
    {
        close.setForeground(Color.BLACK);
    }


    public void minclicked(java.awt.event.MouseEvent e)
    {
        frame.setExtendedState(1);
    }
    public void minentered(java.awt.event.MouseEvent e)
    {
        min.setForeground(Color.RED);
    }
    public void minexited(java.awt.event.MouseEvent e)
    {
        min.setForeground(Color.BLACK);
    }


    public void passwordiconPressed(java.awt.event.MouseEvent e)
    {
        passwordicon.setIcon(new ImageIcon("lib\\images\\visible.png"));
        password_passwordfield.setEchoChar((char)0);
    }
    public void passwordiconReleased(java.awt.event.MouseEvent e)
    {
        passwordicon.setIcon(new ImageIcon("lib\\images\\invisible.png"));
        password_passwordfield.setEchoChar('•'); //alt+7
    }


    public void adminiconClicked(java.awt.event.MouseEvent e)
    {
        selectEmployee1.setVisible(false);
        selectEmployee2.setVisible(false);
        selectAdmin1.setVisible(true);
        selectAdmin2.setVisible(true);
        privilege = "Admin";
    }


    public void employeeiconClicked(java.awt.event.MouseEvent e)
    {
        selectAdmin1.setVisible(false);
        selectAdmin2.setVisible(false);
        selectEmployee1.setVisible(true);
        selectEmployee2.setVisible(true);
        privilege = "Employee";
    }


    public void messagebox(String h,String c1)
    {
        GradientPanel message_panel = new GradientPanel(new Color(245,245,245),new Color(245,245,245),30);
        
        //GradientButton cancel = new GradientButton(Color.decode("#004FF9"),Color.decode("#56CCF2"));

        JLabel heading = new JLabel();
        JLabel content = new JLabel();
        

            message_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // 
            message_frame.setSize(1920,1080); // message_frame size
            message_frame.setLocationRelativeTo(null);  // display message_frame in center of screen
            message_frame.setUndecorated(true);
            message_frame.setLayout(null);
            //getContentPane().setBackground(new Color(0,0,0));
            message_frame.setIconImage(new ImageIcon("lib\\images\\companylogo.png").getImage());
            message_frame.setBackground(new Color(0.f,0.0f,0.0f,0.6f));

            message_panel.setBounds(750,450, 500, 200);
            message_panel.setOpaque(true);
            message_panel.setLayout(null);
            //message_panel.setBackground(Color.BLACK);//(new Color(1.0f,1.0f,1.0f,0.0f));
            

            messagebox_ok.setBounds(320 ,140, 150, 40);
            messagebox_ok.setBorder(BorderFactory.createEmptyBorder());
            messagebox_ok.setText("OK");
            messagebox_ok.setFont(new Font("Roboto", Font.BOLD, 25));
            messagebox_ok.setForeground(new Color(240,240, 240));
            messagebox_ok.setFocusable(false);
            messagebox_ok.addActionListener(this);


            /*cancel.setBounds(380 ,190, 100, 40);
            cancel.setBorder(BorderFactory.createEmptyBorder());
            cancel.setText("Cancel");
            cancel.setFont(new Font("Roboto", Font.BOLD, 20));
            cancel.setForeground(new Color(240,240, 240));
            cancel.setFocusable(false);*/

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



            message_panel.add(messagebox_ok);
            message_panel.add(heading);
            message_panel.add(content);
            //message_panel.add(cancel);



            message_frame.add(message_panel);
            message_frame.setVisible(true);

    }


    //--------------------------------------------A C T I O N L I S T E N E R-------------------------------------------//
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == login_button) 
        {
            username = username_textfield.getText();
            password = String.valueOf(password_passwordfield.getPassword());

            if (authenticateUser(username, password, privilege)) 
            {
                if (privilege.equals("Admin")) 
                {
                    
                    // open the message box
                    messagebox("LOGIN", "You are Logined as Admin");
                    

                } 

                else if (privilege.equals("Employee")) 
                {
                    // open the message box
                    messagebox("LOGIN", "You are Logined as Employee");
                }
            } 
            else 
            {
                new MessagePanel_file("LOGIN", "Invalid Username or password or privilege");
                username_textfield.setText("");
                password_passwordfield.setText("");
            }
        }
        if(e.getSource()==messagebox_ok)
        {
            if(privilege.equals("Admin"))
            {
                Adminpage admin_page = new Adminpage();
                this.frame.dispose();
                admin_page.show();
                message_frame.dispose();
                
                
            }

            else if(privilege.equals("Employee"))
            {
                EmployeePage employee_page = new EmployeePage();
                this.frame.dispose();
                employee_page.show();
                message_frame.dispose();
                
                
            }
                        

        }
    }
    

    private boolean authenticateUser(String username, String password, String privilege) 
    {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) 
        {
            String query = "SELECT * FROM login WHERE username = ? AND password = ? AND privilege = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            preparedStatement.setString(3, privilege);

            ResultSet resultSet = preparedStatement.executeQuery();

            return resultSet.next();
        } catch (SQLException ex) 
        {
            ex.printStackTrace();
        }
        return false;
    }


    public void closeClicked(java.awt.event.MouseEvent e)
    {
        
        System.exit(0);
    }


}
   
    
