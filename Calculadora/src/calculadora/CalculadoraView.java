/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;


/**
 *
 * @author phili
 */
public class CalculadoraView extends javax.swing.JFrame {

    /**
     * Creates new form CalculadoraView
     */
    public CalculadoraView() {
        initComponents();
    }

    //Variáveis utilizadas 
    float num1;
    float num2;
    String operacoesMat;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton04 = new javax.swing.JButton();
        jButton07 = new javax.swing.JButton();
        jButton01 = new javax.swing.JButton();
        jButton08 = new javax.swing.JButton();
        jButton05 = new javax.swing.JButton();
        jButton02 = new javax.swing.JButton();
        jButton09 = new javax.swing.JButton();
        jButton03 = new javax.swing.JButton();
        jButton06 = new javax.swing.JButton();
        jButton00 = new javax.swing.JButton();
        jButtonPonto = new javax.swing.JButton();
        jButtonIgual = new javax.swing.JButton();
        jButtonMais = new javax.swing.JButton();
        jButtonMenos = new javax.swing.JButton();
        jButtonMultiplicacao = new javax.swing.JButton();
        jButtonDivisao = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonCe = new javax.swing.JButton();
        jTextFieldTela = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jButton04.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton04.setText("4");
        jButton04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton04ActionPerformed(evt);
            }
        });

        jButton07.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton07.setText("7");
        jButton07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton07ActionPerformed(evt);
            }
        });

        jButton01.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton01.setText("1");
        jButton01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton01ActionPerformed(evt);
            }
        });

        jButton08.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton08.setText("8");
        jButton08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton08ActionPerformed(evt);
            }
        });

        jButton05.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton05.setText("5");
        jButton05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton05ActionPerformed(evt);
            }
        });

        jButton02.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton02.setText("2");
        jButton02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton02ActionPerformed(evt);
            }
        });

        jButton09.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton09.setText("9");
        jButton09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton09ActionPerformed(evt);
            }
        });

        jButton03.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton03.setText("3");
        jButton03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton03ActionPerformed(evt);
            }
        });

        jButton06.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton06.setText("6");
        jButton06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton06ActionPerformed(evt);
            }
        });

        jButton00.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton00.setText("0");
        jButton00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton00ActionPerformed(evt);
            }
        });

        jButtonPonto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonPonto.setText(".");
        jButtonPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPontoActionPerformed(evt);
            }
        });

        jButtonIgual.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonIgual.setText("=");
        jButtonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIgualActionPerformed(evt);
            }
        });

        jButtonMais.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonMais.setText("+");
        jButtonMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMaisActionPerformed(evt);
            }
        });

        jButtonMenos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonMenos.setText("-");
        jButtonMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenosActionPerformed(evt);
            }
        });

        jButtonMultiplicacao.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonMultiplicacao.setText("x");
        jButtonMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplicacaoActionPerformed(evt);
            }
        });

        jButtonDivisao.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonDivisao.setText("/");
        jButtonDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDivisaoActionPerformed(evt);
            }
        });

        jButtonLimpar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonLimpar.setText("C");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonCe.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonCe.setText("CE");
        jButtonCe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCeActionPerformed(evt);
            }
        });

        jTextFieldTela.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Calculadora");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton04, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton05, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton06, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton01, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton00, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton02, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton03, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonMais, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldTela, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCe, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton07, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton08, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton09, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jTextFieldTela, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCe, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton08, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton09, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton07, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton04, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton05, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton06, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton01, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton02, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton03, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton00, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButtonMais, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton02ActionPerformed
        //Pegando o número clicado
        jTextFieldTela.setText(jTextFieldTela.getText() + "2");
    }//GEN-LAST:event_jButton02ActionPerformed

    private void jButton00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton00ActionPerformed
        jTextFieldTela.setText(jTextFieldTela.getText() + "0");
    }//GEN-LAST:event_jButton00ActionPerformed

    private void jButton01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton01ActionPerformed
        jTextFieldTela.setText(jTextFieldTela.getText() + "1");
    }//GEN-LAST:event_jButton01ActionPerformed

    private void jButton03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton03ActionPerformed
        jTextFieldTela.setText(jTextFieldTela.getText() + "3");
    }//GEN-LAST:event_jButton03ActionPerformed

    private void jButton04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton04ActionPerformed
        jTextFieldTela.setText(jTextFieldTela.getText() + "4");
    }//GEN-LAST:event_jButton04ActionPerformed

    private void jButton05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton05ActionPerformed
        jTextFieldTela.setText(jTextFieldTela.getText() + "5");
    }//GEN-LAST:event_jButton05ActionPerformed

    private void jButton06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton06ActionPerformed
        jTextFieldTela.setText(jTextFieldTela.getText() + "6");
    }//GEN-LAST:event_jButton06ActionPerformed

    private void jButton07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton07ActionPerformed
        jTextFieldTela.setText(jTextFieldTela.getText() + "7");
    }//GEN-LAST:event_jButton07ActionPerformed

    private void jButton08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton08ActionPerformed
        jTextFieldTela.setText(jTextFieldTela.getText() + "8");
    }//GEN-LAST:event_jButton08ActionPerformed

    private void jButton09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton09ActionPerformed
        jTextFieldTela.setText(jTextFieldTela.getText() + "9");
    }//GEN-LAST:event_jButton09ActionPerformed

    private void jButtonPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPontoActionPerformed
        jTextFieldTela.setText(jTextFieldTela.getText() + ".");
    }//GEN-LAST:event_jButtonPontoActionPerformed

    private void jButtonCeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCeActionPerformed
        //Limpar Campo de texto da tela 
        jTextFieldTela.setText("");
    }//GEN-LAST:event_jButtonCeActionPerformed

    private void jButtonMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMaisActionPerformed
        //Recebendo o primeiro valor informado pelo usuário
        num1 = Float.parseFloat(jTextFieldTela.getText());
        jTextFieldTela.setText("");
        operacoesMat = "+";
    }//GEN-LAST:event_jButtonMaisActionPerformed

    private void jButtonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIgualActionPerformed
        num2 = Float.parseFloat(jTextFieldTela.getText());
        if (operacoesMat == "+") {
            jTextFieldTela.setText(String.valueOf(num1 + num2));
        } else if (operacoesMat == "-") {
            jTextFieldTela.setText(String.valueOf(num1 - num2));
        } else if (operacoesMat == "*") {
            jTextFieldTela.setText(String.valueOf(num1 * num2));
        } else if (operacoesMat == "/") {
            jTextFieldTela.setText(String.valueOf(num1 / num2));
        }

    }//GEN-LAST:event_jButtonIgualActionPerformed

    private void jButtonMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenosActionPerformed
        num1 = Float.parseFloat(jTextFieldTela.getText());
        jTextFieldTela.setText("");
        operacoesMat = "-";
    }//GEN-LAST:event_jButtonMenosActionPerformed

    private void jButtonMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiplicacaoActionPerformed
        num1 = Float.parseFloat(jTextFieldTela.getText());
        jTextFieldTela.setText("");
        operacoesMat = "*";
    }//GEN-LAST:event_jButtonMultiplicacaoActionPerformed

    private void jButtonDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDivisaoActionPerformed
        num1 = Float.parseFloat(jTextFieldTela.getText());
        jTextFieldTela.setText("");
        operacoesMat = "/";
    }//GEN-LAST:event_jButtonDivisaoActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        //Limpar Variáveis
        num1 = 0;
        num2 = 0;
        jTextFieldTela.setText("");
    }//GEN-LAST:event_jButtonLimparActionPerformed

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
            java.util.logging.Logger.getLogger(CalculadoraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton00;
    private javax.swing.JButton jButton01;
    private javax.swing.JButton jButton02;
    private javax.swing.JButton jButton03;
    private javax.swing.JButton jButton04;
    private javax.swing.JButton jButton05;
    private javax.swing.JButton jButton06;
    private javax.swing.JButton jButton07;
    private javax.swing.JButton jButton08;
    private javax.swing.JButton jButton09;
    private javax.swing.JButton jButtonCe;
    private javax.swing.JButton jButtonDivisao;
    private javax.swing.JButton jButtonIgual;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonMais;
    private javax.swing.JButton jButtonMenos;
    private javax.swing.JButton jButtonMultiplicacao;
    private javax.swing.JButton jButtonPonto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextFieldTela;
    // End of variables declaration//GEN-END:variables
}
