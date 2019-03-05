/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duppont;

//import java.awt.Graphics;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author Nizzy
 */
public class Tablero extends JFrame implements Atributos, MouseMotionListener {

    //JLabel Duppont = new JLabel("Duppont");
    int x = 515, y = 20;
    Barra barra = new Barra();
    //Constructor
    public Tablero() {
        Container contenedor = getContentPane();
        contenedor.setBackground(Color.black);
        contenedor.setLayout(new FlowLayout());
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setVisible(true);
        //setBackground(Color.yellow);
        setLocation(300, 100);
        setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/duppont/favicon.png")).getImage());
        setTitle("Duppont v1.1");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        addMouseMotionListener(this);
        //add(barra);
        /* etiqueta2 = new JLabel( "Etiqueta con texto e icono");
        Icon imagen = new ImageIcon( "favicon.png" );
        etiqueta2.setIcon(imagen);
        etiqueta2.setHorizontalTextPosition(SwingConstants.RIGHT);
        etiqueta2.setToolTipText( "Esta es la etiqueta2" );
        add( etiqueta2 );*/
        //add(Duppont);
    }

    @Override
    public void paint(Graphics g) {
        //Fondo
        barra.paint(g);
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        barra.mouseMoved(e);
    }

}
