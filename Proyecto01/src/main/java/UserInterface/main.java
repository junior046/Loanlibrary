/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import java.awt.Component;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import BusinessLayer.EmailServices;



/**
 *
 * @author David B
 */
public class main extends javax.swing.JFrame {
   
    /**
     * Creates new form Sign_Layer
     */
    public main() {
        initComponents();
        
                
        this.setLocationRelativeTo(null);
        this.setVisible(false);
        
        initializeInterface();
    }
    
        
    JFrame currentVisibleFrame;
    
    //INICIO DE FUNCIONES CREADAS


    private  void initializeInterface(){
        
        currentVisibleFrame=LogIn_Frame;
        
        confirmExit.setVisible(false);
        confirmExit.setLocationRelativeTo(null);
        
        LogIn_Frame.setVisible(true);
        LogIn_Frame.setLocationRelativeTo(null);
        hideEveryPanelExceptThis_LogIn(LogIn_Panel);

        
        
        
    }
       
    private void openMainFrame(){
        hideEveryPanelExceptThis_LogIn(Menu_Panel_Main,true);
        mainWindow_Frame.setVisible(true);
        mainWindow_Frame.setLocationRelativeTo(null);
        currentVisibleFrame=mainWindow_Frame;
    }
    
    private void openFrameCloseFrame(JFrame openFrame, JFrame closeFrame){
        openFrame.setVisible(true);
        openFrame.setLocationRelativeTo(null);
        closeFrame.setVisible(false);
    }

    
    private void hideEveryPanelExceptThis_MAIN(JPanel panel, boolean ... flagCleanPanel){
        boolean flagrResponseClean = (flagCleanPanel.length >= 1) ? flagCleanPanel[0] : false;
        
        for(Component component : Main_Layered_PanelBase.getComponents()) 
            if(component instanceof JPanel)
                component.setVisible(false);
        

        
        if(flagrResponseClean) cleanWindow(panel);
        
        panel.setVisible(true);
    }
    
    private void hideEveryPanelExceptThis_LogIn(JPanel panel, boolean ... flagCleanPanel){
        boolean flagrResponseClean = (flagCleanPanel.length >= 1) ? flagCleanPanel[0] : false;
        
        for(Component component : LogIn_Layered_PanelBase.getComponents()) 
            if(component instanceof JPanel)
                component.setVisible(false);
        
        if(flagrResponseClean) cleanWindow(panel);
       
        
        panel.setVisible(true);
    }
     
   private void setTitle(JPanel panel, String ... optionalMessage){
       String message = (optionalMessage.length >= 1) ? optionalMessage[0] : "";
       
       if(panel==LogIn_Panel) LogIn_label_HeadTitle.setText("Log In");
       if(panel==SignUp_Panel) LogIn_label_HeadTitle.setText("Sign Up");
       
       if(panel==SignUp_Panel) LogIn_label_HeadTitle.setText("Sign Up");
       
       
   }
   
   private void setTitleMain(JPanel panel, String ... optionalMessage){
       String message = (optionalMessage.length >= 1) ? optionalMessage[0] : "";
       
       if(panel==Menu_Panel_Main) Main_label_HeadTitle.setText("Main Menu");
       if(panel==SignUp_Panel) Main_label_HeadTitle.setText("Sign Up");
       
       if(panel==SignUp_Panel) Main_label_HeadTitle.setText("Sign Up");
       
       
   }
    
     private void cleanWindow(JPanel panel){
        for(Component component : panel.getComponents()){   
            if(component instanceof JTextField){
                JTextField comp = (JTextField) component;
                comp.setText("");
            }
            else if (component instanceof JComboBox){
                JComboBox comp = (JComboBox) component;
                comp.setSelectedIndex(0);
            }
            else if(component instanceof JFormattedTextField){
                JFormattedTextField comp = (JFormattedTextField) component;
                comp.setText("");
            }
            else if(component instanceof JTextField){
                JTextField comp = (JTextField) component;
                comp.setText("");
            }
            else if(component instanceof JTextArea){
                JTextArea comp = (JTextArea) component;
                comp.setText("");
            }
            else if(component instanceof JTable){
                JTable comp = (JTable) component;
                comp.removeAll();
            }
        }
    }
     
     private void changeHeadingMessage(String message, boolean ... flagSingIn){
         boolean responseFlagSingIn = (flagSingIn.length >= 1) ? flagSingIn[0] : false;
         if(!responseFlagSingIn){
             
         } else {
         }
     }
     
     
    private int closeProgram(){
        confirmExit.setVisible(true);
        confirmExit.setLocationRelativeTo(null);
        confirmExit.toFront();
        confirmExit.requestFocus();
        
        currentVisibleFrame.setVisible(false);

        return 0;
    }
    
    
    private javax.swing.ImageIcon getImageIcon(String imageName){
        String localDir = System.getProperty("user.dir");
        String imagesDir= "/src/main/java/UserInterface/images/";
        String absPath=localDir+imagesDir+imageName;
        return new javax.swing.ImageIcon(absPath);
    }

    //FINAL DE FUNCIONES CREADAS
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        confirmExit = new javax.swing.JDialog();
        cofirmExit_label_tittle = new javax.swing.JLabel();
        cofirmExit_button_Accept = new javax.swing.JButton();
        cofirmExit_button_Cancel = new javax.swing.JButton();
        LogIn_Frame = new javax.swing.JFrame();
        Unchangable_Layered_SignIn = new javax.swing.JLayeredPane();
        LogIn_Panel_Head = new javax.swing.JPanel();
        LogIn_label_HeadTitle = new javax.swing.JLabel();
        LogIn_label_logo = new javax.swing.JLabel();
        Unchangable_Panel_LogIn = new javax.swing.JPanel();
        LogIn_Layered_PanelBase = new javax.swing.JLayeredPane();
        LogIn_Panel = new javax.swing.JPanel();
        LogIn_TextField_UserName = new javax.swing.JTextField();
        LogIn_Label_UserName = new javax.swing.JLabel();
        LogIn_Label_Password = new javax.swing.JLabel();
        LogIn_PasswordField_Password = new javax.swing.JPasswordField();
        LogIn_Button_SignUp = new javax.swing.JButton();
        LogIn_Button_Accept = new javax.swing.JButton();
        LogIn_Button_PasswordRecovery = new javax.swing.JButton();
        LogIn_Label_PasswordRecovery = new javax.swing.JLabel();
        LogIn_Button_Accept1 = new javax.swing.JButton();
        SignUp_Panel = new javax.swing.JPanel();
        SignUp_TextField_2ndSurname = new javax.swing.JTextField();
        SignUp_Button_Cancel = new javax.swing.JButton();
        SignUp_Button_Accept = new javax.swing.JButton();
        SignUp_Label_MiddleName = new javax.swing.JLabel();
        SignUp_TextField_MiddleName = new javax.swing.JTextField();
        SignUp_Label_1stSurname = new javax.swing.JLabel();
        SignUp_TextField_1stSurname = new javax.swing.JTextField();
        SignUp_Label_2ndSurname = new javax.swing.JLabel();
        SignUp_FormattedTextField_Password = new javax.swing.JFormattedTextField();
        SignUp_Label_Password = new javax.swing.JLabel();
        LogIn_Label_Number = new javax.swing.JLabel();
        SignUp_Label_FirstName = new javax.swing.JLabel();
        SignUp_TextField_FirstName = new javax.swing.JTextField();
        SignUp_Label_Email = new javax.swing.JLabel();
        SignUp_FormattedTextField_Number = new javax.swing.JFormattedTextField();
        SignUp_FormattedTextField_ID = new javax.swing.JFormattedTextField();
        SignUp_Label_Username = new javax.swing.JLabel();
        SignUp_TextField_Username = new javax.swing.JTextField();
        SignUp_Label_ID = new javax.swing.JLabel();
        SignUp_FormattedTextField_Email1 = new javax.swing.JFormattedTextField();
        PasswordRecovery_Panel = new javax.swing.JPanel();
        PasswordRecovery_TextField_UserName = new javax.swing.JTextField();
        PasswordRecovery_Label_UserName = new javax.swing.JLabel();
        PasswordRecovery_Button_SignUp = new javax.swing.JButton();
        PasswordRecovery_Button_Accept = new javax.swing.JButton();
        mainWindow_Frame = new javax.swing.JFrame();
        Unchangable_Layered_Main = new javax.swing.JLayeredPane();
        Main_Panel_Head = new javax.swing.JPanel();
        Main_label_HeadTitle = new javax.swing.JLabel();
        Main_label_logo = new javax.swing.JLabel();
        Unchangeable_Panel_Base = new javax.swing.JPanel();
        Main_Layered_PanelBase = new javax.swing.JLayeredPane();
        Menu_Panel_Main = new javax.swing.JPanel();
        Main_Menu_Button_Contacts = new javax.swing.JButton();
        Main_Menu_Button_Items = new javax.swing.JButton();
        Main_Menu_Button_Account = new javax.swing.JButton();
        Main_Menu_Button_Exit = new javax.swing.JButton();
        Main_Menu_Button_LogOut = new javax.swing.JButton();
        Panel_Prestamos = new javax.swing.JPanel();
        Panel_LibroDetalle = new javax.swing.JPanel();
        Panel_UsuarioDetalle = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();

        confirmExit.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        confirmExit.setAlwaysOnTop(true);
        confirmExit.setFocusTraversalPolicyProvider(true);
        confirmExit.setMinimumSize(new java.awt.Dimension(400, 300));
        confirmExit.setResizable(false);
        confirmExit.setType(java.awt.Window.Type.UTILITY);

        cofirmExit_label_tittle.setFont(new java.awt.Font("Kozuka Mincho Pro L", 0, 24)); // NOI18N
        cofirmExit_label_tittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cofirmExit_label_tittle.setText("Do you want to close the program?");

        cofirmExit_button_Accept.setText("Accept");
        cofirmExit_button_Accept.setMaximumSize(new java.awt.Dimension(90, 30));
        cofirmExit_button_Accept.setMinimumSize(new java.awt.Dimension(90, 30));
        cofirmExit_button_Accept.setPreferredSize(new java.awt.Dimension(90, 30));
        cofirmExit_button_Accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cofirmExit_button_AcceptActionPerformed(evt);
            }
        });

        cofirmExit_button_Cancel.setText("Cancel");
        cofirmExit_button_Cancel.setMaximumSize(new java.awt.Dimension(90, 30));
        cofirmExit_button_Cancel.setMinimumSize(new java.awt.Dimension(90, 30));
        cofirmExit_button_Cancel.setPreferredSize(new java.awt.Dimension(90, 30));
        cofirmExit_button_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cofirmExit_button_CancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout confirmExitLayout = new javax.swing.GroupLayout(confirmExit.getContentPane());
        confirmExit.getContentPane().setLayout(confirmExitLayout);
        confirmExitLayout.setHorizontalGroup(
            confirmExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, confirmExitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cofirmExit_label_tittle, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(confirmExitLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(cofirmExit_button_Accept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(cofirmExit_button_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        confirmExitLayout.setVerticalGroup(
            confirmExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confirmExitLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(cofirmExit_label_tittle, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(confirmExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cofirmExit_button_Accept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cofirmExit_button_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        LogIn_Frame.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        LogIn_Frame.setAlwaysOnTop(true);
        LogIn_Frame.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LogIn_Frame.setFocusTraversalPolicyProvider(true);
        LogIn_Frame.setMaximumSize(new java.awt.Dimension(600, 500));
        LogIn_Frame.setMinimumSize(new java.awt.Dimension(600, 500));
        LogIn_Frame.setPreferredSize(new java.awt.Dimension(600, 500));
        LogIn_Frame.setResizable(false);

        Unchangable_Layered_SignIn.setMaximumSize(new java.awt.Dimension(600, 500));
        Unchangable_Layered_SignIn.setMinimumSize(new java.awt.Dimension(600, 500));
        Unchangable_Layered_SignIn.setLayout(new java.awt.BorderLayout());

        LogIn_Panel_Head.setBackground(new java.awt.Color(2, 48, 71));
        LogIn_Panel_Head.setMaximumSize(new java.awt.Dimension(600, 120));
        LogIn_Panel_Head.setMinimumSize(new java.awt.Dimension(600, 120));
        LogIn_Panel_Head.setPreferredSize(new java.awt.Dimension(600, 120));
        LogIn_Panel_Head.setRequestFocusEnabled(false);

        LogIn_label_HeadTitle.setFont(new java.awt.Font("Bebas Neue", 0, 60)); // NOI18N
        LogIn_label_HeadTitle.setForeground(new java.awt.Color(255, 255, 255));
        LogIn_label_HeadTitle.setText("Log In");
        LogIn_label_HeadTitle.setAlignmentY(0.0F);

        LogIn_label_logo.setIcon(getImageIcon("IsoLogoBroad.png"));

        javax.swing.GroupLayout LogIn_Panel_HeadLayout = new javax.swing.GroupLayout(LogIn_Panel_Head);
        LogIn_Panel_Head.setLayout(LogIn_Panel_HeadLayout);
        LogIn_Panel_HeadLayout.setHorizontalGroup(
            LogIn_Panel_HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogIn_Panel_HeadLayout.createSequentialGroup()
                .addComponent(LogIn_label_logo)
                .addGap(18, 18, 18)
                .addComponent(LogIn_label_HeadTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 192, Short.MAX_VALUE))
        );
        LogIn_Panel_HeadLayout.setVerticalGroup(
            LogIn_Panel_HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LogIn_label_HeadTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
            .addComponent(LogIn_label_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Unchangable_Layered_SignIn.add(LogIn_Panel_Head, java.awt.BorderLayout.PAGE_START);

        Unchangable_Panel_LogIn.setAlignmentX(0.0F);
        Unchangable_Panel_LogIn.setAlignmentY(0.0F);
        Unchangable_Panel_LogIn.setMaximumSize(new java.awt.Dimension(600, 380));
        Unchangable_Panel_LogIn.setMinimumSize(new java.awt.Dimension(600, 380));
        Unchangable_Panel_LogIn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LogIn_Layered_PanelBase.setBackground(new java.awt.Color(251, 133, 0));
        LogIn_Layered_PanelBase.setAlignmentX(0.0F);
        LogIn_Layered_PanelBase.setAlignmentY(0.0F);
        LogIn_Layered_PanelBase.setMaximumSize(new java.awt.Dimension(600, 380));
        LogIn_Layered_PanelBase.setMinimumSize(new java.awt.Dimension(600, 380));

        LogIn_Panel.setBackground(new java.awt.Color(253, 155, 2));
        LogIn_Panel.setAlignmentX(0.0F);
        LogIn_Panel.setAlignmentY(0.0F);
        LogIn_Panel.setMaximumSize(new java.awt.Dimension(600, 380));
        LogIn_Panel.setMinimumSize(new java.awt.Dimension(600, 380));

        LogIn_TextField_UserName.setMaximumSize(new java.awt.Dimension(90, 30));
        LogIn_TextField_UserName.setMinimumSize(new java.awt.Dimension(90, 30));
        LogIn_TextField_UserName.setPreferredSize(new java.awt.Dimension(90, 30));
        LogIn_TextField_UserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogIn_TextField_UserNameActionPerformed(evt);
            }
        });

        LogIn_Label_UserName.setFont(new java.awt.Font("Kozuka Mincho Pr6N L", 0, 24)); // NOI18N
        LogIn_Label_UserName.setForeground(new java.awt.Color(255, 255, 255));
        LogIn_Label_UserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LogIn_Label_UserName.setText("Username:");
        LogIn_Label_UserName.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        LogIn_Label_Password.setFont(new java.awt.Font("Kozuka Mincho Pr6N L", 0, 24)); // NOI18N
        LogIn_Label_Password.setForeground(new java.awt.Color(255, 255, 255));
        LogIn_Label_Password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LogIn_Label_Password.setText("Password:");
        LogIn_Label_Password.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        LogIn_PasswordField_Password.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        LogIn_Button_SignUp.setFont(new java.awt.Font("Lucida Sans Unicode", 2, 18)); // NOI18N
        LogIn_Button_SignUp.setText("Sign up ");
        LogIn_Button_SignUp.setAlignmentY(0.0F);
        LogIn_Button_SignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LogIn_Button_SignUp.setFocusCycleRoot(true);
        LogIn_Button_SignUp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LogIn_Button_SignUp.setIconTextGap(0);
        LogIn_Button_SignUp.setMaximumSize(new java.awt.Dimension(90, 30));
        LogIn_Button_SignUp.setMinimumSize(new java.awt.Dimension(90, 30));
        LogIn_Button_SignUp.setPreferredSize(new java.awt.Dimension(90, 30));
        LogIn_Button_SignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogIn_Button_SignUpActionPerformed(evt);
            }
        });

        LogIn_Button_Accept.setBackground(new java.awt.Color(255, 255, 255));
        LogIn_Button_Accept.setFont(new java.awt.Font("Lucida Sans Unicode", 2, 18)); // NOI18N
        LogIn_Button_Accept.setForeground(new java.awt.Color(204, 0, 0));
        LogIn_Button_Accept.setText("Exit");
        LogIn_Button_Accept.setAlignmentY(0.0F);
        LogIn_Button_Accept.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LogIn_Button_Accept.setFocusCycleRoot(true);
        LogIn_Button_Accept.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LogIn_Button_Accept.setIconTextGap(0);
        LogIn_Button_Accept.setMaximumSize(new java.awt.Dimension(90, 30));
        LogIn_Button_Accept.setMinimumSize(new java.awt.Dimension(90, 30));
        LogIn_Button_Accept.setPreferredSize(new java.awt.Dimension(90, 30));
        LogIn_Button_Accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogIn_Button_AcceptActionPerformed(evt);
            }
        });

        LogIn_Button_PasswordRecovery.setBorderPainted(false);
        LogIn_Button_PasswordRecovery.setContentAreaFilled(false);
        LogIn_Button_PasswordRecovery.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LogIn_Button_PasswordRecovery.setFocusPainted(false);
        LogIn_Button_PasswordRecovery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogIn_Button_PasswordRecoveryActionPerformed(evt);
            }
        });

        LogIn_Label_PasswordRecovery.setFont(new java.awt.Font("Kozuka Mincho Pro L", 2, 14)); // NOI18N
        LogIn_Label_PasswordRecovery.setForeground(new java.awt.Color(204, 204, 204));
        LogIn_Label_PasswordRecovery.setText("Password Recovery");
        LogIn_Label_PasswordRecovery.setToolTipText("");
        LogIn_Label_PasswordRecovery.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        LogIn_Label_PasswordRecovery.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        LogIn_Button_Accept1.setFont(new java.awt.Font("Lucida Sans Unicode", 2, 18)); // NOI18N
        LogIn_Button_Accept1.setText("Accept");
        LogIn_Button_Accept1.setAlignmentY(0.0F);
        LogIn_Button_Accept1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LogIn_Button_Accept1.setFocusCycleRoot(true);
        LogIn_Button_Accept1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LogIn_Button_Accept1.setIconTextGap(0);
        LogIn_Button_Accept1.setMaximumSize(new java.awt.Dimension(90, 30));
        LogIn_Button_Accept1.setMinimumSize(new java.awt.Dimension(90, 30));
        LogIn_Button_Accept1.setPreferredSize(new java.awt.Dimension(90, 30));
        LogIn_Button_Accept1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogIn_Button_Accept1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LogIn_PanelLayout = new javax.swing.GroupLayout(LogIn_Panel);
        LogIn_Panel.setLayout(LogIn_PanelLayout);
        LogIn_PanelLayout.setHorizontalGroup(
            LogIn_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogIn_PanelLayout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addGroup(LogIn_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LogIn_Button_PasswordRecovery, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogIn_Label_PasswordRecovery, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(LogIn_PanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(LogIn_Button_SignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addComponent(LogIn_Button_Accept1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(LogIn_Button_Accept, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(LogIn_PanelLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(LogIn_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LogIn_PanelLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(LogIn_Label_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LogIn_PasswordField_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LogIn_PanelLayout.createSequentialGroup()
                        .addComponent(LogIn_Label_UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(LogIn_TextField_UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        LogIn_PanelLayout.setVerticalGroup(
            LogIn_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogIn_PanelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(LogIn_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LogIn_Label_UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogIn_TextField_UserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(LogIn_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LogIn_PasswordField_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogIn_Label_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(LogIn_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LogIn_Button_PasswordRecovery, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogIn_Label_PasswordRecovery, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(LogIn_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LogIn_Button_SignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogIn_Button_Accept1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(LogIn_PanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(LogIn_Button_Accept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        LogIn_Layered_PanelBase.add(LogIn_Panel);
        LogIn_Panel.setBounds(0, 0, 600, 380);

        SignUp_Panel.setBackground(new java.awt.Color(253, 155, 2));
        SignUp_Panel.setMaximumSize(new java.awt.Dimension(600, 380));
        SignUp_Panel.setMinimumSize(new java.awt.Dimension(600, 380));
        SignUp_Panel.setPreferredSize(new java.awt.Dimension(600, 380));
        SignUp_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SignUp_TextField_2ndSurname.setMaximumSize(new java.awt.Dimension(90, 30));
        SignUp_TextField_2ndSurname.setMinimumSize(new java.awt.Dimension(90, 30));
        SignUp_TextField_2ndSurname.setPreferredSize(new java.awt.Dimension(90, 30));
        SignUp_TextField_2ndSurname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUp_TextField_2ndSurnameActionPerformed(evt);
            }
        });
        SignUp_Panel.add(SignUp_TextField_2ndSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 160, -1));

        SignUp_Button_Cancel.setFont(new java.awt.Font("Lucida Sans Unicode", 2, 18)); // NOI18N
        SignUp_Button_Cancel.setText("Cancel");
        SignUp_Button_Cancel.setAlignmentY(0.0F);
        SignUp_Button_Cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SignUp_Button_Cancel.setFocusCycleRoot(true);
        SignUp_Button_Cancel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SignUp_Button_Cancel.setIconTextGap(0);
        SignUp_Button_Cancel.setMaximumSize(new java.awt.Dimension(90, 30));
        SignUp_Button_Cancel.setMinimumSize(new java.awt.Dimension(90, 30));
        SignUp_Button_Cancel.setPreferredSize(new java.awt.Dimension(90, 30));
        SignUp_Button_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUp_Button_CancelActionPerformed(evt);
            }
        });
        SignUp_Panel.add(SignUp_Button_Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 120, 40));

        SignUp_Button_Accept.setFont(new java.awt.Font("Lucida Sans Unicode", 2, 18)); // NOI18N
        SignUp_Button_Accept.setText("Accept");
        SignUp_Button_Accept.setAlignmentY(0.0F);
        SignUp_Button_Accept.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SignUp_Button_Accept.setFocusCycleRoot(true);
        SignUp_Button_Accept.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SignUp_Button_Accept.setIconTextGap(0);
        SignUp_Button_Accept.setMaximumSize(new java.awt.Dimension(90, 30));
        SignUp_Button_Accept.setMinimumSize(new java.awt.Dimension(90, 30));
        SignUp_Button_Accept.setPreferredSize(new java.awt.Dimension(90, 30));
        SignUp_Button_Accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUp_Button_AcceptActionPerformed(evt);
            }
        });
        SignUp_Panel.add(SignUp_Button_Accept, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 110, 40));

        SignUp_Label_MiddleName.setFont(new java.awt.Font("Kozuka Mincho Pr6N L", 0, 18)); // NOI18N
        SignUp_Label_MiddleName.setForeground(new java.awt.Color(255, 255, 255));
        SignUp_Label_MiddleName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        SignUp_Label_MiddleName.setText("Middle name:");
        SignUp_Label_MiddleName.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        SignUp_Panel.add(SignUp_Label_MiddleName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 110, 20));

        SignUp_TextField_MiddleName.setMaximumSize(new java.awt.Dimension(90, 30));
        SignUp_TextField_MiddleName.setMinimumSize(new java.awt.Dimension(90, 30));
        SignUp_TextField_MiddleName.setPreferredSize(new java.awt.Dimension(90, 30));
        SignUp_TextField_MiddleName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUp_TextField_MiddleNameActionPerformed(evt);
            }
        });
        SignUp_Panel.add(SignUp_TextField_MiddleName, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 160, -1));

        SignUp_Label_1stSurname.setFont(new java.awt.Font("Kozuka Mincho Pr6N L", 0, 18)); // NOI18N
        SignUp_Label_1stSurname.setForeground(new java.awt.Color(255, 255, 255));
        SignUp_Label_1stSurname.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        SignUp_Label_1stSurname.setText("1st Lastname:");
        SignUp_Label_1stSurname.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        SignUp_Panel.add(SignUp_Label_1stSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 120, 20));

        SignUp_TextField_1stSurname.setMaximumSize(new java.awt.Dimension(90, 30));
        SignUp_TextField_1stSurname.setMinimumSize(new java.awt.Dimension(90, 30));
        SignUp_TextField_1stSurname.setPreferredSize(new java.awt.Dimension(90, 30));
        SignUp_TextField_1stSurname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUp_TextField_1stSurnameActionPerformed(evt);
            }
        });
        SignUp_Panel.add(SignUp_TextField_1stSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 150, 30));

        SignUp_Label_2ndSurname.setFont(new java.awt.Font("Kozuka Mincho Pr6N L", 0, 18)); // NOI18N
        SignUp_Label_2ndSurname.setForeground(new java.awt.Color(255, 255, 255));
        SignUp_Label_2ndSurname.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        SignUp_Label_2ndSurname.setText("2nd Lastname:");
        SignUp_Label_2ndSurname.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        SignUp_Panel.add(SignUp_Label_2ndSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 120, 20));
        SignUp_Panel.add(SignUp_FormattedTextField_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 160, 30));

        SignUp_Label_Password.setFont(new java.awt.Font("Kozuka Mincho Pr6N L", 0, 18)); // NOI18N
        SignUp_Label_Password.setForeground(new java.awt.Color(255, 255, 255));
        SignUp_Label_Password.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        SignUp_Label_Password.setText("Password:");
        SignUp_Label_Password.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        SignUp_Panel.add(SignUp_Label_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 100, 20));

        LogIn_Label_Number.setFont(new java.awt.Font("Kozuka Mincho Pr6N L", 0, 18)); // NOI18N
        LogIn_Label_Number.setForeground(new java.awt.Color(255, 255, 255));
        LogIn_Label_Number.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LogIn_Label_Number.setText("Number:");
        LogIn_Label_Number.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        SignUp_Panel.add(LogIn_Label_Number, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 120, 20));

        SignUp_Label_FirstName.setFont(new java.awt.Font("Kozuka Mincho Pr6N L", 0, 18)); // NOI18N
        SignUp_Label_FirstName.setForeground(new java.awt.Color(255, 255, 255));
        SignUp_Label_FirstName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        SignUp_Label_FirstName.setText("First name:");
        SignUp_Label_FirstName.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        SignUp_Panel.add(SignUp_Label_FirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 120, 30));

        SignUp_TextField_FirstName.setMaximumSize(new java.awt.Dimension(90, 30));
        SignUp_TextField_FirstName.setMinimumSize(new java.awt.Dimension(90, 30));
        SignUp_TextField_FirstName.setPreferredSize(new java.awt.Dimension(90, 30));
        SignUp_TextField_FirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUp_TextField_FirstNameActionPerformed(evt);
            }
        });
        SignUp_Panel.add(SignUp_TextField_FirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 150, 30));

        SignUp_Label_Email.setFont(new java.awt.Font("Kozuka Mincho Pr6N L", 0, 18)); // NOI18N
        SignUp_Label_Email.setForeground(new java.awt.Color(255, 255, 255));
        SignUp_Label_Email.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        SignUp_Label_Email.setText("Email:");
        SignUp_Label_Email.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        SignUp_Panel.add(SignUp_Label_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 120, 20));
        SignUp_Panel.add(SignUp_FormattedTextField_Number, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 150, 30));

        SignUp_FormattedTextField_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUp_FormattedTextField_IDActionPerformed(evt);
            }
        });
        SignUp_Panel.add(SignUp_FormattedTextField_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 150, 30));

        SignUp_Label_Username.setFont(new java.awt.Font("Kozuka Mincho Pr6N L", 0, 18)); // NOI18N
        SignUp_Label_Username.setForeground(new java.awt.Color(255, 255, 255));
        SignUp_Label_Username.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        SignUp_Label_Username.setText("Username:");
        SignUp_Label_Username.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        SignUp_Panel.add(SignUp_Label_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 100, 20));

        SignUp_TextField_Username.setMaximumSize(new java.awt.Dimension(90, 30));
        SignUp_TextField_Username.setMinimumSize(new java.awt.Dimension(90, 30));
        SignUp_TextField_Username.setPreferredSize(new java.awt.Dimension(90, 30));
        SignUp_TextField_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUp_TextField_UsernameActionPerformed(evt);
            }
        });
        SignUp_Panel.add(SignUp_TextField_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 160, 30));

        SignUp_Label_ID.setFont(new java.awt.Font("Kozuka Mincho Pr6N L", 0, 18)); // NOI18N
        SignUp_Label_ID.setForeground(new java.awt.Color(255, 255, 255));
        SignUp_Label_ID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        SignUp_Label_ID.setText("ID:");
        SignUp_Label_ID.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        SignUp_Panel.add(SignUp_Label_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 120, 20));
        SignUp_Panel.add(SignUp_FormattedTextField_Email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 150, 30));

        LogIn_Layered_PanelBase.add(SignUp_Panel);
        SignUp_Panel.setBounds(0, 0, 600, 380);

        PasswordRecovery_Panel.setBackground(new java.awt.Color(253, 155, 2));
        PasswordRecovery_Panel.setMaximumSize(new java.awt.Dimension(600, 380));
        PasswordRecovery_Panel.setMinimumSize(new java.awt.Dimension(600, 380));
        PasswordRecovery_Panel.setPreferredSize(new java.awt.Dimension(600, 380));
        PasswordRecovery_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PasswordRecovery_TextField_UserName.setMaximumSize(new java.awt.Dimension(90, 30));
        PasswordRecovery_TextField_UserName.setMinimumSize(new java.awt.Dimension(90, 30));
        PasswordRecovery_TextField_UserName.setPreferredSize(new java.awt.Dimension(90, 30));
        PasswordRecovery_TextField_UserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordRecovery_TextField_UserNameActionPerformed(evt);
            }
        });
        PasswordRecovery_Panel.add(PasswordRecovery_TextField_UserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 260, -1));

        PasswordRecovery_Label_UserName.setFont(new java.awt.Font("Kozuka Mincho Pr6N L", 0, 24)); // NOI18N
        PasswordRecovery_Label_UserName.setForeground(new java.awt.Color(255, 255, 255));
        PasswordRecovery_Label_UserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PasswordRecovery_Label_UserName.setText("Username:");
        PasswordRecovery_Label_UserName.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        PasswordRecovery_Panel.add(PasswordRecovery_Label_UserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 148, 30));

        PasswordRecovery_Button_SignUp.setFont(new java.awt.Font("Lucida Sans Unicode", 2, 18)); // NOI18N
        PasswordRecovery_Button_SignUp.setText("Cancel");
        PasswordRecovery_Button_SignUp.setAlignmentY(0.0F);
        PasswordRecovery_Button_SignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PasswordRecovery_Button_SignUp.setFocusCycleRoot(true);
        PasswordRecovery_Button_SignUp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PasswordRecovery_Button_SignUp.setIconTextGap(0);
        PasswordRecovery_Button_SignUp.setMaximumSize(new java.awt.Dimension(90, 30));
        PasswordRecovery_Button_SignUp.setMinimumSize(new java.awt.Dimension(90, 30));
        PasswordRecovery_Button_SignUp.setPreferredSize(new java.awt.Dimension(90, 30));
        PasswordRecovery_Button_SignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordRecovery_Button_SignUpActionPerformed(evt);
            }
        });
        PasswordRecovery_Panel.add(PasswordRecovery_Button_SignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 110, 40));

        PasswordRecovery_Button_Accept.setFont(new java.awt.Font("Lucida Sans Unicode", 2, 18)); // NOI18N
        PasswordRecovery_Button_Accept.setText("Accept");
        PasswordRecovery_Button_Accept.setAlignmentY(0.0F);
        PasswordRecovery_Button_Accept.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PasswordRecovery_Button_Accept.setFocusCycleRoot(true);
        PasswordRecovery_Button_Accept.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PasswordRecovery_Button_Accept.setIconTextGap(0);
        PasswordRecovery_Button_Accept.setMaximumSize(new java.awt.Dimension(90, 30));
        PasswordRecovery_Button_Accept.setMinimumSize(new java.awt.Dimension(90, 30));
        PasswordRecovery_Button_Accept.setPreferredSize(new java.awt.Dimension(90, 30));
        PasswordRecovery_Button_Accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordRecovery_Button_AcceptActionPerformed(evt);
            }
        });
        PasswordRecovery_Panel.add(PasswordRecovery_Button_Accept, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 110, 40));

        LogIn_Layered_PanelBase.add(PasswordRecovery_Panel);
        PasswordRecovery_Panel.setBounds(0, 0, 600, 380);

        Unchangable_Panel_LogIn.add(LogIn_Layered_PanelBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 380));

        Unchangable_Layered_SignIn.add(Unchangable_Panel_LogIn, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout LogIn_FrameLayout = new javax.swing.GroupLayout(LogIn_Frame.getContentPane());
        LogIn_Frame.getContentPane().setLayout(LogIn_FrameLayout);
        LogIn_FrameLayout.setHorizontalGroup(
            LogIn_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Unchangable_Layered_SignIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        LogIn_FrameLayout.setVerticalGroup(
            LogIn_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Unchangable_Layered_SignIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        mainWindow_Frame.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        mainWindow_Frame.setLocation(new java.awt.Point(0, 0));
        mainWindow_Frame.setMaximumSize(new java.awt.Dimension(900, 550));
        mainWindow_Frame.setMinimumSize(new java.awt.Dimension(900, 550));
        mainWindow_Frame.setResizable(false);
        mainWindow_Frame.setSize(new java.awt.Dimension(0, 0));

        Unchangable_Layered_Main.setMaximumSize(new java.awt.Dimension(900, 550));
        Unchangable_Layered_Main.setMinimumSize(new java.awt.Dimension(900, 550));
        Unchangable_Layered_Main.setLayout(new java.awt.BorderLayout());

        Main_Panel_Head.setBackground(new java.awt.Color(251, 133, 0));
        Main_Panel_Head.setMaximumSize(new java.awt.Dimension(900, 100));
        Main_Panel_Head.setMinimumSize(new java.awt.Dimension(900, 100));
        Main_Panel_Head.setPreferredSize(new java.awt.Dimension(900, 100));
        Main_Panel_Head.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Main_label_HeadTitle.setFont(new java.awt.Font("Bebas Neue", 1, 70)); // NOI18N
        Main_label_HeadTitle.setForeground(new java.awt.Color(255, 255, 255));
        Main_label_HeadTitle.setText("ss");
        Main_Panel_Head.add(Main_label_HeadTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 670, 100));
        Main_Panel_Head.add(Main_label_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 120));

        Unchangable_Layered_Main.add(Main_Panel_Head, java.awt.BorderLayout.PAGE_START);

        Unchangeable_Panel_Base.setMaximumSize(new java.awt.Dimension(900, 450));
        Unchangeable_Panel_Base.setMinimumSize(new java.awt.Dimension(900, 450));
        Unchangeable_Panel_Base.setLayout(new java.awt.BorderLayout());

        Main_Layered_PanelBase.setMaximumSize(new java.awt.Dimension(900, 450));
        Main_Layered_PanelBase.setMinimumSize(new java.awt.Dimension(900, 450));

        Menu_Panel_Main.setBackground(new java.awt.Color(2, 48, 71));
        Menu_Panel_Main.setMaximumSize(new java.awt.Dimension(900, 450));
        Menu_Panel_Main.setMinimumSize(new java.awt.Dimension(900, 450));
        Menu_Panel_Main.setPreferredSize(new java.awt.Dimension(900, 450));
        Menu_Panel_Main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Main_Menu_Button_Contacts.setIcon(getImageIcon("Contacts.jpg"));
        Main_Menu_Button_Contacts.setText("My Contacts");
        Main_Menu_Button_Contacts.setMaximumSize(new java.awt.Dimension(250, 300));
        Main_Menu_Button_Contacts.setMinimumSize(new java.awt.Dimension(250, 300));
        Main_Menu_Button_Contacts.setPreferredSize(new java.awt.Dimension(250, 300));
        Main_Menu_Button_Contacts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Main_Menu_Button_ContactsActionPerformed(evt);
            }
        });
        Menu_Panel_Main.add(Main_Menu_Button_Contacts, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        Main_Menu_Button_Items.setIcon(getImageIcon("Items.jpg"));
        Main_Menu_Button_Items.setText("My Account");
        Main_Menu_Button_Items.setMaximumSize(new java.awt.Dimension(250, 300));
        Main_Menu_Button_Items.setMinimumSize(new java.awt.Dimension(250, 300));
        Main_Menu_Button_Items.setPreferredSize(new java.awt.Dimension(250, 300));
        Main_Menu_Button_Items.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Main_Menu_Button_ItemsActionPerformed(evt);
            }
        });
        Menu_Panel_Main.add(Main_Menu_Button_Items, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 260, -1));

        Main_Menu_Button_Account.setIcon(getImageIcon("Account.jpg"));
        Main_Menu_Button_Account.setText("My Account");
        Main_Menu_Button_Account.setMaximumSize(new java.awt.Dimension(250, 300));
        Main_Menu_Button_Account.setMinimumSize(new java.awt.Dimension(250, 300));
        Main_Menu_Button_Account.setPreferredSize(new java.awt.Dimension(250, 300));
        Menu_Panel_Main.add(Main_Menu_Button_Account, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, -1, -1));

        Main_Menu_Button_Exit.setText("Exit");
        Main_Menu_Button_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Main_Menu_Button_ExitActionPerformed(evt);
            }
        });
        Menu_Panel_Main.add(Main_Menu_Button_Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 410, -1, -1));

        Main_Menu_Button_LogOut.setText("Log Out");
        Menu_Panel_Main.add(Main_Menu_Button_LogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 410, -1, -1));

        Main_Layered_PanelBase.add(Menu_Panel_Main);
        Menu_Panel_Main.setBounds(0, 0, 900, 450);

        Panel_Prestamos.setMaximumSize(new java.awt.Dimension(900, 450));
        Panel_Prestamos.setMinimumSize(new java.awt.Dimension(900, 450));

        javax.swing.GroupLayout Panel_PrestamosLayout = new javax.swing.GroupLayout(Panel_Prestamos);
        Panel_Prestamos.setLayout(Panel_PrestamosLayout);
        Panel_PrestamosLayout.setHorizontalGroup(
            Panel_PrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        Panel_PrestamosLayout.setVerticalGroup(
            Panel_PrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        Main_Layered_PanelBase.add(Panel_Prestamos);
        Panel_Prestamos.setBounds(0, 0, 900, 450);

        Panel_LibroDetalle.setMaximumSize(new java.awt.Dimension(900, 450));
        Panel_LibroDetalle.setMinimumSize(new java.awt.Dimension(900, 450));

        javax.swing.GroupLayout Panel_LibroDetalleLayout = new javax.swing.GroupLayout(Panel_LibroDetalle);
        Panel_LibroDetalle.setLayout(Panel_LibroDetalleLayout);
        Panel_LibroDetalleLayout.setHorizontalGroup(
            Panel_LibroDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        Panel_LibroDetalleLayout.setVerticalGroup(
            Panel_LibroDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        Main_Layered_PanelBase.add(Panel_LibroDetalle);
        Panel_LibroDetalle.setBounds(0, 0, 900, 450);

        Panel_UsuarioDetalle.setMaximumSize(new java.awt.Dimension(900, 450));
        Panel_UsuarioDetalle.setMinimumSize(new java.awt.Dimension(900, 450));

        javax.swing.GroupLayout Panel_UsuarioDetalleLayout = new javax.swing.GroupLayout(Panel_UsuarioDetalle);
        Panel_UsuarioDetalle.setLayout(Panel_UsuarioDetalleLayout);
        Panel_UsuarioDetalleLayout.setHorizontalGroup(
            Panel_UsuarioDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        Panel_UsuarioDetalleLayout.setVerticalGroup(
            Panel_UsuarioDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        Main_Layered_PanelBase.add(Panel_UsuarioDetalle);
        Panel_UsuarioDetalle.setBounds(0, 0, 900, 450);

        jPanel5.setMaximumSize(new java.awt.Dimension(900, 450));
        jPanel5.setMinimumSize(new java.awt.Dimension(900, 450));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        Main_Layered_PanelBase.add(jPanel5);
        jPanel5.setBounds(0, 0, 900, 450);

        jPanel6.setMaximumSize(new java.awt.Dimension(900, 450));
        jPanel6.setMinimumSize(new java.awt.Dimension(900, 450));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        Main_Layered_PanelBase.add(jPanel6);
        jPanel6.setBounds(0, 0, 900, 450);

        jPanel7.setMaximumSize(new java.awt.Dimension(900, 450));
        jPanel7.setMinimumSize(new java.awt.Dimension(900, 450));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        Main_Layered_PanelBase.add(jPanel7);
        jPanel7.setBounds(0, 0, 900, 450);

        jPanel8.setMaximumSize(new java.awt.Dimension(900, 450));
        jPanel8.setMinimumSize(new java.awt.Dimension(900, 450));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        Main_Layered_PanelBase.add(jPanel8);
        jPanel8.setBounds(0, 0, 900, 450);

        jPanel9.setMaximumSize(new java.awt.Dimension(900, 450));
        jPanel9.setMinimumSize(new java.awt.Dimension(900, 450));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        Main_Layered_PanelBase.add(jPanel9);
        jPanel9.setBounds(0, 0, 900, 450);

        jPanel10.setMaximumSize(new java.awt.Dimension(900, 450));
        jPanel10.setMinimumSize(new java.awt.Dimension(900, 450));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        Main_Layered_PanelBase.add(jPanel10);
        jPanel10.setBounds(0, 0, 900, 450);

        jPanel11.setMaximumSize(new java.awt.Dimension(900, 450));
        jPanel11.setMinimumSize(new java.awt.Dimension(900, 450));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        Main_Layered_PanelBase.add(jPanel11);
        jPanel11.setBounds(0, 0, 900, 450);

        jPanel12.setMaximumSize(new java.awt.Dimension(900, 450));
        jPanel12.setMinimumSize(new java.awt.Dimension(900, 450));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        Main_Layered_PanelBase.add(jPanel12);
        jPanel12.setBounds(0, 0, 900, 450);

        jPanel13.setMaximumSize(new java.awt.Dimension(900, 450));
        jPanel13.setMinimumSize(new java.awt.Dimension(900, 450));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        Main_Layered_PanelBase.add(jPanel13);
        jPanel13.setBounds(0, 0, 900, 450);

        jPanel14.setMaximumSize(new java.awt.Dimension(900, 450));
        jPanel14.setMinimumSize(new java.awt.Dimension(900, 450));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        Main_Layered_PanelBase.add(jPanel14);
        jPanel14.setBounds(0, 0, 900, 450);

        jPanel15.setMaximumSize(new java.awt.Dimension(900, 450));
        jPanel15.setMinimumSize(new java.awt.Dimension(900, 450));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        Main_Layered_PanelBase.add(jPanel15);
        jPanel15.setBounds(0, 0, 900, 450);

        Unchangeable_Panel_Base.add(Main_Layered_PanelBase, java.awt.BorderLayout.PAGE_END);

        Unchangable_Layered_Main.add(Unchangeable_Panel_Base, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout mainWindow_FrameLayout = new javax.swing.GroupLayout(mainWindow_Frame.getContentPane());
        mainWindow_Frame.getContentPane().setLayout(mainWindow_FrameLayout);
        mainWindow_FrameLayout.setHorizontalGroup(
            mainWindow_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Unchangable_Layered_Main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        mainWindow_FrameLayout.setVerticalGroup(
            mainWindow_FrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Unchangable_Layered_Main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setAutoRequestFocus(false);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setEnabled(false);
        setFocusCycleRoot(false);
        setFocusable(false);
        setFocusableWindowState(false);
        setIconImages(null);
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(0, 0));
        setName("DK"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        setType(java.awt.Window.Type.UTILITY);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Main_Menu_Button_ContactsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Main_Menu_Button_ContactsActionPerformed
        hideEveryPanelExceptThis_MAIN(Panel_Prestamos);
    }//GEN-LAST:event_Main_Menu_Button_ContactsActionPerformed

    private void cofirmExit_button_AcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cofirmExit_button_AcceptActionPerformed
        //controlador.guardarPrograma();
        System.exit(0);
    }//GEN-LAST:event_cofirmExit_button_AcceptActionPerformed

    private void cofirmExit_button_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cofirmExit_button_CancelActionPerformed
        confirmExit.setVisible(false);
        currentVisibleFrame.setVisible(true);
    }//GEN-LAST:event_cofirmExit_button_CancelActionPerformed

    private void LogIn_TextField_UserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogIn_TextField_UserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogIn_TextField_UserNameActionPerformed

    private void LogIn_Button_SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogIn_Button_SignUpActionPerformed
        hideEveryPanelExceptThis_LogIn(SignUp_Panel, true);
        
    }//GEN-LAST:event_LogIn_Button_SignUpActionPerformed

    private void LogIn_Button_AcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogIn_Button_AcceptActionPerformed
       closeProgram();
    }//GEN-LAST:event_LogIn_Button_AcceptActionPerformed

    private void LogIn_Button_PasswordRecoveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogIn_Button_PasswordRecoveryActionPerformed
        hideEveryPanelExceptThis_LogIn(PasswordRecovery_Panel, true);
    }//GEN-LAST:event_LogIn_Button_PasswordRecoveryActionPerformed

    private void LogIn_Button_Accept1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogIn_Button_Accept1ActionPerformed
        openFrameCloseFrame(mainWindow_Frame,LogIn_Frame);
        hideEveryPanelExceptThis_LogIn(Menu_Panel_Main);
        setTitleMain(Menu_Panel_Main);
    }//GEN-LAST:event_LogIn_Button_Accept1ActionPerformed

    private void SignUp_TextField_2ndSurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUp_TextField_2ndSurnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SignUp_TextField_2ndSurnameActionPerformed

    private void SignUp_Button_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUp_Button_CancelActionPerformed
        hideEveryPanelExceptThis_LogIn(LogIn_Panel, true);
    }//GEN-LAST:event_SignUp_Button_CancelActionPerformed

    private void SignUp_Button_AcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUp_Button_AcceptActionPerformed
        hideEveryPanelExceptThis_LogIn(LogIn_Panel, true);
    }//GEN-LAST:event_SignUp_Button_AcceptActionPerformed

    private void SignUp_TextField_MiddleNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUp_TextField_MiddleNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SignUp_TextField_MiddleNameActionPerformed

    private void SignUp_TextField_1stSurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUp_TextField_1stSurnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SignUp_TextField_1stSurnameActionPerformed

    private void SignUp_TextField_FirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUp_TextField_FirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SignUp_TextField_FirstNameActionPerformed

    private void SignUp_FormattedTextField_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUp_FormattedTextField_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SignUp_FormattedTextField_IDActionPerformed

    private void SignUp_TextField_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUp_TextField_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SignUp_TextField_UsernameActionPerformed

    private void PasswordRecovery_TextField_UserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordRecovery_TextField_UserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordRecovery_TextField_UserNameActionPerformed

    private void PasswordRecovery_Button_AcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordRecovery_Button_AcceptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordRecovery_Button_AcceptActionPerformed

    private void PasswordRecovery_Button_SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordRecovery_Button_SignUpActionPerformed
        hideEveryPanelExceptThis_LogIn(LogIn_Panel, true);
    }//GEN-LAST:event_PasswordRecovery_Button_SignUpActionPerformed

    private void Main_Menu_Button_ItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Main_Menu_Button_ItemsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Main_Menu_Button_ItemsActionPerformed

    private void Main_Menu_Button_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Main_Menu_Button_ExitActionPerformed
        closeProgram();
    }//GEN-LAST:event_Main_Menu_Button_ExitActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogIn_Button_Accept;
    private javax.swing.JButton LogIn_Button_Accept1;
    private javax.swing.JButton LogIn_Button_PasswordRecovery;
    private javax.swing.JButton LogIn_Button_SignUp;
    private javax.swing.JFrame LogIn_Frame;
    private javax.swing.JLabel LogIn_Label_Number;
    private javax.swing.JLabel LogIn_Label_Password;
    private javax.swing.JLabel LogIn_Label_PasswordRecovery;
    private javax.swing.JLabel LogIn_Label_UserName;
    private javax.swing.JLayeredPane LogIn_Layered_PanelBase;
    private javax.swing.JPanel LogIn_Panel;
    private javax.swing.JPanel LogIn_Panel_Head;
    private javax.swing.JPasswordField LogIn_PasswordField_Password;
    private javax.swing.JTextField LogIn_TextField_UserName;
    private javax.swing.JLabel LogIn_label_HeadTitle;
    private javax.swing.JLabel LogIn_label_logo;
    private javax.swing.JLayeredPane Main_Layered_PanelBase;
    private javax.swing.JButton Main_Menu_Button_Account;
    private javax.swing.JButton Main_Menu_Button_Contacts;
    private javax.swing.JButton Main_Menu_Button_Exit;
    private javax.swing.JButton Main_Menu_Button_Items;
    private javax.swing.JButton Main_Menu_Button_LogOut;
    private javax.swing.JPanel Main_Panel_Head;
    private javax.swing.JLabel Main_label_HeadTitle;
    private javax.swing.JLabel Main_label_logo;
    private javax.swing.JPanel Menu_Panel_Main;
    private javax.swing.JPanel Panel_LibroDetalle;
    private javax.swing.JPanel Panel_Prestamos;
    private javax.swing.JPanel Panel_UsuarioDetalle;
    private javax.swing.JButton PasswordRecovery_Button_Accept;
    private javax.swing.JButton PasswordRecovery_Button_SignUp;
    private javax.swing.JLabel PasswordRecovery_Label_UserName;
    private javax.swing.JPanel PasswordRecovery_Panel;
    private javax.swing.JTextField PasswordRecovery_TextField_UserName;
    private javax.swing.JButton SignUp_Button_Accept;
    private javax.swing.JButton SignUp_Button_Cancel;
    private javax.swing.JFormattedTextField SignUp_FormattedTextField_Email1;
    private javax.swing.JFormattedTextField SignUp_FormattedTextField_ID;
    private javax.swing.JFormattedTextField SignUp_FormattedTextField_Number;
    private javax.swing.JFormattedTextField SignUp_FormattedTextField_Password;
    private javax.swing.JLabel SignUp_Label_1stSurname;
    private javax.swing.JLabel SignUp_Label_2ndSurname;
    private javax.swing.JLabel SignUp_Label_Email;
    private javax.swing.JLabel SignUp_Label_FirstName;
    private javax.swing.JLabel SignUp_Label_ID;
    private javax.swing.JLabel SignUp_Label_MiddleName;
    private javax.swing.JLabel SignUp_Label_Password;
    private javax.swing.JLabel SignUp_Label_Username;
    private javax.swing.JPanel SignUp_Panel;
    private javax.swing.JTextField SignUp_TextField_1stSurname;
    private javax.swing.JTextField SignUp_TextField_2ndSurname;
    private javax.swing.JTextField SignUp_TextField_FirstName;
    private javax.swing.JTextField SignUp_TextField_MiddleName;
    private javax.swing.JTextField SignUp_TextField_Username;
    private javax.swing.JLayeredPane Unchangable_Layered_Main;
    private javax.swing.JLayeredPane Unchangable_Layered_SignIn;
    private javax.swing.JPanel Unchangable_Panel_LogIn;
    private javax.swing.JPanel Unchangeable_Panel_Base;
    private javax.swing.JButton cofirmExit_button_Accept;
    private javax.swing.JButton cofirmExit_button_Cancel;
    private javax.swing.JLabel cofirmExit_label_tittle;
    private javax.swing.JDialog confirmExit;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JFrame mainWindow_Frame;
    // End of variables declaration//GEN-END:variables

    private boolean not(boolean flagSingIn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
