import java.util.Scanner;

public class Lapices{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Ingrese la cantidad de lapices a comprar");
    int x = input.nextInt();
    double pag;

    if (x>=1000) {
      pag= x*0.85;
    }else {
      pag= x*0.90;
    }
    System.out.println("El pago por los lapices es: "+pag);
  }
}
