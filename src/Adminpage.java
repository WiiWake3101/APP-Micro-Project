import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



class Adminpage extends Admin_Employees
{
    JLabel close = new JLabel(" X ");
    JFrame  frame = new JFrame();
    JLabel logout = new JLabel("Logout");
    JLabel home = new JLabel("Home");//                     ");
    JLabel employees = new JLabel("Employees");
    JLabel salary = new JLabel("Salary");
    JPanel rightpanel = new JPanel();
    GradientPanel leftPanel = new GradientPanel(Color.decode("#004FF9"),Color.decode("#56CCF2"),0); 
    Admin_HomePage homepage_panel = new Admin_HomePage();
    Admin_Employees employees_panel = new Admin_Employees();
    Admin_Attendance attendance_panel = new Admin_Attendance();
    Admin_salary salary_panel = new Admin_salary();
    Icon menu = new ImageIcon("lib\\images\\optionbar.png");
    Icon rightarrow = new ImageIcon("lib\\images\\rightarrow.png");
    JLabel optionBar = new JLabel(menu);
    JLabel attendance = new JLabel("Attendance");
    

    Adminpage()
    {
        JPanel menuBar = new JPanel();
        close = new JLabel("X",JLabel.CENTER);
        JLabel company = new JLabel();
        
        ImageAvatar AdminIcon = new ImageAvatar();
        JLabel username = new JLabel("UserName");
        JLabel admin = new JLabel("Admin",JLabel.CENTER);

        
        
        

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // 
        frame.setSize(1800,1000); // frame size
        frame.setLocationRelativeTo(null);  // display frame in center of screen
        frame.setUndecorated(true);
        frame.setIconImage(new ImageIcon("lib\\images\\companylogo.png").getImage());
        frame.setLayout(null);




        leftPanel.setPreferredSize(new Dimension(300, 1000));
        leftPanel.setBounds(0, 0, 300, 1000);
        leftPanel.setLayout(null);


        
        AdminIcon.setBounds(5, 5, 55, 55);
        AdminIcon.setIcon(new ImageIcon("lib\\images\\Admin.jpeg"));

        username.setFont(new Font("Roboto", Font.BOLD, 17)); // Modify fonts
        username.setForeground(Color.BLACK); // Font color
        username.setBounds(80, 12, 100 , 15);

        admin.setFont(new Font("Roboto", Font.BOLD, 20)); // Modify fonts
        admin.setForeground(Color.WHITE); // Font color
        admin.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3, false));
        admin.setBounds(80, 29, 180 , 28);
        admin.setVerticalTextPosition(1);
        
        
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

    
        home.setIcon(new ImageIcon("lib\\images\\Home.png"));
        home.setFont(new Font("Roboto", Font.BOLD, 25));
        home.setBounds(10, 117, 280,50);
        home.setForeground(new Color(240, 240, 240));
        home.setHorizontalTextPosition(JLabel.RIGHT);
        home.setVerticalTextPosition(JLabel.CENTER);
        home.setIconTextGap(19);
        home.setForeground(Color.BLACK);
        home.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent e)
            {
                homeclicked(e);
            }

            public void mouseEntered(java.awt.event.MouseEvent e)
            {
                homeentered(e);
            }

            public void mouseExited(java.awt.event.MouseEvent e)
            {
                homeexited(e);
            }
        });
        

        employees.setIcon(new ImageIcon("lib\\images\\employees.png"));
        employees.setFont(new Font("Roboto", Font.BOLD, 25));
        employees.setBounds(10, 187, 280,50);
        employees.setForeground(new Color(240, 240, 240));
        employees.setHorizontalTextPosition(JLabel.RIGHT);
        employees.setVerticalTextPosition(JLabel.CENTER);
        employees.setIconTextGap(15);
        employees.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent e)
            {
                employeesclicked(e);
            }

            public void mouseEntered(java.awt.event.MouseEvent e)
            {
                employeesentered(e);
            }

            public void mouseExited(java.awt.event.MouseEvent e)
            {
                employeesexited(e);
            }
        });


        attendance.setIcon(new ImageIcon("lib\\images\\attendance.png"));
        attendance.setFont(new Font("Roboto", Font.BOLD, 25));
        attendance.setBounds(10, 257, 280,50);
        attendance.setForeground(new Color(240, 240, 240));
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


        salary.setIcon(new ImageIcon("lib\\images\\salary.png"));
        salary.setFont(new Font("Roboto", Font.BOLD, 25));
        salary.setBounds(10, 327, 280,50);
        salary.setForeground(new Color(240, 240, 240));
        salary.setHorizontalTextPosition(JLabel.RIGHT);
        salary.setVerticalTextPosition(JLabel.CENTER);
        salary.setIconTextGap(18);
        salary.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent e)
            {
                payrollclicked(e);
            }

            public void mouseEntered(java.awt.event.MouseEvent e)
            {
                payrollentered(e);
            }

            public void mouseExited(java.awt.event.MouseEvent e)
            {
                payrollexited(e);
            }
        });


    
        //panel.setOpaque(false);
        //panel.setIcon(new ImageIcon("lib\\images\\AdminIcon.png"));


        leftPanel.add(AdminIcon);
        leftPanel.add(username);
        leftPanel.add(admin);
        
        leftPanel.add(logout);
        leftPanel.add(home);
        leftPanel.add(employees);
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
                   homeclicked(e);
            }
        });

        employees_panel.setVisible(false);
        employees_panel.setEnabled(false);
        homepage_panel.setVisible(true);
        homepage_panel.setEnabled(true);
        attendance_panel.setVisible(true);
        attendance_panel.setEnabled(true);
        
        

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
        
        menuBar.add(close);
        menuBar.add(company);
        menuBar.add(optionBar);


        rightpanel.add(menuBar);
        rightpanel.add(homepage_panel,0);
        rightpanel.add(employees_panel,1);
        rightpanel.add(attendance_panel,1);
        rightpanel.add(salary_panel,1);
        
        frame.add(rightpanel);
        frame.add(leftPanel);
        //frame.setVisible(false);
        //frame.setVisible(true);
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


    public void homeclicked(java.awt.event.MouseEvent e)
    {
        employees.setForeground(new Color(240, 240, 240));
        attendance.setForeground(new Color(240, 240, 240));
        logout.setForeground(new Color(240, 240, 240));
        salary.setForeground(new Color(240, 240, 240));
        home.setForeground(Color.BLACK);
        homepage_panel.setVisible(true);
        homepage_panel.setEnabled(true);
        employees_panel.setVisible(false);
        employees_panel.setEnabled(false);
        attendance_panel.setVisible(false);
        attendance_panel.setEnabled(false);
        salary_panel.setVisible(false);
        salary_panel.setEnabled(false);
        
    }
    public void homeentered(java.awt.event.MouseEvent e)
    {
        home.setBorder(BorderFactory.createRaisedBevelBorder());
    }
    public void homeexited(java.awt.event.MouseEvent e)
    {
        home.setBorder(null);
    }

    public void employeesclicked(java.awt.event.MouseEvent e)
    {
        
        employees.setForeground(Color.BLACK);
        home.setForeground(new Color(240, 240, 240));
        attendance.setForeground(new Color(240, 240, 240));
        salary.setForeground(new Color(240, 240, 240));
        homepage_panel.setVisible(false);
        homepage_panel.setEnabled(false);
        attendance_panel.setVisible(false);
        attendance_panel.setEnabled(false);
        employees_panel.setVisible(true);
        employees_panel.setEnabled(true);
        salary_panel.setVisible(false);
        salary_panel.setEnabled(false);

        employees_panel.heading.setText("Employee Table");
        employees_panel.emp_tabel.setVisible(true);
        employees_panel.add_emp.setVisible(false);
        employees_panel.add_emp.FirstName_textfield.setText(null);
        employees_panel.add_emp.email_textfield.setText(null);
        employees_panel.add_emp.phone_number_textfield.setText(null);
        employees_panel.add_emp.address1_textfield.setText(null);
        employees_panel.add_emp.state_textfield.setText(null);
        employees_panel.add_emp.LastName_textfield.setText(null);
        employees_panel.add_emp.date_of_birth.setDate(null);;
        employees_panel.add_emp.alternative_email_textfield.setText(null);
        employees_panel.add_emp.alternative_phone_number_textfield.setText(null);
        employees_panel.add_emp.address2_textfield.setText(null);
        employees_panel.add_emp.district_textfield.setText(null);
        employees_panel.add_emp.designation_textfield.setText(null);
        employees_panel.add_emp.job_title_Combobox.setSelectedIndex(0);
        employees_panel.add_emp.department_textfield.setText(null);
        employees_panel.add_emp.status_textfield.setText(null);
        employees_panel.add_emp.date_hired.setDate(null);;
        employees_panel.add_emp.department_textfield.setText(null);
        employees_panel.add_emp.salary_textfield.setText(null);


        employees_panel.edit_emp.setVisible(false);

        
        employees_panel.search_emp.sortby_ComboBox.setEnabled(false);
        employees_panel.search_emp.sortby_ComboBox.setVisible(false);
        employees_panel.search_emp.search_button.setEnabled(false);
        employees_panel.search_emp.search_button.setVisible(false);
        employees_panel.search_emp.table.setEnabled(false);
        employees_panel.search_emp.table.setVisible(false);
        employees_panel.search_emp.search_textfield.setVisible(false);
        employees_panel.search_emp.search_textfield.setEnabled(false);


        

    }
    public void employeesentered(java.awt.event.MouseEvent e)
    {
        employees.setBorder(BorderFactory.createRaisedBevelBorder());
    }
    public void employeesexited(java.awt.event.MouseEvent e)
    {
       employees.setBorder(null);
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
        employees.setForeground(new Color(240, 240, 240));
        home.setForeground(new Color(240, 240, 240));
        salary.setForeground(new Color(240, 240, 240));
        attendance.setForeground(Color.BLACK);


        homepage_panel.setVisible(false);
        homepage_panel.setEnabled(false);
        employees_panel.setVisible(false);
        employees_panel.setEnabled(false);
        attendance_panel.setVisible(true);
        attendance_panel.setEnabled(true);
        salary_panel.setVisible(false);
        salary_panel.setEnabled(false);
        attendance_panel.search_id_textfield.setVisible(true);
        attendance_panel.search_id_textfield.setEnabled(true);
        attendance_panel.search_id_button.setVisible(true);
        attendance_panel.search_id_button.setEnabled(true);
        attendance_panel.sort_DateChooser.setVisible(true);
        attendance_panel.sort_DateChooser.setEnabled(true);
        attendance_panel.sort_button.setVisible(true);
        attendance_panel.sort_button.setEnabled(true);
        attendance_panel.search_name_button.setVisible(true);
        attendance_panel.search_name_button.setEnabled(true);
        attendance_panel.search_name_textfield.setVisible(true);
        attendance_panel.search_name_textfield.setEnabled(true);
        attendance_panel.table.setVisible(true);
        attendance_panel.table.setEnabled(true);
    }
    public void attendanceentered(java.awt.event.MouseEvent e)
    {
        attendance.setBorder(BorderFactory.createRaisedBevelBorder());
    }
    public void attendanceexited(java.awt.event.MouseEvent e)
    {
        attendance.setBorder(null);
    }


    public void payrollclicked(java.awt.event.MouseEvent e)
    {
        employees.setForeground(new Color(240, 240, 240));
        home.setForeground(new Color(240, 240, 240));
        attendance.setForeground(new Color(240, 240, 240));
        salary.setForeground(Color.BLACK);


        homepage_panel.setVisible(false);
        homepage_panel.setEnabled(false);
        employees_panel.setVisible(false);
        employees_panel.setEnabled(false);
        attendance_panel.setVisible(false);
        attendance_panel.setEnabled(false);
        salary_panel.setVisible(true);
        salary_panel.setEnabled(true);

        salary_panel.heading.setText("Salary Tabel");
        salary_panel.salary_table.setVisible(true);
        salary_panel.salary_table.setEnabled(true);
        salary_panel.allowance.setVisible(false);
        salary_panel.allowance.setVisible(true);
        salary_panel.allowance.search_textfield.setVisible(false);
        salary_panel.allowance.search_textfield.setEnabled(false);
        salary_panel.allowance.search_button.setVisible(false);
        salary_panel.allowance.search_button.setEnabled(false);
        salary_panel.allowance.FirstName_textfield.setVisible(false);
        salary_panel.allowance.FirstName_textfield.setEnabled(false);
        salary_panel.allowance.LastName_textfield.setVisible(false);
        salary_panel.allowance.LastName_textfield.setEnabled(false);
        salary_panel.allowance.date_of_birth_textfield.setVisible(false);
        salary_panel.allowance.date_of_birth_textfield.setEnabled(false);
        salary_panel.allowance.department_textfield.setVisible(false);
        salary_panel.allowance.department_textfield.setEnabled(false);
        salary_panel.allowance.monthly_salary_textfield.setVisible(false);
        salary_panel.allowance.monthly_salary_textfield.setEnabled(false);
        salary_panel.allowance.overtime_textfield.setVisible(false);
        salary_panel.allowance.overtime_textfield.setEnabled(false);
        salary_panel.allowance.bonus_textfield.setVisible(false);
        salary_panel.allowance.bonus_textfield.setEnabled(false);
        salary_panel.allowance.others_textfield.setVisible(false);
        salary_panel.allowance.others_textfield.setEnabled(false);
        salary_panel.allowance.hourly_salary_textfield.setVisible(false);
        salary_panel.allowance.hourly_salary_textfield.setEnabled(false);
        salary_panel.allowance.Total_Allowance_textfield.setVisible(false);
        salary_panel.allowance.Total_Allowance_textfield.setEnabled(false);
        salary_panel.allowance.Calculate.setVisible(false);
        salary_panel.allowance.Calculate.setEnabled(false);
        salary_panel.allowance.Save.setVisible(false);
        salary_panel.allowance.Save.setEnabled(false);
        salary_panel.allowance.Clear.setVisible(false);
        salary_panel.allowance.Clear.setEnabled(false);

        salary_panel.deduction.search_textfield.setVisible(false);
        salary_panel.deduction.search_textfield.setEnabled(false);
        salary_panel.deduction.search_button.setVisible(false);
        salary_panel.deduction.search_button.setEnabled(false);
        salary_panel.deduction.FirstName_textfield.setVisible(false);
        salary_panel.deduction.FirstName_textfield.setEnabled(false);
        salary_panel.deduction.LastName_textfield.setVisible(false);
        salary_panel.deduction.LastName_textfield.setEnabled(false);
        salary_panel.deduction.date_of_birth_textfield.setVisible(false);
        salary_panel.deduction.date_of_birth_textfield.setEnabled(false);
        salary_panel.deduction.department_textfield.setVisible(false);
        salary_panel.deduction.department_textfield.setEnabled(false);
        salary_panel.deduction.monthly_salary_textfield.setVisible(false);
        salary_panel.deduction.monthly_salary_textfield.setEnabled(false);
        salary_panel.deduction.Tax_textfield.setVisible(false);
        salary_panel.deduction.Tax_textfield.setEnabled(false);
        salary_panel.deduction.security_medicine_textfield.setVisible(false);
        salary_panel.deduction.security_medicine_textfield.setEnabled(false);
        salary_panel.deduction.others_textfield.setVisible(false);
        salary_panel.deduction.others_textfield.setEnabled(false);
        salary_panel.deduction.hourly_salary_textfield.setVisible(false);
        salary_panel.deduction.hourly_salary_textfield.setEnabled(false);
        salary_panel.deduction.Total_Deduction_textfield.setVisible(false);
        salary_panel.deduction.Total_Deduction_textfield.setEnabled(false);
        salary_panel.deduction.Calculate.setVisible(false);
        salary_panel.deduction.Calculate.setEnabled(false);
        salary_panel.deduction.Save.setVisible(false);
        salary_panel.deduction.Save.setEnabled(false);
        salary_panel.deduction.Clear.setVisible(false);
        salary_panel.deduction.Clear.setEnabled(false);

        salary_panel.update.employeeID.setVisible(false);
        salary_panel.update.employeeID.setEnabled(false);
        salary_panel.update.search_textfield.setVisible(false);
        salary_panel.update.search_textfield.setEnabled(false);
        salary_panel.update.search_button.setVisible(false);
        salary_panel.update.search_button.setEnabled(false);
        salary_panel.update.FirstName_textfield.setVisible(false);
        salary_panel.update.FirstName_textfield.setEnabled(false);
        salary_panel.update.LastName_textfield.setVisible(false);
        salary_panel.update.LastName_textfield.setEnabled(false);
        salary_panel.update.date_of_birth_textfield.setVisible(false);
        salary_panel.update.date_of_birth_textfield.setEnabled(false);
        salary_panel.update.department_textfield.setVisible(false);
        salary_panel.update.department_textfield.setEnabled(false);
        salary_panel.update.job_title_textfield.setVisible(false);
        salary_panel.update.job_title_textfield.setEnabled(false);
        salary_panel.update.monthly_salary_textfield.setVisible(false);
        salary_panel.update.monthly_salary_textfield.setEnabled(false);
        salary_panel.update.hourly_salary_textfield.setVisible(false);
        salary_panel.update.hourly_salary_textfield.setEnabled(false);
        salary_panel.update.Save.setVisible(false);
        salary_panel.update.Save.setEnabled(false);
        salary_panel.update.Clear.setVisible(false);
        salary_panel.update.Clear.setEnabled(false);

        
        salary_panel.payroll.search_textfield.setVisible(false);
        salary_panel.payroll.search_textfield.setEnabled(false);
        salary_panel.payroll.search_button.setVisible(false);
        salary_panel.payroll.search_button.setEnabled(false);
        salary_panel.payroll.FirstName_textfield.setVisible(false);
        salary_panel.payroll.FirstName_textfield.setEnabled(false);
        salary_panel.payroll.LastName_textfield.setVisible(false);
        salary_panel.payroll.LastName_textfield.setEnabled(false);
        salary_panel.payroll.date_of_birth_textfield.setVisible(false);
        salary_panel.payroll.date_of_birth_textfield.setEnabled(false);
        salary_panel.payroll.department_textfield.setVisible(false);
        salary_panel.payroll.department_textfield.setEnabled(false);
        salary_panel.payroll.job_title_textfield.setVisible(false);
        salary_panel.payroll.job_title_textfield.setEnabled(false);
        salary_panel.payroll.hours_worked_textfield.setVisible(false);
        salary_panel.payroll.hours_worked_textfield.setEnabled(false);
        salary_panel.payroll.hourly_salary_textfield.setVisible(false);
        salary_panel.payroll.hourly_salary_textfield.setEnabled(false);
        salary_panel.payroll.tot_allowance_textfield.setVisible(false);
        salary_panel.payroll.tot_allowance_textfield.setEnabled(false);
        salary_panel.payroll.tot_deduction_textfield.setVisible(false);
        salary_panel.payroll.tot_deduction_textfield.setEnabled(false);
        salary_panel.payroll.Basic_salary_textfield.setVisible(false);
        salary_panel.payroll.Basic_salary_textfield.setEnabled(false);
        salary_panel.payroll.After_allowance_and_deduction_textfield.setVisible(false);
        salary_panel.payroll.After_allowance_and_deduction_textfield.setEnabled(false);
        salary_panel.payroll.Final_salary_textfield.setVisible(false);
        salary_panel.payroll.Final_salary_textfield.setEnabled(false);
        salary_panel.payroll.ok.setVisible(false);
        salary_panel.payroll.ok.setEnabled(false);
        salary_panel.payroll.print_Button.setVisible(false);
        salary_panel.payroll.print_Button.setEnabled(false);
        

    }
    public void payrollentered(java.awt.event.MouseEvent e)
    {
        salary.setBorder(BorderFactory.createRaisedBevelBorder());
    }
    public void payrollexited(java.awt.event.MouseEvent e)
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
        new Adminpage().show();
    }
   
    
}
