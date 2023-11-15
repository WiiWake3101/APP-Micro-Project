import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

class test
{
    public static void main(String[] args) {
         DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMM YYYY HH:mm:ss");  
   LocalDateTime now = LocalDateTime.now();  
   System.out.println(dtf.format(now));  
    }
}