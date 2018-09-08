
import java.util.Scanner;

public class AreaRectangulo{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Ingrese la altura del rectangulo");
    double a = input.nextDouble();
    Scanner input2 = new Scanner(System.in);
    System.out.println("Ingrese la base del rectangulo");
    double b = input2.nextDouble();
    double area;
    area = a * b;
    System.out.println("El area del rectangulo es: "+ area);
  }
}
