import javax.swing.JOptionPane;

public class Consultorio2{
  public static void main(String[] args) {
    int nc = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero de consulta"));
    double cc;
    double tot;

    if (nc<=3) {
      cc=200;
      tot= nc*cc;
    }else {
      if (nc<=5) {
        cc=150;
        tot=(nc-3)*150+600;
      }else {
        if (nc<=8) {
          cc=100;
          tot=(nc-5)*100+900;
        }else {
          cc=50;
          tot=(nc-8)*50+1200;
        }
      }
    }
    JOptionPane.showMessageDialog(null,"El costo total de la consulta es: "+ cc);
    JOptionPane.showMessageDialog(null,"El costo total del tratamiento es: "+ tot);
  }
}
