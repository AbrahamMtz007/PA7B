import javax.swing.JOptionPane;

public class Trajes2{
  public static void main(String[] args) {

    double ct = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el costo del traje"));
    double de;
    double pf;

    if (ct>2500) {
      de= ct*0.15;
      pf= ct-de;
    }else {
      de= ct*0.08;
      pf= ct-de;
    }
    JOptionPane.showMessageDialog(null,"El descuento obtenido es: "+ de);
    JOptionPane.showMessageDialog(null,"El precio final del traje es: "+ pf);
  }
}
