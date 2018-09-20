import java.util.Scanner;

public class MayorTres{
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Ingrese un numero");
    double a = input.nextDouble();
    Scanner input2 = new Scanner(System.in);
    System.out.println("Ingrese un numero");
    double b = input2.nextDouble();
    Scanner input3 = new Scanner(System.in);
    System.out.println("Ingrese un numero");
    double c = input3.nextDouble();
    double m;

    if (a>b) {
      if (a>c) {
        m=a;
      }else {
        m=c;
      }
    }else {
      if (b>c) {
        m=b;
      }else {
        m=c;
      }
    }
    System.out.println("El numero Mayor es: "+ m);
  }
}
