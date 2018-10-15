import javax.swing.*;
public class CourseImpl{
  public static void main(String[] args) {
  Course curso1 = new Course();
  //curso1.courseName="Inglés";
  curso1.SetCourseName("Inglés");

  curso1.addStudent("Luis Alberto");
  curso1.addStudent("Maria");
  curso1.addStudent("Lucero");

  String [] studentsDeIngles= curso1.getStudents();
  String students = "";
  for (int i = 0;i < curso1.getNumberOfStudents() ;i ++ ) {
    students += studentsDeIngles[i]+ "\n";
  }
  JOptionPane.showMessageDialog(null, students);

  Course curso2 = new Course();
  curso2.SetCourseName("Mate");

  curso2.addStudent("Brandom");
  curso2.addStudent("Angel");
  curso2.addStudent("Steven");

  JOptionPane.showMessageDialog(null, curso1.getCourseName());

  JOptionPane.showMessageDialog(null, curso2.getCourseName());
  }
}
