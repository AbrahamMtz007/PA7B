import java.util.Scanner;

public class SueldoTrabajador{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Ingrese las horas trabajadas de la semana del trabajador");
    double ht = input.nextDouble();
    Scanner input2 = new Scanner(System.in);
    System.out.println("Ingrese el pago por hora de trabajo");
    double ph = input2.nextDouble();
    double ss;
    ss = ht * ph;
    System.out.println("El sueldo semanal del trabajador es: "+ ss);
  }
}
