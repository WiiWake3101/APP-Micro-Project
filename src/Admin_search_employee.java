import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

import java.awt.Dimension;

public class Admin_search_employee extends JPanel implements ActionListener {

    JPanel search_panel = new JPanel();
    JLabel search_label = new JLabel("Search by ");
    String[] option = {
            "Select",
            "Employee ID",
            "First Name",
            "Last Name",
            "State",
            "District",
            "Job Title",
            "Designation",
            "Status",
            "Date Hired",
            "Department",
            "Salary"
    };
    JComboBox<String> sortby_ComboBox = new JComboBox<>(option);
    JTextField search_textfield = new JTextField();
    JLabel collan = new JLabel(":");
    GradientButton search_button = new GradientButton(Color.decode("#004FF9"), Color.decode("#56CCF2"));
    DefaultTableModel model;
    private Connection dbConnection;
    public JTable table;
    public JTableHeader tableHeader;

    Admin_search_employee() {
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
        search_label.setBounds(145, 12, 150, 30);

        sortby_ComboBox.setBounds(275, 12, 200, 35);
        sortby_ComboBox.setBorder(BorderFactory.createLoweredBevelBorder());
        sortby_ComboBox.setFont(new Font("Roboto", Font.BOLD, 20));
        sortby_ComboBox.setForeground(Color.BLUE);
        sortby_ComboBox.setBackground(null);
        sortby_ComboBox.setFocusable(false);
        sortby_ComboBox.addActionListener(this);

        collan.setFont(new Font("Roboto", Font.BOLD, 40));
        collan.setForeground(Color.BLACK);
        collan.setBounds(530, 5, 20, 40);

        search_textfield.setBounds(600, 12, 500, 35);
        search_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        search_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        search_textfield.setForeground(Color.BLUE);
        search_textfield.setEditable(false);

        search_button.setBounds(1200, 10, 150, 40);
        search_button.setBorder(BorderFactory.createEmptyBorder());
        search_button.setText("Search");
        search_button.setFont(new Font("Roboto", Font.BOLD, 25));
        search_button.setForeground(new Color(240, 240, 240));
        search_button.setFocusable(false);
        search_button.addActionListener(this);

        search_panel.add(search_label);
        search_panel.add(sortby_ComboBox);
        search_panel.add(collan);
        search_panel.add(search_textfield);
        search_panel.add(search_button);

        // Initialize the model and table
        model = new DefaultTableModel(new Object[][] {}, new String[] {
                "Employee ID",
                "First Name",
                "Last Name",
                "Gender",
                "Date of birth",
                "Email",
                "Alternative email",
                "Phone number",
                "Alternative phone number",
                "State",
                "District",
                "Department",
                "Designation",
                "Status",
                "Date hired",
                "Job title",
                "Salary"
        });

        table = new JTable(model) {
            
            public boolean isCellEditable(int row, int column) {
                return false; // Make all cells non-editable
            }
        };

        table.setFont(new Font("Roboto", Font.PLAIN, 18)); // Increase text size

        // Create a custom TableCellRenderer for the desired column
        DefaultTableCellRenderer customRenderer = new DefaultTableCellRenderer() {
            
            public java.awt.Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
                    boolean hasFocus, int row, int column) {
                java.awt.Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if (column == 0) { // Change 0 to the column index you want to customize
                    table.setRowHeight(row, 45); // Set the desired row height for data in the specified column
                }
                return c;
            }
        };
        customRenderer.setHorizontalAlignment(0);

        // Apply the custom renderer to the specified column
        table.getColumnModel().getColumn(0).setCellRenderer(customRenderer);
        table.setRowSelectionAllowed(false);
        table.setFont(new Font("Roboto", Font.BOLD, 20));
        // Set fixed column widths
        int columnCount = model.getColumnCount();

        
        

        for (int i = 0; i < columnCount; i++) {
            table.getColumnModel().getColumn(i).setPreferredWidth(300); // You can adjust the width as needed
            table.getColumnModel().getColumn(i).setCellRenderer(customRenderer);
        }

        // Create a JScrollPane for the table
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setBounds(5, 60, 1449, 536);

        // Set up horizontal scrolling for the table
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        // Get the table header and customize its font and height
        tableHeader = table.getTableHeader();
        // Set the header height for the entire table
        // Set the header height for the entire table
        //table.getTableHeader().setPreferredSize(new java.awt.Dimension(30, 10));
        // Set the header background color
        tableHeader.setBackground(Color.decode("#004FF9")); // Change the color as needed
        // Set the header foreground (text) color
        tableHeader.setForeground(Color.WHITE);
        tableHeader.setFont(new Font("Roboto", Font.BOLD, 25)); // Increase header font size
        tableHeader.setPreferredSize(new Dimension(40, 50)); // Set header height
        tableHeader.setBorder(BorderFactory.createRaisedBevelBorder());
        tableHeader.setResizingAllowed(false);
        // Disable column reordering
        table.getTableHeader().setReorderingAllowed(false);

        TableColumn alter_ph_no = table.getColumnModel().getColumn(8);
        alter_ph_no.setPreferredWidth(320);

        TableColumn alter_job_title = table.getColumnModel().getColumn(15);
        alter_job_title.setPreferredWidth(350);

        
        

        add(search_panel);
        add(scrollPane);

        try {
            String dbUrl = "jdbc:mysql://localhost:3306/employee_payroll_system";
            String dbUser = "root";
            String dbPassword = "3101";
            dbConnection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
            updateTable(); // Initial table data retrieval
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void actionPerformed(ActionEvent e) {
        Object selectedOption = (String) sortby_ComboBox.getSelectedItem();
        String searchText = search_textfield.getText();
        if(e.getSource()==sortby_ComboBox)
        {
            if (selectedOption.equals("Select")) 
            {
                search_textfield.setText("");
                search_textfield.setEditable(false);
                updateTable(); // Reset the table to show all data
            } 
            else {
                search_textfield.setText(null);
                search_textfield.setEditable(true);
            }
        }
       
        if (e.getSource() == search_button) {
            String query = "";
            if (selectedOption.equals("Employee ID")) {
                query = "SELECT * FROM Employee WHERE EmployeeID = ?";
            } else if (selectedOption.equals("First Name")) {
                query = "SELECT * FROM Employee WHERE FirstName = ?";
            } else if (selectedOption.equals("Last Name")) {
                query = "SELECT * FROM Employee WHERE LastName = ?";
            } else if (selectedOption.equals("State")) {
                query = "SELECT * FROM Employee WHERE State = ?";
            } else if (selectedOption.equals("District")) {
                query = "SELECT * FROM Employee WHERE District = ?";
            } else if (selectedOption.equals("Job Title")) {
                query = "SELECT * FROM Employee WHERE JobTitle = ?";
            } else if (selectedOption.equals("Designation")) {
                query = "SELECT * FROM Employee WHERE Designation = ?";
            } else if (selectedOption.equals("Status")) {
                query = "SELECT * FROM Employee WHERE Status = ?";
            } else if (selectedOption.equals("Date Hired")) {
                query = "SELECT * FROM Employee WHERE DateHired = ?";
            } else if (selectedOption.equals("Department")) {
                query = "SELECT * FROM Employee WHERE Department = ?";
            } else if (selectedOption.equals("Salary")) {
                query = "SELECT * FROM Employee WHERE Salary = ?";
            }

            try (PreparedStatement preparedStatement = dbConnection.prepareStatement(query)) {
                preparedStatement.setString(1, searchText);
                ResultSet resultSet = preparedStatement.executeQuery();

                model.setRowCount(0); // Clear existing data

                while (resultSet.next()) {
                    // Populate the table with search results
                    int employeeID = resultSet.getInt("EmployeeID");
                    String firstName = resultSet.getString("FirstName");
                    String lastName = resultSet.getString("LastName");
                    String gender = resultSet.getString("Gender");
                    String dateOfBirth = resultSet.getString("DateOfBirth");
                    String email = resultSet.getString("Email");
                    String alternativeEmail = resultSet.getString("AlternativeEmail");
                    String phoneNumber = resultSet.getString("PhoneNumber");
                    String alternativePhoneNumber = resultSet.getString("AlternativePhoneNumber");
                    String state = resultSet.getString("State");
                    String district = resultSet.getString("District");
                    String department = resultSet.getString("Department");
                    String designation = resultSet.getString("Designation");
                    String status = resultSet.getString("Status");
                    String dateHired = resultSet.getString("DateHired");
                    String jobTitle = resultSet.getString("JobTitle");
                    String salary = resultSet.getString("Salary");

                    model.addRow(new Object[] {
                            employeeID, firstName, lastName, gender, dateOfBirth, email, alternativeEmail, phoneNumber,
                            alternativePhoneNumber, state, district, department, designation, status, dateHired,
                            jobTitle, salary
                    });
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    // Method to update the table with fresh data
    public void updateTable() {
        try {
            String query = "SELECT * FROM Employee";
            PreparedStatement preparedStatement = dbConnection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            model.setRowCount(0); // Clear existing data

            while (resultSet.next()) {
                // Populate the table with the latest data
                int employeeID = resultSet.getInt("EmployeeID");
                String firstName = resultSet.getString("FirstName");
                String lastName = resultSet.getString("LastName");
                String gender = resultSet.getString("Gender");
                String dateOfBirth = resultSet.getString("DateOfBirth");
                String email = resultSet.getString("Email");
                String alternativeEmail = resultSet.getString("AlternativeEmail");
                String phoneNumber = resultSet.getString("PhoneNumber");
                String alternativePhoneNumber = resultSet.getString("AlternativePhoneNumber");
                String state = resultSet.getString("State");
                String district = resultSet.getString("District");
                String department = resultSet.getString("Department");
                String designation = resultSet.getString("Designation");
                String status = resultSet.getString("Status");
                String dateHired = resultSet.getString("DateHired");
                String jobTitle = resultSet.getString("JobTitle");
                String salary = resultSet.getString("Salary");

                model.addRow(new Object[] {
                    employeeID, firstName, lastName, gender, dateOfBirth, email, alternativeEmail, phoneNumber,
                    alternativePhoneNumber, state, district, department, designation, status, dateHired, jobTitle, salary
                });
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}