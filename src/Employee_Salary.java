import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


class Employee_Salary extends JPanel implements ActionListener {

    JPanel search_panel = new JPanel();
    JLabel search_label = new JLabel("Employee ID  ");
    JTextField search_textfield = new JTextField();
    JLabel collan = new JLabel(":");

    JPanel dispalyPanel = new JPanel();
    JLabel employee_detail_label = new JLabel("Employee Details");
    JLabel FirstName_label = new JLabel("First Name");
    JTextField FirstName_textfield = new JTextField();
    JLabel LastName_label = new JLabel("Last Name");
    JTextField LastName_textfield = new JTextField();
    JLabel date_of_birth_label = new JLabel("Date of Birth");    
    JTextField date_of_birth_textfield = new JTextField();
    JLabel department_label = new JLabel("Department");
    JTextField department_textfield = new JTextField();
    JLabel job_title_label = new JLabel("Job Title");
    JTextField job_title_textfield = new JTextField();

    JLabel Salary_title = new JLabel("Salary Detail");
    JLabel hours_worked_label = new JLabel("Worked Hours");
    JTextField hours_worked_textfield = new JTextField();
    JLabel hourly_salary_label = new JLabel("Hourly Salary");
    JTextField hourly_salary_textfield = new JTextField();
    JLabel tot_allowance_label = new JLabel("Allowance Amount");    
    JTextField tot_allowance_textfield = new JTextField();
    JLabel tot_deduction_label = new JLabel("Deduction Amount");
    JTextField tot_deduction_textfield = new JTextField();

    JLabel Calculation_title = new JLabel("Calculation Details");
    JLabel Basic_salary_label = new JLabel("Basic Salary");
    JTextField Basic_salary_textfield = new JTextField();
    JLabel After_allowance_and_deduction_label = new JLabel("Salary After Allowance And Deduction");
    JTextField After_allowance_and_deduction_textfield = new JTextField();
    
    
    JLabel Salary_amount_title = new JLabel("Final Salary");
    JLabel Final_salary_label = new JLabel("Salary Amount");
    JTextField Final_salary_textfield = new JTextField();

    
    GradientButton print_Button = new GradientButton(Color.decode("#004FF9"),Color.decode("#56CCF2"));


    Employee_Salary() {
        setBounds(22, 370, 1458, 600);
        setBackground(new Color(206, 230, 243));
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        setLayout(null);

        search_panel.setBounds(0, 0, 1458, 60);
        search_panel.setBackground(new Color(206, 230, 243));
        search_panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        search_panel.setLayout(null);
        

        search_label.setFont(new Font("Roboto", Font.BOLD, 25));
        search_label.setForeground(Color.BLACK);
        search_label.setBounds(20, 12, 200, 30);


        collan.setFont(new Font("Roboto", Font.BOLD, 40));
        collan.setForeground(Color.BLACK);
        collan.setBounds(200, 5, 20, 40);

        

        search_textfield.setBounds(250, 12, 500, 35);
        search_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        search_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        search_textfield.setForeground(Color.BLUE);
        search_textfield.setEditable(false);
        

        search_panel.add(search_label);
        search_panel.add(collan);
        search_panel.add(search_textfield);

        

        dispalyPanel.setBounds(5,60,1448,535);
        dispalyPanel.setBackground(new Color(206, 230, 243));
        dispalyPanel.setLayout(null);
        
        employee_detail_label.setFont(new Font("Roboto", Font.BOLD, 30)); 
        employee_detail_label.setForeground(new Color(6, 143, 255));
        employee_detail_label.setBounds(40, 40, 250, 35);

        FirstName_label.setFont(new Font("Roboto", Font.BOLD, 20)); 
        FirstName_label.setForeground(Color.BLACK);
        FirstName_label.setBounds(40, 100, 150, 20); 

        FirstName_textfield.setBounds(40, 121, 400, 35);
        FirstName_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        FirstName_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        FirstName_textfield.setForeground(Color.BLUE);
        FirstName_textfield.setEditable(false);

        LastName_label.setFont(new Font("Roboto", Font.BOLD, 20)); 
        LastName_label.setForeground(Color.BLACK);
        LastName_label.setBounds(40, 180, 150, 20); 

        LastName_textfield.setBounds(40, 201, 400, 35);
        LastName_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        LastName_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        LastName_textfield.setForeground(Color.BLUE);
        LastName_textfield.setEditable(false);


        date_of_birth_label.setFont(new Font("Roboto", Font.BOLD, 20));
        date_of_birth_label.setBounds(40, 260, 150, 20);
        date_of_birth_label.setForeground(Color.BLACK);
    
        date_of_birth_textfield.setBounds(40, 281, 400,35);
        date_of_birth_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        date_of_birth_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        date_of_birth_textfield.setForeground(Color.BLUE);
        date_of_birth_textfield.setEditable(false);

        department_label.setFont(new Font("Roboto", Font.BOLD, 20)); 
        department_label.setForeground(Color.BLACK);
        department_label.setBounds(40, 340, 150, 20); //350

        department_textfield.setBounds(40, 361, 400, 35);//371
        department_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        department_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        department_textfield.setForeground(Color.BLUE);
        department_textfield.setEditable(false);

        
        job_title_label.setFont(new Font("Roboto", Font.BOLD, 20)); 
        job_title_label.setForeground(Color.BLACK);
        job_title_label.setBounds(40, 420, 150, 20); 

        job_title_textfield.setBounds(40, 441, 400, 35);
        job_title_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        job_title_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        job_title_textfield.setForeground(Color.BLUE);
        job_title_textfield.setEditable(false);


        Salary_title.setFont(new Font("Roboto", Font.BOLD, 30)); 
        Salary_title.setForeground(new Color(6, 143, 255));
        Salary_title.setBounds(500, 40, 250, 30);


        hours_worked_label.setFont(new Font("Roboto", Font.BOLD, 20)); 
        hours_worked_label.setForeground(Color.BLACK);
        hours_worked_label.setBounds(500, 100, 160, 20); 

        hours_worked_textfield.setBounds(500, 121, 400, 35);
        hours_worked_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        hours_worked_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        hours_worked_textfield.setForeground(Color.BLUE);
        hours_worked_textfield.setEditable(false);

        hourly_salary_label.setFont(new Font("Roboto", Font.BOLD, 20)); 
        hourly_salary_label.setForeground(Color.BLACK);
        hourly_salary_label.setBounds(500, 180, 150, 20); 

        hourly_salary_textfield.setBounds(500, 201, 400, 35);
        hourly_salary_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        hourly_salary_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        hourly_salary_textfield.setForeground(Color.BLUE);
        hourly_salary_textfield.setEditable(false);


        tot_allowance_label.setFont(new Font("Roboto", Font.BOLD, 20));
        tot_allowance_label.setBounds(500, 260, 200, 20);
        tot_allowance_label.setForeground(Color.BLACK);
    
        tot_allowance_textfield.setBounds(500, 281, 400,35);
        tot_allowance_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        tot_allowance_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        tot_allowance_textfield.setForeground(Color.BLUE);
        tot_allowance_textfield.setEditable(false);

        tot_deduction_label.setFont(new Font("Roboto", Font.BOLD, 20)); 
        tot_deduction_label.setForeground(Color.BLACK);
        tot_deduction_label.setBounds(500, 340, 200, 20); //350

        tot_deduction_textfield.setBounds(500, 361, 400, 35);//371
        tot_deduction_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        tot_deduction_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        tot_deduction_textfield.setForeground(Color.BLUE);
        tot_deduction_textfield.setEditable(false);


        Calculation_title.setFont(new Font("Roboto", Font.BOLD, 30)); 
        Calculation_title.setForeground(new Color(6, 143, 255));
        Calculation_title.setBounds(1000, 40, 350, 30);

        Basic_salary_label.setFont(new Font("Roboto", Font.BOLD, 20)); 
        Basic_salary_label.setForeground(Color.BLACK);
        Basic_salary_label.setBounds(1000, 100, 160, 20); 

        Basic_salary_textfield.setBounds(1000, 121, 400, 35);
        Basic_salary_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        Basic_salary_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        Basic_salary_textfield.setForeground(Color.BLUE);
        Basic_salary_textfield.setEditable(false);

        After_allowance_and_deduction_label.setFont(new Font("Roboto", Font.BOLD, 20)); 
        After_allowance_and_deduction_label.setForeground(Color.BLACK);
        After_allowance_and_deduction_label.setBounds(1000, 180, 400, 20); 

        After_allowance_and_deduction_textfield.setBounds(1000, 201, 400, 35);
        After_allowance_and_deduction_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        After_allowance_and_deduction_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        After_allowance_and_deduction_textfield.setForeground(Color.BLUE);
        After_allowance_and_deduction_textfield.setEditable(false);


        
        Salary_amount_title.setFont(new Font("Roboto", Font.BOLD, 35)); 
        Salary_amount_title.setForeground(new Color(6, 143, 255));
        Salary_amount_title.setBounds(1000, 280, 350, 40);
        
        
        Final_salary_label.setFont(new Font("Roboto", Font.BOLD, 25)); 
        Final_salary_label.setForeground(Color.BLACK);
        Final_salary_label.setBounds(1000, 330, 250, 30); 

        Final_salary_textfield.setBounds(1000, 361, 400, 35);
        Final_salary_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        Final_salary_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        Final_salary_textfield.setForeground(Color.BLUE);
        Final_salary_textfield.setEditable(false);



        print_Button.setBounds(1250 ,440, 150, 40);
        print_Button.setBorder(BorderFactory.createEmptyBorder());
        print_Button.setText("Print");
        print_Button.setFont(new Font("Roboto", Font.BOLD, 25));
        print_Button.setForeground(new Color(240,240, 240));
        print_Button.setFocusable(false);
        print_Button.addActionListener(this);



        dispalyPanel.add(employee_detail_label);
        dispalyPanel.add(FirstName_label);
        dispalyPanel.add(FirstName_textfield);
        dispalyPanel.add(LastName_label);
        dispalyPanel.add(LastName_textfield);
        dispalyPanel.add(date_of_birth_label);
        dispalyPanel.add(date_of_birth_textfield);
        dispalyPanel.add(department_label);
        dispalyPanel.add(department_textfield);
        dispalyPanel.add(job_title_label);
        dispalyPanel.add(job_title_textfield);

        dispalyPanel.add(Salary_title);
        dispalyPanel.add(hours_worked_label);
        dispalyPanel.add(hours_worked_textfield);
        dispalyPanel.add(hourly_salary_label);
        dispalyPanel.add(hourly_salary_textfield);
        dispalyPanel.add(tot_allowance_label);
        dispalyPanel.add(tot_allowance_textfield);
        dispalyPanel.add(tot_deduction_label);
        dispalyPanel.add(tot_deduction_textfield);

        dispalyPanel.add(Calculation_title);
        dispalyPanel.add(Basic_salary_label);
        dispalyPanel.add(Basic_salary_textfield);
        dispalyPanel.add(After_allowance_and_deduction_label);
        dispalyPanel.add(After_allowance_and_deduction_textfield);
        

        dispalyPanel.add(Salary_amount_title);
        dispalyPanel.add(Final_salary_label);
        dispalyPanel.add(Final_salary_textfield);

        
        dispalyPanel.add(print_Button);



        add(search_panel);
        add(dispalyPanel);
        

    }

    class MessagePanel implements ActionListener
    {
        JFrame frame = new JFrame();
        GradientPanel message_panel = new GradientPanel(new Color(245,245,245),new Color(245,245,245),30);
        GradientButton ok = new GradientButton(Color.decode("#004FF9"),Color.decode("#56CCF2"));
        //GradientButton cancel = new GradientButton(Color.decode("#004FF9"),Color.decode("#56C56CCF2CF2"));
    
        JLabel heading = new JLabel();
        JLabel content = new JLabel();
        
        MessagePanel(String h,String c1)
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

        
        public void  actionPerformed(java.awt.event.ActionEvent e)
        {

            if(e.getSource() == ok)
            {
                
                frame.dispose();
                
            }
        }
    }

    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == print_Button)
        {
            String employeeID,firstname,lastname,dob,jobtitle,w_h,h_s,a_a,d_a,b_s,g_s,n_s;
            employeeID = search_textfield.getText();
            firstname = FirstName_textfield.getText();
            lastname = LastName_textfield.getText();
            dob = date_of_birth_textfield.getSelectedText();
            jobtitle =job_title_textfield.getText();
            w_h = hours_worked_textfield.getText();
            h_s = hourly_salary_textfield.getText();
            a_a = tot_allowance_textfield.getText();
            d_a = tot_deduction_textfield.getText();
            b_s = Basic_salary_textfield.getText();
            g_s = After_allowance_and_deduction_textfield.getText();
            n_s = Final_salary_textfield.getText();

            new Admin_pdf(employeeID,firstname,lastname,dob,jobtitle,w_h,h_s,a_a,d_a,b_s,g_s,n_s);
            new MessagePanel("Payroll","Sucessfully PDF Created");
        }
    }
    
    
    
}//Admin_payroll
