public class data 
{
    String[] employeeData = 
        {
            "Firstname", "Lastname", "Gender", "Date Of Birth", "Email", "Alternative Email", "Phone Number", "Alternative Phone Number", "State", "District", "Department", "Designation", "Status", "Date hired", "Job title", "Salary",
            "John", "Smith", "Male", "1990-05-15", "john.smith@example.com", "john@gmail.com", "123-456-7890", "987-654-3210", "California", "Los Angeles", "Sales", "Manager", "Active", "2022-03-10", "Sales Representative", "$60,000",
            "Emily", "Johnson", "Female", "1988-08-22", "emily.johnson@example.com", "emily@gmail.com", "234-567-8901", "876-543-2109", "New York", "Manhattan", "Marketing", "Coordinator", "Active", "2021-11-05", "Marketing Specialist", "$55,000",
            "Michael", "Williams", "Male", "1995-02-03", "michael.williams@example.com", "michael@gmail.com", "345-678-9012", "765-432-1098", "Texas", "Houston", "Finance", "Accountant", "Active", "2022-04-20", "Financial Analyst", "$65,000",
            "Sophia", "Brown", "Female", "1986-11-12", "sophia.brown@example.com", "sophia@gmail.com", "456-789-0123", "654-321-0987", "Florida", "Miami", "Engineering", "Engineer", "Active", "2020-07-15", "Software Engineer", "$70,000",
            "William", "Jones", "Male", "1992-07-04", "william.jones@example.com", "william@gmail.com", "567-890-1234", "543-210-9876", "Illinois", "Chicago", "Human Resources", "HR Manager", "Active", "2021-01-30", "HR Specialist", "$58,000",
            "Olivia", "Davis", "Female", "1998-01-28", "olivia.davis@example.com", "olivia@gmail.com", "678-901-2345", "432-109-8765", "California", "San Francisco", "IT", "Software Developer", "Active", "2023-02-19", "Full Stack Developer", "$75,000",
            "James", "Miller", "Male", "1987-09-10", "james.miller@example.com", "james@gmail.com", "789-012-3456", "321-098-7654", "Texas", "Dallas", "Sales", "Account Executive", "Active", "2022-05-02", "Sales Manager", "$62,000",
            "Ava", "Wilson", "Female", "1994-06-25", "ava.wilson@example.com", "ava@gmail.com", "890-123-4567", "210-987-6543", "New York", "Bronx", "Marketing", "Marketing Manager", "Active", "2020-12-08", "Marketing Director", "$80,000",
            "Daniel", "Martinez", "Male", "1991-03-17", "daniel.martinez@example.com", "daniel@gmail.com", "456-789-0123", "765-432-1098", "Florida", "Tampa", "Finance", "Financial Analyst", "Active", "2021-06-14", "Financial Planner", "$68,000",
            "Mia", "Taylor", "Female", "1989-12-09", "mia.taylor@example.com", "mia@gmail.com", "567-890-1234", "543-210-9876", "California", "San Diego", "Engineering", "Software Engineer", "Active", "2022-08-25", "Systems Engineer", "$72,000",
            "Joseph", "Hernandez", "Male", "1997-04-02", "joseph.hernandez@example.com", "joseph@gmail.com", "678-901-2345", "432-109-8765", "Illinois", "Springfield", "Human Resources", "HR Specialist", "Active", "2023-01-17", "HR Coordinator", "$56,000",
            "Charlotte", "Garcia", "Female", "1993-10-31", "charlotte.garcia@example.com", "charlotte@gmail.com", "789-012-3456", "321-098-7654", "Texas", "Austin", "IT", "IT Manager", "Active", "2021-09-03", "Database Administrator", "$70,000",
            "Ethan", "Lopez", "Male", "1985-06-18", "ethan.lopez@example.com", "ethan@gmail.com", "890-123-4567", "210-987-6543", "Arizona", "Phoenix", "Sales", "Sales Representative", "Active", "2020-04-27", "Sales Associate", "$55,000",
            "Amelia", "Rodriguez", "Female", "1984-02-21", "amelia.rodriguez@example.com", "amelia@gmail.com", "456-789-0123", "765-432-1098", "Georgia", "Atlanta", "Marketing", "Marketing Specialist", "Active", "2022-10-12", "Marketing Coordinator", "$58,000",
            "Alexander", "Gonzalez", "Male", "1990-08-15", "alexander.gonzalez@example.com", "alexander@gmail.com", "567-890-1234", "543-210-9876", "New Jersey", "Newark", "Finance", "Financial Analyst", "Active", "2021-03-01", "Financial Advisor", "$67,000",
            "Lily", "Perez", "Female", "1986-11-14", "lily.perez@example.com", "lily@gmail.com", "678-901-2345", "432-109-8765", "Ohio", "Columbus", "Engineering", "Engineer", "Active", "2020-07-15", "Mechanical Engineer", "$75,000",
            "Benjamin", "Sanchez", "Male", "1994-05-04", "benjamin.sanchez@example.com", "benjamin@gmail.com", "789-012-3456", "321-098-7654", "Michigan", "Detroit", "Human Resources", "HR Manager", "Active", "2023-02-05", "HR Specialist", "$63,000",
            "Christopher", "Lee", "Male", "1989-03-19", "chris.lee@example.com", "chris@gmail.com", "123-456-7890", "987-654-3210", "California", "Los Angeles", "Sales", "Sales Associate", "Active", "2023-04-15", "Sales Representative", "$58,000",
            "Avery", "Scott", "Female", "1987-07-08", "avery.scott@example.com", "avery@gmail.com", "234-567-8901", "876-543-2109", "New York", "Manhattan", "Marketing", "Marketing Coordinator", "Active", "2021-09-25", "Marketing Manager", "$72,000",
            "David", "Hall", "Male", "1992-01-30", "david.hall@example.com", "david@gmail.com", "345-678-9012", "765-432-1098", "Texas", "Houston", "Finance", "Financial Planner", "Active", "2022-12-12", "Financial Analyst", "$67,000",
            "Victoria", "Young", "Female", "1991-06-14", "victoria.young@example.com", "victoria@gmail.com", "456-789-0123", "654-321-0987", "Florida", "Miami", "Engineering", "Systems Engineer", "Active", "2020-08-19", "Software Engineer", "$74,000",
            "Samuel", "Turner", "Male", "1996-09-20", "samuel.turner@example.com", "samuel@gmail.com", "567-890-1234", "543-210-9876", "Illinois", "Chicago", "Human Resources", "HR Specialist", "Active", "2023-03-28", "HR Manager", "$65,000"
        };


        int employeeData_row = employeeData.length/16;
        int employeeData_totatl = (employeeData.length);


        String[] attendance_data = 
        {
            "S.No", "Date", "Employee ID", "Name", "Status", "Intime", "Outtime",
            "1", "2023-10-27", "E001", "John Smith", "Present", "08:30", "17:30",
            "2", "2023-10-27", "E002", "Emily Johnson", "Present", "09:00", "18:00",
            "3", "2023-10-27", "E003", "Michael Williams", "Present", "08:45", "17:45",
            "4", "2023-10-27", "E004", "Sophia Brown", "Present", "08:15", "17:15",
            "5", "2023-10-27", "E005", "William Jones", "Present", "09:30", "18:30",
            "6", "2023-10-27", "E006", "Olivia Davis", "Present", "08:00", "17:00",
            "7", "2023-10-27", "E007", "James Miller", "Present", "08:20", "17:20",
            "8", "2023-10-27", "E008", "Ava Wilson", "Present", "09:15", "18:15",
            "9", "2023-10-27", "E009", "Daniel Martinez", "Present", "09:45", "18:45",
            "10", "2023-10-27", "E010", "Mia Taylor", "Present", "08:10", "17:10",
            "11", "2023-10-27", "E011", "Joseph Hernandez", "Present", "08:45", "17:45",
            "12", "2023-10-27", "E012", "Charlotte Garcia", "Present", "09:30", "18:30",
            "13", "2023-10-27", "E013", "Ethan Lopez", "Present", "08:15", "17:15",
            "14", "2023-10-27", "E014", "Amelia Rodriguez", "Present", "09:00", "18:00",
            "15", "2023-10-27", "E015", "Alexander Gonzalez", "Present", "08:30", "17:30",
            "16", "2023-10-27", "E016", "Lily Perez", "Present", "08:30", "17:30",
            "17", "2023-10-27", "E017", "Benjamin Sanchez", "Present", "09:15", "18:15",
            "18", "2023-10-27", "E018", "Zoe Torres", "Present", "09:00", "18:00",
            "19", "2023-10-27", "E019", "David Hall", "Present", "08:00", "17:00",
            "20", "2023-10-27", "E020", "Victoria Young", "Present", "08:45", "17:45",
            "21", "2023-10-27", "E021", "Samuel Turner", "Present", "08:20", "17:20",
            "22", "2023-10-27", "E022", "Christopher Lee", "Present", "09:30", "18:30",
            "23", "2023-10-27", "E023", "Avery Scott", "Present", "09:30", "18:30",
            "24", "2023-10-27", "E024", "Oliver Davis", "Present", "08:15", "17:15",
            "25", "2023-10-27", "E025", "Sophie Wilson", "Present", "09:00", "18:00",
            "26", "2023-10-27", "E026", "Jack Miller", "Present", "08:10", "17:10",
            "27", "2023-10-27", "E027", "Ava Hernandez", "Present", "09:15", "18:15",
            "28", "2023-10-27", "E028", "Lucas Garcia", "Present", "08:45", "17:45",
            "29", "2023-10-27", "E029", "Madison Lopez", "Present", "08:00", "17:00",
            "30", "2023-10-27", "E030", "William Rodriguez", "Present", "09:45", "18:45",
            "31", "2023-10-27", "E031", "Henry Gonzalez", "Present", "09:00", "18:00",
            "32", "2023-10-27", "E032", "Olivia Perez", "Present", "08:15", "17:15",
            "33", "2023-10-27", "E033", "Isabella Sanchez", "Present", "08:20", "17:20",
            "34", "2023-10-27", "E034", "Andrew Torres", "Present", "09:30", "18:30",
            "35", "2023-10-27", "E035", "Mia Hall", "Present", "08:45", "17:45",
            "36", "2023-10-27", "E036", "John Lee", "Present", "08:30", "17:30",
            "37", "2023-10-27", "E037", "Emma Scott", "Present", "09:00", "18:00",
            "38", "2023-10-27", "E038", "Matthew Davis", "Present", "08:15", "17:15",
            "39", "2023-10-27", "E039", "Madison Williams", "Present", "08:10", "17:10",
            "40", "2023-10-27", "E040", "William Martin", "Present", "09:30", "18:30",
            "41", "2023-10-27", "E041", "Olivia Taylor", "Present", "08:00", "17:00",
            "42", "2023-10-27", "E042", "Ethan Harris", "Present", "08:20", "17:20",
            "43", "2023-10-27", "E043", "Abigail King", "Present", "09:15", "18:15",
            "44", "2023-10-27", "E044", "Noah Turner", "Present", "08:45", "17:45",
        };

        int attendance_data_total = attendance_data.length;
        int attendance_data_column = 7;
        int attendance_data_row = attendance_data_total/attendance_data_column;



        
    
}
