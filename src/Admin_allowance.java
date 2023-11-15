import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


class Admin_allowance extends JPanel implements ActionListener {
    double Basic_Salary=0.0;
    double totalAllowance = 0.0; // Initialize the total allowance
    JPanel search_panel = new JPanel();
    JLabel search_label = new JLabel("Enter Employee ID ");
    JTextField search_textfield = new JTextField();
    JLabel collan = new JLabel(":");
    GradientButton search_button = new GradientButton(Color.decode("#004FF9"), Color.decode("#56CCF2"));

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
    JLabel monthly_salary_label = new JLabel("Monthly Salary");
    JTextField monthly_salary_textfield = new JTextField();

    JLabel allowance_title = new JLabel("Allownce Detail");
    JLabel overtime_label = new JLabel("Overtime (in hr)");
    JTextField overtime_textfield = new JTextField();
    JLabel Bonus_label = new JLabel("Bonus (in %)");    
    JTextField bonus_textfield = new JTextField();
    JLabel others_label = new JLabel("Others");
    JTextField others_textfield = new JTextField();

    JLabel Salary_title = new JLabel("Salary Details");
    JLabel hourly_salary_label = new JLabel("Over Time Salary");
    JTextField hourly_salary_textfield = new JTextField();

    JLabel allowance_amount_title = new JLabel("Allowance Amount Detail");
    JLabel Total_Allowance_label = new JLabel("Total Allowance Amount");
    JTextField Total_Allowance_textfield = new JTextField();

    GradientButton Calculate = new GradientButton(Color.decode("#004FF9"),Color.decode("#56CCF2"));
    GradientButton Save = new GradientButton(Color.decode("#004FF9"),Color.decode("#56CCF2"));
    GradientButton Clear = new GradientButton(Color.decode("#004FF9"),Color.decode("#56CCF2"));

    Admin_allowance() {
        setBounds(12, 320, 1458, 600);
        setBackground(new Color(206, 230, 243));
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        setLayout(null);

        search_panel.setBounds(0, 0, 1458, 60);
        search_panel.setBackground(new Color(206, 230, 243));
        search_panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        search_panel.setLayout(null);
        

        search_label.setFont(new Font("Roboto", Font.BOLD, 25));
        search_label.setForeground(Color.BLACK);
        search_label.setBounds(160, 12, 350, 30);


        collan.setFont(new Font("Roboto", Font.BOLD, 40));
        collan.setForeground(Color.BLACK);
        collan.setBounds(420, 5, 20, 40);

        

        search_textfield.setBounds(500, 12, 500, 35);
        search_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        search_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        search_textfield.setForeground(Color.BLUE);
        search_textfield.setEditable(true);
        search_textfield.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e)
            {
                searchclicked(e);
            }
        });
        

        search_button.setBounds(1100, 10, 150, 40);
        search_button.setBorder(BorderFactory.createEmptyBorder());
        search_button.setText("Search");
        search_button.setFont(new Font("Roboto", Font.BOLD, 25));
        search_button.setForeground(new Color(240, 240, 240));
        search_button.setFocusable(false);
        search_button.addActionListener(this);

        search_panel.add(search_label);
        search_panel.add(collan);
        search_panel.add(search_textfield);
        search_panel.add(search_button);

        

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

        
        monthly_salary_label.setFont(new Font("Roboto", Font.BOLD, 20)); 
        monthly_salary_label.setForeground(Color.BLACK);
        monthly_salary_label.setBounds(40, 420, 150, 20); 

        monthly_salary_textfield.setBounds(40, 441, 400, 35);
        monthly_salary_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        monthly_salary_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        monthly_salary_textfield.setForeground(Color.BLUE);
        monthly_salary_textfield.setEditable(false);


        allowance_title.setFont(new Font("Roboto", Font.BOLD, 30)); 
        allowance_title.setForeground(new Color(6, 143, 255));
        allowance_title.setBounds(500, 40, 250, 30);


        overtime_label.setFont(new Font("Roboto", Font.BOLD, 20)); 
        overtime_label.setForeground(Color.BLACK);
        overtime_label.setBounds(500, 100, 160, 20); 

        overtime_textfield.setBounds(500, 121, 400, 35);
        overtime_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        overtime_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        overtime_textfield.setForeground(Color.BLUE);
        overtime_textfield.setEditable(false);


        Bonus_label.setFont(new Font("Roboto", Font.BOLD, 20));
        Bonus_label.setBounds(500, 180, 150, 20);
        Bonus_label.setForeground(Color.BLACK);
    
        bonus_textfield.setBounds(500, 201, 400,35);
        bonus_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        bonus_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        bonus_textfield.setForeground(Color.BLUE);
        bonus_textfield.setEditable(false);

        others_label.setFont(new Font("Roboto", Font.BOLD, 20)); 
        others_label.setForeground(Color.BLACK);
        others_label.setBounds(500, 260, 150, 20); //350

        others_textfield.setBounds(500, 281, 400, 35);//371
        others_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        others_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        others_textfield.setForeground(Color.BLUE);
        others_textfield.setEditable(false);


        Salary_title.setFont(new Font("Roboto", Font.BOLD, 30)); 
        Salary_title.setForeground(new Color(6, 143, 255));
        Salary_title.setBounds(1000, 40, 350, 30);

        hourly_salary_label.setFont(new Font("Roboto", Font.BOLD, 20)); 
        hourly_salary_label.setForeground(Color.BLACK);
        hourly_salary_label.setBounds(1000, 100, 250, 20); 

        hourly_salary_textfield.setBounds(1000, 121, 400, 35);
        hourly_salary_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        hourly_salary_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        hourly_salary_textfield.setForeground(Color.BLUE);
        hourly_salary_textfield.setEditable(false);



        allowance_amount_title.setFont(new Font("Roboto", Font.BOLD, 30)); 
        allowance_amount_title.setForeground(new Color(6, 143, 255));
        allowance_amount_title.setBounds(1000, 200, 350, 30);
        
        
        Total_Allowance_label.setFont(new Font("Roboto", Font.BOLD, 20)); 
        Total_Allowance_label.setForeground(Color.BLACK);
        Total_Allowance_label.setBounds(1000, 260, 250, 20); 

        Total_Allowance_textfield.setBounds(1000, 281, 400, 35);
        Total_Allowance_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        Total_Allowance_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        Total_Allowance_textfield.setForeground(Color.BLUE);
        Total_Allowance_textfield.setEditable(false);


        Calculate.setBounds(850 ,440, 150, 40);
        Calculate.setBorder(BorderFactory.createEmptyBorder());
        Calculate.setText("Calculate");
        Calculate.setFont(new Font("Roboto", Font.BOLD, 25));
        Calculate.setForeground(new Color(240,240, 240));
        Calculate.setFocusable(false);
        Calculate.addActionListener(this);

        Save.setBounds(1050 ,440, 150, 40);
        Save.setBorder(BorderFactory.createEmptyBorder());
        Save.setText("Save");
        Save.setFont(new Font("Roboto", Font.BOLD, 25));
        Save.setForeground(new Color(240,240, 240));
        Save.setFocusable(false);
        Save.addActionListener(this);

        Clear.setBounds(1250 ,440, 150, 40);
        Clear.setBorder(BorderFactory.createEmptyBorder());
        Clear.setText("Clear");
        Clear.setFont(new Font("Roboto", Font.BOLD, 25));
        Clear.setForeground(new Color(240,240, 240));
        Clear.setFocusable(false);
        Clear.addActionListener(this);



        dispalyPanel.add(employee_detail_label);
        dispalyPanel.add(FirstName_label);
        dispalyPanel.add(FirstName_textfield);
        dispalyPanel.add(LastName_label);
        dispalyPanel.add(LastName_textfield);
        dispalyPanel.add(date_of_birth_label);
        dispalyPanel.add(date_of_birth_textfield);
        dispalyPanel.add(department_label);
        dispalyPanel.add(department_textfield);
        dispalyPanel.add(monthly_salary_label);
        dispalyPanel.add(monthly_salary_textfield);

        dispalyPanel.add(allowance_title);
        dispalyPanel.add(overtime_label);
        dispalyPanel.add(overtime_textfield);
        dispalyPanel.add(Bonus_label);
        dispalyPanel.add(bonus_textfield);
        dispalyPanel.add(others_label);
        dispalyPanel.add(others_textfield);

        dispalyPanel.add(Salary_title);
        dispalyPanel.add(hourly_salary_label);
        dispalyPanel.add(hourly_salary_textfield);

        dispalyPanel.add(allowance_amount_title);
        dispalyPanel.add(Total_Allowance_label);
        dispalyPanel.add(Total_Allowance_textfield);

        dispalyPanel.add(Calculate);
        dispalyPanel.add(Save);
        dispalyPanel.add(Clear);



        add(search_panel);
        add(dispalyPanel);
        

    }

    class MessagePanel implements ActionListener
    {
        JFrame frame = new JFrame();
        GradientPanel message_panel = new GradientPanel(new Color(245,245,245),new Color(245,245,245),30);
        GradientButton Save = new GradientButton(Color.decode("#004FF9"),Color.decode("#56CCF2"));
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
            
            Save.setBounds(320 ,140, 150, 40);
            Save.setBorder(BorderFactory.createEmptyBorder());
            Save.setText("OK");
            Save.setFont(new Font("Roboto", Font.BOLD, 25));
            Save.setForeground(new Color(240,240, 240));
            Save.setFocusable(false);
            Save.addActionListener(this);
    
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
    
            message_panel.add(Save);
            message_panel.add(heading);
            message_panel.add(content);
            
            frame.add(message_panel);
            frame.setVisible(true);
        }

        
        public void  actionPerformed(java.awt.event.ActionEvent e)
        {

            if(e.getSource() == Save)
            {
                
                frame.dispose();
                
            }
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == search_button) {
            String empId = search_textfield.getText();
            if (!empId.isEmpty()) {
                String url = "jdbc:mysql://localhost:3306/employee_payroll_system";
                String user = "root";
                String password = "3101";

                try (Connection connection = DriverManager.getConnection(url, user, password)) {
                    String sql = "SELECT * FROM employee WHERE EmployeeID = ?";
                    PreparedStatement preparedStatement = connection.prepareStatement(sql);
                    preparedStatement.setString(1, empId);
                    ResultSet resultSet = preparedStatement.executeQuery();
                    

                    if (resultSet.next()) {
                        FirstName_textfield.setText(resultSet.getString("FirstName"));
                        LastName_textfield.setText(resultSet.getString("LastName"));
                        date_of_birth_textfield.setText(resultSet.getString("DateOfBirth"));
                        department_textfield.setText(resultSet.getString("Department"));
                        monthly_salary_textfield.setText(resultSet.getString("Salary"));
                        String jobTitle = resultSet.getString("JobTitle");
                        Basic_Salary=resultSet.getDouble("Salary");
                        


                        // Enable fields for allowance input
                        overtime_textfield.setEditable(true);
                        bonus_textfield.setEditable(true);
                        others_textfield.setEditable(true);

                        // Fetch overtime hours from the "attendance" table based on EmployeeID
                        String overtimeSql = "SELECT overtime FROM attendance WHERE employee_id = ?";
                        PreparedStatement overtimeStatement = connection.prepareStatement(overtimeSql);
                        overtimeStatement.setString(1, empId);
                        ResultSet overtimeResult = overtimeStatement.executeQuery();

                        if (overtimeResult.next()) {
                            // Retrieve the time value for overtime
                            Time overtimeTime = overtimeResult.getTime("overtime");

                            if (overtimeTime != null) {
                                // Convert the time value to hours and display in hours
                                double totalOvertimeHours = overtimeTime.toLocalTime().getHour()
                                        + (overtimeTime.toLocalTime().getMinute() / 60.0);
                                overtime_textfield.setText(String.format("%.2f", totalOvertimeHours) + " hrs");
                            } else {
                                // Handle the case where the time value is null
                                overtime_textfield.setText("0.00 hrs");
                            }

                            // Fetch hourly salary and overtime rate from Salary_for_position based on
                            // JobTitle
                            String salarySql = "SELECT HourlySalary, OvertimePerHour FROM Salary_for_position WHERE PositionName = ?";
                            PreparedStatement salaryStatement = connection.prepareStatement(salarySql);
                            salaryStatement.setString(1, jobTitle);
                            ResultSet salaryResult = salaryStatement.executeQuery();
                            if (salaryResult.next()) {
                                double overtimeRate = salaryResult.getDouble("OvertimePerHour");
                                System.out.println("Overtime Rate: " + overtimeRate); // Debug output

                                if (overtimeRate != -1) {
                                    hourly_salary_textfield.setText(salaryResult.getString("OvertimePerHour"));

                                    // Get the overtime hours from the "overtime_textfield"
                                    String overtimeText = overtime_textfield.getText().replace(" hrs", "");
                                    double totalOvertimeHours = Double.parseDouble(overtimeText);

                                    System.out.println("Total Overtime Hours: " + totalOvertimeHours); // Debug output

                                    double overtimeAllowance = totalOvertimeHours * overtimeRate;

                                    Total_Allowance_textfield.setText(String.format("%.2f",overtimeAllowance));
                                } else {
                                    hourly_salary_textfield.setText("Overtime Rate not found");
                                    Total_Allowance_textfield.setText("Overtime Rate not found");
                                }
                            } else {
                                hourly_salary_textfield.setText("Hourly Salary not found");
                                Total_Allowance_textfield.setText("Hourly Salary not found");
                            }
                        } else {
                            // Employee not found, handle accordingly
                            // You can add a message dialog here.
                        }
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        } else if (e.getSource() == Calculate) {
            double overtimeAllowance = Double.parseDouble(Total_Allowance_textfield.getText());
            if (!bonus_textfield.getText().isEmpty()) {
                double bonusPercentage = Double.parseDouble(bonus_textfield.getText());
        
                // Calculate the bonus as a percentage of the basic salary
                double bonus = (bonusPercentage / 100.0) * Basic_Salary;
        
                // Calculate the "others" amount
                double othersAmount = 0.0;
                if (!others_textfield.getText().isEmpty()) {
                    othersAmount = Double.parseDouble(others_textfield.getText());
                }
        
                // Calculate the total allowance by adding overtime allowance, bonus, and others amount
                double totalAllowance = overtimeAllowance + bonus + othersAmount;
        
                // Display the total allowance
                Total_Allowance_textfield.setText(String.format("%.2f", totalAllowance));
        
                // Enable fields for allowance input
                overtime_textfield.setEditable(false);
                bonus_textfield.setEditable(false);
                others_textfield.setEditable(false);
                Calculate.setVisible(false);
            }
        }
        else if (e.getSource() == Save) {
            new MessagePanel("Allowance", "Details Saved Successfully");
            Calculate.setVisible(true);
            String empId = search_textfield.getText();
            double overtimeHours = Double.parseDouble(overtime_textfield.getText().replace(" hrs", ""));
            double bonusPercentage = Double.parseDouble(bonus_textfield.getText());
            double otherAllowance = Double.parseDouble(others_textfield.getText());
            double totalAllowance = Double.parseDouble(Total_Allowance_textfield.getText());
        
            // Insert the allowance details into the database
            String url = "jdbc:mysql://localhost:3306/employee_payroll_system";
            String user = "root";
            String password = "3101";
        
            try (Connection connection = DriverManager.getConnection(url, user, password)) {
                String sql = "INSERT INTO employee_allowance (employee_id, overtime_hours, bonus_percentage, other_allowance, total_allowance) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, empId);
                preparedStatement.setDouble(2, overtimeHours);
                preparedStatement.setDouble(3, bonusPercentage);
                preparedStatement.setDouble(4, otherAllowance);
                preparedStatement.setDouble(5, totalAllowance);
        
                int rowsAffected = preparedStatement.executeUpdate();
                if (rowsAffected > 0) {
                    // Data saved successfully, so show the Calculate button
                    Calculate.setVisible(true);
        
                    new MessagePanel("Allowance", "Details Saved Successfully");
                    clearFields();
                } else {
                    new MessagePanel("Error", "Failed to save allowance details");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
                new MessagePanel("Error", "An error occurred while saving allowance details");
            }
        }else if (e.getSource() == Clear) {
            search_textfield.setText(null);
            FirstName_textfield.setText(null);
            LastName_textfield.setText(null);
            date_of_birth_textfield.setText(null);
            department_textfield.setText(null);
            monthly_salary_textfield.setText(null);
            overtime_textfield.setText(null);
            bonus_textfield.setText(null);
            others_textfield.setText(null);
            hourly_salary_textfield.setText(null);
            Total_Allowance_textfield.setText(null);
            Calculate.setVisible(true);
        }
    }

    private void clearFields() {
        search_textfield.setText("");
        FirstName_textfield.setText("");
        LastName_textfield.setText("");
        date_of_birth_textfield.setText("");
        department_textfield.setText("");
        monthly_salary_textfield.setText("");
        overtime_textfield.setText("");
        bonus_textfield.setText("");
        others_textfield.setText("");
        hourly_salary_textfield.setText("");
        Total_Allowance_textfield.setText("");
    }
    
    public void searchclicked(MouseEvent e)
    {
        overtime_textfield.setEditable(false);
        bonus_textfield.setEditable(false);
        others_textfield.setEditable(false);

        search_textfield.setText(null);
        FirstName_textfield.setText(null);
        LastName_textfield.setText(null);
        date_of_birth_textfield.setText(null);
        department_textfield.setText(null);
        monthly_salary_textfield.setText(null);
        overtime_textfield.setText(null);
        bonus_textfield.setText(null);
        others_textfield.setText(null);
        hourly_salary_textfield.setText(null);
        Total_Allowance_textfield.setText(null);
        
       
    }
    
}