package arbolBB;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 * Clase PanelFondo extiende JPanel y permite establecer una imagen de fondo.
 */
public class PanelFondo extends javax.swing.JPanel {

    private final String ruta;

    /**
     * Constructor de la clase PanelFondo.
     */
    public PanelFondo() {
        initComponents();
        this.setSize(933, 690);
        this.ruta = "";
    }

    /**
     * Sobrescribe el método paintComponent para dibujar la imagen de fondo.
     */
    @Override
    public void paintComponent(Graphics g) {
        Dimension tam = getSize();
        ImageIcon ImagenFondo = new ImageIcon(new ImageIcon(getClass().getResource(ruta)).getImage());
        g.drawImage(ImagenFondo.getImage(), 0, 0, tam.width, tam.height, null);
        setOpaque(false); 
        super.paintComponent(g); 
    }

    /**
     * Inicializa los componentes del panel.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        // Configura el diseño del panel
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 462, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 323, Short.MAX_VALUE)
        );
    }
}

