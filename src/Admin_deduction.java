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

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


class Admin_deduction extends JPanel implements ActionListener {

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
    JLabel yearly_salary_label = new JLabel("Yearly Salary");
    JTextField yearly_salary_textfield = new JTextField();

    JLabel deduction_title = new JLabel("Deduction Detail");
    JLabel Tax_label = new JLabel("Income Tax (in %)");
    JTextField Tax_textfield = new JTextField();
    JLabel security_medicine_label = new JLabel("Security and Medicine (in %)");    
    JTextField security_medicine_textfield = new JTextField();
    JLabel others_label = new JLabel("Others");
    JTextField others_textfield = new JTextField();

    JLabel Salary_title = new JLabel("Salary Details");
    JLabel hourly_salary_label = new JLabel("Hourly Salary");
    JTextField hourly_salary_textfield = new JTextField();

    JLabel deduction_amount_title = new JLabel("Deduction Amount Detail");
    JLabel Total_Deduction_label = new JLabel("Total Deduction Amount");
    JTextField Total_Deduction_textfield = new JTextField();

    GradientButton Calculate = new GradientButton(Color.decode("#004FF9"),Color.decode("#56CCF2"));
    GradientButton Save = new GradientButton(Color.decode("#004FF9"),Color.decode("#56CCF2"));
    GradientButton Clear = new GradientButton(Color.decode("#004FF9"),Color.decode("#56CCF2"));


    Admin_deduction() {
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


        deduction_title.setFont(new Font("Roboto", Font.BOLD, 30)); 
        deduction_title.setForeground(new Color(6, 143, 255));
        deduction_title.setBounds(500, 40, 250, 30);


        Tax_label.setFont(new Font("Roboto", Font.BOLD, 20)); 
        Tax_label.setForeground(Color.BLACK);
        Tax_label.setBounds(500, 100, 200, 20); 

        Tax_textfield.setBounds(500, 121, 400, 35);
        Tax_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        Tax_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        Tax_textfield.setForeground(Color.BLUE);
        Tax_textfield.setEditable(false);


        security_medicine_label.setFont(new Font("Roboto", Font.BOLD, 20));
        security_medicine_label.setBounds(500, 180, 300, 20);
        security_medicine_label.setForeground(Color.BLACK);
    
        security_medicine_textfield.setBounds(500, 201, 400,35);
        security_medicine_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        security_medicine_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        security_medicine_textfield.setForeground(Color.BLUE);
        security_medicine_textfield.setEditable(false);

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
        hourly_salary_label.setBounds(1000, 100, 150, 20); 

        hourly_salary_textfield.setBounds(1000, 121, 400, 35);
        hourly_salary_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        hourly_salary_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        hourly_salary_textfield.setForeground(Color.BLUE);
        hourly_salary_textfield.setEditable(false);



        deduction_amount_title.setFont(new Font("Roboto", Font.BOLD, 30)); 
        deduction_amount_title.setForeground(new Color(6, 143, 255));
        deduction_amount_title.setBounds(1000, 200, 400, 30);
        
        
        Total_Deduction_label.setFont(new Font("Roboto", Font.BOLD, 20)); 
        Total_Deduction_label.setForeground(Color.BLACK);
        Total_Deduction_label.setBounds(1000, 260, 250, 20); 

        Total_Deduction_textfield.setBounds(1000, 281, 400, 35);
        Total_Deduction_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        Total_Deduction_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        Total_Deduction_textfield.setForeground(Color.BLUE);
        Total_Deduction_textfield.setEditable(false);


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

        dispalyPanel.add(deduction_title);
        dispalyPanel.add(Tax_label);
        dispalyPanel.add(Tax_textfield);
        dispalyPanel.add(security_medicine_label);
        dispalyPanel.add(security_medicine_textfield);
        dispalyPanel.add(others_label);
        dispalyPanel.add(others_textfield);

        dispalyPanel.add(Salary_title);
        dispalyPanel.add(hourly_salary_label);
        dispalyPanel.add(hourly_salary_textfield);

        dispalyPanel.add(deduction_amount_title);
        dispalyPanel.add(Total_Deduction_label);
        dispalyPanel.add(Total_Deduction_textfield);

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
            String empId = search_textfield.getText(); // Get the Employee ID from the search text field
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
                        // Populate fields with employee data
                        FirstName_textfield.setText(resultSet.getString("FirstName"));
                        LastName_textfield.setText(resultSet.getString("LastName"));
                        date_of_birth_textfield.setText(resultSet.getString("DateOfBirth"));
                        department_textfield.setText(resultSet.getString("Department"));
                        monthly_salary_textfield.setText(resultSet.getString("Salary"));
                        // Fetch and display HourlySalary and OvertimePerHour
                        String jobTitle = resultSet.getString("JobTitle");
    
                        String salarySql = "SELECT HourlySalary, OvertimePerHour FROM Salary_for_position WHERE PositionName = ?";
                        PreparedStatement salaryStatement = connection.prepareStatement(salarySql);
                        salaryStatement.setString(1, jobTitle);
                        ResultSet salaryResult = salaryStatement.executeQuery();
    
                        if (salaryResult.next()) {
                            hourly_salary_textfield.setText(salaryResult.getString("HourlySalary"));
                        }
                    }
                    Tax_textfield.setEditable(true);
                    security_medicine_textfield.setEditable(true);
                    others_textfield.setEditable(true);
                } catch (Exception ex) {
                    ex.printStackTrace(); // Handle the database connection or query exception
                }
            }
        }
    
        if (e.getSource() == Calculate) {
            // Handle the Calculate button action
            // You can add your calculation logic here
            double taxAmount = 0.0; // Initialize to 0 in case the field is empty
            double securityMedicineAmount = 0.0; // Initialize to 0 in case the field is empty
            double othersAmount = 0.0; // Initialize to 0 in case the field is empty
    
            if (!Tax_textfield.getText().isEmpty()) {
                taxAmount = Double.parseDouble(Tax_textfield.getText());
            }
    
            if (!security_medicine_textfield.getText().isEmpty()) {
                securityMedicineAmount = Double.parseDouble(security_medicine_textfield.getText());
            }
    
            if (!others_textfield.getText().isEmpty()) {
                othersAmount = Double.parseDouble(others_textfield.getText());
            }
    
            // Calculate the total deduction
            double totalDeduction = taxAmount + securityMedicineAmount + othersAmount;
    
            // Display the total deduction amount
            Total_Deduction_textfield.setText(String.format("%.2f", totalDeduction));
            security_medicine_textfield.setEditable(false);
            Tax_textfield.setEditable(false);
            others_textfield.setEditable(false);
            Calculate.setVisible(false);
        }
    
        if (e.getSource() == Save) {
            String empId = search_textfield.getText();
            if (empId != null) { // Check if empId is not null
                try {
                    // Fetch values from user input fields
                    double incomeTaxPercentage = Double.parseDouble(Tax_textfield.getText());
                    double securityMedicinePercentage = Double.parseDouble(security_medicine_textfield.getText());
                    double otherDeduction = Double.parseDouble(others_textfield.getText());
        
                    // Calculate the total deduction
                    double totalDeduction = incomeTaxPercentage + securityMedicinePercentage + otherDeduction;
        
                    // Insert the deduction details into the database
                    String url = "jdbc:mysql://localhost:3306/employee_payroll_system";
                    String user = "root";
                    String password = "3101";
        
                    try (Connection connection = DriverManager.getConnection(url, user, password)) {
                        String sql = "INSERT INTO EmployeeDeduction (EmployeeID, IncomeTaxPercentage, SecurityMedicinePercentage, OtherDeduction, TotalDeduction) VALUES (?, ?, ?, ?, ?)";
                        PreparedStatement preparedStatement = connection.prepareStatement(sql);
                        preparedStatement.setString(1, empId);
                        preparedStatement.setDouble(2, incomeTaxPercentage);
                        preparedStatement.setDouble(3, securityMedicinePercentage);
                        preparedStatement.setDouble(4, otherDeduction);
                        preparedStatement.setDouble(5, totalDeduction);
        
                        int rowsAffected = preparedStatement.executeUpdate();
                        if (rowsAffected > 0) {
                            // Data saved successfully
                            new MessagePanel("Deduction", "Details Saved Successfully");
                            clearFields(); // Clear input fields or perform any other necessary actions
                        } else {
                            new MessagePanel("Error", "Failed to save deduction details");
                        }
                    }
                } catch (NumberFormatException ex) {
                    // Handle a number format exception (invalid input)
                    new MessagePanel("Error", "Invalid input in one of the fields");
                } catch (SQLException ex) {
                    // Handle database-related exceptions
                    ex.printStackTrace();
                    new MessagePanel("Error", "An error occurred while saving deduction details");
                }
            } else {
                
                new MessagePanel("Error", "Employee ID is not set. Please search for an employee first.");
            }
        }
        
    
        if (e.getSource() == Clear) {
            // Clear all input fields
            search_textfield.setText(null);
            FirstName_textfield.setText(null);
            LastName_textfield.setText(null);
            date_of_birth_textfield.setText(null);
            department_textfield.setText(null);
            monthly_salary_textfield.setText(null);
            Tax_textfield.setText(null);
            security_medicine_textfield.setText(null);
            others_textfield.setText(null);
            hourly_salary_textfield.setText(null);
            Total_Deduction_textfield.setText(null);
            Calculate.setVisible(true);
        }
    }

    private void clearFields() {
        Tax_textfield.setText("");
        security_medicine_textfield.setText("");
        others_textfield.setText("");
        hourly_salary_textfield.setText("");
        Total_Deduction_textfield.setText("");
    }
    

    public void searchclicked(MouseEvent e)
    {
        Tax_textfield.setEditable(false);
        security_medicine_textfield.setEditable(false);
        others_textfield.setEditable(false);

        search_textfield.setText(null);
        FirstName_textfield.setText(null);
        LastName_textfield.setText(null);
        date_of_birth_textfield.setText(null);
        department_textfield.setText(null);
        monthly_salary_textfield.setText(null);
        Tax_textfield.setText(null);
        security_medicine_textfield.setText(null);
        others_textfield.setText(null);
        hourly_salary_textfield.setText(null);
        Total_Deduction_textfield.setText(null);
        
       
    }
    
}