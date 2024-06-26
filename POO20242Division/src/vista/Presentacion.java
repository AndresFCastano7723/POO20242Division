package vista;

import javax.swing.JOptionPane;

public class Presentacion {
    
    public float pedirDatos(String m){
        /*
        String a = JOptionPane.showInputDialog(m);
        float f = Float.parseFloat(a);
        */
        return Float.parseFloat(JOptionPane.showInputDialog(m));
    }
    
    public void mostrarRes(String m){
        JOptionPane.showMessageDialog(null, m);
    }
}
