import java.util.Scanner;

public class AreaFigura{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Ingrese el valor de R para la figura");
    double r = input.nextDouble();
    Scanner input2 = new Scanner(System.in);
    System.out.println("Ingrese el valor de H para la figura");
    double h = input2.nextDouble();
    double pi;
    pi = 3.1416;
    double c;
    c = (h*h)-(r*r);
    Math.sqrt(c);
    double at;
    at = (2*(r*c))/2;
    double ac;
    ac = (pi*(r*r))/2;
    double area;
    area = at + ac;
    System.out.println("El area de la figura es: "+ area);
  }
}
