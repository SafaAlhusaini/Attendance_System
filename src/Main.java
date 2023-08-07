import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Scanner read = new Scanner(System.in);
        Student student1 = new Student();
        student1.sId= 1855;
        student1.sName= "Maryam";
        student1.phone = " 33456";
        Student student2 = new Student();
        student2.sId= 2966;
        student2.sName= "Ebtihal";
        student2.phone = "888733";
        Student student3 = new Student();
        student3.sId= 3866;
        student3.sName= "Safa";
        student3.phone = "22388";
        Student student4 = new Student();
        student4.sId= 48225;
        student4.sName= "Shahad";
        student4.phone = "00036635";
        Student student5 = new Student();
        student5.sId= 5444;
        student5.sName= "Huda";
        student5.phone = "00036635";

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);


        while (true) {
            System.out.println(" Enter 1= attendance register, 2 = show attendance list, 3 = exit ");
            int x = read.nextInt();
            if (x == 1)
            {
                System.out.println("Enter your ID : ");
                int ID = read.nextInt();
                if (
                                   student1.sId == ID
                                || student2.sId == ID
                                || student3.sId == ID
                                || student4.sId == ID
                                || student5.sId == ID

                )
                {
                    System.out.println(" you are already registered !");
                }
                else
                {
                    System.out.println("Pleas enter your details for attendance: ");
                    System.out.println("Enter your ID : ");
                    Student student = new Student();
                    student.sId = read.nextInt();
                    System.out.println("Enter your name : ");
                    student.sName = read.next();
                    System.out.println("Enter your phone number : ");
                    student.phone = read.next();
                    students.add(student);




                        for (int i = 0; i < students.size(); i++)
                        {
                            System.out.print( i + 1 +"\t" + students.get(i).sId + "\t");
                            System.out.print(  students.get(i).sName + "\t");
                            System.out.println( students.get(i).phone + "\t");

                        }



                }


            }
            else if (x == 2)
            {
                for (int i = 0; i < students.size(); i++)
                {
                        System.out.print(students.get(i).sId + "\t");
                        System.out.print( students.get(i).sName + "\t");
                        System.out.println( students.get(i).phone + "\t");

                }

            } else {

                System.out.println("you will exist , thank you !");
                break;
            }
        }

    }
}