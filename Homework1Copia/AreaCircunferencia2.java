import javax.swing.JOptionPane;

public class AreaCircunferencia2{
  public static void main(String[] args) {

    double r = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el radio de la circunferencia"));
    double pi;
    pi = 3.1416;
    double area;
    area = pi *(r*r);
    JOptionPane.showMessageDialog(null,"El area de la circunferencia es: "+area);
  }
}
