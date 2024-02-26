package View;

import java.text.SimpleDateFormat;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import com.toedter.calendar.JCalendar;

public class UpdateView extends JFrame {
        private JLabel addPersonTitle;
        private JLabel addRoleTitle;
        private JLabel addressText;
        private JLabel emailText;
        private JLabel appTitleLabel;
        private JLabel birthDateText;
        private JLabel namePersonText;
        private JLabel nameRoleText;
        private JLabel idRoleText;
        private JLabel operationResultText;
        private JLabel phoneNumberText;
        private JLabel roleText;
        private JLabel roleNameTitle;
        private JCalendar birthDateCalendar;
        public JTextField addressTextField;
        public JTextField birthDateTextField;
        public JTextField emailTextField;
        public JTextField idPersonTextField;
        public JTextField idRoleTextField;
        public JTextField personNameTextField;
        public JTextField roleNameTextField;
        public JTextField phoneNumberTextField;
        public JComboBox<String> personRoleSelector;
        public JButton searchPersonButton;
        public JButton searchRoleButton;
        public JButton updatePersonButton;
        public JButton updateRoleButton;

        public UpdateView() {
                initComponents();
        }

        @SuppressWarnings("unchecked")
        private void initComponents() {
                appTitleLabel = new JLabel();
                namePersonText = new JLabel();
                birthDateText = new JLabel();
                addressText = new JLabel();
                roleNameTitle = new JLabel();
                emailText = new JLabel();
                addPersonTitle = new JLabel();
                operationResultText = new JLabel();
                roleText = new JLabel();
                addRoleTitle = new JLabel();
                nameRoleText = new JLabel();
                phoneNumberText = new JLabel();
                idRoleText = new JLabel();
                idPersonTextField = new JTextField();
                roleNameTextField = new JTextField();
                birthDateTextField = new JTextField();
                personNameTextField = new JTextField();
                addressTextField = new JTextField();
                emailTextField = new JTextField();
                phoneNumberTextField = new JTextField();
                idRoleTextField = new JTextField();
                updateRoleButton = new JButton();
                updatePersonButton = new JButton();
                searchRoleButton = new JButton();
                searchPersonButton = new JButton();
                personRoleSelector = new JComboBox<>();
                birthDateCalendar = new JCalendar();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                appTitleLabel.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
                appTitleLabel.setText("App Gestión Monitores/Instructores");

                namePersonText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
                namePersonText.setText("Ingrese el id:");

                birthDateText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
                birthDateText.setText("Fecha de Nacimiento:");

                addressText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
                addressText.setText("Direccion:");

                roleNameTitle.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
                roleNameTitle.setText("Nombre:");

                emailText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
                emailText.setText("Email:");

                addPersonTitle.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
                addPersonTitle.setText("Instructor/Monitor");

                updateRoleButton.setText("Actualizar Rol");

                updatePersonButton.setText("Actualizar Monitor/Instructor");

                personRoleSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));

                roleText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
                roleText.setText("Rol:");

                addRoleTitle.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
                addRoleTitle.setText("Rol");

                birthDateCalendar.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                        public void propertyChange(java.beans.PropertyChangeEvent evt) {
                                birthDateCalendarPropertyChange(evt);
                        }
                });

                nameRoleText.setFont(new java.awt.Font("Arial", 0, 14));
                nameRoleText.setText("Nombre:");

                phoneNumberText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
                phoneNumberText.setText("Numero de Telefono:");

                idRoleText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
                idRoleText.setText("Ingrese el id:");

                searchRoleButton.setText("Buscar rol");
                searchPersonButton.setText("Buscar persona");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(12, 12, 12)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                false)
                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addComponent(birthDateText)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                .addComponent(birthDateTextField,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                188,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addComponent(addressText)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                .addComponent(addressTextField))
                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addComponent(phoneNumberText)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(phoneNumberTextField))
                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addComponent(nameRoleText)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                .addComponent(personNameTextField,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                266,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                layout.createSequentialGroup()
                                                                                                                                .addGap(61, 61, 61)
                                                                                                                                .addComponent(birthDateCalendar,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(3, 3, 3)
                                                                                                .addComponent(addPersonTitle))
                                                                                .addGroup(layout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                false)
                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                .addComponent(roleText)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addComponent(personRoleSelector,
                                                                                                                                0,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE))
                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                .addComponent(emailText)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addComponent(emailTextField,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                287,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(54, 54, 54)
                                                                                                .addComponent(updatePersonButton))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(namePersonText)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(idPersonTextField,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                95,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(searchPersonButton)))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                59,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addComponent(idRoleText)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(idRoleTextField,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                95,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(searchRoleButton)
                                                                                                                                .addContainerGap())
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addGap(23, 23, 23)
                                                                                                                                .addGroup(layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                                layout.createSequentialGroup()
                                                                                                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                                                                false)
                                                                                                                                                                                                .addComponent(addRoleTitle)
                                                                                                                                                                                                .addGroup(layout
                                                                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                                roleNameTitle)
                                                                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                                roleNameTextField,
                                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                                136,
                                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                                                                                                .addGap(93, 93, 93))
                                                                                                                                                .addComponent(operationResultText,
                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                195,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                layout.createSequentialGroup()
                                                                                                                .addComponent(updateRoleButton)
                                                                                                                .addGap(111, 111,
                                                                                                                                111))))
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(131, 131, 131)
                                                                .addComponent(appTitleLabel)
                                                                .addGap(0, 0, Short.MAX_VALUE)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(appTitleLabel)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(idPersonTextField,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(namePersonText,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                26,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(idRoleTextField,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(idRoleText,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                26,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(searchRoleButton)
                                                                                .addComponent(searchPersonButton))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(addPersonTitle)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(personNameTextField,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(nameRoleText))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(phoneNumberText)
                                                                                                                .addComponent(phoneNumberTextField,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(birthDateText)
                                                                                                                .addComponent(birthDateTextField,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(birthDateCalendar,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                                                .addComponent(addressTextField,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addComponent(addressText))
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                                                .addComponent(emailText)
                                                                                                                                                .addComponent(emailTextField,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addGap(122, 122,
                                                                                                                                                122)
                                                                                                                                .addComponent(operationResultText,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                77,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(roleText)
                                                                                                                .addComponent(personRoleSelector,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(updatePersonButton)
                                                                                                .addContainerGap(28,
                                                                                                                Short.MAX_VALUE))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(addRoleTitle)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(roleNameTitle)
                                                                                                                .addComponent(roleNameTextField,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(updateRoleButton)
                                                                                                .addContainerGap(
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)))));
                pack();
        }

        private void birthDateCalendarPropertyChange(java.beans.PropertyChangeEvent evt) {// GEN-FIRST:event_birthDateCalendarPropertyChange
                if (evt.getOldValue() != null) {
                        SimpleDateFormat ff = new SimpleDateFormat("dd/MM/yyyy");
                        birthDateTextField.setText(ff.format(birthDateCalendar.getCalendar().getTime()));
                }
        }

        public static void main(String args[]) {
                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(UpdateView.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(UpdateView.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(UpdateView.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(UpdateView.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                }
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new UpdateView().setVisible(true);
                        }
                });
        }
}
