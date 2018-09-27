import javax.swing.JOptionPane;

public class MayorTres2{
  public static void main(String[] args) {

    double a = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese un numero"));
    double b = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese un numero"));
    double c = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese un numero"));
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
    JOptionPane.showMessageDialog(null,"El numero Mayor es: "+ m);
  }
}
