package Exercise1;

import java.text.ParseException
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student{
  String studentID;
  Srting fullName;
  Date dateOfBirth;
  String major;
  float gpa;
  public void enterStudentInfo(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter student ID: ");
    studentId = scanner.nextLine();
    System.out.print("Enter full name: ");
    fullName = scanner.nextLine();
    System.out.print("Enter date of birth (dd/MM/yyyy): ");
    String dateOfBirthString = scanner.nextLine();
    try{
      SimpleDteFormat sdf = new SimpleDteFormat("dd/MM/yyyy");
      dateOfBirth = sdf.parse(dateOfBirthString);
    }
    System.out.print("Enter major: ");
    major = scanner.nextLine();
    System.out.print("Enter GPA: ");
    gpa = scanner.nextFloat();
  }
  public void editStudentById(String idToEdit){
    Scanner scanner = new Scanner(System.in);
    if(this.studentId.equals(idToEdit)){
     System.out.print("Enter full name: ");
      fullName = scanner.nextLine();
      System.out.print("Enter date of birth (dd/MM/yyyy): ");
      String dateOfBirthString = scanner.nextLine();
      try{
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        dateOfBirth = sdf.parse(dateOfBirthString);
      }catch(ParseExeption e){
        System.out,println("Invalid");
      }
      System.out.print("Enter major: ");
      major = scanner.nextLine();
      System.out.print("Enter GPA: ");
      gpa = scanner.nextFloat();
    }else{
      System.out.println("N/A");
    }
  }
  public void displayStudentInfo(){
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    System.out.println("Student ID: "+studentId);
    System.out.println("Full name: "+fullName);
    System.out.println("Date of birth: "+sdf format(dateOfBirth));
    System.out.println("Major: "+major);
    System.out.println("GPA: "+gpa);
  }
}
  