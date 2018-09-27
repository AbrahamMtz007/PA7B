import javax.swing.JOptionPane;

public class AreaFigura2{
  public static void main(String[] args) {
    double r = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el valor de R para la figura"));
    double h = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el valor de H para la figura"));
    double pi;
    pi = 3.1416;
    double c;
    c = Math.sqrt((h*h)-(r*r));
    double at;
    at = (2*(r*c))/2;
    double ac;
    ac = (pi*(r*r))/2;
    double area;
    area = at + ac;
    JOptionPane.showMessageDialog(null,"El area de la figura es: "+ area);
  }
}
