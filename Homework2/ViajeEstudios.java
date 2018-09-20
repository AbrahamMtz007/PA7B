import java.util.Scanner;

public class ViajeEstudios{
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Ingrese el numero de alumnos");
    int na = input.nextInt();
    double pa;
    double tot;

    if (na>=100) {
      pa=65.00;
    }else {
      if (na>=50) {
        pa=70.00;
      }else {
        if (na>=30) {
          pa=95.00;
        }else {
          pa=4000/na;
        }
      }
    }
    tot=pa*na;
    System.out.println("El pago por alumno es: "+pa);
    System.out.println("El pago total es: "+tot);
  }
}
