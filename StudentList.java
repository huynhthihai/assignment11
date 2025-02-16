package Exercise1;

import java.ArrayList;

public class StudentList{
  ArrayList<Student> studentList = new ArrayList<>();
  
  public void displayAllStudents(){
    for(Student student : studentList){
      student.displayStudentInfo();
    }
  }

  public Student findStudentById(String id ToFind){
    for (Student student : studentList){
      if(studentId.equals(idToFinf)){
        return studnet;
      }
    }
    return null;
  }

  public boolean deleteStudentById(String idToDelete){
    Student student = findStudentById(idToDelete);
    if(student !=null){
      studentList.remove(student);
      return true;
    }
    return false;
  }

  public void editStudentById(String idToEdit){
    Student student = findStudentById(idToEdit);
    if(student !=null){
      student.editStudentById(idToEdit);
    }
  }
}
  