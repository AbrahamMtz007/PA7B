import javax.swing.JOptionPane;

public class AreaTerreno2{
  public static void main(String[] args) {
    double b = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la medida del lado B del terreno"));
    double a = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la medida del lado A del terreno"));
    double c = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la medida del lado C del terreno"));
    double at;
    double ar;
    double area;
    at = (b*(a-c))/2;
    ar = b*c;
    area = at + ar;
    JOptionPane.showMessageDialog(null,"El area del terreno es: "+ area);
  }
}
