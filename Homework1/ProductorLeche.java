import java.util.Scanner;

public class ProductorLeche{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Ingrese los litros de leche producidos");
    int l = input.nextInt();
    Scanner input2 = new Scanner(System.in);
    System.out.println("Ingrese el precio del galon de leche");
    double pg = input2.nextDouble();
    double tg;
    tg = l / 3.785;
    double ga;
    ga = pg * tg;
    System.out.println("La ganacia total del dia es: "+ ga);
  }
}
