import java.util.Scanner;

public class Vinicultores{
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Ingrese el tipo de uva A o B");
    String ti = input.next();
    Scanner input2 = new Scanner(System.in);
    System.out.println("Ingrese el tamaño de uva 1 o 2");
    int ta = input2.nextInt();
    Scanner input3 = new Scanner(System.in);
    System.out.println("Ingrese el precio de la uva");
    double p = input3.nextDouble();
    Scanner input4 = new Scanner(System.in);
    System.out.println("Ingrese los kilos producidos");
    int k = input4.nextInt();
    double ga;

    if (ti=="A") {
      if (ta==1) {
        p= p+0.20;
      }else {
        p= p+0.30;
      }
    }else {
      if (ta==1) {
        p= p-0.30;
      }else {
        p= p-0.50;
      }
    }
    ga= p*k;
    System.out.println("La ganancia obtenida es: "+ ga);
  }
}
