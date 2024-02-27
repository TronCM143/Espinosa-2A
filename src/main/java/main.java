public class Main {
    
    public static class Name{
            String firstname;
            String middle_name;
            String Last_name;
            
            public Name(String firstname, String middle_name, String Last_name){
            this.firstname = firstname;
            this.middle_name = middle_name;
            this.Last_name = Last_name;
            }
            
            public String Out_name(){
                return firstname + " " + middle_name + " " + Last_name;
            }
        }
        
    public static class Inputs{
        String Date_of_birth;
        int age;
        String Home_Address;
        String Course;
        Name name;
        
        public Inputs(Name name, String date, int age, String address, String course){
            this.Date_of_birth = date;
            this.age = age;
            this.Home_Address = address;
            this.Course = course;
            this.name = name;
        }

        public void outputs(){
            System.out.print("Full Name: " + name.Out_name() + "\n");
            System.out.print("Date of Birth: " + Date_of_birth + "\n");
            System.out.print("Age: " + age + "\n");
            System.out.print("Home Address: " + Home_Address + "\n");
            System.out.print("Year Level and Course: " + Course + "\n");
        }
    }

    public static void main(String [] a){
        Name name = new Name("Froilan Dave", "Evangelista", "Espinosa");
        Inputs out = new Inputs(name, "April 12, 2003", 12, "Surallah, South Cotabato", "Bachelor of Science in Information and Technology");
        out.outputs();
    }
}
