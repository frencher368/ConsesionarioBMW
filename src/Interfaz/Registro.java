package Interfaz;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 * @author Alejandro Erazo
 */

public class Registro extends javax.swing.JFrame {
    
    // ----------------------------------
    // Atributos
    // ----------------------------------
    
    //-- Conexion --//
    DB BaseDatos;
    DBCollection Coleccion;
    BasicDBObject document = new BasicDBObject();
    
    
    // ----------------------------------
    // Constructor
    // ----------------------------------
    public Registro() {
        
        initComponents();
        
        //-- Codigo para mostrar la tabla en el centro de la pantalla --//
        this.setLocationRelativeTo(null);
        
        //-- Conexion --//
        try {
            MongoClient mongo = new MongoClient("localhost", 27017);
            BaseDatos = mongo.getDB("MotosBMW");
            Coleccion = BaseDatos.getCollection("ClientesBMW");
            
        }catch (UnknownHostException e) {
            JOptionPane.showMessageDialog(null, "Error de conexion" + e.getMessage());
        }
    }
    
    // ----------------------------------
    // Metodos
    // ----------------------------------
    
    /**
    * Metodo insertar usuario
    */
    public void RegistrarUsuario ( ){
        
        try {
            SimpleDateFormat Formato = new SimpleDateFormat("yyyy/MM/dd");
            int seleccionado = jComboBox1.getSelectedIndex();
            
            String Nombre = jTextField1.getText();
            String Apellido = jTextField2.getText();
            String User = jTextField7.getText();
            String Contraseña = jPasswordField1.getText();
            int Edad = Integer.parseInt(jTextField3.getText());
            String Fecha = Formato.format(jDateChooser1.getDate());
            int Cedula = Integer.parseInt(jTextField4.getText());
            String Sexo = (jComboBox1.getItemAt(seleccionado));
            String Direccion = jTextField5.getText();
            String Email = jTextField6.getText();
            
            document.put("Nombre_CliBMW", Nombre);
            document.put("Apellido_CliBMW", Apellido);
            document.put("Usuario_CliBMW", User);
            document.put("Contraseña_CliBMW", Contraseña);
            document.put("Edad_CliBMW", Edad);
            document.put("FeNacimiento_CliBMW", Fecha);
            document.put("CC_CliBMW", Cedula);
            document.put("Sexo_CliBMW", Sexo);
            document.put("Direccion_CliBMW", Direccion);
            document.put("Email_CliBMW", Email);
            Coleccion.insert(document);
            
            JOptionPane.showMessageDialog(null, "Registro exitoso");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de registro" + e.getMessage());
        }
    }

    public void Limpiar ( ){
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jPasswordField1.setText("");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Brush Script MT", 0, 65)); // NOI18N
        jLabel2.setText("Registro");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 190, -1));

        jLabel3.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jLabel4.setText("Apellidos");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jLabel5.setText("Edad");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jLabel6.setText("Fecha de nacimiento");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jLabel7.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jLabel7.setText("Cedula");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        jLabel8.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jLabel8.setText("Sexo");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        jLabel9.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jLabel9.setText("Direccion");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));

        jLabel10.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jLabel10.setText("Email");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, -1, -1));

        jTextField1.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 170, -1));

        jTextField2.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 170, -1));

        jTextField3.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 50, -1));

        jDateChooser1.setDateFormatString("yyyy/MM/dd");
        jDateChooser1.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 170, 30));

        jTextField4.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 170, -1));

        jTextField5.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 170, -1));

        jTextField6.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 250, -1));

        jComboBox1.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 170, -1));

        jButton1.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 580, -1, -1));

        jButton2.setBackground(new java.awt.Color(204, 255, 204));
        jButton2.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jButton2.setText("Registrarse");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 520, -1, -1));

        jButton3.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jButton3.setText("Volver");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, -1, -1));

        jLabel11.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/img 2.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, -1, -1));

        jTextField7.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 170, -1));

        jPasswordField1.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 170, -1));

        jLabel12.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jLabel12.setText("Usuario");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel13.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jLabel13.setText("Contraseña");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        //-- Cierra el programa --//
        System.exit(0);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        //-- va al formulario iniciar sesion --//
        IniciarSesion a = new IniciarSesion();
        a.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        /**
        * Ejecuta el metodo RegistrarUsuario
        */
        if (jTextField1.getText().isEmpty( ) || jTextField7.getText().isEmpty( ) || jPasswordField1.getText().isEmpty( )){
            JOptionPane.showMessageDialog(null,"Los campos: Nombre, Usuario y Contraseña son obligatorios");
        }else{
            RegistrarUsuario();
  
            Ini a = new Ini ( );
            
            String nombre = jTextField1.getText();
            String user = jTextField7.getText();
            a.jLabel23.setText(nombre);
            a.jLabel21.setText(user);
            
            Limpiar();
            a.setVisible(true);
            dispose();
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}