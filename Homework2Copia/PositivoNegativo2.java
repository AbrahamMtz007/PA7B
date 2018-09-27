import javax.swing.JOptionPane;

public class PositivoNegativo2{
  public static void main(String[] args) {

    int num = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero"));
    String r;

    if (num>=0) {
      r="Es Positivo";
    }else {
      r="Es Negativo";
    }
    JOptionPane.showMessageDialog(null,num+" "+ r);
  }
}
