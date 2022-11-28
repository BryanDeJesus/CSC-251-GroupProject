package reservationsgui;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ReservationsForm
        extends javax.swing.JFrame
{
    public ReservationsForm()
    {
        initComponents();
        
//        PrintLists(ClassList, CreditsList);
        DiscountBox.setVisible(false);
        DiscountLabel.setVisible(false);
        GroupNumQLabel.setVisible(false);
        GroupNumComboBox.setVisible(false);
        DialogBoxPromptButton.setVisible(false);
        partyNumLabel.setVisible(false);
        partyNumField.setVisible(false);
        CalculateButton.setVisible(false);
        CalculatePriceButton.setVisible(false);
    }
    
    public static boolean HasDiscount = true; 
    public ArrayList<String> DisplayReportList = new ArrayList();
    public String DisplayText;
    public String name;
    public static final DecimalFormat df = new DecimalFormat("0.00");
    
    public int numGroups; //used for loop to generate dialog boxes to get groups within reservation info
    public int totalTables;
    public int totalChairs;
    JTextField tableInput = new JTextField();
    JTextField chairInput = new JTextField();
    // <editor-fold defaultstate="collapsed" desc="Buttons minus Dialog Prompt">  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        DiscountButtonGroup = new javax.swing.ButtonGroup();
        AutoGenButtonGroup = new javax.swing.ButtonGroup();
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
        AutoGenerateResLabel = new javax.swing.JLabel();
        AutoGenResYButton = new javax.swing.JRadioButton();
        AutoGenResNButton = new javax.swing.JRadioButton();
        GroupNumQLabel = new javax.swing.JLabel();
        GroupNumComboBox = new javax.swing.JComboBox<>();
        DialogBoxPromptButton = new javax.swing.JButton();
        CalculatePriceButton = new javax.swing.JButton();

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

        AutoGenerateResLabel.setText("<html>Would you like to have<br>your reservation autogenerated?</html>");

        AutoGenButtonGroup.add(AutoGenResYButton);
        AutoGenResYButton.setText("Yes");
        AutoGenResYButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                AutoGenResYButtonActionPerformed(evt);
            }
        });

        AutoGenButtonGroup.add(AutoGenResNButton);
        AutoGenResNButton.setText("No");
        AutoGenResNButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                AutoGenResNButtonActionPerformed(evt);
            }
        });

        GroupNumQLabel.setText("How many groups are in your party?");

        GroupNumComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25" }));

        DialogBoxPromptButton.setText("=> Enter Groups");
        DialogBoxPromptButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                DialogBoxPromptButtonActionPerformed(evt);
            }
        });

        CalculatePriceButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CalculatePriceButton.setText("Calculate Price");
        CalculatePriceButton.setActionCommand("CalculateButton");
        CalculatePriceButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                CalculatePriceButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(welcomeLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NameInputField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(DiscountYNLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(YesButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NoButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(DiscountLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DiscountBox, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(AutoGenerateResLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AutoGenResYButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AutoGenResNButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(partyNumLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(partyNumField, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(GroupNumQLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GroupNumComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DialogBoxPromptButton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(CalculateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(CalculatePriceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(PrintRecordsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PrintSingleRecordButton))
                                .addGap(27, 27, 27)
                                .addComponent(CloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addComponent(AddNewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(136, 136, 136)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(partyNumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(partyNumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(GroupNumQLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(GroupNumComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DialogBoxPromptButton)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(welcomeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(NameInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(AutoGenerateResLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(AutoGenResYButton)
                                        .addComponent(AutoGenResNButton)))
                                .addGap(73, 73, 73)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(DiscountYNLabel)
                                    .addComponent(YesButton)
                                    .addComponent(NoButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(DiscountLabel)
                                    .addComponent(DiscountBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CalculatePriceButton)
                            .addComponent(CalculateButton))
                        .addGap(41, 41, 41)
                        .addComponent(AddNewButton)
                        .addGap(101, 101, 101)
                        .addComponent(PrintSingleRecordButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PrintRecordsButton)
                            .addComponent(CloseButton))))
                .addContainerGap(39, Short.MAX_VALUE))
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

    private void AutoGenResYButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_AutoGenResYButtonActionPerformed
    {//GEN-HEADEREND:event_AutoGenResYButtonActionPerformed
        GroupNumQLabel.setVisible(false);
        GroupNumComboBox.setVisible(false);
        DialogBoxPromptButton.setVisible(false);
        CalculatePriceButton.setVisible(false);
        
        partyNumLabel.setVisible(true);
        partyNumField.setVisible(true);
        CalculateButton.setVisible(true);
    }//GEN-LAST:event_AutoGenResYButtonActionPerformed

    private void AutoGenResNButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_AutoGenResNButtonActionPerformed
    {//GEN-HEADEREND:event_AutoGenResNButtonActionPerformed
        GroupNumQLabel.setVisible(true);
        GroupNumComboBox.setVisible(true);
        DialogBoxPromptButton.setVisible(true);
        CalculatePriceButton.setVisible(true);
        
        partyNumLabel.setVisible(false);
        partyNumField.setVisible(false);
        CalculateButton.setVisible(false);
    }//GEN-LAST:event_AutoGenResNButtonActionPerformed
// </editor-fold>
    private void DialogBoxPromptButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_DialogBoxPromptButtonActionPerformed
    {//GEN-HEADEREND:event_DialogBoxPromptButtonActionPerformed

        int groupNum = Integer.parseInt((String)GroupNumComboBox.getSelectedItem());
        ManualResItemEntry(groupNum);
      
    }//GEN-LAST:event_DialogBoxPromptButtonActionPerformed

    private void CalculatePriceButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_CalculatePriceButtonActionPerformed
    {//GEN-HEADEREND:event_CalculatePriceButtonActionPerformed
        try
        {
            TakeManualInput();
            //Put in seperate method to add stuffs to list and THEN print list with print list button
        }
        catch (IOException ex)
        {
            Logger.getLogger(ReservationsForm.class.getName()).
                    log(Level.SEVERE,
                    null,
                    ex);
        }
    }//GEN-LAST:event_CalculatePriceButtonActionPerformed

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
        java.awt.EventQueue.invokeLater(() ->
        {
            new ReservationsForm().setVisible(true);
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
        double discount;
        
        
        int numPeople = 0;
        
        
        try
        {
            name = NameInputField.getText();
            numPeople = Integer.parseInt(partyNumField.getText());
        }
        catch(NumberFormatException e)
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
        discount = CalcDiscount(subTotal);
        totalCost = subTotal + CalcTax(subTotal) + CalcDiscount(subTotal);
        
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
        DisplayReportList.add(DisplayText);
        PrintSingleRecord(name, DisplayText);
        System.out.println(DisplayText);  
    }
    public void TakeManualInput() throws IOException
    {
        try
        {
            name = NameInputField.getText();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        double subTotal = CalcSubTotalPrice(totalTables, totalChairs);
        double discount = CalcDiscount(subTotal);
        double totalCost = subTotal + CalcTax(subTotal) + CalcDiscount(subTotal);
        
        DisplayText = "Reservation " + name + "\n" +
                "==============================" + "\n" +
                "Rentals: " + "\n\n" +
                "Tables: " + totalTables +  "\n" +
                "Chairs: " + totalChairs + "\n" +
                "==============================" + "\n" +
                "Subtotal: $" + df.format(subTotal) + "\n" +
                "Discount: $" + df.format(discount) + "\n" +
                "Tax: $" + df.format(CalcTax(subTotal)) + "\n" +
                "Total: $" + df.format(totalCost) + "\n" ;
        
        DisplayTextArea.setText(DisplayText);
        //ArrayList<String> DisplayReportList = new ArrayList();
        DisplayReportList.add(DisplayText);
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
    
    public double CalcDiscount(double subTotal)
    {
        // Military, First Responders, Teacher, Loyalty Customer
        double discount = 0.1;
        String discountStr = (String)DiscountBox.getSelectedItem();
        
        if(null != discountStr)
        switch (discountStr) {
            case "Military":
                discount = 0.15;
                break;
            case "First Responders":
                discount = 0.2;
                break;
            case "Teacher":
                discount = 0.15;
                break;
            case "Loyalty Customer":
                discount = 0.1;
                break;
            default:
                discount = 0;
                break;
        }
        
       return subTotal * discount;
    }
    
    public double CalcTax(double subTotal)
    {
        final double tax = 0.07;
        
        return subTotal * tax;
    }
    
    public void ManualResItemEntry(int numGroups)
    {
        Object[] items =
        {
            "Tables: ", tableInput,
            "Chairs: ", chairInput
        };
        for(int i = 0; i < numGroups; ++i)
        {
            JOptionPane.showConfirmDialog(null,items,"Enter number of people in Group" + (i + 1) ,JOptionPane.OK_CANCEL_OPTION);
            try
            {
                int tables = Integer.parseInt(tableInput.getText().toString());
                int chairs = Integer.parseInt(chairInput.getText().toString());
                totalTables += tables;
                totalChairs += chairs;
                tableInput.setText("");
                chairInput.setText("");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            
        }
    }
    
    public void PrintReport(String DisplayText) throws IOException
    {
        try (PrintWriter outputFile = new PrintWriter("Reservations Report.txt"))
        {
            DisplayReportList.forEach((record) ->
            {
                outputFile.println(record);
            });
            
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
    private javax.swing.ButtonGroup AutoGenButtonGroup;
    private javax.swing.JRadioButton AutoGenResNButton;
    private javax.swing.JRadioButton AutoGenResYButton;
    private javax.swing.JLabel AutoGenerateResLabel;
    private javax.swing.JButton CalculateButton;
    private javax.swing.JButton CalculatePriceButton;
    private javax.swing.JButton CloseButton;
    private javax.swing.JButton DialogBoxPromptButton;
    private javax.swing.JComboBox<String> DiscountBox;
    private javax.swing.ButtonGroup DiscountButtonGroup;
    private javax.swing.JLabel DiscountLabel;
    private javax.swing.JLabel DiscountYNLabel;
    private javax.swing.JTextArea DisplayTextArea;
    private javax.swing.JComboBox<String> GroupNumComboBox;
    private javax.swing.JLabel GroupNumQLabel;
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
