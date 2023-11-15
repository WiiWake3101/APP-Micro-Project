import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.Dimension;

public class Employee_attendance_tabel extends JPanel{

    DefaultTableModel model;
    //private Connection dbConnection;
    public JTable table;
    public JTableHeader tableHeader;

    Employee_attendance_tabel() 
    {
        setBounds(12, 320, 1458, 600);
        setBackground(new Color(206, 230, 243));
        setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        setLayout(null);

        // Initialize the model and table
        model = new DefaultTableModel(new Object[][] {}, new String[] {
                "Date",
                "Status"
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
            table.getColumnModel().getColumn(i).setPreferredWidth(750); // You can adjust the width as needed
            table.getColumnModel().getColumn(i).setCellRenderer(customRenderer);
        }

        // Create a JScrollPane for the table
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setBounds(5, 5, 1448, 590);

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


        add(scrollPane);
        loadAttendanceData();
    }


    private void loadAttendanceData() {
        try {
            String url = "jdbc:mysql://localhost:3306/employee_payroll_system";
            String user = "root";
            String password = "3101";
    
            Connection connection = DriverManager.getConnection(url, user, password);
            String query = "SELECT * FROM attendance WHERE Name= ?";
            
            // Get today's date in the format "yyyy-MM-dd"
            LocalDate today = LocalDate.now();
            String formattedDate = today.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, formattedDate);
    
            ResultSet resultSet = preparedStatement.executeQuery();
    
            while (resultSet.next()) {
                String date = resultSet.getString("attendance_date");
                String status = resultSet.getString("status");
            
                // Set displayStatus based on status
                String displayStatus = status.equals("Present") ? "Present" : "Absent";
            
                // Add the data to the table
                model.addRow(new Object[] {date, displayStatus });
            }
    
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    } 
}