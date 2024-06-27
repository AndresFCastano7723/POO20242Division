package vista;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Presentacion {
    
    public float pedirDatos(String m){
        return Float.parseFloat(JOptionPane.showInputDialog(m));
    }
    
    public void mostrarRes(String m){
        JOptionPane.showMessageDialog(null, m);
    }
    
    public float entrada(String m){
        Scanner sc = new Scanner(System.in);
        System.out.println(m);
        return sc.nextFloat();
    }
    
    public void mostrar(String m){
        System.out.println(m);
    }
}
