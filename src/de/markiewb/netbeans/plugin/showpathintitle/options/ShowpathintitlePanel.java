/**
 * Copyright 2012 markiewb
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package de.markiewb.netbeans.plugin.showpathintitle.options;

import de.markiewb.netbeans.plugin.showpathintitle.ShowPathInTitleOptions;

final class ShowpathintitlePanel extends javax.swing.JPanel {

    private final ShowpathintitleOptionsPanelController controller;

    ShowpathintitlePanel(ShowpathintitleOptionsPanelController controller) {
        this.controller = controller;
        initComponents();
        // TODO listen to changes in form fields and call controller.changed()
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        txtIntroduction = new javax.swing.JLabel();
        cbProjectName = new javax.swing.JCheckBox();
        cbPath = new javax.swing.JCheckBox();
        cbRelativePath = new javax.swing.JCheckBox();
        cbVersion = new javax.swing.JCheckBox();
        btnReset = new javax.swing.JButton();

        org.openide.awt.Mnemonics.setLocalizedText(txtIntroduction, org.openide.util.NbBundle.getMessage(ShowpathintitlePanel.class, "ShowpathintitlePanel.txtIntroduction.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(cbProjectName, org.openide.util.NbBundle.getMessage(ShowpathintitlePanel.class, "ShowpathintitlePanel.cbProjectName.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(cbPath, org.openide.util.NbBundle.getMessage(ShowpathintitlePanel.class, "ShowpathintitlePanel.cbPath.text")); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, cbRelativePath, org.jdesktop.beansbinding.ELProperty.create("${enabled}"), cbPath, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        org.openide.awt.Mnemonics.setLocalizedText(cbRelativePath, org.openide.util.NbBundle.getMessage(ShowpathintitlePanel.class, "ShowpathintitlePanel.cbRelativePath.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(cbVersion, org.openide.util.NbBundle.getMessage(ShowpathintitlePanel.class, "ShowpathintitlePanel.cbVersion.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(btnReset, org.openide.util.NbBundle.getMessage(ShowpathintitlePanel.class, "ShowpathintitlePanel.btnReset.text")); // NOI18N
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnReset))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(cbRelativePath))
                            .addComponent(cbVersion)
                            .addComponent(cbProjectName)
                            .addComponent(txtIntroduction)
                            .addComponent(cbPath))
                        .addGap(0, 139, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtIntroduction)
                .addGap(8, 8, 8)
                .addComponent(cbProjectName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbPath)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbRelativePath)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbVersion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(btnReset)
                .addContainerGap())
        );

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        ShowPathInTitleOptions options = ShowPathInTitleOptions.load();
        options.reset();
        options.save();

        load();
    }//GEN-LAST:event_btnResetActionPerformed

    void load() {
        ShowPathInTitleOptions options = ShowPathInTitleOptions.load();
        cbVersion.setSelected(options.showIDEVersion);
        cbProjectName.setSelected(options.showProjectName);
        cbPath.setSelected(options.showFileName);
        cbRelativePath.setSelected(options.showRelativeFilename);
    }

    void store() {
        ShowPathInTitleOptions options = ShowPathInTitleOptions.load();
        options.showProjectName = cbProjectName.isSelected();
        options.showFileName = cbPath.isSelected();
        options.showIDEVersion = cbVersion.isSelected();
        options.showRelativeFilename = cbRelativePath.isSelected();
        options.save();
    }

    boolean valid() {
        // TODO check whether form is consistent and complete
        return true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JCheckBox cbPath;
    private javax.swing.JCheckBox cbProjectName;
    private javax.swing.JCheckBox cbRelativePath;
    private javax.swing.JCheckBox cbVersion;
    private javax.swing.JLabel txtIntroduction;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
