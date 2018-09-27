import javax.swing.JOptionPane;

public class SueldoTrabajador2{
  public static void main(String[] args) {
    double ht = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese las horas trabajadas de la semana del trabajador "));
    double ph = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el pago por hora de trabajo"));
    double ss;
    ss = ht * ph;
    JOptionPane.showMessageDialog(null,"El sueldo semanal del trabajador es: "+ ss);
  }
}
