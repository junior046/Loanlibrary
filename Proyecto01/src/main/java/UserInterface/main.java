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
import BusinessLayer.Session;
import java.io.File;
import javax.swing.filechooser.FileNameExtensionFilter;



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
    
    Session currentSession;
    
    //INICIO DE FUNCIONES CREADAS


    private  void initializeInterface(){
        
        currentVisibleFrame=LogIn_Frame;
        
        confirmExit.setVisible(false);
        confirmExit.setLocationRelativeTo(null);
        
        LogIn_Frame.setVisible(true);
        LogIn_Frame.setLocationRelativeTo(null);
        hideEveryPanelExceptThis_LogIn(LogIn_Panel);

        ImageChooser.addChoosableFileFilter(new FileNameExtensionFilter("Image Files", "jpg", "png", "jpeg"));
        
        
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
        currentVisibleFrame=openFrame;
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
       if(!message.equals("")){
           Main_label_HeadTitle.setText(message);
           return;} 
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

        ImageChooser = new javax.swing.JFileChooser();
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
        SignUp_Label_FirstName = new javax.swing.JLabel();
        SignUp_TextField_FirstName = new javax.swing.JTextField();
        SignUp_Label_Email = new javax.swing.JLabel();
        SignUp_FormattedTextField_Number = new javax.swing.JFormattedTextField();
        SignUp_FormattedTextField_ID = new javax.swing.JFormattedTextField();
        SignUp_Label_Username = new javax.swing.JLabel();
        SignUp_TextField_Username = new javax.swing.JTextField();
        SignUp_Label_ID = new javax.swing.JLabel();
        SignUp_FormattedTextField_Email1 = new javax.swing.JFormattedTextField();
        SignUp_Label_Number = new javax.swing.JLabel();
        PasswordRecovery_Panel = new javax.swing.JPanel();
        PasswordRecovery_TextField_UserName = new javax.swing.JTextField();
        PasswordRecovery_Label_UserName = new javax.swing.JLabel();
        PasswordRecovery_Button_Cancel = new javax.swing.JButton();
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
        Panel_MyAccount = new javax.swing.JPanel();
        MyAccount_TextField_2ndSurname = new javax.swing.JTextField();
        MyAccount_Label_MiddleName = new javax.swing.JLabel();
        MyAccount_TextField_MiddleName = new javax.swing.JTextField();
        MyAccount_Label_1stSurname = new javax.swing.JLabel();
        MyAccount_TextField_1stSurname = new javax.swing.JTextField();
        MyAccount_Label_2ndSurname = new javax.swing.JLabel();
        MyAccount_Label_Password = new javax.swing.JLabel();
        MyAccount_Label_FirstName = new javax.swing.JLabel();
        MyAccount_TextField_FirstName = new javax.swing.JTextField();
        MyAccount_Label_Email = new javax.swing.JLabel();
        MyAccount_FormattedTextField_Number = new javax.swing.JFormattedTextField();
        MyAccount_FormattedTextField_ID = new javax.swing.JFormattedTextField();
        MyAccount_Label_Username = new javax.swing.JLabel();
        MyAccount_TextField_Password = new javax.swing.JTextField();
        MyAccount_Label_ID = new javax.swing.JLabel();
        MyAccount_FormattedTextField_Email = new javax.swing.JFormattedTextField();
        MyAccount_Label_Number = new javax.swing.JLabel();
        MyAccount_Button_Cancel = new javax.swing.JButton();
        MyAccount_Button_Accept = new javax.swing.JButton();
        MyAccount_TextField_Username = new javax.swing.JTextField();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 32767));
        Panel_NewItem = new javax.swing.JPanel();
        NewItem_TextField_Name = new javax.swing.JTextField();
        NewItem_Button_Accept2 = new javax.swing.JButton();
        NewItem_jSpinner_Calification = new javax.swing.JSpinner();
        NewItem_jScrollPane_UNCHANGEABLE = new javax.swing.JScrollPane();
        NewItem_jTextArea_Description = new javax.swing.JTextArea();
        New_Button_Cancel = new javax.swing.JButton();
        NewItem_Button_Accept = new javax.swing.JButton();
        NewItem_Label_Calification = new javax.swing.JLabel();
        NewItem_Label_Description = new javax.swing.JLabel();
        NewItem_Label_CoverPicture = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 32767));
        NewItem_Label_ItemType = new javax.swing.JLabel();
        NewItem_LayeredPanel_ItemType = new javax.swing.JLayeredPane();
        ItemType_Panel_Book = new javax.swing.JPanel();
        Book_FormattedTextField_Edition = new javax.swing.JFormattedTextField();
        Book_Label_Edition = new javax.swing.JLabel();
        Book_Label_Editorial = new javax.swing.JLabel();
        Book_jComboBox_Editorial = new javax.swing.JComboBox<>();
        Book_Button_AddNewEditorial = new javax.swing.JButton();
        Book_label_AddNewEditorial = new javax.swing.JLabel();
        Book_Label_ISBN = new javax.swing.JLabel();
        Book_FormattedTextField_ISBN = new javax.swing.JFormattedTextField();
        Book_Label_Author = new javax.swing.JLabel();
        Book_Button_AddNewAuthor = new javax.swing.JButton();
        Book_label_AddNewAuthor = new javax.swing.JLabel();
        Book_ScrollPane_SelectAuthors_Unchangeable = new javax.swing.JScrollPane();
        Book_List_SelectAuthors = new javax.swing.JList<>();
        Book_LayeredPane_AddNewEditorialORAuthor = new javax.swing.JLayeredPane();
        HideBookOptions = new javax.swing.JPanel();
        AddNewEditorial = new javax.swing.JPanel();
        AddEditorial_Button_AddNewEditorial = new javax.swing.JButton();
        AddEditorial_Label_AddNewEditorial = new javax.swing.JLabel();
        AddEditorial_Label_NewEditorial = new javax.swing.JLabel();
        AddEditorial_TextField_NewEditorial = new javax.swing.JTextField();
        AddNewAuthor = new javax.swing.JPanel();
        AddAuthor_Label_AuthorName1 = new javax.swing.JLabel();
        AddAuthor_TextField_Name1 = new javax.swing.JTextField();
        AddAuthor_Label_AuthorName2 = new javax.swing.JLabel();
        AddAuthor_TextField_Name2 = new javax.swing.JTextField();
        AddAuthor_Label_AuthorLastname1 = new javax.swing.JLabel();
        AddAuthor_TextField_Lastname1 = new javax.swing.JTextField();
        AddAuthor_Label_AuthorLastname2 = new javax.swing.JLabel();
        AddAuthor_TextField_Lastname2 = new javax.swing.JTextField();
        AddAuthor_Button_AddNewAuthor = new javax.swing.JButton();
        AddAuthor_label_AddNewAuthor = new javax.swing.JLabel();
        ItemType_Panel_Magazine = new javax.swing.JPanel();
        Magazine_FormattedTextField_Date = new javax.swing.JFormattedTextField();
        Magazine_Label_Date = new javax.swing.JLabel();
        Magazine_FormattedTextField_Date1 = new javax.swing.JFormattedTextField();
        Magazine_Label_RegistrationNumber = new javax.swing.JLabel();
        ItemType_Panel_Game = new javax.swing.JPanel();
        Game_FormattedTextField_Year = new javax.swing.JFormattedTextField();
        Game_Label_Year = new javax.swing.JLabel();
        Game_Label_Developer = new javax.swing.JLabel();
        Game_jComboBox_DeveloperList = new javax.swing.JComboBox<>();
        Game_Button_AddNewDeveloper = new javax.swing.JButton();
        Game_Label_AddNewDeveloper = new javax.swing.JLabel();
        Game_LayeredPane_AddNewDeveloper = new javax.swing.JLayeredPane();
        HideDeveloperOptions = new javax.swing.JPanel();
        AddNewDeveloper = new javax.swing.JPanel();
        AddDeveloper_Button_AddNewDeveloper = new javax.swing.JButton();
        AddDeveloper_Label_AddNewDeveloper = new javax.swing.JLabel();
        AddDeveloper_Label_NewDeveloper = new javax.swing.JLabel();
        AddDeveloper_TextField_NewDeveloper = new javax.swing.JTextField();
        ItemType_Panel_Film = new javax.swing.JPanel();
        Film_FormattedTextField_Date = new javax.swing.JFormattedTextField();
        Film_Label_Date = new javax.swing.JLabel();
        NewItem_Label_Name = new javax.swing.JLabel();
        NewItem_Label_Clasification = new javax.swing.JLabel();
        NewItem_Button_Clasification = new javax.swing.JButton();
        NewItem_Label_Name1 = new javax.swing.JLabel();
        NewItem_jComboBox_ItemType = new javax.swing.JComboBox<>();
        Panel_Prestamos = new javax.swing.JPanel();
        Panel_UsuarioDetalle = new javax.swing.JPanel();
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

        ImageChooser.setFileFilter(null);

        confirmExit.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        confirmExit.setTitle("Exit Confirmation");
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
        LogIn_Frame.setTitle("Loanbrary - Your library for loans");
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
        LogIn_Button_SignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        LogIn_Button_Accept.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        LogIn_Button_PasswordRecovery.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogIn_Button_PasswordRecovery.setFocusPainted(false);
        LogIn_Button_PasswordRecovery.setMaximumSize(new java.awt.Dimension(120, 20));
        LogIn_Button_PasswordRecovery.setMinimumSize(new java.awt.Dimension(120, 20));
        LogIn_Button_PasswordRecovery.setPreferredSize(new java.awt.Dimension(120, 20));
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
        LogIn_Button_Accept1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
                    .addComponent(LogIn_Button_PasswordRecovery, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(LogIn_Button_PasswordRecovery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        SignUp_Button_Cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        SignUp_Button_Accept.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        SignUp_Label_Number.setFont(new java.awt.Font("Kozuka Mincho Pr6N L", 0, 18)); // NOI18N
        SignUp_Label_Number.setForeground(new java.awt.Color(255, 255, 255));
        SignUp_Label_Number.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        SignUp_Label_Number.setText("Number:");
        SignUp_Label_Number.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        SignUp_Panel.add(SignUp_Label_Number, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 120, 20));

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

        PasswordRecovery_Button_Cancel.setFont(new java.awt.Font("Lucida Sans Unicode", 2, 18)); // NOI18N
        PasswordRecovery_Button_Cancel.setText("Cancel");
        PasswordRecovery_Button_Cancel.setAlignmentY(0.0F);
        PasswordRecovery_Button_Cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PasswordRecovery_Button_Cancel.setFocusCycleRoot(true);
        PasswordRecovery_Button_Cancel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PasswordRecovery_Button_Cancel.setIconTextGap(0);
        PasswordRecovery_Button_Cancel.setMaximumSize(new java.awt.Dimension(90, 30));
        PasswordRecovery_Button_Cancel.setMinimumSize(new java.awt.Dimension(90, 30));
        PasswordRecovery_Button_Cancel.setPreferredSize(new java.awt.Dimension(90, 30));
        PasswordRecovery_Button_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordRecovery_Button_CancelActionPerformed(evt);
            }
        });
        PasswordRecovery_Panel.add(PasswordRecovery_Button_Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 110, 40));

        PasswordRecovery_Button_Accept.setFont(new java.awt.Font("Lucida Sans Unicode", 2, 18)); // NOI18N
        PasswordRecovery_Button_Accept.setText("Accept");
        PasswordRecovery_Button_Accept.setAlignmentY(0.0F);
        PasswordRecovery_Button_Accept.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        mainWindow_Frame.setTitle("Loanbrary - Your library for loans");
        mainWindow_Frame.setLocation(new java.awt.Point(0, 0));
        mainWindow_Frame.setMaximumSize(new java.awt.Dimension(900, 550));
        mainWindow_Frame.setMinimumSize(new java.awt.Dimension(900, 550));
        mainWindow_Frame.setSize(new java.awt.Dimension(900, 550));

        Unchangable_Layered_Main.setBackground(new java.awt.Color(2, 48, 71));
        Unchangable_Layered_Main.setAlignmentX(0.0F);
        Unchangable_Layered_Main.setAlignmentY(0.0F);
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
        Main_label_HeadTitle.setText("Main system");
        Main_Panel_Head.add(Main_label_HeadTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 670, 100));

        Main_label_logo.setIcon(getImageIcon("Iso.png"));
        Main_Panel_Head.add(Main_label_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 100));

        Unchangable_Layered_Main.add(Main_Panel_Head, java.awt.BorderLayout.PAGE_START);

        Unchangeable_Panel_Base.setBackground(new java.awt.Color(2, 48, 71));
        Unchangeable_Panel_Base.setAlignmentX(0.0F);
        Unchangeable_Panel_Base.setAlignmentY(0.0F);
        Unchangeable_Panel_Base.setMaximumSize(new java.awt.Dimension(900, 450));
        Unchangeable_Panel_Base.setMinimumSize(new java.awt.Dimension(900, 450));
        Unchangeable_Panel_Base.setPreferredSize(new java.awt.Dimension(900, 450));
        Unchangeable_Panel_Base.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Main_Layered_PanelBase.setAlignmentX(0.0F);
        Main_Layered_PanelBase.setAlignmentY(0.0F);
        Main_Layered_PanelBase.setMaximumSize(new java.awt.Dimension(900, 450));
        Main_Layered_PanelBase.setMinimumSize(new java.awt.Dimension(900, 450));
        Main_Layered_PanelBase.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu_Panel_Main.setBackground(new java.awt.Color(2, 48, 71));
        Menu_Panel_Main.setMaximumSize(new java.awt.Dimension(900, 450));
        Menu_Panel_Main.setMinimumSize(new java.awt.Dimension(900, 450));
        Menu_Panel_Main.setPreferredSize(new java.awt.Dimension(900, 450));
        Menu_Panel_Main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Main_Menu_Button_Contacts.setIcon(getImageIcon("Contacts.jpg"));
        Main_Menu_Button_Contacts.setText("My Contacts");
        Main_Menu_Button_Contacts.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Main_Menu_Button_Contacts.setMaximumSize(new java.awt.Dimension(250, 300));
        Main_Menu_Button_Contacts.setMinimumSize(new java.awt.Dimension(250, 300));
        Main_Menu_Button_Contacts.setPreferredSize(new java.awt.Dimension(250, 300));
        Main_Menu_Button_Contacts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Main_Menu_Button_ContactsActionPerformed(evt);
            }
        });
        Menu_Panel_Main.add(Main_Menu_Button_Contacts, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 240, -1));

        Main_Menu_Button_Items.setIcon(getImageIcon("Items.jpg"));
        Main_Menu_Button_Items.setText("My Items");
        Main_Menu_Button_Items.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Main_Menu_Button_Items.setMaximumSize(new java.awt.Dimension(250, 300));
        Main_Menu_Button_Items.setMinimumSize(new java.awt.Dimension(250, 300));
        Main_Menu_Button_Items.setPreferredSize(new java.awt.Dimension(250, 300));
        Main_Menu_Button_Items.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Main_Menu_Button_ItemsActionPerformed(evt);
            }
        });
        Menu_Panel_Main.add(Main_Menu_Button_Items, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 250, -1));

        Main_Menu_Button_Account.setIcon(getImageIcon("Account.jpg"));
        Main_Menu_Button_Account.setText("My Account");
        Main_Menu_Button_Account.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Main_Menu_Button_Account.setMaximumSize(new java.awt.Dimension(250, 300));
        Main_Menu_Button_Account.setMinimumSize(new java.awt.Dimension(250, 300));
        Main_Menu_Button_Account.setPreferredSize(new java.awt.Dimension(250, 300));
        Main_Menu_Button_Account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Main_Menu_Button_AccountActionPerformed(evt);
            }
        });
        Menu_Panel_Main.add(Main_Menu_Button_Account, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 240, -1));

        Main_Menu_Button_Exit.setFont(new java.awt.Font("Lucida Sans Unicode", 2, 18)); // NOI18N
        Main_Menu_Button_Exit.setForeground(new java.awt.Color(255, 0, 51));
        Main_Menu_Button_Exit.setText("Exit");
        Main_Menu_Button_Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Main_Menu_Button_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Main_Menu_Button_ExitActionPerformed(evt);
            }
        });
        Menu_Panel_Main.add(Main_Menu_Button_Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 360, -1, -1));

        Main_Menu_Button_LogOut.setFont(new java.awt.Font("Lucida Sans Unicode", 2, 18)); // NOI18N
        Main_Menu_Button_LogOut.setText("Log Out");
        Main_Menu_Button_LogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Main_Menu_Button_LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Main_Menu_Button_LogOutActionPerformed(evt);
            }
        });
        Menu_Panel_Main.add(Main_Menu_Button_LogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, -1, 40));

        Main_Layered_PanelBase.add(Menu_Panel_Main, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Panel_MyAccount.setBackground(new java.awt.Color(2, 48, 71));
        Panel_MyAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Panel_MyAccount.setMaximumSize(new java.awt.Dimension(900, 450));
        Panel_MyAccount.setMinimumSize(new java.awt.Dimension(900, 450));
        Panel_MyAccount.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MyAccount_TextField_2ndSurname.setMaximumSize(new java.awt.Dimension(90, 30));
        MyAccount_TextField_2ndSurname.setMinimumSize(new java.awt.Dimension(90, 30));
        MyAccount_TextField_2ndSurname.setPreferredSize(new java.awt.Dimension(90, 30));
        MyAccount_TextField_2ndSurname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MyAccount_TextField_2ndSurnameActionPerformed(evt);
            }
        });
        Panel_MyAccount.add(MyAccount_TextField_2ndSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, 160, -1));

        MyAccount_Label_MiddleName.setFont(new java.awt.Font("Kozuka Mincho Pr6N L", 0, 18)); // NOI18N
        MyAccount_Label_MiddleName.setForeground(new java.awt.Color(255, 255, 255));
        MyAccount_Label_MiddleName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        MyAccount_Label_MiddleName.setText("Middle name:");
        MyAccount_Label_MiddleName.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Panel_MyAccount.add(MyAccount_Label_MiddleName, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 110, 20));

        MyAccount_TextField_MiddleName.setMaximumSize(new java.awt.Dimension(90, 30));
        MyAccount_TextField_MiddleName.setMinimumSize(new java.awt.Dimension(90, 30));
        MyAccount_TextField_MiddleName.setPreferredSize(new java.awt.Dimension(90, 30));
        MyAccount_TextField_MiddleName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MyAccount_TextField_MiddleNameActionPerformed(evt);
            }
        });
        Panel_MyAccount.add(MyAccount_TextField_MiddleName, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 160, -1));

        MyAccount_Label_1stSurname.setFont(new java.awt.Font("Kozuka Mincho Pr6N L", 0, 18)); // NOI18N
        MyAccount_Label_1stSurname.setForeground(new java.awt.Color(255, 255, 255));
        MyAccount_Label_1stSurname.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        MyAccount_Label_1stSurname.setText("1st Lastname:");
        MyAccount_Label_1stSurname.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Panel_MyAccount.add(MyAccount_Label_1stSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 120, 20));

        MyAccount_TextField_1stSurname.setMaximumSize(new java.awt.Dimension(90, 30));
        MyAccount_TextField_1stSurname.setMinimumSize(new java.awt.Dimension(90, 30));
        MyAccount_TextField_1stSurname.setPreferredSize(new java.awt.Dimension(90, 30));
        MyAccount_TextField_1stSurname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MyAccount_TextField_1stSurnameActionPerformed(evt);
            }
        });
        Panel_MyAccount.add(MyAccount_TextField_1stSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 160, 30));

        MyAccount_Label_2ndSurname.setFont(new java.awt.Font("Kozuka Mincho Pr6N L", 0, 18)); // NOI18N
        MyAccount_Label_2ndSurname.setForeground(new java.awt.Color(255, 255, 255));
        MyAccount_Label_2ndSurname.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        MyAccount_Label_2ndSurname.setText("2nd Lastname:");
        MyAccount_Label_2ndSurname.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Panel_MyAccount.add(MyAccount_Label_2ndSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 120, 20));

        MyAccount_Label_Password.setFont(new java.awt.Font("Kozuka Mincho Pr6N L", 0, 18)); // NOI18N
        MyAccount_Label_Password.setForeground(new java.awt.Color(255, 255, 255));
        MyAccount_Label_Password.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        MyAccount_Label_Password.setText("Password:");
        MyAccount_Label_Password.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Panel_MyAccount.add(MyAccount_Label_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 100, 20));

        MyAccount_Label_FirstName.setFont(new java.awt.Font("Kozuka Mincho Pr6N L", 0, 18)); // NOI18N
        MyAccount_Label_FirstName.setForeground(new java.awt.Color(255, 255, 255));
        MyAccount_Label_FirstName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        MyAccount_Label_FirstName.setText("First name:");
        MyAccount_Label_FirstName.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Panel_MyAccount.add(MyAccount_Label_FirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 120, 30));

        MyAccount_TextField_FirstName.setMaximumSize(new java.awt.Dimension(90, 30));
        MyAccount_TextField_FirstName.setMinimumSize(new java.awt.Dimension(90, 30));
        MyAccount_TextField_FirstName.setPreferredSize(new java.awt.Dimension(90, 30));
        MyAccount_TextField_FirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MyAccount_TextField_FirstNameActionPerformed(evt);
            }
        });
        Panel_MyAccount.add(MyAccount_TextField_FirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 160, 30));

        MyAccount_Label_Email.setFont(new java.awt.Font("Kozuka Mincho Pr6N L", 0, 18)); // NOI18N
        MyAccount_Label_Email.setForeground(new java.awt.Color(255, 255, 255));
        MyAccount_Label_Email.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        MyAccount_Label_Email.setText("Email:");
        MyAccount_Label_Email.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Panel_MyAccount.add(MyAccount_Label_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 80, 20));
        Panel_MyAccount.add(MyAccount_FormattedTextField_Number, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 160, 30));

        MyAccount_FormattedTextField_ID.setEditable(false);
        MyAccount_FormattedTextField_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MyAccount_FormattedTextField_IDActionPerformed(evt);
            }
        });
        Panel_MyAccount.add(MyAccount_FormattedTextField_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 160, 30));

        MyAccount_Label_Username.setFont(new java.awt.Font("Kozuka Mincho Pr6N L", 0, 18)); // NOI18N
        MyAccount_Label_Username.setForeground(new java.awt.Color(255, 255, 255));
        MyAccount_Label_Username.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        MyAccount_Label_Username.setText("Username:");
        MyAccount_Label_Username.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Panel_MyAccount.add(MyAccount_Label_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 100, 20));

        MyAccount_TextField_Password.setEditable(false);
        MyAccount_TextField_Password.setMaximumSize(new java.awt.Dimension(90, 30));
        MyAccount_TextField_Password.setMinimumSize(new java.awt.Dimension(90, 30));
        MyAccount_TextField_Password.setPreferredSize(new java.awt.Dimension(90, 30));
        MyAccount_TextField_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MyAccount_TextField_PasswordActionPerformed(evt);
            }
        });
        Panel_MyAccount.add(MyAccount_TextField_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 160, 30));

        MyAccount_Label_ID.setFont(new java.awt.Font("Kozuka Mincho Pr6N L", 0, 18)); // NOI18N
        MyAccount_Label_ID.setForeground(new java.awt.Color(255, 255, 255));
        MyAccount_Label_ID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        MyAccount_Label_ID.setText("ID:");
        MyAccount_Label_ID.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Panel_MyAccount.add(MyAccount_Label_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 100, 20));

        MyAccount_FormattedTextField_Email.setEditable(false);
        MyAccount_FormattedTextField_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MyAccount_FormattedTextField_EmailActionPerformed(evt);
            }
        });
        Panel_MyAccount.add(MyAccount_FormattedTextField_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 160, 30));

        MyAccount_Label_Number.setFont(new java.awt.Font("Kozuka Mincho Pr6N L", 0, 18)); // NOI18N
        MyAccount_Label_Number.setForeground(new java.awt.Color(255, 255, 255));
        MyAccount_Label_Number.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        MyAccount_Label_Number.setText("Number:");
        MyAccount_Label_Number.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Panel_MyAccount.add(MyAccount_Label_Number, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 120, 20));

        MyAccount_Button_Cancel.setFont(new java.awt.Font("Lucida Sans Unicode", 2, 18)); // NOI18N
        MyAccount_Button_Cancel.setText("Cancel");
        MyAccount_Button_Cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MyAccount_Button_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MyAccount_Button_CancelActionPerformed(evt);
            }
        });
        Panel_MyAccount.add(MyAccount_Button_Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, -1, 40));

        MyAccount_Button_Accept.setFont(new java.awt.Font("Lucida Sans Unicode", 2, 18)); // NOI18N
        MyAccount_Button_Accept.setText("Accept");
        MyAccount_Button_Accept.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MyAccount_Button_Accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MyAccount_Button_AcceptActionPerformed(evt);
            }
        });
        Panel_MyAccount.add(MyAccount_Button_Accept, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 360, 90, 40));

        MyAccount_TextField_Username.setEditable(false);
        MyAccount_TextField_Username.setMaximumSize(new java.awt.Dimension(90, 30));
        MyAccount_TextField_Username.setMinimumSize(new java.awt.Dimension(90, 30));
        MyAccount_TextField_Username.setPreferredSize(new java.awt.Dimension(90, 30));
        MyAccount_TextField_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MyAccount_TextField_UsernameActionPerformed(evt);
            }
        });
        Panel_MyAccount.add(MyAccount_TextField_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 160, 30));
        Panel_MyAccount.add(filler2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 400, 110, 50));

        Main_Layered_PanelBase.add(Panel_MyAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 450));

        Panel_NewItem.setBackground(new java.awt.Color(2, 48, 71));
        Panel_NewItem.setMaximumSize(new java.awt.Dimension(901, 451));
        Panel_NewItem.setMinimumSize(new java.awt.Dimension(900, 450));
        Panel_NewItem.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NewItem_TextField_Name.setEditable(false);
        NewItem_TextField_Name.setMaximumSize(new java.awt.Dimension(90, 30));
        NewItem_TextField_Name.setMinimumSize(new java.awt.Dimension(90, 30));
        NewItem_TextField_Name.setPreferredSize(new java.awt.Dimension(90, 30));
        NewItem_TextField_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewItem_TextField_NameActionPerformed(evt);
            }
        });
        Panel_NewItem.add(NewItem_TextField_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 170, 30));

        NewItem_Button_Accept2.setFont(new java.awt.Font("Lucida Sans Unicode", 2, 18)); // NOI18N
        NewItem_Button_Accept2.setText("Cover Picture");
        NewItem_Button_Accept2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NewItem_Button_Accept2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewItem_Button_Accept2ActionPerformed(evt);
            }
        });
        Panel_NewItem.add(NewItem_Button_Accept2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 170, 30));
        Panel_NewItem.add(NewItem_jSpinner_Calification, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 170, 30));

        NewItem_jTextArea_Description.setColumns(20);
        NewItem_jTextArea_Description.setRows(5);
        NewItem_jScrollPane_UNCHANGEABLE.setViewportView(NewItem_jTextArea_Description);

        Panel_NewItem.add(NewItem_jScrollPane_UNCHANGEABLE, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 170, 100));

        New_Button_Cancel.setFont(new java.awt.Font("Lucida Sans Unicode", 2, 18)); // NOI18N
        New_Button_Cancel.setText("Cancel");
        New_Button_Cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        New_Button_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                New_Button_CancelActionPerformed(evt);
            }
        });
        Panel_NewItem.add(New_Button_Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, -1, 40));

        NewItem_Button_Accept.setFont(new java.awt.Font("Lucida Sans Unicode", 2, 18)); // NOI18N
        NewItem_Button_Accept.setText("Accept");
        NewItem_Button_Accept.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NewItem_Button_Accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewItem_Button_AcceptActionPerformed(evt);
            }
        });
        Panel_NewItem.add(NewItem_Button_Accept, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 360, 90, 40));

        NewItem_Label_Calification.setFont(new java.awt.Font("Kozuka Mincho Pr6N L", 0, 18)); // NOI18N
        NewItem_Label_Calification.setForeground(new java.awt.Color(255, 255, 255));
        NewItem_Label_Calification.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        NewItem_Label_Calification.setText("Calification:");
        NewItem_Label_Calification.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Panel_NewItem.add(NewItem_Label_Calification, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 100, 20));

        NewItem_Label_Description.setFont(new java.awt.Font("Kozuka Mincho Pr6N L", 0, 18)); // NOI18N
        NewItem_Label_Description.setForeground(new java.awt.Color(255, 255, 255));
        NewItem_Label_Description.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        NewItem_Label_Description.setText("Description:");
        NewItem_Label_Description.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Panel_NewItem.add(NewItem_Label_Description, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 100, 20));

        NewItem_Label_CoverPicture.setFont(new java.awt.Font("Kozuka Mincho Pr6N L", 0, 18)); // NOI18N
        NewItem_Label_CoverPicture.setForeground(new java.awt.Color(255, 255, 255));
        NewItem_Label_CoverPicture.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        NewItem_Label_CoverPicture.setText("Cover picture:");
        NewItem_Label_CoverPicture.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Panel_NewItem.add(NewItem_Label_CoverPicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 120, 20));
        Panel_NewItem.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 400, 110, 50));

        NewItem_Label_ItemType.setFont(new java.awt.Font("Kozuka Mincho Pr6N L", 0, 18)); // NOI18N
        NewItem_Label_ItemType.setForeground(new java.awt.Color(255, 255, 255));
        NewItem_Label_ItemType.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        NewItem_Label_ItemType.setText("Item type:");
        NewItem_Label_ItemType.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Panel_NewItem.add(NewItem_Label_ItemType, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 100, 20));

        NewItem_LayeredPanel_ItemType.setMaximumSize(new java.awt.Dimension(380, 250));
        NewItem_LayeredPanel_ItemType.setMinimumSize(new java.awt.Dimension(380, 250));
        NewItem_LayeredPanel_ItemType.setPreferredSize(new java.awt.Dimension(380, 250));
        NewItem_LayeredPanel_ItemType.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ItemType_Panel_Book.setBackground(new java.awt.Color(2, 48, 71));
        ItemType_Panel_Book.setAlignmentX(0.0F);
        ItemType_Panel_Book.setAlignmentY(0.0F);
        ItemType_Panel_Book.setMaximumSize(new java.awt.Dimension(380, 250));
        ItemType_Panel_Book.setMinimumSize(new java.awt.Dimension(380, 250));
        ItemType_Panel_Book.setPreferredSize(new java.awt.Dimension(380, 250));
        ItemType_Panel_Book.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Book_FormattedTextField_Edition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Book_FormattedTextField_EditionActionPerformed(evt);
            }
        });
        ItemType_Panel_Book.add(Book_FormattedTextField_Edition, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 30, 30));

        Book_Label_Edition.setFont(new java.awt.Font("Kozuka Mincho Pr6N L", 0, 18)); // NOI18N
        Book_Label_Edition.setForeground(new java.awt.Color(255, 255, 255));
        Book_Label_Edition.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Book_Label_Edition.setText("Edition:");
        Book_Label_Edition.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ItemType_Panel_Book.add(Book_Label_Edition, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 100, 20));

        Book_Label_Editorial.setFont(new java.awt.Font("Kozuka Mincho Pr6N L", 0, 18)); // NOI18N
        Book_Label_Editorial.setForeground(new java.awt.Color(255, 255, 255));
        Book_Label_Editorial.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Book_Label_Editorial.setLabelFor(Game_jComboBox_DeveloperList);
        Book_Label_Editorial.setText("Editorial:");
        Book_Label_Editorial.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ItemType_Panel_Book.add(Book_Label_Editorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 100, 20));

        Book_jComboBox_Editorial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Book_jComboBox_Editorial.setMaximumSize(new java.awt.Dimension(58, 30));
        Book_jComboBox_Editorial.setMinimumSize(new java.awt.Dimension(58, 30));
        Book_jComboBox_Editorial.setPreferredSize(new java.awt.Dimension(58, 30));
        Book_jComboBox_Editorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Book_jComboBox_EditorialActionPerformed(evt);
            }
        });
        ItemType_Panel_Book.add(Book_jComboBox_Editorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 140, -1));

        Book_Button_AddNewEditorial.setFont(new java.awt.Font("Old English Text MT", 1, 3)); // NOI18N
        Book_Button_AddNewEditorial.setToolTipText("Add a new editorial");
        Book_Button_AddNewEditorial.setBorderPainted(false);
        Book_Button_AddNewEditorial.setContentAreaFilled(false);
        Book_Button_AddNewEditorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Book_Button_AddNewEditorial.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Book_Button_AddNewEditorial.setMaximumSize(new java.awt.Dimension(30, 30));
        Book_Button_AddNewEditorial.setMinimumSize(new java.awt.Dimension(30, 30));
        Book_Button_AddNewEditorial.setPreferredSize(new java.awt.Dimension(30, 30));
        ItemType_Panel_Book.add(Book_Button_AddNewEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, -1));

        Book_label_AddNewEditorial.setBackground(new java.awt.Color(2, 48, 71));
        Book_label_AddNewEditorial.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Book_label_AddNewEditorial.setForeground(new java.awt.Color(255, 255, 255));
        Book_label_AddNewEditorial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Book_label_AddNewEditorial.setText("+");
        Book_label_AddNewEditorial.setToolTipText("Add a new editorial");
        Book_label_AddNewEditorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Book_label_AddNewEditorial.setMaximumSize(new java.awt.Dimension(30, 30));
        Book_label_AddNewEditorial.setMinimumSize(new java.awt.Dimension(30, 30));
        Book_label_AddNewEditorial.setPreferredSize(new java.awt.Dimension(30, 30));
        ItemType_Panel_Book.add(Book_label_AddNewEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, 20));

        Book_Label_ISBN.setFont(new java.awt.Font("Kozuka Mincho Pr6N L", 0, 18)); // NOI18N
        Book_Label_ISBN.setForeground(new java.awt.Color(255, 255, 255));
        Book_Label_ISBN.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Book_Label_ISBN.setText("ISBN:");
        Book_Label_ISBN.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ItemType_Panel_Book.add(Book_Label_ISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 50, 20));
        ItemType_Panel_Book.add(Book_FormattedTextField_ISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 100, 30));

        Book_Label_Author.setFont(new java.awt.Font("Kozuka Mincho Pr6N L", 0, 18)); // NOI18N
        Book_Label_Author.setForeground(new java.awt.Color(255, 255, 255));
        Book_Label_Author.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Book_Label_Author.setLabelFor(Game_jComboBox_DeveloperList);
        Book_Label_Author.setText("Author or authors:");
        Book_Label_Author.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ItemType_Panel_Book.add(Book_Label_Author, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 170, 20));

        Book_Button_AddNewAuthor.setFont(new java.awt.Font("Old English Text MT", 1, 3)); // NOI18N
        Book_Button_AddNewAuthor.setToolTipText("Add a new author");
        Book_Button_AddNewAuthor.setBorderPainted(false);
        Book_Button_AddNewAuthor.setContentAreaFilled(false);
        Book_Button_AddNewAuthor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Book_Button_AddNewAuthor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Book_Button_AddNewAuthor.setMaximumSize(new java.awt.Dimension(30, 30));
        Book_Button_AddNewAuthor.setMinimumSize(new java.awt.Dimension(30, 30));
        Book_Button_AddNewAuthor.setPreferredSize(new java.awt.Dimension(30, 30));
        Book_Button_AddNewAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Book_Button_AddNewAuthorActionPerformed(evt);
            }
        });
        ItemType_Panel_Book.add(Book_Button_AddNewAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, -1, -1));

        Book_label_AddNewAuthor.setBackground(new java.awt.Color(2, 48, 71));
        Book_label_AddNewAuthor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Book_label_AddNewAuthor.setForeground(new java.awt.Color(255, 255, 255));
        Book_label_AddNewAuthor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Book_label_AddNewAuthor.setText("+");
        Book_label_AddNewAuthor.setToolTipText("Add a new author");
        Book_label_AddNewAuthor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Book_label_AddNewAuthor.setMaximumSize(new java.awt.Dimension(30, 30));
        Book_label_AddNewAuthor.setMinimumSize(new java.awt.Dimension(30, 30));
        Book_label_AddNewAuthor.setPreferredSize(new java.awt.Dimension(30, 30));
        ItemType_Panel_Book.add(Book_label_AddNewAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, -1, 20));

        Book_List_SelectAuthors.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Book_List_SelectAuthors.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Miguel de Cervantes" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        Book_ScrollPane_SelectAuthors_Unchangeable.setViewportView(Book_List_SelectAuthors);

        ItemType_Panel_Book.add(Book_ScrollPane_SelectAuthors_Unchangeable, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 140, 20));

        Book_LayeredPane_AddNewEditorialORAuthor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HideBookOptions.setBackground(new java.awt.Color(2, 48, 71));

        javax.swing.GroupLayout HideBookOptionsLayout = new javax.swing.GroupLayout(HideBookOptions);
        HideBookOptions.setLayout(HideBookOptionsLayout);
        HideBookOptionsLayout.setHorizontalGroup(
            HideBookOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        HideBookOptionsLayout.setVerticalGroup(
            HideBookOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        Book_LayeredPane_AddNewEditorialORAuthor.add(HideBookOptions, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 100));

        AddNewEditorial.setBackground(new java.awt.Color(2, 48, 71));
        AddNewEditorial.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddEditorial_Button_AddNewEditorial.setFont(new java.awt.Font("Old English Text MT", 1, 3)); // NOI18N
        AddEditorial_Button_AddNewEditorial.setToolTipText("Add a new editorial");
        AddEditorial_Button_AddNewEditorial.setBorderPainted(false);
        AddEditorial_Button_AddNewEditorial.setContentAreaFilled(false);
        AddEditorial_Button_AddNewEditorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddEditorial_Button_AddNewEditorial.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AddEditorial_Button_AddNewEditorial.setMaximumSize(new java.awt.Dimension(30, 30));
        AddEditorial_Button_AddNewEditorial.setMinimumSize(new java.awt.Dimension(30, 30));
        AddEditorial_Button_AddNewEditorial.setPreferredSize(new java.awt.Dimension(30, 30));
        AddNewEditorial.add(AddEditorial_Button_AddNewEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, -1, -1));

        AddEditorial_Label_AddNewEditorial.setBackground(new java.awt.Color(2, 48, 71));
        AddEditorial_Label_AddNewEditorial.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        AddEditorial_Label_AddNewEditorial.setForeground(new java.awt.Color(255, 255, 255));
        AddEditorial_Label_AddNewEditorial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddEditorial_Label_AddNewEditorial.setText("+");
        AddEditorial_Label_AddNewEditorial.setToolTipText("Add a new editorial");
        AddEditorial_Label_AddNewEditorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddEditorial_Label_AddNewEditorial.setMaximumSize(new java.awt.Dimension(30, 30));
        AddEditorial_Label_AddNewEditorial.setMinimumSize(new java.awt.Dimension(30, 30));
        AddEditorial_Label_AddNewEditorial.setPreferredSize(new java.awt.Dimension(30, 30));
        AddNewEditorial.add(AddEditorial_Label_AddNewEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, -1, 20));

        AddEditorial_Label_NewEditorial.setFont(new java.awt.Font("Kozuka Mincho Pr6N L", 0, 18)); // NOI18N
        AddEditorial_Label_NewEditorial.setForeground(new java.awt.Color(255, 255, 255));
        AddEditorial_Label_NewEditorial.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        AddEditorial_Label_NewEditorial.setLabelFor(Game_jComboBox_DeveloperList);
        AddEditorial_Label_NewEditorial.setText("New editorial:");
        AddEditorial_Label_NewEditorial.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        AddNewEditorial.add(AddEditorial_Label_NewEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 130, 20));

        AddEditorial_TextField_NewEditorial.setEditable(false);
        AddEditorial_TextField_NewEditorial.setMaximumSize(new java.awt.Dimension(90, 30));
        AddEditorial_TextField_NewEditorial.setMinimumSize(new java.awt.Dimension(90, 30));
        AddEditorial_TextField_NewEditorial.setPreferredSize(new java.awt.Dimension(90, 30));
        AddEditorial_TextField_NewEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddEditorial_TextField_NewEditorialActionPerformed(evt);
            }
        });
        AddNewEditorial.add(AddEditorial_TextField_NewEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 140, 30));

        Book_LayeredPane_AddNewEditorialORAuthor.add(AddNewEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 120));

        AddNewAuthor.setBackground(new java.awt.Color(2, 48, 71));
        AddNewAuthor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddAuthor_Label_AuthorName1.setFont(new java.awt.Font("Kozuka Mincho Pr6N L", 0, 18)); // NOI18N
        AddAuthor_Label_AuthorName1.setForeground(new java.awt.Color(255, 255, 255));
        AddAuthor_Label_AuthorName1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        AddAuthor_Label_AuthorName1.setLabelFor(Game_jComboBox_DeveloperList);
        AddAuthor_Label_AuthorName1.setText("1st name:");
        AddAuthor_Label_AuthorName1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        AddNewAuthor.add(AddAuthor_Label_AuthorName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 80, 20));

        AddAuthor_TextField_Name1.setEditable(false);
        AddAuthor_TextField_Name1.setMaximumSize(new java.awt.Dimension(90, 30));
        AddAuthor_TextField_Name1.setMinimumSize(new java.awt.Dimension(90, 30));
        AddAuthor_TextField_Name1.setPreferredSize(new java.awt.Dimension(90, 30));
        AddAuthor_TextField_Name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAuthor_TextField_Name1ActionPerformed(evt);
            }
        });
        AddNewAuthor.add(AddAuthor_TextField_Name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 80, 20));

        AddAuthor_Label_AuthorName2.setFont(new java.awt.Font("Kozuka Mincho Pr6N L", 0, 18)); // NOI18N
        AddAuthor_Label_AuthorName2.setForeground(new java.awt.Color(255, 255, 255));
        AddAuthor_Label_AuthorName2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        AddAuthor_Label_AuthorName2.setLabelFor(Game_jComboBox_DeveloperList);
        AddAuthor_Label_AuthorName2.setText("2nd name:");
        AddAuthor_Label_AuthorName2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        AddNewAuthor.add(AddAuthor_Label_AuthorName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 90, 20));

        AddAuthor_TextField_Name2.setEditable(false);
        AddAuthor_TextField_Name2.setMaximumSize(new java.awt.Dimension(90, 30));
        AddAuthor_TextField_Name2.setMinimumSize(new java.awt.Dimension(90, 30));
        AddAuthor_TextField_Name2.setPreferredSize(new java.awt.Dimension(90, 30));
        AddAuthor_TextField_Name2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAuthor_TextField_Name2ActionPerformed(evt);
            }
        });
        AddNewAuthor.add(AddAuthor_TextField_Name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 80, 20));

        AddAuthor_Label_AuthorLastname1.setFont(new java.awt.Font("Kozuka Mincho Pr6N L", 0, 18)); // NOI18N
        AddAuthor_Label_AuthorLastname1.setForeground(new java.awt.Color(255, 255, 255));
        AddAuthor_Label_AuthorLastname1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        AddAuthor_Label_AuthorLastname1.setLabelFor(Game_jComboBox_DeveloperList);
        AddAuthor_Label_AuthorLastname1.setText("lastname#1:");
        AddAuthor_Label_AuthorLastname1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        AddNewAuthor.add(AddAuthor_Label_AuthorLastname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, 20));

        AddAuthor_TextField_Lastname1.setEditable(false);
        AddAuthor_TextField_Lastname1.setMaximumSize(new java.awt.Dimension(90, 30));
        AddAuthor_TextField_Lastname1.setMinimumSize(new java.awt.Dimension(90, 30));
        AddAuthor_TextField_Lastname1.setPreferredSize(new java.awt.Dimension(90, 30));
        AddAuthor_TextField_Lastname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAuthor_TextField_Lastname1ActionPerformed(evt);
            }
        });
        AddNewAuthor.add(AddAuthor_TextField_Lastname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 80, 20));

        AddAuthor_Label_AuthorLastname2.setFont(new java.awt.Font("Kozuka Mincho Pr6N L", 0, 18)); // NOI18N
        AddAuthor_Label_AuthorLastname2.setForeground(new java.awt.Color(255, 255, 255));
        AddAuthor_Label_AuthorLastname2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        AddAuthor_Label_AuthorLastname2.setLabelFor(Game_jComboBox_DeveloperList);
        AddAuthor_Label_AuthorLastname2.setText("lastname#2:");
        AddAuthor_Label_AuthorLastname2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        AddNewAuthor.add(AddAuthor_Label_AuthorLastname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 100, 20));

        AddAuthor_TextField_Lastname2.setEditable(false);
        AddAuthor_TextField_Lastname2.setMaximumSize(new java.awt.Dimension(90, 30));
        AddAuthor_TextField_Lastname2.setMinimumSize(new java.awt.Dimension(90, 30));
        AddAuthor_TextField_Lastname2.setPreferredSize(new java.awt.Dimension(90, 30));
        AddAuthor_TextField_Lastname2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAuthor_TextField_Lastname2ActionPerformed(evt);
            }
        });
        AddNewAuthor.add(AddAuthor_TextField_Lastname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 80, 20));

        AddAuthor_Button_AddNewAuthor.setFont(new java.awt.Font("Old English Text MT", 1, 3)); // NOI18N
        AddAuthor_Button_AddNewAuthor.setToolTipText("Add a new author");
        AddAuthor_Button_AddNewAuthor.setBorderPainted(false);
        AddAuthor_Button_AddNewAuthor.setContentAreaFilled(false);
        AddAuthor_Button_AddNewAuthor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddAuthor_Button_AddNewAuthor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AddAuthor_Button_AddNewAuthor.setMaximumSize(new java.awt.Dimension(30, 30));
        AddAuthor_Button_AddNewAuthor.setMinimumSize(new java.awt.Dimension(30, 30));
        AddAuthor_Button_AddNewAuthor.setPreferredSize(new java.awt.Dimension(30, 30));
        AddAuthor_Button_AddNewAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAuthor_Button_AddNewAuthorActionPerformed(evt);
            }
        });
        AddNewAuthor.add(AddAuthor_Button_AddNewAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 110, -1));

        AddAuthor_label_AddNewAuthor.setBackground(new java.awt.Color(2, 48, 71));
        AddAuthor_label_AddNewAuthor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AddAuthor_label_AddNewAuthor.setForeground(new java.awt.Color(255, 255, 255));
        AddAuthor_label_AddNewAuthor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddAuthor_label_AddNewAuthor.setText("Add new author");
        AddAuthor_label_AddNewAuthor.setToolTipText("Add a new author");
        AddAuthor_label_AddNewAuthor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddAuthor_label_AddNewAuthor.setMaximumSize(new java.awt.Dimension(30, 30));
        AddAuthor_label_AddNewAuthor.setMinimumSize(new java.awt.Dimension(30, 30));
        AddAuthor_label_AddNewAuthor.setPreferredSize(new java.awt.Dimension(30, 30));
        AddNewAuthor.add(AddAuthor_label_AddNewAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 110, 20));

        Book_LayeredPane_AddNewEditorialORAuthor.add(AddNewAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 110));

        ItemType_Panel_Book.add(Book_LayeredPane_AddNewEditorialORAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 380, 110));

        NewItem_LayeredPanel_ItemType.add(ItemType_Panel_Book, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ItemType_Panel_Magazine.setBackground(new java.awt.Color(2, 48, 71));
        ItemType_Panel_Magazine.setAlignmentX(0.0F);
        ItemType_Panel_Magazine.setAlignmentY(0.0F);
        ItemType_Panel_Magazine.setMaximumSize(new java.awt.Dimension(380, 250));
        ItemType_Panel_Magazine.setMinimumSize(new java.awt.Dimension(380, 250));
        ItemType_Panel_Magazine.setPreferredSize(new java.awt.Dimension(380, 250));

        Magazine_Label_Date.setFont(new java.awt.Font("Kozuka Mincho Pr6N L", 0, 18)); // NOI18N
        Magazine_Label_Date.setForeground(new java.awt.Color(255, 255, 255));
        Magazine_Label_Date.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Magazine_Label_Date.setText("Publication Date:");
        Magazine_Label_Date.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        Magazine_Label_RegistrationNumber.setFont(new java.awt.Font("Kozuka Mincho Pr6N L", 0, 18)); // NOI18N
        Magazine_Label_RegistrationNumber.setForeground(new java.awt.Color(255, 255, 255));
        Magazine_Label_RegistrationNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Magazine_Label_RegistrationNumber.setText("Registration Number:");
        Magazine_Label_RegistrationNumber.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout ItemType_Panel_MagazineLayout = new javax.swing.GroupLayout(ItemType_Panel_Magazine);
        ItemType_Panel_Magazine.setLayout(ItemType_Panel_MagazineLayout);
        ItemType_Panel_MagazineLayout.setHorizontalGroup(
            ItemType_Panel_MagazineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ItemType_Panel_MagazineLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ItemType_Panel_MagazineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ItemType_Panel_MagazineLayout.createSequentialGroup()
                        .addComponent(Magazine_Label_RegistrationNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Magazine_FormattedTextField_Date1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ItemType_Panel_MagazineLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Magazine_Label_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Magazine_FormattedTextField_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        ItemType_Panel_MagazineLayout.setVerticalGroup(
            ItemType_Panel_MagazineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ItemType_Panel_MagazineLayout.createSequentialGroup()
                .addGroup(ItemType_Panel_MagazineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Magazine_FormattedTextField_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Magazine_Label_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ItemType_Panel_MagazineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Magazine_FormattedTextField_Date1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Magazine_Label_RegistrationNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 172, Short.MAX_VALUE))
        );

        NewItem_LayeredPanel_ItemType.add(ItemType_Panel_Magazine, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ItemType_Panel_Game.setBackground(new java.awt.Color(2, 48, 71));
        ItemType_Panel_Game.setAlignmentX(0.0F);
        ItemType_Panel_Game.setAlignmentY(0.0F);
        ItemType_Panel_Game.setMaximumSize(new java.awt.Dimension(380, 250));
        ItemType_Panel_Game.setMinimumSize(new java.awt.Dimension(380, 250));
        ItemType_Panel_Game.setPreferredSize(new java.awt.Dimension(380, 250));
        ItemType_Panel_Game.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        ItemType_Panel_Game.add(Game_FormattedTextField_Year, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 170, 30));

        Game_Label_Year.setFont(new java.awt.Font("Kozuka Mincho Pr6N L", 0, 18)); // NOI18N
        Game_Label_Year.setForeground(new java.awt.Color(255, 255, 255));
        Game_Label_Year.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Game_Label_Year.setText("Release year:");
        Game_Label_Year.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ItemType_Panel_Game.add(Game_Label_Year, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 130, 20));

        Game_Label_Developer.setFont(new java.awt.Font("Kozuka Mincho Pr6N L", 0, 18)); // NOI18N
        Game_Label_Developer.setForeground(new java.awt.Color(255, 255, 255));
        Game_Label_Developer.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Game_Label_Developer.setLabelFor(Game_jComboBox_DeveloperList);
        Game_Label_Developer.setText("Developer:");
        Game_Label_Developer.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ItemType_Panel_Game.add(Game_Label_Developer, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 100, 20));

        Game_jComboBox_DeveloperList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Game_jComboBox_DeveloperList.setMaximumSize(new java.awt.Dimension(58, 30));
        Game_jComboBox_DeveloperList.setMinimumSize(new java.awt.Dimension(58, 30));
        Game_jComboBox_DeveloperList.setPreferredSize(new java.awt.Dimension(58, 30));
        ItemType_Panel_Game.add(Game_jComboBox_DeveloperList, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 48, 140, -1));

        Game_Button_AddNewDeveloper.setFont(new java.awt.Font("Old English Text MT", 1, 3)); // NOI18N
        Game_Button_AddNewDeveloper.setToolTipText("Add a new developer");
        Game_Button_AddNewDeveloper.setBorderPainted(false);
        Game_Button_AddNewDeveloper.setContentAreaFilled(false);
        Game_Button_AddNewDeveloper.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Game_Button_AddNewDeveloper.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Game_Button_AddNewDeveloper.setMaximumSize(new java.awt.Dimension(30, 30));
        Game_Button_AddNewDeveloper.setMinimumSize(new java.awt.Dimension(30, 30));
        Game_Button_AddNewDeveloper.setPreferredSize(new java.awt.Dimension(30, 30));
        ItemType_Panel_Game.add(Game_Button_AddNewDeveloper, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, -1));

        Game_Label_AddNewDeveloper.setBackground(new java.awt.Color(2, 48, 71));
        Game_Label_AddNewDeveloper.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Game_Label_AddNewDeveloper.setForeground(new java.awt.Color(255, 255, 255));
        Game_Label_AddNewDeveloper.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Game_Label_AddNewDeveloper.setText("+");
        Game_Label_AddNewDeveloper.setToolTipText("Add a new developer");
        Game_Label_AddNewDeveloper.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Game_Label_AddNewDeveloper.setMaximumSize(new java.awt.Dimension(30, 30));
        Game_Label_AddNewDeveloper.setMinimumSize(new java.awt.Dimension(30, 30));
        Game_Label_AddNewDeveloper.setPreferredSize(new java.awt.Dimension(30, 30));
        ItemType_Panel_Game.add(Game_Label_AddNewDeveloper, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, 20));

        Game_LayeredPane_AddNewDeveloper.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HideDeveloperOptions.setBackground(new java.awt.Color(2, 48, 71));

        javax.swing.GroupLayout HideDeveloperOptionsLayout = new javax.swing.GroupLayout(HideDeveloperOptions);
        HideDeveloperOptions.setLayout(HideDeveloperOptionsLayout);
        HideDeveloperOptionsLayout.setHorizontalGroup(
            HideDeveloperOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        HideDeveloperOptionsLayout.setVerticalGroup(
            HideDeveloperOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        Game_LayeredPane_AddNewDeveloper.add(HideDeveloperOptions, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        AddNewDeveloper.setBackground(new java.awt.Color(2, 48, 71));
        AddNewDeveloper.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddDeveloper_Button_AddNewDeveloper.setFont(new java.awt.Font("Old English Text MT", 1, 3)); // NOI18N
        AddDeveloper_Button_AddNewDeveloper.setToolTipText("Add a new developer");
        AddDeveloper_Button_AddNewDeveloper.setBorderPainted(false);
        AddDeveloper_Button_AddNewDeveloper.setContentAreaFilled(false);
        AddDeveloper_Button_AddNewDeveloper.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddDeveloper_Button_AddNewDeveloper.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AddDeveloper_Button_AddNewDeveloper.setMaximumSize(new java.awt.Dimension(30, 30));
        AddDeveloper_Button_AddNewDeveloper.setMinimumSize(new java.awt.Dimension(30, 30));
        AddDeveloper_Button_AddNewDeveloper.setPreferredSize(new java.awt.Dimension(30, 30));
        AddNewDeveloper.add(AddDeveloper_Button_AddNewDeveloper, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, -1, -1));

        AddDeveloper_Label_AddNewDeveloper.setBackground(new java.awt.Color(2, 48, 71));
        AddDeveloper_Label_AddNewDeveloper.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        AddDeveloper_Label_AddNewDeveloper.setForeground(new java.awt.Color(255, 255, 255));
        AddDeveloper_Label_AddNewDeveloper.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddDeveloper_Label_AddNewDeveloper.setText("+");
        AddDeveloper_Label_AddNewDeveloper.setToolTipText("Add a new developer");
        AddDeveloper_Label_AddNewDeveloper.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddDeveloper_Label_AddNewDeveloper.setMaximumSize(new java.awt.Dimension(30, 30));
        AddDeveloper_Label_AddNewDeveloper.setMinimumSize(new java.awt.Dimension(30, 30));
        AddDeveloper_Label_AddNewDeveloper.setPreferredSize(new java.awt.Dimension(30, 30));
        AddNewDeveloper.add(AddDeveloper_Label_AddNewDeveloper, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, -1, 20));

        AddDeveloper_Label_NewDeveloper.setFont(new java.awt.Font("Kozuka Mincho Pr6N L", 0, 18)); // NOI18N
        AddDeveloper_Label_NewDeveloper.setForeground(new java.awt.Color(255, 255, 255));
        AddDeveloper_Label_NewDeveloper.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        AddDeveloper_Label_NewDeveloper.setLabelFor(Game_jComboBox_DeveloperList);
        AddDeveloper_Label_NewDeveloper.setText("New developer:");
        AddDeveloper_Label_NewDeveloper.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        AddNewDeveloper.add(AddDeveloper_Label_NewDeveloper, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 130, 20));

        AddDeveloper_TextField_NewDeveloper.setEditable(false);
        AddDeveloper_TextField_NewDeveloper.setMaximumSize(new java.awt.Dimension(90, 30));
        AddDeveloper_TextField_NewDeveloper.setMinimumSize(new java.awt.Dimension(90, 30));
        AddDeveloper_TextField_NewDeveloper.setPreferredSize(new java.awt.Dimension(90, 30));
        AddDeveloper_TextField_NewDeveloper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDeveloper_TextField_NewDeveloperActionPerformed(evt);
            }
        });
        AddNewDeveloper.add(AddDeveloper_TextField_NewDeveloper, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 140, 30));

        Game_LayeredPane_AddNewDeveloper.add(AddNewDeveloper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 150));

        ItemType_Panel_Game.add(Game_LayeredPane_AddNewDeveloper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 380, 130));

        NewItem_LayeredPanel_ItemType.add(ItemType_Panel_Game, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ItemType_Panel_Film.setBackground(new java.awt.Color(2, 48, 71));
        ItemType_Panel_Film.setAlignmentX(0.0F);
        ItemType_Panel_Film.setAlignmentY(0.0F);
        ItemType_Panel_Film.setMaximumSize(new java.awt.Dimension(380, 250));
        ItemType_Panel_Film.setMinimumSize(new java.awt.Dimension(380, 250));
        ItemType_Panel_Film.setPreferredSize(new java.awt.Dimension(380, 250));

        Film_FormattedTextField_Date.setAlignmentY(0.0F);
        Film_FormattedTextField_Date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Film_FormattedTextField_DateActionPerformed(evt);
            }
        });

        Film_Label_Date.setFont(new java.awt.Font("Kozuka Mincho Pr6N L", 0, 18)); // NOI18N
        Film_Label_Date.setForeground(new java.awt.Color(255, 255, 255));
        Film_Label_Date.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Film_Label_Date.setText("Release year:");
        Film_Label_Date.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Film_Label_Date.setAlignmentY(0.0F);

        javax.swing.GroupLayout ItemType_Panel_FilmLayout = new javax.swing.GroupLayout(ItemType_Panel_Film);
        ItemType_Panel_Film.setLayout(ItemType_Panel_FilmLayout);
        ItemType_Panel_FilmLayout.setHorizontalGroup(
            ItemType_Panel_FilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ItemType_Panel_FilmLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(Film_Label_Date)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Film_FormattedTextField_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        ItemType_Panel_FilmLayout.setVerticalGroup(
            ItemType_Panel_FilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ItemType_Panel_FilmLayout.createSequentialGroup()
                .addGroup(ItemType_Panel_FilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Film_Label_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Film_FormattedTextField_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 220, Short.MAX_VALUE))
        );

        NewItem_LayeredPanel_ItemType.add(ItemType_Panel_Film, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Panel_NewItem.add(NewItem_LayeredPanel_ItemType, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, -1, -1));

        NewItem_Label_Name.setFont(new java.awt.Font("Kozuka Mincho Pr6N L", 0, 18)); // NOI18N
        NewItem_Label_Name.setForeground(new java.awt.Color(255, 255, 255));
        NewItem_Label_Name.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        NewItem_Label_Name.setText("Name:");
        NewItem_Label_Name.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Panel_NewItem.add(NewItem_Label_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 100, 20));

        NewItem_Label_Clasification.setFont(new java.awt.Font("Kozuka Mincho Pr6N L", 0, 18)); // NOI18N
        NewItem_Label_Clasification.setForeground(new java.awt.Color(255, 255, 255));
        NewItem_Label_Clasification.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        NewItem_Label_Clasification.setText("Clasification:");
        NewItem_Label_Clasification.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Panel_NewItem.add(NewItem_Label_Clasification, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 120, 20));

        NewItem_Button_Clasification.setFont(new java.awt.Font("Lucida Sans Unicode", 2, 18)); // NOI18N
        NewItem_Button_Clasification.setText("Clasification");
        NewItem_Button_Clasification.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NewItem_Button_Clasification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewItem_Button_ClasificationActionPerformed(evt);
            }
        });
        Panel_NewItem.add(NewItem_Button_Clasification, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 170, 30));

        NewItem_Label_Name1.setFont(new java.awt.Font("Kozuka Mincho Pr6N L", 0, 18)); // NOI18N
        NewItem_Label_Name1.setForeground(new java.awt.Color(255, 255, 255));
        NewItem_Label_Name1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        NewItem_Label_Name1.setText("Name:");
        NewItem_Label_Name1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Panel_NewItem.add(NewItem_Label_Name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 100, 20));

        NewItem_jComboBox_ItemType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        NewItem_jComboBox_ItemType.setPreferredSize(new java.awt.Dimension(170, 30));
        Panel_NewItem.add(NewItem_jComboBox_ItemType, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 170, 30));

        Main_Layered_PanelBase.add(Panel_NewItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 450));

        Panel_Prestamos.setBackground(new java.awt.Color(2, 48, 71));
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

        Main_Layered_PanelBase.add(Panel_Prestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        Panel_UsuarioDetalle.setBackground(new java.awt.Color(2, 48, 71));
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

        Main_Layered_PanelBase.add(Panel_UsuarioDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jPanel6.setBackground(new java.awt.Color(2, 48, 71));
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

        Main_Layered_PanelBase.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jPanel7.setBackground(new java.awt.Color(2, 48, 71));
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

        Main_Layered_PanelBase.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jPanel8.setBackground(new java.awt.Color(2, 48, 71));
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

        Main_Layered_PanelBase.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jPanel9.setBackground(new java.awt.Color(2, 48, 71));
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

        Main_Layered_PanelBase.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jPanel10.setBackground(new java.awt.Color(2, 48, 71));
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

        Main_Layered_PanelBase.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jPanel11.setBackground(new java.awt.Color(2, 48, 71));
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

        Main_Layered_PanelBase.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jPanel12.setBackground(new java.awt.Color(2, 48, 71));
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

        Main_Layered_PanelBase.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

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

        Main_Layered_PanelBase.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

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

        Main_Layered_PanelBase.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

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

        Main_Layered_PanelBase.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        Unchangeable_Panel_Base.add(Main_Layered_PanelBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Unchangable_Layered_Main.add(Unchangeable_Panel_Base, java.awt.BorderLayout.CENTER);

        mainWindow_Frame.getContentPane().add(Unchangable_Layered_Main, java.awt.BorderLayout.CENTER);

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
        //ImageChooser.showOpenDialog(null);
        ImageChooser.getSelectedFile();
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
        currentSession= Session.getCurrentSession(LogIn_TextField_UserName.getText(), LogIn_PasswordField_Password.getPassword().toString());
        
        if(currentSession != null){
            openFrameCloseFrame(mainWindow_Frame,LogIn_Frame);
            setTitleMain(Menu_Panel_Main);
            hideEveryPanelExceptThis_MAIN(Menu_Panel_Main);
        }
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

    private void PasswordRecovery_Button_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordRecovery_Button_CancelActionPerformed
        hideEveryPanelExceptThis_LogIn(LogIn_Panel, true);
    }//GEN-LAST:event_PasswordRecovery_Button_CancelActionPerformed

    private void Main_Menu_Button_ItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Main_Menu_Button_ItemsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Main_Menu_Button_ItemsActionPerformed

    private void Main_Menu_Button_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Main_Menu_Button_ExitActionPerformed
        closeProgram();
    }//GEN-LAST:event_Main_Menu_Button_ExitActionPerformed

    private void Main_Menu_Button_AccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Main_Menu_Button_AccountActionPerformed
        hideEveryPanelExceptThis_MAIN(Panel_MyAccount,true);
    }//GEN-LAST:event_Main_Menu_Button_AccountActionPerformed

    private void Main_Menu_Button_LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Main_Menu_Button_LogOutActionPerformed
        currentSession.logOut();
        openFrameCloseFrame(LogIn_Frame,mainWindow_Frame);
        setTitle(LogIn_Panel);
        hideEveryPanelExceptThis_LogIn(LogIn_Panel);
    }//GEN-LAST:event_Main_Menu_Button_LogOutActionPerformed

    private void MyAccount_TextField_2ndSurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MyAccount_TextField_2ndSurnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MyAccount_TextField_2ndSurnameActionPerformed

    private void MyAccount_TextField_MiddleNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MyAccount_TextField_MiddleNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MyAccount_TextField_MiddleNameActionPerformed

    private void MyAccount_TextField_1stSurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MyAccount_TextField_1stSurnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MyAccount_TextField_1stSurnameActionPerformed

    private void MyAccount_TextField_FirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MyAccount_TextField_FirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MyAccount_TextField_FirstNameActionPerformed

    private void MyAccount_FormattedTextField_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MyAccount_FormattedTextField_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MyAccount_FormattedTextField_IDActionPerformed

    private void MyAccount_TextField_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MyAccount_TextField_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MyAccount_TextField_PasswordActionPerformed

    private void MyAccount_FormattedTextField_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MyAccount_FormattedTextField_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MyAccount_FormattedTextField_EmailActionPerformed

    private void MyAccount_Button_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MyAccount_Button_CancelActionPerformed
        hideEveryPanelExceptThis_MAIN(Menu_Panel_Main);
    }//GEN-LAST:event_MyAccount_Button_CancelActionPerformed

    private void MyAccount_Button_AcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MyAccount_Button_AcceptActionPerformed
        hideEveryPanelExceptThis_MAIN(Menu_Panel_Main);
    }//GEN-LAST:event_MyAccount_Button_AcceptActionPerformed

    private void MyAccount_TextField_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MyAccount_TextField_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MyAccount_TextField_UsernameActionPerformed

    private void New_Button_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_New_Button_CancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_New_Button_CancelActionPerformed

    private void NewItem_Button_Accept2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewItem_Button_Accept2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewItem_Button_Accept2ActionPerformed

    private void NewItem_TextField_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewItem_TextField_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewItem_TextField_NameActionPerformed

    private void NewItem_Button_AcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewItem_Button_AcceptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewItem_Button_AcceptActionPerformed

    private void NewItem_Button_ClasificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewItem_Button_ClasificationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewItem_Button_ClasificationActionPerformed

    private void Film_FormattedTextField_DateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Film_FormattedTextField_DateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Film_FormattedTextField_DateActionPerformed

    private void AddDeveloper_TextField_NewDeveloperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDeveloper_TextField_NewDeveloperActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddDeveloper_TextField_NewDeveloperActionPerformed

    private void AddEditorial_TextField_NewEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddEditorial_TextField_NewEditorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddEditorial_TextField_NewEditorialActionPerformed

    private void Book_jComboBox_EditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Book_jComboBox_EditorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Book_jComboBox_EditorialActionPerformed

    private void Book_FormattedTextField_EditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Book_FormattedTextField_EditionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Book_FormattedTextField_EditionActionPerformed

    private void AddAuthor_TextField_Name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAuthor_TextField_Name1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddAuthor_TextField_Name1ActionPerformed

    private void AddAuthor_TextField_Name2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAuthor_TextField_Name2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddAuthor_TextField_Name2ActionPerformed

    private void AddAuthor_TextField_Lastname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAuthor_TextField_Lastname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddAuthor_TextField_Lastname1ActionPerformed

    private void AddAuthor_TextField_Lastname2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAuthor_TextField_Lastname2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddAuthor_TextField_Lastname2ActionPerformed

    private void Book_Button_AddNewAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Book_Button_AddNewAuthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Book_Button_AddNewAuthorActionPerformed

    private void AddAuthor_Button_AddNewAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAuthor_Button_AddNewAuthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddAuthor_Button_AddNewAuthorActionPerformed

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
    private javax.swing.JButton AddAuthor_Button_AddNewAuthor;
    private javax.swing.JLabel AddAuthor_Label_AuthorLastname1;
    private javax.swing.JLabel AddAuthor_Label_AuthorLastname2;
    private javax.swing.JLabel AddAuthor_Label_AuthorName1;
    private javax.swing.JLabel AddAuthor_Label_AuthorName2;
    private javax.swing.JTextField AddAuthor_TextField_Lastname1;
    private javax.swing.JTextField AddAuthor_TextField_Lastname2;
    private javax.swing.JTextField AddAuthor_TextField_Name1;
    private javax.swing.JTextField AddAuthor_TextField_Name2;
    private javax.swing.JLabel AddAuthor_label_AddNewAuthor;
    private javax.swing.JButton AddDeveloper_Button_AddNewDeveloper;
    private javax.swing.JLabel AddDeveloper_Label_AddNewDeveloper;
    private javax.swing.JLabel AddDeveloper_Label_NewDeveloper;
    private javax.swing.JTextField AddDeveloper_TextField_NewDeveloper;
    private javax.swing.JButton AddEditorial_Button_AddNewEditorial;
    private javax.swing.JLabel AddEditorial_Label_AddNewEditorial;
    private javax.swing.JLabel AddEditorial_Label_NewEditorial;
    private javax.swing.JTextField AddEditorial_TextField_NewEditorial;
    private javax.swing.JPanel AddNewAuthor;
    private javax.swing.JPanel AddNewDeveloper;
    private javax.swing.JPanel AddNewEditorial;
    private javax.swing.JButton Book_Button_AddNewAuthor;
    private javax.swing.JButton Book_Button_AddNewEditorial;
    private javax.swing.JFormattedTextField Book_FormattedTextField_Edition;
    private javax.swing.JFormattedTextField Book_FormattedTextField_ISBN;
    private javax.swing.JLabel Book_Label_Author;
    private javax.swing.JLabel Book_Label_Edition;
    private javax.swing.JLabel Book_Label_Editorial;
    private javax.swing.JLabel Book_Label_ISBN;
    private javax.swing.JLayeredPane Book_LayeredPane_AddNewEditorialORAuthor;
    private javax.swing.JList<String> Book_List_SelectAuthors;
    private javax.swing.JScrollPane Book_ScrollPane_SelectAuthors_Unchangeable;
    private javax.swing.JComboBox<String> Book_jComboBox_Editorial;
    private javax.swing.JLabel Book_label_AddNewAuthor;
    private javax.swing.JLabel Book_label_AddNewEditorial;
    private javax.swing.JFormattedTextField Film_FormattedTextField_Date;
    private javax.swing.JLabel Film_Label_Date;
    private javax.swing.JButton Game_Button_AddNewDeveloper;
    private javax.swing.JFormattedTextField Game_FormattedTextField_Year;
    private javax.swing.JLabel Game_Label_AddNewDeveloper;
    private javax.swing.JLabel Game_Label_Developer;
    private javax.swing.JLabel Game_Label_Year;
    private javax.swing.JLayeredPane Game_LayeredPane_AddNewDeveloper;
    private javax.swing.JComboBox<String> Game_jComboBox_DeveloperList;
    private javax.swing.JPanel HideBookOptions;
    private javax.swing.JPanel HideDeveloperOptions;
    private javax.swing.JFileChooser ImageChooser;
    private javax.swing.JPanel ItemType_Panel_Book;
    private javax.swing.JPanel ItemType_Panel_Film;
    private javax.swing.JPanel ItemType_Panel_Game;
    private javax.swing.JPanel ItemType_Panel_Magazine;
    private javax.swing.JButton LogIn_Button_Accept;
    private javax.swing.JButton LogIn_Button_Accept1;
    private javax.swing.JButton LogIn_Button_PasswordRecovery;
    private javax.swing.JButton LogIn_Button_SignUp;
    private javax.swing.JFrame LogIn_Frame;
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
    private javax.swing.JFormattedTextField Magazine_FormattedTextField_Date;
    private javax.swing.JFormattedTextField Magazine_FormattedTextField_Date1;
    private javax.swing.JLabel Magazine_Label_Date;
    private javax.swing.JLabel Magazine_Label_RegistrationNumber;
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
    private javax.swing.JButton MyAccount_Button_Accept;
    private javax.swing.JButton MyAccount_Button_Cancel;
    private javax.swing.JFormattedTextField MyAccount_FormattedTextField_Email;
    private javax.swing.JFormattedTextField MyAccount_FormattedTextField_ID;
    private javax.swing.JFormattedTextField MyAccount_FormattedTextField_Number;
    private javax.swing.JLabel MyAccount_Label_1stSurname;
    private javax.swing.JLabel MyAccount_Label_2ndSurname;
    private javax.swing.JLabel MyAccount_Label_Email;
    private javax.swing.JLabel MyAccount_Label_FirstName;
    private javax.swing.JLabel MyAccount_Label_ID;
    private javax.swing.JLabel MyAccount_Label_MiddleName;
    private javax.swing.JLabel MyAccount_Label_Number;
    private javax.swing.JLabel MyAccount_Label_Password;
    private javax.swing.JLabel MyAccount_Label_Username;
    private javax.swing.JTextField MyAccount_TextField_1stSurname;
    private javax.swing.JTextField MyAccount_TextField_2ndSurname;
    private javax.swing.JTextField MyAccount_TextField_FirstName;
    private javax.swing.JTextField MyAccount_TextField_MiddleName;
    private javax.swing.JTextField MyAccount_TextField_Password;
    private javax.swing.JTextField MyAccount_TextField_Username;
    private javax.swing.JButton NewItem_Button_Accept;
    private javax.swing.JButton NewItem_Button_Accept2;
    private javax.swing.JButton NewItem_Button_Clasification;
    private javax.swing.JLabel NewItem_Label_Calification;
    private javax.swing.JLabel NewItem_Label_Clasification;
    private javax.swing.JLabel NewItem_Label_CoverPicture;
    private javax.swing.JLabel NewItem_Label_Description;
    private javax.swing.JLabel NewItem_Label_ItemType;
    private javax.swing.JLabel NewItem_Label_Name;
    private javax.swing.JLabel NewItem_Label_Name1;
    private javax.swing.JLayeredPane NewItem_LayeredPanel_ItemType;
    private javax.swing.JTextField NewItem_TextField_Name;
    private javax.swing.JComboBox<String> NewItem_jComboBox_ItemType;
    private javax.swing.JScrollPane NewItem_jScrollPane_UNCHANGEABLE;
    private javax.swing.JSpinner NewItem_jSpinner_Calification;
    private javax.swing.JTextArea NewItem_jTextArea_Description;
    private javax.swing.JButton New_Button_Cancel;
    private javax.swing.JPanel Panel_MyAccount;
    private javax.swing.JPanel Panel_NewItem;
    private javax.swing.JPanel Panel_Prestamos;
    private javax.swing.JPanel Panel_UsuarioDetalle;
    private javax.swing.JButton PasswordRecovery_Button_Accept;
    private javax.swing.JButton PasswordRecovery_Button_Cancel;
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
    private javax.swing.JLabel SignUp_Label_Number;
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
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
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
