package Clase1;




/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Ventana1.java
 *
 * Created on 20-jul-2012, 7:04:05
 */
/**
 *
 * @author NIGHTMARE
 */
public class Ventana1 extends javax.swing.JFrame {

    /** Creates new form Ventana1 */
    public Ventana1() {
        initComponents();
        this.lblText.setText("Hola Mundo");

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAbrir = new javax.swing.JButton();
        lblText = new javax.swing.JLabel();
        txtTexto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnAbrir.setText("Abrir");
        btnAbrir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAbrirMouseClicked(evt);
            }
        });
        getContentPane().add(btnAbrir);
        btnAbrir.setBounds(140, 180, 120, 23);

        lblText.setText("jLabel1");
        getContentPane().add(lblText);
        lblText.setBounds(140, 80, 130, 40);
        getContentPane().add(txtTexto);
        txtTexto.setBounds(140, 140, 110, 20);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-455)/2, (screenSize.height-361)/2, 455, 361);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbrirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAbrirMouseClicked
        this.abrirVentana();
    }//GEN-LAST:event_btnAbrirMouseClicked

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Ventana1().setVisible(true);
            }
        });
    }
    public void abrirVentana(){
        Ventana2 vent=new Ventana2(this.txtTexto.getText());
        vent.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrir;
    private javax.swing.JLabel lblText;
    private javax.swing.JTextField txtTexto;
    // End of variables declaration//GEN-END:variables
}
