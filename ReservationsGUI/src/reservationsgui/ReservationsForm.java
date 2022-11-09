package reservationsgui;

public class ReservationsForm
        extends javax.swing.JFrame
{
    public ReservationsForm()
    {
        initComponents();
        
//        financialAidText.setVisible(false);
//        financialAidLabel.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        DiscountButtonGroup = new javax.swing.ButtonGroup();
        welcomeLabel = new javax.swing.JLabel();
        partyNumLabel = new javax.swing.JLabel();
        partyNumField = new javax.swing.JTextField();
        CalculateButton = new javax.swing.JButton();
        CloseButton = new javax.swing.JButton();
        AddNewButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        DisplayTextArea = new javax.swing.JTextArea();
        DiscountYNLabel = new javax.swing.JLabel();
        YesButton = new javax.swing.JRadioButton();
        NoButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        welcomeLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        welcomeLabel.setText("Welcome to your party planning reservation!");

        partyNumLabel.setText("Enter the number of people in your party:");

        CalculateButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CalculateButton.setActionCommand("CalculateButton");
        CalculateButton.setLabel("Calculate");
        CalculateButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                CalculateButtonActionPerformed(evt);
            }
        });

        CloseButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CloseButton.setText("DONE");
        CloseButton.setActionCommand("CloseButton");
        CloseButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                CloseButtonActionPerformed(evt);
            }
        });

        AddNewButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        AddNewButton.setText("Add another party");
        AddNewButton.setActionCommand("AddNewButton");

        DisplayTextArea.setColumns(20);
        DisplayTextArea.setRows(5);
        jScrollPane1.setViewportView(DisplayTextArea);

        DiscountYNLabel.setText("Do you have a discount?");

        DiscountButtonGroup.add(YesButton);
        YesButton.setText("Yes");

        DiscountButtonGroup.add(NoButton);
        NoButton.setText("No");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AddNewButton)
                        .addGap(18, 18, 18)
                        .addComponent(CloseButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(partyNumLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(partyNumField, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CalculateButton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DiscountYNLabel)
                                .addGap(27, 27, 27)
                                .addComponent(YesButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(NoButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(welcomeLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(welcomeLabel)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(partyNumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(partyNumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DiscountYNLabel)
                            .addComponent(YesButton)
                            .addComponent(NoButton))
                        .addGap(40, 40, 40)
                        .addComponent(CalculateButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddNewButton)
                            .addComponent(CloseButton))
                        .addGap(65, 65, 65))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_CloseButtonActionPerformed
    {//GEN-HEADEREND:event_CloseButtonActionPerformed
        //this.Close();
        setVisible(false);
        dispose();
    }//GEN-LAST:event_CloseButtonActionPerformed

    private void CalculateButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_CalculateButtonActionPerformed
    {//GEN-HEADEREND:event_CalculateButtonActionPerformed
        int partyNum = 0;
        int numTables;
        int numChairs;   
        int exChairs;
        final double COST_PER_TABLE = 50.0; //Used for calculating price
        final double COST_PER_CHAIR = 12.0;
        int discountPerc;
        double totalCost;
        String DisplayText;
        
        int numPeople = 0;
        try
        {
             numPeople = Integer.parseInt(partyNumField.getText());
        }
        catch(Exception e)
        {
            System.out.println("Please enter a valid Integer!");
        }
        
        
        
        if(numPeople != 0)
            {
                partyNum = numPeople;
            }
        numTables = ((partyNum - 2)/2) + 1;
        numChairs = (2 + (2*numTables));
        exChairs = numChairs - partyNum;        
        if(exChairs == 2)
        {
            numTables -= 1;
            exChairs = 0;
            numChairs -= 2;
        }
        
        DisplayText = "The number of your party is " + partyNum + "\n" +
                "You will need: " + "\n" 
                + numTables + " tables" + "\n" +
                 numChairs + " chairs" + "\n" +
                "Extra chairs: " + exChairs + "\n";
        
        DisplayTextArea.setText(DisplayText);
        System.out.println(DisplayText);
    }//GEN-LAST:event_CalculateButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info
                    : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(ReservationsForm.class.getName()).
                    log(java.util.logging.Level.SEVERE,
                            null,
                            ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(ReservationsForm.class.getName()).
                    log(java.util.logging.Level.SEVERE,
                            null,
                            ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(ReservationsForm.class.getName()).
                    log(java.util.logging.Level.SEVERE,
                            null,
                            ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(ReservationsForm.class.getName()).
                    log(java.util.logging.Level.SEVERE,
                            null,
                            ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new ReservationsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddNewButton;
    private javax.swing.JButton CalculateButton;
    private javax.swing.JButton CloseButton;
    private javax.swing.ButtonGroup DiscountButtonGroup;
    private javax.swing.JLabel DiscountYNLabel;
    private javax.swing.JTextArea DisplayTextArea;
    private javax.swing.JRadioButton NoButton;
    private javax.swing.JRadioButton YesButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField partyNumField;
    private javax.swing.JLabel partyNumLabel;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
