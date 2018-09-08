import java.util.Scanner;

public class Modista{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Ingrese la cantidad de metros de tela requeridos");
    double cm = input.nextDouble();
    double pg;
    pg = cm / 0.0254;
    System.out.println("La cantidad de pulgadas de tela a pedir es: "+ pg);
  }
}
