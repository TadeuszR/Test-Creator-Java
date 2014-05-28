/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testcreator;

import java.awt.Dimension;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Tadeusz
 */
public class GeneratorWindow extends javax.swing.JFrame {

    /**
     * Creates new form GeneratorWindow
     */
    public GeneratorWindow() {
        initComponents();
        
        jTextArea1.setText("Witamy w programie Test Generator\nWybierz Otwórz z menu Plik aby wybrać test");
        answers = new JRadioButton[10];
        Enumeration<AbstractButton> en = buttonGroup1.getElements();
        int i = 0;
        while(en.hasMoreElements())
        {
            answers[i++] = (JRadioButton) en.nextElement();
            answers[i-1].setVisible(false);
        }
        prevButton.setVisible(false);
        nextButton.setVisible(false);
        markButton.setVisible(false);
        clear.setVisible(false);
        this.setMinimumSize(new Dimension(400,200));
        this.setSize(new Dimension(400,200));
        Open.setEnabled(true);
        retest.setEnabled(false);
        exitNoSave.setEnabled(false);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        prevButton = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        markButton = new javax.swing.JButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Open = new javax.swing.JMenuItem();
        retest = new javax.swing.JMenuItem();
        exitNoSave = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("jRadioButton1");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("jRadioButton2");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("jRadioButton3");

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("jRadioButton4");

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setText("jRadioButton5");

        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setText("jRadioButton6");

        buttonGroup1.add(jRadioButton7);
        jRadioButton7.setText("jRadioButton7");

        buttonGroup1.add(jRadioButton8);
        jRadioButton8.setText("jRadioButton8");

        buttonGroup1.add(jRadioButton9);
        jRadioButton9.setText("jRadioButton9");
        jRadioButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton9ActionPerformed(evt);
            }
        });

        prevButton.setText("Poprzednie");
        prevButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevButtonActionPerformed(evt);
            }
        });

        clear.setText("Wyczyść");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        nextButton.setText("Następne");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        markButton.setText("Oceń");
        markButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton10);
        jRadioButton10.setText("jRadioButton10");

        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setFocusable(false);
        jScrollPane1.setHorizontalScrollBar(null);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(212, 208, 200));
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setToolTipText("");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setHighlighter(null);
        jScrollPane1.setViewportView(jTextArea1);

        jMenu1.setText("Plik");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        Open.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        Open.setText("Otwórz");
        Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenActionPerformed(evt);
            }
        });
        jMenu1.add(Open);

        retest.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        retest.setText("Rozpocznij od nowa");
        retest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retestActionPerformed(evt);
            }
        });
        jMenu1.add(retest);

        exitNoSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        exitNoSave.setText("Wyjdź bez oceny");
        exitNoSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitNoSaveActionPerformed(evt);
            }
        });
        jMenu1.add(exitNoSave);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(markButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(prevButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextButton)
                    .addComponent(prevButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clear)
                    .addComponent(markButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton9ActionPerformed

    private void OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenActionPerformed
        // TODO add your handling code here:
    JFileChooser fc = new JFileChooser();
    fc.addChoosableFileFilter(new FileNameExtensionFilter("Simple test file", "stf"));
    fc.setAcceptAllFileFilterUsed(false);
    int r;
    current = 0;
        r = fc.showOpenDialog(this);
    if (r == JFileChooser.APPROVE_OPTION) {
    File file = fc.getSelectedFile();
        if (!file.getName().endsWith(".stf"))
        {
            OpenActionPerformed(evt);
            return;
        }
   // JOptionPane.showMessageDialog(this,file.getName());
    
        prevButton.setVisible(true);
        nextButton.setVisible(true);
        markButton.setVisible(true);
        clear.setVisible(true);
        Open.setEnabled(false);
        retest.setEnabled(true);
        exitNoSave.setEnabled(true);
        
        this.setMinimumSize(new Dimension(400,550));
        this.setSize(new Dimension(400,550));
        {	
            try (ObjectInputStream i = new ObjectInputStream(
                           new FileInputStream(file))) {
                try
                {        
                       t = (Test)i.readObject();
                       loadQuestion(0);
                }
                catch (ClassNotFoundException e)
                {
                    
                }
            } catch (IOException ex) {}
        }
    
    }
   //jMenuBar1.getComponent(0).
    
    }//GEN-LAST:event_OpenActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        // TODO add your handling code here:
        Enumeration<AbstractButton> en = buttonGroup1.getElements();
        int j = 0;
        setMarked(current);
        if (current == 0)
        {
            prevButton.setEnabled(false);
        }
        else
        {
            nextButton.setEnabled(true);
        }
        if (current < (t.test.size() - 1))
        {
            nextButton.setEnabled(true);
        }
        else
        {
            nextButton.setEnabled(false);
        }
        {
            setMarked(current);
            ++current;
            loadQuestion(current);
        }
        
    }//GEN-LAST:event_nextButtonActionPerformed

    private void prevButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevButtonActionPerformed
        // TODO add your handling code here:
//        Enumeration<AbstractButton> en = buttonGroup1.getElements();
        setMarked(current);
        --current;
        loadQuestion(current);
        
        
    }//GEN-LAST:event_prevButtonActionPerformed

    private void markButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markButtonActionPerformed

    setMarked(current);
    for(int i = 0; i < t.test.size(); ++i)
    {
        if (t.test.elementAt(i).marked == -1||t.test.elementAt(i).marked >8)
        {
           if (JOptionPane.showConfirmDialog(exitNoSave, "Nie odpowiedziałeś na wszystkie pytania!\nMoże to znacząco obniżyć ocenę.\nNa pewno ocenić?", "Uwaga", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
           {
                jTextArea1.setText(t.countMark());
               
                prevButton.setVisible(false);
                nextButton.setVisible(false);
                markButton.setVisible(false);
                clear.setVisible(false);
                this.setMinimumSize(new Dimension(400,200));
                this.setSize(new Dimension(400,200));
                for (int j = 0; j < 10; ++j) {
                   answers[j].setVisible(false);
               }
           }
           return;
           
        }
    }
    if (JOptionPane.YES_OPTION==JOptionPane.showConfirmDialog(exitNoSave, "Czy na pewno zakończyć test?\nZostanie wystawiona ocena.", "Uwaga", 0));
    {
        prevButton.setVisible(false);
        nextButton.setVisible(false);
        markButton.setVisible(false);
        clear.setVisible(false);
        Open.setEnabled(true);
        retest.setEnabled(false);
        exitNoSave.setEnabled(false);
        this.setMinimumSize(new Dimension(400,200));
        this.setSize(new Dimension(400,200));
        for (int j = 0; j < 10; ++j) {
                   answers[j].setVisible(false);     
                   
        }
        jTextArea1.setText(t.countMark());
    }
    }//GEN-LAST:event_markButtonActionPerformed

    private void retestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retestActionPerformed
    for (int i = 0; i < t.test.size(); ++i)
        t.test.elementAt(i).marked = -1;
    current = 0;
    loadQuestion(0);
    }//GEN-LAST:event_retestActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        answers[9].setSelected(true);
    }//GEN-LAST:event_clearActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void exitNoSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitNoSaveActionPerformed
        for(int i = 0; i < 9; ++i)
        {
            answers[i].setVisible(false);
        }
        clear.setVisible(false);
        nextButton.setVisible(false);
        prevButton.setVisible(false);
        markButton.setVisible(false);
        Open.setEnabled(true);
        retest.setEnabled(false);
        exitNoSave.setEnabled(false);
        
        this.setMinimumSize(new Dimension(400,200));
        this.setSize(new Dimension(400,200));
        jTextArea1.setText("Witamy w programie Test Generator\nWybierz Otwórz z menu Plik aby wybrać test");
    }//GEN-LAST:event_exitNoSaveActionPerformed
    /**
     *
     * @param n Number of question in test
     */
    public void loadQuestion(int n)
    {    
        if (current == 0)
        {
            prevButton.setEnabled(false);
        }
        else
        {
            prevButton.setEnabled(true);
        }
                
        if (current < (t.test.size() - 1))
        {
            nextButton.setEnabled(true);
        }
        else
        {
            nextButton.setEnabled(false);
        }
        try{
            Enumeration<AbstractButton> en = buttonGroup1.getElements();
            while(en.hasMoreElements())
            {
                ((JRadioButton)(en.nextElement())).setVisible(true);
            }
            jTextArea1.setText(t.test.elementAt(n).getQuest());
            en = buttonGroup1.getElements();
            for(int i = 0; i < 10; ++i)
            {
                if(i<t.test.elementAt(n).getCount())
                {
                    en.nextElement().setText(t.test.elementAt(n).getAns(i));
                }
                else
                {
                    ((JRadioButton)(en.nextElement())).setVisible(false);
                }
            }
        
            en = buttonGroup1.getElements();
            for(int i = 0; i < 10; ++i)
            {
                if(t.test.elementAt(n).marked == i)
                {
                    ((JRadioButton)(en.nextElement())).setSelected(true);
                    break;
                }
                else
                {
                    ((JRadioButton)(en.nextElement())).setSelected(true);
                }
            }
            
        }
        catch(Exception e)
        {
            
        }
    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GeneratorWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GeneratorWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GeneratorWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GeneratorWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                GeneratorWindow a;
                a = new GeneratorWindow();
                a.setVisible(true);
                
            }
        });
    }
    /**
     *
     */
    public Test t;
    int current;
    JRadioButton[] answers;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Open;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clear;
    private javax.swing.JMenuItem exitNoSave;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton markButton;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton prevButton;
    private javax.swing.JMenuItem retest;
    // End of variables declaration//GEN-END:variables

    private void setMarked(int c) {
    
    t.test.elementAt(c).marked = -1;
    Enumeration<AbstractButton> en = buttonGroup1.getElements();
        
    for (int i = 0; i < 9; ++i)
        if (((JRadioButton)en.nextElement()).isSelected())
        {
            t.test.elementAt(c).marked = i;
            break;
        }   
    }
}
