public class Course{
  private String courseName;
  private String[] students = new String[100];
  private int numberOfStudents = 0;

  public Course(){

  }

  public Course(String courseName){
    this.courseName = courseName;
  }

  public String getCourseName(){
    return this.courseName;
  }
  public void SetCourseName(String courseName){
    this.courseName = courseName;
  }

  public void addStudent(String student){
    this.students[numberOfStudents] = student;
    this.numberOfStudents ++;
  }

  public void dropStudent(String student){
    //Tarea
    students=new String[1];
    numberOfStudents=0;
  }

  public String[] getStudents(){
    return this.students;
  }

  public int getNumberOfStudents(){
    return this.numberOfStudents;
  }

}
