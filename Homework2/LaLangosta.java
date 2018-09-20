import java.util.Scanner;

public class LaLangosta{
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Ingrese el numero de personas para el banquete");
    int np = input.nextInt();
    double tot;

    if (np>200 && np<=300) {
      tot= np*85;
    }else if (np>300) {
      tot= np*75;
    }else {
      tot= np*95;
    }
    System.out.println("El costo total del banquete es: "+ tot);
  }
}
