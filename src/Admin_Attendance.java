import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JMonthChooser;
import com.toedter.calendar.JYearChooser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



class Admin_Attendance extends JPanel
{
    JLabel title = new  JLabel("Attendance");
    JPanel TopPanel = new JPanel();
    JPanel panel = new JPanel();
    JPanel tabel_panel = new JPanel();


    GradientPanel sort_panel = new GradientPanel(Color.decode("#000000"), Color.decode("#004ff9"),50);
    JLabel sort_label = new JLabel("Sort by Date ");
    JLabel sort_icon = new JLabel(new ImageIcon("lib\\images\\sort.png"));
    JDateChooser sort_DateChooser = new JDateChooser();
    GradientButton sort_button = new GradientButton(Color.BLACK, Color.lightGray);



    GradientPanel search_name_panel = new GradientPanel(Color.decode("#000000"), Color.decode("#004ff9"),50); 
    JLabel search_name_label = new JLabel("Search Employee name");
    JLabel search_name_icon = new JLabel(new ImageIcon("lib\\images\\search_name.png"));
    JTextField search_name_textfield = new JTextField();
    GradientButton search_name_button = new GradientButton(Color.BLACK, Color.lightGray);
    


    GradientPanel search_id_panel = new GradientPanel(Color.decode("#000000"), Color.decode("#004ff9"),50); 
    JLabel search_id_label = new JLabel("Search Employee ID");
    JLabel search_id_icon = new JLabel(new ImageIcon("lib\\images\\search_name.png"));
    JTextField search_id_textfield = new JTextField();
    GradientButton search_id_button = new GradientButton(Color.BLACK, Color.lightGray);
    GradientButton search_button = new GradientButton(Color.decode("#004FF9"), Color.decode("#56CCF2"));
    DefaultTableModel model;
    
    private Connection dbConnection;
    public JTable table;
    public JTableHeader tableHeader;


    Admin_Attendance() {
        dbConnection = connectToDatabase();
        setBackground(new Color(206, 230, 243)); // new Color(206, 230, 243)
        setBounds(10, 50, 1480, 940);
        setLayout(null);

        title.setFont(new Font("Roboto", Font.BOLD, 30));
        title.setForeground(new Color(6, 143, 255));
        title.setBounds(8, 0, 350, 40);

        TopPanel.setBounds(15, 60, 1450, 200);
        TopPanel.setBackground(new Color(206, 230, 243));// new Color(240, 240, 240)
        TopPanel.setLayout(null);

        sort_panel.setBounds(0, 0, 450, 200);
        sort_panel.setLayout(null);
        sort_button.addActionListener(sortAction);

        sort_label.setFont(new Font("Roboto", Font.BOLD, 25));
        sort_label.setForeground(new Color(240, 240, 240));
        sort_label.setBounds(25, 30, 200, 30);

        sort_icon.setBounds(340, 20, 100, 100);

        JCalendar calendar = sort_DateChooser.getJCalendar();

        calendar.setWeekOfYearVisible(false);
        calendar.setFont(new Font("Roboto", Font.PLAIN, 10));
        calendar.setPreferredSize(new Dimension(350, 250));

        JMonthChooser month = sort_DateChooser.getJCalendar().getMonthChooser();
        month.setPreferredSize(new Dimension(200, 30));

        JYearChooser year = sort_DateChooser.getJCalendar().getYearChooser();
        year.setPreferredSize(new Dimension(70, 30));

        sort_DateChooser.setBounds(25, 70, 300, 40);
        sort_DateChooser.setBorder(BorderFactory.createLoweredBevelBorder());
        sort_DateChooser.setFont(new Font("Roboto", Font.BOLD, 20));
        sort_DateChooser.setForeground(Color.BLUE);
        sort_DateChooser.setBackground(Color.WHITE);
        //sort_DateChooser.setDateFormatString("YYYY-MM-dd");
        sort_DateChooser.setVisible(false);
        sort_DateChooser.setEnabled(false);

        sort_button.setText("Sort");
        sort_button.setBounds(250, 130, 150, 40);
        sort_button.setFont(new Font("Roboto", Font.BOLD, 25));
        sort_button.setForeground(Color.WHITE);
        sort_button.setBorder(BorderFactory.createEmptyBorder());
        sort_button.setFocusable(false);
        sort_button.setVisible(false);
        sort_button.setEnabled(false);

        // sort_DateChooser.addActionListener(this);

        sort_panel.add(sort_label);
        sort_panel.add(sort_icon);
        sort_panel.add(sort_DateChooser);
        sort_panel.add(sort_button);

        search_name_panel.setBounds(500, 0, 450, 200);
        search_name_panel.setLayout(null);
        search_name_button.addActionListener(searchNameAction);

        search_name_label.setFont(new Font("Roboto", Font.BOLD, 25));
        search_name_label.setForeground(new Color(240, 240, 240));
        search_name_label.setBounds(25, 30, 300, 30);

        search_name_icon.setBounds(340, 20, 100, 100);

        search_name_textfield.setBounds(25, 70, 300, 40);
        search_name_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        search_name_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        search_name_textfield.setForeground(Color.BLUE);
        search_name_textfield.setBackground(Color.WHITE);
        search_name_textfield.setVisible(false);
        search_name_textfield.setEnabled(false);

        search_name_button.setText("Search");
        search_name_button.setBounds(250, 130, 150, 40);
        search_name_button.setFont(new Font("Roboto", Font.BOLD, 25));
        search_name_button.setForeground(Color.WHITE);
        search_name_button.setBorder(BorderFactory.createEmptyBorder());
        search_name_button.setFocusable(false);
        search_name_button.setVisible(false);
        search_name_button.setEnabled(false);

        search_name_panel.add(search_name_label);
        search_name_panel.add(search_name_icon);
        search_name_panel.add(search_name_textfield);
        search_name_panel.add(search_name_button);

        search_id_panel.setBounds(1000, 0, 450, 200);
        search_id_panel.setLayout(null);
        search_id_button.addActionListener(searchIdAction);
        search_id_label.setFont(new Font("Roboto", Font.BOLD, 25));
        search_id_label.setForeground(new Color(240, 240, 240));
        search_id_label.setBounds(25, 30, 250, 30);

        search_id_icon.setBounds(340, 20, 100, 100);

        search_id_textfield.setBounds(25, 70, 300, 40);
        search_id_textfield.setBorder(BorderFactory.createLoweredBevelBorder());
        search_id_textfield.setFont(new Font("Roboto", Font.BOLD, 20));
        search_id_textfield.setForeground(Color.BLUE);
        search_id_textfield.setBackground(Color.WHITE);
        search_id_textfield.setVisible(false);
        search_id_textfield.setEnabled(false);

        search_id_button.setText("Search");
        search_id_button.setBounds(250, 130, 150, 40);
        search_id_button.setFont(new Font("Roboto", Font.BOLD, 25));
        search_id_button.setForeground(Color.WHITE);
        search_id_button.setBorder(BorderFactory.createEmptyBorder());
        search_id_button.setFocusable(false);
        search_id_button.setVisible(false);
        search_id_button.setEnabled(false);

        search_id_panel.add(search_id_label);
        search_id_panel.add(search_id_icon);
        search_id_panel.add(search_id_textfield);
        search_id_panel.add(search_id_button);

        TopPanel.add(sort_panel);
        TopPanel.add(search_id_panel);
        TopPanel.add(search_name_panel);

        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        panel.setBounds(15, 300, 1450, 620);
        panel.setLayout(new BorderLayout());

        JPanel tablePanel = new JPanel();
        tablePanel.setLayout(new BorderLayout()); // Use BorderLayout

        // Initialize the model and table
        model = new DefaultTableModel(new Object[][] {}, new String[] {
                "Employee Id",
                "First Name",
                "Last Name",
                "Attendance Date",
                "Status",
                "In time",
                "Out Time",
                "Over Time"
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
                java.awt.Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row,
                        column);
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
        table.setEnabled(false);
        table.setVisible(false);
        // Set fixed column widths
        int columnCount = model.getColumnCount();

        for (int i = 0; i < columnCount; i++) {
            table.getColumnModel().getColumn(i).setPreferredWidth(350); // You can adjust the width as needed
            table.getColumnModel().getColumn(i).setCellRenderer(customRenderer);
        }

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        // Set up horizontal scrolling for the table
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        // Get the table header and customize its font and height
        tableHeader = table.getTableHeader();

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
        

        // Set the scrollPane in the center of the BorderLayout
        tablePanel.add(scrollPane, BorderLayout.CENTER);
        add(title);
        add(TopPanel);
        panel.add(tablePanel, BorderLayout.CENTER);
        add(panel);
        fetchDataFromDatabase("SELECT * FROM attendance");

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

    private void fetchDataFromDatabase(String query, Object... params) {
    try {
        PreparedStatement preparedStatement = dbConnection.prepareStatement(query);

        // Bind any parameters to the prepared statement
        for (int i = 0; i < params.length; i++) {
            preparedStatement.setObject(i + 1, params[i]);
        }

        ResultSet resultSet = preparedStatement.executeQuery();

        // Clear the existing table data
        model.setRowCount(0);

        // Add rows to the table model with the retrieved data
        while (resultSet.next()) {
            model.addRow(new Object[]{
                resultSet.getInt("employee_id"),
                resultSet.getString("first_name"),
                resultSet.getString("last_name"),
                resultSet.getDate("attendance_date"), // Assuming the column type is DATE
                resultSet.getString("status"),
                resultSet.getTime("in_time"), // Assuming the column type is TIME
                resultSet.getTime("out_time"),  // Assuming the column type is TIME
                resultSet.getTime("overtime")
            });
        }

        resultSet.close();
        preparedStatement.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

    

private ActionListener sortAction = new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        // Get the selected date from your date picker (sort_DateChooser)
        // Assuming that sort_DateChooser.getDate() returns a java.util.Date
        java.util.Date utilDate = sort_DateChooser.getDate();
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

        // Use the selectedDate to construct an SQL query
        String query = "SELECT * FROM attendance WHERE attendance_date = ?";
        
        // Execute the query and update the table with the sorted data
        // You'll need to modify the fetchDataFromDatabase method to accept a query as a parameter
        fetchDataFromDatabase(query, sqlDate);
    }
};

private ActionListener searchIdAction = new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        // Get the employee ID from your input field (search_id_textfield)
        String employeeId = search_id_textfield.getText();

        // Use the employeeId to construct an SQL query
        String query = "SELECT * FROM attendance WHERE employee_id = ?";

        // Execute the query and update the table with the search results
        // You'll need to modify the fetchDataFromDatabase method to accept a query as a
        // parameter
        fetchDataFromDatabase(query, employeeId);
    }
};

private ActionListener searchNameAction = new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        // Get the name input from your input field (search_name_textfield)
        String name = search_name_textfield.getText();

        // Use the name to construct an SQL query
        String query = "SELECT * FROM attendance WHERE first_name LIKE ?";

        // Execute the query and update the table with the search results
        // You'll need to modify the fetchDataFromDatabase method to accept a query as a
        // parameter
        fetchDataFromDatabase(query, "%" + name + "%");
    }
};
    
}