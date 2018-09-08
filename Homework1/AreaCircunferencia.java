import java.util.Scanner;

public class AreaCircunferencia{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Ingrese el radio de la circunferencia");
    double r = input.nextDouble();
    double pi;
    pi = 3.1416;
    double area;
    area = pi *(r*r);
    System.out.println("El area de la circunferencia es: "+ area);
  }
}
