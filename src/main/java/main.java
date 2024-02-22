public class main {
    public static class Inputs{
        String name;
        String Date_of_birth;
        int age;
        String Home_Address;
        String Course;

        public Inputs(String name, String date, int age, String address, String course){
            this.name = name;
            this.Date_of_birth = date;
            this.age = age;
            this.Home_Address = address;
            this.Course = course;
        }

        public void outputs(){
            System.out.print("Full Name: " + name + "\n");
            System.out.print("Date of Birth: " + Date_of_birth + "\n");
            System.out.print("Age: " + age + "\n");
            System.out.print("Home Address: " + Home_Address + "\n");
            System.out.print("Year Level and Course: " + Course + "\n");
        }
    }

    public static void main(String [] a){
        Inputs out = new Inputs("Froilan Dave", "April 12, 2003", 12, "Surallah, South Cotabato", "Bachelor of Science in Information and Technology");
        out.outputs();
    }
}
