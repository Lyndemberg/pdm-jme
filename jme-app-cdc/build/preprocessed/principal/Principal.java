
package principal;

import javax.swing.JOptionPane;

/**
 * @author Lyndemberg
 */
public class Principal extends javax.swing.JFrame {
    private Triangulo triangulo;
    public Principal() {
        // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:handlingClose
        //NSIcom won't close app without this
        this.addWindowListener(new java.awt.event.WindowAdapter() {
	    public void windowClosing(java.awt.event.WindowEvent e) {System.exit(0);}
	});
        // </editor-fold>//GEN-END:handlingClose
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        input1 = new javax.swing.JTextField();
        input3 = new javax.swing.JTextField();
        input2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bt = new javax.swing.JButton();
        resultado = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        input1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Lado 1");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Lado 2");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Lado 3");

        bt.setText("CONFIRMAR");
        bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActionPerformed(evt);
            }
        });

        resultado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        resultado.setForeground(new java.awt.Color(51, 0, 255));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(48, 48, 48)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jLabel1)
                            .add(jLabel2)
                            .add(jLabel3))
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, input2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, input1)
                            .add(input3)))
                    .add(layout.createSequentialGroup()
                        .add(64, 64, 64)
                        .add(bt))
                    .add(layout.createSequentialGroup()
                        .add(40, 40, 40)
                        .add(resultado, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 174, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(38, 38, 38)
                .add(resultado, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 81, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(input1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel1))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(input2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel3)
                    .add(input3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(bt, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 49, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void input1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input1ActionPerformed
        
    }//GEN-LAST:event_input1ActionPerformed

    private void btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActionPerformed
        if(input1.getText().equals("") || input2.getText().equals("") || input3.getText().equals("")){
            JOptionPane.showMessageDialog(this.getContentPane(), "Preencha todos os lados","Erro",JOptionPane.ERROR_MESSAGE);
        }else{
            float lado1 = Float.parseFloat(input1.getText());
            float lado2 = Float.parseFloat(input2.getText());
            float lado3 = Float.parseFloat(input3.getText());
            triangulo = new Triangulo(lado1, lado2, lado3);
            resultado.setText(triangulo.getTipoTriangulo());
        }
    }//GEN-LAST:event_btActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt;
    private javax.swing.JTextField input1;
    private javax.swing.JTextField input2;
    private javax.swing.JTextField input3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel resultado;
    // End of variables declaration//GEN-END:variables
}
