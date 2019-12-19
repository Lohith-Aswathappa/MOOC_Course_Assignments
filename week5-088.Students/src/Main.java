
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner reader =  new Scanner(System.in);
        boolean state = true;
        String name;
        String studentNo;
        while(state == true){
            System.out.print("name: ");
            name = reader.nextLine();
            //studentNo = reader.nextLine();
            if(name.isEmpty()){
                state = false;
            }
            else{
                System.out.print("studentnumber: ");
                studentNo = reader.nextLine();
                list.add(new Student(name,studentNo));
            }
        }

        for (Student students : list) {
            System.out.println(students);
        }

        System.out.print("Give search term: ");
        String searchTerm = reader.nextLine();
        System.out.println("Result: ");

        int i = 0;
        while(i < list.size()){
            Student getStudent = list.get(i);
            String getStudentName = getStudent.getName();
            if(getStudentName.contains(searchTerm)){
                System.out.println(getStudent);
            }
            i++;

        }

//        Student jobs = new Student("Steve Jobs", "013672548");
//        System.out.println("name: " + jobs.getName());
//        System.out.println("studentnumber: " + jobs.getStudentNumber());
//        System.out.println(jobs);

    }
}
