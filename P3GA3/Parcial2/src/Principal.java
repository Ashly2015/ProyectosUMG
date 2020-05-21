/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ranbr
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JInternalFrame;
public class Principal extends javax.swing.JFrame {

    private MantenimientoAlumno ventanaAlumno;
    private MantenimientoAula ventanaAula;
    private MantenimientoCarrera ventanaCarrera;
    private MantenimientoCurso ventanaCurso;
    private MantenimientoFacultad ventanaFacultad;
    private MantenimientoJornada ventanaJornada;
    private MantenimientoMaestro ventanaMaestro;
    private MantenimientoSeccion ventanaSeccion;
    private MantenimientoSede ventanaSede;
    private AsignacionCA ventanaAsignacion;
    private AsignacionCM ventanaAsignacionM;
    private Laboratorios ventanaLaboratorios;

    public static String BD = "jdbc:mysql://localhost/siu";

   
    public static String Usuario = "root";
    public static String Contraseña = "Polo.2015";

    

    /**
     * Creates new form Principal
     */
    
    
    public void CentrarVentanas(JInternalFrame internalFrame){
        
        int x = (ventanaP.getWidth( ) / 2)- internalFrame.getWidth() / 2;
        int y = (ventanaP.getHeight() / 2)- internalFrame.getHeight() / 2;
        
       if (internalFrame.isShowing () ){
           internalFrame.setLocation (x,  y);
       }
    
    else {
    ventanaP.add(internalFrame);
    internalFrame.setLocation(x,  y);
    internalFrame.show();
}
    }
    
    
    
    
   public static Connection getConeccion(){
        Connection cn = null;
        try{
            Class.forName(BD);
            cn=DriverManager.getConnection(Principal.BD, Principal.Usuario, Principal.Contraseña);
            
        }catch(Exception e){
            System.out.println(String.valueOf(e));}
        return cn;
        
         
    }

   
    public static ResultSet getTablaUsuarios(String Consulta){
        Connection cn = getConeccion();
        Statement st = null ;
        ResultSet datos=null;
       
        try{
            datos=st.executeQuery((Consulta));
        }catch(Exception e){ System.out.print(e.toString());}
        return datos;
    
    }
    
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        Timer tiempoDeAnuncio = new Timer();

        TimerTask task = new TimerTask() {
            int tiempo = 0;

            @Override
            public void run() {

                if (tiempo == 1) {
                    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo0.jpg")));
                   
                } else if (tiempo == 2) {
                    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo5.jpg")));
                 

                }
                else if (tiempo == 3) {
                    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo4.jpg")));
                     

                }
                else if (tiempo == 4) {
                    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/0.jpg")));
                      tiempo = 0;

                }

                tiempo++;
            }
        };
        tiempoDeAnuncio.schedule(task, 10, 4000);
    }
public void Panel(){
    ventanaP.removeAll();
       ventanaP.repaint();
       ventanaP.revalidate();
        
       ventanaP.repaint();
        ventanaP.revalidate();
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        ventanaP = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        Mfacultades = new javax.swing.JMenuItem();
        MMaestros = new javax.swing.JMenuItem();
        MAlumnos = new javax.swing.JMenuItem();
        MCarreras = new javax.swing.JMenuItem();
        MCursos = new javax.swing.JMenuItem();
        MSecciones = new javax.swing.JMenuItem();
        MSedes = new javax.swing.JMenuItem();
        MAulas = new javax.swing.JMenuItem();
        MJornadas = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jMenuItem3.setText("jMenuItem3");

        jMenuItem6.setText("jMenuItem6");

        jMenuItem7.setText("jMenuItem7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GRUPO 3 - SIU");
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });

        ventanaP.setBackground(new java.awt.Color(51, 51, 51));
        ventanaP.setName("Rachel Barrios 9959-18-649"); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/0.jpg"))); // NOI18N
        jLabel1.setFocusable(false);

        javax.swing.GroupLayout ventanaPLayout = new javax.swing.GroupLayout(ventanaP);
        ventanaP.setLayout(ventanaPLayout);
        ventanaPLayout.setHorizontalGroup(
            ventanaPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaPLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ventanaPLayout.setVerticalGroup(
            ventanaPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 728, Short.MAX_VALUE)
        );
        ventanaP.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenu8.setText("Bitacora Usuarios");

        jMenuItem4.setText("Usuarios");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem4);

        jMenuBar1.add(jMenu8);

        jMenu6.setText("Catalogos");

        Mfacultades.setText("Mantenimiento Facultades");
        Mfacultades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MfacultadesActionPerformed(evt);
            }
        });
        jMenu6.add(Mfacultades);

        MMaestros.setText("Mantenimiento Maestros");
        MMaestros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MMaestrosActionPerformed(evt);
            }
        });
        jMenu6.add(MMaestros);

        MAlumnos.setText("Mantenimiento Alumnos");
        MAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MAlumnosActionPerformed(evt);
            }
        });
        jMenu6.add(MAlumnos);

        MCarreras.setText("Mantenimiento Carreras");
        MCarreras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MCarrerasActionPerformed(evt);
            }
        });
        jMenu6.add(MCarreras);

        MCursos.setText("Mantenimiento Cursos");
        MCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MCursosActionPerformed(evt);
            }
        });
        jMenu6.add(MCursos);

        MSecciones.setText("Mantenimiento Secciones");
        MSecciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MSeccionesActionPerformed(evt);
            }
        });
        jMenu6.add(MSecciones);

        MSedes.setText("Mantenimiento Sedes");
        MSedes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MSedesActionPerformed(evt);
            }
        });
        jMenu6.add(MSedes);

        MAulas.setText("Mantenimiento Aulas");
        MAulas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MAulasActionPerformed(evt);
            }
        });
        jMenu6.add(MAulas);

        MJornadas.setText("Mantenimiento Jornada");
        MJornadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MJornadasActionPerformed(evt);
            }
        });
        jMenu6.add(MJornadas);

        jMenuBar1.add(jMenu6);

        jMenu5.setText("Informes");
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        jMenu4.setText("Procesos");

        jMenuItem13.setText("Asignacion cursos a Alumnos");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem13);

        jMenuItem1.setText("Asignacion cursos a Maestros");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuItem2.setText("Laboratorios");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("Herramientas");
        jMenuBar1.add(jMenu3);

        jMenu7.setText("Ayuda");
        jMenuBar1.add(jMenu7);

        jMenu2.setText("Salir");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ventanaP)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ventanaP)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void MAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MAlumnosActionPerformed
        ventanaAlumno = new MantenimientoAlumno();
         Panel();
        CentrarVentanas(ventanaAlumno);
        ventanaP.add(jLabel1);
// TODO add your handling code here:
    }//GEN-LAST:event_MAlumnosActionPerformed

    private void MfacultadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MfacultadesActionPerformed
        ventanaFacultad = new MantenimientoFacultad();
        Panel();
        CentrarVentanas(ventanaFacultad);
        ventanaP.add(jLabel1);
        
// TODO add your handling code here:
    }//GEN-LAST:event_MfacultadesActionPerformed

    private void MCarrerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MCarrerasActionPerformed
        ventanaCarrera = new MantenimientoCarrera();

        Panel();
        CentrarVentanas(ventanaCarrera);
        ventanaP.add(jLabel1);
        
// TODO add your handling code here:
    }//GEN-LAST:event_MCarrerasActionPerformed

    private void MCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MCursosActionPerformed
        ventanaCurso = new MantenimientoCurso();
       
        Panel();
         CentrarVentanas(ventanaCurso);
        ventanaP.add(jLabel1);
// TODO add your handling code here:
    }//GEN-LAST:event_MCursosActionPerformed

    private void MSeccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MSeccionesActionPerformed
        ventanaSeccion = new MantenimientoSeccion();
       
         Panel();
         CentrarVentanas(ventanaSeccion);
        ventanaP.add(jLabel1);
// TODO add your handling code here:
    }//GEN-LAST:event_MSeccionesActionPerformed

    private void MSedesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MSedesActionPerformed
        ventanaSede = new MantenimientoSede();
        
        
         Panel();
        CentrarVentanas(ventanaSede);
        ventanaP.add(jLabel1);
// TODO add your handling code here:
    }//GEN-LAST:event_MSedesActionPerformed

    private void MAulasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MAulasActionPerformed
        ventanaAula = new MantenimientoAula();
      
        
        Panel();
          CentrarVentanas(ventanaAula);
        ventanaP.add(jLabel1);
// TODO add your handling code here:
    }//GEN-LAST:event_MAulasActionPerformed

    private void MJornadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MJornadasActionPerformed
        ventanaJornada = new MantenimientoJornada();
       
         Panel();
          CentrarVentanas(ventanaJornada);
        ventanaP.add(jLabel1);
// TODO add your handling code here:
    }//GEN-LAST:event_MJornadasActionPerformed

    private void MMaestrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MMaestrosActionPerformed
        ventanaMaestro = new MantenimientoMaestro();
       
        Panel();
         CentrarVentanas(ventanaMaestro);
        ventanaP.add(jLabel1);
// TODO add your handling code here:
    }//GEN-LAST:event_MMaestrosActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        ventanaAsignacion = new AsignacionCA();
        Panel();
         CentrarVentanas(ventanaAsignacion);
        ventanaP.add(jLabel1);      // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:

        ventanaAsignacionM = new AsignacionCM();
        Panel();
        CentrarVentanas(ventanaAsignacionM);
        ventanaP.add(jLabel1);    
       
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        ventanaLaboratorios = new Laboratorios();
       
        
         Panel();
         CentrarVentanas(ventanaLaboratorios);
        ventanaP.add(jLabel1); 
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed

        

        ConsultaRegistro ventana = new ConsultaRegistro();
        Panel();
         //ventanaP.add(ventana);
        CentrarVentanas(ventana);
        ventanaP.add(jLabel1);  





// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowStateChanged

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu5ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MAlumnos;
    private javax.swing.JMenuItem MAulas;
    private javax.swing.JMenuItem MCarreras;
    private javax.swing.JMenuItem MCursos;
    private javax.swing.JMenuItem MJornadas;
    private javax.swing.JMenuItem MMaestros;
    private javax.swing.JMenuItem MSecciones;
    private javax.swing.JMenuItem MSedes;
    private javax.swing.JMenuItem Mfacultades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JDesktopPane ventanaP;
    // End of variables declaration//GEN-END:variables
}
