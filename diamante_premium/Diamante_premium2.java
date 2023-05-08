package diamante_premium;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import cat_audiovisual.CatalogoAudiovisual;
import seleccion_pelicula.Seleccion_pelicula;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
/**
 * En la págian de Diamante Premium podras consumir contenido audiovisual de películas, series y música segun a elección y con un botón de recarga cambiara el contenido audiovisual respectivo a la selección.
 * @param contentPane CONTIENE TODOS LOS ATRIBUTOS DE LA PÁGINA.
 * @param panel_contenedor CONTIENE TODOS LOS ATRIBUTOS PARA PODER INTERCAMBIAR PANELES SIN COMPLICACIÓN.
 * @param lbl_Fondo TIENE LA IMAGEN DE FONDO DE LA PÁGINA.
 * @param lbl_TXT_Peliculas TIENE EL TEXTO DE PELÍCULAS.
 * @param lbl_TXT_Series TIENE EL TEXTO DE SERIES.
 * @param lbl_TXT_Musica TIENE EL TEXTO DE MÚSICA.
 * @param lbl_IMG_Music_1 TIENE LA IMAGEN DE LA MUSICA QUE SE VA A REPRODUCIR.
 * @param lbl_IMG_Music_2 TIENE LA IMAGEN DE LA MUSICA QUE SE VA A REPRODUCIR.
 * @param lbl_IMG_Music_3 TIENE LA IMAGEN DE LA MUSICA QUE SE VA A REPRODUCIR.
 * @param lbl_IMG_Music_4 TIENE LA IMAGEN DE LA MUSICA QUE SE VA A REPRODUCIR.
 * @param lbl_IMG_Music_5 TIENE LA IMAGEN DE LA MUSICA QUE SE VA A REPRODUCIR.
 * @param lbl_IMG_Peli_1 TIENE LA IMAGEN DE LA PELÍCULA QUE SE VA A REPRODUCIR.
 * @param lbl_IMG_Peli_2 TIENE LA IMAGEN DE LA PELÍCULA QUE SE VA A REPRODUCIR.
 * @param lbl_IMG_Peli_3 TIENE LA IMAGEN DE LA PELÍCULA QUE SE VA A REPRODUCIR.
 * @param lbl_IMG_Peli_4 TIENE LA IMAGEN DE LA PELÍCULA QUE SE VA A REPRODUCIR.
 * @param lbl_IMG_Peli_5 TIENE LA IMAGEN DE LA PELÍCULA QUE SE VA A REPRODUCIR.
 * @param lbl_IMG_Serie_1 TIENE LA IMAGEN DE LA SERIE QUE SE VA A REPRODUCIR.
 * @param lbl_IMG_Serie_2 TIENE LA IMAGEN DE LA SERIE QUE SE VA A REPRODUCIR.
 * @param lbl_IMG_Serie_3 TIENE LA IMAGEN DE LA SERIE QUE SE VA A REPRODUCIR.
 * @param lbl_IMG_Serie_4 TIENE LA IMAGEN DE LA SERIE QUE SE VA A REPRODUCIR.
 * @param lbl_IMG_Serie_5 TIENE LA IMAGEN DE LA SERIE QUE SE VA A REPRODUCIR.
 * @param btn_Recarga_Musica cambia las músicas.
 * @param btn_Recarga_Peli cambia las películas.
 * @param btn_Recarga_Serie cambia las series.
 * @param lblTextoCancion1 TIENE EL TEXTO DEL NOMBRE DE LA MUSICA QUE SE VA A REPRODUCIR.
 * @param lblTextoCancion2 TIENE EL TEXTO DEL NOMBRE DE LA MUSICA QUE SE VA A REPRODUCIR.
 * @param lblTextoCancion3 TIENE EL TEXTO DEL NOMBRE DE LA MUSICA QUE SE VA A REPRODUCIR.
 * @param lblTextoCancion4 TIENE EL TEXTO DEL NOMBRE DE LA MUSICA QUE SE VA A REPRODUCIR.
 * @param lblTextoCancion5 TIENE EL TEXTO DEL NOMBRE DE LA MUSICA QUE SE VA A REPRODUCIR.
 * @author TRILOGY. Miembros: Adrian Leal Vacas, Gonzalo Amo Cano y Raul Senso Montojo.
 */
public class Diamante_premium2 extends JFrame {
	/**
	 * Es la versión numero 1 de la página del contenido audiovisual de la membresia diamante
	 */
	private static final long serialVersionUID = 1L;
	// ----------------------------------------------------------------------------------------
	// ATRIBUTOS
	// ----------------------------------------------------------------------------------------
	private JPanel contentPane;
	private JPanel panel_contenedor;
	private JLabel lbl_Fondo;
	private JLabel lbl_TXT_Peliculas;
	private JLabel lbl_IMG_Peli_1;
	private JLabel lbl_IMG_Serie_1;
	private JLabel lbl_TXT_Musica;
	private JLabel lbl_IMG_Music_1;
	private JLabel lbl_IMG_Peli_2;
	private JLabel lbl_IMG_Serie_2;
	private JLabel lbl_IMG_Music_2;
	private JLabel lbl_IMG_Peli_3;
	private JLabel lbl_IMG_Peli_4;
	private JLabel lbl_IMG_Serie_3;
	private JLabel lbl_IMG_Serie_4;
	private JLabel lbl_IMG_Music_3;
	private JLabel lbl_IMG_Music_4;
	private JLabel lbl_IMG_Music_5;
	private JLabel lbl_IMG_Serie_5;
	private JLabel lbl_IMG_Peli_5;
	private JLabel lbl_TXT_Series;
	private JButton btn_Recarga_Musica;
	private JButton btn_Recarga_Peli;
	private JButton btn_Recarga_Serie;
	private JLabel lblTextoCancion1;
	private JLabel lblTextoCancion2;
	private JLabel lblTextoCancion4;
	private JLabel lblTextoCancion3;
	private JLabel lblTextoCancion5;
	public static String ruta_peli;
	public static int contador=0;
	private static int num_peli=0;
	private static int num_peli_enlacep1=0;
	private static int num_peli_enlacep2=0;
	private static int num_peli_enlacep3=0;
	private static int num_peli_enlacep4=0;
	private static int num_peli_enlacep5=0;
	// ----------------------------------------------------------------------------------------
	// GETTERS AND SETTERS
	// ----------------------------------------------------------------------------------------
	public JPanel getPanel_contenedor() {
		return panel_contenedor;
	}
	public void setPanel_contenedor(JPanel panel_contenedor) {
		this.panel_contenedor = panel_contenedor;
	}
	// ----------------------------------------------------------------------------------------
	// METODO MAIN
	// ----------------------------------------------------------------------------------------
	/**
	 * En el metodo main ejecutamos la ventana principal Diamante_premium.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Diamante_premium2 frame = new Diamante_premium2();
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
	 * En el constructor Diamante_premium2() estan todos los atributos y metodos necesarios para cuando creemos el objeto tenga toda la funcionalidades.
	 */
	public Diamante_premium2() {
		// ----------------------------------------------------------------------------------------
		// contentPane CONTIENE TODOS LOS ATRIBUTOS DE LA PÁGINA
		// ----------------------------------------------------------------------------------------
		setType(Type.UTILITY);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1145, 703);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		// ----------------------------------------------------------------------------------------
		// panel_contenedor CONTIENE TODOS LOS ATRIBUTOS PARA PODER INTERCAMBIAR PANELES SIN COMPLICACIÓN
		// ----------------------------------------------------------------------------------------
		panel_contenedor = new JPanel();
		panel_contenedor.setBounds(0, 0, 1130, 663);
		panel_contenedor.setLayout(null);
		// ----------------------------------------------------------------------------------------
		// lbl_Fondo TIENE LA IMAGEN DE FONDO DE LA PÁGINA
		// ----------------------------------------------------------------------------------------
		lbl_Fondo = new JLabel();
		lbl_Fondo.setBounds(0, 0, 1130, 663);
		// AJUSTAR IMAGEN AL CONTENIDO
		ImageIcon logoOriginal = new ImageIcon(getClass().getResource("/Trilogy_imagenes/Fondo_Diamante_Premium.jpg")); // CREACIÓN NUEVO OBJETO CON LA RUTA DE LA IMAGEN
		ImageIcon imgLogoOriginal = new ImageIcon(logoOriginal.getImage().getScaledInstance(lbl_Fondo.getWidth(), lbl_Fondo.getHeight(), Image.SCALE_SMOOTH)); // CREAMOS OTRO OBJETO PARA QUE SE AJUSTE AUTOMATICAMENTE LA IMAGEN
		lbl_Fondo.setIcon(imgLogoOriginal);
		// ----------------------------------------------------------------------------------------
		// lbl_TXT_Peliculas TIENE EL TEXTO DE PELÍCULAS
		// ----------------------------------------------------------------------------------------
		lbl_TXT_Peliculas = new JLabel("PELÍCULAS");
		lbl_TXT_Peliculas.setBounds(180, 20, 843, 30);
		lbl_TXT_Peliculas.setOpaque(true);
		lbl_TXT_Peliculas.setBackground(new Color(204, 255, 204));
		lbl_TXT_Peliculas.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_TXT_Peliculas.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_TXT_Peliculas.setBorder(new LineBorder(new Color(211,211,211)));
		// ----------------------------------------------------------------------------------------
		// lbl_TXT_Series TIENE EL TEXTO DE SERIES
		// ----------------------------------------------------------------------------------------
		lbl_TXT_Series = new JLabel("SERIES");
		lbl_TXT_Series.setOpaque(true);
		lbl_TXT_Series.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_TXT_Series.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_TXT_Series.setBorder(new LineBorder(new Color(211,211,211)));
		lbl_TXT_Series.setBackground(new Color(204, 255, 204));
		lbl_TXT_Series.setBounds(180, 234, 843, 30);
		// ----------------------------------------------------------------------------------------
		// lbl_TXT_Musica TIENE EL TEXTO DE MÚSICA
		// ----------------------------------------------------------------------------------------
		lbl_TXT_Musica = new JLabel("MÚSICA");
		lbl_TXT_Musica.setOpaque(true);
		lbl_TXT_Musica.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_TXT_Musica.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_TXT_Musica.setBorder(new LineBorder(new Color(211,211,211)));
		lbl_TXT_Musica.setBackground(new Color(204, 255, 204));
		lbl_TXT_Musica.setBounds(180, 448, 843, 30);
		// ----------------------------------------------------------------------------------------
		// lbl_IMG_Peli_1 TIENE LA IMAGEN DE LA PELÍCULA QUE SE VA A REPRODUCIR
		// ----------------------------------------------------------------------------------------
		lbl_IMG_Peli_1 = new JLabel();
		lbl_IMG_Peli_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_IMG_Peli_1.setBounds(215, 72, 115, 140);
		lbl_IMG_Peli_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*File path = new File ("./src/diamante_prmiunm/peliculas/megan.mp4"); // RUTA DEL TRAILER
			    try {
					Desktop.getDesktop().open(path); // ABRE LA PELICULA EN EL EDITOR POR DEFECTO DE TU ORDENADRO
				} catch (IOException e1) {
					e1.printStackTrace();
				}*/
				if (num_peli_enlacep1==0) {
					num_peli=0;
					ruta_peli=CatalogoAudiovisual.devolverRutaPeli(num_peli);
					Seleccion_pelicula prueba = new Seleccion_pelicula();
					prueba.setVisible(true);
				} else {
					ruta_peli=CatalogoAudiovisual.devolverRutaPeli(num_peli_enlacep1);
					Seleccion_pelicula prueba = new Seleccion_pelicula();
					prueba.setVisible(true);
				}
			}
		});
		// AJUSTAR IMAGEN AL CONTENIDO
		lbl_IMG_Peli_1.setIcon(CatalogoAudiovisual.obtenerImagenPelicula(0,lbl_IMG_Peli_1.getWidth(),lbl_IMG_Peli_1.getHeight()));
		// ----------------------------------------------------------------------------------------
		// lbl_IMG_Peli_2 TIENE LA IMAGEN DE LA PELÍCULA QUE SE VA A REPRODUCIR
		// ----------------------------------------------------------------------------------------
		lbl_IMG_Peli_2 = new JLabel();
		lbl_IMG_Peli_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_IMG_Peli_2.setBounds(380, 72, 115, 140);
		lbl_IMG_Peli_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*File path = new File ("./src/diamante_prmiunm/peliculas/megan.mp4"); // RUTA DEL TRAILER
			    try {
					Desktop.getDesktop().open(path); // ABRE LA PELICULA EN EL EDITOR POR DEFECTO DE TU ORDENADRO
				} catch (IOException e1) {
					e1.printStackTrace();
				}*/
				if (num_peli_enlacep2==0) {
					num_peli=1;
					ruta_peli=CatalogoAudiovisual.devolverRutaPeli(num_peli);
					Seleccion_pelicula prueba = new Seleccion_pelicula();
					prueba.setVisible(true);
				} else {
					ruta_peli=CatalogoAudiovisual.devolverRutaPeli(num_peli_enlacep2);
					Seleccion_pelicula prueba = new Seleccion_pelicula();
					prueba.setVisible(true);
				}
			}
		});
		lbl_IMG_Peli_2.setIcon(CatalogoAudiovisual.obtenerImagenPelicula(1,lbl_IMG_Peli_2.getWidth(),lbl_IMG_Peli_2.getHeight()));
		// ----------------------------------------------------------------------------------------
		// lbl_IMG_Peli_3 TIENE LA IMAGEN DE LA PELÍCULA QUE SE VA A REPRODUCIR
		// ----------------------------------------------------------------------------------------
		lbl_IMG_Peli_3 = new JLabel();
		lbl_IMG_Peli_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_IMG_Peli_3.setBounds(545, 72, 115, 140);
		lbl_IMG_Peli_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*File path = new File ("./src/diamante_prmiunm/peliculas/megan.mp4"); // RUTA DEL TRAILER
			    try {
					Desktop.getDesktop().open(path); // ABRE LA PELICULA EN EL EDITOR POR DEFECTO DE TU ORDENADRO
				} catch (IOException e1) {
					e1.printStackTrace();
				}*/
				if (num_peli_enlacep3==0) {
					num_peli=2;
					ruta_peli=CatalogoAudiovisual.devolverRutaPeli(num_peli);
					Seleccion_pelicula prueba = new Seleccion_pelicula();
					prueba.setVisible(true);
				} else {
					ruta_peli=CatalogoAudiovisual.devolverRutaPeli(num_peli_enlacep3);
					Seleccion_pelicula prueba = new Seleccion_pelicula();
					prueba.setVisible(true);
				}
			}
		});
		// AJUSTAR IMAGEN AL CONTENIDO
		lbl_IMG_Peli_3.setIcon(CatalogoAudiovisual.obtenerImagenPelicula(2,lbl_IMG_Peli_3.getWidth(),lbl_IMG_Peli_3.getHeight()));
		// ----------------------------------------------------------------------------------------
		// lbl_IMG_Peli_4 TIENE LA IMAGEN DE LA PELÍCULA QUE SE VA A REPRODUCIR
		// ----------------------------------------------------------------------------------------
		lbl_IMG_Peli_4 = new JLabel();
		lbl_IMG_Peli_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_IMG_Peli_4.setBounds(710, 72, 115, 140);
		lbl_IMG_Peli_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*File path = new File ("./src/diamante_prmiunm/peliculas/megan.mp4"); // RUTA DEL TRAILER
			    try {
					Desktop.getDesktop().open(path); // ABRE LA PELICULA EN EL EDITOR POR DEFECTO DE TU ORDENADRO
				} catch (IOException e1) {
					e1.printStackTrace();
				}*/
				if (num_peli_enlacep4==0) {
					num_peli=3;
					ruta_peli=CatalogoAudiovisual.devolverRutaPeli(num_peli);
					Seleccion_pelicula prueba = new Seleccion_pelicula();
					prueba.setVisible(true);
				} else {
					ruta_peli=CatalogoAudiovisual.devolverRutaPeli(num_peli_enlacep4);
					Seleccion_pelicula prueba = new Seleccion_pelicula();
					prueba.setVisible(true);
				}
			}
		});
		lbl_IMG_Peli_4.setIcon(CatalogoAudiovisual.obtenerImagenPelicula(3,lbl_IMG_Peli_4.getWidth(),lbl_IMG_Peli_4.getHeight()));
		// ----------------------------------------------------------------------------------------
		// lbl_IMG_Peli_5 TIENE LA IMAGEN DE LA PELÍCULA QUE SE VA A REPRODUCIR
		// ----------------------------------------------------------------------------------------
		lbl_IMG_Peli_5 =  new JLabel();
		lbl_IMG_Peli_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_IMG_Peli_5.setBounds(875, 72, 115, 140);
		lbl_IMG_Peli_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*File path = new File ("./src/diamante_prmiunm/peliculas/megan.mp4"); // RUTA DEL TRAILER
			    try {
					Desktop.getDesktop().open(path); // ABRE LA PELICULA EN EL EDITOR POR DEFECTO DE TU ORDENADRO
				} catch (IOException e1) {
					e1.printStackTrace();
				}*/
				if (num_peli_enlacep5==0) {
					num_peli=4;
					ruta_peli=CatalogoAudiovisual.devolverRutaPeli(num_peli);
					Seleccion_pelicula prueba = new Seleccion_pelicula();
					prueba.setVisible(true);
				} else {
					ruta_peli=CatalogoAudiovisual.devolverRutaPeli(num_peli_enlacep5);
					Seleccion_pelicula prueba = new Seleccion_pelicula();
					prueba.setVisible(true);
				}
			}
		});
		// AJUSTAR IMAGEN AL CONTENIDO
		lbl_IMG_Peli_5.setIcon(CatalogoAudiovisual.obtenerImagenPelicula(4,lbl_IMG_Peli_5.getWidth(),lbl_IMG_Peli_5.getHeight()));
		// ----------------------------------------------------------------------------------------
		// lbl_IMG_Serie_1 TIENE LA IMAGEN DE LA SERIE QUE SE VA A REPRODUCIR
		// ----------------------------------------------------------------------------------------
		lbl_IMG_Serie_1 = new JLabel();
		lbl_IMG_Serie_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_IMG_Serie_1.setBounds(215, 286, 115, 140);
		// AJUSTAR IMAGEN AL CONTENIDO
		ImageIcon demogorgon = new ImageIcon(getClass().getResource("/diamante_premium/series/demogorgon.jpg")); // CREACIÓN NUEVO OBJETO CON LA RUTA DE LA IMAGEN
		ImageIcon imgDemogorgon = new ImageIcon(demogorgon.getImage().getScaledInstance(lbl_IMG_Serie_1.getWidth(), lbl_IMG_Serie_1.getHeight(), Image.SCALE_SMOOTH)); // CREAMOS OTRO OBJETO PARA QUE SE AJUSTE AUTOMATICAMENTE LA IMAGEN
		lbl_IMG_Serie_1.setIcon(imgDemogorgon);
		// ----------------------------------------------------------------------------------------
		// lbl_IMG_Serie_2 TIENE LA IMAGEN DE LA SERIE QUE SE VA A REPRODUCIR
		// ----------------------------------------------------------------------------------------
		lbl_IMG_Serie_2 = new JLabel();
		lbl_IMG_Serie_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_IMG_Serie_2.setBounds(380, 286, 115, 140);
		// AJUSTAR IMAGEN AL CONTENIDO
		ImageIcon dos_chicas_sin_blanca = new ImageIcon(getClass().getResource("/diamante_premium/series/dos_chicas_sin_blanca.jpg")); // CREACIÓN NUEVO OBJETO CON LA RUTA DE LA IMAGEN
		ImageIcon imgDos_chicas_sin_blanca = new ImageIcon(dos_chicas_sin_blanca.getImage().getScaledInstance(lbl_IMG_Serie_2.getWidth(), lbl_IMG_Serie_2.getHeight(), Image.SCALE_SMOOTH)); // CREAMOS OTRO OBJETO PARA QUE SE AJUSTE AUTOMATICAMENTE LA IMAGEN
		lbl_IMG_Serie_2.setIcon(imgDos_chicas_sin_blanca);
		// ----------------------------------------------------------------------------------------
		// lbl_IMG_Serie_3 TIENE LA IMAGEN DE LA SERIE QUE SE VA A REPRODUCIR
		// ----------------------------------------------------------------------------------------
		lbl_IMG_Serie_3 = new JLabel();
		lbl_IMG_Serie_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_IMG_Serie_3.setBounds(545, 286, 115, 140);
		// AJUSTAR IMAGEN AL CONTENIDO
		ImageIcon mandalorian = new ImageIcon(getClass().getResource("/diamante_premium/series/mandalorian.jpg")); // CREACIÓN NUEVO OBJETO CON LA RUTA DE LA IMAGEN
		ImageIcon imgMandalorian = new ImageIcon(mandalorian.getImage().getScaledInstance(lbl_IMG_Serie_3.getWidth(), lbl_IMG_Serie_3.getHeight(), Image.SCALE_SMOOTH)); // CREAMOS OTRO OBJETO PARA QUE SE AJUSTE AUTOMATICAMENTE LA IMAGEN
		lbl_IMG_Serie_3.setIcon(imgMandalorian);
		// ----------------------------------------------------------------------------------------
		// lbl_IMG_Serie_4 TIENE LA IMAGEN DE LA SERIE QUE SE VA A REPRODUCIR
		// ----------------------------------------------------------------------------------------
		lbl_IMG_Serie_4 = new JLabel();
		lbl_IMG_Serie_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_IMG_Serie_4.setBounds(710, 286, 115, 140);
		// AJUSTAR IMAGEN AL CONTENIDO
		ImageIcon the_last_of_us = new ImageIcon(getClass().getResource("/diamante_premium/series/the_last_of_us.jpg")); // CREACIÓN NUEVO OBJETO CON LA RUTA DE LA IMAGEN
		ImageIcon imgThe_last_of_us = new ImageIcon(the_last_of_us.getImage().getScaledInstance(lbl_IMG_Serie_4.getWidth(), lbl_IMG_Serie_4.getHeight(), Image.SCALE_SMOOTH)); // CREAMOS OTRO OBJETO PARA QUE SE AJUSTE AUTOMATICAMENTE LA IMAGEN
		lbl_IMG_Serie_4.setIcon(imgThe_last_of_us);
		// ----------------------------------------------------------------------------------------
		// lbl_IMG_Serie_5 TIENE LA IMAGEN DE LA SERIE QUE SE VA A REPRODUCIR
		// ----------------------------------------------------------------------------------------
		lbl_IMG_Serie_5 = new JLabel("");
		lbl_IMG_Serie_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_IMG_Serie_5.setBounds(875, 286, 115, 140);
		// AJUSTAR IMAGEN AL CONTENIDO
		ImageIcon the_vampire_diarie = new ImageIcon(getClass().getResource("/diamante_premium/series/the_vampire_diarie.jpg")); // CREACIÓN NUEVO OBJETO CON LA RUTA DE LA IMAGEN
		ImageIcon imgThe_vampire_diarie = new ImageIcon(the_vampire_diarie.getImage().getScaledInstance(lbl_IMG_Serie_5.getWidth(), lbl_IMG_Serie_5.getHeight(), Image.SCALE_SMOOTH)); // CREAMOS OTRO OBJETO PARA QUE SE AJUSTE AUTOMATICAMENTE LA IMAGEN
		lbl_IMG_Serie_5.setIcon(imgThe_vampire_diarie);
		// ----------------------------------------------------------------------------------------
		// lbl_IMG_Music_1 TIENE LA IMAGEN DE LA MUSICA QUE SE VA A REPRODUCIR
		// ----------------------------------------------------------------------------------------
		lbl_IMG_Music_1 = new JLabel();
		lbl_IMG_Music_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_IMG_Music_1.setBounds(200, 500, 125, 120);
		// AJUSTAR IMAGEN AL CONTENIDO
		ImageIcon despecha = new ImageIcon(getClass().getResource("/diamante_premium/musica/Despechá.png")); // CREACIÓN NUEVO OBJETO CON LA RUTA DE LA IMAGEN
		ImageIcon imgDespecha = new ImageIcon(despecha.getImage().getScaledInstance(lbl_IMG_Music_1.getWidth(), lbl_IMG_Music_1.getHeight(), Image.SCALE_SMOOTH)); // CREAMOS OTRO OBJETO PARA QUE SE AJUSTE AUTOMATICAMENTE LA IMAGEN
		lbl_IMG_Music_1.setIcon(imgDespecha);
		// ----------------------------------------------------------------------------------------
		// lbl_IMG_Music_2 TIENE LA IMAGEN DE LA MUSICA QUE SE VA A REPRODUCIR
		// ----------------------------------------------------------------------------------------
		lbl_IMG_Music_2 = new JLabel();
		lbl_IMG_Music_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_IMG_Music_2.setBounds(370, 500, 125, 120);
		// AJUSTAR IMAGEN AL CONTENIDO
		ImageIcon playaDelIngles = new ImageIcon(getClass().getResource("/diamante_premium/musica/PlayaDelInglés.png")); // CREACIÓN NUEVO OBJETO CON LA RUTA DE LA IMAGEN
		ImageIcon imgPlayaDelIngles = new ImageIcon(playaDelIngles.getImage().getScaledInstance(lbl_IMG_Music_2.getWidth(), lbl_IMG_Music_2.getHeight(), Image.SCALE_SMOOTH)); // CREAMOS OTRO OBJETO PARA QUE SE AJUSTE AUTOMATICAMENTE LA IMAGEN
		lbl_IMG_Music_2.setIcon(imgPlayaDelIngles);
		// ----------------------------------------------------------------------------------------
		// lbl_IMG_Music_3 TIENE LA IMAGEN DE LA MUSICA QUE SE VA A REPRODUCIR
		// ----------------------------------------------------------------------------------------
		lbl_IMG_Music_3 = new JLabel();
		lbl_IMG_Music_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_IMG_Music_3.setBounds(541, 500, 125, 120);
		// AJUSTAR IMAGEN AL CONTENIDO
		ImageIcon laInocente = new ImageIcon(getClass().getResource("/diamante_premium/musica/LaInocente.png")); // CREACIÓN NUEVO OBJETO CON LA RUTA DE LA IMAGEN
		ImageIcon imgLaInocente = new ImageIcon(laInocente.getImage().getScaledInstance(lbl_IMG_Music_3.getWidth(), lbl_IMG_Music_3.getHeight(), Image.SCALE_SMOOTH)); // CREAMOS OTRO OBJETO PARA QUE SE AJUSTE AUTOMATICAMENTE LA IMAGEN
		lbl_IMG_Music_3.setIcon(imgLaInocente);
		// ----------------------------------------------------------------------------------------
		// lbl_IMG_Music_4 TIENE LA IMAGEN DE LA MUSICA QUE SE VA A REPRODUCIR
		// ----------------------------------------------------------------------------------------
		lbl_IMG_Music_4 = new JLabel();
		lbl_IMG_Music_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_IMG_Music_4.setBounds(710, 500, 125, 120);
		// AJUSTAR IMAGEN AL CONTENIDO
		ImageIcon tqg = new ImageIcon(getClass().getResource("/diamante_premium/musica/tqg.png")); // CREACIÓN NUEVO OBJETO CON LA RUTA DE LA IMAGEN
		ImageIcon imgTqg = new ImageIcon(tqg.getImage().getScaledInstance(lbl_IMG_Music_4.getWidth(), lbl_IMG_Music_4.getHeight(), Image.SCALE_SMOOTH)); // CREAMOS OTRO OBJETO PARA QUE SE AJUSTE AUTOMATICAMENTE LA IMAGEN
		lbl_IMG_Music_4.setIcon(imgTqg);
		// ----------------------------------------------------------------------------------------
		// lbl_IMG_Music_5 TIENE LA IMAGEN DE LA MUSICA QUE SE VA A REPRODUCIR
		// ----------------------------------------------------------------------------------------
		lbl_IMG_Music_5 = new JLabel();
		lbl_IMG_Music_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_IMG_Music_5.setBounds(878, 500, 125, 120);
		// AJUSTAR IMAGEN AL CONTENIDO
		ImageIcon cupido = new ImageIcon(getClass().getResource("/diamante_premium/musica/Cupido.png")); // CREACIÓN NUEVO OBJETO CON LA RUTA DE LA IMAGEN
		ImageIcon imgCupido = new ImageIcon(cupido.getImage().getScaledInstance(lbl_IMG_Music_5.getWidth(), lbl_IMG_Music_5.getHeight(), Image.SCALE_SMOOTH)); // CREAMOS OTRO OBJETO PARA QUE SE AJUSTE AUTOMATICAMENTE LA IMAGEN
		lbl_IMG_Music_5.setIcon(imgCupido);
		// ----------------------------------------------------------------------------------------
		// lblTextoCancion1 TIENE EL TEXTO DEL NOMBRE DE LA MUSICA QUE SE VA A REPRODUCIR
		// ----------------------------------------------------------------------------------------
		lblTextoCancion1 = new JLabel("DESPECHÁ");
		lblTextoCancion1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTextoCancion1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTextoCancion1.setForeground(new Color(0,0,0));
		lblTextoCancion1.setBounds(200, 628, 125, 20);
		// ----------------------------------------------------------------------------------------
		// lblTextoCancion2 TIENE EL TEXTO DEL NOMBRE DE LA MUSICA QUE SE VA A REPRODUCIR
		// ----------------------------------------------------------------------------------------
		lblTextoCancion2 = new JLabel("PLAYA DEL INGLÉS");
		lblTextoCancion2.setHorizontalAlignment(SwingConstants.CENTER);
		lblTextoCancion2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTextoCancion2.setForeground(new Color(0,0,0));
		lblTextoCancion2.setBounds(370, 628, 125, 20);
		// ----------------------------------------------------------------------------------------
		// lblTextoCancion3 TIENE EL TEXTO DEL NOMBRE DE LA MUSICA QUE SE VA A REPRODUCIR
		// ----------------------------------------------------------------------------------------
		lblTextoCancion3 = new JLabel("LA INOCENTE");
		lblTextoCancion3.setHorizontalAlignment(SwingConstants.CENTER);
		lblTextoCancion3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTextoCancion3.setForeground(new Color(0,0,0));
		lblTextoCancion3.setBounds(541, 628, 125, 20);
		// ----------------------------------------------------------------------------------------
		// lblTextoCancion4 TIENE EL TEXTO DEL NOMBRE DE LA MUSICA QUE SE VA A REPRODUCIR
		// ----------------------------------------------------------------------------------------
		lblTextoCancion4 = new JLabel("TQG");
		lblTextoCancion4.setHorizontalAlignment(SwingConstants.CENTER);
		lblTextoCancion4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTextoCancion4.setForeground(new Color(0,0,0));
		lblTextoCancion4.setBounds(710, 628, 125, 20);
		// ----------------------------------------------------------------------------------------
		// lblTextoCancion5 TIENE EL TEXTO DEL NOMBRE DE LA MUSICA QUE SE VA A REPRODUCIR
		// ----------------------------------------------------------------------------------------
		lblTextoCancion5 = new JLabel("CUPIDO");
		lblTextoCancion5.setHorizontalAlignment(SwingConstants.CENTER);
		lblTextoCancion5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTextoCancion5.setForeground(new Color(0,0,0));
		lblTextoCancion5.setBounds(878, 628, 125, 20);
		// ----------------------------------------------------------------------------------------
		// btn_Recarga_Peli cambia las películas
		// ----------------------------------------------------------------------------------------
		btn_Recarga_Peli = new JButton("");
		btn_Recarga_Peli.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_Recarga_Peli.setContentAreaFilled(true);
				btn_Recarga_Peli.setBackground(new Color(255, 255, 255, 160));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btn_Recarga_Peli.setContentAreaFilled(false);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				// incremento contador cada vez que se pulsa
				contador+=1;
				if(contador==1) {
					num_peli=5;
					// lbl_IMG_Peli_1
					lbl_IMG_Peli_1.setVisible(false);
					lbl_IMG_Peli_1.setIcon(CatalogoAudiovisual.obtenerImagenPelicula(num_peli,lbl_IMG_Peli_1.getWidth(),lbl_IMG_Peli_1.getHeight()));
					lbl_IMG_Peli_1.setVisible(true);
					num_peli_enlacep1=num_peli;
					num_peli++;
					// lbl_IMG_Peli_2
					lbl_IMG_Peli_2.setVisible(false);
					lbl_IMG_Peli_2.setIcon(CatalogoAudiovisual.obtenerImagenPelicula(num_peli,lbl_IMG_Peli_2.getWidth(),lbl_IMG_Peli_2.getHeight()));
					lbl_IMG_Peli_2.setVisible(true);
					num_peli_enlacep2=num_peli;
					num_peli++;
					// lbl_IMG_Peli_3
					lbl_IMG_Peli_3.setVisible(false);
					lbl_IMG_Peli_3.setIcon(CatalogoAudiovisual.obtenerImagenPelicula(num_peli,lbl_IMG_Peli_3.getWidth(),lbl_IMG_Peli_3.getHeight()));
					lbl_IMG_Peli_3.setVisible(true);
					num_peli_enlacep3=num_peli;
					num_peli++;
					// lbl_IMG_Peli_4
					lbl_IMG_Peli_4.setVisible(false);
					lbl_IMG_Peli_4.setIcon(CatalogoAudiovisual.obtenerImagenPelicula(num_peli,lbl_IMG_Peli_4.getWidth(),lbl_IMG_Peli_4.getHeight()));
					lbl_IMG_Peli_4.setVisible(true);
					num_peli_enlacep4=num_peli;
					num_peli++;
					// lbl_IMG_Peli_5
					lbl_IMG_Peli_5.setVisible(false);
					lbl_IMG_Peli_5.setIcon(CatalogoAudiovisual.obtenerImagenPelicula(num_peli,lbl_IMG_Peli_5.getWidth(),lbl_IMG_Peli_5.getHeight()));
					lbl_IMG_Peli_5.setVisible(true);
					num_peli_enlacep5=num_peli;
				} else if (contador==2) {
					num_peli=10;
					// lbl_IMG_Peli_1
					lbl_IMG_Peli_1.setVisible(false);
					lbl_IMG_Peli_1.setIcon(CatalogoAudiovisual.obtenerImagenPelicula(num_peli,lbl_IMG_Peli_1.getWidth(),lbl_IMG_Peli_1.getHeight()));
					lbl_IMG_Peli_1.setVisible(true);
					num_peli_enlacep1=num_peli;
					num_peli++;
					// lbl_IMG_Peli_2
					lbl_IMG_Peli_2.setVisible(false);
					lbl_IMG_Peli_2.setIcon(CatalogoAudiovisual.obtenerImagenPelicula(num_peli,lbl_IMG_Peli_2.getWidth(),lbl_IMG_Peli_2.getHeight()));
					lbl_IMG_Peli_2.setVisible(true);
					num_peli_enlacep2=num_peli;
					num_peli++;
					// lbl_IMG_Peli_3
					lbl_IMG_Peli_3.setVisible(false);
					lbl_IMG_Peli_3.setIcon(CatalogoAudiovisual.obtenerImagenPelicula(num_peli,lbl_IMG_Peli_3.getWidth(),lbl_IMG_Peli_3.getHeight()));
					lbl_IMG_Peli_3.setVisible(true);
					num_peli_enlacep3=num_peli;
					num_peli++;
					// lbl_IMG_Peli_4
					lbl_IMG_Peli_4.setVisible(false);
					lbl_IMG_Peli_4.setIcon(CatalogoAudiovisual.obtenerImagenPelicula(num_peli,lbl_IMG_Peli_4.getWidth(),lbl_IMG_Peli_4.getHeight()));
					lbl_IMG_Peli_4.setVisible(true);
					num_peli_enlacep4=num_peli;
					num_peli++;
					// lbl_IMG_Peli_5
					lbl_IMG_Peli_5.setVisible(false);
					lbl_IMG_Peli_5.setIcon(CatalogoAudiovisual.obtenerImagenPelicula(num_peli,lbl_IMG_Peli_5.getWidth(),lbl_IMG_Peli_5.getHeight()));
					lbl_IMG_Peli_5.setVisible(true);
					num_peli_enlacep5=num_peli;
					num_peli++;
				} else {
					// reinicio contador
					contador=0;
					num_peli=0;
					// lbl_IMG_Peli_1
					lbl_IMG_Peli_1.setVisible(false);
					lbl_IMG_Peli_1.setIcon(CatalogoAudiovisual.obtenerImagenPelicula(num_peli,lbl_IMG_Peli_1.getWidth(),lbl_IMG_Peli_1.getHeight()));
					lbl_IMG_Peli_1.setVisible(true);
					num_peli_enlacep1=num_peli;
					num_peli++;
					// lbl_IMG_Peli_2
					lbl_IMG_Peli_2.setVisible(false);
					lbl_IMG_Peli_2.setIcon(CatalogoAudiovisual.obtenerImagenPelicula(num_peli,lbl_IMG_Peli_2.getWidth(),lbl_IMG_Peli_2.getHeight()));
					lbl_IMG_Peli_2.setVisible(true);
					num_peli_enlacep2=num_peli;
					num_peli++;
					// lbl_IMG_Peli_3
					lbl_IMG_Peli_3.setVisible(false);
					lbl_IMG_Peli_3.setIcon(CatalogoAudiovisual.obtenerImagenPelicula(num_peli,lbl_IMG_Peli_3.getWidth(),lbl_IMG_Peli_3.getHeight()));
					lbl_IMG_Peli_3.setVisible(true);
					num_peli_enlacep3=num_peli;
					num_peli++;
					// lbl_IMG_Peli_4
					lbl_IMG_Peli_4.setVisible(false);
					lbl_IMG_Peli_4.setIcon(CatalogoAudiovisual.obtenerImagenPelicula(num_peli,lbl_IMG_Peli_4.getWidth(),lbl_IMG_Peli_4.getHeight()));
					lbl_IMG_Peli_4.setVisible(true);
					num_peli_enlacep4=num_peli;
					num_peli++;
					// lbl_IMG_Peli_5
					lbl_IMG_Peli_5.setVisible(false);
					lbl_IMG_Peli_5.setIcon(CatalogoAudiovisual.obtenerImagenPelicula(num_peli,lbl_IMG_Peli_5.getWidth(),lbl_IMG_Peli_5.getHeight()));
					lbl_IMG_Peli_5.setVisible(true);
					num_peli_enlacep5=num_peli;
				}
			}
		});
		btn_Recarga_Peli.setBorderPainted(false);
		btn_Recarga_Peli.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_Recarga_Peli.setContentAreaFilled(false);
		btn_Recarga_Peli.setBounds(79, 117, 50, 50);
		// AJUSTAR IMAGEN AL CONTENIDO
		ImageIcon recarga_Peli = new ImageIcon(getClass().getResource("/Trilogy_imagenes/actualizacion.png")); // CREACIÓN NUEVO OBJETO CON LA RUTA DE LA IMAGEN
		ImageIcon imgRecarga_Peli = new ImageIcon(recarga_Peli.getImage().getScaledInstance(btn_Recarga_Peli.getWidth(), btn_Recarga_Peli.getHeight(), Image.SCALE_SMOOTH)); // CREAMOS OTRO OBJETO PARA QUE SE AJUSTE AUTOMATICAMENTE LA IMAGEN
		btn_Recarga_Peli.setIcon(imgRecarga_Peli);
		// ----------------------------------------------------------------------------------------
		// btn_Recarga_Serie cambia las series
		// ----------------------------------------------------------------------------------------
		btn_Recarga_Serie = new JButton("");
		btn_Recarga_Serie.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_Recarga_Serie.setContentAreaFilled(true);
				btn_Recarga_Serie.setBackground(new Color(255, 255, 255, 160));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btn_Recarga_Serie.setContentAreaFilled(false);
			}
		});
		btn_Recarga_Serie.setBorderPainted(false);
		btn_Recarga_Serie.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_Recarga_Serie.setContentAreaFilled(false);
		btn_Recarga_Serie.setBounds(79, 333, 50, 50);
		// AJUSTAR IMAGEN AL CONTENIDO
		ImageIcon recarga_Serie = new ImageIcon(getClass().getResource("/Trilogy_imagenes/actualizacion.png")); // CREACIÓN NUEVO OBJETO CON LA RUTA DE LA IMAGEN
		ImageIcon imgRecarga_Serie = new ImageIcon(recarga_Serie.getImage().getScaledInstance(btn_Recarga_Serie.getWidth(), btn_Recarga_Serie.getHeight(), Image.SCALE_SMOOTH)); // CREAMOS OTRO OBJETO PARA QUE SE AJUSTE AUTOMATICAMENTE LA IMAGEN
		btn_Recarga_Serie.setIcon(imgRecarga_Serie);
		// ----------------------------------------------------------------------------------------
		// btn_Recarga_Musica cambia las musicas
		// ----------------------------------------------------------------------------------------
		btn_Recarga_Musica = new JButton("");
		btn_Recarga_Musica.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_Recarga_Musica.setContentAreaFilled(true);
				btn_Recarga_Musica.setBackground(new Color(255, 255, 255, 160));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btn_Recarga_Musica.setContentAreaFilled(false);
			}
		});
		btn_Recarga_Musica.setBorderPainted(false);
		btn_Recarga_Musica.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_Recarga_Musica.setContentAreaFilled(false);
		btn_Recarga_Musica.setBounds(79, 551, 50, 50);
		// AJUSTAR IMAGEN AL CONTENIDO
		ImageIcon recarga_Musica = new ImageIcon(getClass().getResource("/Trilogy_imagenes/actualizacion.png")); // CREACIÓN NUEVO OBJETO CON LA RUTA DE LA IMAGEN
		ImageIcon imgRecarga_Musica = new ImageIcon(recarga_Musica.getImage().getScaledInstance(btn_Recarga_Musica.getWidth(), btn_Recarga_Musica.getHeight(), Image.SCALE_SMOOTH)); // CREAMOS OTRO OBJETO PARA QUE SE AJUSTE AUTOMATICAMENTE LA IMAGEN
		btn_Recarga_Musica.setIcon(imgRecarga_Musica);
		// ----------------------------------------------------------------------------------------
		// GERARQUÍA DEL panel_contenedor
		// ----------------------------------------------------------------------------------------
		panel_contenedor.add(lblTextoCancion5);
		panel_contenedor.add(lblTextoCancion3);
		panel_contenedor.add(lblTextoCancion4);
		panel_contenedor.add(lblTextoCancion2);
		panel_contenedor.add(lblTextoCancion1);
		panel_contenedor.add(btn_Recarga_Musica);
		panel_contenedor.add(btn_Recarga_Serie);
		panel_contenedor.add(btn_Recarga_Peli);
		panel_contenedor.add(lbl_IMG_Music_5);
		panel_contenedor.add(lbl_IMG_Serie_5);
		panel_contenedor.add(lbl_IMG_Peli_5);
		panel_contenedor.add(lbl_IMG_Music_4);
		panel_contenedor.add(lbl_IMG_Music_3);
		panel_contenedor.add(lbl_IMG_Serie_4);
		panel_contenedor.add(lbl_IMG_Serie_3);
		panel_contenedor.add(lbl_IMG_Peli_4);
		panel_contenedor.add(lbl_IMG_Peli_3);
		panel_contenedor.add(lbl_IMG_Music_2);
		panel_contenedor.add(lbl_IMG_Serie_2);
		panel_contenedor.add(lbl_IMG_Peli_2);
		panel_contenedor.add(lbl_IMG_Music_1);
		panel_contenedor.add(lbl_TXT_Musica);
		panel_contenedor.add(lbl_IMG_Serie_1);
		panel_contenedor.add(lbl_TXT_Series);
		panel_contenedor.add(lbl_IMG_Peli_1);
		panel_contenedor.add(lbl_TXT_Peliculas);
		panel_contenedor.add(lbl_Fondo);
		contentPane.add(panel_contenedor);
	}
}