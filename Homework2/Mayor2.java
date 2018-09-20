import java.util.Scanner;

public class Mayor2{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Ingrese un numero");
    int a = input.nextInt();

    Scanner input2 = new Scanner(System.in);
    System.out.println("Ingrese un numero");
    int b = input2.nextInt();
    int m;

    if (a>b) {
        m = a;
    }else {
        m = b;
    }
    System.out.println("El numero mayor es: "+ m);
  }
}
