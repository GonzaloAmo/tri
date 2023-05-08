package Inicio_RubiStandarCod;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import cat_audiovisual.CatalogoAudiovisual;
import seleccion_pelicula.Seleccion_pelicula;

import java.awt.Cursor;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
/**
 * En la página de Inicio Rubí Standar podrás consumir contenido audiovisual de películas  y con un botón de recarga cambiara el contenido audiovisual.
 * @param contentPane CONTIENE TODOS LOS ATRIBUTOS DE LA PÁGINA.
 * @param panel_contenedor CONTIENE TODOS LOS ATRIBUTOS PARA PODER INTERCAMBIAR PANELES SIN COMPLICACIÓN.
 * @param lblFondo_Rojo TIENE LA IMAGEN DE FONDO DE LA PÁGINA.
 * @param lbl_LoMasNuevo TIENE EL TEXTO DE -LO MÁS NUEVO-.
 * @param  lbl_TOP10 TIENE EL TEXTO DE -TOP 5 ÚLTIMO MES-.
 * @param lbl_IMGPelicula1 TIENE LA IMAGEN DE LA PELÍCULA QUE SE VA A REPRODUCIR
 * @param lbl_IMGPelicula2 TIENE LA IMAGEN DE LA PELÍCULA QUE SE VA A REPRODUCIR
 * @param lbl_IMGPelicula3 TIENE LA IMAGEN DE LA PELÍCULA QUE SE VA A REPRODUCIR
 * @param lbl_IMGPelicula4 TIENE LA IMAGEN DE LA PELÍCULA QUE SE VA A REPRODUCIR
 * @param lbl_IMGPelicula5 TIENE LA IMAGEN DE LA PELÍCULA QUE SE VA A REPRODUCIR
 * @param lbl_IMGPelicula6 TIENE LA IMAGEN DE LA PELÍCULA QUE SE VA A REPRODUCIR
 * @param lbl_IMGPelicula7 TIENE LA IMAGEN DE LA PELÍCULA QUE SE VA A REPRODUCIR
 * @param lbl_IMGPelicula8 TIENE LA IMAGEN DE LA PELÍCULA QUE SE VA A REPRODUCIR
 * @param lbl_IMGPelicula9 TIENE LA IMAGEN DE LA PELÍCULA QUE SE VA A REPRODUCIR
 * @param lbl_IMGPelicula10 TIENE LA IMAGEN DE LA PELÍCULA QUE SE VA A REPRODUCIR
 * @param btn_Recarga1 CAMBIA LAS PELÍCULAS DE -LO MÁS NUEVO-
 * @param btn_Recarga2 CAMBIA LAS PELICULAS DE -TOP 5 ÚLTIMO MES-
 * @author TRILOGY. Miembros: Adrian Leal Vacas, Gonzalo Amo Cano y Raul Senso Montojo.
 */
public class Inicio_RubiStandar extends JFrame {
	/**
	 * Es la versión número 1 de la página del contenido audiovisual del Inicio Rubí Standar
	 */
	private static final long serialVersionUID = 1L;
	// ----------------------------------------------------------------------------------------
	// ATRIBUTOS
	// ----------------------------------------------------------------------------------------
	private JPanel contentPane;
	private JPanel Panel_RubiStandar;
	private JLabel lbl_IMGPelicula1;
	private JLabel lbl_IMGPelicula2;
	private JLabel lbl_IMGPelicula3;
	private JLabel lbl_IMGPelicula4;
	private JLabel lbl_IMGPelicula5;
	private JLabel lbl_IMGPelicula6;
	private JLabel lbl_IMGPelicula7;
	private JLabel lbl_IMGPelicula8;
	private JLabel lbl_IMGPelicula9;
	private JLabel lbl_IMGPelicula10;
	private JLabel lbl_TOP10;
	private JLabel lbl_LoMasNuevo;
	private JButton btn_Recarga1;
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
	public JPanel getPanel_RubiStandar() {
		return Panel_RubiStandar;
	}
	public void setPanel_RubiStandar(JPanel panel_RubiStandar) {
		Panel_RubiStandar = panel_RubiStandar;
	}
	// ----------------------------------------------------------------------------------------
	// METODO MAIN
	// ----------------------------------------------------------------------------------------
	/**
	 * En el método main ejecutamos la ventana principal Inicio_RubiStandar.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio_RubiStandar frame = new Inicio_RubiStandar();
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
	 * En el constructor Inicio_RubiStandar() están todos los atributos y métodos necesarios para cuando creemos el objeto tenga toda la funcionalidades.
	 */
	public Inicio_RubiStandar() {
		setResizable(false);
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 977, 703);
		contentPane = new JPanel();
		//------------------------------------------------------------------------------------------------------------	
		//PANEL RUBÍ STANDAR
		//------------------------------------------------------------------------------------------------------------	
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//------------------------------------------------------------------------------------------------------------	
		// Panel Administrador
		//------------------------------------------------------------------------------------------------------------	
		Panel_RubiStandar = new JPanel();
		Panel_RubiStandar.setBounds(0, 0, 961, 664);
		contentPane.add(Panel_RubiStandar);
		Panel_RubiStandar.setLayout(null);
		//------------------------------------------------------------------------------------------------------------	
		//TITULOS PELÍCULAS
		//------------------------------------------------------------------------------------------------------------	
		// ----------------------------------------------------------------------------------------
		// lbl_LoMasNuevo TIENE EL TEXTO DE -LO MÁS NUEVO-
		// ----------------------------------------------------------------------------------------
		lbl_LoMasNuevo = new JLabel("LO MÁS NUEVO");
		lbl_LoMasNuevo.setOpaque(true);
		lbl_LoMasNuevo.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_LoMasNuevo.setFont(new Font("Tahoma", Font.BOLD, 14)); 
		lbl_LoMasNuevo.setBorder(new LineBorder(new Color(211, 211, 211)));
		lbl_LoMasNuevo.setBackground(new Color(204, 255, 204));
		lbl_LoMasNuevo.setBounds(107, 58, 812, 30);
		// ----------------------------------------------------------------------------------------
		// lbl_TOP10 TIENE EL TEXTO DE -TOP 5 ÚLTIMO MES-
		// ----------------------------------------------------------------------------------------
		lbl_TOP10 = new JLabel("TOP 5 ÚLTIMO MES");
		lbl_TOP10.setOpaque(true);
		lbl_TOP10.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_TOP10.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_TOP10.setBorder(new LineBorder(new Color(211, 211, 211)));
		lbl_TOP10.setBackground(new Color(204, 255, 204));
		lbl_TOP10.setBounds(107, 362, 812, 30);		
		//------------------------------------------------------------------------------------------------------------	
		//PELÍCULAS
		//------------------------------------------------------------------------------------------------------------	
		//------------------------------------------------------------------------------------------------------------	
		//lbl_IMGPelicula10 TIENE LA IMAGEN DE LA PELÍCULA QUE SE VA A REPRODUCIR
		//------------------------------------------------------------------------------------------------------------	
		lbl_IMGPelicula10 = new JLabel("Frozen IMG");
		lbl_IMGPelicula10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_IMGPelicula10.setBounds(767, 425, 142, 182);
		lbl_IMGPelicula10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*File path = new File ("./src/diamante_prmiunm/peliculas/megan.mp4"); // RUTA DEL TRAILER
				    try {
						Desktop.getDesktop().open(path); // ABRE LA PELICULA EN EL EDITOR POR DEFECTO DE TU ORDENADRO
					} catch (IOException e1) {
						e1.printStackTrace();
					}*/
				ruta_peli=CatalogoAudiovisual.devolverRutaPeli(14);
				Seleccion_pelicula prueba = new Seleccion_pelicula();
				prueba.setVisible(true);
			}
		});
		// AJUSTAR IMAGEN AL CONTENIDO
		lbl_IMGPelicula10.setIcon(CatalogoAudiovisual.obtenerImagenPelicula(14,lbl_IMGPelicula10.getWidth(),lbl_IMGPelicula10.getHeight()));
		//------------------------------------------------------------------------------------------------------------	
		//lbl_IMGPelicula9 TIENE LA IMAGEN DE LA PELÍCULA QUE SE VA A REPRODUCIR
		//------------------------------------------------------------------------------------------------------------	
		lbl_IMGPelicula9 = new JLabel("Los Vengadores IMG");
		lbl_IMGPelicula9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_IMGPelicula9.setBounds(605, 425, 142, 182);
		lbl_IMGPelicula9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*File path = new File ("./src/diamante_prmiunm/peliculas/megan.mp4"); // RUTA DEL TRAILER
				    try {
						Desktop.getDesktop().open(path); // ABRE LA PELICULA EN EL EDITOR POR DEFECTO DE TU ORDENADRO
					} catch (IOException e1) {
						e1.printStackTrace();
					}*/
				ruta_peli=CatalogoAudiovisual.devolverRutaPeli(13);
				Seleccion_pelicula prueba = new Seleccion_pelicula();
				prueba.setVisible(true);
			}
		});
		// AJUSTAR IMAGEN AL CONTENIDO
		lbl_IMGPelicula9.setIcon(CatalogoAudiovisual.obtenerImagenPelicula(13,lbl_IMGPelicula9.getWidth(),lbl_IMGPelicula9.getHeight()));
		//------------------------------------------------------------------------------------------------------------	
		//lbl_IMGPelicula8 TIENE LA IMAGEN DE LA PELÍCULA QUE SE VA A REPRODUCIR
		//------------------------------------------------------------------------------------------------------------	
		lbl_IMGPelicula8 = new JLabel("Shazam! IMG");
		lbl_IMGPelicula8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_IMGPelicula8.setBounds(443, 425, 142, 182);
		lbl_IMGPelicula8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*File path = new File ("./src/diamante_prmiunm/peliculas/megan.mp4"); // RUTA DEL TRAILER
				    try {
						Desktop.getDesktop().open(path); // ABRE LA PELICULA EN EL EDITOR POR DEFECTO DE TU ORDENADRO
					} catch (IOException e1) {
						e1.printStackTrace();
					}*/
				ruta_peli=CatalogoAudiovisual.devolverRutaPeli(12);
				Seleccion_pelicula prueba = new Seleccion_pelicula();
				prueba.setVisible(true);
			}
		});
		// AJUSTAR IMAGEN AL CONTENIDO
		lbl_IMGPelicula8.setIcon(CatalogoAudiovisual.obtenerImagenPelicula(12,lbl_IMGPelicula8.getWidth(),lbl_IMGPelicula8.getHeight()));
		//------------------------------------------------------------------------------------------------------------	
		//lbl_IMGPelicula7 TIENE LA IMAGEN DE LA PELÍCULA QUE SE VA A REPRODUCIR
		//------------------------------------------------------------------------------------------------------------	
		lbl_IMGPelicula7 = new JLabel("Black Adam");
		lbl_IMGPelicula7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_IMGPelicula7.setBounds(280, 425, 142, 182);
		lbl_IMGPelicula7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*File path = new File ("./src/diamante_prmiunm/peliculas/megan.mp4"); // RUTA DEL TRAILER
				    try {
						Desktop.getDesktop().open(path); // ABRE LA PELICULA EN EL EDITOR POR DEFECTO DE TU ORDENADRO
					} catch (IOException e1) {
						e1.printStackTrace();
					}*/
				ruta_peli=CatalogoAudiovisual.devolverRutaPeli(11);
				Seleccion_pelicula prueba = new Seleccion_pelicula();
				prueba.setVisible(true);
			}
		});
		// AJUSTAR IMAGEN AL CONTENIDO
		lbl_IMGPelicula7.setIcon(CatalogoAudiovisual.obtenerImagenPelicula(11,lbl_IMGPelicula7.getWidth(),lbl_IMGPelicula7.getHeight()));
		//------------------------------------------------------------------------------------------------------------	
		//lbl_IMGPelicula6 TIENE LA IMAGEN DE LA PELÍCULA QUE SE VA A REPRODUCIR
		//------------------------------------------------------------------------------------------------------------	
		lbl_IMGPelicula6 = new JLabel("Buscando a Nemo");
		lbl_IMGPelicula6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_IMGPelicula6.setBounds(117, 425, 142, 182);
		lbl_IMGPelicula6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*File path = new File ("./src/diamante_prmiunm/peliculas/megan.mp4"); // RUTA DEL TRAILER
				    try {
						Desktop.getDesktop().open(path); // ABRE LA PELICULA EN EL EDITOR POR DEFECTO DE TU ORDENADRO
					} catch (IOException e1) {
						e1.printStackTrace();
					}*/
				ruta_peli=CatalogoAudiovisual.devolverRutaPeli(10);
				Seleccion_pelicula prueba = new Seleccion_pelicula();
				prueba.setVisible(true);
			}
		});
		// AJUSTAR IMAGEN AL CONTENIDO
		lbl_IMGPelicula6.setIcon(CatalogoAudiovisual.obtenerImagenPelicula(10,lbl_IMGPelicula6.getWidth(),lbl_IMGPelicula6.getHeight()));
		//------------------------------------------------------------------------------------------------------------	
		//lbl_IMGPelicula5 TIENE LA IMAGEN DE LA PELÍCULA QUE SE VA A REPRODUCIR
		//------------------------------------------------------------------------------------------------------------	
		lbl_IMGPelicula5 = new JLabel("Por Siempre Jamás");
		lbl_IMGPelicula5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_IMGPelicula5.setBounds(767, 122, 142, 182);
		lbl_IMGPelicula5.addMouseListener(new MouseAdapter() {
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
		lbl_IMGPelicula5.setIcon(CatalogoAudiovisual.obtenerImagenPelicula(4,lbl_IMGPelicula5.getWidth(),lbl_IMGPelicula5.getHeight()));
		//------------------------------------------------------------------------------------------------------------	
		//lbl_IMGPelicula4 TIENE LA IMAGEN DE LA PELÍCULA QUE SE VA A REPRODUCIR
		//------------------------------------------------------------------------------------------------------------	
		lbl_IMGPelicula4 = new JLabel("Scream");
		lbl_IMGPelicula4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_IMGPelicula4.setBounds(605, 122, 142, 182);
		lbl_IMGPelicula4.addMouseListener(new MouseAdapter() {
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
		lbl_IMGPelicula4.setIcon(CatalogoAudiovisual.obtenerImagenPelicula(3,lbl_IMGPelicula4.getWidth(),lbl_IMGPelicula4.getHeight()));
		//------------------------------------------------------------------------------------------------------------	
		//lbl_IMGPelicula3 TIENE LA IMAGEN DE LA PELÍCULA QUE SE VA A REPRODUCIR
		//------------------------------------------------------------------------------------------------------------	
		lbl_IMGPelicula3 = new JLabel("Operacion Reno");
		lbl_IMGPelicula3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_IMGPelicula3.setBounds(443, 122, 142, 182);
		lbl_IMGPelicula3.addMouseListener(new MouseAdapter() {
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
		lbl_IMGPelicula3.setIcon(CatalogoAudiovisual.obtenerImagenPelicula(2,lbl_IMGPelicula3.getWidth(),lbl_IMGPelicula3.getHeight()));
		//------------------------------------------------------------------------------------------------------------	
		//lbl_IMGPelicula2 TIENE LA IMAGEN DE LA PELÍCULA QUE SE VA A REPRODUCIR
		//------------------------------------------------------------------------------------------------------------	
		lbl_IMGPelicula2 = new JLabel("Cisne Negro");
		lbl_IMGPelicula2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_IMGPelicula2.setBounds(280, 122, 142, 182);
		lbl_IMGPelicula2.addMouseListener(new MouseAdapter() {
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
		lbl_IMGPelicula2.setIcon(CatalogoAudiovisual.obtenerImagenPelicula(1,lbl_IMGPelicula2.getWidth(),lbl_IMGPelicula2.getHeight()));
		//------------------------------------------------------------------------------------------------------------	
		//lbl_IMGPelicula1 TIENE LA IMAGEN DE LA PELÍCULA QUE SE VA A REPRODUCIR
		//------------------------------------------------------------------------------------------------------------	
		lbl_IMGPelicula1 = new JLabel("Delciosa Martha");
		lbl_IMGPelicula1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_IMGPelicula1.setBounds(117, 122, 142, 182);
		lbl_IMGPelicula1.addMouseListener(new MouseAdapter() {
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
		lbl_IMGPelicula1.setIcon(CatalogoAudiovisual.obtenerImagenPelicula(0,lbl_IMGPelicula1.getWidth(),lbl_IMGPelicula1.getHeight()));
		//------------------------------------------------------------------------------------------------------------	
		// IMAGEN DE FONDO DE LA VENTANA RUBÍ STANDAR
		//------------------------------------------------------------------------------------------------------------		
		JLabel lblFondo_Rojo = new JLabel();
		ImageIcon fondo1 = new ImageIcon(getClass().getResource("/Trilogy_imagenes/Fondo_Rubi_Standar.jpg"));// DIRECCION DE LA IMAGEN QUE QUIERO AJUSTAR
		lblFondo_Rojo.setBounds(0, 0, 961, 664);
		ImageIcon imgfondo = new ImageIcon(fondo1.getImage().getScaledInstance(lblFondo_Rojo.getWidth(), lblFondo_Rojo.getHeight(), Image.SCALE_SMOOTH)); // CREAMOS OTRO OBJETO PARA QUE SE AJUSTE AUTOMATICAMENTE LA IMAGEN AL LABEL
		lblFondo_Rojo.setIcon(imgfondo);
		//------------------------------------------------------------------------------------------------------------	
		// BOTONES DE ACTUALIZACIÓN DEL CONTENIDO
		//------------------------------------------------------------------------------------------------------------	
		//------------------------------------------------------------------------------------------------------------
		//btn_Recarga1 CAMBIA LAS PELÍCULAS DE -LO MÁS NUEVO-
		//------------------------------------------------------------------------------------------------------------	
		contador=0;
		btn_Recarga1 = new JButton("");
		btn_Recarga1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_Recarga1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_Recarga1.setContentAreaFilled(true);
				btn_Recarga1.setBackground(new Color(255, 255, 255, 160));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btn_Recarga1.setContentAreaFilled(false);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				// incremento contador cada vez que se pulsa
				contador+=1;
				if(contador==1) {
					num_peli=5;
					// lbl_IMG_Peli_1
					lbl_IMGPelicula1.setVisible(false);
					lbl_IMGPelicula1.setIcon(CatalogoAudiovisual.obtenerImagenPelicula(num_peli,lbl_IMGPelicula1.getWidth(),lbl_IMGPelicula1.getHeight()));
					lbl_IMGPelicula1.setVisible(true);
					num_peli_enlacep1=num_peli;
					num_peli++;
					// lbl_IMG_Peli_2
					lbl_IMGPelicula2.setVisible(false);
					lbl_IMGPelicula2.setIcon(CatalogoAudiovisual.obtenerImagenPelicula(num_peli,lbl_IMGPelicula2.getWidth(),lbl_IMGPelicula2.getHeight()));
					lbl_IMGPelicula2.setVisible(true);
					num_peli_enlacep2=num_peli;
					num_peli++;
					// lbl_IMG_Peli_3
					lbl_IMGPelicula3.setVisible(false);
					lbl_IMGPelicula3.setIcon(CatalogoAudiovisual.obtenerImagenPelicula(num_peli,lbl_IMGPelicula3.getWidth(),lbl_IMGPelicula3.getHeight()));
					lbl_IMGPelicula3.setVisible(true);
					num_peli_enlacep3=num_peli;
					num_peli++;
					// lbl_IMG_Peli_4
					lbl_IMGPelicula4.setVisible(false);
					lbl_IMGPelicula4.setIcon(CatalogoAudiovisual.obtenerImagenPelicula(num_peli,lbl_IMGPelicula4.getWidth(),lbl_IMGPelicula4.getHeight()));
					lbl_IMGPelicula4.setVisible(true);
					num_peli_enlacep4=num_peli;
					num_peli++;
					// lbl_IMG_Peli_5
					lbl_IMGPelicula5.setVisible(false);
					lbl_IMGPelicula5.setIcon(CatalogoAudiovisual.obtenerImagenPelicula(num_peli,lbl_IMGPelicula5.getWidth(),lbl_IMGPelicula5.getHeight()));
					lbl_IMGPelicula5.setVisible(true);
					num_peli_enlacep5=num_peli;
				} else if (contador==2) {
					num_peli=10;
					// lbl_IMG_Peli_1
					lbl_IMGPelicula1.setVisible(false);
					lbl_IMGPelicula1.setIcon(CatalogoAudiovisual.obtenerImagenPelicula(num_peli,lbl_IMGPelicula1.getWidth(),lbl_IMGPelicula1.getHeight()));
					lbl_IMGPelicula1.setVisible(true);
					num_peli_enlacep1=num_peli;
					num_peli++;
					// lbl_IMG_Peli_2
					lbl_IMGPelicula2.setVisible(false);
					lbl_IMGPelicula2.setIcon(CatalogoAudiovisual.obtenerImagenPelicula(num_peli,lbl_IMGPelicula2.getWidth(),lbl_IMGPelicula2.getHeight()));
					lbl_IMGPelicula2.setVisible(true);
					num_peli_enlacep2=num_peli;
					num_peli++;
					// lbl_IMG_Peli_3
					lbl_IMGPelicula3.setVisible(false);
					lbl_IMGPelicula3.setIcon(CatalogoAudiovisual.obtenerImagenPelicula(num_peli,lbl_IMGPelicula3.getWidth(),lbl_IMGPelicula3.getHeight()));
					lbl_IMGPelicula3.setVisible(true);
					num_peli_enlacep3=num_peli;
					num_peli++;
					// lbl_IMG_Peli_4
					lbl_IMGPelicula4.setVisible(false);
					lbl_IMGPelicula4.setIcon(CatalogoAudiovisual.obtenerImagenPelicula(num_peli,lbl_IMGPelicula4.getWidth(),lbl_IMGPelicula4.getHeight()));
					lbl_IMGPelicula4.setVisible(true);
					num_peli_enlacep4=num_peli;
					num_peli++;
					// lbl_IMG_Peli_5
					lbl_IMGPelicula5.setVisible(false);
					lbl_IMGPelicula5.setIcon(CatalogoAudiovisual.obtenerImagenPelicula(num_peli,lbl_IMGPelicula5.getWidth(),lbl_IMGPelicula5.getHeight()));
					lbl_IMGPelicula5.setVisible(true);
					num_peli_enlacep5=num_peli;
					num_peli++;
				} else {
					// reinicio contador
					contador=0;
					num_peli=0;
					// lbl_IMG_Peli_1
					lbl_IMGPelicula1.setVisible(false);
					lbl_IMGPelicula1.setIcon(CatalogoAudiovisual.obtenerImagenPelicula(num_peli,lbl_IMGPelicula1.getWidth(),lbl_IMGPelicula1.getHeight()));
					lbl_IMGPelicula1.setVisible(true);
					num_peli_enlacep1=num_peli;
					num_peli++;
					// lbl_IMG_Peli_2
					lbl_IMGPelicula2.setVisible(false);
					lbl_IMGPelicula2.setIcon(CatalogoAudiovisual.obtenerImagenPelicula(num_peli,lbl_IMGPelicula2.getWidth(),lbl_IMGPelicula2.getHeight()));
					lbl_IMGPelicula2.setVisible(true);
					num_peli_enlacep2=num_peli;
					num_peli++;
					// lbl_IMG_Peli_3
					lbl_IMGPelicula3.setVisible(false);
					lbl_IMGPelicula3.setIcon(CatalogoAudiovisual.obtenerImagenPelicula(num_peli,lbl_IMGPelicula3.getWidth(),lbl_IMGPelicula3.getHeight()));
					lbl_IMGPelicula3.setVisible(true);
					num_peli_enlacep3=num_peli;
					num_peli++;
					// lbl_IMG_Peli_4
					lbl_IMGPelicula4.setVisible(false);
					lbl_IMGPelicula4.setIcon(CatalogoAudiovisual.obtenerImagenPelicula(num_peli,lbl_IMGPelicula4.getWidth(),lbl_IMGPelicula4.getHeight()));
					lbl_IMGPelicula4.setVisible(true);
					num_peli_enlacep4=num_peli;
					num_peli++;
					// lbl_IMG_Peli_5
					lbl_IMGPelicula5.setVisible(false);
					lbl_IMGPelicula5.setIcon(CatalogoAudiovisual.obtenerImagenPelicula(num_peli,lbl_IMGPelicula5.getWidth(),lbl_IMGPelicula5.getHeight()));
					lbl_IMGPelicula5.setVisible(true);
					num_peli_enlacep5=num_peli;
				}
			}
		});
		btn_Recarga1.setContentAreaFilled(false);
		btn_Recarga1.setBorderPainted(false);
		btn_Recarga1.setBounds(39, 180, 50, 50);
		// AJUSTAR IMAGEN AL CONTENIDO
		ImageIcon recarga1 = new ImageIcon(getClass().getResource("/Trilogy_imagenes/actualizacion.png")); // CREACIÓN NUEVO OBJETO CON LA RUTA DE LA IMAGEN
		ImageIcon imgRecarga1 = new ImageIcon(recarga1.getImage().getScaledInstance(btn_Recarga1.getWidth(), btn_Recarga1.getHeight(), Image.SCALE_SMOOTH)); // CREAMOS OTRO OBJETO PARA QUE SE AJUSTE AUTOMATICAMENTE LA IMAGEN
		btn_Recarga1.setIcon(imgRecarga1);
		//------------------------------------------------------------------------------------------------------------
		// GERARQUIA DEL Panel_RubiStandar
		//------------------------------------------------------------------------------------------------------------
		Panel_RubiStandar.add(btn_Recarga1);
		Panel_RubiStandar.add(lbl_LoMasNuevo);
		Panel_RubiStandar.add(lbl_TOP10);
		Panel_RubiStandar.add(lbl_IMGPelicula10);
		Panel_RubiStandar.add(lbl_IMGPelicula9);
		Panel_RubiStandar.add(lbl_IMGPelicula8);
		Panel_RubiStandar.add(lbl_IMGPelicula7);
		Panel_RubiStandar.add(lbl_IMGPelicula6);
		Panel_RubiStandar.add(lbl_IMGPelicula5);
		Panel_RubiStandar.add(lbl_IMGPelicula4);
		Panel_RubiStandar.add(lbl_IMGPelicula3);
		Panel_RubiStandar.add(lbl_IMGPelicula2);
		Panel_RubiStandar.add(lbl_IMGPelicula1);
		Panel_RubiStandar.add(lblFondo_Rojo);
	}
}