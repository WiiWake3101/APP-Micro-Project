import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


class Admin_Employees extends JPanel
{
    JLabel title = new  JLabel("Employees");
    JPanel mainPanel = new JPanel();
    JPanel headingpanel = new JPanel();
    

    GradientPanel search_panel = new GradientPanel(Color.decode("#000000"), Color.decode("#004ff9"),50);
    JLabel searchicon = new JLabel(); 
    JLabel search = new JLabel("Search");
    JLabel search_employee = new JLabel("Employee");

    GradientPanel add_panel = new GradientPanel(Color.decode("#0c0014"), Color.decode("#0779E4"),50);
    JLabel add_icon = new JLabel(); 
    JLabel add = new JLabel("Add");
    JLabel add_employee = new JLabel("Employee");

    GradientPanel edit_panel = new GradientPanel(Color.decode("#000046"), Color.decode("#1CB5E0"),50);
    JLabel editicon = new JLabel(); 
    JLabel  edit = new JLabel("Edit");
    JLabel edit_employee = new JLabel("Employee");

    GradientPanel remove_panel = new GradientPanel(Color.decode("#1A2980"), Color.decode("#26D0CE"),50); 
    JLabel remoneicon = new JLabel(); 
    JLabel remove = new JLabel("Remove");   
    JLabel remove_employee = new JLabel("Employee"); 

    JLabel heading = new JLabel("Employee Table");
    Admin_EmployeeTable emp_tabel = new Admin_EmployeeTable();
    Admin_add_emplloyee add_emp = new Admin_add_emplloyee();
    Admin_edit_employee edit_emp = new Admin_edit_employee();
    Admin_search_employee search_emp = new Admin_search_employee();
    remove_employee remove_emp = new remove_employee();

    Admin_Employees()
    {
        setBackground(new Color(206, 230, 243)); //new Color(206, 230, 243)
        setBounds(10,50,1480,940);
        setLayout(null);

        title.setFont(new Font("Roboto", Font.BOLD, 30));
        title.setForeground(new Color(6, 143, 255));
        title.setBounds(8, 0 , 200 , 40);
        

        mainPanel.setBounds(8,40,1462,200);
        mainPanel.setBackground(new Color(206, 230, 243));//new Color(240, 240, 240)
        mainPanel.setLayout(null);

        //search_panel.setBackground(Color.decode("#e1ad01"));
        search_panel.setBounds(10,10,345,180);
        search_panel.setLayout(null);
        searchicon.setIcon(new ImageIcon("lib\\images\\search_name.png"));
        searchicon.setBounds(210, 40, 100, 100);

        search.setFont(new Font("Roboto", Font.BOLD, 30));
        search.setForeground(new Color(240, 240, 240));
        search.setBounds(40, 60, 200, 30);

        search_employee.setFont(new Font("Roboto", Font.BOLD, 30));
        search_employee.setForeground(new Color(240, 240, 240));
        search_employee.setBounds(40, 80, 200, 50);


        search_panel.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent e)
            {
                searchclicked(e);
            }
            
        });
        

        search_panel.add(searchicon);
        search_panel.add(search);
        search_panel.add(search_employee);
        

        //add.setBackground(Color.decode("#d8bcab"))
    
        add_panel.setBounds(376, 10, 345, 180);
        add_panel.setLayout(null);
        add_icon.setIcon(new ImageIcon("lib\\images\\plus.png"));
        add_icon.setBounds(210, 40, 100, 100);

        add.setFont(new Font("Roboto", Font.BOLD, 30));
        add.setForeground(new Color(240,240,240));
        add.setBounds(40, 60, 200, 30);

        add_employee.setFont(new Font("Roboto", Font.BOLD, 30));
        add_employee.setForeground(new Color(240,240,240));
        add_employee.setBounds(40, 80, 200, 50);
        

        add_panel.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent e)
            {
                addclicked(e);
            }
            

        });
        

        add_panel.add(add_icon);
        add_panel.add(add);
        add_panel.add(add_employee);


        //edit_panel.setBackground(Color.decode("#950714"));
        edit_panel.setBounds(742, 10, 345, 180);
        edit_panel.setLayout(null);
        editicon.setIcon(new ImageIcon("lib\\images\\edit.png"));
        editicon.setBounds(210, 40, 100, 100);

        edit.setFont(new Font("Roboto", Font.BOLD, 30));
        edit.setForeground(new Color(240,240,240));
        edit.setBounds(40, 60, 200, 30);

        edit_employee.setFont(new Font("Roboto", Font.BOLD, 30));
        edit_employee.setForeground(new Color(240,240,240));
        edit_employee.setBounds(40, 80, 200, 50);
        edit_panel.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent e)
            {
                editclicked(e);
            }
           
        });

      
        edit_panel.add(editicon);
        edit_panel.add(edit);
        edit_panel.add(edit_employee);

        //remove_panel.setBackground(Color.decode("#F78CA2"));
        remove_panel.setBounds(1107, 10, 345, 180);
        remove_panel.setLayout(null);
        remoneicon.setIcon(new ImageIcon("lib\\images\\remove.png"));
        remoneicon.setBounds(210, 40, 100, 100);

        remove.setFont(new Font("Roboto", Font.BOLD, 30));
        remove.setForeground(new Color(240,240,240));
        remove.setBounds(40, 60, 200, 30);

        remove_employee.setFont(new Font("Roboto", Font.BOLD, 30));
        remove_employee.setForeground(new Color(240,240,240));
        remove_employee.setBounds(40, 80, 200, 50);
        remove_panel.addMouseListener(new java.awt.event.MouseAdapter() 
        {
            public void mouseClicked(java.awt.event.MouseEvent e)
            {
                removeclicked(e);
            }
            
        });
        

        remove_panel.add(remoneicon);
        remove_panel.add(remove);
        remove_panel.add(remove_employee);


        mainPanel.add(search_panel);
        mainPanel.add(add_panel);
        mainPanel.add(edit_panel);
        mainPanel.add(remove_panel);


        headingpanel.setBounds(12, 260, 1458,50);
        headingpanel.setBackground(new Color(206, 230, 243));
        headingpanel.setLayout(null);


        
        heading.setBounds(0,0,500,40);
        heading.setFont(new Font("Roboto", Font.BOLD, 30));
        heading.setForeground(new Color(6, 143, 255));

        headingpanel.add(heading);

        

        emp_tabel.setVisible(true);
        emp_tabel.setEnabled(true);
        add_emp.setVisible(false);
        add_emp.setEnabled(false);
        edit_emp.setVisible(false);
        edit_emp.setEnabled(false);
        search_emp.setVisible(false);
        search_emp.setEnabled(false);
        remove_emp.setVisible(false);
        remove_emp.setEnabled(false);


        add(title);
        add(mainPanel);
        add(headingpanel);
        add(emp_tabel,0);
        add(add_emp,1);
        add(edit_emp,1);
        add(search_emp,1);
        add(remove_emp,1);
        
        
    }

    public void addclicked(java.awt.event.MouseEvent e)
    {
        heading.setText("Add Employee");
        emp_tabel.setVisible(false);
        add_emp.setVisible(true);
        add_emp.setEnabled(true);
        edit_emp.setVisible(false);
        search_emp.setVisible(false);
        search_emp.setEnabled(false);
        remove_emp.setVisible(false);
        remove_emp.setEnabled(false);
        

    }
     
    

    public void editclicked(java.awt.event.MouseEvent e)
    {
        heading.setText("Edit Employee");
        emp_tabel.setVisible(false);
        add_emp.setVisible(false);
        add_emp.setEnabled(false);
        edit_emp.setVisible(true);
        search_emp.setVisible(false);
        search_emp.setEnabled(false);
        remove_emp.setVisible(false);
        remove_emp.setEnabled(false);
        
    }
    

    public void searchclicked(java.awt.event.MouseEvent e)
    {
        heading.setText("Search Employee");
        emp_tabel.setVisible(false);
        add_emp.setVisible(false);
        add_emp.setEnabled(false);
        edit_emp.setVisible(false);
        search_emp.setVisible(true);
        search_emp.setEnabled(true);
        search_emp.search_button.setEnabled(true);
        search_emp.search_button.setVisible(true);
        search_emp.sortby_ComboBox.setEnabled(true);
        search_emp.sortby_ComboBox.setVisible(true);
        search_emp.table.setVisible(true);
        search_emp.table.setEnabled(true);
        search_emp.search_textfield.setVisible(true);
        search_emp.search_textfield.setEnabled(true);
        remove_emp.setVisible(false);
        remove_emp.setEnabled(false);
        
    }
    

    public void removeclicked(java.awt.event.MouseEvent e)
    {
        heading.setText("Remove Employee");
        emp_tabel.setVisible(false);
        add_emp.setVisible(false);
        add_emp.setEnabled(false);
        edit_emp.setVisible(false);
        search_emp.setVisible(false);
        search_emp.setEnabled(false);
        remove_emp.setVisible(true);
        remove_emp.setEnabled(true);
        
    }

    
    
}
