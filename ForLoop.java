import javax.swing.JOptionPane;

public class ForLoop{
  public static void main(String[] args) {


    int tabla = Integer.parseInt(JOptionPane.showInputDialog(null,"enter a tabla"));
    while(tabla!=0){
    String salida="";
    for(int i = 0; i <= 9; i++){
      salida += tabla + "x" + (i + 1) + " = " + (i + 1)*tabla+"\n";
    }
      JOptionPane.showMessageDialog(null, salida);
    }
  }
  }
