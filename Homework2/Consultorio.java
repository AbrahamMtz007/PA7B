import java.util.Scanner;

public class Consultorio{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Ingrese el numero de consulta");
    int nc = input.nextInt();
    double cc;
    double tot;

    if (nc<=3) {
      cc=200;
      tot= nc*cc;
    }else {
      if (nc<=5) {
        cc=150;
        tot=(nc-3)*150+600;
      }else {
        if (nc<=8) {
          cc=100;
          tot=(nc-5)*100+900;
        }else {
          cc=50;
          tot=(nc-8)*50+1200;
        }
      }
    }
    System.out.println("El costo total de la consulta es: "+ cc);
    System.out.println("El costo total del tratamiento es: "+ tot);
  }
}
