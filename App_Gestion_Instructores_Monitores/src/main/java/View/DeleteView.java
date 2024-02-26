package View;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DeleteView extends JFrame {
    private JLabel addPersonTitle;
    private JLabel addRoleTitle;
    private JLabel appTitleLabel;
    private JLabel idPersonText;
    private JLabel idRoleText;
    private JLabel operationResultText;
    public JTextField idRoleTextField;
    public JTextField idPersonTextField;
    public JButton deletePersonButton;
    public JButton deleteRoleButton;

    public DeleteView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        appTitleLabel = new JLabel();
        addRoleTitle = new JLabel();
        addPersonTitle = new JLabel();
        idPersonText = new JLabel();
        operationResultText = new JLabel();
        idRoleText = new JLabel();
        idRoleTextField = new JTextField();
        idPersonTextField = new JTextField();
        deleteRoleButton = new JButton();
        deletePersonButton = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        appTitleLabel.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        appTitleLabel.setText("App Gestión Monitores/Instructores");

        addRoleTitle.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        addRoleTitle.setText("Rol");

        addPersonTitle.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        addPersonTitle.setText("Instructor/Monitor");

        idPersonText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        idPersonText.setText("Id:");

        idRoleText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        idRoleText.setText("Id:");

        deleteRoleButton.setText("Borrar Rol");
        deletePersonButton.setText("Borrar Persona");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addComponent(operationResultText,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 341,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(addPersonTitle)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(6, 6, 6)
                                                                                .addComponent(idPersonText)
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(idPersonTextField,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        150,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(50, 50, 50)
                                                                                .addComponent(deletePersonButton)))
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(63, 63, 63)
                                                                                .addGroup(layout.createParallelGroup(
                                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(addRoleTitle)
                                                                                        .addGroup(layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(
                                                                                                        idRoleText)
                                                                                                .addPreferredGap(
                                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(
                                                                                                        idRoleTextField,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                        143,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                        .addGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                layout.createSequentialGroup()
                                                                                        .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addComponent(deleteRoleButton)
                                                                                        .addGap(40, 40, 40))))
                                                        .addComponent(appTitleLabel))))
                                .addContainerGap(22, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(appTitleLabel)
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(addPersonTitle)
                                        .addComponent(addRoleTitle))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(idPersonText)
                                        .addComponent(idPersonTextField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(idRoleText)
                                        .addComponent(idRoleTextField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(deleteRoleButton)
                                        .addComponent(deletePersonButton))
                                .addGap(46, 46, 46)
                                .addComponent(operationResultText)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        pack();
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DeleteView.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteView.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteView.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteView.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteView().setVisible(true);
            }
        });
    }
}
