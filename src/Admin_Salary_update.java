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


class Admin_Salary_update extends JPanel implements ActionListener {

    Admin_search_employee update=new Admin_search_employee();
    JPanel search_panel = new JPanel();
    JLabel search_label = new JLabel("Enter Employee ID ");
    JTextField search_textfield = new JTextField();
    JLabel collan = new JLabel(":");
    GradientButton search_button = new GradientButton(Color.decode("#004FF9"), Color.decode("#56CCF2"));

    JPanel dispalyPanel = new JPanel();
    JLabel employee_detail_label = new JLabel("Employee Details");
    JLabel employeeID_label = new JLabel("Employee ID");
    JTextField employeeID = new JTextField();
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
    

    JLabel Salary_title = new JLabel("Salary Details");
    JLabel monthly_salary_label = new JLabel("Monthly Salary");
    JTextField monthly_salary_textfield = new JTextField();
    JLabel hourly_salary_label = new JLabel("Hourly Salary");
    JTextField hourly_salary_textfield = new JTextField();

    GradientButton Save = new GradientButton(Color.decode("#004FF9"),Color.decode("#56CCF2"));
    GradientButton Clear = new GradientButton(Color.decode("#004FF9"),Color.decode("#56CCF2"));


    Admin_Salary_update() {
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


        employeeID_label.setFont(new Font("Roboto", Font.BOLD, 20)); 
        employeeID_label.setForeground(Color.BLACK);
        employeeID_label.setBounds(40, 100, 150, 20); 

        employeeID.setBounds(40, 121, 400, 35);
        employeeID.setBorder(BorderFactory.createLoweredBevelBorder());
        employeeID.setFont(new Font("Roboto", Font.BOLD, 20));
        employeeID.setForeground(Color.BLUE);
        employeeID.setEditable(false);


        FirstName_label.setFont(new Font("Roboto", Font.BOLD, 20)); 
        FirstName_label.setForeground(Color.BLACK);
        FirstName_label.setBounds(520, 100, 150, 20); 

        FirstName_textfield.setBounds(520, 121, 400, 35);
        FirstName_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        FirstName_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        FirstName_textfield.setForeground(Color.BLUE);
        FirstName_textfield.setEditable(false);

        LastName_label.setFont(new Font("Roboto", Font.BOLD, 20)); 
        LastName_label.setForeground(Color.BLACK);
        LastName_label.setBounds(1000, 100, 150, 20); 

        LastName_textfield.setBounds(1000, 121, 400, 35);
        LastName_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        LastName_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        LastName_textfield.setForeground(Color.BLUE);
        LastName_textfield.setEditable(false);


        date_of_birth_label.setFont(new Font("Roboto", Font.BOLD, 20));
        date_of_birth_label.setBounds(40, 180, 150, 20);
        date_of_birth_label.setForeground(Color.BLACK);
    
        date_of_birth_textfield.setBounds(40, 201, 400,35);
        date_of_birth_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        date_of_birth_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        date_of_birth_textfield.setForeground(Color.BLUE);
        date_of_birth_textfield.setEditable(false);

        department_label.setFont(new Font("Roboto", Font.BOLD, 20)); 
        department_label.setForeground(Color.BLACK);
        department_label.setBounds(520, 180, 150, 20); //350

        department_textfield.setBounds(520, 201, 400, 35);//371
        department_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        department_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        department_textfield.setForeground(Color.BLUE);
        department_textfield.setEditable(false);

        job_title_label.setFont(new Font("Roboto", Font.BOLD, 20)); 
        job_title_label.setForeground(Color.BLACK);
        job_title_label.setBounds(1000, 180, 150, 20); 

        job_title_textfield.setBounds(1000, 201, 400, 35);
        job_title_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        job_title_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        job_title_textfield.setForeground(Color.BLUE);
        job_title_textfield.setEditable(false);


        Salary_title.setFont(new Font("Roboto", Font.BOLD, 30)); 
        Salary_title.setForeground(new Color(6, 143, 255));
        Salary_title.setBounds(40, 270, 350, 35);

        hourly_salary_label.setFont(new Font("Roboto", Font.BOLD, 20)); 
        hourly_salary_label.setForeground(Color.BLACK);
        hourly_salary_label.setBounds(40, 320, 150, 20); 

        hourly_salary_textfield.setBounds(40, 341, 400, 35);
        hourly_salary_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        hourly_salary_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        hourly_salary_textfield.setForeground(Color.BLUE);
        hourly_salary_textfield.setEditable(false);


        monthly_salary_label.setFont(new Font("Roboto", Font.BOLD, 20)); 
        monthly_salary_label.setForeground(Color.BLACK);
        monthly_salary_label.setBounds(520, 320, 150, 20); 

        monthly_salary_textfield.setBounds(520, 341, 400, 35);
        monthly_salary_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        monthly_salary_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        monthly_salary_textfield.setForeground(Color.BLUE);
        monthly_salary_textfield.setEditable(false);


        



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


        dispalyPanel.add(employeeID_label);
        dispalyPanel.add(employeeID);
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
        dispalyPanel.add(hourly_salary_label);
        dispalyPanel.add(hourly_salary_textfield);
        dispalyPanel.add(monthly_salary_label);
        dispalyPanel.add(monthly_salary_textfield);


        dispalyPanel.add(Save);
        dispalyPanel.add(Clear);



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
        if(e.getSource() == search_button) 
        {
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
                        employeeID.setText(resultSet.getString("EmployeeID"));
                        FirstName_textfield.setText(resultSet.getString("FirstName"));
                        LastName_textfield.setText(resultSet.getString("LastName"));
                        date_of_birth_textfield.setText(resultSet.getString("DateOfBirth"));
                        department_textfield.setText(resultSet.getString("Department"));
                        job_title_textfield.setText(resultSet.getString("JobTitle"));
                
                        // Retrieve salary information based on job title
                        String jobTitle = resultSet.getString("JobTitle");
                        String salarySql = "SELECT HourlySalary, MonthlySalary FROM Salary_for_position WHERE PositionName = ?";
                        PreparedStatement salaryStatement = connection.prepareStatement(salarySql);
                        salaryStatement.setString(1, jobTitle);
                        ResultSet salaryResult = salaryStatement.executeQuery();
                        if (salaryResult.next()) {
                            hourly_salary_textfield.setText(salaryResult.getString("HourlySalary"));
                            monthly_salary_textfield.setText(salaryResult.getString("MonthlySalary"));
                        } else {
                            // Handle the case when salary information is not found for the job title
                            hourly_salary_textfield.setText(""); // Set to empty or display an error message
                            monthly_salary_textfield.setText(""); // Set to empty or display an error message
                        }
                        monthly_salary_textfield.setEditable(true);
                    }
                }
                catch (SQLException ex) {
                    ex.printStackTrace(); // Handle the exception as needed
                    new MessagePanel("Error", "An error occurred while retrieving employee details");
                }
            }
        }
        else if(e.getSource() == Save) {
            String empId = search_textfield.getText();
            String monthlySalary = monthly_salary_textfield.getText();
            
            if (!empId.isEmpty() && !monthlySalary.isEmpty()) {
                String url = "jdbc:mysql://localhost:3306/employee_payroll_system";
                String user = "root";
                String password = "3101";
        
                try (Connection connection = DriverManager.getConnection(url, user, password)) {
                    String updateSql = "UPDATE employee SET Salary = ? WHERE EmployeeID = ?";
                    PreparedStatement updateStatement = connection.prepareStatement(updateSql);
                    updateStatement.setString(1, monthlySalary);
                    updateStatement.setString(2, empId);
                    int rowsUpdated = updateStatement.executeUpdate();
                    if (rowsUpdated > 0) {
                        new MessagePanel("Update Salary", "Monthly Salary updated successfully");
                        clearFields();
                        update.updateTable();
                    } else {
                        new MessagePanel("Error", "Failed to update Monthly Salary");
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace(); // Handle the exception as needed
                    new MessagePanel("Error", "An error occurred while updating Monthly Salary");
                }
            } else {
                new MessagePanel("Error", "Please provide Employee ID and Monthly Salary");
            }
        }        
        else if(e.getSource() == Clear)
        {
            employeeID.setText(null);
            search_textfield.setText(null);
            FirstName_textfield.setText(null);
            LastName_textfield.setText(null);
            date_of_birth_textfield.setText(null);
            department_textfield.setText(null);
            job_title_textfield.setText(null);
            monthly_salary_textfield.setText(null);
            hourly_salary_textfield.setText(null);
        }
    }

    private void clearFields() {
            employeeID.setText(null);
            search_textfield.setText(null);
            FirstName_textfield.setText(null);
            LastName_textfield.setText(null);
            date_of_birth_textfield.setText(null);
            department_textfield.setText(null);
            job_title_textfield.setText(null);
            monthly_salary_textfield.setText(null);
            hourly_salary_textfield.setText(null);
    }
    
    public void searchclicked(MouseEvent e)
    {
        hourly_salary_textfield.setEditable(false);
        monthly_salary_textfield.setEditable(false);
        employeeID.setText(null);
        search_textfield.setText(null);
        FirstName_textfield.setText(null);
        LastName_textfield.setText(null);
        date_of_birth_textfield.setText(null);
        department_textfield.setText(null);
        job_title_textfield.setText(null);
        monthly_salary_textfield.setText(null);
        hourly_salary_textfield.setText(null);
        
    }   
}