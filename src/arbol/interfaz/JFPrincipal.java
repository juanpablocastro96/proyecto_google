package arbol.interfaz;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import arbol.BinaryTreeSearch;
import arbol.Metodos;
import arbol.Url;

/**
 *
 * @author Juan Camilo U. Serna
 */
public class JFPrincipal extends javax.swing.JFrame {

    BinaryTreeSearch<String> arbol = new BinaryTreeSearch<String>();
    private Metodos manejo = new Metodos();
    private ActionListener al;
    private Timer tiempoBarra;
    private ActionListener progreso;
    private String URL;

    /**
     * Creates new form JFPrincipal
     */
    public JFPrincipal() {
        al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

            }
        };

        progreso = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };
        initComponents();
        llenarTabla();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtClaves = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtDireccionArchivo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        btnNAdd = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblArchivos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtPalabraAbus = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        btnNBuscar = new javax.swing.JLabel();
        btnAbrirUrl = new javax.swing.JLabel();
        btnNEliminar = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnNArbol = new javax.swing.JLabel();
        btnNEditar = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 79, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtClaves.setBackground(new java.awt.Color(0, 0, 0));
        txtClaves.setForeground(new java.awt.Color(255, 255, 255));
        txtClaves.setBorder(null);
        jPanel4.add(txtClaves, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 460, 20));

        jLabel1.setBackground(new java.awt.Color(204, 255, 102));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Direccion URL : ");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        txtDireccionArchivo.setBackground(new java.awt.Color(0, 0, 0));
        txtDireccionArchivo.setForeground(new java.awt.Color(255, 255, 255));
        txtDireccionArchivo.setBorder(null);
        txtDireccionArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionArchivoActionPerformed(evt);
            }
        });
        jPanel4.add(txtDireccionArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 460, 20));

        jLabel3.setBackground(new java.awt.Color(204, 255, 102));
        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Palabras clave : ");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 460, 10));
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 460, 30));

        btnNAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-add_filled.png"))); // NOI18N
        btnNAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNArbol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-add_filled.png")));
        btnNAdd.setMaximumSize(new java.awt.Dimension(120, 120));
        btnNAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNAddMouseClicked(evt);
            }
        });
        jPanel4.add(btnNAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 60, 60));

        jLabel7.setBackground(new java.awt.Color(204, 255, 102));
        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Agregar");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 650, 120));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblArchivos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Archivo", "Clave"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblArchivos);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 64, 560, 230));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Palabra clave");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        txtPalabraAbus.setBackground(new java.awt.Color(0, 0, 0));
        txtPalabraAbus.setForeground(new java.awt.Color(255, 255, 255));
        txtPalabraAbus.setBorder(null);
        jPanel5.add(txtPalabraAbus, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 290, 30));
        jPanel5.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 290, 10));

        btnNBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-search_filled.png")));
        btnNBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNBuscarMouseClicked(evt);
            }
        });
        jPanel5.add(btnNBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, -1, -1));

        btnAbrirUrl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-geography_filled.png")));
        btnAbrirUrl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAbrirUrlMouseClicked(evt);
            }
        });
        jPanel5.add(btnAbrirUrl, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));

        btnNEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-delete_folder_filled.png")));
        btnNEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNEliminarMouseClicked(evt);
            }
        });
        jPanel5.add(btnNEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, -1, -1));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Eliminar");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("ABB");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, -1, -1));

        btnNArbol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-flow_chart_filled.png")));
        btnNArbol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNArbolMouseClicked(evt);
            }
        });
        jPanel5.add(btnNArbol, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 50, 60));

        btnNEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/icons8-edit_file_filled.png")));
        btnNEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNEditarMouseClicked(evt);
            }
        });
        jPanel5.add(btnNEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, -1, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Editar");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 280, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 650, 300));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton1.setText("10000");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("100000");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("1000000");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2)
                        .addComponent(jButton3))
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 650, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void llenarTabla() {
        String titulos[] = {"URL", "Clave"};
        DefaultTableModel tm = new DefaultTableModel(null, titulos);
        if (!arbol.llenarTablaInicio().isEmpty()) {
            ArrayList<ArrayList<String>> arregloDeArreglo = arbol.llenarTablaInicio();
            for (int i = 0; i < arregloDeArreglo.size(); i++) {
                ArrayList<String> arregloPalabrasClave = arbol.arregloItems();
                String item = arregloPalabrasClave.get(i);
                ArrayList<String> datosFila = arregloDeArreglo.get(i);
                for (int j = 0; j < datosFila.size(); j++) {
                    tm.addRow(new Object[]{datosFila.get(j), item});
                    tblArchivos.setModel(tm);
                }
            }
        }
    }

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing


    }//GEN-LAST:event_formWindowClosing

    private void btnNEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNEliminarMouseClicked
        if (tblArchivos.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Por favor seleccione la URL que desea eliminar");
        } else {
            String item = tblArchivos.getValueAt(tblArchivos.getSelectedRow(), 1).toString();
            String nombreArchivo = tblArchivos.getValueAt(tblArchivos.getSelectedRow(), 0).toString();
            manejo.eliminarArchivo(item, nombreArchivo, arbol);
            JOptionPane.showMessageDialog(null, "Se ha eliminado su elemento");
            if (arbol.find(item) == null) {
                JOptionPane.showMessageDialog(null, "Item a quedado vacio");
            } else {
                manejo.llenarTablaConFiltro(tblArchivos, item, arbol);
            }
            llenarTabla();
        }
    }//GEN-LAST:event_btnNEliminarMouseClicked

    /**
     * metodo para editar palabra clave
     *
     * @param evt
     */
    private void btnNEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNEditarMouseClicked
        if (tblArchivos.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione el URL que desea editar");
        } else {
            String newItem = JOptionPane.showInputDialog(null, "Ingrese la nueva palabra");
            String item = tblArchivos.getValueAt(tblArchivos.getSelectedRow(), 1).toString();
            if (newItem.equals("")) {
                JOptionPane.showMessageDialog(null, "Se debe ingresar el nuevo nombre");
            } else {
                manejo.editarArchivo(item, newItem, tblArchivos.getSelectedRow(), arbol);

                JOptionPane.showMessageDialog(null, "La URL se ha editado");
            }
            llenarTabla();
        }
    }//GEN-LAST:event_btnNEditarMouseClicked

    /**
     * metodo para añadir URL con paralbra clave
     *
     * @param evt
     */
    private void btnNAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNAddMouseClicked
        if (txtDireccionArchivo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor seleccione un URL");
        } else if (txtClaves.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese las palabras"
                    + " con las que desea asociar la URL");
        } else {
            Long time = System.currentTimeMillis();

            String nombre = txtDireccionArchivo.getText().trim();
            String palabras = txtClaves.getText();
            manejo.insert(palabras, nombre, arbol);
            JOptionPane.showMessageDialog(null, "URL Agregado Con exito");
            txtClaves.setText("");
            txtDireccionArchivo.setText("");
            llenarTabla();
        }
    }//GEN-LAST:event_btnNAddMouseClicked

    /**
     * metodo para buscar la url
     *
     * @param evt
     */
    private void btnNBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNBuscarMouseClicked
        double time1 = System.currentTimeMillis();
        manejo.llenarTablaConFiltro(tblArchivos, txtPalabraAbus.getText().trim(), arbol);
        double time2 = System.currentTimeMillis();
        double time = time2 - time1;

        //JOptionPane.showMessageDialog(null, "Timepo de busqueda: "+ time);
    }//GEN-LAST:event_btnNBuscarMouseClicked

    /**
     * metodo vara ver el arbol binario de busqueda
     *
     * @param evt
     */
    private void btnNArbolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNArbolMouseClicked
        JFrameArbol panelArbol = new JFrameArbol(arbol);
    }//GEN-LAST:event_btnNArbolMouseClicked

    /**
     * metodo para arbir la url
     *
     * @param evt
     */
    private void btnAbrirUrlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAbrirUrlMouseClicked

        if (tblArchivos.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Por favor seleccione el URL que quiere abrir");
        } else {
            URL = tblArchivos.getValueAt(tblArchivos.getSelectedRow(), 0).toString();

            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                if (desktop.isSupported(Desktop.Action.BROWSE)) {
                    try {
                        if (URL.contains("https://")) {
                            desktop.browse(new URI(URL));
                        } else {
                            desktop.browse(new URI("https://" + URL+".com"));
                        }
                    } catch (URISyntaxException ex) {
                        Logger.getLogger(JFPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(JFPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }//GEN-LAST:event_btnAbrirUrlMouseClicked

    private void txtDireccionArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionArchivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionArchivoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        BinaryTreeSearch<Url> OneMillion = new BinaryTreeSearch<>();
        LinkedList<String> aux = new LinkedList<>();
        Url test = new Url("999999", aux);
        for (int i = 0; i < 1000000; i++) {
            Url url = new Url(String.valueOf(i), aux);
            OneMillion.insertAleatorios(url);
        }
        double start = System.currentTimeMillis();
        OneMillion.find(test);
        double fin = System.currentTimeMillis();
        jLabel15.setText(String.valueOf("Tiempo: " + (fin - start) / 1000 + "seg"));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        BinaryTreeSearch<Url> cienMil = new BinaryTreeSearch<>();
        LinkedList<String> aux = new LinkedList<>();
        Url test = new Url("99999", aux);
        for (int i = 0; i < 100000; i++) {
            Url url = new Url(String.valueOf(i), aux);
            cienMil.insertAleatorios(url);
        }
         double start = System.currentTimeMillis();
        cienMil.find(test);
        double fin = System.currentTimeMillis();
        jLabel14.setText(String.valueOf("Tiempo: " + (fin - start) / 1000 + "seg"));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        BinaryTreeSearch<Url> diezMil = new BinaryTreeSearch<>();
        LinkedList<String> aux = new LinkedList<>();
        Url test = new Url("9999", aux);
        for (int i = 0; i < 10000; i++) {
            Url url = new Url(String.valueOf(i), aux);
            diezMil.insertAleatorios(url);
        }
        double start = System.currentTimeMillis();
        diezMil.find(test);
        double fin = System.currentTimeMillis();
        jLabel13.setText(String.valueOf("Tiempo: " + (fin - start) / 1000 + "seg"));   // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Metodo que verifica si la carpeta donde se van a copiar los archivos ya
     * esta creada y le muestra un mensaje al usuario en un progressBar
     */
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
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAbrirUrl;
    private javax.swing.JLabel btnNAdd;
    private javax.swing.JLabel btnNArbol;
    private javax.swing.JLabel btnNBuscar;
    private javax.swing.JLabel btnNEditar;
    private javax.swing.JLabel btnNEliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable tblArchivos;
    private javax.swing.JTextField txtClaves;
    private javax.swing.JTextField txtDireccionArchivo;
    private javax.swing.JTextField txtPalabraAbus;
    // End of variables declaration//GEN-END:variables
}
