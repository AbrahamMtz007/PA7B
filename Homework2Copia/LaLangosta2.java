import javax.swing.JOptionPane;

public class LaLangosta2{
  public static void main(String[] args) {

    int np = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero de personas para el banquete"));
    double tot;

    if (np>200 && np<=300) {
      tot= np*85;
    }else if (np>300) {
      tot= np*75;
    }else {
      tot= np*95;
    }
    JOptionPane.showMessageDialog(null,"El costo total del banquete es: "+ tot);
  }
}
