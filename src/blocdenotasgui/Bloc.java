/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blocdenotasgui;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.Principal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author pablo
 */
public class Bloc extends javax.swing.JFrame {

    private String ruta;
    private String archivo;

    private  String getRuta() {
        return ruta;
    }

    private  void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public  String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }
    
    
    @Override
    public void setTitle(String title) {
        super.setTitle(title); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Creates new form Bloc
     */
    public Bloc() {
        this.setTitle("Sin título: Bloc de notas");
        initComponents();
        setLocationRelativeTo(null); 
        addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent we) {
            salir();
        }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        nuevo = new javax.swing.JMenuItem();
        ventanaNueva = new javax.swing.JMenuItem();
        abrir = new javax.swing.JMenuItem();
        guardar = new javax.swing.JMenuItem();
        guardarComo = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        salir = new javax.swing.JMenuItem();
        edicion = new javax.swing.JMenu();
        cortar = new javax.swing.JMenuItem();
        copiar = new javax.swing.JMenuItem();
        pegar = new javax.swing.JMenuItem();
        eliminar = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        seleccionarTodo = new javax.swing.JMenuItem();
        fechaYHora = new javax.swing.JMenuItem();
        ayuda = new javax.swing.JMenu();
        acercaDe = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        ta.setColumns(20);
        ta.setRows(5);
        jScrollPane1.setViewportView(ta);

        file.setMnemonic('A');
        file.setText("Archivo");
        file.setToolTipText("");
        file.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        nuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Nuevo.png"))); // NOI18N
        nuevo.setText("Nuevo");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });
        file.add(nuevo);

        ventanaNueva.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        ventanaNueva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/NuevaVentana.png"))); // NOI18N
        ventanaNueva.setText("Ventana nueva");
        ventanaNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventanaNuevaActionPerformed(evt);
            }
        });
        file.add(ventanaNueva);

        abrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        abrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Abrir.png"))); // NOI18N
        abrir.setText("Abrir");
        abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirActionPerformed(evt);
            }
        });
        file.add(abrir);

        guardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Guardar.png"))); // NOI18N
        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        file.add(guardar);

        guardarComo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        guardarComo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/GuardarComo.png"))); // NOI18N
        guardarComo.setText("Guardar como");
        guardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarComoActionPerformed(evt);
            }
        });
        file.add(guardarComo);
        file.add(jSeparator1);

        salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Salir.png"))); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        file.add(salir);

        jMenuBar1.add(file);

        edicion.setMnemonic('e');
        edicion.setText("Edición");
        edicion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cortar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        cortar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Cortar.png"))); // NOI18N
        cortar.setText("Cortar");
        cortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cortarActionPerformed(evt);
            }
        });
        edicion.add(cortar);

        copiar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        copiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Copiar.png"))); // NOI18N
        copiar.setText("Copiar");
        copiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copiarActionPerformed(evt);
            }
        });
        edicion.add(copiar);

        pegar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        pegar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/pegar.png"))); // NOI18N
        pegar.setText("Pegar");
        pegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pegarActionPerformed(evt);
            }
        });
        edicion.add(pegar);

        eliminar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Eliminar.png"))); // NOI18N
        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        edicion.add(eliminar);
        edicion.add(jSeparator3);

        seleccionarTodo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        seleccionarTodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/SeleccionarTodo.png"))); // NOI18N
        seleccionarTodo.setText("Seleccionar todo");
        seleccionarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarTodoActionPerformed(evt);
            }
        });
        edicion.add(seleccionarTodo);

        fechaYHora.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        fechaYHora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/FechayHora.png"))); // NOI18N
        fechaYHora.setText("Fecha y hora");
        fechaYHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaYHoraActionPerformed(evt);
            }
        });
        edicion.add(fechaYHora);

        jMenuBar1.add(edicion);

        ayuda.setMnemonic('y');
        ayuda.setText("Ayuda");
        ayuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        acercaDe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        acercaDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/AcercaDe.png"))); // NOI18N
        acercaDe.setText("Acerca de");
        acercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acercaDeActionPerformed(evt);
            }
        });
        ayuda.add(acercaDe);

        jMenuBar1.add(ayuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        System.out.println("Nuevo seleccionado");
        if(getRuta() == null && ta.getText().length() > 0){
            confirmaGuardarNuevo();
        }
        else try {
            if(compara(ta.getText())){
                confirmaGuardarNuevo();
            }
            else {
                ta.setText(" ");
                ta.replaceRange("", 0, 1);
                setTitle("Sin titulo: Bloc de notas");
                setRuta(null);
            }
        } catch (IOException ex) {
            Logger.getLogger(Bloc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_nuevoActionPerformed

        public  void confirmaGuardarNuevo() {
        int resultado;
        resultado = JOptionPane.showConfirmDialog(null,
            "Desea guardar los cambios de este documento?",
            "Confirmar", JOptionPane.YES_NO_CANCEL_OPTION);
        if (resultado == JOptionPane.YES_OPTION) {
            guardar(ta);     
            ta.setText(" ");
            ta.replaceRange("", 0, 1);
            setTitle("Sin titulo: Bloc de notas");
            setRuta(null);
        }   
        if(resultado == JOptionPane.NO_OPTION) {
            ta.setText(" ");
            ta.replaceRange("", 0, 1);
            setTitle("Sin titulo: Bloc de notas");
            setRuta(null);
        }
    }
        
        public  boolean compara(String text) throws IOException {
        boolean flag=false;
        if(getRuta() != null){
            List<String> fileContent = new ArrayList<>(Files.readAllLines(Paths.get(getRuta()), StandardCharsets.UTF_8));
            String arc="";
            for (int i = 0; i < fileContent.size(); i++) {
                arc += fileContent.get(i);
                if(i != fileContent.size()-1){
                    arc +="\n";
                    if(i == fileContent.size())
                    {
                        arc += "";
                    }
                }
            }
            if(text.equals(arc)) {
                flag = false;
            }
            else{
                flag = true;
            }
        }
        return flag;
    }
    
        
        public  void guardar(JTextArea ta) {
        System.out.println("Guardar Archivo!!");
        if(getRuta()==null){
            guardarComo();
        }
        else{
            FileWriter escritor = null;
            try {
            escritor = new FileWriter(getRuta());
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }      
        BufferedWriter buff = new BufferedWriter(escritor);
        try {
            buff.write(ta.getText());//RECOJE LO QUE HAY EN EL AREA DE TEXTO
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            buff.close();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
    }
    
    public  void guardarComo() {
        System.out.println("Guardando Archivo!!");
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        String rutaAux = getRuta();
        if (fileChooser.showSaveDialog(fileChooser) == JFileChooser.APPROVE_OPTION) {
            File archivo = fileChooser.getSelectedFile();
            setRuta(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println("Ruta: " + getRuta());
            if (getRuta() == null && rutaAux !=null) {
                setRuta(rutaAux);
            }
            FileWriter escritor = null;

            try {
                escritor = new FileWriter(archivo);
                escritor.write(ta.getText());
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            finally {
                try {
                    escritor.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
        try{
            File f = new File(getRuta());
            setArchivo(fileChooser.getName(f));
            setTitle(getArchivo() + " - Bloc de notas");
            System.out.println("La ruta es: "+getRuta());
            System.out.println("El archivo es: "+getArchivo());
        }
        catch(NullPointerException e){}
    }
        
    private void abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirActionPerformed
        Scanner entrada = null;
        Scanner aux = null;
        JFileChooser fileChooser = new JFileChooser();
        String rutaAux = getRuta();
        int lineas=0,linea=0;
        int resultado=0;
        try {
                    if(getRuta() == null && ta.getText().length() > 0){
                        resultado = JOptionPane.showConfirmDialog(null,
                        "Desea guardar los cambios de este documento?",
                        "Confirmar", JOptionPane.YES_NO_CANCEL_OPTION);
                        if (resultado == JOptionPane.YES_OPTION) {
                            guardar(ta);           
                        } 
                    }                    
                    else if(compara(ta.getText())) {
                    resultado = JOptionPane.showConfirmDialog(null,
                    "Desea guardar los cambios de este documento?",
                    "Confirmar", JOptionPane.YES_NO_CANCEL_OPTION);
                    if (resultado == JOptionPane.YES_OPTION) {
                        guardar(ta);           
                    }   
                }
                    if (resultado!= JOptionPane.CANCEL_OPTION && resultado != JOptionPane.CLOSED_OPTION){

            if (fileChooser.showOpenDialog(fileChooser) == JFileChooser.APPROVE_OPTION) {
            if(fileChooser.getSelectedFile().getAbsolutePath() != null)
            setRuta(fileChooser.getSelectedFile().getAbsolutePath());
            File f = new File(getRuta());  
            if (!f.exists()){
                JOptionPane.showMessageDialog(null, "No se encontro el archivo");
            }
            else{
                entrada = new Scanner(f);
                aux = new Scanner(f);
                ta.setText("");
                while (aux.hasNext()) {
                    aux.nextLine();  
                    lineas++;
                    
                }
                while (entrada.hasNext()) {
                    ta.append(entrada.nextLine());
                    if(linea!=lineas-1){
                    ta.append("\n");}
                    linea++;
                }
            }
        }}
        } catch (NullPointerException e) {
            System.out.println("No se ha seleccionado ningún fichero");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            if (entrada != null) {
                entrada.close();
            }
        }
        try{
            File f = new File(getRuta());
            if(f.exists()){
                setArchivo(fileChooser.getName(f));
                setTitle(getArchivo() + " - Bloc de notas");
                System.out.println("La ruta es: "+getRuta());
                System.out.println("El archivo es: "+getArchivo());
            }
            else{
                setRuta(rutaAux);
            }
        }
        catch(NullPointerException e){}
    }//GEN-LAST:event_abrirActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
         System.out.println("Guardar Archivo!!");
        if(getRuta()==null){
            guardarComo();
        }
        else{
            FileWriter escritor = null;
            try {
            escritor = new FileWriter(getRuta());
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }      
        BufferedWriter buff = new BufferedWriter(escritor);
        try {
            buff.write(ta.getText());//RECOJE LO QUE HAY EN EL AREA DE TEXTO
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            buff.close();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        }        
    }//GEN-LAST:event_guardarActionPerformed

    private void cortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cortarActionPerformed
        String seleccionado = ta.getSelectedText();
        if(seleccionado != null){
            StringSelection stringSelection = new StringSelection(seleccionado);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);
            eliminar();
        }
    }//GEN-LAST:event_cortarActionPerformed

    public void eliminar() {
       try{
        ta.replaceRange("", ta.getSelectionStart(), ta.getSelectionEnd());
       }
       catch(StringIndexOutOfBoundsException e){}
    }
    
    private void copiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copiarActionPerformed
        String seleccionado = ta.getSelectedText();
        if(seleccionado != null){
            
            StringSelection stringSelection = new StringSelection(seleccionado);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);
        }
    }//GEN-LAST:event_copiarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        salir();
    }//GEN-LAST:event_salirActionPerformed

    public void salir() {
        int resultado;        
        if(getRuta()!=null){
            try {
                if(compara(ta.getText())) {
                    resultado = JOptionPane.showConfirmDialog(null,
                            "Desea guardar los cambios de este documento?",
                            "Confirmar", JOptionPane.YES_NO_CANCEL_OPTION);
                    if (resultado == JOptionPane.YES_OPTION) {
                        guardar(ta);
                        setVisible (false);
                        dispose ();
                    }
                    if(resultado == JOptionPane.NO_OPTION) {
                        setVisible (false);
                        dispose ();
                    }
                }
                else {
                    setVisible (false);
                    dispose ();
                }
            } catch (IOException ex) {
                Logger.getLogger(Bloc.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        else if(getRuta() == null && ta.getText().length() > 0) {
            resultado = JOptionPane.showConfirmDialog(null,
            "Desea guardar los cambios de este documento?",
            "Confirmar", JOptionPane.YES_NO_CANCEL_OPTION);
            if (resultado == JOptionPane.YES_OPTION) {
                guardarComo();
                setVisible (false);
                dispose ();
            }
            if(resultado == JOptionPane.NO_OPTION) {
                setVisible (false);
                dispose ();
            }
        }
        else {
            setVisible (false);
            dispose ();
        }
    }
    
    private void acercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acercaDeActionPerformed
        JOptionPane.showMessageDialog(null, "Este programa fue hecho para la clase de Programación visual del\n"
                + "grupo ICO G-92 de UAEMex por\n\n"
                + "     - Ríos Díaz de León José Pablo\n"
                + "     - Jimenez Zempoalteca Uriel\n"
                + "     - Sanchez Cortes Aaron Israel\n"
                + "     - Paez Villafuerte Eithel Agustin\n\n");
    }//GEN-LAST:event_acercaDeActionPerformed

    private void ventanaNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventanaNuevaActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {                
                new Bloc().setVisible(true);
            }
        });
    }//GEN-LAST:event_ventanaNuevaActionPerformed

    private void pegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pegarActionPerformed
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        if(clipboard != null){
            clipboard.getContents(ta);
            String textopegado;
            try {
                eliminar();
                textopegado = (String) clipboard.getData(DataFlavor.stringFlavor);
                ta.insert(textopegado, ta.getCaretPosition());
            } catch (UnsupportedFlavorException | IOException ex) {
            } 
        } 
    }//GEN-LAST:event_pegarActionPerformed
 
    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_eliminarActionPerformed

    private void guardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarComoActionPerformed
        guardarComo();
    }//GEN-LAST:event_guardarComoActionPerformed

    private void seleccionarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarTodoActionPerformed
        ta.selectAll();
    }//GEN-LAST:event_seleccionarTodoActionPerformed

    private void fechaYHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaYHoraActionPerformed
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  
        eliminar();
        ta.insert(dtf.format(now), ta.getCaretPosition());  
    }//GEN-LAST:event_fechaYHoraActionPerformed

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
            java.util.logging.Logger.getLogger(Bloc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bloc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bloc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bloc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bloc().setVisible(true);               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem abrir;
    private javax.swing.JMenuItem acercaDe;
    private javax.swing.JMenu ayuda;
    private javax.swing.JMenuItem copiar;
    private javax.swing.JMenuItem cortar;
    private javax.swing.JMenu edicion;
    private javax.swing.JMenuItem eliminar;
    private javax.swing.JMenuItem fechaYHora;
    private javax.swing.JMenu file;
    private javax.swing.JMenuItem guardar;
    private javax.swing.JMenuItem guardarComo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenuItem nuevo;
    private javax.swing.JMenuItem pegar;
    private javax.swing.JMenuItem salir;
    private javax.swing.JMenuItem seleccionarTodo;
    private javax.swing.JTextArea ta;
    private javax.swing.JMenuItem ventanaNueva;
    // End of variables declaration//GEN-END:variables
}
