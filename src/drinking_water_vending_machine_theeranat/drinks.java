/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package drinking_water_vending_machine_theeranat;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class drinks extends javax.swing.JFrame {

    /**
     * Creates new form drinks
     */
    public drinks() {
        initComponents();
    }
    
    int gettotal_money = 0;
    
    public drinks(int x) {
        initComponents();
        gettotal_money = x;
        if (gettotal_money == 10){
            btn_water1.setEnabled(true);
            btn_water2.setEnabled(true);
            btn_water3.setEnabled(true);
            btn_water4.setEnabled(true);
            btn_volt1.setEnabled(true);
            btn_volt2.setEnabled(true);
        }
        else if (gettotal_money == 11){
            btn_water1.setEnabled(true);
            btn_water2.setEnabled(true);
            btn_water3.setEnabled(true);
            btn_water4.setEnabled(true);
            btn_volt1.setEnabled(true);
            btn_volt2.setEnabled(true);
            btn_m150_b1.setEnabled(true);
            btn_m150_b2.setEnabled(true);
            btn_carabao1.setEnabled(true);
            btn_carabao2.setEnabled(true);
        }
        else if (gettotal_money == 12){
            btn_water1.setEnabled(true);
            btn_water2.setEnabled(true);
            btn_water3.setEnabled(true);
            btn_water4.setEnabled(true);
            btn_volt1.setEnabled(true);
            btn_volt2.setEnabled(true);
            btn_m150_b1.setEnabled(true);
            btn_m150_b2.setEnabled(true);
            btn_carabao1.setEnabled(true);
            btn_carabao2.setEnabled(true);
            btn_bigtea1.setEnabled(true);
            btn_bigtea2.setEnabled(true);
            btn_coconut.setEnabled(true);
            btn_mjoygrape.setEnabled(true);
            btn_mjoylychee.setEnabled(true);
            btn_jellychake.setEnabled(true);

        }
        else if (gettotal_money == 13){
            btn_water1.setEnabled(true);
            btn_water2.setEnabled(true);
            btn_water3.setEnabled(true);
            btn_water4.setEnabled(true);
            btn_volt1.setEnabled(true);
            btn_volt2.setEnabled(true);
            btn_m150_b1.setEnabled(true);
            btn_m150_b2.setEnabled(true);
            btn_carabao1.setEnabled(true);
            btn_carabao2.setEnabled(true);
            btn_bigtea1.setEnabled(true);
            btn_bigtea2.setEnabled(true);
            btn_coconut.setEnabled(true);
            btn_mjoygrape.setEnabled(true);
            btn_mjoylychee.setEnabled(true);
            btn_jellychake.setEnabled(true);
            btn_schweppes1.setEnabled(true);
            btn_schweppes2.setEnabled(true);
            btn_m150_y1.setEnabled(true);
            btn_m150_y2.setEnabled(true);
        }
        else if (gettotal_money == 14){
            btn_water1.setEnabled(true);
            btn_water2.setEnabled(true);
            btn_water3.setEnabled(true);
            btn_water4.setEnabled(true);
            btn_volt1.setEnabled(true);
            btn_volt2.setEnabled(true);
            btn_m150_b1.setEnabled(true);
            btn_m150_b2.setEnabled(true);
            btn_carabao1.setEnabled(true);
            btn_carabao2.setEnabled(true);
            btn_bigtea1.setEnabled(true);
            btn_bigtea2.setEnabled(true);
            btn_coconut.setEnabled(true);
            btn_mjoygrape.setEnabled(true);
            btn_mjoylychee.setEnabled(true);
            btn_jellychake.setEnabled(true);
            btn_schweppes1.setEnabled(true);
            btn_schweppes2.setEnabled(true);
            btn_m150_y1.setEnabled(true);
            btn_m150_y2.setEnabled(true);
            btn_cokenosugar1.setEnabled(true);
            btn_cokenosugar2.setEnabled(true);
            btn_cokeoriginal1.setEnabled(true);
            btn_cokeoriginal2.setEnabled(true);
            btn_pepsi1.setEnabled(true);
            btn_pepsi2.setEnabled(true);
        }
        else if (gettotal_money == 15){
            btn_water1.setEnabled(true);
            btn_water2.setEnabled(true);
            btn_water3.setEnabled(true);
            btn_water4.setEnabled(true);
            btn_volt1.setEnabled(true);
            btn_volt2.setEnabled(true);
            btn_m150_b1.setEnabled(true);
            btn_m150_b2.setEnabled(true);
            btn_carabao1.setEnabled(true);
            btn_carabao2.setEnabled(true);
            btn_bigtea1.setEnabled(true);
            btn_bigtea2.setEnabled(true);
            btn_coconut.setEnabled(true);
            btn_mjoygrape.setEnabled(true);
            btn_mjoylychee.setEnabled(true);
            btn_jellychake.setEnabled(true);
            btn_schweppes1.setEnabled(true);
            btn_schweppes2.setEnabled(true);
            btn_m150_y1.setEnabled(true);
            btn_m150_y2.setEnabled(true);
            btn_cokenosugar1.setEnabled(true);
            btn_cokenosugar2.setEnabled(true);
            btn_cokeoriginal1.setEnabled(true);
            btn_cokeoriginal2.setEnabled(true);
            btn_pepsi1.setEnabled(true);
            btn_pepsi2.setEnabled(true);
            btn_sponsor.setEnabled(true);
        }
        else if (gettotal_money == 16){
            btn_water1.setEnabled(true);
            btn_water2.setEnabled(true);
            btn_water3.setEnabled(true);
            btn_water4.setEnabled(true);
            btn_volt1.setEnabled(true);
            btn_volt2.setEnabled(true);
            btn_m150_b1.setEnabled(true);
            btn_m150_b2.setEnabled(true);
            btn_carabao1.setEnabled(true);
            btn_carabao2.setEnabled(true);
            btn_bigtea1.setEnabled(true);
            btn_bigtea2.setEnabled(true);
            btn_coconut.setEnabled(true);
            btn_mjoygrape.setEnabled(true);
            btn_mjoylychee.setEnabled(true);
            btn_jellychake.setEnabled(true);
            btn_schweppes1.setEnabled(true);
            btn_schweppes2.setEnabled(true);
            btn_m150_y1.setEnabled(true);
            btn_m150_y2.setEnabled(true);
            btn_cokenosugar1.setEnabled(true);
            btn_cokenosugar2.setEnabled(true);
            btn_cokeoriginal1.setEnabled(true);
            btn_cokeoriginal2.setEnabled(true);
            btn_pepsi1.setEnabled(true);
            btn_pepsi2.setEnabled(true);
            btn_sponsor.setEnabled(true);
            btn_grassjelly.setEnabled(true);
        }
        else if (gettotal_money == 17){
            btn_water1.setEnabled(true);
            btn_water2.setEnabled(true);
            btn_water3.setEnabled(true);
            btn_water4.setEnabled(true);
            btn_volt1.setEnabled(true);
            btn_volt2.setEnabled(true);
            btn_m150_b1.setEnabled(true);
            btn_m150_b2.setEnabled(true);
            btn_carabao1.setEnabled(true);
            btn_carabao2.setEnabled(true);
            btn_bigtea1.setEnabled(true);
            btn_bigtea2.setEnabled(true);
            btn_coconut.setEnabled(true);
            btn_mjoygrape.setEnabled(true);
            btn_mjoylychee.setEnabled(true);
            btn_jellychake.setEnabled(true);
            btn_schweppes1.setEnabled(true);
            btn_schweppes2.setEnabled(true);
            btn_m150_y1.setEnabled(true);
            btn_m150_y2.setEnabled(true);
            btn_cokenosugar1.setEnabled(true);
            btn_cokenosugar2.setEnabled(true);
            btn_cokeoriginal1.setEnabled(true);
            btn_cokeoriginal2.setEnabled(true);
            btn_pepsi1.setEnabled(true);
            btn_pepsi2.setEnabled(true);
            btn_sponsor.setEnabled(true);
            btn_grassjelly.setEnabled(true);
            btn_singha.setEnabled(true);
            btn_cvittorange.setEnabled(true);
            btn_cvittlemon.setEnabled(true);
            btn_cvittpeach.setEnabled(true);
        }
        else if (gettotal_money >= 18){
            btn_water1.setEnabled(true);
            btn_water2.setEnabled(true);
            btn_water3.setEnabled(true);
            btn_water4.setEnabled(true);
            btn_volt1.setEnabled(true);
            btn_volt2.setEnabled(true);
            btn_m150_b1.setEnabled(true);
            btn_m150_b2.setEnabled(true);
            btn_carabao1.setEnabled(true);
            btn_carabao2.setEnabled(true);
            btn_bigtea1.setEnabled(true);
            btn_bigtea2.setEnabled(true);
            btn_coconut.setEnabled(true);
            btn_mjoygrape.setEnabled(true);
            btn_mjoylychee.setEnabled(true);
            btn_jellychake.setEnabled(true);
            btn_schweppes1.setEnabled(true);
            btn_schweppes2.setEnabled(true);
            btn_m150_y1.setEnabled(true);
            btn_m150_y2.setEnabled(true);
            btn_cokenosugar1.setEnabled(true);
            btn_cokenosugar2.setEnabled(true);
            btn_cokeoriginal1.setEnabled(true);
            btn_cokeoriginal2.setEnabled(true);
            btn_pepsi1.setEnabled(true);
            btn_pepsi2.setEnabled(true);
            btn_sponsor.setEnabled(true);
            btn_grassjelly.setEnabled(true);
            btn_singha.setEnabled(true);
            btn_cvittorange.setEnabled(true);
            btn_cvittlemon.setEnabled(true);
            btn_cvittpeach.setEnabled(true);
            btn_nescafeespresso.setEnabled(true);
            btn_nescafelatte.setEnabled(true);
            btn_birdyespresso.setEnabled(true);
            btn_birdyrobusta.setEnabled(true);
        }
        else if (gettotal_money < 10){
            drinks get_drinks = new drinks();
            get_drinks.setVisible(true);
            JOptionPane.showMessageDialog(this, "Please insert money greater than or equal to 10 baht!","Warning",JOptionPane.WARNING_MESSAGE);
            get_drinks.setVisible(false);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        btn_water1 = new javax.swing.JButton();
        btn_water2 = new javax.swing.JButton();
        btn_water3 = new javax.swing.JButton();
        btn_water4 = new javax.swing.JButton();
        btn_sponsor = new javax.swing.JButton();
        btn_bigtea1 = new javax.swing.JButton();
        btn_bigtea2 = new javax.swing.JButton();
        btn_schweppes1 = new javax.swing.JButton();
        btn_singha = new javax.swing.JButton();
        btn_coconut = new javax.swing.JButton();
        btn_cvittorange = new javax.swing.JButton();
        btn_cvittlemon = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        btn_nescafeespresso = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        btn_nescafelatte = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        btn_birdyrobusta = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        btn_schweppes2 = new javax.swing.JButton();
        btn_cokenosugar1 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        btn_cokenosugar2 = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        btn_cvittpeach = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        btn_grassjelly = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        btn_cokeoriginal1 = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        btn_cokeoriginal2 = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        btn_pepsi1 = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        btn_pepsi2 = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        btn_m150_y1 = new javax.swing.JButton();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        btn_m150_y2 = new javax.swing.JButton();
        jLabel55 = new javax.swing.JLabel();
        btn_m150_b1 = new javax.swing.JButton();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        btn_m150_b2 = new javax.swing.JButton();
        btn_carabao1 = new javax.swing.JButton();
        jLabel58 = new javax.swing.JLabel();
        btn_carabao2 = new javax.swing.JButton();
        jLabel59 = new javax.swing.JLabel();
        btn_volt1 = new javax.swing.JButton();
        jLabel60 = new javax.swing.JLabel();
        btn_volt2 = new javax.swing.JButton();
        jLabel61 = new javax.swing.JLabel();
        btn_mjoygrape = new javax.swing.JButton();
        jLabel62 = new javax.swing.JLabel();
        btn_mjoylychee = new javax.swing.JButton();
        jLabel63 = new javax.swing.JLabel();
        btn_birdyespresso = new javax.swing.JButton();
        jLabel64 = new javax.swing.JLabel();
        btn_jellychake = new javax.swing.JButton();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Drinks menu");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/water1.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/water2.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/water3.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/water4.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/sponsor.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/bigtea1.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/bigtea2.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/schweppes1.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/singha.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/coconut.png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/cvitt1.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/cvitt2.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("10B");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("10B");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("10B");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("10B");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("15B");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("12B");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("12B");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("13B");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("17B");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("12B");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("17B");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("17B");

        btn_water1.setBackground(new java.awt.Color(0, 0, 0));
        btn_water1.setEnabled(false);
        btn_water1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_water1ActionPerformed(evt);
            }
        });

        btn_water2.setBackground(new java.awt.Color(0, 0, 0));
        btn_water2.setEnabled(false);
        btn_water2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_water2ActionPerformed(evt);
            }
        });

        btn_water3.setBackground(new java.awt.Color(0, 0, 0));
        btn_water3.setEnabled(false);
        btn_water3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_water3ActionPerformed(evt);
            }
        });

        btn_water4.setBackground(new java.awt.Color(0, 0, 0));
        btn_water4.setEnabled(false);
        btn_water4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_water4ActionPerformed(evt);
            }
        });

        btn_sponsor.setBackground(new java.awt.Color(0, 0, 0));
        btn_sponsor.setEnabled(false);
        btn_sponsor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sponsorActionPerformed(evt);
            }
        });

        btn_bigtea1.setBackground(new java.awt.Color(0, 0, 0));
        btn_bigtea1.setEnabled(false);
        btn_bigtea1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bigtea1ActionPerformed(evt);
            }
        });

        btn_bigtea2.setBackground(new java.awt.Color(0, 0, 0));
        btn_bigtea2.setEnabled(false);
        btn_bigtea2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bigtea2ActionPerformed(evt);
            }
        });

        btn_schweppes1.setBackground(new java.awt.Color(0, 0, 0));
        btn_schweppes1.setEnabled(false);
        btn_schweppes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_schweppes1ActionPerformed(evt);
            }
        });

        btn_singha.setBackground(new java.awt.Color(0, 0, 0));
        btn_singha.setEnabled(false);
        btn_singha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_singhaActionPerformed(evt);
            }
        });

        btn_coconut.setBackground(new java.awt.Color(0, 0, 0));
        btn_coconut.setEnabled(false);
        btn_coconut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_coconutActionPerformed(evt);
            }
        });

        btn_cvittorange.setBackground(new java.awt.Color(0, 0, 0));
        btn_cvittorange.setEnabled(false);
        btn_cvittorange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cvittorangeActionPerformed(evt);
            }
        });

        btn_cvittlemon.setBackground(new java.awt.Color(0, 0, 0));
        btn_cvittlemon.setEnabled(false);
        btn_cvittlemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cvittlemonActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("14B");

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/nescafe2.png"))); // NOI18N

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("14B");

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/birdy1.png"))); // NOI18N

        btn_nescafeespresso.setBackground(new java.awt.Color(0, 0, 0));
        btn_nescafeespresso.setEnabled(false);
        btn_nescafeespresso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nescafeespressoActionPerformed(evt);
            }
        });

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/schweppes2.png"))); // NOI18N

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/cokenosugar1.png"))); // NOI18N

        btn_nescafelatte.setBackground(new java.awt.Color(0, 0, 0));
        btn_nescafelatte.setEnabled(false);
        btn_nescafelatte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nescafelatteActionPerformed(evt);
            }
        });

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/cokenosugar2.png"))); // NOI18N

        btn_birdyrobusta.setBackground(new java.awt.Color(0, 0, 0));
        btn_birdyrobusta.setEnabled(false);
        btn_birdyrobusta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_birdyrobustaActionPerformed(evt);
            }
        });

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/cvitt3.png"))); // NOI18N

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/grassjelly.png"))); // NOI18N

        btn_schweppes2.setBackground(new java.awt.Color(0, 0, 0));
        btn_schweppes2.setEnabled(false);
        btn_schweppes2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_schweppes2ActionPerformed(evt);
            }
        });

        btn_cokenosugar1.setBackground(new java.awt.Color(0, 0, 0));
        btn_cokenosugar1.setEnabled(false);
        btn_cokenosugar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cokenosugar1ActionPerformed(evt);
            }
        });

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/cokeoriginal1.png"))); // NOI18N

        btn_cokenosugar2.setBackground(new java.awt.Color(0, 0, 0));
        btn_cokenosugar2.setEnabled(false);
        btn_cokenosugar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cokenosugar2ActionPerformed(evt);
            }
        });

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/cokeoriginal2.png"))); // NOI18N

        btn_cvittpeach.setBackground(new java.awt.Color(0, 0, 0));
        btn_cvittpeach.setEnabled(false);
        btn_cvittpeach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cvittpeachActionPerformed(evt);
            }
        });

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/pepsi1.png"))); // NOI18N

        btn_grassjelly.setBackground(new java.awt.Color(0, 0, 0));
        btn_grassjelly.setEnabled(false);
        btn_grassjelly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_grassjellyActionPerformed(evt);
            }
        });

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/pepsi2.png"))); // NOI18N

        btn_cokeoriginal1.setBackground(new java.awt.Color(0, 0, 0));
        btn_cokeoriginal1.setEnabled(false);
        btn_cokeoriginal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cokeoriginal1ActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("18B");

        btn_cokeoriginal2.setBackground(new java.awt.Color(0, 0, 0));
        btn_cokeoriginal2.setEnabled(false);
        btn_cokeoriginal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cokeoriginal2ActionPerformed(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("18B");

        btn_pepsi1.setBackground(new java.awt.Color(0, 0, 0));
        btn_pepsi1.setEnabled(false);
        btn_pepsi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pepsi1ActionPerformed(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("18B");

        btn_pepsi2.setBackground(new java.awt.Color(0, 0, 0));
        btn_pepsi2.setEnabled(false);
        btn_pepsi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pepsi2ActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("13B");

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("14B");

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("14B");

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("17B");

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("16B");

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("14B");

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/nescafe1.png"))); // NOI18N

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("14B");

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("18B");

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/m150y2.png"))); // NOI18N

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("12B");

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/m150b1.png"))); // NOI18N

        btn_m150_y1.setBackground(new java.awt.Color(0, 0, 0));
        btn_m150_y1.setEnabled(false);
        btn_m150_y1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_m150_y1ActionPerformed(evt);
            }
        });

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/m150b2.png"))); // NOI18N

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/carabao1.png"))); // NOI18N

        btn_m150_y2.setBackground(new java.awt.Color(0, 0, 0));
        btn_m150_y2.setEnabled(false);
        btn_m150_y2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_m150_y2ActionPerformed(evt);
            }
        });

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/carabao2.png"))); // NOI18N

        btn_m150_b1.setBackground(new java.awt.Color(0, 0, 0));
        btn_m150_b1.setEnabled(false);
        btn_m150_b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_m150_b1ActionPerformed(evt);
            }
        });

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/volt1.png"))); // NOI18N

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/volt2.png"))); // NOI18N

        btn_m150_b2.setBackground(new java.awt.Color(0, 0, 0));
        btn_m150_b2.setEnabled(false);
        btn_m150_b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_m150_b2ActionPerformed(evt);
            }
        });

        btn_carabao1.setBackground(new java.awt.Color(0, 0, 0));
        btn_carabao1.setEnabled(false);
        btn_carabao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_carabao1ActionPerformed(evt);
            }
        });

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/mjoygrape.png"))); // NOI18N

        btn_carabao2.setBackground(new java.awt.Color(0, 0, 0));
        btn_carabao2.setEnabled(false);
        btn_carabao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_carabao2ActionPerformed(evt);
            }
        });

        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/mjoylychee.png"))); // NOI18N

        btn_volt1.setBackground(new java.awt.Color(0, 0, 0));
        btn_volt1.setEnabled(false);
        btn_volt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volt1ActionPerformed(evt);
            }
        });

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/birdy2.png"))); // NOI18N

        btn_volt2.setBackground(new java.awt.Color(0, 0, 0));
        btn_volt2.setEnabled(false);
        btn_volt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volt2ActionPerformed(evt);
            }
        });

        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/jellyshake.png"))); // NOI18N

        btn_mjoygrape.setBackground(new java.awt.Color(0, 0, 0));
        btn_mjoygrape.setEnabled(false);
        btn_mjoygrape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mjoygrapeActionPerformed(evt);
            }
        });

        jLabel62.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setText("13B");

        btn_mjoylychee.setBackground(new java.awt.Color(0, 0, 0));
        btn_mjoylychee.setEnabled(false);
        btn_mjoylychee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mjoylycheeActionPerformed(evt);
            }
        });

        jLabel63.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setText("13B");

        btn_birdyespresso.setBackground(new java.awt.Color(0, 0, 0));
        btn_birdyespresso.setEnabled(false);
        btn_birdyespresso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_birdyespressoActionPerformed(evt);
            }
        });

        jLabel64.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setText("11B");

        btn_jellychake.setBackground(new java.awt.Color(0, 0, 0));
        btn_jellychake.setEnabled(false);
        btn_jellychake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_jellychakeActionPerformed(evt);
            }
        });

        jLabel65.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setText("11B");

        jLabel66.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel66.setText("11B");

        jLabel67.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel67.setText("11B");

        jLabel68.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel68.setText("10B");

        jLabel69.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel69.setText("10B");

        jLabel70.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel70.setText("12B");

        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/m150y1.png"))); // NOI18N

        jLabel72.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel72.setText("12B");

        jButton1.setText("Return_Main");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("go to insert money");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btn_m150_y1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel71))
                            .addGap(41, 41, 41)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btn_m150_y2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel50))
                            .addGap(44, 44, 44)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_m150_b1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(44, 44, 44)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_m150_b2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(49, 49, 49)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel54))
                                .addComponent(btn_carabao1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(44, 44, 44)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel55))
                                .addComponent(btn_carabao2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(45, 45, 45)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel56))
                                .addComponent(btn_volt1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(51, 51, 51)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel57))
                                .addComponent(btn_volt2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(48, 48, 48)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel70, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel58))
                                .addComponent(btn_mjoygrape, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(46, 46, 46)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel72, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel59))
                                .addComponent(btn_mjoylychee, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(45, 45, 45)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel60))
                                .addComponent(btn_birdyespresso, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(40, 40, 40)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn_jellychake, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btn_nescafeespresso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel47))
                            .addGap(41, 41, 41)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btn_nescafelatte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel26))
                            .addGap(44, 44, 44)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_birdyrobusta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(44, 44, 44)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_schweppes2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(49, 49, 49)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel30))
                                .addComponent(btn_cokenosugar1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(44, 44, 44)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel31))
                                .addComponent(btn_cokenosugar2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(45, 45, 45)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel32))
                                .addComponent(btn_cvittpeach, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(51, 51, 51)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel33))
                                .addComponent(btn_grassjelly, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(48, 48, 48)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel34))
                                .addComponent(btn_cokeoriginal1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(46, 46, 46)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel35))
                                .addComponent(btn_cokeoriginal2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(45, 45, 45)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel36))
                                .addComponent(btn_pepsi1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(40, 40, 40)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn_pepsi2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btn_water1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(41, 41, 41)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btn_water2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(44, 44, 44)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_water3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(44, 44, 44)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_water4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(49, 49, 49)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(btn_sponsor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(44, 44, 44)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(btn_bigtea1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(45, 45, 45)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(btn_bigtea2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(51, 51, 51)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(btn_schweppes1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(48, 48, 48)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(btn_singha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(46, 46, 46)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(btn_coconut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(45, 45, 45)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(btn_cvittorange, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(40, 40, 40)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn_cvittlemon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_water1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_water2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_water3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_water4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_sponsor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_bigtea1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_bigtea2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_schweppes1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_singha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_coconut, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cvittorange, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cvittlemon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel37)
                    .addComponent(jLabel36)
                    .addComponent(jLabel35)
                    .addComponent(jLabel34)
                    .addComponent(jLabel33)
                    .addComponent(jLabel32)
                    .addComponent(jLabel31)
                    .addComponent(jLabel30)
                    .addComponent(jLabel29)
                    .addComponent(jLabel28)
                    .addComponent(jLabel26)
                    .addComponent(jLabel47))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(jLabel39)
                    .addComponent(jLabel40)
                    .addComponent(jLabel41)
                    .addComponent(jLabel42)
                    .addComponent(jLabel43)
                    .addComponent(jLabel44)
                    .addComponent(jLabel45)
                    .addComponent(jLabel46)
                    .addComponent(jLabel48)
                    .addComponent(jLabel25)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_nescafeespresso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_nescafelatte, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_birdyrobusta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_schweppes2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cokenosugar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cokenosugar2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cvittpeach, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_grassjelly, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cokeoriginal1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cokeoriginal2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_pepsi1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_pepsi2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel61)
                    .addComponent(jLabel60)
                    .addComponent(jLabel59)
                    .addComponent(jLabel58)
                    .addComponent(jLabel57)
                    .addComponent(jLabel56)
                    .addComponent(jLabel55)
                    .addComponent(jLabel54)
                    .addComponent(jLabel53)
                    .addComponent(jLabel52)
                    .addComponent(jLabel50)
                    .addComponent(jLabel71))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(jLabel63)
                    .addComponent(jLabel64)
                    .addComponent(jLabel65)
                    .addComponent(jLabel66)
                    .addComponent(jLabel67)
                    .addComponent(jLabel68)
                    .addComponent(jLabel69)
                    .addComponent(jLabel70)
                    .addComponent(jLabel72)
                    .addComponent(jLabel49)
                    .addComponent(jLabel51))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_m150_y1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_m150_y2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_m150_b1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_m150_b2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_carabao1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_carabao2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_volt1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_volt2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_mjoygrape, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_mjoylychee, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_birdyespresso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_jellychake, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        main get_main = new main();
        get_main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new inputmoney(gettotal_money).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    String drink_name,drink_pic = "";
    int drink_value,drink_price,total_price;
    
    private void btn_water1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_water1ActionPerformed
        // TODO add your handling code here:
        try {
            FileInputStream fis = new FileInputStream("D:\\Drinking_water_vending_machine_Theeranat\\src\\drinking_water_vending_machine_theeranat\\drinks_data.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length >= 2 && parts[0].equals("water1")) {
                    drink_name = parts[0];
                    drink_value = Integer.parseInt(parts[1]);
                    if (drink_value == 0) {
                        JOptionPane.showMessageDialog(this, "Out of stock for water1!","WARNING!", JOptionPane.WARNING_MESSAGE);
                        btn_water1.setEnabled(false);
                        return;
                    }
                    drink_pic = "D:\\Drinking_water_vending_machine_Theeranat\\src\\picture\\water1.png";
                    drink_value--;
                    drink_price = 10;
                    total_price = gettotal_money;
                    new main(drink_name,drink_value,drink_pic,drink_price,total_price).setVisible(true);
                    this.dispose();
                }
            }
            br.close();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_water1ActionPerformed

    private void btn_water2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_water2ActionPerformed
        // TODO add your handling code here:
        try {
            FileInputStream fis = new FileInputStream("D:\\Drinking_water_vending_machine_Theeranat\\src\\drinking_water_vending_machine_theeranat\\drinks_data.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length >= 2 && parts[0].equals("water2")) {
                    drink_name = parts[0];
                    drink_value = Integer.parseInt(parts[1]);
                    if (drink_value == 0) {
                        JOptionPane.showMessageDialog(this, "Out of stock for water2!","WARNING!", JOptionPane.WARNING_MESSAGE);
                        btn_water2.setEnabled(false);
                        return;
                    }
                    drink_pic = "D:\\Drinking_water_vending_machine_Theeranat\\src\\picture\\water2.png";
                    drink_value = Integer.parseInt(parts[1]);
                    drink_value--;
                    drink_price = 10;
                    total_price = gettotal_money;
                    new main(drink_name,drink_value,drink_pic,drink_price,total_price).setVisible(true);
                    this.dispose();
                }
            }
            br.close();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_water2ActionPerformed

    private void btn_water3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_water3ActionPerformed
        // TODO add your handling code here:
        try {
            FileInputStream fis = new FileInputStream("D:\\Drinking_water_vending_machine_Theeranat\\src\\drinking_water_vending_machine_theeranat\\drinks_data.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length >= 2 && parts[0].equals("water3")) {
                    drink_name = parts[0];
                    drink_value = Integer.parseInt(parts[1]);
                    if (drink_value == 0) {
                        JOptionPane.showMessageDialog(this, "Out of stock for water3!","WARNING!", JOptionPane.WARNING_MESSAGE);
                        btn_water3.setEnabled(false);
                        return;
                    }
                    drink_pic = "D:\\Drinking_water_vending_machine_Theeranat\\src\\picture\\water3.png";
                    drink_value = Integer.parseInt(parts[1]);
                    drink_value--;
                    drink_price = 10;
                    total_price = gettotal_money;
                    new main(drink_name,drink_value,drink_pic,drink_price,total_price).setVisible(true);
                    this.dispose();
                }
            }
            br.close();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_water3ActionPerformed

    private void btn_water4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_water4ActionPerformed
        // TODO add your handling code here:
        try {
            FileInputStream fis = new FileInputStream("D:\\Drinking_water_vending_machine_Theeranat\\src\\drinking_water_vending_machine_theeranat\\drinks_data.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length >= 2 && parts[0].equals("water4")) {
                    drink_name = parts[0];
                    drink_value = Integer.parseInt(parts[1]);
                    if (drink_value == 0) {
                        JOptionPane.showMessageDialog(this, "Out of stock for water4!","WARNING!", JOptionPane.WARNING_MESSAGE);
                        btn_water4.setEnabled(false);
                        return;
                    }
                    drink_pic = "D:\\Drinking_water_vending_machine_Theeranat\\src\\picture\\water4.png";
                    drink_value = Integer.parseInt(parts[1]);
                    drink_value--;
                    drink_price = 10;
                    total_price = gettotal_money;
                    new main(drink_name,drink_value,drink_pic,drink_price,total_price).setVisible(true);
                    this.dispose();
                }
            }
            br.close();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_water4ActionPerformed

    private void btn_sponsorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sponsorActionPerformed
        // TODO add your handling code here:
        try {
            FileInputStream fis = new FileInputStream("D:\\Drinking_water_vending_machine_Theeranat\\src\\drinking_water_vending_machine_theeranat\\drinks_data.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length >= 2 && parts[0].equals("sponsor")) {
                    drink_name = parts[0];
                    drink_value = Integer.parseInt(parts[1]);
                    if (drink_value == 0) {
                        JOptionPane.showMessageDialog(this, "Out of stock for sponsor!","WARNING!", JOptionPane.WARNING_MESSAGE);
                        btn_sponsor.setEnabled(false);
                        return;
                    }
                    drink_pic = "D:\\Drinking_water_vending_machine_Theeranat\\src\\picture\\sponsor.png";
                    drink_value = Integer.parseInt(parts[1]);
                    drink_value--;
                    drink_price = 15;
                    total_price = gettotal_money;
                    new main(drink_name,drink_value,drink_pic,drink_price,total_price).setVisible(true);
                    this.dispose();
                }
            }
            br.close();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_sponsorActionPerformed

    private void btn_bigtea1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bigtea1ActionPerformed
        // TODO add your handling code here:
        try {
            FileInputStream fis = new FileInputStream("D:\\Drinking_water_vending_machine_Theeranat\\src\\drinking_water_vending_machine_theeranat\\drinks_data.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length >= 2 && parts[0].equals("bigtea1")) {
                    drink_name = parts[0];
                    drink_value = Integer.parseInt(parts[1]);
                    if (drink_value == 0) {
                        JOptionPane.showMessageDialog(this, "Out of stock for bigtea1!","WARNING!", JOptionPane.WARNING_MESSAGE);
                        btn_bigtea1.setEnabled(false);
                        return;
                    }
                    drink_pic = "D:\\Drinking_water_vending_machine_Theeranat\\src\\picture\\bigtea1.png";
                    drink_value = Integer.parseInt(parts[1]);
                    drink_value--;
                    drink_price = 12;
                    total_price = gettotal_money;
                    new main(drink_name,drink_value,drink_pic,drink_price,total_price).setVisible(true);
                    this.dispose();
                }
            }
            br.close();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_bigtea1ActionPerformed

    private void btn_bigtea2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bigtea2ActionPerformed
        // TODO add your handling code here:
        try {
            FileInputStream fis = new FileInputStream("D:\\Drinking_water_vending_machine_Theeranat\\src\\drinking_water_vending_machine_theeranat\\drinks_data.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length >= 2 && parts[0].equals("bigtea2")) {
                    drink_name = parts[0];
                    drink_value = Integer.parseInt(parts[1]);
                    if (drink_value == 0) {
                        JOptionPane.showMessageDialog(this, "Out of stock for bigtea2!","WARNING!", JOptionPane.WARNING_MESSAGE);
                        btn_bigtea2.setEnabled(false);
                        return;
                    }
                    drink_pic = "D:\\Drinking_water_vending_machine_Theeranat\\src\\picture\\bigtea2.png";
                    drink_value = Integer.parseInt(parts[1]);
                    drink_value--;
                    drink_price = 12;
                    total_price = gettotal_money;
                    new main(drink_name,drink_value,drink_pic,drink_price,total_price).setVisible(true);
                    this.dispose();
                }
            }
            br.close();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_bigtea2ActionPerformed

    private void btn_schweppes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_schweppes1ActionPerformed
        // TODO add your handling code here:
        try {
            FileInputStream fis = new FileInputStream("D:\\Drinking_water_vending_machine_Theeranat\\src\\drinking_water_vending_machine_theeranat\\drinks_data.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length >= 2 && parts[0].equals("schweppes1")) {
                    drink_name = parts[0];
                    drink_value = Integer.parseInt(parts[1]);
                    if (drink_value == 0) {
                        JOptionPane.showMessageDialog(this, "Out of stock for schweppes1!","WARNING!", JOptionPane.WARNING_MESSAGE);
                        btn_schweppes1.setEnabled(false);
                        return;
                    }
                    drink_pic = "D:\\Drinking_water_vending_machine_Theeranat\\src\\picture\\schweppes1.png";
                    drink_value = Integer.parseInt(parts[1]);
                    drink_value--;
                    drink_price = 13;
                    total_price = gettotal_money;
                    new main(drink_name,drink_value,drink_pic,drink_price,total_price).setVisible(true);
                    this.dispose();
                }
            }
            br.close();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_schweppes1ActionPerformed

    private void btn_singhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_singhaActionPerformed
        // TODO add your handling code here:
        try {
            FileInputStream fis = new FileInputStream("D:\\Drinking_water_vending_machine_Theeranat\\src\\drinking_water_vending_machine_theeranat\\drinks_data.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length >= 2 && parts[0].equals("singha")) {
                    drink_name = parts[0];
                    drink_value = Integer.parseInt(parts[1]);
                    if (drink_value == 0) {
                        JOptionPane.showMessageDialog(this, "Out of stock for singha!","WARNING!", JOptionPane.WARNING_MESSAGE);
                        btn_singha.setEnabled(false);
                        return;
                    }
                    drink_pic = "D:\\Drinking_water_vending_machine_Theeranat\\src\\picture\\singha.png";
                    drink_value = Integer.parseInt(parts[1]);
                    drink_value--;
                    drink_price = 17;
                    total_price = gettotal_money;
                    new main(drink_name,drink_value,drink_pic,drink_price,total_price).setVisible(true);
                    this.dispose();
                }
            }
            br.close();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_singhaActionPerformed

    private void btn_coconutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_coconutActionPerformed
        // TODO add your handling code here:
        try {
            FileInputStream fis = new FileInputStream("D:\\Drinking_water_vending_machine_Theeranat\\src\\drinking_water_vending_machine_theeranat\\drinks_data.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length >= 2 && parts[0].equals("coconut")) {
                    drink_name = parts[0];
                    drink_value = Integer.parseInt(parts[1]);
                    if (drink_value == 0) {
                        JOptionPane.showMessageDialog(this, "Out of stock for coconut!","WARNING!", JOptionPane.WARNING_MESSAGE);
                        btn_coconut.setEnabled(false);
                        return;
                    }
                    drink_pic = "D:\\Drinking_water_vending_machine_Theeranat\\src\\picture\\coconut.png";
                    drink_value = Integer.parseInt(parts[1]);
                    drink_value--;
                    drink_price = 12;
                    total_price = gettotal_money;
                    new main(drink_name,drink_value,drink_pic,drink_price,total_price).setVisible(true);
                    this.dispose();
                }
            }
            br.close();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_coconutActionPerformed

    private void btn_cvittorangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cvittorangeActionPerformed
        // TODO add your handling code here:
        try {
            FileInputStream fis = new FileInputStream("D:\\Drinking_water_vending_machine_Theeranat\\src\\drinking_water_vending_machine_theeranat\\drinks_data.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length >= 2 && parts[0].equals("cvittorange")) {
                    drink_name = parts[0];
                    drink_value = Integer.parseInt(parts[1]);
                    if (drink_value == 0) {
                        JOptionPane.showMessageDialog(this, "Out of stock for cvittorange!","WARNING!", JOptionPane.WARNING_MESSAGE);
                        btn_cvittorange.setEnabled(false);
                        return;
                    }
                    drink_pic = "D:\\Drinking_water_vending_machine_Theeranat\\src\\picture\\cvitt1.png";
                    drink_value = Integer.parseInt(parts[1]);
                    drink_value--;
                    drink_price = 17;
                    total_price = gettotal_money;
                    new main(drink_name,drink_value,drink_pic,drink_price,total_price).setVisible(true);
                    this.dispose();
                }
            }
            br.close();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_cvittorangeActionPerformed

    private void btn_cvittlemonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cvittlemonActionPerformed
        // TODO add your handling code here:
        try {
            FileInputStream fis = new FileInputStream("D:\\Drinking_water_vending_machine_Theeranat\\src\\drinking_water_vending_machine_theeranat\\drinks_data.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length >= 2 && parts[0].equals("cvittlemon")) {
                    drink_name = parts[0];
                    drink_value = Integer.parseInt(parts[1]);
                    if (drink_value == 0) {
                        JOptionPane.showMessageDialog(this, "Out of stock for cvittlemon!","WARNING!", JOptionPane.WARNING_MESSAGE);
                        btn_cvittlemon.setEnabled(false);
                        return;
                    }
                    drink_pic = "D:\\Drinking_water_vending_machine_Theeranat\\src\\picture\\cvitt2.png";
                    drink_value = Integer.parseInt(parts[1]);
                    drink_value--;
                    drink_price = 17;
                    total_price = gettotal_money;
                    new main(drink_name,drink_value,drink_pic,drink_price,total_price).setVisible(true);
                    this.dispose();
                }
            }
            br.close();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_cvittlemonActionPerformed

    private void btn_nescafeespressoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nescafeespressoActionPerformed
        // TODO add your handling code here:
        try {
            FileInputStream fis = new FileInputStream("D:\\Drinking_water_vending_machine_Theeranat\\src\\drinking_water_vending_machine_theeranat\\drinks_data.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length >= 2 && parts[0].equals("nescafeespresso")) {
                    drink_name = parts[0];
                    drink_value = Integer.parseInt(parts[1]);
                    if (drink_value == 0) {
                        JOptionPane.showMessageDialog(this, "Out of stock for nescafeespresso!","WARNING!", JOptionPane.WARNING_MESSAGE);
                        btn_nescafeespresso.setEnabled(false);
                        return;
                    }
                    drink_pic = "D:\\Drinking_water_vending_machine_Theeranat\\src\\picture\\nescafe1.png";
                    drink_value = Integer.parseInt(parts[1]);
                    drink_value--;
                    drink_price = 18;
                    total_price = gettotal_money;
                    new main(drink_name,drink_value,drink_pic,drink_price,total_price).setVisible(true);
                    this.dispose();
                }
            }
            br.close();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_nescafeespressoActionPerformed

    private void btn_nescafelatteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nescafelatteActionPerformed
        // TODO add your handling code here:
        try {
            FileInputStream fis = new FileInputStream("D:\\Drinking_water_vending_machine_Theeranat\\src\\drinking_water_vending_machine_theeranat\\drinks_data.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length >= 2 && parts[0].equals("nescafelatte")) {
                    drink_name = parts[0];
                    drink_value = Integer.parseInt(parts[1]);
                    if (drink_value == 0) {
                        JOptionPane.showMessageDialog(this, "Out of stock for nescafelatte!","WARNING!", JOptionPane.WARNING_MESSAGE);
                        btn_nescafelatte.setEnabled(false);
                        return;
                    }
                    drink_pic = "D:\\Drinking_water_vending_machine_Theeranat\\src\\picture\\nescafe2.png";
                    drink_value = Integer.parseInt(parts[1]);
                    drink_value--;
                    drink_price = 18;
                    total_price = gettotal_money;
                    new main(drink_name,drink_value,drink_pic,drink_price,total_price).setVisible(true);
                    this.dispose();
                }
            }
            br.close();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_nescafelatteActionPerformed

    private void btn_birdyrobustaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_birdyrobustaActionPerformed
        // TODO add your handling code here:
        try {
            FileInputStream fis = new FileInputStream("D:\\Drinking_water_vending_machine_Theeranat\\src\\drinking_water_vending_machine_theeranat\\drinks_data.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length >= 2 && parts[0].equals("birdyrobusta")) {
                    drink_name = parts[0];
                    drink_value = Integer.parseInt(parts[1]);
                    if (drink_value == 0) {
                        JOptionPane.showMessageDialog(this, "Out of stock for birdyrobusta!","WARNING!", JOptionPane.WARNING_MESSAGE);
                        btn_birdyrobusta.setEnabled(false);
                        return;
                    }
                    drink_pic = "D:\\Drinking_water_vending_machine_Theeranat\\src\\picture\\birdy1.png";
                    drink_value = Integer.parseInt(parts[1]);
                    drink_value--;
                    drink_price = 18;
                    total_price = gettotal_money;
                    new main(drink_name,drink_value,drink_pic,drink_price,total_price).setVisible(true);
                    this.dispose();
                }
            }
            br.close();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_birdyrobustaActionPerformed

    private void btn_schweppes2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_schweppes2ActionPerformed
        // TODO add your handling code here:
        try {
            FileInputStream fis = new FileInputStream("D:\\Drinking_water_vending_machine_Theeranat\\src\\drinking_water_vending_machine_theeranat\\drinks_data.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length >= 2 && parts[0].equals("schweppes2")) {
                    drink_name = parts[0];
                    drink_value = Integer.parseInt(parts[1]);
                    if (drink_value == 0) {
                        JOptionPane.showMessageDialog(this, "Out of stock for schweppes2!","WARNING!", JOptionPane.WARNING_MESSAGE);
                        btn_schweppes2.setEnabled(false);
                        return;
                    }
                    drink_pic = "D:\\Drinking_water_vending_machine_Theeranat\\src\\picture\\schweppes2.png";
                    drink_value = Integer.parseInt(parts[1]);
                    drink_value--;
                    drink_price = 13;
                    total_price = gettotal_money;
                    new main(drink_name,drink_value,drink_pic,drink_price,total_price).setVisible(true);
                    this.dispose();
                }
            }
            br.close();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_schweppes2ActionPerformed

    private void btn_cokenosugar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cokenosugar1ActionPerformed
        // TODO add your handling code here:
        try {
            FileInputStream fis = new FileInputStream("D:\\Drinking_water_vending_machine_Theeranat\\src\\drinking_water_vending_machine_theeranat\\drinks_data.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length >= 2 && parts[0].equals("cokenosugar1")) {
                    drink_name = parts[0];
                    drink_value = Integer.parseInt(parts[1]);
                    if (drink_value == 0) {
                        JOptionPane.showMessageDialog(this, "Out of stock for cokenosugar1!","WARNING!", JOptionPane.WARNING_MESSAGE);
                        btn_cokenosugar1.setEnabled(false);
                        return;
                    }
                    drink_pic = "D:\\Drinking_water_vending_machine_Theeranat\\src\\picture\\cokenosugar1.png";
                    drink_value = Integer.parseInt(parts[1]);
                    drink_value--;
                    drink_price = 14;
                    total_price = gettotal_money;
                    new main(drink_name,drink_value,drink_pic,drink_price,total_price).setVisible(true);
                    this.dispose();
                }
            }
            br.close();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_cokenosugar1ActionPerformed

    private void btn_cokenosugar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cokenosugar2ActionPerformed
        // TODO add your handling code here:
        try {
            FileInputStream fis = new FileInputStream("D:\\Drinking_water_vending_machine_Theeranat\\src\\drinking_water_vending_machine_theeranat\\drinks_data.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length >= 2 && parts[0].equals("cokenosugar2")) {
                    drink_name = parts[0];
                    drink_value = Integer.parseInt(parts[1]);
                    if (drink_value == 0) {
                        JOptionPane.showMessageDialog(this, "Out of stock for cokenosugar2!","WARNING!", JOptionPane.WARNING_MESSAGE);
                        btn_cokenosugar2.setEnabled(false);
                        return;
                    }
                    drink_pic = "D:\\Drinking_water_vending_machine_Theeranat\\src\\picture\\cokenosugar2.png";
                    drink_value = Integer.parseInt(parts[1]);
                    drink_value--;
                    drink_price = 14;
                    total_price = gettotal_money;
                    new main(drink_name,drink_value,drink_pic,drink_price,total_price).setVisible(true);
                    this.dispose();
                }
            }
            br.close();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_cokenosugar2ActionPerformed

    private void btn_cvittpeachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cvittpeachActionPerformed
        // TODO add your handling code here:
        try {
            FileInputStream fis = new FileInputStream("D:\\Drinking_water_vending_machine_Theeranat\\src\\drinking_water_vending_machine_theeranat\\drinks_data.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length >= 2 && parts[0].equals("cvittpeach")) {
                    drink_name = parts[0];
                    drink_value = Integer.parseInt(parts[1]);
                    if (drink_value == 0) {
                        JOptionPane.showMessageDialog(this, "Out of stock for cvittpeach!","WARNING!", JOptionPane.WARNING_MESSAGE);
                        btn_cvittpeach.setEnabled(false);
                        return;
                    }
                    drink_pic = "D:\\Drinking_water_vending_machine_Theeranat\\src\\picture\\cvitt3.png";
                    drink_value = Integer.parseInt(parts[1]);
                    drink_value--;
                    drink_price = 17;
                    total_price = gettotal_money;
                    new main(drink_name,drink_value,drink_pic,drink_price,total_price).setVisible(true);
                    this.dispose();
                }
            }
            br.close();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_cvittpeachActionPerformed

    private void btn_grassjellyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_grassjellyActionPerformed
        // TODO add your handling code here:
        try {
            FileInputStream fis = new FileInputStream("D:\\Drinking_water_vending_machine_Theeranat\\src\\drinking_water_vending_machine_theeranat\\drinks_data.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length >= 2 && parts[0].equals("grassjelly")) {
                    drink_name = parts[0];
                    drink_value = Integer.parseInt(parts[1]);
                    if (drink_value == 0) {
                        JOptionPane.showMessageDialog(this, "Out of stock for grassjelly!","WARNING!", JOptionPane.WARNING_MESSAGE);
                        btn_grassjelly.setEnabled(false);
                        return;
                    }
                    drink_pic = "D:\\Drinking_water_vending_machine_Theeranat\\src\\picture\\grassjelly.png";
                    drink_value = Integer.parseInt(parts[1]);
                    drink_value--;
                    drink_price = 16;
                    total_price = gettotal_money;
                    new main(drink_name,drink_value,drink_pic,drink_price,total_price).setVisible(true);
                    this.dispose();
                }
            }
            br.close();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_grassjellyActionPerformed

    private void btn_cokeoriginal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cokeoriginal1ActionPerformed
        // TODO add your handling code here:
        try {
            FileInputStream fis = new FileInputStream("D:\\Drinking_water_vending_machine_Theeranat\\src\\drinking_water_vending_machine_theeranat\\drinks_data.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length >= 2 && parts[0].equals("cokeoriginal1")) {
                    drink_name = parts[0];
                    drink_value = Integer.parseInt(parts[1]);
                    if (drink_value == 0) {
                        JOptionPane.showMessageDialog(this, "Out of stock for cokeoriginal1!","WARNING!", JOptionPane.WARNING_MESSAGE);
                        btn_cokeoriginal1.setEnabled(false);
                        return;
                    }
                    drink_pic = "D:\\Drinking_water_vending_machine_Theeranat\\src\\picture\\cokeoriginal1.png";
                    drink_value = Integer.parseInt(parts[1]);
                    drink_value--;
                    drink_price = 14;
                    total_price = gettotal_money;
                    new main(drink_name,drink_value,drink_pic,drink_price,total_price).setVisible(true);
                    this.dispose();
                }
            }
            br.close();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_cokeoriginal1ActionPerformed

    private void btn_cokeoriginal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cokeoriginal2ActionPerformed
        // TODO add your handling code here:
        try {
            FileInputStream fis = new FileInputStream("D:\\Drinking_water_vending_machine_Theeranat\\src\\drinking_water_vending_machine_theeranat\\drinks_data.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length >= 2 && parts[0].equals("cokeoriginal2")) {
                    drink_name = parts[0];
                    drink_value = Integer.parseInt(parts[1]);
                    if (drink_value == 0) {
                        JOptionPane.showMessageDialog(this, "Out of stock for cokeoriginal2!","WARNING!", JOptionPane.WARNING_MESSAGE);
                        btn_cokeoriginal2.setEnabled(false);
                        return;
                    }
                    drink_pic = "D:\\Drinking_water_vending_machine_Theeranat\\src\\picture\\cokeoriginal2.png";
                    drink_value = Integer.parseInt(parts[1]);
                    drink_value--;
                    drink_price = 14;
                    total_price = gettotal_money;
                    new main(drink_name,drink_value,drink_pic,drink_price,total_price).setVisible(true);
                    this.dispose();
                }
            }
            br.close();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_cokeoriginal2ActionPerformed

    private void btn_pepsi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pepsi1ActionPerformed
        // TODO add your handling code here:
        try {
            FileInputStream fis = new FileInputStream("D:\\Drinking_water_vending_machine_Theeranat\\src\\drinking_water_vending_machine_theeranat\\drinks_data.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length >= 2 && parts[0].equals("pepsi1")) {
                    drink_name = parts[0];
                    drink_value = Integer.parseInt(parts[1]);
                    if (drink_value == 0) {
                        JOptionPane.showMessageDialog(this, "Out of stock for pepsi1!","WARNING!", JOptionPane.WARNING_MESSAGE);
                        btn_pepsi1.setEnabled(false);
                        return;
                    }
                    drink_pic = "D:\\Drinking_water_vending_machine_Theeranat\\src\\picture\\pepsi1.png";
                    drink_value = Integer.parseInt(parts[1]);
                    drink_value--;
                    drink_price = 14;
                    total_price = gettotal_money;
                    new main(drink_name,drink_value,drink_pic,drink_price,total_price).setVisible(true);
                    this.dispose();
                }
            }
            br.close();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_pepsi1ActionPerformed

    private void btn_pepsi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pepsi2ActionPerformed
        // TODO add your handling code here:
        try {
            FileInputStream fis = new FileInputStream("D:\\Drinking_water_vending_machine_Theeranat\\src\\drinking_water_vending_machine_theeranat\\drinks_data.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length >= 2 && parts[0].equals("pepsi2")) {
                    drink_name = parts[0];
                    drink_value = Integer.parseInt(parts[1]);
                    if (drink_value == 0) {
                        JOptionPane.showMessageDialog(this, "Out of stock for pepsi2!","WARNING!", JOptionPane.WARNING_MESSAGE);
                        btn_pepsi2.setEnabled(false);
                        return;
                    }
                    drink_pic = "D:\\Drinking_water_vending_machine_Theeranat\\src\\picture\\pepsi2.png";
                    drink_value = Integer.parseInt(parts[1]);
                    drink_value--;
                    drink_price = 14;
                    total_price = gettotal_money;
                    new main(drink_name,drink_value,drink_pic,drink_price,total_price).setVisible(true);
                    this.dispose();
                }
            }
            br.close();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_pepsi2ActionPerformed

    private void btn_m150_y1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_m150_y1ActionPerformed
        // TODO add your handling code here:
        try {
            FileInputStream fis = new FileInputStream("D:\\Drinking_water_vending_machine_Theeranat\\src\\drinking_water_vending_machine_theeranat\\drinks_data.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length >= 2 && parts[0].equals("m150_y1")) {
                    drink_name = parts[0];
                    drink_value = Integer.parseInt(parts[1]);
                    if (drink_value == 0) {
                        JOptionPane.showMessageDialog(this, "Out of stock for m150_y1!","WARNING!", JOptionPane.WARNING_MESSAGE);
                        btn_m150_y1.setEnabled(false);
                        return;
                    }
                    drink_pic = "D:\\Drinking_water_vending_machine_Theeranat\\src\\picture\\m150y1.png";
                    drink_value = Integer.parseInt(parts[1]);
                    drink_value--;
                    drink_price = 13;
                    total_price = gettotal_money;
                    new main(drink_name,drink_value,drink_pic,drink_price,total_price).setVisible(true);
                    this.dispose();
                }
            }
            br.close();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_m150_y1ActionPerformed

    private void btn_m150_y2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_m150_y2ActionPerformed
        // TODO add your handling code here:
        try {
            FileInputStream fis = new FileInputStream("D:\\Drinking_water_vending_machine_Theeranat\\src\\drinking_water_vending_machine_theeranat\\drinks_data.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length >= 2 && parts[0].equals("m150_y2")) {
                    drink_name = parts[0];
                    drink_value = Integer.parseInt(parts[1]);
                    if (drink_value == 0) {
                        JOptionPane.showMessageDialog(this, "Out of stock for m150_y2!","WARNING!", JOptionPane.WARNING_MESSAGE);
                        btn_m150_y2.setEnabled(false);
                        return;
                    }
                    drink_pic = "D:\\Drinking_water_vending_machine_Theeranat\\src\\picture\\m150y2.png";
                    drink_value = Integer.parseInt(parts[1]);
                    drink_value--;
                    drink_price = 13;
                    total_price = gettotal_money;
                    new main(drink_name,drink_value,drink_pic,drink_price,total_price).setVisible(true);
                    this.dispose();
                }
            }
            br.close();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_m150_y2ActionPerformed

    private void btn_m150_b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_m150_b1ActionPerformed
        // TODO add your handling code here:
        try {
            FileInputStream fis = new FileInputStream("D:\\Drinking_water_vending_machine_Theeranat\\src\\drinking_water_vending_machine_theeranat\\drinks_data.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length >= 2 && parts[0].equals("m150_b1")) {
                    drink_name = parts[0];
                    drink_value = Integer.parseInt(parts[1]);
                    if (drink_value == 0) {
                        JOptionPane.showMessageDialog(this, "Out of stock for m150_b1!","WARNING!", JOptionPane.WARNING_MESSAGE);
                        btn_m150_b1.setEnabled(false);
                        return;
                    }
                    drink_pic = "D:\\Drinking_water_vending_machine_Theeranat\\src\\picture\\m150b1.png";
                    drink_value = Integer.parseInt(parts[1]);
                    drink_value--;
                    drink_price = 11;
                    total_price = gettotal_money;
                    new main(drink_name,drink_value,drink_pic,drink_price,total_price).setVisible(true);
                    this.dispose();
                }
            }
            br.close();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_m150_b1ActionPerformed

    private void btn_m150_b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_m150_b2ActionPerformed
        // TODO add your handling code here:
        try {
            FileInputStream fis = new FileInputStream("D:\\Drinking_water_vending_machine_Theeranat\\src\\drinking_water_vending_machine_theeranat\\drinks_data.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length >= 2 && parts[0].equals("m150_b2")) {
                    drink_name = parts[0];
                    drink_value = Integer.parseInt(parts[1]);
                    if (drink_value == 0) {
                        JOptionPane.showMessageDialog(this, "Out of stock for m150_b2!","WARNING!", JOptionPane.WARNING_MESSAGE);
                        btn_m150_b2.setEnabled(false);
                        return;
                    }
                    drink_pic = "D:\\Drinking_water_vending_machine_Theeranat\\src\\picture\\m150b2.png";
                    drink_value = Integer.parseInt(parts[1]);
                    drink_value--;
                    drink_price = 11;
                    total_price = gettotal_money;
                    new main(drink_name,drink_value,drink_pic,drink_price,total_price).setVisible(true);
                    this.dispose();
                }
            }
            br.close();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_m150_b2ActionPerformed

    private void btn_carabao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_carabao1ActionPerformed
        // TODO add your handling code here:
        try {
            FileInputStream fis = new FileInputStream("D:\\Drinking_water_vending_machine_Theeranat\\src\\drinking_water_vending_machine_theeranat\\drinks_data.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length >= 2 && parts[0].equals("carabao1")) {
                    drink_name = parts[0];
                    drink_value = Integer.parseInt(parts[1]);
                    if (drink_value == 0) {
                        JOptionPane.showMessageDialog(this, "Out of stock for carabao1!","WARNING!", JOptionPane.WARNING_MESSAGE);
                        btn_carabao1.setEnabled(false);
                        return;
                    }
                    drink_pic = "D:\\Drinking_water_vending_machine_Theeranat\\src\\picture\\carabao1.png";
                    drink_value = Integer.parseInt(parts[1]);
                    drink_value--;
                    drink_price = 11;
                    total_price = gettotal_money;
                    new main(drink_name,drink_value,drink_pic,drink_price,total_price).setVisible(true);
                    this.dispose();
                }
            }
            br.close();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_carabao1ActionPerformed

    private void btn_carabao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_carabao2ActionPerformed
        // TODO add your handling code here:
        try {
            FileInputStream fis = new FileInputStream("D:\\Drinking_water_vending_machine_Theeranat\\src\\drinking_water_vending_machine_theeranat\\drinks_data.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length >= 2 && parts[0].equals("carabao2")) {
                    drink_name = parts[0];
                    drink_value = Integer.parseInt(parts[1]);
                    if (drink_value == 0) {
                        JOptionPane.showMessageDialog(this, "Out of stock for carabao2!","WARNING!", JOptionPane.WARNING_MESSAGE);
                        btn_carabao2.setEnabled(false);
                        return;
                    }
                    drink_pic = "D:\\Drinking_water_vending_machine_Theeranat\\src\\picture\\carabao2.png";
                    drink_value = Integer.parseInt(parts[1]);
                    drink_value--;
                    drink_price = 11;
                    total_price = gettotal_money;
                    new main(drink_name,drink_value,drink_pic,drink_price,total_price).setVisible(true);
                    this.dispose();
                }
            }
            br.close();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_carabao2ActionPerformed

    private void btn_volt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volt1ActionPerformed
        // TODO add your handling code here:
        try {
            FileInputStream fis = new FileInputStream("D:\\Drinking_water_vending_machine_Theeranat\\src\\drinking_water_vending_machine_theeranat\\drinks_data.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length >= 2 && parts[0].equals("volt1")) {
                    drink_name = parts[0];
                    drink_value = Integer.parseInt(parts[1]);
                    if (drink_value == 0) {
                        JOptionPane.showMessageDialog(this, "Out of stock for volt1!","WARNING!", JOptionPane.WARNING_MESSAGE);
                        btn_volt1.setEnabled(false);
                        return;
                    }
                    drink_pic = "D:\\Drinking_water_vending_machine_Theeranat\\src\\picture\\volt1.png";
                    drink_value = Integer.parseInt(parts[1]);
                    drink_value--;
                    drink_price = 10;
                    total_price = gettotal_money;
                    new main(drink_name,drink_value,drink_pic,drink_price,total_price).setVisible(true);
                    this.dispose();
                }
            }
            br.close();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_volt1ActionPerformed

    private void btn_volt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volt2ActionPerformed
        // TODO add your handling code here:
        try {
            FileInputStream fis = new FileInputStream("D:\\Drinking_water_vending_machine_Theeranat\\src\\drinking_water_vending_machine_theeranat\\drinks_data.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length >= 2 && parts[0].equals("volt2")) {
                    drink_name = parts[0];
                    drink_value = Integer.parseInt(parts[1]);
                    if (drink_value == 0) {
                        JOptionPane.showMessageDialog(this, "Out of stock for volt2!","WARNING!", JOptionPane.WARNING_MESSAGE);
                        btn_volt2.setEnabled(false);
                        return;
                    }
                    drink_pic = "D:\\Drinking_water_vending_machine_Theeranat\\src\\picture\\volt2.png";
                    drink_value = Integer.parseInt(parts[1]);
                    drink_value--;
                    drink_price = 10;
                    total_price = gettotal_money;
                    new main(drink_name,drink_value,drink_pic,drink_price,total_price).setVisible(true);
                    this.dispose();
                }
            }
            br.close();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_volt2ActionPerformed

    private void btn_mjoygrapeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mjoygrapeActionPerformed
        // TODO add your handling code here:
        try {
            FileInputStream fis = new FileInputStream("D:\\Drinking_water_vending_machine_Theeranat\\src\\drinking_water_vending_machine_theeranat\\drinks_data.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length >= 2 && parts[0].equals("mjoygrape")) {
                    drink_name = parts[0];
                    drink_value = Integer.parseInt(parts[1]);
                    if (drink_value == 0) {
                        JOptionPane.showMessageDialog(this, "Out of stock for mjoygrape!","WARNING!", JOptionPane.WARNING_MESSAGE);
                        btn_mjoygrape.setEnabled(false);
                        return;
                    }
                    drink_pic = "D:\\Drinking_water_vending_machine_Theeranat\\src\\picture\\mjoygrape.png";
                    drink_value = Integer.parseInt(parts[1]);
                    drink_value--;
                    drink_price = 12;
                    total_price = gettotal_money;
                    new main(drink_name,drink_value,drink_pic,drink_price,total_price).setVisible(true);
                    this.dispose();
                }
            }
            br.close();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_mjoygrapeActionPerformed

    private void btn_mjoylycheeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mjoylycheeActionPerformed
        // TODO add your handling code here:
        try {
            FileInputStream fis = new FileInputStream("D:\\Drinking_water_vending_machine_Theeranat\\src\\drinking_water_vending_machine_theeranat\\drinks_data.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length >= 2 && parts[0].equals("mjoylychee")) {
                    drink_name = parts[0];
                    drink_value = Integer.parseInt(parts[1]);
                    if (drink_value == 0) {
                        JOptionPane.showMessageDialog(this, "Out of stock for mjoylychee!","WARNING!", JOptionPane.WARNING_MESSAGE);
                        btn_mjoylychee.setEnabled(false);
                        return;
                    }
                    drink_pic = "D:\\Drinking_water_vending_machine_Theeranat\\src\\picture\\mjoylychee.png";
                    drink_value = Integer.parseInt(parts[1]);
                    drink_value--;
                    drink_price = 12;
                    total_price = gettotal_money;
                    new main(drink_name,drink_value,drink_pic,drink_price,total_price).setVisible(true);
                    this.dispose();
                }
            }
            br.close();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_mjoylycheeActionPerformed

    private void btn_birdyespressoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_birdyespressoActionPerformed
        // TODO add your handling code here:
        try {
            FileInputStream fis = new FileInputStream("D:\\Drinking_water_vending_machine_Theeranat\\src\\drinking_water_vending_machine_theeranat\\drinks_data.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length >= 2 && parts[0].equals("birdyespresso")) {
                    drink_name = parts[0];
                    drink_value = Integer.parseInt(parts[1]);
                    if (drink_value == 0) {
                        JOptionPane.showMessageDialog(this, "Out of stock for birdyespresso!","WARNING!", JOptionPane.WARNING_MESSAGE);
                        btn_birdyespresso.setEnabled(false);
                        return;
                    }
                    drink_pic = "D:\\Drinking_water_vending_machine_Theeranat\\src\\picture\\birdy2.png";
                    drink_value = Integer.parseInt(parts[1]);
                    drink_value--;
                    drink_price = 18;
                    total_price = gettotal_money;
                    new main(drink_name,drink_value,drink_pic,drink_price,total_price).setVisible(true);
                    this.dispose();
                }
            }
            br.close();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_birdyespressoActionPerformed

    private void btn_jellychakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_jellychakeActionPerformed
        // TODO add your handling code here:
        try {
            FileInputStream fis = new FileInputStream("D:\\Drinking_water_vending_machine_Theeranat\\src\\drinking_water_vending_machine_theeranat\\drinks_data.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length >= 2 && parts[0].equals("jellychake")) {
                    drink_name = parts[0];
                    drink_value = Integer.parseInt(parts[1]);
                    if (drink_value == 0) {
                        JOptionPane.showMessageDialog(this, "Out of stock for jellychake!","WARNING!", JOptionPane.WARNING_MESSAGE);
                        btn_jellychake.setEnabled(false);
                        return;
                    }
                    drink_pic = "D:\\Drinking_water_vending_machine_Theeranat\\src\\picture\\jellyshake.png";
                    drink_value = Integer.parseInt(parts[1]);
                    drink_value--;
                    drink_price = 12;
                    total_price = gettotal_money;
                    new main(drink_name,drink_value,drink_pic,drink_price,total_price).setVisible(true);
                    this.dispose();
                }
            }
            br.close();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_jellychakeActionPerformed

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
            java.util.logging.Logger.getLogger(drinks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(drinks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(drinks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(drinks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new drinks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_bigtea1;
    private javax.swing.JButton btn_bigtea2;
    private javax.swing.JButton btn_birdyespresso;
    private javax.swing.JButton btn_birdyrobusta;
    private javax.swing.JButton btn_carabao1;
    private javax.swing.JButton btn_carabao2;
    private javax.swing.JButton btn_coconut;
    private javax.swing.JButton btn_cokenosugar1;
    private javax.swing.JButton btn_cokenosugar2;
    private javax.swing.JButton btn_cokeoriginal1;
    private javax.swing.JButton btn_cokeoriginal2;
    private javax.swing.JButton btn_cvittlemon;
    private javax.swing.JButton btn_cvittorange;
    private javax.swing.JButton btn_cvittpeach;
    private javax.swing.JButton btn_grassjelly;
    private javax.swing.JButton btn_jellychake;
    private javax.swing.JButton btn_m150_b1;
    private javax.swing.JButton btn_m150_b2;
    private javax.swing.JButton btn_m150_y1;
    private javax.swing.JButton btn_m150_y2;
    private javax.swing.JButton btn_mjoygrape;
    private javax.swing.JButton btn_mjoylychee;
    private javax.swing.JButton btn_nescafeespresso;
    private javax.swing.JButton btn_nescafelatte;
    private javax.swing.JButton btn_pepsi1;
    private javax.swing.JButton btn_pepsi2;
    private javax.swing.JButton btn_schweppes1;
    private javax.swing.JButton btn_schweppes2;
    private javax.swing.JButton btn_singha;
    private javax.swing.JButton btn_sponsor;
    private javax.swing.JButton btn_volt1;
    private javax.swing.JButton btn_volt2;
    private javax.swing.JButton btn_water1;
    private javax.swing.JButton btn_water2;
    private javax.swing.JButton btn_water3;
    private javax.swing.JButton btn_water4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
