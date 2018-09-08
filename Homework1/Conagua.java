import java.util.Scanner;

public class Conagua{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Ingrese la altura de la alberca");
    double a = input.nextDouble();
    Scanner input2 = new Scanner(System.in);
    System.out.println("Ingrese el largo de la alberca");
    double l = input2.nextDouble();
    Scanner input3 = new Scanner(System.in);
    System.out.println("Ingrese el ancho de la alberca");
    double n = input3.nextDouble();
    Scanner input4 = new Scanner(System.in);
    System.out.println("Ingrese el costo del metro cubico de agua");
    double cm = input4.nextDouble();
    double v;
    v = (a*l*n);
    double pag;
    pag = v * cm;
    System.out.println("El pago por los metros cubicos de agua consumidos es: "+ pag);
  }
}
