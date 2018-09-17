import java.util.Scanner;

public class Banco{
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Ingrese el tipo de su targeta");
    int tt = input.nextInt();

    Scanner input2 = new Scanner(System.in);
    System.out.println("Ingrese el limite actual de su credito");
    double la = input2.nextDouble();
    double ac;

    if(tt < 2){
    ac = (la*0.25)+la;
    System.out.println("Su nuevo limite de credito es: \n"+ ac);
  }
    else if(tt < 3){
    ac = (la*0.35)+la;
    System.out.println("Su nuevo limite de credito es: \n"+ ac);
  }
    else if(tt < 4){
    ac = (la*0.40)+la;
    System.out.println("Su nuevo limite de credito es: \n"+ ac);
  }
    else if(tt >= 4){
    ac = (la*0.50)+la;
    System.out.println("Su nuevo limite de credito es: \n"+ ac);
  }
  }
}
