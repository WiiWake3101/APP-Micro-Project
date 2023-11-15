import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



class EmployeePage
{
    JLabel close = new JLabel(" X ");
    JFrame  frame = new JFrame();
    JLabel logout = new JLabel("Logout");
    JLabel details = new JLabel("Details");
    JLabel salary = new JLabel("Salary");
    JPanel rightpanel = new JPanel();
    GradientPanel leftPanel = new GradientPanel(Color.decode("#004FF9"),Color.decode("#56CCF2"),0); 
    Icon menu = new ImageIcon("lib\\images\\optionbar.png");
    Icon rightarrow = new ImageIcon("lib\\images\\rightarrow.png");
    JLabel optionBar = new JLabel(menu);
    JLabel attendance = new JLabel("Attendance");
    Employee_Attendance homepage = new Employee_Attendance();
    Employee_details detailspage = new Employee_details();
    Employee_Salary salarypage = new Employee_Salary();
    

    EmployeePage()
    {
        JPanel menuBar = new JPanel();
        close = new JLabel("X",JLabel.CENTER);
        JLabel company = new JLabel();
        ImageAvatar employeeIcon = new ImageAvatar();
        JLabel username = new JLabel("UserName");
        JLabel employee = new JLabel("Employee",JLabel.CENTER);

        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // 
        frame.setSize(1800,1000); // frame size
        frame.setLocationRelativeTo(null);  // display frame in center of screen
        frame.setUndecorated(true);
        frame.setIconImage(new ImageIcon("lib\\images\\companylogo.png").getImage());
        frame.setLayout(null);




        leftPanel.setPreferredSize(new Dimension(300, 1000));
        leftPanel.setBounds(0, 0, 300, 1000);
        leftPanel.setLayout(null);


        
        employeeIcon.setBounds(5, 5, 55, 55);
        employeeIcon.setIcon(new ImageIcon("lib\\images\\admin.jpeg"));

        username.setFont(new Font("Roboto", Font.BOLD, 17)); // Modify fonts
        username.setForeground(Color.BLACK); // Font color
        username.setBounds(80, 12, 100 , 15);

        employee.setFont(new Font("Roboto", Font.BOLD, 20)); // Modify fonts
        employee.setForeground(Color.WHITE); // Font color
        employee.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3, false));
        employee.setBounds(80, 29, 180 , 28);
        employee.setVerticalTextPosition(1);
        
        
        logout.setIcon(new ImageIcon("lib\\images\\logout.png"));
        logout.setFont(new Font("Roboto", Font.BOLD, 25));
        logout.setBounds(10, 933, 280,50);
        logout.setForeground(new Color(240, 240, 240));
        logout.setHorizontalTextPosition(JLabel.RIGHT);
        logout.setVerticalTextPosition(JLabel.CENTER);
        logout.setIconTextGap(15);
        
        logout.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent e)
            {
                logoutclicked(e);
            }

            public void mouseEntered(java.awt.event.MouseEvent e)
            {
                logoutentered(e);
            }

            public void mouseExited(java.awt.event.MouseEvent e)
            {
                logoutexited(e);
            }
        });

        attendance.setIcon(new ImageIcon("lib\\images\\attendance.png"));
        attendance.setFont(new Font("Roboto", Font.BOLD, 25));
        attendance.setBounds(10, 120, 280,50);
        attendance.setForeground(Color.BLACK);
        attendance.setHorizontalTextPosition(JLabel.RIGHT);
        attendance.setVerticalTextPosition(JLabel.CENTER);
        attendance.setIconTextGap(18);
        attendance.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent e)
            {
                attendanceclicked(e);
            }

            public void mouseEntered(java.awt.event.MouseEvent e)
            {
                attendanceentered(e);
            }

            public void mouseExited(java.awt.event.MouseEvent e)
            {
                attendanceexited(e);
            }
        });
        

        details.setIcon(new ImageIcon("lib\\images\\employees.png"));
        details.setFont(new Font("Roboto", Font.BOLD, 25));
        details.setBounds(10, 180, 280,50);
        details.setForeground(new Color(240, 240, 240));
        details.setHorizontalTextPosition(JLabel.RIGHT);
        details.setVerticalTextPosition(JLabel.CENTER);
        details.setIconTextGap(15);
        details.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent e)
            {
                detailsclicked(e);
            }

            public void mouseEntered(java.awt.event.MouseEvent e)
            {
                detailsentered(e);
            }

            public void mouseExited(java.awt.event.MouseEvent e)
            {
                detailsexited(e);
            }
        });


        


        salary.setIcon(new ImageIcon("lib\\images\\salary.png"));
        salary.setFont(new Font("Roboto", Font.BOLD, 25));
        salary.setBounds(10, 240, 280,50);
        salary.setForeground(new Color(240, 240, 240));
        salary.setHorizontalTextPosition(JLabel.RIGHT);
        salary.setVerticalTextPosition(JLabel.CENTER);
        salary.setIconTextGap(18);
        salary.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent e)
            {
                salaryclicked(e);
            }

            public void mouseEntered(java.awt.event.MouseEvent e)
            {
                salaryentered(e);
            }

            public void mouseExited(java.awt.event.MouseEvent e)
            {
                salaryexited(e);
            }
        });


    
        //panel.setOpaque(false);
        //panel.setIcon(new ImageIcon("lib\\images\\employeeIcon.png"));


        leftPanel.add(employeeIcon);
        leftPanel.add(username);
        leftPanel.add(employee);
        
        leftPanel.add(logout);
        
        leftPanel.add(details);
        leftPanel.add(attendance);
        leftPanel.add(salary);
        


        rightpanel.setPreferredSize(new Dimension(1500, 1000));
        rightpanel.setBackground(new Color(206, 230, 243));
        rightpanel.setBounds(300,0,1500,1000);
        rightpanel.setLayout(null);


        menuBar.setPreferredSize(new Dimension(149, 40));
        menuBar.setBounds(0, 0, 1500, 40);
        menuBar.setBackground(Color.WHITE);
        menuBar.setLayout(null);

        // Defining close
        close.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
        close.setBounds(1460, 0, 40, 40);
        close.setOpaque(true);
        close.setBackground(Color.WHITE);
        close.setForeground(Color.RED);
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


        company.setIcon(new ImageIcon("lib\\images\\company_logo_40.png"));
        company.setText("VK TECH");
        company.setFont(new Font("Roboto", Font.BOLD,23));
        company.setVerticalTextPosition(JLabel.BOTTOM);
        //company.setForeground(new Color(6, 143, 255));
        company.setBounds(665, 0, 150, 40);
        company.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent e)
            {
                   //homeclicked(e);
            }
        });


        optionBar.setBounds(5, -2, 40, 40);
        optionBar.setBackground(null);
        optionBar.setBorder(null);
        optionBar.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent e)
            {
                optionBarclicked(e);
            }
        });

        homepage.setVisible(true);
        homepage.setEnabled(true);
        detailspage.setVisible(false);
        detailspage.setEnabled(false);
        salarypage.setVisible(false);
        salarypage.setEnabled(false);
        
        menuBar.add(close);
        menuBar.add(company);
        menuBar.add(optionBar);


        rightpanel.add(menuBar);
        rightpanel.add(homepage,0);
        rightpanel.add(detailspage,0);
        rightpanel.add(salarypage,0);
        
        frame.add(rightpanel);
        frame.add(leftPanel);
    }


    

    public void show()
    {
        frame.setVisible(true);
    }

    public void closeclicked(java.awt.event.MouseEvent e)
    {
        frame.dispose();
    }
    public void closeentered(java.awt.event.MouseEvent e)
    {
        close.setForeground(Color.BLACK);
        close.setBackground(Color.RED);
    }
    public void closeexited(java.awt.event.MouseEvent e)
    {
        close.setForeground(Color.RED);
        close.setBackground(Color.WHITE);
    }


    public void detailsclicked(java.awt.event.MouseEvent e)
    {
        
        details.setForeground(Color.BLACK);
        attendance.setForeground(new Color(240, 240, 240));
        salary.setForeground(new Color(240, 240, 240));

        
        detailspage.setVisible(true);
        detailspage.setEnabled(true);
        homepage.tabel.setVisible(false);
        homepage.tabel.setEnabled(false);
        homepage.heading.setText("Details");
        salarypage.setVisible(false);
        salarypage.setEnabled(false);
        
    }
    public void detailsentered(java.awt.event.MouseEvent e)
    {
        details.setBorder(BorderFactory.createRaisedBevelBorder());
    }
    public void detailsexited(java.awt.event.MouseEvent e)
    {
       details.setBorder(null);
    }

    public void logoutclicked(java.awt.event.MouseEvent e)
    {
        logout.setForeground(Color.BLACK);
        this.frame.dispose();
        new Login();
    }
    public void logoutentered(java.awt.event.MouseEvent e)
    {
        
        logout.setBorder(BorderFactory.createRaisedBevelBorder());
    }
    public void logoutexited(java.awt.event.MouseEvent e)
    {
        logout.setForeground(new Color(240,240,240));
        logout.setBorder(null);
    }

    public void attendanceclicked(java.awt.event.MouseEvent e)
    {
        details.setForeground(new Color(240, 240, 240));
        salary.setForeground(new Color(240, 240, 240));
        attendance.setForeground(Color.BLACK);

        homepage.tabel.setVisible(true);
        homepage.tabel.setEnabled(true);
        homepage.heading.setText("Attendance Tabel");
        detailspage.setVisible(false);
        detailspage.setEnabled(false);
        salarypage.setVisible(false);
        salarypage.setEnabled(false);

    }
    public void attendanceentered(java.awt.event.MouseEvent e)
    {
        attendance.setBorder(BorderFactory.createRaisedBevelBorder());
    }
    public void attendanceexited(java.awt.event.MouseEvent e)
    {
        attendance.setBorder(null);
    }


    public void salaryclicked(java.awt.event.MouseEvent e)
    {
        details.setForeground(new Color(240, 240, 240));
        attendance.setForeground(new Color(240, 240, 240));
        salary.setForeground(Color.BLACK);

        homepage.tabel.setVisible(false);
        homepage.tabel.setEnabled(false);
        homepage.heading.setText("Salary Tabel");
        detailspage.setVisible(false);
        detailspage.setEnabled(false);
        salarypage.setVisible(true);
        salarypage.setEnabled(true);


    }
    public void salaryentered(java.awt.event.MouseEvent e)
    {
        salary.setBorder(BorderFactory.createRaisedBevelBorder());
    }
    public void salaryexited(java.awt.event.MouseEvent e)
    {
        salary.setBorder(null);
    }



    public void optionBarclicked(java.awt.event.MouseEvent e)
    {
        Icon img = optionBar.getIcon();
        if(img.equals(menu))
        {
            optionBar.setIcon(rightarrow);

            //leftPanel.setBounds(0, 0, 65, 1000);
            //logout.setText(null);
        }

        if(img.equals(rightarrow))
        {
            optionBar.setIcon(menu);

            //leftPanel.setBounds(0, 0, 300, 1000);
        }

    }

    
    
    public static void main(String[] args) {
        new EmployeePage().show();
    }
   
    
}
