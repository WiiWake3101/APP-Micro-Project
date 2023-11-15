import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;




public class search_employee extends JPanel implements ActionListener
{

    JPanel search_panel = new JPanel();
    JLabel search_label = new JLabel("Search by ");
    String[] option = {
            "Select",
            "Employee ID",
            "FirstName",
            "LastName",
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
    GradientButton search_button = new GradientButton(Color.decode("#004FF9"),Color.decode("#56CCF2"));

    JPanel panel = new JPanel();
    JPanel tabel_panel = new JPanel();
    
    

    

    


    search_employee()
    {
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
        sortby_ComboBox.setBackground(Color.WHITE);
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
        


        search_button.setBounds(1200 ,10, 150, 40);
        search_button.setBorder(BorderFactory.createEmptyBorder());
        search_button.setText("Search");
        search_button.setFont(new Font("Roboto", Font.BOLD, 25));
        search_button.setForeground(new Color(240,240, 240));
        search_button.setFocusable(false);
        search_button.addActionListener(this);


        search_panel.add(search_label);
        search_panel.add(sortby_ComboBox);
        search_panel.add(collan);
        search_panel.add(search_textfield);
        search_panel.add(search_button);

        
        
        //TableColumn column = tabel.getColumnModel().getColumn(0);
        //column.setPreferredWidth(500);

        panel.setBounds(5, 60, 1448, 536);
        panel.setLayout(new BorderLayout());

        //tabel_panel.setBackground(Color.BLUE);
        data d = new data();
        tabel_panel.setLayout(new GridLayout(d.employeeData_row, 16, 0, 10));
        
        
        for(int i = 0; i<d.employeeData_totatl ; i++)
        {
            JLabel label = new JLabel();
            label.setFont(new Font("Roboto", Font.BOLD, 20));
            label.setBorder(BorderFactory.createRaisedBevelBorder());
            label.setHorizontalAlignment(0);
            if(i<=15)
            {
                label.setOpaque(true);
                label.setBackground(Color.decode("#004FF9"));
                label.setForeground(Color.WHITE);
                //label.setHorizontalAlignment(0);
                label.setFont(new Font("Roboto", Font.BOLD, 25));
                
            }
            
            

            String txt = String.valueOf(d.employeeData[i]); 
            label.setText(txt);
            tabel_panel.add(label);
        }
        

    

        add(search_panel);
        panel.add(new JScrollPane(tabel_panel,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS));
        add(panel);
        
        
    }


    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==sortby_ComboBox)
        {
            Object txt = sortby_ComboBox.getSelectedItem();
            if(txt.equals("Select"))
            {
                search_textfield.setEditable(false);
            }
            else
            {
                search_textfield.setEditable(true);
            }
                
        }
    }
    

    
    
}
