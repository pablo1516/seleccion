/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleccion;

/**
 *
 * @author david
 */
public class Seleccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FrmSeleccion frmslec = new FrmSeleccion();
        frmslec.setVisible(true);
        frmslec.setTitle("Ordenamiento por seleccion");
        frmslec.setSize(400, 300);
        frmslec.setResizable(false);
        frmslec.setLocationRelativeTo(null);
    }
    
}
