import java.util.Scanner;

public class Trajes{
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Ingrese el costo del traje");
    double ct = input.nextDouble();
    double de;
    double pf;

    if (ct>2500) {
      de= ct*0.15;
      pf= ct-de;
    }else {
      de= ct*0.08;
      pf= ct-de;
    }
    System.out.println("El descuento obtenido es: "+ de);
    System.out.println("El precio final del traje es: "+ pf);
  }
}
