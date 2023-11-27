/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Robo_Zombie;

import com.mycompany.zz_proyecto1.A_imagen;
import com.mycompany.zz_proyecto1.FileManager;
import com.mycompany.zz_proyecto1.Personaje;
import java.awt.Color;
import static java.awt.Color.green;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Juan Jimenez
 */
public class JuegoGrafico extends javax.swing.JFrame {
    ArrayList<Personaje> lDefensas;
    ArrayList<Personaje> lZombie;
    ArrayList<ThreadPersonaje> zombies;
    ArrayList<ThreadPersonaje> defensas;
    ArrayList<Integer> PosX = new ArrayList<>(25);
    ArrayList<Integer> PosY = new ArrayList<>(25);
    int cantidadDefensas = 0;
    int coordeX =0;
    int coordeY =0;
    private Personaje personajeSeleccionado;
    Posiciones Registro;
    private boolean eventoActivo = true;
    private boolean eventoActivado = true;
    private boolean ValidaReliquia = true;
    int posdef=0;
    ThreadPartida CicloJuego;
    
    public JuegoGrafico(){
        posListas();
        Registro = new Posiciones();
        zombies = new ArrayList<ThreadPersonaje>();
        defensas = new ArrayList<ThreadPersonaje>();
        cargarSerializable(sacarTexto());//Tengo que llamar esta funcion dentro de la funcion de pasar a su respectiva clase
        
        initComponents();
        setZombies();
        setDefensas();
        nivelActual(); 
        setCamposNivel();
        
        CicloJuego = new ThreadPartida(this,lDefensas,lZombie);
    }
    public ArrayList<ThreadPersonaje> getDefensas() {
        return defensas;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        jPopupMenu4 = new javax.swing.JPopupMenu();
        pnlCuadriculaJuego = new A_imagen(cargaIm("cuadricula.jpg"));
        jScrollPane1 = new javax.swing.JScrollPane();
        txaMostarDatosPer = new javax.swing.JTextArea();
        lblInfoClickedPersonaje = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        lblPartidaZvH = new javax.swing.JLabel();
        lblDefensas = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblTituloNivel = new javax.swing.JLabel();
        lblNivelPartida = new javax.swing.JLabel();
        pnlZombiesPosibles = new javax.swing.JPanel();
        pnlsetDefensas = new javax.swing.JPanel();
        lblCamposDis = new javax.swing.JLabel();
        lblEspacios = new javax.swing.JLabel();
        lblError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Walking TEC");

        pnlCuadriculaJuego.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        pnlCuadriculaJuego.setMaximumSize(new java.awt.Dimension(625, 625));
        pnlCuadriculaJuego.setMinimumSize(new java.awt.Dimension(500, 500));
        pnlCuadriculaJuego.setPreferredSize(new java.awt.Dimension(625, 625));
        //cargaIm("cuadricula.jpg");
        pnlCuadriculaJuego.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlCuadriculaJuegoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlCuadriculaJuegoLayout = new javax.swing.GroupLayout(pnlCuadriculaJuego);
        pnlCuadriculaJuego.setLayout(pnlCuadriculaJuegoLayout);
        pnlCuadriculaJuegoLayout.setHorizontalGroup(
            pnlCuadriculaJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 621, Short.MAX_VALUE)
        );
        pnlCuadriculaJuegoLayout.setVerticalGroup(
            pnlCuadriculaJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 621, Short.MAX_VALUE)
        );

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txaMostarDatosPer.setEditable(false);
        txaMostarDatosPer.setColumns(20);
        txaMostarDatosPer.setRows(5);
        jScrollPane1.setViewportView(txaMostarDatosPer);

        lblInfoClickedPersonaje.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        lblInfoClickedPersonaje.setText("Informacion del personaje:");

        btnIniciar.setText("Iniciar");
        btnIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIniciarMouseClicked(evt);
            }
        });

        lblPartidaZvH.setFont(new java.awt.Font("Chiller", 3, 24)); // NOI18N
        lblPartidaZvH.setText("Bienvenido a The Walking TEC");

        lblDefensas.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        lblDefensas.setText("Defensas (0/20)");

        jLabel2.setText("Zombies");

        lblTituloNivel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblTituloNivel.setText("Nivel:");

        lblNivelPartida.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        lblNivelPartida.setText("0");

        pnlZombiesPosibles.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlZombiesPosibles.setLayout(new javax.swing.BoxLayout(pnlZombiesPosibles, javax.swing.BoxLayout.LINE_AXIS));

        pnlsetDefensas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlsetDefensas.setLayout(new javax.swing.BoxLayout(pnlsetDefensas, javax.swing.BoxLayout.LINE_AXIS));

        lblCamposDis.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        lblCamposDis.setText("Campos:");

        lblEspacios.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        lblEspacios.setText("20");

        lblError.setBackground(new java.awt.Color(255, 255, 255));
        lblError.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        lblError.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(pnlCuadriculaJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnIniciar)
                                .addGap(125, 125, 125)
                                .addComponent(lblPartidaZvH, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTituloNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(lblNivelPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCamposDis, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEspacios, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblDefensas, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel2))
                            .addComponent(pnlsetDefensas, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                            .addComponent(pnlZombiesPosibles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblInfoClickedPersonaje, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCuadriculaJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIniciar)
                    .addComponent(lblPartidaZvH, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTituloNivel)
                    .addComponent(lblCamposDis))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNivelPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEspacios))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblDefensas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlsetDefensas, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlZombiesPosibles, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(lblInfoClickedPersonaje, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarMouseClicked
        ValidaReliquia = buscarPersonajePorNombre("Reliquia");
        if (ValidaReliquia){
            CicloJuego.start();
            if (!eventoActivado) return;
            generarZombies();
            eventoActivo = false;
            eventoActivado = false;
            for (int i = 0; i < zombies.size(); i++) {
                ThreadPersonaje get = zombies.get(i);
                get.start();
            }
        for (int i = 0; i < defensas.size(); i++) {
            ThreadPersonaje get = defensas.get(i);
            get.start();
        }
        }else{
            lblError.setText("Se debe colocar primero la reliquia.");
        }
    }//GEN-LAST:event_btnIniciarMouseClicked

    private void pnlCuadriculaJuegoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCuadriculaJuegoMouseClicked
        if (!eventoActivo) return;
        if (personajeSeleccionado!=null){
            coordeX = evt.getX();
            coordeY = evt.getY();
            int x = (coordeX-(coordeX%25))/25;
            int y = (coordeY-(coordeY%25))/25;
            boolean nivelesPersonaje = buscarValidarNivel(personajeSeleccionado);//hacer q reciba el personaje  y verique
            System.out.println("Retorno del nivel: "+ nivelesPersonaje);
            System.out.println("--------------------------------------------------");
            boolean repetido = Registro.verificarPosicion(x, y); 
            System.out.println("Registro: " + repetido);
            boolean colocar = esCoordenadaPermitida(coordeX,coordeY);
            boolean estaReliq = buscarPersonajePorNombre(personajeSeleccionado.getNombre());
            if (nivelesPersonaje){
                if (!estaReliq){
                    if(personajeSeleccionado != null){
                        if (repetido){
                            if (colocar){
                                Registro.ocuparPosicion(x, y);
                                generarDefensas (posdef);
                            }
                            else System.out.println("No");
                        }
                    }else lblError.setText("Debes seleccionar primero una unidad a colocar.");
                }else{lblError.setText("No se puede colocar, ya hay una reliquia en juego.");}
            }            
        }else{lblError.setText("Debe seleccionar primero una defensa.");}
    }//GEN-LAST:event_pnlCuadriculaJuegoMouseClicked

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
            java.util.logging.Logger.getLogger(JuegoGrafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JuegoGrafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JuegoGrafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JuegoGrafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JuegoGrafico().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JPopupMenu jPopupMenu4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCamposDis;
    private javax.swing.JLabel lblDefensas;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblEspacios;
    private javax.swing.JLabel lblInfoClickedPersonaje;
    private javax.swing.JLabel lblNivelPartida;
    private javax.swing.JLabel lblPartidaZvH;
    private javax.swing.JLabel lblTituloNivel;
    private javax.swing.JPanel pnlCuadriculaJuego;
    private javax.swing.JPanel pnlZombiesPosibles;
    private javax.swing.JPanel pnlsetDefensas;
    private javax.swing.JTextArea txaMostarDatosPer;
    // End of variables declaration//GEN-END:variables
    
    public class Aaaaa extends JPanel{
        private BufferedImage imagendeFondo;
        public Aaaaa(BufferedImage backgroundImage){
        }
        @Override
        public void paintComponent (Graphics g){
            super.paintComponent(g);
            g.drawImage(imagendeFondo, 0, 0, getWidth(), getHeight(), this);
        }        
    }
    public BufferedImage cargaIm(String imagen){
        BufferedImage backgroundImage = null;
        try{
            backgroundImage = ImageIO.read(new File("src/main/java/images/"+imagen));
            Aaaaa backgroundPanel = new Aaaaa(backgroundImage);
            setContentPane(backgroundPanel);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return backgroundImage;
    }
    
    private String sacarTexto(){
        Temporal tm = new Temporal();
        return tm.getTexto();
    }
    
    public void cargarSerializable(String nomPartida){
        lDefensas = (ArrayList<Personaje>) FileManager.readObject(nomPartida+"=def.ser");
        lZombie = (ArrayList<Personaje>) FileManager.readObject(nomPartida+"=Zom.ser");
    }
        
    public void generarZombies(){
        int cont=0;
        ArrayList<Personaje> ejerZombie = crearZombiesRand();
        for (int i = 0; i < ejerZombie.size(); i++) {
            String imagen = ejerZombie.get(i).getImagenVidaMax();
            ImageIcon imagenIcon = new ImageIcon("src/main/java/images/"+imagen);
            Image imagenEscalada = imagenIcon.getImage().getScaledInstance(30, 25, Image.SCALE_SMOOTH);
            JLabel label =  new JLabel(new ImageIcon(imagenEscalada));
            label.setForeground(new java.awt.Color(255, 255, 255));
            label.setFont(new java.awt.Font("Helvetica Neue", 0, 10));
            label.setForeground(new java.awt.Color(255, 255, 255));
            label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            label.setOpaque(false);
            Personaje Zombie  = ejerZombie.get(i);
            Zombie.setPersonaje(label);
            ThreadPersonaje tp =  new ThreadPersonaje(Zombie, this,1,cont);
            zombies.add(tp);
            
            pnlCuadriculaJuego.add(label);
            generarPuntoAleatorio(label);
            label.setSize(30, 25);
            cont++;
            label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblClick(tp);
                }
            });
        }        
    }
    
    private void lblClick(ThreadPersonaje p) {
        String info = "";
        info = "Nombre: "+ p.personaje.getNombre()+"\nVida: "+p.personaje.getVida()+"\nNivel: "+p.personaje.getNivel()+"\nGolpes: "+p.personaje.getCantidad_golpes()+"\nID: "+p.id+"\nTipo: "+p.personaje.getTipo();
        txaMostarDatosPer.setText(info);
        }
    
    public void posListas(){//JLabel label
        for (int i = 0; i < 25; i++) {
            PosX.add(i);
            PosY.add(i);
        }
    }
       
    public void moverLabel(JLabel label, int x, int y) {
        boolean verifica = false;
        int objetivoX = x; 
        int objetivoY = y;

        // Obtener la posición actual del JLabel
        int xActual = (label.getX()/25);
        int yActual = (label.getY()/25);

        // Calcular las diferencias entre las coordenadas actuales y el objetivo
        int diferenciaX = objetivoX - xActual;
        int diferenciaY = objetivoY - yActual;

        // Calcular los nuevos valores de coordenadas
        int pasoX = (diferenciaX > 0) ? 1 : -1;
        int pasoY = (diferenciaY > 0) ? 1 : -1;

        if (Math.abs(diferenciaX) <= 1 && Math.abs(diferenciaY) <= 1) {
    //        label.setLocation(objetivoX, objetivoY);
//            System.out.println("No avanzar");
        } else {
            int nuevoX = xActual + pasoX;
            int nuevoY = yActual + pasoY;
            label.setLocation(nuevoX*25, nuevoY*25);
        }
    }
 
    public void generarPuntoAleatorio(JLabel label) {
        Random rand = new Random();
        int indiceY = rand.nextInt(PosY.size());
        int y = PosY.get(indiceY);
        int x;
        if (y == 0 || y == 1 || y == 2 || y == 22 || y == 23 || y == 24) {
            x = rand.nextInt(PosX.size());
        } else {
            int[] xValues = {0, 1, 2, 22, 23, 24};
            x = xValues[rand.nextInt(xValues.length)];
        }
        label.setLocation(x*25,y*25);
        System.out.println("(" + x + ", " + y + ")");
    }
    
    public int zombieMasPeque(){
        int cont = 1000;
        for (int i = 0; i<lZombie.size();i++){
            if (lZombie.get(i).getCampos()<cont)
                cont=lZombie.get(i).getCampos();
        }
        return cont;
    }
    
    public Personaje zombiePeque(){
        Personaje aa = new Personaje();
        int cont = 1000;
        for (int i = 0; i<lZombie.size();i++){
            if (lZombie.get(i).getCampos()<cont)
            cont=lZombie.get(i).getCampos();
        }
        return aa;
    }
    
    public ArrayList<Personaje> crearZombiesRand(){
        ArrayList<Personaje> ejerZombie = new ArrayList();
        ArrayList<Personaje> borrado = new ArrayList();
        
        int espacio = Integer.parseInt(lblEspacios.getText());
        int NumEjerZombie = 0;
        Random random = new Random();
        Personaje p = new Personaje();
        while (espacio >= NumEjerZombie){//Hacer aqui la validacion del zombie nivel
            p = lZombie.get(random.nextInt(lZombie.size()));
            if (p.getAparicion()<=Integer.parseInt(lblNivelPartida.getText())){
                try {
                   Constructor<? extends Personaje> constructor = p.getClass().getConstructor();
                   Personaje nuevaCopia = constructor.newInstance();
                    nuevaCopia.setvalues(p.getNombre(), p.getImagenVidaMax(), p.getImagenVidaBaja(), p.getVida(), p.getCantidad_golpes(), p.getNivel(), p.getCampos(), p.getAparicion(), p.getTipo(), p.getRango());
                    if (espacio>=(NumEjerZombie+p.getCampos())){
                        ejerZombie.add(nuevaCopia);
                        NumEjerZombie += nuevaCopia.getCampos();
                    }                    
                    System.out.println("Numero de zombies: " + NumEjerZombie);
               } catch (Exception e) {
                   e.printStackTrace();
               }
                if (espacio-NumEjerZombie < zombieMasPeque())
                    return ejerZombie;
            }
        }
        return ejerZombie;
    }    

    public void nivelActual(){
        String nivel = lDefensas.get(0).getTipo();
        lblNivelPartida.setText(nivel);
    }
    public void setCamposNivel(){
        int espacio = 20;
        espacio += (Integer.parseInt(lblNivelPartida.getText())*5);
        lblEspacios.setText(String.valueOf(espacio));
    }
    
    public void setDefensas(){
        pnlsetDefensas.setLayout(new BoxLayout(pnlsetDefensas, BoxLayout.Y_AXIS));
        for (int i = 1; i < lDefensas.size(); i++) {
            Personaje personaje = lDefensas.get(i);
            String imagen = personaje.getImagenVidaMax();
            ImageIcon imagenIcon = new ImageIcon("src/main/java/images/"+imagen);
            Image imagenEscalada = imagenIcon.getImage().getScaledInstance(30, 25, Image.SCALE_SMOOTH);
            JLabel DefLabel = new JLabel(new ImageIcon(imagenEscalada));
            DefLabel.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    personajeSeleccionado = personaje;
                }
            });
            pnlsetDefensas.add(DefLabel);
        }
    }
    
    public void generarDefensas (int pdf){
            int x = 0;
            int y = 0;
                int cant = cantidadDefensas;
                int suma = cant + personajeSeleccionado.getCampos();//Aqui debo hacer un nuevo construtor
                Personaje defensa = personajeSeleccionado;
                if (Integer.parseInt(lblEspacios.getText()) >= suma){//lblEspacios.getText()
                    try {
                        Constructor<? extends Personaje> constructor = defensa.getClass().getConstructor();
                           Personaje nuevaCopia = constructor.newInstance();
                           nuevaCopia.setvalues(defensa.getNombre(), defensa.getImagenVidaMax(), defensa.getImagenVidaBaja(), defensa.getVida(), defensa.getCantidad_golpes(), defensa.getNivel(), defensa.getCampos(), defensa.getAparicion(), defensa.getTipo(), defensa.getRango());

                        String imagen = personajeSeleccionado.getImagenVidaMax();
                        ImageIcon imagenIcon = new ImageIcon("src/main/java/images/"+imagen);
                        Image imagenEscalada = imagenIcon.getImage().getScaledInstance(30, 25, Image.SCALE_SMOOTH);
                        //crea el label
                        JLabel label =  new JLabel(new ImageIcon(imagenEscalada));
                        label.setForeground(new java.awt.Color(255, 255, 255));
                        label.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
                        label.setForeground(new java.awt.Color(255, 255, 255));
                        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                        label.setOpaque(false);

                        nuevaCopia.setPersonaje(label);
                        
                        ThreadPersonaje tp =  new ThreadPersonaje(nuevaCopia, this,2,pdf);
                        defensas.add(tp);
                        pnlCuadriculaJuego.add(label);
                        posdef++;
                        x=(coordeX-(coordeX%25));
                        y=(coordeY-(coordeY%25));
                        label.setLocation(x,y);
                        label.setSize(25, 25);
                        label.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                            lblClick(tp);
                            }
                        }); 
                        cantidadDefensas += personajeSeleccionado.getCampos();
                        lblDefensas.setText("Defensas ("+cantidadDefensas+"/"+lblEspacios.getText()+")");
                    } catch (Exception e) {
                       e.printStackTrace();
                    }
                }else{lblError.setText("No se puede colocar, no hay mas espacio.");
                }
                    
//            buscarPersonajePorNombre("Reliquia");
    }
    public boolean buscarPersonajePorNombre(String nombreBuscado) {
        if ("Reliquia".equals(nombreBuscado)){
            for (ThreadPersonaje tp : defensas) {
                if (tp.personaje.getNombre().equals("Reliquia")) {
                    return true; // Encontrado
                }
            }return false;
        }
        return false; // No encontrado
    }
    
    public boolean buscarValidarNivel(Personaje personajeSeleccionado) {
        if (personajeSeleccionado.getAparicion()<=Integer.parseInt(lblNivelPartida.getText())){
                return true; // Encontrado
        }
        return false; // No encontrado
    }
    
    public boolean hayComponenteEnPosicion(JPanel panel, int x, int y) {
        panel.revalidate(); 
        panel.repaint();
        Component[] componentes = panel.getComponents();
        int tamanoLabel = 25;

        for (Component componente : componentes) {
            if (componente instanceof JLabel) {
                int xComponente = componente.getX();
                int yComponente = componente.getY();

                // Verificar si hay intersección entre los labels
                if (x >= xComponente && x < xComponente + tamanoLabel &&
                    y >= yComponente && y < yComponente + tamanoLabel) {
//                if (x == xComponente && y == yComponente) {
                    lblError.setText("Ya está ocupada la posición seleccionada.");
                    System.out.println("NO ACEPTADO");
                    return false;
                }
            }
        }
        System.out.println("ACEPTADO");
        return true;
    }
    
    public boolean esCoordenadaPermitida(int xx, int yy) {
        int x = (xx-(xx%25))/25;
        int y = (yy-(yy%25))/25;
        System.out.println("X: "+xx);
        System.out.println("Y: "+yy);
        System.out.println("x: "+x);
        System.out.println("y: "+y);
        // Si y es uno de los valores específicos
        if (y == 0 || y == 1 || y == 2 || y == 3 || y == 21 || y == 22 || y == 23 || y == 24) {
            lblError.setText("Colocó una fuera del area de permitido.");
            return false; // x puede ser cualquiera de los 25 puntos
        } else {
            // Si y es diferente de los valores específicos, x debe ser 0, 1, 2, 22, 23, o 24
            int[] xValues = {0, 1, 2, 3, 21, 22, 23, 24};
            for (int valor : xValues) {
                if (x == valor) {
                    lblError.setText("Colocó una fuera del area de permitido.");
                    return false;
                }
            }
        }
        lblError.setText("Colocado correctamente!");
        return true;
    }

   public void setZombies(){
        pnlZombiesPosibles.setLayout(new BoxLayout(pnlZombiesPosibles, BoxLayout.Y_AXIS));
        for (int i = 0; i < lZombie.size(); i++) {
            Personaje personaje = lZombie.get(i);
            String imagen = personaje.getImagenVidaMax();
            ImageIcon imagenIcon = new ImageIcon("src/main/java/images/"+imagen);
            Image imagenEscalada = imagenIcon.getImage().getScaledInstance(30, 25, Image.SCALE_SMOOTH);
            JLabel AtaLabel = new JLabel(new ImageIcon(imagenEscalada));
            System.out.println("Nombre: "+personaje.getNombre()+" Nivel: "+personaje.getAparicion());
            pnlZombiesPosibles.add(AtaLabel);
        }
    }
    public void guardarPartidaYSubir() {
        Random rand = new Random();

        String partida = sacarTexto();
        ArrayList<Personaje> defdef = new ArrayList<>();
        ArrayList<Personaje> zomzom = new ArrayList<>();
        defdef = (ArrayList<Personaje>) FileManager.readObject(partida+"=def.ser");
        zomzom = (ArrayList<Personaje>) FileManager.readObject(partida+"=Zom.ser");


        if (zomzom != null && defdef != null){

            for (int i = 0; i < zomzom.size(); i++) {
               Personaje tmp = zomzom.get(i);

               // Incrementar el nivel
               tmp.setNivel(tmp.getNivel() + 1);

               // Calcular la mejora de vida (entre el 5% y 20%)
               double porcentajeMejoraVida = rand.nextDouble() * (0.15) + 0.05;
               int mejoraVida = (int) Math.ceil(tmp.getVida() * porcentajeMejoraVida);
               tmp.setVida(tmp.getVida() + mejoraVida);

               // Calcular la mejora de daño (entre el 5% y 20%)
               double porcentajeMejoraDanho = rand.nextDouble() * (0.15) + 0.05;
               int mejoraDanho = (int) Math.ceil(tmp.getCantidad_golpes() * porcentajeMejoraDanho);
               tmp.setCantidad_golpes(tmp.getCantidad_golpes() + mejoraDanho);
            }
             defdef.get(0).setTipo(String.valueOf(Integer.parseInt(defdef.get(0).getTipo())+1));

             for (int i = 1; i < defdef.size(); i++) {
                 Personaje tmp = defdef.get(i);

                 // Incrementar el nivel
                 tmp.setNivel(tmp.getNivel() + 1);

                 // Calcular la mejora de vida (entre el 5% y 20%)
                 double porcentajeMejoraVida = rand.nextDouble() * (0.15) + 0.05;
                 int mejoraVida = (int) Math.ceil(tmp.getVida() * porcentajeMejoraVida);
                 tmp.setVida(tmp.getVida() + mejoraVida);

                 // Calcular la mejora de daño (entre el 5% y 20%)
                 double porcentajeMejoraDanho = rand.nextDouble() * (0.15) + 0.05;
                 int mejoraDanho = (int) Math.ceil(tmp.getCantidad_golpes() * porcentajeMejoraDanho);
                 tmp.setCantidad_golpes(tmp.getCantidad_golpes() + mejoraDanho);
            }

        }
            // Sobrescribir los archivos existentes
            FileManager.writeObject(defdef, partida + "=def.ser");
            FileManager.writeObject(zomzom, partida + "=Zom.ser");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(JuegoGrafico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int getVidaReliquia() {
        for (ThreadPersonaje tp : defensas) {
            Personaje defensa = tp.personaje;
            if (defensa.getNombre().equals("Reliquia")) {
                return defensa.getVida();
            }
        }
        return 0; // Cambia esto según tu lógica.
    }
    public void guardarPartidazzz() {
            String partida = sacarTexto();
            ArrayList<Personaje> defdef = new ArrayList<>();
            ArrayList<Personaje> zomzom = new ArrayList<>();
            defdef = (ArrayList<Personaje>) FileManager.readObject(partida+"=def.ser");
            zomzom = (ArrayList<Personaje>) FileManager.readObject(partida+"=Zom.ser");


            // Sobrescribir los archivos existentes
            FileManager.writeObject(defdef, partida + "=def.ser");
            FileManager.writeObject(zomzom, partida + "=Zom.ser");
    }
    public boolean ZombiesMuertos(){

        int total = zombies.size();
        int contador = 0;

        for (int i = 0; i < zombies.size(); i ++ ){
            Personaje temp = zombies.get(i).personaje;
            if (temp.getVida() <= 0){
                contador += 1;
            }
        }
            return contador == total;
    }
    
    
    public String MostrarRegistrozzz(){
        
        String HistorialBatalla = "";
        
        for (int i = 0; i < defensas.size(); i++){
            
            Personaje p = defensas.get(i).personaje;
//            System.out.println("\n******************************\nRegistro de la defensa con el nombre " + p.getNombre() + " y el id " + defensas.get(i).id + "\n" + p.getRegistro() + "\n**************************\n");
            HistorialBatalla = HistorialBatalla + "\n******************************\nRegistro de la defensa con el nombre " + p.getNombre() + " y el id " + defensas.get(i).id + "\n" + p.getRegistro() + "\n**************************\n";
        }
        
        System.out.println("\n****************************************\n\nAHORA EL REGISTRO DE LOS ZOMBIES \n\n*****************************************\n");
        
        for (int i = 0; i < zombies.size(); i++){
            
            Personaje p = zombies.get(i).personaje;
//            System.out.println("\n******************************\nRegistro del Zombie con el nombre " + p.getNombre() + " y el id " + zombies.get(i).id + "\n" + p.getRegistro() + "\n**************************\n");
            HistorialBatalla = HistorialBatalla + "\n******************************\nRegistro del Zombie con el nombre " + p.getNombre() + " y el id " + zombies.get(i).id + "\n" + p.getRegistro() + "\n**************************\n";
 
        }        
        return HistorialBatalla;
    }
    
}