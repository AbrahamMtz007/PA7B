import javax.swing.JOptionPane;

public class BancoTarjetas2{
  public static void main(String[] args) {

    int tt = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el tipo de su tarjeta"));
    double la = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el limite actual de su credito"));

    double ac;

    if(tt < 2){
    ac = (la*0.25)+la;
    JOptionPane.showMessageDialog(null,"Su nuevo limite de credito es: \n"+ ac);
  }
    else if(tt < 3){
    ac = (la*0.35)+la;
    JOptionPane.showMessageDialog(null,"Su nuevo limite de credito es: \n"+ ac);
  }
    else if(tt < 4){
    ac = (la*0.40)+la;
    JOptionPane.showMessageDialog(null,"Su nuevo limite de credito es: \n"+ ac);
  }
    else if(tt >= 4){
    ac = (la*0.50)+la;
    JOptionPane.showMessageDialog(null,"Su nuevo limite de credito es: \n"+ ac);
  }
  }
}
