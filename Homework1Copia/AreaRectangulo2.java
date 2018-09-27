import javax.swing.JOptionPane;

public class AreaRectangulo2{
  public static void main(String[] args) {
    double a = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la altura del rectangulo"));
    double b = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la base del rectangulo"));
    double area;
    area = a * b;
    JOptionPane.showMessageDialog(null,"El area del rectangulo es: "+ area);
  }
}
