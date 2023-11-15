import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Employee_Attendance extends JPanel
{

    JLabel title = new JLabel("Employee Page");
    JPanel mainPanel = new JPanel();
    JPanel headingpanel = new JPanel();

    GradientPanel Present_panel = new GradientPanel(Color.decode("#000000"), Color.decode("#004ff9"), 50);
    JLabel Present_icon = new JLabel();
    JLabel Total = new JLabel("-");
    JLabel Present = new JLabel("Total Present");

    GradientPanel ontime_panel = new GradientPanel(Color.decode("#0c0014"), Color.decode("#0779E4"), 50);
    JLabel ontime_icon = new JLabel();
    JLabel ontime = new JLabel("-");
    JLabel ontime_employee = new JLabel("ON-Time");

    GradientPanel late_panel = new GradientPanel(Color.decode("#000046"), Color.decode("#1CB5E0"), 50);
    JLabel lateicon = new JLabel();
    JLabel late = new JLabel("-");
    JLabel late_employee = new JLabel("Late");

    GradientPanel absent_panel = new GradientPanel(Color.decode("#1A2980"), Color.decode("#26D0CE"), 50);
    JLabel absenticon = new JLabel();
    JLabel absent = new JLabel("-");
    JLabel absent_employee = new JLabel("Total Absent");

    JLabel heading = new JLabel("Attendance Table");
    Employee_attendance_tabel tabel = new Employee_attendance_tabel(); 

    Employee_Attendance() 
    {
        setBackground(new Color(206, 230, 243)); // new Color(206, 230, 243)
        setBounds(10, 50, 1480, 940);
        setLayout(null);

        title.setFont(new Font("Roboto", Font.BOLD, 30));
        title.setForeground(new Color(6, 143, 255));
        title.setBounds(8, 0, 250, 40);

        mainPanel.setBounds(8, 40, 1462, 200);
        mainPanel.setBackground(new Color(206, 230, 243));// new Color(240, 240, 240)
        mainPanel.setLayout(null);

        // Present_panel.setBackground(Color.decode("#e1ad01"));
        Present_panel.setBounds(10, 10, 345, 180);
        Present_panel.setLayout(null);
        Present_icon.setIcon(new ImageIcon("lib\\images\\TotalEmployees.png"));
        Present_icon.setBounds(220, 40, 100, 100);

        Total.setFont(new Font("Roboto", Font.BOLD, 50));
        Total.setForeground(new Color(240, 240, 240));
        Total.setBounds(40, 25, 50, 50);

        Present.setFont(new Font("Roboto", Font.BOLD, 25));
        Present.setForeground(new Color(240, 240, 240));
        Present.setBounds(40, 90, 200, 30);


        Present_panel.add(Present_icon);
        Present_panel.add(Total);
        Present_panel.add(Present);

        // add.setBackground(Color.decode("#d8bcab"))

        ontime_panel.setBounds(376, 10, 345, 180);
        ontime_panel.setLayout(null);
        ontime_icon.setIcon(new ImageIcon("lib\\images\\ontime.png"));
        ontime_icon.setBounds(220, 40, 100, 100);

        ontime.setFont(new Font("Roboto", Font.BOLD, 50));
        ontime.setForeground(new Color(240, 240, 240));
        ontime.setBounds(40, 25, 50, 50);

        ontime_employee.setFont(new Font("Roboto", Font.BOLD, 25));
        ontime_employee.setForeground(new Color(240, 240, 240));
        ontime_employee.setBounds(40, 90, 200, 30);

        ontime_panel.add(ontime_icon);
        ontime_panel.add(ontime);
        ontime_panel.add(ontime_employee);

        // late_panel.setBackground(Color.decode("#950714"));
        late_panel.setBounds(742, 10, 345, 180);
        late_panel.setLayout(null);
        lateicon.setIcon(new ImageIcon("lib\\images\\Late.png"));
        lateicon.setBounds(220, 40, 100, 100);

        late.setFont(new Font("Roboto", Font.BOLD, 50));
        late.setForeground(new Color(240, 240, 240));
        late.setBounds(40, 25, 50, 50);

        late_employee.setFont(new Font("Roboto", Font.BOLD, 25));
        late_employee.setForeground(new Color(240, 240, 240));
        late_employee.setBounds(40, 90, 200, 30);

        late_panel.add(lateicon);
        late_panel.add(late);
        late_panel.add(late_employee);

        // absent_panel.setBackground(Color.decode("#F78CA2"));
        absent_panel.setBounds(1107, 10, 345, 180);
        absent_panel.setLayout(null);
        absenticon.setIcon(new ImageIcon("lib\\images\\absent.png"));
        absenticon.setBounds(220, 40, 100, 100);

        absent.setFont(new Font("Roboto", Font.BOLD, 50));
        absent.setForeground(new Color(240, 240, 240));
        absent.setBounds(40, 25, 50, 50);

        absent_employee.setFont(new Font("Roboto", Font.BOLD, 25));
        absent_employee.setForeground(new Color(240, 240, 240));
        absent_employee.setBounds(40, 90, 200, 30);

        absent_panel.add(absenticon);
        absent_panel.add(absent);
        absent_panel.add(absent_employee);

        mainPanel.add(Present_panel);
        mainPanel.add(ontime_panel);
        mainPanel.add(late_panel);
        mainPanel.add(absent_panel);


        headingpanel.setBounds(12, 260, 1458,50);
        headingpanel.setBackground(new Color(206, 230, 243));
        headingpanel.setLayout(null);


        
        heading.setBounds(0,0,500,40);
        heading.setFont(new Font("Roboto", Font.BOLD, 30));
        heading.setForeground(new Color(6, 143, 255));

        headingpanel.add(heading);

        tabel.setVisible(true);
        tabel.setEnabled(true);

        add(title);
        add(mainPanel);
        add(headingpanel);
        add(tabel);
        loadAttendanceCounts();
    }

    // Load the attendance counts for today
    private void loadAttendanceCounts() {
        String url = "jdbc:mysql://localhost:3306/employee_payroll_system";
        String user = "root";
        String password = "3101";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            // Get the current date
            LocalDate today = LocalDate.now();
            String formattedDate = today.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

            // Calculate the time limit for considering late arrivals
            LocalTime lateArrivalTime = LocalTime.parse("09:00:00");

            // Query to count employees with different attendance statuses for today's date
            String query = "SELECT " +
                    "(SELECT COUNT(*) FROM attendance WHERE status = 'Present' AND attendance_date = ?) AS presentCount, "
                    +
                    "(SELECT COUNT(*) FROM attendance WHERE status = 'Absent' AND attendance_date = ?) AS absentCount, "
                    +
                    "(SELECT COUNT(*) FROM attendance WHERE status = 'Late' AND attendance_date = ? " +
                    "AND in_time > ?) AS lateCount, " +
                    "(SELECT COUNT(*) FROM attendance WHERE status = 'Present' AND attendance_date = ? " +
                    "AND in_time <= ?) AS onTimeCount";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, formattedDate);
            preparedStatement.setString(2, formattedDate);
            preparedStatement.setString(3, formattedDate);
            preparedStatement.setTime(4, Time.valueOf(lateArrivalTime));
            preparedStatement.setString(5, formattedDate);
            preparedStatement.setTime(6, Time.valueOf(lateArrivalTime));

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                Total.setText(resultSet.getString("presentCount"));
                absent.setText(resultSet.getString("absentCount"));
                late.setText(resultSet.getString("lateCount"));
                ontime.setText(resultSet.getString("onTimeCount"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}