import javax.swing.JOptionPane;

public class Mayor22{
  public static void main(String[] args) {
    int a = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero"));
    int b = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero"));
    int m;

    if (a>b) {
        m = a;
    }else {
        m = b;
    }
    JOptionPane.showMessageDialog(null,"El numero mayor es: "+ m);
  }
}
