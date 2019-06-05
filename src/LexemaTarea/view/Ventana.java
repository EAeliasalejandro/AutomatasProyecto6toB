package LexemaTarea.view;

import LexemaTarea.controls.TablaSimbolos;
import LexemaTarea.controls.AnalisisLexico;
import LexemaTarea.controls.AnalisisSintactico;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Ventana extends javax.swing.JFrame {

    TablaSimbolos tablaSimb;
    AnalisisSintactico anaSinta;
    AnalisisLexico anaLexico;
    ArrayList<String> arregloLexemas = new ArrayList();
    ArrayList<Integer> arregloToken = new ArrayList();
////////////////////////////////////// SETTERS AND GETTERS /////////////////////////////////////////////

    public JTextArea getTxtaLexema() {
        return txtaLexema;
    }

    public void setTxtaLexema(JTextArea txtaLexema) {
        this.txtaLexema = txtaLexema;
    }

    public JTextArea getTxtaErrores() {
        return txtaErrores;
    }

    public void setTxtaErrores(JTextArea txtaErrores) {
        this.txtaErrores = txtaErrores;
    }

    public Ventana() {

        tablaSimb = new TablaSimbolos(this);
        anaLexico = new AnalisisLexico(this);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaLexema = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtaErrores = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        mItemAbrir = new javax.swing.JMenuItem();
        mItemCerrar = new javax.swing.JMenuItem();
        mItemSalir = new javax.swing.JMenuItem();
        menuAnalisis = new javax.swing.JMenu();
        mItemLexico = new javax.swing.JMenuItem();
        mitemSintactico = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mItemMostrarTabla = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();

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
        jScrollPane4.setViewportView(jTable1);

        jMenuItem1.setText("jMenuItem1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtaLexema.setColumns(20);
        txtaLexema.setRows(5);
        txtaLexema.setEnabled(false);
        jScrollPane1.setViewportView(txtaLexema);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 860, 460));

        txtaErrores.setColumns(20);
        txtaErrores.setRows(5);
        jScrollPane3.setViewportView(txtaErrores);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 780, 120));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 500, -1, -1));

        menuArchivo.setText("Archivo");

        mItemAbrir.setText("Abrir");
        mItemAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemAbrirActionPerformed(evt);
            }
        });
        menuArchivo.add(mItemAbrir);

        mItemCerrar.setText("Cerrar");
        mItemCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemCerrarActionPerformed(evt);
            }
        });
        menuArchivo.add(mItemCerrar);

        mItemSalir.setText("Salir");
        mItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemSalirActionPerformed(evt);
            }
        });
        menuArchivo.add(mItemSalir);

        jMenuBar1.add(menuArchivo);

        menuAnalisis.setText("Análisis");
        menuAnalisis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAnalisisActionPerformed(evt);
            }
        });

        mItemLexico.setText("Lexico");
        mItemLexico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemLexicoActionPerformed(evt);
            }
        });
        menuAnalisis.add(mItemLexico);

        mitemSintactico.setText("Sintactico");
        mitemSintactico.setEnabled(false);
        mitemSintactico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitemSintacticoActionPerformed(evt);
            }
        });
        menuAnalisis.add(mitemSintactico);

        jMenuBar1.add(menuAnalisis);

        jMenu3.setText("T.Simbolos");

        mItemMostrarTabla.setText("Mostrar");
        mItemMostrarTabla.setEnabled(false);
        mItemMostrarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemMostrarTablaActionPerformed(evt);
            }
        });
        jMenu3.add(mItemMostrarTabla);

        jMenuBar1.add(jMenu3);

        jMenu1.setText("Acerca de");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Creadores");
        jCheckBoxMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxMenuItem1MouseClicked(evt);
            }
        });
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

/////////////////////////////////////////////////Programación de componentes///////////////////////////////////7777   
    private void mItemAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemAbrirActionPerformed
        txtaLexema.setText("");
        txtaErrores.setText("");
        arregloLexemas.clear();

        String aux = "";
        String texto = "";
        try {
            //llamamos el metodo que permite cargar la ventana
            JFileChooser file = new JFileChooser();
            file.showOpenDialog(this);
            //abrimos el archivo seleccionado
            File abre = file.getSelectedFile();
            //recorremos el archivo, lo leemos para plasmarlo en el area de texto           
            if (abre != null) {
                FileReader archivos = new FileReader(abre);
                BufferedReader lee = new BufferedReader(archivos);
                while ((aux = lee.readLine()) != null) {
                    texto += aux + "\n";
                }
                lee.close();
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex + ""
                    + "\nNo se ha encontrado el archivo",
                    "ADVERTENCIA!!!", JOptionPane.WARNING_MESSAGE);
        }
        txtaLexema.setText(texto);
    }//GEN-LAST:event_mItemAbrirActionPerformed

    private void menuAnalisisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAnalisisActionPerformed

    }//GEN-LAST:event_menuAnalisisActionPerformed

    private void mItemLexicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemLexicoActionPerformed
        //anaLexico.imprimirContenido(arregloLexemas);
        tablaSimb.getAnalisisSintactico(anaLexico.getLexemas(arregloLexemas));
        mItemMostrarTabla.setEnabled(true);
        mitemSintactico.setEnabled(true);
    }//GEN-LAST:event_mItemLexicoActionPerformed

    private void mitemSintacticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitemSintacticoActionPerformed
        txtaLexema.setText("");
        txtaErrores.setText("");
        arregloToken = tablaSimb.clonarArregloToken(arregloToken);
        arregloLexemas = tablaSimb.clonarArregloLexema(arregloLexemas);//tengo que arreglar asi
        anaSinta = new AnalisisSintactico(arregloLexemas, arregloToken, this);
        anaSinta.programa();
    }//GEN-LAST:event_mitemSintacticoActionPerformed

    private void jCheckBoxMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1MouseClicked

    }//GEN-LAST:event_jCheckBoxMenuItem1MouseClicked

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        JOptionPane.showMessageDialog(null, "Programa creado por:\nElías Alejandro Ramírez Garcían\nEdgar Esahú Salas Espino");
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void mItemMostrarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemMostrarTablaActionPerformed
        tablaSimb.llenarTablaSintactica();
    }//GEN-LAST:event_mItemMostrarTablaActionPerformed

    private void mItemCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemCerrarActionPerformed
        txtaLexema.setText("");
        txtaErrores.setText("");
        arregloLexemas.clear();
        tablaSimb.LimpiarArreglos();
    }//GEN-LAST:event_mItemCerrarActionPerformed

    private void mItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mItemSalirActionPerformed

    /*public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenuItem mItemAbrir;
    private javax.swing.JMenuItem mItemCerrar;
    private javax.swing.JMenuItem mItemLexico;
    private javax.swing.JMenuItem mItemMostrarTabla;
    private javax.swing.JMenuItem mItemSalir;
    private javax.swing.JMenu menuAnalisis;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenuItem mitemSintactico;
    private javax.swing.JTextArea txtaErrores;
    private javax.swing.JTextArea txtaLexema;
    // End of variables declaration//GEN-END:variables

}
