import javax.swing.JOptionPane;

public class Vinicultores2{
  public static void main(String[] args) {

    String ti = JOptionPane.showInputDialog(null,"Ingrese el tipo de uva A o B");
    int ta = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el tamaño de uva 1 o 2"));
    double p = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el precio de la uva"));
    int k = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese los kilos producidos"));
    double ga;

    if (ti=="A") {
      if (ta==1) {
        p= p+0.20;
      }else {
        p= p+0.30;
      }
    }else {
      if (ta==1) {
        p= p-0.30;
      }else {
        p= p-0.50;
      }
    }
    ga= p*k;
    JOptionPane.showMessageDialog(null,"La ganancia obtenida es: "+ ga);
  }
}
