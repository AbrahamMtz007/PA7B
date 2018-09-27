import javax.swing.JOptionPane;

public class ViajeEstudios2{
  public static void main(String[] args) {

    int na = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero de alumnos"));
    double pa;
    double tot;

    if (na>=100) {
      pa=65.00;
    }else {
      if (na>=50) {
        pa=70.00;
      }else {
        if (na>=30) {
          pa=95.00;
        }else {
          pa=4000/na;
        }
      }
    }
    tot=pa*na;
    JOptionPane.showMessageDialog(null,"El pago por alumno es: "+pa);
    JOptionPane.showMessageDialog(null,"El pago total es: "+tot);
  }
}
