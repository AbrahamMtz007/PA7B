import javax.swing.JOptionPane;

public class ProductorLeche2{
  public static void main(String[] args) {
    int l = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese los litros de leche producidos"));
    double pg = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el precio del galon de leche"));
    double tg;
    tg = l / 3.785;
    double ga;
    ga = pg * tg;
    JOptionPane.showMessageDialog(null,"La ganacia total del dia es: "+ ga);
  }
}
