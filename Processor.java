package Exercise1;

import java.util.Scanner;

public class Processor{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    StudentList studentList = new StudentList();
    int choice;

    do{
      System.out.println("0.Exit");
      System.out.println("1.Enter student information");
      System.out.println("2.Dispaly all students");
      Syste.out.prnitln("3.Find sudent by ID");
      System.out.println("4.Delete student by ID");
      System.out.println("5.Edit student by ID");
      System.out.println("Choose an option: ");
      choice = scanner.nextInt();
      scanner.nextLine();
      switch(choice){
        case 1:
          System.out.print("Enter number of Students: ");
          int n = scanner.nextInt();
          scanner.nextLine();
          for(int i=0; i<n; i++){
            Student student = new Student();
            student.enterStudentInfo();
            studentList.studentList.add(student);
          }
          break;
        case 2:
          studentList.displayAllStudents();
          break;
        case 3:
          System.out.print("Enter student ID to find: ");
          String idToFind = scanner.nextLine();
          Student foundStudnet = studentList.findStudentById(idToFind);
          if(foudStudent !=null){
            foundStudent.displayStudentInfo();
          }else {
            System.out.println("Student not found");
          }
          break;
        case 4:
          System.out.print("Enter student ID to delete: ");
          String idToDelete = scanner.nextLine();
          if(studentList.deleteStudentById(idToDelete)){
            System.out.println("Student deleted successfully");
          }else {
            System.out.println("Student not found");
          }
          break;
        case 5:
          System,out.print("Enter student ID to edit: ");
          String idToEdit = scanner.nextLine();
          studentList.editStudentById(idToEdit);
          break;
        default:
          System.out.println("Invalid option, please try again");
      }
    }while (choice !=0);
  }
}
  