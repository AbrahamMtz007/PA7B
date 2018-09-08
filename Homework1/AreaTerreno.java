import java.util.Scanner;

public class AreaTerreno{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Ingrese la medida del lado B del terreno");
    double b = input.nextDouble();
    Scanner input2 = new Scanner(System.in);
    System.out.println("Ingrese la medida del lado A del terreno");
    double a = input2.nextDouble();
    Scanner input3 = new Scanner(System.in);
    System.out.println("Ingrese la medida del lado C del terreno");
    double c = input3.nextDouble();
    double at;
    double ar;
    double area;
    at = (b*(a-c))/2;
    ar = b*c;
    area = at + ar;
    System.out.println("El area del terreno es: "+ area);
  }
}
