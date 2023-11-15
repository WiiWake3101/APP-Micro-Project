import java.io.FileOutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;

import com.itextpdf.text.pdf.PdfWriter;

public class Admin_pdf 
{
    
    Admin_pdf(String employeeID,String first_name,String last_name,String dob,String jobtitle,String w_h,String h_s,String a_a,String d_a,String b_s,String g_s,String n_s)
    {
        String l = "--------------------------------------------------------------------------";
        DateTimeFormatter Date = DateTimeFormatter.ofPattern("dd MMM YYYY");  
        DateTimeFormatter Time = DateTimeFormatter.ofPattern("HH:MM:SS");  
        LocalDateTime now = LocalDateTime.now();  
        try
        {
            String file_name = "pdf\\"+employeeID+".pdf";
            Document doc = new Document();
            doc.setMargins(75, 75, 75, 75);
            
            PdfWriter.getInstance(doc, new FileOutputStream(file_name));

            doc.open();
            Paragraph line = new Paragraph(l,FontFactory.getFont("Roboto",18));
            
            Paragraph Title = new Paragraph("SALARY SLIP",FontFactory.getFont("Roboto",20,Font.BOLD));
            Title.setAlignment(1);
            Title.setSpacingBefore(-15f);
            Title.setSpacingAfter(-19f);

            Paragraph date = new Paragraph("Date : "+Date.format(now),FontFactory.getFont("Roboto",10));
            date.setSpacingBefore(-5f);
            

            Paragraph time = new Paragraph("Time : "+Time.format(now),FontFactory.getFont("Roboto",10));
            time.setSpacingAfter(-15f);

    

            Paragraph Employee_details = new Paragraph("Employee Deatils",FontFactory.getFont("Roboto",15,Font.BOLD));
            Employee_details.setSpacingBefore(-10f);
            Employee_details.setSpacingAfter(5f);
            Paragraph name = new Paragraph("Name     : "+first_name+" "+last_name,FontFactory.getFont("Roboto",10));
            Paragraph date_of_birth = new Paragraph("DOB       : "+dob,FontFactory.getFont("Roboto",10));
            Paragraph job_title = new Paragraph("Job Title : "+jobtitle,FontFactory.getFont("Roboto",10));

            Paragraph Salary_deatils = new Paragraph("Salary Deatils",FontFactory.getFont("Roboto",15,Font.BOLD));
            Salary_deatils.setSpacingBefore(-10f);
            Salary_deatils.setSpacingAfter(5f);
            Paragraph worked_hours = new Paragraph("Worked Hours: "+w_h,FontFactory.getFont("Roboto",10));
            Paragraph hourly_salary = new Paragraph("Hourly Salalry : "+h_s,FontFactory.getFont("Roboto",10));
            Paragraph allowance = new Paragraph("Allowance Amount: "+a_a,FontFactory.getFont("Roboto",10));
            Paragraph deduction = new Paragraph("Deduction Amount: "+d_a,FontFactory.getFont("Roboto",10));

            Paragraph calculation_deatils = new Paragraph("Calculation Deatils",FontFactory.getFont("Roboto",15,Font.BOLD));
            calculation_deatils.setSpacingBefore(-10f);
            calculation_deatils.setSpacingAfter(5f);
            Paragraph basic_salary = new Paragraph("Basic Salary: "+b_s,FontFactory.getFont("Roboto",10));
            Paragraph gross_salary = new Paragraph("Gross Salalry : "+g_s,FontFactory.getFont("Roboto",10));


            

            Paragraph net_salary = new Paragraph("Net Salary :  "+n_s,FontFactory.getFont("Roboto",18,Font.BOLD));

            

            
            doc.add(line);
            doc.add(Title);
            doc.add(line);
            doc.add(date);
            doc.add(time);
            doc.add(line);
            doc.add(Employee_details);
            doc.add(name);
            doc.add(date_of_birth);
            doc.add(job_title);
            doc.add(line);
            doc.add(Salary_deatils);
            doc.add(worked_hours);
            doc.add(hourly_salary);
            doc.add(allowance);
            doc.add(deduction);
            doc.add(line);
            doc.add(calculation_deatils);
            doc.add(basic_salary);
            doc.add(gross_salary);
            doc.add(line);
            doc.add(net_salary);
            doc.add(line);


            doc.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }

    public static void main(String[] args) {
        new Admin_pdf("sr6172","sai","Ram","04-09-2004","HR","100","100","200","200","100","100","100");
    }
}
