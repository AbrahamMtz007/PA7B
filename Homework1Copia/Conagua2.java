import javax.swing.JOptionPane;

public class Conagua2{
  public static void main(String[] args) {
    double a = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la altura de la alberca"));
    double l = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el largo de la alberca"));
    double n = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el ancho de la alberca"));
    double cm = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el costo del metro cubico de agua"));
    double v;
    v = (a*l*n);
    double pag;
    pag = v * cm;
    JOptionPane.showMessageDialog(null,"El pago por los metros cubicos de agua consumidos es: "+ pag);
  }
}
