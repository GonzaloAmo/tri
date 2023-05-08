package seleccionContAlbum;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
/**
 * Esta clase es para elegir las canciones que quieras escuchar de un album.
 * @author TRILOGY. Miembros: Adrian Leal Vacas, Gonzalo Amo Cano y Raul Senso Montojo.
 * @param contentPane CONTIENE TODOS LOS ATRIBUTOS DE LA PÁGINA.
 * @param panelContenedor CONTIENE TODOS LOS ATRIBUTOS PARA PODER INTERCAMBIAR PANELES SIN COMPLICACIÓN.
 * @param btnplay1 ES EL BOTÓN PARA REANUDAR O EMPEZAR A ESCUCHAR LA CANCION.
 * @param btnplay3 ES EL BOTÓN PARA REANUDAR O EMPEZAR A ESCUCHAR LA CANCION.
 * @param btnSalida CIERRA LA VENTANA.
 * @param btnPause2 ES EL BOTÓN PARA PAUSAR LA CANCION.
 * @param btnPause3 ES EL BOTÓN PARA PAUSAR LA CANCION.
 * @param btnPause1 ES EL BOTÓN PARA PAUSAR LA CANCION.
 * @param btnplay2 ES EL BOTÓN PARA REANUDAR O EMPEZAR A ESCUCHAR LA CANCION.
 * @param lblTxtDuracion2 TIENE LA DURACIÓN DE LA CANCIÓN.(ESTÉTICO)
 * @param lblTxtReproducciones3 TIENE LA CANTIDAD DE REPRODUCCIONES DE LA CANCIÓN.(ESTÉTICO)
 * @param lblTxtReproducciones2 TIENE LA CANTIDAD DE REPRODUCCIONES DE LA CANCIÓN.(ESTÉTICO)
 * @param lblTxtDuracion3 TIENE LA DURACIÓN DE LA CANCIÓN.(ESTÉTICO)
 * @param lblTxtDuracion1 TIENE LA DURACIÓN DE LA CANCIÓN.(ESTÉTICO)
 * @param lblTxtReproducciones1 TIENE LA CANTIDAD DE REPRODUCCIONES DE LA CANCIÓN.(ESTÉTICO)
 * @param lblTextoCancion2 TIENE EL NOMBRE DE LA CANCIÓN.(ESTÉTICO)
 * @param lblTextoCancion3 TIENE EL NOMBRE DE LA CANCIÓN.(ESTÉTICO)
 * @param lblTextoCancion1 TIENE EL NOMBRE DE LA CANCIÓN.(ESTÉTICO)
 * @param lblTextoNombreyCreador TIENE EL NOMBRE DEL ALBUM Y EL NOMBRE DEL CREADOR.(ESTÉTICO)
 * @param lbl_Portada3 TIENE LA PORTADA DE LA CANCIÓN.(ESTÉTICO)
 * @param lbl_Portada2 TIENE LA PORTADA DE LA CANCIÓN.(ESTÉTICO)
 * @param lbl_Portada1 TIENE LA PORTADA DE LA CANCIÓN.(ESTÉTICO)
 * @param lbl_linea ES LA LINEA PARA SEPARAR LA PÁGINA.(ESTÉTICO)
 * @param lbl_NombreAlbum TIENE EL NOMBRE DEL ALBUM.(ESTÉTICO)
 * @param lbl_Portada_Album TIENE LA PORTADA DEL ALBUM.(ESTÉTICO)
 * @param lbl_IMG_Fondo1 TIENE LA IMAGEN DE FONDO DE LA PÁGINA.(ESTÉTICO)
 */
public class SeleccionContAlbum2 extends JFrame {
	/**
	 * Es la versión numero 1 de la página de seleccion contenido del album
	 */
	// ----------------------------------------------------------------------------------------
	// ATRIBUTOS
	// ----------------------------------------------------------------------------------------
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnplay3;
	private JButton btnSalida;
	private JButton btnplay2;
	private JPanel panelContenedor;
	private JLabel lblTxtDuracion2;
	private JLabel lblTxtReproducciones3;
	private JLabel lblTxtReproducciones2;
	private JLabel lblTxtDuracion3;
	private JLabel lblTxtDuracion1;
	private JLabel lblTxtReproducciones1;
	private JLabel lblTextoCancion2;
	private JLabel lblTextoCancion3;
	private JLabel lblTextoCancion1;
	private JLabel lblTextoNombreyCreador;
	private JLabel lbl_Portada3;
	private JLabel lbl_Portada2;
	private JLabel lbl_Portada1;
	private JLabel lbl_linea;
	private JLabel lbl_NombreAlbum;
	private JLabel lbl_Portada_Album;
	private JLabel lbl_IMG_Fondo1;
	private JButton btnplay1;
	/**
	 * En el metodo main ejecutamos la ventana principal SeleccionContAlbum2.
	 */
	// ----------------------------------------------------------------------------------------
	// METODO MAIN
	// ----------------------------------------------------------------------------------------
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SeleccionContAlbum2 frame = new SeleccionContAlbum2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// ----------------------------------------------------------------------------------------
	// CONSTRUCTOR
	// ----------------------------------------------------------------------------------------
	/**
	 * En el constructor SeleccionContAlbum() estan todos los atributos y metodos necesarios para cuando creemos el objeto tenga toda la funcionalidades.
	 */
	public SeleccionContAlbum2() {
		// ----------------------------------------------------------------------------------------
		// contentPane CONTIENE TODOS LOS ATRIBUTOS DE LA PÁGINA
		// ----------------------------------------------------------------------------------------
		contentPane = new JPanel();
		contentPane.setOpaque(false);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setType(Type.UTILITY);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 977, 703);
		// Establecer el fondo con transparencia
		contentPane.setBackground(new Color(0,0,0,10));
		// ----------------------------------------------------------------------------------------
		// panelContenedor CONTIENE TODOS LOS ATRIBUTOS PARA PODER INTERCAMBIAR PANELES SIN COMPLICACIÓN
		// ----------------------------------------------------------------------------------------
		panelContenedor = new JPanel();
		panelContenedor.setBounds(0, 0, 961, 664);
		panelContenedor.setLayout(null);
		// ----------------------------------------------------------------------------------------
		// AJUSTAR IMAGEN AL CONTENIDO
		// ----------------------------------------------------------------------------------------
		ImageIcon IconoSalida = new ImageIcon(getClass().getResource("/Trilogy_imagenes/IconoLogout.png"));
		ImageIcon fondoIMG = new ImageIcon(getClass().getResource("/Trilogy_imagenes/Fondo_Formulario.png")); // CREACIÓN NUEVO OBJETO CON LA RUTA DE LA IMAGEN
		ImageIcon play=new ImageIcon(getClass().getResource("/Trilogy_imagenes/IconosMusicaPlay.png"));
		// ----------------------------------------------------------------------------------------
		//btnplay3 ES EL BOTÓN PARA REANUDAR O EMPEZAR A ESCUCHAR LA CANCION.
		// ----------------------------------------------------------------------------------------
		btnplay3 = new JButton("");
		btnplay3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnplay3.setContentAreaFilled(false);
		btnplay3.setBorderPainted(false);
		btnplay3.setBounds(341, 534, 57, 41);
		ImageIcon imgplay3 = new ImageIcon(play.getImage().getScaledInstance(btnplay3.getWidth(), btnplay3.getHeight(), Image.SCALE_SMOOTH));
		btnplay3.setIcon(imgplay3);
		// ----------------------------------------------------------------------------------------
		//btnSalida CIERRA LA VENTANA.
		// ----------------------------------------------------------------------------------------
		btnSalida = new JButton("");
		btnSalida.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0); // CUANDO PINCHAS EN EL ICONO LA ACCIÓN ES SALIR DE LA VENTANA
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnSalida.setContentAreaFilled(true);
				//btnSalida.setBackground(new Color(255, 255, 255, 180)); BUSCAR SOLUCION
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnSalida.setContentAreaFilled(false);
			}
		});
		btnSalida.setBounds(0,607,64,57);
		btnSalida.setBorderPainted(false);
		btnSalida.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSalida.setContentAreaFilled(false);
		ImageIcon imgSalida = new ImageIcon(IconoSalida.getImage().getScaledInstance(btnSalida.getWidth(), btnSalida.getHeight(), Image.SCALE_SMOOTH));
		btnSalida.setIcon(imgSalida);
		// ----------------------------------------------------------------------------------------
		//btnplay2 ES EL BOTÓN PARA REANUDAR O EMPEZAR A ESCUCHAR LA CANCION.
		// ----------------------------------------------------------------------------------------
		btnplay2 = new JButton("");
		btnplay2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnplay2.setContentAreaFilled(false);
		btnplay2.setBorderPainted(false);
		btnplay2.setBounds(341, 435, 57, 41);
		ImageIcon imgplay2 = new ImageIcon(play.getImage().getScaledInstance(btnplay2.getWidth(), btnplay2.getHeight(), Image.SCALE_SMOOTH)); // CREAMOS OTRO OBJETO PARA QUE SE AJUSTE AUTOMATICAMENTE LA IMAGEN
		btnplay2.setIcon(imgplay2);
		// ----------------------------------------------------------------------------------------
		//btnplay1 ES EL BOTÓN PARA REANUDAR O EMPEZAR A ESCUCHAR LA CANCION.
		// ----------------------------------------------------------------------------------------
		btnplay1 = new JButton("");
		btnplay1.setBounds(341, 344, 57, 41);
		ImageIcon imgPlay1 = new ImageIcon(play.getImage().getScaledInstance(btnplay1.getWidth(), btnplay1.getHeight(), Image.SCALE_SMOOTH)); // CREAMOS OTRO OBJETO PARA QUE SE AJUSTE AUTOMATICAMENTE LA IMAGEN
		btnplay1.setIcon(imgPlay1);
		btnplay1.setIcon(imgPlay1);
		btnplay1.setBorderPainted(false);
		btnplay1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnplay1.setContentAreaFilled(false);
		// ----------------------------------------------------------------------------------------
		//lblTxtDuracion2 TIENE LA DURACIÓN DE LA CANCIÓN.(ESTÉTICO)
		// ----------------------------------------------------------------------------------------
		lblTxtDuracion2 = new JLabel("DURACIÓN");
		lblTxtDuracion2.setHorizontalAlignment(SwingConstants.CENTER);
		lblTxtDuracion2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTxtDuracion2.setBounds(833, 448, 98, 14);
		// ----------------------------------------------------------------------------------------
		//lblTxtReproducciones3 TIENE LA CANTIDAD DE REPRODUCCIONES DE LA CANCIÓN.(ESTÉTICO)
		// ----------------------------------------------------------------------------------------
		lblTxtReproducciones3 = new JLabel("REPRODUCCIONES");
		lblTxtReproducciones3.setHorizontalAlignment(SwingConstants.CENTER);
		lblTxtReproducciones3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTxtReproducciones3.setBounds(619, 534, 150, 19);
		// ----------------------------------------------------------------------------------------
		//lblTxtReproducciones2 TIENE LA CANTIDAD DE REPRODUCCIONES DE LA CANCIÓN.(ESTÉTICO)
		// ----------------------------------------------------------------------------------------
		lblTxtReproducciones2 = new JLabel("REPRODUCCIONES");
		lblTxtReproducciones2.setHorizontalAlignment(SwingConstants.CENTER);
		lblTxtReproducciones2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTxtReproducciones2.setBounds(619, 446, 150, 19);
		// ----------------------------------------------------------------------------------------
		//lblTxtDuracion3 TIENE LA DURACIÓN DE LA CANCIÓN.(ESTÉTICO)
		// ----------------------------------------------------------------------------------------
		lblTxtDuracion3 = new JLabel("DURACIÓN");
		lblTxtDuracion3.setHorizontalAlignment(SwingConstants.CENTER);
		lblTxtDuracion3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTxtDuracion3.setBounds(833, 536, 98, 14);
		// ----------------------------------------------------------------------------------------
		//lblTxtDuracion1 TIENE LA DURACIÓN DE LA CANCIÓN.(ESTÉTICO)
		// ----------------------------------------------------------------------------------------
		lblTxtDuracion1 = new JLabel("DURACIÓN");
		lblTxtDuracion1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTxtDuracion1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTxtDuracion1.setBounds(833, 364, 98, 14);
		// ----------------------------------------------------------------------------------------
		//lblTxtReproducciones1 TIENE LA CANTIDAD DE REPRODUCCIONES DE LA CANCIÓN.(ESTÉTICO)
		// ----------------------------------------------------------------------------------------
		lblTxtReproducciones1 = new JLabel("REPRODUCCIONES");
		lblTxtReproducciones1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTxtReproducciones1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTxtReproducciones1.setBounds(619, 362, 150, 19);
		// ----------------------------------------------------------------------------------------
		//lblTextoCancion2 TIENE EL NOMBRE DE LA CANCIÓN.(ESTÉTICO)
		// ----------------------------------------------------------------------------------------
		lblTextoCancion2 = new JLabel("CANCIÓN 2");
		lblTextoCancion2.setHorizontalAlignment(SwingConstants.CENTER);
		lblTextoCancion2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTextoCancion2.setBounds(213, 448, 118, 28);
		// ----------------------------------------------------------------------------------------
		//lblTextoCancion3 TIENE EL NOMBRE DE LA CANCIÓN.(ESTÉTICO)
		// ----------------------------------------------------------------------------------------
		lblTextoCancion3 = new JLabel("CANCIÓN 3");
		lblTextoCancion3.setHorizontalAlignment(SwingConstants.CENTER);
		lblTextoCancion3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTextoCancion3.setBounds(213, 538, 118, 28);
		// ----------------------------------------------------------------------------------------
		//lblTextoCancion1 TIENE EL NOMBRE DE LA CANCIÓN.(ESTÉTICO)
		// ----------------------------------------------------------------------------------------
		lblTextoCancion1 = new JLabel("CANCIÓN 1");
		lblTextoCancion1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTextoCancion1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTextoCancion1.setBounds(213, 357, 118, 28);
		// ----------------------------------------------------------------------------------------
		//lblTextoNombreyCreador TIENE EL NOMBRE DEL ALBUM Y EL NOMBRE DEL CREADOR.(ESTÉTICO)
		// ----------------------------------------------------------------------------------------
		lblTextoNombreyCreador = new JLabel("NOMBRE ALBUM Y CREADOR");
		lblTextoNombreyCreador.setHorizontalAlignment(SwingConstants.CENTER);
		lblTextoNombreyCreador.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTextoNombreyCreador.setBounds(440, 129, 208, 46);
		// ----------------------------------------------------------------------------------------
		//lbl_Portada3 TIENE LA PORTADA DE LA CANCIÓN.(ESTÉTICO)
		// ----------------------------------------------------------------------------------------
		lbl_Portada3 = new JLabel("PORTADA3");
		lbl_Portada3.setOpaque(true);
		lbl_Portada3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Portada3.setForeground(Color.BLACK);
		lbl_Portada3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_Portada3.setBorder(new LineBorder(Color.LIGHT_GRAY));
		lbl_Portada3.setBackground(Color.LIGHT_GRAY);
		lbl_Portada3.setBounds(82, 515, 90, 75);
		// ----------------------------------------------------------------------------------------
		//lbl_Portada2 TIENE LA PORTADA DE LA CANCIÓN.(ESTÉTICO)
		// ----------------------------------------------------------------------------------------
		lbl_Portada2 = new JLabel("PORTADA2");
		lbl_Portada2.setOpaque(true);
		lbl_Portada2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Portada2.setForeground(Color.BLACK);
		lbl_Portada2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_Portada2.setBorder(new LineBorder(Color.LIGHT_GRAY));
		lbl_Portada2.setBackground(Color.LIGHT_GRAY);
		lbl_Portada2.setBounds(82, 425, 90, 75);
		// ----------------------------------------------------------------------------------------
		//lbl_Portada1 TIENE LA PORTADA DE LA CANCIÓN.(ESTÉTICO)
		// ----------------------------------------------------------------------------------------
		lbl_Portada1 = new JLabel("PORTADA1");
		lbl_Portada1.setOpaque(true);
		lbl_Portada1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Portada1.setForeground(Color.BLACK);
		lbl_Portada1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_Portada1.setBorder(new LineBorder(Color.LIGHT_GRAY));
		lbl_Portada1.setBackground(Color.LIGHT_GRAY);
		lbl_Portada1.setBounds(82, 334, 90, 75);
		// ----------------------------------------------------------------------------------------
		//lbl_linea ES LA LINEA PARA SEPARAR LA PÁGINA.(ESTÉTICO)
		// ----------------------------------------------------------------------------------------
		lbl_linea = new JLabel("");
		lbl_linea.setBackground(new Color(0, 0, 0));
		lbl_linea.setBorder(new LineBorder(Color.LIGHT_GRAY));
		lbl_linea.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_linea.setOpaque(true);
		lbl_linea.setForeground(new Color(0, 0, 0));
		lbl_linea.setBounds(0, 308, 1164, 2);
		// ----------------------------------------------------------------------------------------
		//lbl_NombreAlbum TIENE EL NOMBRE DEL ALBUM.(ESTÉTICO)
		// ----------------------------------------------------------------------------------------
		lbl_NombreAlbum = new JLabel("NOMBRE ALBUM");
		lbl_NombreAlbum.setOpaque(true);
		lbl_NombreAlbum.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_NombreAlbum.setForeground(Color.BLACK);
		lbl_NombreAlbum.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_NombreAlbum.setBorder(new LineBorder(Color.LIGHT_GRAY));
		lbl_NombreAlbum.setBackground(new Color(192, 192, 192));
		lbl_NombreAlbum.setBounds(424, 24, 242, 54);
		// ----------------------------------------------------------------------------------------
		//lbl_Portada_Album TIENE LA PORTADA DEL ALBUM.(ESTÉTICO)
		// ----------------------------------------------------------------------------------------
		lbl_Portada_Album = new JLabel("PORTADA ALBUM");
		lbl_Portada_Album.setForeground(new Color(0, 0, 0)); //EL COLOR DEL TEXTO
		lbl_Portada_Album.setBorder(new LineBorder(Color.LIGHT_GRAY)); // eL COLOR DLE BORDE DEL CUADRO
		lbl_Portada_Album.setFont(new Font("Tahoma", Font.BOLD, 14)); // TIPO DE LETRA,TAMAÑO...
		lbl_Portada_Album.setHorizontalAlignment(SwingConstants.CENTER); //CENTRAR EL TEXTO DEL CUADRO
		lbl_Portada_Album.setOpaque(true); // LINEA OBLIGATORIA PARA QUE EL FONDO TENGA COLOR SOLIDO
		lbl_Portada_Album.setBackground(new Color(192, 192, 192));// COLOR DE FONDO
		lbl_Portada_Album.setBounds(82, 85, 150, 135);//TAMAÑO DEL CUADRO
		// ----------------------------------------------------------------------------------------
		//lbl_IMG_Fondo1 TIENE LA IMAGEN DE FONDO DE LA PÁGINA.(ESTÉTICO)
		// ----------------------------------------------------------------------------------------
		lbl_IMG_Fondo1 = new JLabel("");
		lbl_IMG_Fondo1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_IMG_Fondo1.setBounds(0, 0, 961, 664);
		ImageIcon imgFondoIMG = new ImageIcon(fondoIMG.getImage().getScaledInstance(lbl_IMG_Fondo1.getWidth(), lbl_IMG_Fondo1.getHeight(), Image.SCALE_SMOOTH));
		contentPane.setLayout(null);
		lbl_IMG_Fondo1.setIcon(imgFondoIMG);
		lbl_IMG_Fondo1.setOpaque(true);
		// ----------------------------------------------------------------------------------------
		// JERARQUÍA DEL panel_contenedor
		// ----------------------------------------------------------------------------------------
		panelContenedor.add(btnplay3);
		panelContenedor.add(btnSalida);
		panelContenedor.add(btnplay2);
		panelContenedor.add(btnplay1);
		panelContenedor.add(btnplay1);
		panelContenedor.add(lblTxtDuracion2);
		panelContenedor.add(lblTxtReproducciones3);
		panelContenedor.add(lblTxtReproducciones2);
		panelContenedor.add(lblTxtDuracion3);
		panelContenedor.add(lblTxtDuracion1);
		panelContenedor.add(lblTxtReproducciones1);
		panelContenedor.add(lblTextoCancion2);
		panelContenedor.add(lblTextoCancion3);
		panelContenedor.add(lblTextoCancion1);
		panelContenedor.add(lblTextoNombreyCreador);
		panelContenedor.add(lbl_Portada3);
		panelContenedor.add(lbl_Portada2);
		panelContenedor.add(lbl_Portada1);
		panelContenedor.add(lbl_linea);
		panelContenedor.add(lbl_NombreAlbum);
		panelContenedor.add(lbl_Portada_Album);
		panelContenedor.add(lbl_IMG_Fondo1);
		contentPane.add(panelContenedor);
	}
}
