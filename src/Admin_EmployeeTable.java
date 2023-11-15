import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;


class Admin_EmployeeTable extends JPanel
{
    Admin_EmployeeTable()
    {

        JPanel column = new JPanel();
        JLabel Position = new JLabel("Position",JLabel.CENTER);
        JLabel Total_Empolyee = new JLabel("Total Empolyee",JLabel.CENTER);
        JLabel Current = new JLabel("Current",JLabel.CENTER);
        JLabel Required = new JLabel("Required",JLabel.CENTER);

        JPanel row1 = new JPanel();
        JLabel r1Position = new JLabel("Human Resources Manager");
        JLabel r1Tot_Emp = new JLabel("-",JLabel.CENTER);
        JLabel r1Current = new JLabel("-",JLabel.CENTER);
        JLabel r1required = new JLabel("-",JLabel.CENTER);

        JPanel row2 = new JPanel();
        JLabel r2Position = new JLabel("Software Development Manager");
        JLabel r2Tot_Emp = new JLabel("-",JLabel.CENTER);
        JLabel r2Current = new JLabel("-",JLabel.CENTER);
        JLabel r2required = new JLabel("-",JLabel.CENTER);

        JPanel row3 = new JPanel();
        JLabel r3Position = new JLabel("Frontend Developer");
        JLabel r3Tot_Emp = new JLabel("-",JLabel.CENTER);
        JLabel r3Current = new JLabel("-",JLabel.CENTER);
        JLabel r3required = new JLabel("-",JLabel.CENTER);

        JPanel row4 = new JPanel();
        JLabel r4Position = new JLabel("Backend Developer");
        JLabel r4Tot_Emp = new JLabel("-",JLabel.CENTER);
        JLabel r4Current = new JLabel("-",JLabel.CENTER);
        JLabel r4required = new JLabel("-",JLabel.CENTER);

        JPanel row5 = new JPanel();
        JLabel r5Position = new JLabel("Full-Stack Developer");
        JLabel r5Tot_Emp = new JLabel("-",JLabel.CENTER);
        JLabel r5Current = new JLabel("-",JLabel.CENTER);
        JLabel r5required = new JLabel("-",JLabel.CENTER);

        JPanel row6 = new JPanel();
        JLabel r6Position = new JLabel("UX/UI Design");
        JLabel r6Tot_Emp = new JLabel("-",JLabel.CENTER);
        JLabel r6Current = new JLabel("-",JLabel.CENTER);
        JLabel r6required = new JLabel("-",JLabel.CENTER);

        JPanel row7 = new JPanel();
        JLabel r7Position = new JLabel("Data Scientist");
        JLabel r7Tot_Emp = new JLabel("-",JLabel.CENTER);
        JLabel r7Current = new JLabel("-",JLabel.CENTER);
        JLabel r7required = new JLabel("-",JLabel.CENTER);

        JPanel row8 = new JPanel();
        JLabel r8Position = new JLabel("Product Manager");
        JLabel r8Tot_Emp = new JLabel("-",JLabel.CENTER);
        JLabel r8Current = new JLabel("-",JLabel.CENTER);
        JLabel r8required = new JLabel("-",JLabel.CENTER);

        JPanel row9 = new JPanel();
        JLabel r9Position = new JLabel("Sales Representative");
        JLabel r9Tot_Emp = new JLabel("-",JLabel.CENTER);
        JLabel r9Current = new JLabel("-",JLabel.CENTER);
        JLabel r9required = new JLabel("-",JLabel.CENTER);

        JPanel row10 = new JPanel();
        JLabel r10Position = new JLabel("Customer Support Specialist");
        JLabel r10Tot_Emp = new JLabel("-",JLabel.CENTER);
        JLabel r10Current = new JLabel("-",JLabel.CENTER);
        JLabel r10required = new JLabel("-",JLabel.CENTER);

        JPanel row11 = new JPanel();
        JLabel r11Position = new JLabel("");
        JLabel r11Tot_Emp = new JLabel("-",JLabel.CENTER);
        JLabel r11Current = new JLabel("-",JLabel.CENTER);
        JLabel r11required = new JLabel("-",JLabel.CENTER);


        setBounds(12, 320, 1458, 600);
        setBackground(new Color(240, 240, 240));
        setLayout(null);

        column.setLayout(null);
        column.setBackground(new Color(36,33,36));
        column.setBounds(0, 0, 1458, 50);
        

        Position.setFont(new Font("Roboto", Font.BOLD, 30));
        Position.setBounds(0, 0, 500, 50);
        Position.setForeground(new Color(240,240,240));
        Position.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));


        Total_Empolyee.setFont(new Font("Roboto", Font.BOLD, 30));
        Total_Empolyee.setBounds(518, 0, 300, 50);
        Total_Empolyee.setForeground(new Color(240,240,240));
        Total_Empolyee.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
        

        Current.setFont(new Font("Roboto", Font.BOLD, 30));
        Current.setBounds(838, 0, 300, 50);
        Current.setForeground(new Color(240,240,240));
        Current.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));

        Required.setFont(new Font("Roboto", Font.BOLD, 30));
        Required.setBounds(1158, 0, 300, 50);
        Required.setForeground(new Color(240,240,240));
        Required.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));

        


        column.add(Position);
        column.add(Total_Empolyee);
        column.add(Current);
        column.add(Required);


        row1.setBackground(new Color(240, 240, 240));
        row1.setBounds(0, 50, 1458, 50);
        row1.setLayout(null);

        r1Position.setFont(new Font("Roboto", Font.BOLD, 25));
        r1Position.setBounds(20, 0, 500, 50);
        r1Position.setForeground(new Color(36,33,36));

        r1Tot_Emp.setFont(new Font("Roboto", Font.BOLD, 25));
        r1Tot_Emp.setBounds(518, 0, 300, 50);
        r1Tot_Emp.setForeground(new Color(36,33,36));

        r1Current.setFont(new Font("Roboto", Font.BOLD, 25));
        r1Current.setBounds(838, 0, 300, 50);
        r1Current.setForeground(new Color(36,33,36));

        r1required.setFont(new Font("Roboto", Font.BOLD, 25));
        r1required.setBounds(1158, 0, 300, 50);
        r1required.setForeground(new Color(36,33,36));

        row1.add(r1Position);
        row1.add(r1Tot_Emp);
        row1.add(r1Current);
        row1.add(r1required);

        row2.setBackground(new Color(220,220,220));
        row2.setBounds(0, 100, 1458, 50);
        row2.setLayout(null);

        r2Position.setFont(new Font("Roboto", Font.BOLD, 25));
        r2Position.setBounds(20, 0, 500, 50);
        r2Position.setForeground(new Color(36,33,36));

        r2Tot_Emp.setFont(new Font("Roboto", Font.BOLD, 25));
        r2Tot_Emp.setBounds(518, 0, 300, 50);
        r2Tot_Emp.setForeground(new Color(36,33,36));

        r2Current.setFont(new Font("Roboto", Font.BOLD, 25));
        r2Current.setBounds(838, 0, 300, 50);
        r2Current.setForeground(new Color(36,33,36));

        r2required.setFont(new Font("Roboto", Font.BOLD, 25));
        r2required.setBounds(1158, 0, 300, 50);
        r2required.setForeground(new Color(36,33,36));

        row2.add(r2Position);
        row2.add(r2Tot_Emp);
        row2.add(r2Current);
        row2.add(r2required);

        row3.setBackground(new Color(240, 240, 240));
        row3.setBounds(0, 150, 1458, 50);
        row3.setLayout(null);

        r3Position.setFont(new Font("Roboto", Font.BOLD, 25));
        r3Position.setBounds(20, 0, 500, 50);
        r3Position.setForeground(new Color(36,33,36));

        r3Tot_Emp.setFont(new Font("Roboto", Font.BOLD, 25));
        r3Tot_Emp.setBounds(518, 0, 300, 50);
        r3Tot_Emp.setForeground(new Color(36,33,36));

        r3Current.setFont(new Font("Roboto", Font.BOLD, 25));
        r3Current.setBounds(838, 0, 300, 50);
        r3Current.setForeground(new Color(36,33,36));

        r3required.setFont(new Font("Roboto", Font.BOLD, 25));
        r3required.setBounds(1158, 0, 300, 50);
        r3required.setForeground(new Color(36,33,36));

        row3.add(r3Position);
        row3.add(r3Tot_Emp);
        row3.add(r3Current);
        row3.add(r3required);
        

        row4.setBackground(new Color(220,220,220));
        row4.setBounds(0, 200, 1458, 50);
        row4.setLayout(null);

        r4Position.setFont(new Font("Roboto", Font.BOLD, 25));
        r4Position.setBounds(20, 0, 500, 50);
        r4Position.setForeground(new Color(36,33,36));

        r4Tot_Emp.setFont(new Font("Roboto", Font.BOLD, 25));
        r4Tot_Emp.setBounds(518, 0, 300, 50);
        r4Tot_Emp.setForeground(new Color(36,33,36));

        r4Current.setFont(new Font("Roboto", Font.BOLD, 25));
        r4Current.setBounds(838, 0, 300, 50);
        r4Current.setForeground(new Color(36,33,36));

        r4required.setFont(new Font("Roboto", Font.BOLD, 25));
        r4required.setBounds(1158, 0, 300, 50);
        r4required.setForeground(new Color(36,33,36));

        row4.add(r4Position);
        row4.add(r4Tot_Emp);
        row4.add(r4Current);
        row4.add(r4required);

        row5.setBackground(new Color(240, 240, 240));
        row5.setBounds(0, 250, 1458, 50);
        row5.setLayout(null);

        r5Position.setFont(new Font("Roboto", Font.BOLD, 25));
        r5Position.setBounds(20, 0, 500, 50);
        r5Position.setForeground(new Color(36,33,36));

        r5Tot_Emp.setFont(new Font("Roboto", Font.BOLD, 25));
        r5Tot_Emp.setBounds(518, 0, 300, 50);
        r5Tot_Emp.setForeground(new Color(36,33,36));

        r5Current.setFont(new Font("Roboto", Font.BOLD, 25));
        r5Current.setBounds(838, 0, 300, 50);
        r5Current.setForeground(new Color(36,33,36));

        r5required.setFont(new Font("Roboto", Font.BOLD, 25));
        r5required.setBounds(1158, 0, 300, 50);
        r5required.setForeground(new Color(36,33,36));

        row5.add(r5Position);
        row5.add(r5Tot_Emp);
        row5.add(r5Current);
        row5.add(r5required);

        row6.setBackground(new Color(220,220,220));
        row6.setBounds(0, 300, 1458, 50);
        row6.setLayout(null);

        r6Position.setFont(new Font("Roboto", Font.BOLD, 25));
        r6Position.setBounds(20, 0, 500, 50);
        r6Position.setForeground(new Color(36,33,36));

        r6Tot_Emp.setFont(new Font("Roboto", Font.BOLD, 25));
        r6Tot_Emp.setBounds(518, 0, 300, 50);
        r6Tot_Emp.setForeground(new Color(36,33,36));

        r6Current.setFont(new Font("Roboto", Font.BOLD, 25));
        r6Current.setBounds(838, 0, 300, 50);
        r6Current.setForeground(new Color(36,33,36));

        r6required.setFont(new Font("Roboto", Font.BOLD, 25));
        r6required.setBounds(1158, 0, 300, 50);
        r6required.setForeground(new Color(36,33,36));

        row6.add(r6Position);
        row6.add(r6Tot_Emp);
        row6.add(r6Current);
        row6.add(r6required);

        row7.setBackground(new Color(240, 240, 240));
        row7.setBounds(0, 350, 1458, 50);
        row7.setLayout(null);

        r7Position.setFont(new Font("Roboto", Font.BOLD, 25));
        r7Position.setBounds(20, 0, 500, 50);
        r7Position.setForeground(new Color(36,33,36));

        r7Tot_Emp.setFont(new Font("Roboto", Font.BOLD, 25));
        r7Tot_Emp.setBounds(518, 0, 300, 50);
        r7Tot_Emp.setForeground(new Color(36,33,36));

        r7Current.setFont(new Font("Roboto", Font.BOLD, 25));
        r7Current.setBounds(838, 0, 300, 50);
        r7Current.setForeground(new Color(36,33,36));

        r7required.setFont(new Font("Roboto", Font.BOLD, 25));
        r7required.setBounds(1158, 0, 300, 50);
        r7required.setForeground(new Color(36,33,36));

        row7.add(r7Position);
        row7.add(r7Tot_Emp);
        row7.add(r7Current);
        row7.add(r7required);

        row8.setBackground(new Color(220,220,220));
        row8.setBounds(0, 400, 1458, 50);
        row8.setLayout(null);

        r8Position.setFont(new Font("Roboto", Font.BOLD, 25));
        r8Position.setBounds(20, 0, 500, 50);
        r8Position.setForeground(new Color(36,33,36));

        r8Tot_Emp.setFont(new Font("Roboto", Font.BOLD, 25));
        r8Tot_Emp.setBounds(518, 0, 300, 50);
        r8Tot_Emp.setForeground(new Color(36,33,36));

        r8Current.setFont(new Font("Roboto", Font.BOLD, 25));
        r8Current.setBounds(838, 0, 300, 50);
        r8Current.setForeground(new Color(36,33,36));

        r8required.setFont(new Font("Roboto", Font.BOLD, 25));
        r8required.setBounds(1158, 0, 300, 50);
        r8required.setForeground(new Color(36,33,36));

        row8.add(r8Position);
        row8.add(r8Tot_Emp);
        row8.add(r8Current);
        row8.add(r8required);

        row9.setBackground(new Color(240, 240, 240));
        row9.setBounds(0, 450, 1458, 50);
        row9.setLayout(null);

        r9Position.setFont(new Font("Roboto", Font.BOLD, 25));
        r9Position.setBounds(20, 0, 500, 50);
        r9Position.setForeground(new Color(36,33,36));

        r9Tot_Emp.setFont(new Font("Roboto", Font.BOLD, 25));
        r9Tot_Emp.setBounds(518, 0, 300, 50);
        r9Tot_Emp.setForeground(new Color(36,33,36));

        r9Current.setFont(new Font("Roboto", Font.BOLD, 25));
        r9Current.setBounds(838, 0, 300, 50);
        r9Current.setForeground(new Color(36,33,36));

        r9required.setFont(new Font("Roboto", Font.BOLD, 25));
        r9required.setBounds(1158, 0, 300, 50);
        r9required.setForeground(new Color(36,33,36));

        row9.add(r9Position);
        row9.add(r9Tot_Emp);
        row9.add(r9Current);
        row9.add(r9required);


        row10.setBackground(new Color(220,220,220));
        row10.setBounds(0, 500, 1458, 50);
        row10.setLayout(null);

        r10Position.setFont(new Font("Roboto", Font.BOLD, 25));
        r10Position.setBounds(20, 0, 500, 50);
        r10Position.setForeground(new Color(36,33,36));

        r10Tot_Emp.setFont(new Font("Roboto", Font.BOLD, 25));
        r10Tot_Emp.setBounds(518, 0, 300, 50);
        r10Tot_Emp.setForeground(new Color(36,33,36));

        r10Current.setFont(new Font("Roboto", Font.BOLD, 25));
        r10Current.setBounds(838, 0, 300, 50);
        r10Current.setForeground(new Color(36,33,36));

        r10required.setFont(new Font("Roboto", Font.BOLD, 25));
        r10required.setBounds(1158, 0, 300, 50);
        r10required.setForeground(new Color(36,33,36));

        row10.add(r10Position);
        row10.add(r10Tot_Emp);
        row10.add(r10Current);
        row10.add(r10required);

        row11.setBackground(new Color(220,220,220));
        row11.setBounds(0, 500, 1458, 50);
        row11.setLayout(null);

        r11Position.setFont(new Font("Roboto", Font.BOLD, 25));
        r11Position.setBounds(20, 0, 500, 50);
        r11Position.setForeground(new Color(36,33,36));

        r11Tot_Emp.setFont(new Font("Roboto", Font.BOLD, 25));
        r11Tot_Emp.setBounds(518, 0, 300, 50);
        r11Tot_Emp.setForeground(new Color(36,33,36));

        r11Current.setFont(new Font("Roboto", Font.BOLD, 25));
        r11Current.setBounds(838, 0, 300, 50);
        r11Current.setForeground(new Color(36,33,36));

        r11required.setFont(new Font("Roboto", Font.BOLD, 25));
        r11required.setBounds(1158, 0, 300, 50);
        r11required.setForeground(new Color(36,33,36));

        row11.add(r11Position);
        row11.add(r11Tot_Emp);
        row11.add(r11Current);
        row11.add(r11required);



        add(column);
        add(row1);
        add(row2);
        add(row3);
        add(row4);
        add(row5);
        add(row6);
        add(row7);
        add(row8);
        add(row9);
        add(row10);
        add(row11);

        String dbUrl = "jdbc:mysql://localhost:3306/employee_payroll_system";
        String username = "root";
        String password = "3101";

        try {
            Connection conn = DriverManager.getConnection(dbUrl, username, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM EmployeePositionStatus");

            // Initialize the row labels
            JLabel[] positionLabels = {r1Position, r2Position, r3Position, r4Position, r5Position,
                r6Position, r7Position, r8Position, r9Position, r10Position};

            JLabel[] totalLabels = {r1Tot_Emp, r2Tot_Emp, r3Tot_Emp, r4Tot_Emp, r5Tot_Emp,
                r6Tot_Emp, r7Tot_Emp, r8Tot_Emp, r9Tot_Emp, r10Tot_Emp};

            JLabel[] currentLabels = {r1Current, r2Current, r3Current, r4Current, r5Current,
                r6Current, r7Current, r8Current, r9Current, r10Current};

            JLabel[] requiredLabels = {r1required, r2required, r3required, r4required, r5required,
                r6required, r7required, r8required, r9required, r10required};

            int i = 0;
            while (rs.next() && i < positionLabels.length) {
                String positionName = rs.getString("PositionName");
                int totalEmployees = rs.getInt("TotalEmployees");
                int currentEmployees = rs.getInt("CurrentEmployees");
                int requiredEmployees = rs.getInt("RequiredEmployees");

                positionLabels[i].setText(positionName);
                totalLabels[i].setText(String.valueOf(totalEmployees));
                currentLabels[i].setText(String.valueOf(currentEmployees));
                requiredLabels[i].setText(String.valueOf(requiredEmployees));

                i++;
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
