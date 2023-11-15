import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



class remove_employee extends JPanel implements java.awt.event.ActionListener
{
    Admin_search_employee update=new Admin_search_employee();
    JLabel employeeID_label = new JLabel("Enter Employee ID : ");
    JTextField employeeID = new JTextField();
    //JPanel panel = new JPanel();
    JLabel FirstName_label = new JLabel("First Name");
    JTextField FirstName_textfield = new JTextField();
    JLabel Gender_label = new JLabel("Gender");
    //JRadioButton Male = new JRadioButton("Male");
    //JRadioButton Female = new JRadioButton("Female");
    //ButtonGroup group = new ButtonGroup();
    JTextField gender_textfield = new JTextField();
    JLabel email_label = new JLabel("Email");
    JTextField email_textfield = new JTextField();
    JLabel phone_number_label = new JLabel("Phone Number");
    JTextField phone_number_textfield = new JTextField();
    JLabel address1_label = new JLabel("Address line 1");
    JTextField address1_textfield = new JTextField();
    JLabel state_label = new JLabel("State");
    JTextField state_textfield = new JTextField();

    JLabel LastName_label = new JLabel("Last Name");
    JTextField LastName_textfield = new JTextField();
    JLabel date_of_birth_label = new JLabel("Date of Birth");
    JTextField date_of_birth = new JTextField();
    JLabel alternative_email_label = new JLabel("Alternative Email");
    JTextField alternative_email_textfield = new JTextField();
    JLabel alternative_phone_number_label = new JLabel("Alternative Phone number");
    JTextField alternative_phone_number_textfield = new JTextField();
    JLabel address2_label = new JLabel("Address line 2");
    JTextField address2_textfield = new JTextField();
    JLabel district_label = new JLabel("District");
    JTextField district_textfield = new JTextField();

    JLabel department_label = new JLabel("Department");
    JTextField department_textfield = new JTextField();
    JLabel designation_label = new JLabel("Designation");
    JTextField designation_textfield = new JTextField();
    JLabel status_label = new JLabel("Status");
    JTextField status_textfield = new JTextField();
    JLabel date_hired_label = new JLabel("Date Hired");
    JTextField date_hired = new JTextField();
    JLabel job_title_label = new JLabel("Job Title");
    JTextField job_title_Combobox = new JTextField();
    JLabel salary_label = new JLabel("Salary");
    JTextField salary_textfield = new JTextField();
    JPanel search = new JPanel();

    JButton button = new JButton("Search",new ImageIcon("lib\\images\\search_employee.png"));




    
    
    remove_employee()
    {
        setBounds(12, 320, 1458, 600);
        setBackground(new Color(206, 230, 243));
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        setLayout(null);

        
        FirstName_label.setFont(new Font("Roboto", Font.BOLD, 20)); 
        FirstName_label.setForeground(Color.BLACK);
        FirstName_label.setBounds(40, 20, 150, 20); 

        FirstName_textfield.setBounds(40, 41, 400, 35);
        FirstName_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        FirstName_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        FirstName_textfield.setForeground(Color.BLUE);
        FirstName_textfield.setEditable(false);

        Gender_label.setFont(new Font("Roboto", Font.BOLD, 20)); 
        Gender_label.setForeground(Color.BLACK);
        Gender_label.setBounds(40, 100, 150, 20); 
        

        gender_textfield.setBounds(40, 121, 400,35);
        gender_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        gender_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        gender_textfield.setForeground(Color.BLUE);
        gender_textfield.setEditable(false);


        email_label.setFont(new Font("Roboto", Font.BOLD, 20)); 
        email_label.setForeground(Color.BLACK);
        email_label.setBounds(40, 180, 150, 20); 

        email_textfield.setBounds(40, 201, 400, 35);
        email_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        email_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        email_textfield.setForeground(Color.BLUE);
        email_textfield.setEditable(false);


        phone_number_label.setFont(new Font("Roboto", Font.BOLD, 20)); 
        phone_number_label.setForeground(Color.BLACK);
        phone_number_label.setBounds(40, 260, 150, 20); 

        phone_number_textfield.setBounds(40, 281, 400, 35);
        phone_number_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        phone_number_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        phone_number_textfield.setForeground(Color.BLUE);
        phone_number_textfield.setEditable(false);

        address1_label.setFont(new Font("Roboto", Font.BOLD, 20)); 
        address1_label.setForeground(Color.BLACK);
        address1_label.setBounds(40, 350, 150, 20); 

        address1_textfield.setBounds(40, 371, 400, 35);
        address1_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        address1_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        address1_textfield.setForeground(Color.BLUE);
        address1_textfield.setEditable(false);


        state_label.setFont(new Font("Roboto", Font.BOLD, 20)); 
        state_label.setForeground(Color.BLACK);
        state_label.setBounds(40, 430, 150, 20); 

        state_textfield.setBounds(40, 451, 400, 35);
        state_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        state_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        state_textfield.setForeground(Color.BLUE);
        state_textfield.setEditable(false);
        






        LastName_label.setFont(new Font("Roboto", Font.BOLD, 20)); 
        LastName_label.setForeground(Color.BLACK);
        LastName_label.setBounds(500, 20, 150, 20); 

        LastName_textfield.setBounds(500, 41, 400, 35);
        LastName_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        LastName_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        LastName_textfield.setForeground(Color.BLUE);
        LastName_textfield.setEditable(false);


        date_of_birth_label.setFont(new Font("Roboto", Font.BOLD, 20));
        date_of_birth_label.setBounds(500, 100, 150, 20);
        date_of_birth_label.setForeground(Color.BLACK);
    
        date_of_birth.setBounds(500, 121, 400,35);
        date_of_birth.setFont(new Font("Roboto", Font.BOLD, 20));
        date_of_birth.setBorder(BorderFactory.createLoweredBevelBorder());
        date_of_birth.setForeground(Color.BLUE);
        date_of_birth.setEditable(false);


        alternative_email_label.setFont(new Font("Roboto", Font.BOLD, 20)); 
        alternative_email_label.setForeground(Color.BLACK);
        alternative_email_label.setBounds(500, 180, 250, 20); 

        alternative_email_textfield.setBounds(500, 201, 400, 35);
        alternative_email_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        alternative_email_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        alternative_email_textfield.setForeground(Color.BLUE);
        alternative_email_textfield.setEditable(false);


        alternative_phone_number_label.setFont(new Font("Roboto", Font.BOLD, 20)); 
        alternative_phone_number_label.setForeground(Color.BLACK);
        alternative_phone_number_label.setBounds(500, 260, 250, 20); 

        alternative_phone_number_textfield.setBounds(500, 281, 400, 35);
        alternative_phone_number_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        alternative_phone_number_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        alternative_phone_number_textfield.setForeground(Color.BLUE);
        alternative_phone_number_textfield.setEditable(false);


        address2_label.setFont(new Font("Roboto", Font.BOLD, 20)); 
        address2_label.setForeground(Color.BLACK);
        address2_label.setBounds(500, 350, 150, 20); 

        address2_textfield.setBounds(500, 371, 400, 35);
        address2_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        address2_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        address2_textfield.setForeground(Color.BLUE);
        address2_textfield.setEditable(false);


        district_label.setFont(new Font("Roboto", Font.BOLD, 20)); 
        district_label.setForeground(Color.BLACK);
        district_label.setBounds(500, 430, 150, 20); 

        district_textfield.setBounds(500, 451, 400, 35);
        district_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        district_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        district_textfield.setForeground(Color.BLUE);
        district_textfield.setEditable(false);


        search.setBounds(40, 520, 860, 50);
        search.setBackground(Color.LIGHT_GRAY);
        search.setLayout(null);
        search.setBorder(BorderFactory.createRaisedBevelBorder());
        search.addMouseListener(new MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent e)
            {
                employeeIDClicked(e);
            } 
        });

        employeeID_label.setFont(new Font("Roboto", Font.BOLD, 20)); 
        employeeID_label.setForeground(Color.BLACK);
        employeeID_label.setBounds(70, 5, 200, 40); 

        employeeID.setBounds(270, 7, 500, 35);
        employeeID.setBorder(BorderFactory.createLoweredBevelBorder());
        employeeID.setFont(new Font("Roboto", Font.BOLD, 20));
        employeeID.setForeground(Color.BLUE);
        employeeID.setBorder(BorderFactory.createLoweredBevelBorder());

        search.add(employeeID_label);
        search.add(employeeID);



        job_title_label.setFont(new Font("Roboto", Font.BOLD, 20)); 
        job_title_label.setForeground(Color.BLACK);
        job_title_label.setBounds(1020, 20, 150, 20); 

        job_title_Combobox.setBounds(1020, 41, 400, 35);
        job_title_Combobox.setBorder(BorderFactory.createLoweredBevelBorder());
        job_title_Combobox.setFont(new Font("Roboto", Font.BOLD, 20));
        job_title_Combobox.setForeground(Color.BLUE);
        job_title_Combobox.setEditable(false);
        //job_title_Combobox.setEnabled(false);
        //job_title_Combobox.setFocusable(false);

        designation_label.setFont(new Font("Roboto", Font.BOLD, 20));
        designation_label.setBounds(1020, 100, 150, 20);
        designation_label.setForeground(Color.BLACK);
    
        designation_textfield.setBounds(1020, 121, 400, 35);
        designation_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        designation_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        designation_textfield.setForeground(Color.BLUE);
        designation_textfield.setEditable(false);
        
        status_label.setFont(new Font("Roboto", Font.BOLD, 20)); 
        status_label.setForeground(Color.BLACK);
        status_label.setBounds(1020, 180, 250, 20); 

        status_textfield.setBounds(1020, 201, 400, 35);
        status_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        status_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        status_textfield.setForeground(Color.BLUE);
        status_textfield.setEditable(false);


        date_hired_label.setFont(new Font("Roboto", Font.BOLD, 20)); 
        date_hired_label.setForeground(Color.BLACK);
        date_hired_label.setBounds(1020, 260, 250, 20); 

        date_hired.setBounds(1020, 281, 400,35);
        date_hired.setFont(new Font("Roboto", Font.BOLD, 20));
        date_hired.setBorder(BorderFactory.createLoweredBevelBorder());
        //date_hired.setOpaque(true);
        date_hired.setForeground(Color.BLUE);
        //date_hired.setDateFormatString("YYYY-MM-dd");
        date_hired.setEditable(false);

        department_label.setFont(new Font("Roboto", Font.BOLD, 20)); 
        department_label.setForeground(Color.BLACK);
        department_label.setBounds(1020, 350, 150, 20); //350


        department_textfield.setBounds(1020, 371, 400, 35);//371
        department_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        department_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        department_textfield.setForeground(Color.BLUE);
        department_textfield.setEditable(false);


        salary_label.setFont(new Font("Roboto", Font.BOLD, 20)); 
        salary_label.setForeground(Color.BLACK);
        salary_label.setBounds(1020, 430, 150, 20); 

        salary_textfield.setBounds(1020, 451, 400, 35);
        salary_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        salary_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        salary_textfield.setForeground(Color.BLUE);
        salary_textfield.setEditable(false);

        

        button.setBounds(1120, 530, 300, 40);
        button.setFocusable(false);
        button.setFont(new Font("Roboto", Font.BOLD, 30));
        button.setBorder(BorderFactory.createRaisedBevelBorder());
        button.setBackground(new Color(240, 240, 240));
        button.addMouseListener(new MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent e)
            {
                saveEntered(e);
            }
            public void mouseExited(java.awt.event.MouseEvent e)
            {
                saveExited(e);
            }
        });
        button.addActionListener(this);



        add(FirstName_label);
        add(FirstName_textfield);
        add(Gender_label);
        add(gender_textfield);
        add(email_label);
        add(email_textfield);
        add(phone_number_label);
        add(phone_number_textfield);
        add(address1_label);
        add(address1_textfield);
        add(state_label);
        add(state_textfield);


        add(LastName_label);
        add(LastName_textfield);
        add(date_of_birth_label);
        add(date_of_birth);
        add(alternative_email_label);
        add(alternative_email_textfield);
        add(alternative_phone_number_label);
        add(alternative_phone_number_textfield);
        add(address2_label);
        add(address2_textfield);
        add(district_label);
        add(district_textfield);


        add(search);



        add(department_label);
        add(department_textfield);
        add(designation_label);
        add(designation_textfield);
        add(status_label);
        add(status_textfield);
        add(date_hired_label);
        add(date_hired);
        add(job_title_label);
        add(job_title_Combobox);
        add(salary_label);
        add(salary_textfield);
        add(button);


    }
    private Connection connectToDatabase() {
        Connection connection = null;
        try {
            String url = "jdbc:mysql://localhost:3306/employee_payroll_system";
            String username = "root";
            String password = "3101";
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
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


   class RemovePanel implements ActionListener
    {
        JFrame frame = new JFrame();
        GradientPanel message_panel = new GradientPanel(new Color(245,245,245),new Color(245,245,245),30);
        GradientButton ok = new GradientButton(Color.decode("#004FF9"),Color.decode("#56CCF2"));
        GradientButton cancel = new GradientButton(Color.decode("#004FF9"),Color.decode("#56CCF2"));
        JPasswordField password = new JPasswordField();
        JLabel heading = new JLabel();
        JLabel content = new JLabel();
        
        RemovePanel(String h,String c1)
        {
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // 
            frame.setSize(1920,1080); // frame size
            frame.setLocationRelativeTo(null);  // display frame in center of screen
            frame.setUndecorated(true);
            frame.setLayout(null);
            //getContentPane().setBackground(new Color(0,0,0));
            frame.setIconImage(new ImageIcon("lib\\images\\companylogo.png").getImage());
            frame.setBackground(new Color(0.f,0.0f,0.0f,0.6f));
    
            message_panel.setBounds(700,300, 500, 250);
            message_panel.setOpaque(true);
            message_panel.setLayout(null);
            //message_panel.setBackground(Color.BLACK);//(new Color(1.0f,1.0f,1.0f,0.0f));
            
            ok.setBounds(130 ,190, 150, 40);
            ok.setBorder(BorderFactory.createEmptyBorder());
            ok.setText("OK");
            ok.setFont(new Font("Roboto", Font.BOLD, 25));
            ok.setForeground(new Color(240,240, 240));
            ok.setFocusable(false);
            ok.addActionListener(this);

            cancel.setBounds(305 ,190, 150, 40);
            cancel.setBorder(BorderFactory.createEmptyBorder());
            cancel.setText("cancel");
            cancel.setFont(new Font("Roboto", Font.BOLD, 25));
            cancel.setForeground(new Color(240,240, 240));
            cancel.setFocusable(false);
            cancel.addActionListener(this);
    
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

            password.setBounds(50 , 120, 400, 40);
            password.setFont(new Font("Roboto", Font.PLAIN, 20));
            password.setBackground(Color.WHITE);
            password.setBorder(BorderFactory.createLoweredBevelBorder());
            password.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e)
                {
                    passwordClicked(e);
                }
            });

            
    
            message_panel.add(ok);
            message_panel.add(cancel);
            message_panel.add(heading);
            message_panel.add(content);
            message_panel.add(password);
            
            frame.add(message_panel);
            frame.setVisible(true);
        }

        
        public void actionPerformed(java.awt.event.ActionEvent e) {
            if (e.getSource() == ok) {
                String enteredPassword = String.valueOf(password.getPassword());
                String username = "admin"; // Assuming the username is hardcoded as "admin"
                if (verifyPasswordFromDatabase(username, enteredPassword)) {
                    // Password is correct, proceed with the removal of the employee
                    // password frame is dispose
                    frame.dispose();
                    // Call a method to remove the employee
                    remove_employees(employeeID.getText());
                    // Message will pop out
                    new MessagePanel("Remove Employee", "Employee Removed Successfully");
                    resetFormFields();
                } else {
                    password.setText(null);
                    password.setEnabled(true);
                    password.setBorder(BorderFactory.createLineBorder(Color.decode("#FE0000"), 3));
                }
            }

            if (e.getSource() == cancel) {
                frame.dispose();
            }
        }

        public void passwordClicked(MouseEvent e) {
            password.setText(null);
            password.setEnabled(true);
            password.setBorder(BorderFactory.createLoweredBevelBorder());
        }

        private boolean verifyPasswordFromDatabase(String username, String enteredPassword) {
            Connection connection = connectToDatabase();
            if (connection != null) {
                try {
                    String query = "SELECT * FROM login WHERE username = ? AND password = ?";
                    PreparedStatement preparedStatement = connection.prepareStatement(query);
                    preparedStatement.setString(1, username);
                    preparedStatement.setString(2, enteredPassword);

                    ResultSet resultSet = preparedStatement.executeQuery();

                    if (resultSet.next()) {
                        // Password matches
                        return true;
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                } finally {
                    try {
                        connection.close();
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
            }
            return false; // Return false if there's an error or the password doesn't match
        }

    }

    public void saveEntered(java.awt.event.MouseEvent e) {
        button.setBorder(BorderFactory.createLoweredBevelBorder());
        button.setBackground(new Color(192, 192, 192));
    }

    public void saveExited(java.awt.event.MouseEvent e) {
        button.setBorder(BorderFactory.createRaisedBevelBorder());
        button.setBackground(new Color(240, 240, 240));
    }

    public void actionPerformed(java.awt.event.ActionEvent e) {
        if (e.getSource() == button) {
            String ID = employeeID.getText();
            if (button.getText().equals("Search")) {
                // Call the fetchAndDisplayEmployeeDetails method to retrieve and display
                // employee details
                if (fetchAndDisplayEmployeeDetails(ID)) {
                    //resetFormFields();
                    toggleEditableFields(false);
                    
                } else {
                    // Employee not found, handle this case (e.g., show a message)
                    new MessagePanel("Remove Employee", "Employee not Found");
                    employeeID.setText(null);
                }
            } else if (button.getText().equals("Remove")) {
                new RemovePanel("Remove Employee", "Enter Password To Remove Employee");
            }
        }
    }

    private boolean fetchAndDisplayEmployeeDetails(String employeeID) {
        Connection connection = connectToDatabase();
        if (connection != null) {
            try {
                String query = "SELECT * FROM employee WHERE employeeID = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, employeeID);
                ResultSet resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
                    // Employee found in the database
                    button.setText("Remove");
                    button.setIcon(new ImageIcon("lib\\images\\save_employee.png"));
                    FirstName_textfield.setText(resultSet.getString("firstName"));
                    //Male.setSelected(resultSet.getString("gender").equals("Male"));
                    //Female.setSelected(resultSet.getString("gender").equals("Female"));
                    gender_textfield.setText(resultSet.getString("gender"));
                    email_textfield.setText(resultSet.getString("email"));
                    phone_number_textfield.setText(resultSet.getString("phoneNumber"));
                    address1_textfield.setText(resultSet.getString("address1"));
                    state_textfield.setText(resultSet.getString("state"));

                    LastName_textfield.setText(resultSet.getString("lastName"));
                    date_of_birth.setText(resultSet.getDate("dateOfBirth").toString());
                    alternative_email_textfield.setText(resultSet.getString("alternativeEmail"));
                    alternative_phone_number_textfield.setText(resultSet.getString("alternativePhoneNumber"));
                    address2_textfield.setText(resultSet.getString("address2"));
                    district_textfield.setText(resultSet.getString("district"));

                    job_title_Combobox.setText(resultSet.getString("jobTitle"));
                    designation_textfield.setText(resultSet.getString("designation"));
                    status_textfield.setText(resultSet.getString("status"));
                    date_hired.setText(resultSet.getDate("dateHired").toString());
                    department_textfield.setText(resultSet.getString("department"));
                    salary_textfield.setText(resultSet.getString("salary"));

                    // Enable the date choosers here
                    date_of_birth.setEditable(true);
                    date_hired.setEditable(true);

                    preparedStatement.close();
                    connection.close();
                    return true; // Employee found
                } else {
                    // No employee found in the database
                    // You can display a message or take appropriate action.
                    button.setText("Search");
                    button.setIcon(new ImageIcon("lib\\images\\search_employee.png"));
                    resetFormFields();
                    toggleEditableFields(false);
                    preparedStatement.close();
                    connection.close();
                    return false; // Employee not found
                }
            } catch (SQLException e) {
                e.printStackTrace();
                return false; // Handle the error or return false
            }
        } else {
            // Handle the case where the database connection fails
            // You can display an error message or take appropriate action.
            return false;
        }
    }

    public boolean remove_employees(String employeeID) {
        Connection connection = connectToDatabase();
        PreparedStatement preparedStatement = null;

        if (connection != null) {
            try {
                connection.setAutoCommit(false);

                // Get the old job title before removing the employee
                String oldJobTitle = getEmployeeJobTitle(employeeID);

                // Define the SQL DELETE statement to remove the employee based on EmployeeID
                String deleteQuery = "DELETE FROM employee WHERE EmployeeID = ?";
                preparedStatement = connection.prepareStatement(deleteQuery);
                preparedStatement.setString(1, employeeID);

                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    // Employee removed successfully
                    // Update the position status for the old job title
                    updatePositionStatus(oldJobTitle);
                    update.updateTable();
                    System.out.println("Employee with ID " + employeeID + " removed successfully");
                    connection.commit();
                    return true;
                } else {
                    // Employee not found with the provided EmployeeID
                    // You can display an appropriate message or take other actions
                    System.out.println("Employee with ID " + employeeID + " not found");
                    connection.rollback();
                    return false;
                }
            } catch (SQLException e) {
                e.printStackTrace();
                try {
                    connection.rollback();
                } catch (SQLException rollbackException) {
                    rollbackException.printStackTrace();
                }
                return false;
            } finally {
                try {
                    if (preparedStatement != null) {
                        preparedStatement.close();
                    }
                    connection.close();
                } catch (SQLException closeException) {
                    closeException.printStackTrace();
                }
            }
        } else {
            // Handle the case where the database connection fails
            // You can display an error message or take appropriate action
            System.out.println("Database connection failed");
            return false;
        }
    }

    private void updatePositionStatus(String jobTitle) {
        Connection connection = connectToDatabase();
        if (connection != null) {
            try {
                // Define SQL query to update the employeepositionstatus table
                String updateQuery = "UPDATE employeepositionstatus SET CurrentEmployees = CurrentEmployees - 1 WHERE PositionName = ?";
                PreparedStatement updateStatement = connection.prepareStatement(updateQuery);
                updateStatement.setString(1, jobTitle);
                updateStatement.executeUpdate();
                updateStatement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
                // Handle the SQL exception as needed
            }
        }
    }

    // Fetch the old job title for the employee from the database
    private String getEmployeeJobTitle(String employeeID) {
        Connection connection = connectToDatabase();
        if (connection != null) {
            try {
                // Define the SQL query to retrieve the old job title
                String selectQuery = "SELECT jobTitle FROM employee WHERE employeeID = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
                preparedStatement.setString(1, employeeID);
                ResultSet resultSet = preparedStatement.executeQuery();

                if (resultSet.next()) {
                    // Fetch the old job title from the result set
                    String oldJobTitle = resultSet.getString("jobTitle");
                    resultSet.close();
                    preparedStatement.close();
                    connection.close();
                    return oldJobTitle;
                } else {
                    // Handle the case where no record with the specified employeeID is found
                    resultSet.close();
                    preparedStatement.close();
                    connection.close();
                    return null; // or any other appropriate handling
                }
            } catch (SQLException e) {
                e.printStackTrace();
                // Handle the SQL exception as needed
            }
        }
        return null; // Handle the case where the database connection fails
    }

    private void resetFormFields() {
        employeeID.setText("");
        employeeID.setEditable(true);
        button.setText("Search");
        button.setIcon(new ImageIcon("lib\\images\\search_employee.png"));
        FirstName_textfield.setText("");
        gender_textfield.setText("");
        email_textfield.setText("");
        phone_number_textfield.setText("");
        address1_textfield.setText("");
        state_textfield.setText("");
        LastName_textfield.setText("");
        date_of_birth.setText(null);
        alternative_email_textfield.setText("");
        alternative_phone_number_textfield.setText("");
        address2_textfield.setText("");
        district_textfield.setText("");
        job_title_Combobox.setText("");
        designation_textfield.setText("");
        status_textfield.setText("");
        date_hired.setText(null);
        department_textfield.setText("");
        salary_textfield.setText("");
    }

    private void toggleEditableFields(boolean isEditable) {
        FirstName_textfield.setEditable(isEditable);
        gender_textfield.setEditable(isEditable);
        email_textfield.setEditable(isEditable);
        phone_number_textfield.setEditable(isEditable);
        address1_textfield.setEditable(isEditable);
        state_textfield.setEditable(isEditable);
        LastName_textfield.setEditable(isEditable);
        date_of_birth.setEditable(isEditable);
        alternative_email_textfield.setEditable(isEditable);
        alternative_phone_number_textfield.setEditable(isEditable);
        address2_textfield.setEditable(isEditable);
        district_textfield.setEditable(isEditable);
        designation_textfield.setEditable(isEditable);
        job_title_Combobox.setEditable(isEditable);
        department_textfield.setEditable(isEditable);
        status_textfield.setEditable(isEditable);
        date_hired.setEditable(isEditable);
        department_textfield.setEditable(isEditable);
        salary_textfield.setEditable(isEditable);
    }

    public void employeeIDClicked(java.awt.event.MouseEvent e) {
        resetFormFields();
        employeeID.setEditable(true);
        button.setText("Search");
        button.setIcon(new ImageIcon("lib\\images\\search_employee.png"));
        FirstName_textfield.setEditable(false);
        gender_textfield.setEditable(false);
        email_textfield.setEditable(false);
        phone_number_textfield.setEditable(false);
        address1_textfield.setEditable(false);
        state_textfield.setEditable(false);
        LastName_textfield.setEditable(false);
        date_of_birth.setEditable(false);
        alternative_email_textfield.setEditable(false);
        alternative_phone_number_textfield.setEditable(false);
        address2_textfield.setEditable(false);
        district_textfield.setEditable(false);
        designation_textfield.setEditable(false);
        job_title_Combobox.setEditable(false);
        department_textfield.setEditable(false);
        status_textfield.setEditable(false);
        date_hired.setEditable(false);
        department_textfield.setEditable(false);
        salary_textfield.setEditable(false);
    }
}
