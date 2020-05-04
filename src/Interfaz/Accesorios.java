package Interfaz;
/**
 * @author Alejandro Erazo
 */

public class Accesorios extends javax.swing.JFrame {

    // ----------------------------------
    // Atributos
    // ----------------------------------
    int contador1 = 0;
    int contador2 = 0;
    int contador3 = 0;
    ConfirmarCompra Compra = new ConfirmarCompra ( );
    
    // ----------------------------------
    // Constructor
    // ----------------------------------
    public Accesorios() {
        
        initComponents();
        
        //-- Codigo para mostrar la tabla en el centro de la pantalla --//
        this.setLocationRelativeTo(null);
        
    }
    
    // ----------------------------------
    // Metodos
    // ----------------------------------
    
    public void ocultar ( ){
        jComboBox1.setVisible(false);
        jComboBox2.setVisible(false);
        jComboBox3.setVisible(false);
        jComboBox4.setVisible(false);
        jComboBox5.setVisible(false);
        jComboBox6.setVisible(false);
        jComboBox7.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        jButton8.setEnabled(false);
        jButton6.setEnabled(false);
        jButton9.setVisible(false);
        jButton10.setVisible(false);
        jButton11.setVisible(false);
    }
    
    public void MostrarManigetas ( ){
        jComboBox1.setVisible(true);
        jComboBox2.setVisible(true);
        jComboBox3.setVisible(true);
    }
    public void MostrarSoporte ( ){
        jComboBox4.setVisible(true);
        jComboBox5.setVisible(true);
    }
    public void MostrarExosto ( ){
        jComboBox6.setVisible(true);
        jComboBox7.setVisible(true);
    }
    
    public void OcultarManigetas ( ){
        jComboBox1.setVisible(false);
        jComboBox2.setVisible(false);
        jComboBox3.setVisible(false);
    }
    public void OcultarSoporte ( ){
        jComboBox4.setVisible(false);
        jComboBox5.setVisible(false);
    }
    public void OcultarExosto ( ){
        jComboBox6.setVisible(false);
        jComboBox7.setVisible(false);
    }
    
    public void validarCheck1 ( ){
        if (jCheckBox1.isSelected()){
            jButton3.setVisible(true);
            jButton9.setVisible(true);
            int precioBase = Integer.parseInt(jTextField5.getText());
            int añadido = Integer.parseInt(jLabel28.getText());
            int resultado = precioBase+añadido;
            String res = Integer.toString(resultado);
            
            jTextField5.setText(res);
            Compra.jLabel26.setText("Maniguetas");
        }else{
            jButton3.setVisible(false);
            int precioBase = Integer.parseInt(jTextField5.getText());
            int añadido = Integer.parseInt(jLabel28.getText());
            int resultado = precioBase-añadido;
            String res = Integer.toString(resultado);
            
            jTextField5.setText(res);
            Compra.jLabel26.setText("");
        }
    }
    
    public void validarCheck2 ( ){
        if (jCheckBox2.isSelected()){
            jButton4.setVisible(true);
            jButton10.setVisible(true);
            int precioBase = Integer.parseInt(jTextField5.getText());
            int añadido = Integer.parseInt(jLabel29.getText());
            int resultado = precioBase+añadido;
            String res = Integer.toString(resultado);
            
            jTextField5.setText(res);
            Compra.jLabel27.setText("Soporte para celular");
        }else{
            jButton4.setVisible(false);
            int precioBase = Integer.parseInt(jTextField5.getText());
            int añadido = Integer.parseInt(jLabel29.getText());
            int resultado = precioBase-añadido;
            String res = Integer.toString(resultado);
            
            jTextField5.setText(res);
            Compra.jLabel27.setText("");
        }
    }
    
    public void validarCheck3 ( ){
        if (jCheckBox3.isSelected()){
            jButton11.setVisible(true);
            jButton5.setVisible(true);
            int precioBase = Integer.parseInt(jTextField5.getText());
            int añadido = Integer.parseInt(jLabel30.getText());
            int resultado = precioBase+añadido;
            String res = Integer.toString(resultado);
            
            jTextField5.setText(res);
            Compra.jLabel28.setText("Exosto de lujo");
        }else{
            jButton5.setVisible(false);
            int precioBase = Integer.parseInt(jTextField5.getText());
            int añadido = Integer.parseInt(jLabel30.getText());
            int resultado = precioBase-añadido;
            String res = Integer.toString(resultado);
            
            jTextField5.setText(res);
            Compra.jLabel28.setText("");
        }
    }
    
    public void Comb1 ( ){
        int a = jComboBox1.getSelectedIndex();
        if ( a == 0 ){
            // Rojo
            int precioBase = Integer.parseInt(jTextField5.getText());
            int rojo = 5800;
            int resultado = precioBase+rojo;
            String res = Integer.toString(resultado);
            jTextField5.setText(res);
            
            jLabel21.setText("5.800");
            Compra.jLabel29.setText("Rojas");
        }else if ( a == 1 ){
            // Negro
            int precioBase = Integer.parseInt(jTextField5.getText());
            int Negro = 7200;
            int resultado = precioBase+Negro;
            String res = Integer.toString(resultado);
            jTextField5.setText(res);
            
            jLabel21.setText("7.200");
            Compra.jLabel29.setText("Negras");
        }else if ( a == 2 ){
            // Azul
            int precioBase = Integer.parseInt(jTextField5.getText());
            int Azul = 6300;
            int resultado = precioBase+Azul;
            String res = Integer.toString(resultado);
            jTextField5.setText(res);
            
            jLabel21.setText("6.300");
            Compra.jLabel29.setText("Azules");
        }else if ( a == 3 ){
            // Dorado
            int precioBase = Integer.parseInt(jTextField5.getText());
            int dorado = 55500;
            int resultado = precioBase+dorado;
            String res = Integer.toString(resultado);
            jTextField5.setText(res);
            
            jLabel21.setText("55.500");
            Compra.jLabel29.setText("Doradas");
        }
    }
    
    public void Comb2 ( ){
        int a = jComboBox2.getSelectedIndex();
        if ( a == 0 ){
            // Flexible
            int precioBase = Integer.parseInt(jTextField5.getText());
            int Flexible = 30700;
            int resultado = precioBase+Flexible;
            String res = Integer.toString(resultado);
            jTextField5.setText(res);
            
            jLabel22.setText("30.700");
            Compra.jLabel30.setText("Flexible");
        }else if ( a == 1 ){
            // Rigida
            int precioBase = Integer.parseInt(jTextField5.getText());
            int Rigida = 12000;
            int resultado = precioBase+Rigida;
            String res = Integer.toString(resultado);
            jTextField5.setText(res);
            
            jLabel22.setText("12.000");
            Compra.jLabel30.setText("Rigida");
        }else if ( a == 2 ){
            // Semi
            int precioBase = Integer.parseInt(jTextField5.getText());
            int Semi = 22200;
            int resultado = precioBase+Semi;
            String res = Integer.toString(resultado);
            jTextField5.setText(res);
            
            jLabel22.setText("22.200");
            Compra.jLabel30.setText("Semi");
        }
    }
    
    public void Comb3 ( ){
        int a = jComboBox3.getSelectedIndex();
        if ( a == 0 ){
            // Normal
            int precioBase = Integer.parseInt(jTextField5.getText());
            int Normal = 21000;
            int resultado = precioBase+Normal;
            String res = Integer.toString(resultado);
            jTextField5.setText(res);
            
            jLabel23.setText("21.000");
            Compra.jLabel31.setText("Normal");
        }else if ( a == 1 ){
            // DeLujo
            int precioBase = Integer.parseInt(jTextField5.getText());
            int DeLujo = 58000;
            int resultado = precioBase+DeLujo;
            String res = Integer.toString(resultado);
            jTextField5.setText(res);
            
            jLabel23.setText("58.000");
            Compra.jLabel31.setText("De lujo");
        }
    }
    
    public void Comb4 ( ){
        int a = jComboBox4.getSelectedIndex();
        if ( a == 0 ){
            // Rojo
            int precioBase = Integer.parseInt(jTextField5.getText());
            int Rojo = 5950;
            int resultado = precioBase+Rojo;
            String res = Integer.toString(resultado);
            jTextField5.setText(res);
            
            jLabel24.setText("5.950");
            Compra.jLabel32.setText("Rojo");
        }else if ( a == 1 ){
            // Negro
            int precioBase = Integer.parseInt(jTextField5.getText());
            int Negro = 8300;
            int resultado = precioBase+Negro;
            String res = Integer.toString(resultado);
            jTextField5.setText(res);
            
            jLabel24.setText("8.300");
            Compra.jLabel32.setText("Negro");
        }else if ( a == 2 ){
            // Azul
            int precioBase = Integer.parseInt(jTextField5.getText());
            int Azul = 9200;
            int resultado = precioBase+Azul;
            String res = Integer.toString(resultado);
            jTextField5.setText(res);
            
            jLabel24.setText("9.200");
            Compra.jLabel32.setText("Azul");
        }
    }
    
    public void Comb5 ( ){
        int a = jComboBox5.getSelectedIndex();
        if ( a == 0 ){
            // Largo
            int precioBase = Integer.parseInt(jTextField5.getText());
            int Largo = 13900;
            int resultado = precioBase+Largo;
            String res = Integer.toString(resultado);
            jTextField5.setText(res);
            
            jLabel25.setText("13.900");
            Compra.jLabel33.setText("Largo");
        }else if ( a == 1 ){
            // Corto
            int precioBase = Integer.parseInt(jTextField5.getText());
            int Corto = 7950;
            int resultado = precioBase+Corto;
            String res = Integer.toString(resultado);
            jTextField5.setText(res);
            
            jLabel25.setText("7.950");
            Compra.jLabel33.setText("Corto");
        }
    }
    
    public void Comb6 ( ){
        int a = jComboBox6.getSelectedIndex();
        if ( a == 0 ){
            // Akrapovic
            int precioBase = Integer.parseInt(jTextField5.getText());
            int Akrapovic = 22300;
            int resultado = precioBase+Akrapovic;
            String res = Integer.toString(resultado);
            jTextField5.setText(res);
            
            jLabel27.setText("22.300");
            Compra.jLabel34.setText("Akrapovic");
        }else if ( a == 1 ){
            // M4
            int precioBase = Integer.parseInt(jTextField5.getText());
            int M4 = 15700;
            int resultado = precioBase+M4;
            String res = Integer.toString(resultado);
            jTextField5.setText(res);
            
            jLabel27.setText("15.700");
            Compra.jLabel34.setText("M4");
        }else if ( a == 2 ){
            // Yoshimura
            int precioBase = Integer.parseInt(jTextField5.getText());
            int Yoshimura = 32500;
            int resultado = precioBase+Yoshimura;
            String res = Integer.toString(resultado);
            jTextField5.setText(res);
            
            jLabel27.setText("32.500");
            Compra.jLabel34.setText("Yoshimura");
        }
    }
    
    public void Comb7 ( ){
        int a = jComboBox7.getSelectedIndex();
        if ( a == 0 ){
            // DobleSalida
            int precioBase = Integer.parseInt(jTextField5.getText());
            int DobleSalida = 34500;
            int resultado = precioBase+DobleSalida;
            String res = Integer.toString(resultado);
            jTextField5.setText(res);
            
            jLabel26.setText("34.500");
            Compra.jLabel35.setText("Doble salida");
        }else if ( a == 1 ){
            // TripeSalida
            int precioBase = Integer.parseInt(jTextField5.getText());
            int TripeSalida = 44500;
            int resultado = precioBase+TripeSalida;
            String res = Integer.toString(resultado);
            jTextField5.setText(res);
            
            jLabel26.setText("44.500");
            Compra.jLabel35.setText("Tripe salida");
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jButton4 = new javax.swing.JButton();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jButton5 = new javax.swing.JButton();
        jComboBox6 = new javax.swing.JComboBox<>();
        jComboBox7 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Brush Script MT", 0, 65)); // NOI18N
        jLabel2.setText("Añadir accesorios");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, -1, -1));

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jButton1.setText("Comprar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jButton2.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        jLabel3.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jLabel3.setText("Maniguetas");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/maniguetas.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, -1, -1));

        jCheckBox1.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jCheckBox1.setText("Añadir");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, -1, -1));

        jButton3.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jButton3.setText("+");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Negro", "Azul", "Dorado" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, -1, -1));

        jComboBox2.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Flexible", "Rigida", "Semi" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, -1, -1));

        jComboBox3.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "De lujo" }));
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, -1, -1));

        jLabel5.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jLabel5.setText("Soporte Celular");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/soporte.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, -1, -1));

        jCheckBox2.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jCheckBox2.setText("Añadir");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, -1, -1));

        jButton4.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jButton4.setText("+");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 280, -1, -1));

        jComboBox4.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rojo", "Negro", "Azul" }));
        getContentPane().add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 320, -1, -1));

        jComboBox5.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Largo", "Corto" }));
        getContentPane().add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 360, -1, -1));

        jLabel7.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jLabel7.setText("Exosto de lujo");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 90, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exosto.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 120, -1, -1));

        jCheckBox3.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jCheckBox3.setText("Añadir");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 280, -1, -1));

        jButton5.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jButton5.setText("+");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 280, -1, -1));

        jComboBox6.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Akrapovic", "M4", "Yoshimura" }));
        getContentPane().add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 320, -1, -1));

        jComboBox7.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doble salida", "Triple salida" }));
        getContentPane().add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 360, -1, -1));

        jLabel9.setFont(new java.awt.Font("Calisto MT", 0, 16)); // NOI18N
        jLabel9.setText("Precio:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, -1, -1));

        jLabel10.setFont(new java.awt.Font("Calisto MT", 0, 16)); // NOI18N
        jLabel10.setText("Precio:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 240, -1, -1));

        jLabel11.setFont(new java.awt.Font("Calisto MT", 0, 16)); // NOI18N
        jLabel11.setText("Precio:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 240, -1, -1));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 20, 340));

        jLabel12.setFont(new java.awt.Font("Brush Script MT", 0, 30)); // NOI18N
        jLabel12.setText("Informacion Motocicleta:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel13.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jLabel13.setText("Nombre:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel14.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jLabel14.setText("Cilindrada:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel15.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jLabel15.setText("KW:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel16.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jLabel16.setText("Precio:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jLabel17.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        jLabel18.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel19.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 90, -1));

        jLabel20.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jLabel20.setText("General total en accesorios");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, -1, -1));

        jButton6.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jButton6.setText("Generar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, -1, -1));

        jButton7.setBackground(new java.awt.Color(204, 255, 204));
        jButton7.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jButton7.setText("Añadir");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, -1, -1));

        jButton8.setBackground(new java.awt.Color(204, 255, 204));
        jButton8.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jButton8.setText("Retirar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, -1, -1));

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jTextField5.setText("0");
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 90, -1));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 20, 80));

        jLabel21.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, -1, -1));
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, -1, -1));
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, -1, -1));
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 330, -1, -1));
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 370, -1, -1));
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 370, -1, -1));
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 330, -1, -1));

        jLabel28.setFont(new java.awt.Font("Calisto MT", 0, 16)); // NOI18N
        jLabel28.setText("120000");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, -1, -1));

        jLabel29.setFont(new java.awt.Font("Calisto MT", 0, 16)); // NOI18N
        jLabel29.setText("135000");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, -1, -1));

        jLabel30.setFont(new java.awt.Font("Calisto MT", 0, 16)); // NOI18N
        jLabel30.setText("280000");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 240, -1, -1));

        jButton9.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jButton9.setText("-");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 280, -1, -1));

        jButton10.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jButton10.setText("-");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 280, -1, -1));

        jButton11.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jButton11.setText("-");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 280, -1, -1));

        jLabel31.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jLabel31.setText("Categorita:");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel32.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png"))); // NOI18N
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel34.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        jLabel34.setText("Usuario:");
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 400, -1, -1));

        jLabel35.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 400, -1, -1));

        jLabel36.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        jLabel36.setText("Nombre:");
        getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 420, -1, -1));

        jLabel37.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 420, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        Ini a = new Ini ( );
        
        String n = jLabel35.getText();
        String u = jLabel37.getText();
        a.jLabel23.setText(n);
        a.jLabel21.setText(u);
        
        a.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String nombre = jLabel17.getText();
        String cc = jLabel18.getText();
        String kw = jLabel19.getText();
        String categoria = jLabel32.getText();
        String precio = jTextField4.getText();
        
        Compra.jLabel19.setText(nombre);
        Compra.jLabel20.setText(cc);
        Compra.jLabel21.setText(kw);
        Compra.jLabel24.setText(categoria);
        Compra.jLabel22.setText(precio);
        
        String n = jLabel35.getText();
        String u = jLabel37.getText();
        Compra.jLabel40.setText(n);
        Compra.jLabel39.setText(u);
        
        Compra.setVisible(true);
        dispose();
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        MostrarManigetas();
        jButton6.setEnabled(true);
        contador1++;
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        MostrarSoporte();
        jButton6.setEnabled(true);
        contador2++;
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        MostrarExosto();
        jButton6.setEnabled(true);
        contador3++;
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        
        validarCheck1();
        
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        if (contador1 == 1){
            Comb1();
            Comb2();
            Comb3();
        }
        if (contador2 == 1){
            Comb4();
            Comb5();
        }
        
        if (contador3 == 1){
            Comb6();
            Comb7();
        }
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
        int precioBase = Integer.parseInt(jTextField5.getText());
        int precioTotal = Integer.parseInt(jTextField4.getText());
        int resultado = precioBase+precioTotal;
        String res = Integer.toString(resultado);
        
        jTextField4.setText(res);
        jButton7.setEnabled(false);
        jButton8.setEnabled(true);
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        
        int precioBase = Integer.parseInt(jTextField5.getText());
        int precioTotal = Integer.parseInt(jTextField4.getText());
        int resultado = precioTotal-precioBase;
        String res = Integer.toString(resultado);
        
        jTextField4.setText(res);
        jButton7.setEnabled(true);
        jButton8.setEnabled(false);
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        
        validarCheck2();
        
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        
       validarCheck3(); 
        
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        
        OcultarManigetas();
        jLabel21.setVisible(false);
        jLabel22.setVisible(false);
        jLabel23.setVisible(false);
        
        Compra.jLabel29.setText("");
        Compra.jLabel30.setText("");
        Compra.jLabel31.setText("");
        
        contador1 --;
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        
        OcultarSoporte();
        jLabel24.setVisible(false);
        jLabel25.setVisible(false);
        
        Compra.jLabel32.setText("");
        Compra.jLabel33.setText("");
        
        contador2 --;
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        
        OcultarExosto();
        jLabel26.setVisible(false);
        jLabel27.setVisible(false);
        
        Compra.jLabel34.setText("");
        Compra.jLabel35.setText("");
        
        contador3 --;
        
    }//GEN-LAST:event_jButton11ActionPerformed

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
            java.util.logging.Logger.getLogger(Accesorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Accesorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Accesorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Accesorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Accesorios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    public static javax.swing.JLabel jLabel17;
    public static javax.swing.JLabel jLabel18;
    public static javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    public static javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    public static javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    public static javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    public static javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
