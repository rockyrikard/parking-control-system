
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author zafer
 */
public class kk extends javax.swing.JFrame {

    String url = "jdbc:mysql://localhost:3306/otopark";
    String username = "root";
    String password = "14201420";
    Connection connection = null;
    PreparedStatement pst,pst1;
    int cap;
    
    

    public Statement baglantiac() throws Exception {

        connection = DriverManager.getConnection(url, username, password);          
        return connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

    }
    

    public void baglantikapat() throws SQLException {
        connection.close();
    }
    
    public void TabloDoldur() {
        
try {
 
    Statement st = baglantiac(); 
    ResultSet res = st.executeQuery("SELECT * FROM  otopark.arac"); 
    myTableModel model = new myTableModel(res); 
    jTable2.setModel(model); 
    baglantikapat(); 
    kapasite();
    cap = 35 - myTableModel.satirSayisi;
 
} catch (Exception e) {
    JOptionPane.showConfirmDialog(null, "Bağlantı Başarısız", "MySQL Bağlantısı", JOptionPane.PLAIN_MESSAGE);
}
}
    
        public void TabloDoldurPersonel() {
        
try {
 
    Statement st = baglantiac(); 
    ResultSet res = st.executeQuery("SELECT * FROM  otopark.personel"); 
    myTableModel model = new myTableModel(res); 
    jTable1.setModel(model); 
    baglantikapat(); 
 
} catch (Exception e) {
    JOptionPane.showConfirmDialog(null, "Bağlantı Başarısız", "MySQL Bağlantısı", JOptionPane.PLAIN_MESSAGE);
}
}
    
    public void kapasite(){
        
       // cap+=1;
        kapasitef.setText("Anlık Kapasite :  "+cap);
        
    }


    public kk() {

        //Statement st;
        this.connection = null;
        initComponents();
        
        TabloDoldur();
        kapasite();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aracgirisframe = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        plakaf = new javax.swing.JTextField();
        pkatf = new javax.swing.JTextField();
        staytimef = new javax.swing.JTextField();
        branchf = new javax.swing.JTextField();
        aracgirkaydet = new javax.swing.JButton();
        pricef = new javax.swing.JLabel();
        hesaplaf = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        msadf = new javax.swing.JTextField();
        msoyadf = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        personelveriframe = new javax.swing.JFrame();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        psoyadf = new javax.swing.JTextField();
        psubef = new javax.swing.JTextField();
        psmaasf = new javax.swing.JTextField();
        psadf = new javax.swing.JTextField();
        psverilerikaydet = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        idf = new javax.swing.JTextField();
        priceupbtn = new javax.swing.JButton();
        priceupf = new javax.swing.JTextField();
        fireupbtn = new javax.swing.JButton();
        araccikisframe = new javax.swing.JFrame();
        jLabel10 = new javax.swing.JLabel();
        cikisplakaf = new javax.swing.JTextField();
        cikisonaybtn = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        aracgir = new javax.swing.JButton();
        araccik = new javax.swing.JButton();
        personel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        kapasitef = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        aracgirisframe.setBounds(new java.awt.Rectangle(300, 400, 500, 600));

        jLabel1.setText("Araç Plaka                  : ");

        jLabel2.setText("Park Katı                    :");

        jLabel3.setText("Giriş Tarih  -  Saat");

        jLabel4.setText("Otopark Şube             :");

        jLabel5.setText("Tahsil Alınacak Ücret :");

        plakaf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plakafActionPerformed(evt);
            }
        });

        pkatf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pkatfActionPerformed(evt);
            }
        });

        aracgirkaydet.setText("Kaydet");
        aracgirkaydet.setToolTipText("");
        aracgirkaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aracgirkaydetActionPerformed(evt);
            }
        });

        hesaplaf.setText("Hesapla");
        hesaplaf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hesaplafActionPerformed(evt);
            }
        });

        jLabel12.setText("Müşteri Ad Soyad       :");

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel13.setText("ARAÇ KAYIT");

        msadf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msadfActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "14-05-22 23:00", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout aracgirisframeLayout = new javax.swing.GroupLayout(aracgirisframe.getContentPane());
        aracgirisframe.getContentPane().setLayout(aracgirisframeLayout);
        aracgirisframeLayout.setHorizontalGroup(
            aracgirisframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aracgirisframeLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hesaplaf)
                .addGap(43, 43, 43))
            .addGroup(aracgirisframeLayout.createSequentialGroup()
                .addGroup(aracgirisframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(aracgirisframeLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(aracgirisframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(aracgirisframeLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(aracgirisframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(plakaf, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(aracgirisframeLayout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(pricef, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(aracgirisframeLayout.createSequentialGroup()
                                .addGroup(aracgirisframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel12))
                                .addGap(22, 22, 22)
                                .addGroup(aracgirisframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(aracgirkaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(aracgirisframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(pkatf)
                                        .addGroup(aracgirisframeLayout.createSequentialGroup()
                                            .addComponent(msadf, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(msoyadf, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(branchf)
                                        .addComponent(jComboBox1, 0, 252, Short.MAX_VALUE))))))
                    .addGroup(aracgirisframeLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(staytimef, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 59, Short.MAX_VALUE))
        );
        aracgirisframeLayout.setVerticalGroup(
            aracgirisframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aracgirisframeLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(aracgirisframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(plakaf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(aracgirisframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(msadf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(msoyadf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(aracgirisframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pkatf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(aracgirisframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(aracgirisframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(branchf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(aracgirkaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pricef, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(aracgirisframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(hesaplaf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(staytimef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        personelveriframe.setBounds(new java.awt.Rectangle(300, 400, 1000, 500));
        personelveriframe.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel6.setText("Ad          :");

        jLabel7.setText("Soyad     :");

        jLabel8.setText("Şube       :");

        jLabel9.setText("Maaş       :");

        psverilerikaydet.setText("Kaydet");
        psverilerikaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psverilerikaydetActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jLabel11.setText("Veri Güncellenecek Id:");

        priceupbtn.setText("Maaş Güncelle");
        priceupbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceupbtnActionPerformed(evt);
            }
        });

        priceupf.setText("Maaş Girin");

        fireupbtn.setText("İşten Çıkar");
        fireupbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fireupbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout personelveriframeLayout = new javax.swing.GroupLayout(personelveriframe.getContentPane());
        personelveriframe.getContentPane().setLayout(personelveriframeLayout);
        personelveriframeLayout.setHorizontalGroup(
            personelveriframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personelveriframeLayout.createSequentialGroup()
                .addGroup(personelveriframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(personelveriframeLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(personelveriframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(personelveriframeLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(psmaasf, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                            .addGroup(personelveriframeLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(psubef))
                            .addGroup(personelveriframeLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(psoyadf))
                            .addGroup(personelveriframeLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(psadf))))
                    .addGroup(personelveriframeLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(psverilerikaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(126, 126, 126)
                .addGroup(personelveriframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(personelveriframeLayout.createSequentialGroup()
                        .addGroup(personelveriframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(priceupf))
                        .addGap(18, 18, 18)
                        .addGroup(personelveriframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(personelveriframeLayout.createSequentialGroup()
                                .addComponent(priceupbtn)
                                .addGap(28, 28, 28)
                                .addComponent(fireupbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(idf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        personelveriframeLayout.setVerticalGroup(
            personelveriframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personelveriframeLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(personelveriframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(personelveriframeLayout.createSequentialGroup()
                        .addGroup(personelveriframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(psadf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(personelveriframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(psoyadf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(personelveriframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(psubef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(personelveriframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(psmaasf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(psverilerikaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(personelveriframeLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(personelveriframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(idf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(personelveriframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fireupbtn)
                    .addGroup(personelveriframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(priceupf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(priceupbtn)))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        araccikisframe.setBounds(new java.awt.Rectangle(300, 400, 400, 265));

        jLabel10.setText("ÇIKIŞ YAPACAK ARACIN PLAKASINI GİRİNİZ");

        cikisonaybtn.setText("ONAYLA");
        cikisonaybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikisonaybtnActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "14-05-22 23:00", "Item 2", "Item 3", "Item 4" }));

        jLabel14.setText("Çıkış Tarih - Saat");

        javax.swing.GroupLayout araccikisframeLayout = new javax.swing.GroupLayout(araccikisframe.getContentPane());
        araccikisframe.getContentPane().setLayout(araccikisframeLayout);
        araccikisframeLayout.setHorizontalGroup(
            araccikisframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(araccikisframeLayout.createSequentialGroup()
                .addGroup(araccikisframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(araccikisframeLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel10))
                    .addGroup(araccikisframeLayout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(cikisonaybtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(araccikisframeLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(araccikisframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cikisplakaf, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(araccikisframeLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel14)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        araccikisframeLayout.setVerticalGroup(
            araccikisframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(araccikisframeLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cikisplakaf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cikisonaybtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 200, 0, 0));

        aracgir.setText("Araç Girişi");
        aracgir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aracgirActionPerformed(evt);
            }
        });

        araccik.setText("Araç Çıkışı");
        araccik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                araccikActionPerformed(evt);
            }
        });

        personel.setText("Personel Verileri");
        personel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personelActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "PLAKA", "KAT", "SÜRE", "ŞUBE","ÜCRET"
            }
        ));
        jScrollPane1.setViewportView(jTable2);

        kapasitef.setText("Anlık Kapasite:");

        jButton1.setText("Güncelle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(kapasitef, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(32, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(araccik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(aracgir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(personel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(aracgir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(araccik, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(personel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(kapasitef)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aracgirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aracgirActionPerformed
        aracgirisframe.setVisible(true);
    }//GEN-LAST:event_aracgirActionPerformed

    private void araccikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_araccikActionPerformed
      araccikisframe.setVisible(true);
        
    }//GEN-LAST:event_araccikActionPerformed

    private void plakafActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plakafActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_plakafActionPerformed

    private void pkatfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pkatfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pkatfActionPerformed

    private void aracgirkaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aracgirkaydetActionPerformed

        String a = plakaf.getText();
        String b = pkatf.getText();
        String c = staytimef.getText();
        String d = branchf.getText();
        String e = pricef.getText();
        String aa = msadf.getText();
        String bb = msoyadf.getText();
        a=a.toUpperCase();
        b=b.toUpperCase();
        
        
        try {
            try {
                 Statement st =baglantiac();
                 st.executeUpdate("SET FOREIGN_KEY_CHECKS=0");
                 st.executeUpdate("INSERT INTO otopark.uye (plate,ad,soyad) VALUES('"+a+"','"+aa+"','"+bb+"')");
               
            } catch (Exception ex) {
                Logger.getLogger(kk.class.getName()).log(Level.SEVERE, null, ex);
            }
                     
        
            /*String sqlq2 = "INSERT INTO otopark.uye (plate,ad,soyad) VALUES(?,?,?)";
            
            pst1 = connection.prepareCall(sqlq2);
            
            pst1.setString(1,a);
            pst1.setString(2, aa);
            pst1.setString(3, bb);
            */
            
            String sqlq1 = "INSERT INTO otopark.arac (plaka,floor,time,branch,price) VALUES(?,?,?,?,?)";
            
            pst = connection.prepareStatement(sqlq1);

            pst.setString(1, a);
            pst.setString(2, b);
            pst.setString(3, c);
            pst.setString(4, d);
            pst.setString(5, e);

            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Araç Eklendi!");
            kapasite();
        } catch (SQLException f) {
            System.err.println("Araç Eklenemedi");
            
            JOptionPane.showMessageDialog(null, "Araç Ekelenemedi" + f.getMessage() );
        } catch (Exception ex) {
            Logger.getLogger(kk.class.getName()).log(Level.SEVERE, null, ex);
        }
        TabloDoldur();
        
        aracgirisframe.setVisible(false);
        
    }//GEN-LAST:event_aracgirkaydetActionPerformed

    private void psverilerikaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psverilerikaydetActionPerformed

        String a = psubef.getText();
        String b = psadf.getText();
        String c = psoyadf.getText();
        String d = psmaasf.getText();

        try {
            try {
                baglantiac();
            } catch (Exception ex) {
                Logger.getLogger(kk.class.getName()).log(Level.SEVERE, null, ex);
            }
            String sqlq = "INSERT INTO otopark.personel (sube,ad,soyad,maas) VALUES(?,?,?,?)";

            pst = connection.prepareStatement(sqlq);
            pst.setString(1, a);
            pst.setString(2, b);
            pst.setString(3, c);
            pst.setString(4, d);

            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Kayıt Başarılı!");
        } catch (SQLException e) {
            System.err.println("Kayıt Başarısız");
            JOptionPane.showMessageDialog(null, "Kayıt Başarısız");
        }

        TabloDoldurPersonel();
    }//GEN-LAST:event_psverilerikaydetActionPerformed

    private void personelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personelActionPerformed

        personelveriframe.setVisible(true);
        TabloDoldurPersonel();
    }//GEN-LAST:event_personelActionPerformed

    private void hesaplafActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hesaplafActionPerformed

        int toplam = (Integer.parseInt(staytimef.getText())) * 15;
        pricef.setText(String.valueOf(toplam));

    }//GEN-LAST:event_hesaplafActionPerformed

    private void cikisonaybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikisonaybtnActionPerformed

    try {
    Statement st = baglantiac();
    String x = cikisplakaf.getText();
    st.executeUpdate("DELETE FROM otopark.arac WHERE plaka='"+x+"'");
    baglantikapat(); 
    TabloDoldur();  
    kapasite();
    } catch (Exception e) {
    JOptionPane.showConfirmDialog(null, "Kayıt Silinemedi", "Kişiler Tablosu", JOptionPane.PLAIN_MESSAGE);
    }
        
        
    }//GEN-LAST:event_cikisonaybtnActionPerformed

    private void fireupbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fireupbtnActionPerformed
        
        int b = (Integer.parseInt(idf.getText())); 
        
        try {
        Statement st = baglantiac();
        
        st.executeUpdate("DELETE FROM otopark.personel WHERE id="+b);
        baglantikapat(); 
        TabloDoldurPersonel();
    
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "İşten Çıkarma Başarısız" + e.getMessage() );
        }
        
        
    }//GEN-LAST:event_fireupbtnActionPerformed

    private void priceupbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceupbtnActionPerformed
        
        int a = (Integer.parseInt(priceupf.getText()));
        int b = (Integer.parseInt(idf.getText())); 
        try {
        Statement st = baglantiac();
        
        st.executeUpdate("UPDATE otopark.personel SET maas ="+a+" WHERE id="+b);
        baglantikapat(); 
        TabloDoldurPersonel();
    
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Maas Guncelleme Basarisiz" + e.getMessage() );
        }
        
    }//GEN-LAST:event_priceupbtnActionPerformed

    private void msadfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msadfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_msadfActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        kapasite();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        String url = "jdbc:mysql://localhost:3306/otopark";
        String username = "root";
        String password = "14201420";

        System.out.println("Connecting database...");
        
        
        
        
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton araccik;
    private javax.swing.JFrame araccikisframe;
    private javax.swing.JButton aracgir;
    private javax.swing.JFrame aracgirisframe;
    private javax.swing.JButton aracgirkaydet;
    private javax.swing.JTextField branchf;
    private javax.swing.JButton cikisonaybtn;
    private javax.swing.JTextField cikisplakaf;
    private javax.swing.JButton fireupbtn;
    private javax.swing.JButton hesaplaf;
    private javax.swing.JTextField idf;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel kapasitef;
    private javax.swing.JTextField msadf;
    private javax.swing.JTextField msoyadf;
    private javax.swing.JButton personel;
    private javax.swing.JFrame personelveriframe;
    private javax.swing.JTextField pkatf;
    private javax.swing.JTextField plakaf;
    private javax.swing.JLabel pricef;
    private javax.swing.JButton priceupbtn;
    private javax.swing.JTextField priceupf;
    private javax.swing.JTextField psadf;
    private javax.swing.JTextField psmaasf;
    private javax.swing.JTextField psoyadf;
    private javax.swing.JTextField psubef;
    private javax.swing.JButton psverilerikaydet;
    private javax.swing.JTextField staytimef;
    // End of variables declaration//GEN-END:variables

}
