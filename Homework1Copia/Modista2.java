import javax.swing.JOptionPane;

public class Modista2{
  public static void main(String[] args) {
    double cm = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la cantidad de metros de tela requeridos"));
    double pg;
    pg = cm / 0.0254;
    JOptionPane.showMessageDialog(null,"La cantidad de pulgadas de tela a pedir es: "+ pg);
  }
}
