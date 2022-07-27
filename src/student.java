import java.util.ArrayList;
import java.util.Scanner;

public class student {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> NameArray = new ArrayList<>();
        ArrayList<Integer> AdmNoArray = new ArrayList<>();
        ArrayList<Integer> RollNoArray = new ArrayList<>();
        ArrayList<String> CollegeArray = new ArrayList<>();

        while (true) {
            System.out.println("1 Student entry");
            System.out.println("2 search student using rollno");
            System.out.println("3 student delete");
            System.out.println("4 exit");
            System.out.println("Select an option!");

            int option=input.nextInt();
            switch (option) {
                case 1:
                    System.out.println("enter student name");
                    String studentname= input.next();
                    NameArray.add(studentname);

                    System.out.println("enter admission number");
                    int admission_num= input.nextInt();
                    AdmNoArray.add(admission_num);

                    System.out.println("enter roll number");
                    int roll_num= input.nextInt();
                    RollNoArray.add(roll_num);

                    System.out.println("enter college name");
                    String college_name= input.next();
                    CollegeArray.add(college_name);

                    break;

                case 2:
                    System.out.println("enter roll number");
                    int ROLLNO = input.nextInt();
                    int index=0;
                    if ( RollNoArray.contains(ROLLNO) ) {
                        index = RollNoArray.indexOf(ROLLNO);
                        System.out.println("Name: "+ NameArray  .get(index));
                        System.out.println("AdmNo: "+  AdmNoArray .get(index));
                        System.out.println("Rollno: "+ RollNoArray .get(index));
                        System.out.println("college: "+ CollegeArray .get(index));
                    }
                    else {
                        System.out.println("student not found");
                    }

                    break;
                case 3:
                    System.out.println("delete student name");
                    String name = input.next();
                    int index1=0;
                    if(NameArray .contains(name)) {
                        index1=NameArray .indexOf(name);
                        NameArray .remove(index1);
                        AdmNoArray.remove(index1);
                        RollNoArray.remove(index1);
                        CollegeArray.remove(index1);
                        System.out.println("successfully removed "+ name);
                    }
                    else {
                        System.out.println("student not found");
                    }
                    break;
                case 4:
                    return;

                default:
                    break;
            }

        }



    }

}

