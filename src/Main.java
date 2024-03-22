
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

//fila 3 mesa 3

public class Main extends javax.swing.JFrame {

      AdmCarros adm = new AdmCarros("./Carros.DGR");
    public Main() {
        adm.cargarArchivo();
 
        initComponents();
        
        DefaultComboBoxModel m1 = (DefaultComboBoxModel) jcb_carrojug1.getModel();
        m1.removeAllElements();
        for (Carro c : adm.getCarros()) {
            m1.addElement(c);
        }
        jcb_carrojug1.setModel(m1);
        
        
        DefaultComboBoxModel m2 = (DefaultComboBoxModel) jcb_carrojug2.getModel();
        m2.removeAllElements();
        for (Carro c : adm.getCarros()) {
            m2.addElement(c);
        }
        jcb_carrojug2.setModel(m2);
        
        this.setLocationRelativeTo(null);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jF_crearcarro = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bt_crear = new javax.swing.JButton();
        js_velocidad = new javax.swing.JSpinner();
        tf_modelo = new javax.swing.JTextField();
        tf_marca = new javax.swing.JTextField();
        jp_goback = new javax.swing.JPanel();
        jl_goback = new javax.swing.JLabel();
        jF_juego = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jl_tiempo = new javax.swing.JLabel();
        jp_volverjuego = new javax.swing.JPanel();
        jl_volverjuego = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jl_jugarcarro2nombre = new javax.swing.JLabel();
        jl_jugarcarro1nombre = new javax.swing.JLabel();
        jpb_carro2 = new javax.swing.JProgressBar();
        jpb_carro1 = new javax.swing.JProgressBar();
        bt_iniciarjuego = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jcb_carrojug1 = new javax.swing.JComboBox<>();
        jcb_carrojug2 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        bt_jugar = new javax.swing.JButton();
        bt_opencrearcarro = new javax.swing.JButton();
        jl_velocidadjug2 = new javax.swing.JLabel();
        jl_marcajug2 = new javax.swing.JLabel();
        jl_modelojug2 = new javax.swing.JLabel();
        jl_velocidadjug1 = new javax.swing.JLabel();
        jl_marcajug1 = new javax.swing.JLabel();
        jl_modelojug1 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("VELOCIDAD");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 140, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("CREAR CARRO");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 174, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("MARCA");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 100, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("MODELO");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 110, -1));

        bt_crear.setText("CREAR");
        bt_crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_crearMouseClicked(evt);
            }
        });
        jPanel2.add(bt_crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, 90, 60));
        jPanel2.add(js_velocidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 80, 30));
        jPanel2.add(tf_modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 230, -1));

        tf_marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_marcaActionPerformed(evt);
            }
        });
        jPanel2.add(tf_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 230, -1));

        jp_goback.setBackground(new java.awt.Color(204, 204, 204));
        jp_goback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_gobackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jp_gobackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jp_gobackMouseExited(evt);
            }
        });

        jl_goback.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jl_goback.setForeground(new java.awt.Color(0, 0, 0));
        jl_goback.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_goback.setText("X");

        javax.swing.GroupLayout jp_gobackLayout = new javax.swing.GroupLayout(jp_goback);
        jp_goback.setLayout(jp_gobackLayout);
        jp_gobackLayout.setHorizontalGroup(
            jp_gobackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_gobackLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl_goback, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );
        jp_gobackLayout.setVerticalGroup(
            jp_gobackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_gobackLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jl_goback)
                .addGap(16, 16, 16))
        );

        jPanel2.add(jp_goback, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 50, 50));

        javax.swing.GroupLayout jF_crearcarroLayout = new javax.swing.GroupLayout(jF_crearcarro.getContentPane());
        jF_crearcarro.getContentPane().setLayout(jF_crearcarroLayout);
        jF_crearcarroLayout.setHorizontalGroup(
            jF_crearcarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jF_crearcarroLayout.setVerticalGroup(
            jF_crearcarroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setForeground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("TIEMPO");

        jl_tiempo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jl_tiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_tiempo.setText("00:00");

        jp_volverjuego.setBackground(new java.awt.Color(255, 255, 255));
        jp_volverjuego.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp_volverjuegoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jp_volverjuegoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jp_volverjuegoMouseExited(evt);
            }
        });

        jl_volverjuego.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jl_volverjuego.setForeground(new java.awt.Color(0, 0, 0));
        jl_volverjuego.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_volverjuego.setText("X");

        javax.swing.GroupLayout jp_volverjuegoLayout = new javax.swing.GroupLayout(jp_volverjuego);
        jp_volverjuego.setLayout(jp_volverjuegoLayout);
        jp_volverjuegoLayout.setHorizontalGroup(
            jp_volverjuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_volverjuegoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl_volverjuego, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_volverjuegoLayout.setVerticalGroup(
            jp_volverjuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_volverjuegoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jl_volverjuego, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jLabel15))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jl_tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(jp_volverjuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_tiempo, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addGap(18, 18, 18))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jp_volverjuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("PROGRESO");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, -1));

        jl_jugarcarro2nombre.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jPanel3.add(jl_jugarcarro2nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 240, 40));

        jl_jugarcarro1nombre.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jPanel3.add(jl_jugarcarro1nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 240, 40));

        jpb_carro2.setMaximum(1000);
        jPanel3.add(jpb_carro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 300, 50));

        jpb_carro1.setMaximum(1000);
        jPanel3.add(jpb_carro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 300, 50));

        bt_iniciarjuego.setText("INICIAR");
        bt_iniciarjuego.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_iniciarjuegoMouseClicked(evt);
            }
        });
        bt_iniciarjuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_iniciarjuegoActionPerformed(evt);
            }
        });
        jPanel3.add(bt_iniciarjuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, -1, -1));

        javax.swing.GroupLayout jF_juegoLayout = new javax.swing.GroupLayout(jF_juego.getContentPane());
        jF_juego.getContentPane().setLayout(jF_juegoLayout);
        jF_juegoLayout.setHorizontalGroup(
            jF_juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jF_juegoLayout.setVerticalGroup(
            jF_juegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PARTIDA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Jugador 2");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Jugador 1");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jcb_carrojug1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcb_carrojug1ItemStateChanged(evt);
            }
        });
        jPanel1.add(jcb_carrojug1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 180, -1));

        jcb_carrojug2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcb_carrojug2ItemStateChanged(evt);
            }
        });
        jPanel1.add(jcb_carrojug2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 180, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("VS");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("VELOCIDAD");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("MARCA");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("MODELO");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("VELOCIDAD");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("MARCA");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("MODELO");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, -1, -1));

        bt_jugar.setText("JUGAR");
        bt_jugar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_jugarMouseClicked(evt);
            }
        });
        jPanel1.add(bt_jugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 343, 100, 40));

        bt_opencrearcarro.setText("CREAR CARRO");
        bt_opencrearcarro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_opencrearcarroMouseClicked(evt);
            }
        });
        bt_opencrearcarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_opencrearcarroActionPerformed(evt);
            }
        });
        jPanel1.add(bt_opencrearcarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, -1));

        jl_velocidadjug2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jl_velocidadjug2.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jl_velocidadjug2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 60, 20));

        jl_marcajug2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jl_marcajug2.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jl_marcajug2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 140, 20));

        jl_modelojug2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jl_modelojug2.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jl_modelojug2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 140, 20));

        jl_velocidadjug1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jl_velocidadjug1.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jl_velocidadjug1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 60, 20));

        jl_marcajug1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jl_marcajug1.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jl_marcajug1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 140, 20));

        jl_modelojug1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jl_modelojug1.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jl_modelojug1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 140, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_marcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_marcaActionPerformed

    private void jp_gobackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_gobackMouseEntered
        jp_goback.setBackground(Color.red);
        jl_goback.setForeground(Color.white);
    }//GEN-LAST:event_jp_gobackMouseEntered

    private void jp_gobackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_gobackMouseExited
        jp_goback.setBackground(new Color(204,204,204));
        jl_goback.setForeground(Color.black);
    }//GEN-LAST:event_jp_gobackMouseExited

    private void bt_opencrearcarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_opencrearcarroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_opencrearcarroActionPerformed

    private void bt_opencrearcarroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_opencrearcarroMouseClicked
       jF_crearcarro.pack();
       jF_crearcarro.setLocationRelativeTo(null);
        jF_crearcarro.setVisible(true);
        
       this.setVisible(false);
       
    }//GEN-LAST:event_bt_opencrearcarroMouseClicked

    private void jp_gobackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_gobackMouseClicked
        this.pack();
       this.setLocationRelativeTo(null);
        this.setVisible(true);
        
       jF_crearcarro.setVisible(false);
    }//GEN-LAST:event_jp_gobackMouseClicked

    private void bt_crearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_crearMouseClicked
        if(!tf_marca.getText().equals("") && !tf_modelo.getText().equals("") && ((int)js_velocidad.getValue())>0 ){
            Carro c = new Carro(tf_marca.getText(),tf_modelo.getText(),((int)js_velocidad.getValue()));
             adm.getCarros().add(c);
             adm.escribirArchivo();
             JOptionPane.showMessageDialog(jF_crearcarro, "Has creado el "+c.getMarca()+" "+c.getModelo()+" a la lista!");
             tf_marca.setText("");
             tf_modelo.setText("");
             js_velocidad.setValue(0);
             adm.cargarArchivo();
             
             DefaultComboBoxModel modelo = (DefaultComboBoxModel) jcb_carrojug1.getModel();
             modelo.removeAllElements();
             for (Carro cc : adm.getCarros()) {
                 modelo.addElement(cc);
                
            }
             jcb_carrojug1.setModel(modelo);
             
            DefaultComboBoxModel modelo2 = (DefaultComboBoxModel) jcb_carrojug2.getModel();
            modelo2.removeAllElements();
             for (Carro a : adm.getCarros()) {
                 modelo2.addElement(a);
                
            }
             
             jcb_carrojug2.setModel(modelo2);
             
        }
        else{
           JOptionPane.showMessageDialog(jF_crearcarro, "Error, hay campos vacios");
        }
    }//GEN-LAST:event_bt_crearMouseClicked

    private void jcb_carrojug2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcb_carrojug2ItemStateChanged
        adm.cargarArchivo();
        carro2= (Carro)jcb_carrojug2.getSelectedItem();
        if(carro2==null){
            
        }
        else{
        jl_marcajug2.setText(carro2.getMarca());
        jl_modelojug2.setText(carro2.getModelo());
        jl_velocidadjug2.setText(carro2.getVelocidad()+"");
        }
    }//GEN-LAST:event_jcb_carrojug2ItemStateChanged

    private void jcb_carrojug1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcb_carrojug1ItemStateChanged
           adm.cargarArchivo();
        carro1= (Carro)jcb_carrojug1.getSelectedItem();
        if(carro1==null){
            
        }
        else{
        jl_marcajug1.setText(carro1.getMarca());
        jl_modelojug1.setText(carro1.getModelo());
        jl_velocidadjug1.setText(carro1.getVelocidad()+"");
        }
    }//GEN-LAST:event_jcb_carrojug1ItemStateChanged

    private void bt_jugarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_jugarMouseClicked
        
        if(carro1 ==null || carro2 == null){
            JOptionPane.showMessageDialog(this, "No hay carros seleccionados! ");
        }
        else{
        jF_juego.pack();
        jF_juego.setLocationRelativeTo(null);
        
        jF_juego.setVisible(true);
        this.setVisible(false);
        jl_jugarcarro1nombre.setText(carro1.getModelo());
        jl_jugarcarro2nombre.setText(carro2.getModelo());
        }
    }//GEN-LAST:event_bt_jugarMouseClicked

    private void bt_iniciarjuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_iniciarjuegoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_iniciarjuegoActionPerformed

    private void bt_iniciarjuegoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_iniciarjuegoMouseClicked
       
        if(hilosexistentes.size()<=0){
        boolean flag = true;
       
       ThreadJuego t= new ThreadJuego(carro1,carro2,jpb_carro1,jpb_carro2,jF_juego,jl_tiempo);
       ThreadTimer timer = new ThreadTimer(jl_tiempo,t);
       hilosexistentes.add(t);
       hilosexistentes.add(timer);
       t.start();
       timer.start();
       
        }
        else{
            
        }
        
       
    }//GEN-LAST:event_bt_iniciarjuegoMouseClicked

    private void jp_volverjuegoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_volverjuegoMouseEntered
        jp_volverjuego.setBackground(Color.red);
        jl_volverjuego.setForeground(Color.white);
    }//GEN-LAST:event_jp_volverjuegoMouseEntered

    private void jp_volverjuegoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_volverjuegoMouseExited
       jp_volverjuego.setBackground(Color.white);
       jl_volverjuego.setForeground(Color.black);
               
    }//GEN-LAST:event_jp_volverjuegoMouseExited

    private void jp_volverjuegoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp_volverjuegoMouseClicked
        for (Thread t : hilosexistentes) {
            t.stop();
        }
        jpb_carro1.setValue(0);
        jpb_carro2.setValue(0);
        hilosexistentes.removeAll(hilosexistentes);
       this.setVisible(true);
       jF_juego.setVisible(false);
    }//GEN-LAST:event_jp_volverjuegoMouseClicked

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    Carro carro1 = new Carro();
    Carro carro2 = new Carro();
    ArrayList<Thread> hilosexistentes = new ArrayList<>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_crear;
    private javax.swing.JButton bt_iniciarjuego;
    private javax.swing.JButton bt_jugar;
    private javax.swing.JButton bt_opencrearcarro;
    private javax.swing.JFrame jF_crearcarro;
    private javax.swing.JFrame jF_juego;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JComboBox<String> jcb_carrojug1;
    private javax.swing.JComboBox<String> jcb_carrojug2;
    private javax.swing.JLabel jl_goback;
    private javax.swing.JLabel jl_jugarcarro1nombre;
    private javax.swing.JLabel jl_jugarcarro2nombre;
    private javax.swing.JLabel jl_marcajug1;
    private javax.swing.JLabel jl_marcajug2;
    private javax.swing.JLabel jl_modelojug1;
    private javax.swing.JLabel jl_modelojug2;
    private javax.swing.JLabel jl_tiempo;
    private javax.swing.JLabel jl_velocidadjug1;
    private javax.swing.JLabel jl_velocidadjug2;
    private javax.swing.JLabel jl_volverjuego;
    private javax.swing.JPanel jp_goback;
    private javax.swing.JPanel jp_volverjuego;
    private javax.swing.JProgressBar jpb_carro1;
    private javax.swing.JProgressBar jpb_carro2;
    private javax.swing.JSpinner js_velocidad;
    private javax.swing.JTextField tf_marca;
    private javax.swing.JTextField tf_modelo;
    // End of variables declaration//GEN-END:variables
}
