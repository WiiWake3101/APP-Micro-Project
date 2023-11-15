import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Admin_salary extends JPanel
{
    JLabel title = new JLabel("Payroll");
    JPanel mainPanel = new JPanel();
    JPanel headingpanel = new JPanel();

    GradientPanel allowance_panel = new GradientPanel(Color.decode("#000000"), Color.decode("#004ff9"), 50);
    JLabel allowance_salary = new JLabel("Salary");
    JLabel allowance_icon = new JLabel();
    JLabel allowance_employee = new JLabel("Allowance");

    GradientPanel deduction_panel = new GradientPanel(Color.decode("#0c0014"), Color.decode("#0779E4"), 50);
    JLabel deduction_icon = new JLabel();
    JLabel deduction_salary = new JLabel("Salary");
    JLabel deduction_employee = new JLabel("Deduction");

    GradientPanel update_salary_panel = new GradientPanel(Color.decode("#000046"), Color.decode("#1CB5E0"), 50);
    JLabel update_salaryicon = new JLabel();
    JLabel update_salary = new JLabel("Salary");
    JLabel update_salary_employee = new JLabel("Update");

    GradientPanel payroll_panel = new GradientPanel(Color.decode("#1A2980"), Color.decode("#26D0CE"), 50);
    JLabel payrollicon = new JLabel();
    JLabel payroll_salary = new JLabel("System");
    JLabel payroll_employee = new JLabel("Payroll");

    JLabel heading = new JLabel("Salary Table");
    Admin_Employee_Salary_Table salary_table = new Admin_Employee_Salary_Table();
    Admin_allowance allowance = new Admin_allowance();
    Admin_deduction deduction = new Admin_deduction();
    Admin_Salary_update update = new Admin_Salary_update();
    Admin_payroll payroll = new Admin_payroll();
    

    Admin_salary()
    {
        setBackground(new Color(206, 230, 243)); // )new Color(206, 230, 243)
        setBounds(10, 50, 1480, 940);
        setLayout(null);

        

        title.setFont(new Font("Roboto", Font.BOLD, 30));
        title.setForeground(new Color(6, 143, 255));
        title.setBounds(8, 0, 150, 40);

        mainPanel.setBounds(8, 40, 1462, 200);
        mainPanel.setBackground(new Color(206, 230, 243));// new Color(240, 240, 240)
        mainPanel.setLayout(null);

        // allowance_panel.setBackground(Color.decode("#e1ad01"));
        allowance_panel.setBounds(10, 10, 345, 180);
        allowance_panel.setLayout(null);
        allowance_icon.setIcon(new ImageIcon("lib\\images\\allowance.png"));
        allowance_icon.setBounds(210, 40, 100, 100);

        allowance_employee.setFont(new Font("Roboto", Font.BOLD, 30));
        allowance_employee.setForeground(new Color(240, 240, 240));
        allowance_employee.setBounds(40, 60, 200, 30);

        allowance_salary.setFont(new Font("Roboto", Font.BOLD, 30));
        allowance_salary.setForeground(new Color(240, 240, 240));
        allowance_salary.setBounds(40, 80, 100, 50);

        allowance_panel.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent e)
            {
                allowanceclicked(e);
            }
        });


        

        allowance_panel.add(allowance_icon);
        allowance_panel.add(allowance_salary);
        allowance_panel.add(allowance_employee);


        // add.setBackground(Color.decode("#d8bcab"))

        deduction_panel.setBounds(376, 10, 345, 180);
        deduction_panel.setLayout(null);
        deduction_icon.setIcon(new ImageIcon("lib\\images\\deduction.png"));
        deduction_icon.setBounds(210, 40, 100, 100);

        deduction_employee.setFont(new Font("Roboto", Font.BOLD, 30));
        deduction_employee.setForeground(new Color(240, 240, 240));
        deduction_employee.setBounds(40, 60, 200, 30);

        deduction_salary.setFont(new Font("Roboto", Font.BOLD, 30));
        deduction_salary.setForeground(new Color(240, 240, 240));
        deduction_salary.setBounds(40, 80, 100, 50);

        deduction_panel.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent e)
            {
                deductionclicked(e);
            }
        });

        deduction_panel.add(deduction_icon);
        deduction_panel.add(deduction_employee);
        deduction_panel.add(deduction_salary);

        // update_salary_panel.setBackground(Color.decode("#950714"));
        update_salary_panel.setBounds(742, 10, 345, 180);
        update_salary_panel.setLayout(null);
        update_salaryicon.setIcon(new ImageIcon("lib\\images\\update.png"));
        update_salaryicon.setBounds(210, 40, 100, 100);
        
        update_salary_employee.setFont(new Font("Roboto", Font.BOLD, 30));
        update_salary_employee.setForeground(new Color(240, 240, 240));
        update_salary_employee.setBounds(40, 60, 200, 30);

        update_salary.setFont(new Font("Roboto", Font.BOLD, 30));
        update_salary.setForeground(new Color(240, 240, 240));
        update_salary.setBounds(40, 80, 100, 50);

        update_salary_panel.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent e)
            {
                updateclicked(e);
            }
        });

        update_salary_panel.add(update_salaryicon);
        update_salary_panel.add(update_salary_employee);
        update_salary_panel.add(update_salary);

        // payroll_panel.setBackground(Color.decode("#F78CA2"));
        payroll_panel.setBounds(1107, 10, 345, 180);
        payroll_panel.setLayout(null);
        payrollicon.setIcon(new ImageIcon("lib\\images\\payment.png"));
        payrollicon.setBounds(210, 40, 100, 100);

        payroll_employee.setFont(new Font("Roboto", Font.BOLD, 30));
        payroll_employee.setForeground(new Color(240, 240, 240));
        payroll_employee.setBounds(40, 60, 200, 30);

        payroll_salary.setFont(new Font("Roboto", Font.BOLD, 30));
        payroll_salary.setForeground(new Color(240, 240, 240));
        payroll_salary.setBounds(40, 80, 150, 50);

        payroll_panel.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent e)
            {
                payrollclicked(e);
            }
        });

        payroll_panel.add(payrollicon);
        payroll_panel.add(payroll_employee);
        payroll_panel.add(payroll_salary);

        mainPanel.add(allowance_panel);
        mainPanel.add(deduction_panel);
        mainPanel.add(update_salary_panel);
        mainPanel.add(payroll_panel);

        headingpanel.setBounds(12, 260, 1458,50);
        headingpanel.setBackground(new Color(206, 230, 243));
        headingpanel.setLayout(null);

        heading.setBounds(0,0,600,40);
        heading.setFont(new Font("Roboto", Font.BOLD, 30));
        heading.setForeground(new Color(6, 143, 255));

        headingpanel.add(heading);



        salary_table.setVisible(true);
        salary_table.setEnabled(true);
        allowance.setVisible(false);
        allowance.setEnabled(false);
        deduction.setVisible(false);
        deduction.setEnabled(false);
        update.setVisible(false);
        update.setEnabled(false);
        payroll.setVisible(false);
        payroll.setEnabled(false);


        add(salary_table,0);
        add(allowance,1);
        add(deduction,1);
        add(update,1);
        add(payroll,1);



        add(title);
        add(mainPanel);
        add(headingpanel);

    }

    public void allowanceclicked(java.awt.event.MouseEvent e)
    {
        heading.setText("Allownace");
        salary_table.setVisible(false);
        salary_table.setEnabled(false);
        allowance.setVisible(true);
        allowance.setEnabled(true);
        deduction.setVisible(false);
        deduction.setEnabled(false);
        update.setVisible(false);
        update.setEnabled(false);
        payroll.setVisible(false);
        payroll.setEnabled(false);

        allowance.search_textfield.setVisible(true);
        allowance.search_textfield.setEnabled(true);
        allowance.search_button.setVisible(true);
        allowance.search_button.setEnabled(true);
        allowance.FirstName_textfield.setVisible(true);
        allowance.FirstName_textfield.setEnabled(true);
        allowance.LastName_textfield.setVisible(true);
        allowance.LastName_textfield.setEnabled(true);
        allowance.date_of_birth_textfield.setVisible(true);
        allowance.date_of_birth_textfield.setEnabled(true);
        allowance.department_textfield.setVisible(true);
        allowance.department_textfield.setEnabled(true);
        allowance.monthly_salary_textfield.setVisible(true);
        allowance.monthly_salary_textfield.setEnabled(true);
        allowance.overtime_textfield.setVisible(true);
        allowance.overtime_textfield.setEnabled(true);
        allowance.bonus_textfield.setVisible(true);
        allowance.bonus_textfield.setEnabled(true);
        allowance.others_textfield.setVisible(true);
        allowance.others_textfield.setEnabled(true);
        allowance.hourly_salary_textfield.setVisible(true);
        allowance.hourly_salary_textfield.setEnabled(true);
        allowance.Total_Allowance_textfield.setVisible(true);
        allowance.Total_Allowance_textfield.setEnabled(true);
        allowance.Calculate.setVisible(true);
        allowance.Calculate.setEnabled(true);
        allowance.Save.setVisible(true);
        allowance.Save.setEnabled(true);
        allowance.Clear.setVisible(true);
        allowance.Clear.setEnabled(true);
        
    }
    public void deductionclicked(java.awt.event.MouseEvent e)
    {
        heading.setText("Deduction");
        salary_table.setVisible(false);
        salary_table.setEnabled(false);
        allowance.setVisible(false);
        allowance.setEnabled(false);
        deduction.setVisible(true);
        deduction.setEnabled(true);
        update.setVisible(false);
        update.setEnabled(false);
        payroll.setVisible(false);
        payroll.setEnabled(false);


        deduction.search_textfield.setVisible(true);
        deduction.search_textfield.setEnabled(true);
        deduction.search_button.setVisible(true);
        deduction.search_button.setEnabled(true);
        deduction.FirstName_textfield.setVisible(true);
        deduction.FirstName_textfield.setEnabled(true);
        deduction.LastName_textfield.setVisible(true);
        deduction.LastName_textfield.setEnabled(true);
        deduction.date_of_birth_textfield.setVisible(true);
        deduction.date_of_birth_textfield.setEnabled(true);
        deduction.department_textfield.setVisible(true);
        deduction.department_textfield.setEnabled(true);
        deduction.monthly_salary_textfield.setVisible(true);
        deduction.monthly_salary_textfield.setEnabled(true);
        deduction.Tax_textfield.setVisible(true);
        deduction.Tax_textfield.setEnabled(true);
        deduction.security_medicine_textfield.setVisible(true);
        deduction.security_medicine_textfield.setEnabled(true);
        deduction.others_textfield.setVisible(true);
        deduction.others_textfield.setEnabled(true);
        deduction.hourly_salary_textfield.setVisible(true);
        deduction.hourly_salary_textfield.setEnabled(true);
        deduction.Total_Deduction_textfield.setVisible(true);
        deduction.Total_Deduction_textfield.setEnabled(true);
        deduction.Calculate.setVisible(true);
        deduction.Calculate.setEnabled(true);
        deduction.Save.setVisible(true);
        deduction.Save.setEnabled(true);
        deduction.Clear.setVisible(true);
        deduction.Clear.setEnabled(true);
    }


    public void updateclicked(java.awt.event.MouseEvent e)
    {
        heading.setText("Update");
        salary_table.setVisible(false);
        salary_table.setEnabled(false);
        allowance.setVisible(false);
        allowance.setEnabled(false);
        deduction.setVisible(false);
        deduction.setEnabled(false);
        update.setVisible(true);
        update.setEnabled(true);
        payroll.setVisible(false);
        payroll.setEnabled(false);


        update.employeeID.setVisible(true);
        update.employeeID.setEnabled(true);
        update.search_textfield.setVisible(true);
        update.search_textfield.setEnabled(true);
        update.search_button.setVisible(true);
        update.search_button.setEnabled(true);
        update.FirstName_textfield.setVisible(true);
        update.FirstName_textfield.setEnabled(true);
        update.LastName_textfield.setVisible(true);
        update.LastName_textfield.setEnabled(true);
        update.date_of_birth_textfield.setVisible(true);
        update.date_of_birth_textfield.setEnabled(true);
        update.department_textfield.setVisible(true);
        update.department_textfield.setEnabled(true);
        update.job_title_textfield.setVisible(true);
        update.job_title_textfield.setEnabled(true);
        update.monthly_salary_textfield.setVisible(true);
        update.monthly_salary_textfield.setEnabled(true);
        update.hourly_salary_textfield.setVisible(true);
        update.hourly_salary_textfield.setEnabled(true);
        update.Save.setVisible(true);
        update.Save.setEnabled(true);
        update.Clear.setVisible(true);
        update.Clear.setEnabled(true);

    }

    public void payrollclicked(java.awt.event.MouseEvent e)
    {
        heading.setText("Payroll");
        salary_table.setVisible(false);
        salary_table.setEnabled(false);
        allowance.setVisible(false);
        allowance.setEnabled(false);
        deduction.setVisible(false);
        deduction.setEnabled(false);
        update.setVisible(false);
        update.setEnabled(false);
        payroll.setVisible(true);
        payroll.setEnabled(true);

        payroll.search_textfield.setVisible(true);
        payroll.search_textfield.setEnabled(true);
        payroll.search_button.setVisible(true);
        payroll.search_button.setEnabled(true);
        payroll.FirstName_textfield.setVisible(true);
        payroll.FirstName_textfield.setEnabled(true);
        payroll.LastName_textfield.setVisible(true);
        payroll.LastName_textfield.setEnabled(true);
        payroll.date_of_birth_textfield.setVisible(true);
        payroll.date_of_birth_textfield.setEnabled(true);
        payroll.department_textfield.setVisible(true);
        payroll.department_textfield.setEnabled(true);
        payroll.job_title_textfield.setVisible(true);
        payroll.job_title_textfield.setEnabled(true);
        payroll.hours_worked_textfield.setVisible(true);
        payroll.hours_worked_textfield.setEnabled(true);
        payroll.hourly_salary_textfield.setVisible(true);
        payroll.hourly_salary_textfield.setEnabled(true);
        payroll.tot_allowance_textfield.setVisible(true);
        payroll.tot_allowance_textfield.setEnabled(true);
        payroll.tot_deduction_textfield.setVisible(true);
        payroll.tot_deduction_textfield.setEnabled(true);
        payroll.Basic_salary_textfield.setVisible(true);
        payroll.Basic_salary_textfield.setEnabled(true);
        payroll.After_allowance_and_deduction_textfield.setVisible(true);
        payroll.After_allowance_and_deduction_textfield.setEnabled(true);
        payroll.Final_salary_textfield.setVisible(true);
        payroll.Final_salary_textfield.setEnabled(true);
        payroll.ok.setVisible(true);
        payroll.ok.setEnabled(true);
        payroll.print_Button.setVisible(true);
        payroll.print_Button.setEnabled(true);
    }
}
