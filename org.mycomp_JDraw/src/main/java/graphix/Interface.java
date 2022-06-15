package graphix;

import java.awt.Color;
import java.awt.Graphics;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;

public class Interface extends javax.swing.JFrame {

    static Graphics g;
    Color clr = Color.BLACK;
    static ArrayList<Figure> figuri = new ArrayList();
    ArrayList<Thr> threads = new ArrayList();
    Figure figura = null;
    Figure figuraSelectata = null;
    static Model model;
    static int wjPanel1, hjPanel1;

    public Interface() {
        initComponents();
        g = jPanel1.getGraphics();
        model = new Model();
        jTable1.setModel(model);
        jTable1.setAutoCreateRowSorter(true);
        wjPanel1 = jPanel1.getWidth();
        hjPanel1 = jPanel1.getHeight();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jColorChooser2 = new javax.swing.JColorChooser();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButtonS = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButtonSlv = new javax.swing.JButton();
        jButtonInc = new javax.swing.JButton();
        jButtonSlv2 = new javax.swing.JButton();
        jButtonInc2 = new javax.swing.JButton();
        jButtonSlv3 = new javax.swing.JButton();
        jButtonInc3 = new javax.swing.JButton();
        jToggleButtonC = new javax.swing.JToggleButton();
        jToggleButtonR = new javax.swing.JToggleButton();
        jToggleButtonL = new javax.swing.JToggleButton();
        jToggleButtonP = new javax.swing.JToggleButton();
        jButton2 = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jColorChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jColorChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 700));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 922, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButtonS.setText("Delete");
        jButtonS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Move");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Resize");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Filled");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("MOVE!!!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Stop");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1)
                            .addComponent(jButtonS))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jCheckBox1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton2)
                    .addComponent(jButtonS))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButtonSlv.setText("Salveaza");
        jButtonSlv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSlvActionPerformed(evt);
            }
        });

        jButtonInc.setText("Incarca");
        jButtonInc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncActionPerformed(evt);
            }
        });

        jButtonSlv2.setText("Salveaza");
        jButtonSlv2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSlv2ActionPerformed(evt);
            }
        });

        jButtonInc2.setText("Incarca");
        jButtonInc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInc2ActionPerformed(evt);
            }
        });

        jButtonSlv3.setText("Salveaza");
        jButtonSlv3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSlv3ActionPerformed(evt);
            }
        });

        jButtonInc3.setText("Incarca");
        jButtonInc3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInc3ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jToggleButtonC);
        jToggleButtonC.setText("Cerc");
        jToggleButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonCActionPerformed(evt);
            }
        });

        buttonGroup2.add(jToggleButtonR);
        jToggleButtonR.setText("Drept");
        jToggleButtonR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonRActionPerformed(evt);
            }
        });

        buttonGroup2.add(jToggleButtonL);
        jToggleButtonL.setText("Linie");
        jToggleButtonL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonLActionPerformed(evt);
            }
        });

        buttonGroup2.add(jToggleButtonP);
        jToggleButtonP.setText("Poli");
        jToggleButtonP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonPActionPerformed(evt);
            }
        });

        jButton2.setText("FG");
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonSlv)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonInc)
                        .addGap(41, 41, 41)
                        .addComponent(jButtonSlv2)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonInc2)
                        .addGap(50, 50, 50)
                        .addComponent(jButtonSlv3)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonInc3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jToggleButtonP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButtonC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButtonR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jToggleButtonL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 922, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButtonSlv3)
                                .addComponent(jButtonInc3))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButtonSlv)
                                .addComponent(jButtonInc)
                                .addComponent(jButtonSlv2)
                                .addComponent(jButtonInc2)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jToggleButtonC)
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButtonR)
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButtonL)
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButtonP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed

        int xv = evt.getX();
        int yv = evt.getY();
        if (figuraSelectata != null) {
            figuraSelectata.stergeMarcaj();
            figuraSelectata = null;
        }
        if (figura != null) {
            boolean continua = figura.adauga(xv, yv);
            figura.afiseaza();
            if (!continua) {
                figura.incheie();
                figuri.add(figura);
                buttonGroup2.clearSelection();
                figura = null;
            }
        } else if (jToggleButtonC.isSelected()) {
            figura = new Circle(xv, yv, 50, clr, jCheckBox1.isSelected());
            figura.afiseaza();
        } else if (jToggleButtonR.isSelected()) {
            figura = new Rectangle(xv, yv, 100, 50, clr, jCheckBox1.isSelected());
            figura.afiseaza();
        } else if (jToggleButtonL.isSelected()) {
            figura = new Line(xv, yv, clr, false);
            figura.afiseaza();
        } else if (jToggleButtonP.isSelected()) {
            figura = new Polygon(xv, yv, clr, false);
            figura.afiseaza();
        } else {
            for (Figure f : figuri) {
                if (f.aproape(xv, yv)) {
                    figuraSelectata = f;
                    jCheckBox1.setSelected(figuraSelectata.filled);
                }
            }
            if (figuraSelectata == null) {
                jCheckBox1.setSelected(false);
            }
        }

    }//GEN-LAST:event_jPanel1MousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        clr = JColorChooser.showDialog(this, "Culoare 1", Color.BLACK);
        if (figuraSelectata != null) {
            figuraSelectata.stergeMarcaj();
            figuraSelectata.c = clr;
            figuraSelectata.afiseazaMarcaj();

//            jButton2.setBorderPainted(false);
//            jButton2.setOpaque(true);
//            jButton2.setForeground(clr);
//            jButton2.setBackground(clr);   
//            jButton2.repaint();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    void redeseneaza() {
        for (Figure f : figuri) {
            f.afiseaza();
        }
    }

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int xm = evt.getX();
        int ym = evt.getY();
        if (figura != null) {
            if (jToggleButtonL.isSelected()) {
                figura.adauga(xm, ym);
                figura.afiseaza();
            } else {
                figura.redimensioneaza(xm, ym);
            }
        } else if (figuraSelectata != null) {
            if (jRadioButton1.isSelected()) {
                figuraSelectata.stergeMarcaj();
                figuraSelectata.muta(xm, ym);
                figuraSelectata.afiseazaMarcaj();
            } else {
                figuraSelectata.stergeMarcaj();
                figuraSelectata.redimensioneaza(xm, ym);
                figuraSelectata.afiseazaMarcaj();
            }
        }
        redeseneaza();
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
        int xm = evt.getX();
        int ym = evt.getY();
        
        for (Figure f : figuri) {
            if (f.aproape(xm, ym)) {
                f.afiseazaMarcaj();
            } else {
                if (figuraSelectata != f) {
                    f.stergeMarcaj();
                }
            }
        }
        redeseneaza();
        model.fireTableDataChanged();
    }//GEN-LAST:event_jPanel1MouseMoved

    private void jToggleButtonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonCActionPerformed

    }//GEN-LAST:event_jToggleButtonCActionPerformed

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased
        if (!jToggleButtonP.isSelected()) {
            if (figura != null) {
                figura.incheie();
                figuri.add(figura);
                figura = null;
                buttonGroup2.clearSelection();
            }
        }
        model.fireTableRowsInserted(figuri.size() - 1, figuri.size() - 1);
    }//GEN-LAST:event_jPanel1MouseReleased

    private void jButtonSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSActionPerformed
        if (figuraSelectata != null) {
            figuraSelectata.stergeMarcaj();
            figuraSelectata.sterge();
            figuri.remove(figuraSelectata);
            figuraSelectata = null;
            redeseneaza();
            model.fireTableDataChanged();
        }
    }//GEN-LAST:event_jButtonSActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jToggleButtonRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonRActionPerformed

    }//GEN-LAST:event_jToggleButtonRActionPerformed

    private void jToggleButtonLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonLActionPerformed

    }//GEN-LAST:event_jToggleButtonLActionPerformed

    private void jButtonSlvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSlvActionPerformed
        try {
            PrintStream ps = new PrintStream(new FileOutputStream("desen.txt"));
            for (Figure f : figuri) {
                f.salveaza(ps);
            }
            ps.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonSlvActionPerformed

    private void jButtonIncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncActionPerformed
        try {
            DataInputStream dis = new DataInputStream(new FileInputStream("desen.txt"));
            for (Figure f : figuri) {
                f.stergeMarcaj();
                f.sterge();
            }
            figuri.clear();
            int cod;
            Figure f = null;
            while (dis.available() > 0) {
                cod = Integer.parseInt(dis.readLine());
                switch (cod) {
                    case 0:
                        f = new Circle(dis);
                        break;
                    case 1:
                        f = new Rectangle(dis);
                        break;
                    case 2:
                        f = new Line(dis);
                        break;
                    case 3:
                        f = new Polygon(dis);
                        break;
                }
                figuri.add(f);
            }
            redeseneaza();
            dis.close();
            //model.fireTableDataChanged();
        } catch (Exception ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonIncActionPerformed

    private void jButtonSlv2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSlv2ActionPerformed
        try {
            PrintStream ps = new PrintStream(new FileOutputStream("desen2.txt"));
            for (Figure f : figuri) {
                f.salveaza2(ps);
            }
            ps.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonSlv2ActionPerformed

    private void jButtonInc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInc2ActionPerformed
        try {
            DataInputStream dis = new DataInputStream(new FileInputStream("desen2.txt"));
            for (Figure f : figuri) {
                f.sterge();
            }
            figuri.clear();
            int cod;
            Figure f = null;
            while (dis.available() > 0) {
                ArrayList<Integer> lineArray = new ArrayList();
                String[] lineString;
                lineString = dis.readLine().split(", ");
                for (String s : lineString) {
                    lineArray.add(Integer.parseInt(s));
                }
                cod = lineArray.get(0);
                lineArray.remove(0);
                switch (cod) {
                    case 0:
                        f = new Circle(lineArray);
                        break;
                    case 1:
                        f = new Rectangle(lineArray);
                        break;
                    case 2:
                        f = new Line(lineArray);
                        break;
                    case 3:
                        f = new Polygon(lineArray);
                        break;
                }
                figuri.add(f);

            }
            redeseneaza();
            dis.close();
            //model.fireTableDataChanged();
        } catch (Exception ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonInc2ActionPerformed

    private void jButtonSlv3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSlv3ActionPerformed
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("desen3.txt"));
            for (Figure f : figuri) {
                f.salveaza2(dos);
            }
            dos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonSlv3ActionPerformed

    private void jButtonInc3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInc3ActionPerformed
        try {
            DataInputStream dis = new DataInputStream(new FileInputStream("desen3.txt"));
            for (Figure f : figuri) {
                f.sterge();
            }
            figuri.clear();
            int cod;
            Figure f = null;
            while (dis.available() > 0) {
                cod = dis.readByte();
                switch (cod) {
                    case 0:
                        f = new Circle(dis, false);
                        break;
                    case 1:
                        f = new Rectangle(dis, false);
                        break;
                    case 2:
                        f = new Line(dis, false);
                        break;
                    case 3:
                        f = new Polygon(dis, false);
                        break;
                }
                figuri.add(f);
            }
            redeseneaza();
            dis.close();
            model.fireTableDataChanged();
        } catch (Exception ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonInc3ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (figuraSelectata != null) {
            figuraSelectata.sterge();
            figuraSelectata.filled = jCheckBox1.isSelected();
            figuraSelectata.afiseaza();
            figuraSelectata.afiseazaMarcaj();
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jToggleButtonPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButtonPActionPerformed

    private void jTable1Selection() {
        if (figuraSelectata != null) {
            figuraSelectata.stergeMarcaj();
        }
        figuraSelectata = figuri.get(jTable1.getSelectedRow());
        figuraSelectata.afiseazaMarcaj();
    }


    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        jTable1Selection();
    }//GEN-LAST:event_jTable1MousePressed

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        jTable1Selection();
    }//GEN-LAST:event_jTable1KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        for (Figure f : figuri) {
            Thr thread = new Thr(f);
            thread.start();
            threads.add(thread);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        for(Thread thread : threads){
//            thread.interrupt();
            thread.stop();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Interface.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonInc;
    private javax.swing.JButton jButtonInc2;
    private javax.swing.JButton jButtonInc3;
    private javax.swing.JButton jButtonS;
    private javax.swing.JButton jButtonSlv;
    private javax.swing.JButton jButtonSlv2;
    private javax.swing.JButton jButtonSlv3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JColorChooser jColorChooser2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jToggleButtonC;
    private javax.swing.JToggleButton jToggleButtonL;
    private javax.swing.JToggleButton jToggleButtonP;
    private javax.swing.JToggleButton jToggleButtonR;
    // End of variables declaration//GEN-END:variables
}
