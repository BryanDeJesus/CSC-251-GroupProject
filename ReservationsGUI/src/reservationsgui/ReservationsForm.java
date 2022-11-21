package reservationsgui;

import javax.swing.ButtonGroup;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReservationsForm
        extends javax.swing.JFrame
{
    public ReservationsForm()
    {
        initComponents();
        
//        PrintLists(ClassList, CreditsList);
        DiscountBox.setVisible(false);
        DiscountLabel.setVisible(false);
    }
    
    public static boolean HasDiscount = true; 
    public ArrayList<String> DisplayReportList = new ArrayList();
    public String DisplayText;
    public String name;
    public static final DecimalFormat df = new DecimalFormat("0.00");

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
        jLabel1 = new javax.swing.JLabel();
        NameInputField = new javax.swing.JTextField();
        PrintRecordsButton = new javax.swing.JButton();
        PrintSingleRecordButton = new javax.swing.JButton();
        DiscountBox = new javax.swing.JComboBox<>();
        DiscountLabel = new javax.swing.JLabel();

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
        AddNewButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                AddNewButtonActionPerformed(evt);
            }
        });

        DisplayTextArea.setColumns(20);
        DisplayTextArea.setRows(5);
        jScrollPane1.setViewportView(DisplayTextArea);

        DiscountYNLabel.setText("Do you have a discount?");

        DiscountButtonGroup.add(YesButton);
        YesButton.setText("Yes");
        YesButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                YesButtonActionPerformed(evt);
            }
        });

        DiscountButtonGroup.add(NoButton);
        NoButton.setText("No");
        NoButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                NoButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Enter the name for your reservation:");

        NameInputField.setToolTipText("");

        PrintRecordsButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        PrintRecordsButton.setText("Print Records");
        PrintRecordsButton.setActionCommand("CloseButton");
        PrintRecordsButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                PrintRecordsButtonActionPerformed(evt);
            }
        });

        PrintSingleRecordButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        PrintSingleRecordButton.setText("Print Single Record");
        PrintSingleRecordButton.setActionCommand("CloseButton");
        PrintSingleRecordButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                PrintSingleRecordButtonActionPerformed(evt);
            }
        });

        DiscountBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Military", "First Responders", "Teacher", "Loyalty Customer" }));

        DiscountLabel.setText("Promo Code:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(AddNewButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(PrintSingleRecordButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NameInputField, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(DiscountLabel)
                                                    .addComponent(partyNumLabel))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(partyNumField, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(12, 12, 12)
                                                        .addComponent(DiscountBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(DiscountYNLabel)
                                                .addGap(27, 27, 27)
                                                .addComponent(YesButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(NoButton)))
                                        .addGap(22, 22, 22))))
                            .addComponent(welcomeLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(CalculateButton)
                                .addGap(160, 160, 160))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(PrintRecordsButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addComponent(welcomeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(NameInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(partyNumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(partyNumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DiscountYNLabel)
                            .addComponent(YesButton)
                            .addComponent(NoButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DiscountBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DiscountLabel))
                        .addGap(20, 20, 20)
                        .addComponent(CalculateButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(PrintSingleRecordButton)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddNewButton)
                            .addComponent(CloseButton)
                            .addComponent(PrintRecordsButton))
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
        try
        {
            TakeInput();
            //Put in seperate method to add stuffs to list and THEN print list with print list button
        }
        catch (IOException ex)
        {
            Logger.getLogger(ReservationsForm.class.getName()).
                    log(Level.SEVERE,
                    null,
                    ex);
        }
        
    }//GEN-LAST:event_CalculateButtonActionPerformed

    private void AddNewButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_AddNewButtonActionPerformed
    {//GEN-HEADEREND:event_AddNewButtonActionPerformed
        // TODO add your handling code here:
        NameInputField.setText("");
        DisplayTextArea.setText("");
        partyNumField.setText("");
    }//GEN-LAST:event_AddNewButtonActionPerformed

    private void PrintRecordsButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_PrintRecordsButtonActionPerformed
    {//GEN-HEADEREND:event_PrintRecordsButtonActionPerformed
        try
        {
            PrintReport(DisplayText);
        }
        catch (IOException ex)
        {
            Logger.getLogger(ReservationsForm.class.getName()).
                    log(Level.SEVERE,
                    null,
                    ex);
        }
    }//GEN-LAST:event_PrintRecordsButtonActionPerformed

    private void PrintSingleRecordButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_PrintSingleRecordButtonActionPerformed
    {//GEN-HEADEREND:event_PrintSingleRecordButtonActionPerformed
        try
        {
            PrintSingleRecord(name, DisplayText);
        }
        catch (IOException ex)
        {
            Logger.getLogger(ReservationsForm.class.getName()).
                    log(Level.SEVERE,
                    null,
                    ex);
        }
    }//GEN-LAST:event_PrintSingleRecordButtonActionPerformed

    private void YesButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_YesButtonActionPerformed
    {//GEN-HEADEREND:event_YesButtonActionPerformed
        HasDiscount = true;
        DiscountBox.setVisible(true);
        DiscountLabel.setVisible(true);
    }//GEN-LAST:event_YesButtonActionPerformed

    private void NoButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_NoButtonActionPerformed
    {//GEN-HEADEREND:event_NoButtonActionPerformed
        HasDiscount = false;
        DiscountBox.setVisible(false);
        DiscountLabel.setVisible(false);
    }//GEN-LAST:event_NoButtonActionPerformed

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
    
    public void TakeInput() throws IOException
    {
        int partyNum = 0;
        int numTables;
        int numChairs;   
        int exChairs;
        double subTotal;
        double totalCost;
        double discount = 0.0;
        
        
        int numPeople = 0;
        
        
        try
        {
            name = NameInputField.getText();
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
        subTotal = CalcSubTotalPrice(numChairs, numTables);
        totalCost = subTotal + CalcTax(subTotal);
        
        DisplayText = "Reservation " + name + "\n\n" +
                "The number of your party is " + partyNum + "\n" +
                "==============================" + "\n" +
                "Rentals: " + "\n\n" +
                "Tables: " + numTables +  "\n" +
                "Chairs: " + numChairs + "\n" +
                "Extra chairs: " + exChairs + "\n\n" +
                "==============================" + "\n" +
                "Subtotal: $" + df.format(subTotal) + "\n" +
                "Discount: $" + df.format(discount) + "\n" +
                "Tax: $" + df.format(CalcTax(subTotal)) + "\n" +
                "Total: $" + df.format(totalCost) + "\n" ;
        
        DisplayTextArea.setText(DisplayText);
        //ArrayList<String> DisplayReportList = new ArrayList();
        PrintSingleRecord(name, DisplayText);
        System.out.println(DisplayText);
        
        
    }
    
    public double CalcSubTotalPrice(int numChairs, int numTables)
    {
        final double COST_PER_TABLE = 20.0; //Used for calculating price
        final double COST_PER_CHAIR = 10.0;
        double subTotal;
        
        subTotal = (numTables * COST_PER_TABLE) + (numChairs * COST_PER_CHAIR);
        
        return subTotal;
    }
    
    public double CalcTax(double subTotal)
    {
        final double tax = 0.07;
        
        return subTotal * tax;
    }
    
    public static void PrintReport(String DisplayText) throws IOException
    {
        try (PrintWriter outputFile = new PrintWriter("Reservations Report.txt"))
        {
            outputFile.println(DisplayText);
        }
    }
    public static void PrintSingleRecord(String name, String DisplayText) throws IOException
    {
        try (PrintWriter outputFile = new PrintWriter(name + ".txt"))
        {
            outputFile.println(DisplayText);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddNewButton;
    private javax.swing.JButton CalculateButton;
    private javax.swing.JButton CloseButton;
    private javax.swing.JComboBox<String> DiscountBox;
    private javax.swing.ButtonGroup DiscountButtonGroup;
    private javax.swing.JLabel DiscountLabel;
    private javax.swing.JLabel DiscountYNLabel;
    private javax.swing.JTextArea DisplayTextArea;
    private javax.swing.JTextField NameInputField;
    private javax.swing.JRadioButton NoButton;
    private javax.swing.JButton PrintRecordsButton;
    private javax.swing.JButton PrintSingleRecordButton;
    private javax.swing.JRadioButton YesButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField partyNumField;
    private javax.swing.JLabel partyNumLabel;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
