import javax.swing.JOptionPane;

public class ForLoop{
  public static void main(String[] args) {
    int pregunta=0;
    do{
    int tabla = Integer.parseInt(JOptionPane.showInputDialog(null,"enter a tabla"));

    String salida="";
    for(int i = 0; i <= 9; i++){
      salida += tabla + "x" + (i + 1) + " = " + (i + 1)*tabla+"\n";
    }
    JOptionPane.showMessageDialog(null, salida);
    pregunta = Integer.parseInt(JOptionPane.showInputDialog(null,"¿Quiere realizar otra tabla"));
  }

  while (pregunta !=0 );

    }
  }
