import java.util.Scanner;

public class PositivoNegativo{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Ingrese un numero");
    int num = input.nextInt();
    String r;
    if (num>=0) {
      r="Es Positivo";
    }else {
      r="Es Negativo";
    }
    System.out.println(num+" "+ r);
  }
}
