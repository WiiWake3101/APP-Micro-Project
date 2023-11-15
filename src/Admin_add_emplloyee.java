import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.Random;



class Admin_add_emplloyee extends JPanel implements java.awt.event.ActionListener
{
    //JPanel panel = new JPanel();
    JLabel FirstName_label = new JLabel("First Name");
    JTextField FirstName_textfield = new JTextField();
    JLabel Gender_label = new JLabel("Gender");
    JRadioButton Male = new JRadioButton("Male");
    JRadioButton Female = new JRadioButton("Female");
    ButtonGroup group = new ButtonGroup();
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
    JDateChooser date_of_birth = new JDateChooser();
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
    JDateChooser date_hired = new JDateChooser();
    JLabel job_title_label = new JLabel("Job Title");
    String[] jobTitles = {
            "Select",
            "Human Resources Manager",
            "Software Development Manager",
            "Frontend Developer",
            "Backend Developer",
            "Full-Stack Developer",
            "UX/UI Design",
            "Data Scientist",
            "Product Manager",
            "Sales Representative",
            "Customer Support Specialist"
        };
    JComboBox<String> job_title_Combobox = new JComboBox<>(jobTitles);
    JLabel salary_label = new JLabel("Salary");
    JTextField salary_textfield = new JTextField();


    JButton save_button = new JButton("Save",new ImageIcon("lib\\images\\Save.png"));

    //MessagePanel msg = new MessagePanel("Add Employee", "Sucessfully Employee Details are Stored","");
    JFrame message_frame = new JFrame();
    GradientButton messagebox_ok = new GradientButton(Color.decode("#004FF9"),Color.decode("#56CCF2"));
    
    Admin_add_emplloyee()
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
        //FirstName_textfield.setBackground(null);

        Gender_label.setFont(new Font("Roboto", Font.BOLD, 20)); 
        Gender_label.setForeground(Color.BLACK);
        Gender_label.setBounds(40, 100, 150, 20); 

        Male.setFont(new Font("Roboto", Font.BOLD, 20));
        Male.setBounds(40, 131, 70, 35);
        Male.setBackground(new Color(206, 230, 243));
        Male.setFocusable(false);
        Male.setForeground(Color.BLUE);

        Female.setFont(new Font("Roboto", Font.BOLD, 20));
        Female.setBounds(150, 131, 100, 35);
        Female.setBackground(new Color(206, 230, 243));
        Female.setForeground(Color.BLUE);
        Female.setFocusable(false);

        group.add(Female);
        group.add(Male);


        email_label.setFont(new Font("Roboto", Font.BOLD, 20)); 
        email_label.setForeground(Color.BLACK);
        email_label.setBounds(40, 180, 150, 20); 

        email_textfield.setBounds(40, 201, 400, 35);
        email_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        email_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        email_textfield.setForeground(Color.BLUE);


        phone_number_label.setFont(new Font("Roboto", Font.BOLD, 20)); 
        phone_number_label.setForeground(Color.BLACK);
        phone_number_label.setBounds(40, 260, 150, 20); 

        phone_number_textfield.setBounds(40, 281, 400, 35);
        phone_number_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        phone_number_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        phone_number_textfield.setForeground(Color.BLUE);

        address1_label.setFont(new Font("Roboto", Font.BOLD, 20)); 
        address1_label.setForeground(Color.BLACK);
        address1_label.setBounds(40, 350, 150, 20); 

        address1_textfield.setBounds(40, 371, 400, 35);
        address1_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        address1_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        address1_textfield.setForeground(Color.BLUE);


        state_label.setFont(new Font("Roboto", Font.BOLD, 20)); 
        state_label.setForeground(Color.BLACK);
        state_label.setBounds(40, 430, 150, 20); 

        state_textfield.setBounds(40, 451, 400, 35);
        state_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        state_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        state_textfield.setForeground(Color.BLUE);

        






        LastName_label.setFont(new Font("Roboto", Font.BOLD, 20)); 
        LastName_label.setForeground(Color.BLACK);
        LastName_label.setBounds(500, 20, 150, 20); 

        LastName_textfield.setBounds(500, 41, 400, 35);
        LastName_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        LastName_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        LastName_textfield.setForeground(Color.BLUE);


        date_of_birth_label.setFont(new Font("Roboto", Font.BOLD, 20));
        date_of_birth_label.setBounds(500, 100, 150, 20);
        date_of_birth_label.setForeground(Color.BLACK);
    
        date_of_birth.setBounds(500, 121, 400,35);
        date_of_birth.setFont(new Font("Roboto", Font.BOLD, 20));
        date_of_birth.setBorder(BorderFactory.createLoweredBevelBorder());
        date_of_birth.setOpaque(true);
        date_of_birth.setForeground(Color.BLUE);
        date_of_birth.setDateFormatString("yyyy-MM-dd");

        date_of_birth.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                if ("date".equals(evt.getPropertyName())) {
                    // Date property has changed (date selected or modified)
                    // You can get the selected date and handle it here
                    if (date_of_birth.getDate() != null) {
                        java.util.Date selectedDate = date_of_birth.getDate();
                        // Do something with the selected date, for example, print it
                        System.out.println("Selected Date: " + selectedDate);
                    } else {
                        // Handle the case where no date is selected
                        System.out.println("No date selected");
                    }
                }
            }
        });


        alternative_email_label.setFont(new Font("Roboto", Font.BOLD, 20)); 
        alternative_email_label.setForeground(Color.BLACK);
        alternative_email_label.setBounds(500, 180, 250, 20); 

        alternative_email_textfield.setBounds(500, 201, 400, 35);
        alternative_email_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        alternative_email_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        alternative_email_textfield.setForeground(Color.BLUE);


        alternative_phone_number_label.setFont(new Font("Roboto", Font.BOLD, 20)); 
        alternative_phone_number_label.setForeground(Color.BLACK);
        alternative_phone_number_label.setBounds(500, 260, 250, 20); 

        alternative_phone_number_textfield.setBounds(500, 281, 400, 35);
        alternative_phone_number_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        alternative_phone_number_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        alternative_phone_number_textfield.setForeground(Color.BLUE);


        address2_label.setFont(new Font("Roboto", Font.BOLD, 20)); 
        address2_label.setForeground(Color.BLACK);
        address2_label.setBounds(500, 350, 150, 20); 

        address2_textfield.setBounds(500, 371, 400, 35);
        address2_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        address2_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        address2_textfield.setForeground(Color.BLUE);


        district_label.setFont(new Font("Roboto", Font.BOLD, 20)); 
        district_label.setForeground(Color.BLACK);
        district_label.setBounds(500, 430, 150, 20); 

        district_textfield.setBounds(500, 451, 400, 35);
        district_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        district_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        district_textfield.setForeground(Color.BLUE);



        job_title_label.setFont(new Font("Roboto", Font.BOLD, 20)); 
        job_title_label.setForeground(Color.BLACK);
        job_title_label.setBounds(1020, 20, 150, 20); 

        job_title_Combobox.setBounds(1020, 41, 400, 35);
        job_title_Combobox.setBorder(BorderFactory.createLoweredBevelBorder());
        job_title_Combobox.setFont(new Font("Roboto", Font.BOLD, 20));
        job_title_Combobox.setForeground(Color.BLUE);
        job_title_Combobox.setBackground(Color.WHITE);
        job_title_Combobox.setFocusable(false);

        designation_label.setFont(new Font("Roboto", Font.BOLD, 20));
        designation_label.setBounds(1020, 100, 150, 20);
        designation_label.setForeground(Color.BLACK);
    
        designation_textfield.setBounds(1020, 121, 400, 35);
        designation_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        designation_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        designation_textfield.setForeground(Color.BLUE);
        
        status_label.setFont(new Font("Roboto", Font.BOLD, 20)); 
        status_label.setForeground(Color.BLACK);
        status_label.setBounds(1020, 180, 250, 20); 

        status_textfield.setBounds(1020, 201, 400, 35);
        status_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        status_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        status_textfield.setForeground(Color.BLUE);


        date_hired_label.setFont(new Font("Roboto", Font.BOLD, 20)); 
        date_hired_label.setForeground(Color.BLACK);
        date_hired_label.setBounds(1020, 260, 250, 20); 

        date_hired.setBounds(1020, 281, 400,35);
        date_hired.setFont(new Font("Roboto", Font.BOLD, 20));
        date_hired.setBorder(BorderFactory.createLoweredBevelBorder());
        date_hired.setOpaque(true);
        date_hired.setForeground(Color.BLUE);
        date_hired.setDateFormatString("yyyy-MM-dd");

        date_hired.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                if ("date".equals(evt.getPropertyName())) {
                    // Date property has changed (date selected or modified)
                    // You can get the selected date and handle it here
                    if (date_hired.getDate() != null) {
                        java.util.Date selectedDate = date_hired.getDate();
                        // Do something with the selected date, for example, print it
                        System.out.println("Selected Date Hired: " + selectedDate);
                    } else {
                        // Handle the case where no date is selected
                        System.out.println("No date hired selected");
                    }
                }
            }
        });
        
        department_label.setFont(new Font("Roboto", Font.BOLD, 20)); 
        department_label.setForeground(Color.BLACK);
        department_label.setBounds(1020, 350, 150, 20); //350

        department_textfield.setBounds(1020, 371, 400, 35);//371
        department_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        department_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        department_textfield.setForeground(Color.BLUE);

        salary_label.setFont(new Font("Roboto", Font.BOLD, 20)); 
        salary_label.setForeground(Color.BLACK);
        salary_label.setBounds(1020, 430, 150, 20); 

        salary_textfield.setBounds(1020, 451, 400, 35);
        salary_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        salary_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        salary_textfield.setForeground(Color.BLUE);


        save_button.setBounds(1120, 530, 300, 40);
        save_button.setFocusable(false);
        save_button.setFont(new Font("Roboto", Font.BOLD, 30));
        save_button.setBorder(BorderFactory.createRaisedBevelBorder());
        save_button.setBackground(new Color(240, 240, 240));
        save_button.addMouseListener(new MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent e)
            {
                saveEntered(e);
            }
            public void mouseExited(java.awt.event.MouseEvent e)
            {
                saveExited(e);
            }
        });
        save_button.addActionListener(this);



        add(FirstName_label);
        add(FirstName_textfield);
        add(Gender_label);
        add(Male);
        add(Female);
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

        add(save_button);



    }

    public void saveEntered(java.awt.event.MouseEvent e)
    {
        save_button.setBorder(BorderFactory.createLoweredBevelBorder());
        save_button.setBackground(new Color(192, 192, 192));
    }
    public void saveExited(java.awt.event.MouseEvent e)
    {
        save_button.setBorder(BorderFactory.createRaisedBevelBorder());
        save_button.setBackground(new Color(240, 240, 240));
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

            message_panel.setBounds(700,400, 500, 200);
            message_panel.setOpaque(true);
            message_panel.setLayout(null);
            //message_panel.setBackground(Color.BLACK);//(new Color(1.0f,1.0f,1.0f,0.0f));
            

            messagebox_ok.setBounds(320 ,140, 150, 40);
            messagebox_ok.setBorder(BorderFactory.createEmptyBorder());
            messagebox_ok.setText("OK");
            messagebox_ok.setFont(new Font("Roboto", Font.BOLD, 25));
            messagebox_ok.setForeground(new Color(240,240, 240));
            messagebox_ok.setFocusable(false);
            messagebox_ok.setEnabled(true);
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
    public void user_password_box(String h,String c1,String user,String pass)
    {
        
        GradientPanel message_panel = new GradientPanel(new Color(245,245,245),new Color(245,245,245),30);
        
        //GradientButton cancel = new GradientButton(Color.decode("#004FF9"),Color.decode("#56CCF2"));

        JLabel heading = new JLabel();
        JLabel content = new JLabel();
        JLabel username = new JLabel();
        JLabel password = new JLabel();

        
        message_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // 
        message_frame.setSize(1920,1080); // message_frame size
        message_frame.setLocationRelativeTo(null);  // display message_frame in center of screen
        message_frame.setUndecorated(true);
        message_frame.setLayout(null);
        //getContentPane().setBackground(new Color(0,0,0));
        message_frame.setIconImage(new ImageIcon("lib\\images\\companylogo.png").getImage());
        message_frame.setBackground(new Color(0.f,0.0f,0.0f,0.6f));

        message_panel.setBounds(750,450, 500, 250);
        message_panel.setOpaque(true);
        message_panel.setLayout(null);
        //message_panel.setBackground(Color.BLACK);//(new Color(1.0f,1.0f,1.0f,0.0f));
        

        messagebox_ok.setBounds(320 ,175, 150, 40);
        messagebox_ok.setBorder(BorderFactory.createEmptyBorder());
        messagebox_ok.setText("OK");
        messagebox_ok.setFont(new Font("Roboto", Font.BOLD, 25));
        messagebox_ok.setForeground(new Color(240,240, 240));
        messagebox_ok.setFocusable(false);
        messagebox_ok.setEnabled(true);
        messagebox_ok.addActionListener(this);


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

        username.setBounds(50 , 125, 400, 30);
        username.setText("Username : "+user);
        username.setFont(new Font("Roboto", Font.BOLD, 20));
        username.setForeground(Color.decode("#004FF9"));

        password.setBounds(51 , 150, 400, 30);
        password.setText("Password : "+pass);
        password.setFont(new Font("Roboto", Font.BOLD, 20));
        password.setForeground(Color.decode("#004FF9"));



        message_panel.add(messagebox_ok);
        message_panel.add(heading);
        message_panel.add(content);
        message_panel.add(username);
        message_panel.add(password);



        message_frame.add(message_panel);
        message_frame.setVisible(true);

    }

    private boolean areFieldsEmpty() {
        return FirstName_textfield.getText().isEmpty() ||
               LastName_textfield.getText().isEmpty() ||
               ((JTextField) date_of_birth.getDateEditor().getUiComponent()).getText().isEmpty() ||
               (!Male.isSelected() && !Female.isSelected()) ||
               email_textfield.getText().isEmpty() ||
               phone_number_textfield.getText().isEmpty() ||
               address1_textfield.getText().isEmpty() ||
               address2_textfield.getText().isEmpty() ||
               state_textfield.getText().isEmpty() ||
               alternative_email_textfield.getText().isEmpty() ||
               alternative_phone_number_textfield.getText().isEmpty() ||
               district_textfield.getText().isEmpty() ||
               department_textfield.getText().isEmpty() ||
               designation_textfield.getText().isEmpty() ||
               status_textfield.getText().isEmpty() ||
               ((JTextField) date_hired.getDateEditor().getUiComponent()).getText().isEmpty() ||
               job_title_Combobox.getSelectedIndex() == 0 || // Check if "Select" is selected
               salary_textfield.getText().isEmpty();
    } 
    
    private void clearFields() {
        FirstName_textfield.setText(null);
        Male.setSelected(false);
        Female.setSelected(false);
        email_textfield.setText(null);
        phone_number_textfield.setText(null);
        address1_textfield.setText(null);
        state_textfield.setText(null);
        LastName_textfield.setText(null);
        ((JTextField) date_of_birth.getDateEditor().getUiComponent()).setText(null);
        alternative_email_textfield.setText(null);
        alternative_phone_number_textfield.setText(null);
        address2_textfield.setText(null);
        district_textfield.setText(null);
        job_title_Combobox.setSelectedIndex(0); // Select the first item (assumed to be "Select")
        department_textfield.setText(null);
        designation_textfield.setText(null);
        status_textfield.setText(null);
        ((JTextField) date_hired.getDateEditor().getUiComponent()).setText(null);
        salary_textfield.setText(null);
    }    

    public void  actionPerformed(java.awt.event.ActionEvent e)
    {
        
        if (e.getSource() == save_button) 
        {
            if (areFieldsEmpty()) {
                messagebox("Error", "Please fill out all the fields.");
            } else {
                String firstname = FirstName_textfield.getText();
                String lastName = LastName_textfield.getText();
                String dateOfBirth = ((JTextField) date_of_birth.getDateEditor().getUiComponent()).getText();
                java.sql.Date sqlDateOfBirth = null; // Initialize with null    
                if (!dateOfBirth.isEmpty()) {
                    // Convert the selected date to a java.sql.Date object for database insertion
                    java.util.Date dateOfBirthDate = date_of_birth.getDate();
                    sqlDateOfBirth = new java.sql.Date(dateOfBirthDate.getTime());
                }
            
                String gender = Male.isSelected() ? "Male" : "Female";
                String email = email_textfield.getText();
                String phoneNumber = phone_number_textfield.getText();
                String address1 = address1_textfield.getText();
                String address2 = address2_textfield.getText();
                String state = state_textfield.getText();
                String alternativeEmail = alternative_email_textfield.getText();
                String alternativePhoneNumber = alternative_phone_number_textfield.getText();
                String district = district_textfield.getText();
                String department = department_textfield.getText();
                String designation = designation_textfield.getText();
                String status = status_textfield.getText();
                String dateHired = ((JTextField) date_hired.getDateEditor().getUiComponent()).getText();
                java.sql.Date sqlDateHired = null; // Initialize with null
                if (!dateHired.isEmpty()) {
                    // Convert the selected date to a java.sql.Date object for database insertion
                    java.util.Date dateHiredDate = date_hired.getDate();
                    sqlDateHired = new java.sql.Date(dateHiredDate.getTime());
                }
                String jobTitle = (String) job_title_Combobox.getSelectedItem(); // Dropdown menu Selected option will be picked
                String salary = salary_textfield.getText();
                Double salaryValue = null;
                // Check if the salary is not empty
                if (!salary.isEmpty()) {
                    try {
                        salaryValue = Double.parseDouble(salary);
                    } catch (NumberFormatException ex) {
                        salaryValue = null;
                    }
                }
                // JDBC Connection Parameters
                String jdbcURL = "jdbc:mysql://localhost:3306/employee_payroll_system";
                String dbUsername = "root";
                String dbPassword = "3101";
                Connection connection = null;
                try {
                    connection = DriverManager.getConnection(jdbcURL, dbUsername, dbPassword);
                    connection.setAutoCommit(false);
            
                    String insertEmployeeSQL = "INSERT INTO employee (FirstName, LastName, DateOfBirth, Gender, Email, PhoneNumber, " +
                    "Address1, Address2, State, AlternativeEmail, AlternativePhoneNumber, District, Department, " +
                    "Designation, Status, DateHired, JobTitle, Salary) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
                    PreparedStatement employeeInsertStatement = connection.prepareStatement(insertEmployeeSQL);
                    employeeInsertStatement.setString(1, firstname);
                    employeeInsertStatement.setString(2, lastName);
            
                    if (sqlDateOfBirth != null) {
                        employeeInsertStatement.setDate(3, sqlDateOfBirth);
                    } else {
                        employeeInsertStatement.setNull(3, java.sql.Types.DATE); // Set to null if the date is empty
                    }
            
                    employeeInsertStatement.setString(4, gender);
                    employeeInsertStatement.setString(5, email);
                    employeeInsertStatement.setString(6, phoneNumber);
                    employeeInsertStatement.setString(7, address1);
                    employeeInsertStatement.setString(8, address2);
                    employeeInsertStatement.setString(9, state);
                    employeeInsertStatement.setString(10, alternativeEmail);
                    employeeInsertStatement.setString(11, alternativePhoneNumber);
                    employeeInsertStatement.setString(12, district);
                    employeeInsertStatement.setString(13, department);
                    employeeInsertStatement.setString(14, designation);
                    employeeInsertStatement.setString(15, status);
            
                    if (sqlDateHired != null) {
                        employeeInsertStatement.setDate(16, sqlDateHired);
                    } else {
                        employeeInsertStatement.setNull(16, java.sql.Types.DATE); // Set to null if the date is empty
                    }
            
                    employeeInsertStatement.setString(17, jobTitle);
            
                    if (salaryValue != null) {
                        employeeInsertStatement.setDouble(18, salaryValue);
                    } else {
                        employeeInsertStatement.setNull(18, java.sql.Types.DOUBLE);
                    }
            
                    // Execute the INSERT statement...
                    employeeInsertStatement.executeUpdate();
            
                    // Fetch PositionID based on jobTitle...
                    String selectPositionIDSQL = "SELECT PositionID FROM employeepositionstatus WHERE PositionName = ?";
                    PreparedStatement selectPositionIDStatement = connection.prepareStatement(selectPositionIDSQL);
                    selectPositionIDStatement.setString(1, jobTitle); // Provide the jobTitle
                    int positionID = -1; // Default value
                    ResultSet resultSet = selectPositionIDStatement.executeQuery();
            
                    if (resultSet.next()) {
                        positionID = resultSet.getInt("PositionID");
                    }
            
                    resultSet.close();
                    selectPositionIDStatement.close();
            
                    String updatePositionStatusSQL = "UPDATE employeepositionstatus SET CurrentEmployees = CurrentEmployees + 1, " +
                        "RequiredEmployees = RequiredEmployees - 1 WHERE PositionID = ?";
                    PreparedStatement positionStatusUpdateStatement = connection.prepareStatement(updatePositionStatusSQL);
                    positionStatusUpdateStatement.setInt(1, positionID);

                    // Generate random username and password
                    String randomUsername = generateRandomUsername(firstname, lastName);
                    String randomPassword = generateRandomPassword();

                    // Define the default privilege for the default employee
                    String defaultPrivilege = "employee"; // Modify this value as needed

                    // Insert the username, password, and privilege into the login table
                    String insertLoginSQL = "INSERT INTO login (Username, Password, Privilege) VALUES (?, ?, ?)";
                    PreparedStatement loginInsertStatement = connection.prepareStatement(insertLoginSQL);
                    loginInsertStatement.setString(1, randomUsername);
                    loginInsertStatement.setString(2, randomPassword);
                    loginInsertStatement.setString(3, defaultPrivilege); // Set the privilege value

                    // Execute the update statement...
                    positionStatusUpdateStatement.executeUpdate();
            
                    // Commit the transaction...
                    connection.commit();
                    employeeInsertStatement.close();
                    positionStatusUpdateStatement.close();
                    connection.close();
            
                    System.out.println("Data has been successfully inserted into the database.");
                    user_password_box("Add Employee", "Successfully Employee Details are Stored",randomUsername,randomPassword);
                    clearFields();

                } catch (SQLException ex) {
                    ex.printStackTrace();
            
                    try {
                        if (connection != null) {
                            connection.rollback();
                        }
                    } catch (SQLException rollbackEx) {
                        rollbackEx.printStackTrace();
                    }
                } finally {
                    try {
                        if (connection != null) {
                            connection.close();
                        }
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
            }            
        }
        if (e.getSource() == messagebox_ok) {
            message_frame.dispose();
        }
    }
    public String generateRandomUsername(String firstName, String lastName) {
        // Get the first letter of the first name and last name
        char firstLetterFirstName = firstName.charAt(0);
        char firstLetterLastName = lastName.charAt(0);
    
        // Generate a random 4-digit number
        Random random = new Random();
        int randomDigits = random.nextInt(9000) + 1000;
    
        // Combine the letters and digits to create the username
        String username = Character.toString(firstLetterFirstName) +
                         Character.toString(firstLetterLastName) +
                         String.format("%04d", randomDigits);
    
        return username;
    }
    public String generateRandomPassword() {
        // Generate a random 8-character password (you can modify the length if needed)
        String password = "";
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    
        Random random = new Random();
        for (int i = 0; i < 8; i++) {
            int index = random.nextInt(characters.length());
            password += characters.charAt(index);
        }
    
        return password;
    }    
}
