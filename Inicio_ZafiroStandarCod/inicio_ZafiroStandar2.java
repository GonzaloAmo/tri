package Inicio_ZafiroStandarCod;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
/**
 * En la página de Inicio Zafiro Standar podrás consumir contenido audiovisual de series  y con un botón de recarga cambiara el contenido audiovisual.
 * @param contentPane CONTIENE TODOS LOS ATRIBUTOS DE LA PÁGINA.
 * @param panel_contenedor CONTIENE TODOS LOS ATRIBUTOS PARA PODER INTERCAMBIAR PANELES SIN COMPLICACIÓN.
 * @param lblFondo_Rojo TIENE LA IMAGEN DE FONDO DE LA PÁGINA.
 * @param lbl_LoMasNuevo TIENE EL TEXTO DE -LO MÁS NUEVO-.
 * @param  lbl_TOP10 TIENE EL TEXTO DE -TOP 10 ÚLTIMO MES-.
 * @param lbl_IMGSerie1 TIENE LA IMAGEN DE LA SERIE QUE SE VA A REPRODUCIR
 * @param lbl_IMGSerie2 TIENE LA IMAGEN DE LA SERIE QUE SE VA A REPRODUCIR
 * @param lbl_IMGSerie3 TIENE LA IMAGEN DE LA SERIE QUE SE VA A REPRODUCIR
 * @param lbl_IMGSerie4 TIENE LA IMAGEN DE LA SERIE QUE SE VA A REPRODUCIR
 * @param lbl_IMGSerie5 TIENE LA IMAGEN DE LA SERIE QUE SE VA A REPRODUCIR
 * @param lbl_IMGSerie6 TIENE LA IMAGEN DE LA SERIE QUE SE VA A REPRODUCIR
 * @param lbl_IMGSerie7 TIENE LA IMAGEN DE LA SERIE QUE SE VA A REPRODUCIR
 * @param lbl_IMGSerie8 TIENE LA IMAGEN DE LA SERIE QUE SE VA A REPRODUCIR
 * @param lbl_IMGSerie9 TIENE LA IMAGEN DE LA SERIE QUE SE VA A REPRODUCIR
 * @param lbl_IMGSerie10 TIENE LA IMAGEN DE LA SERIE QUE SE VA A REPRODUCIR
 * @param btn_Recarga1 CAMBIA LAS SERIES DE -LO MÁS NUEVO-
 * @param btn_Recarga2 CAMBIA LAS SerieS DE -TOP 5 ÚLTIMO MES-
 * @author TRILOGY. Miembros: Adrian Leal Vacas, Gonzalo Amo Cano y Raul Senso Montojo.
 */
public class inicio_ZafiroStandar2 extends JFrame {
		/**
		 * Es la versión número 2 de la página del contenido audiovisual del Inicio Zafiro Standar
		 */
	private static final long serialVersionUID = 1L;
	// ----------------------------------------------------------------------------------------
	// ATRIBUTOS
	// ----------------------------------------------------------------------------------------
		private JPanel contentPane;
		private JButton btn_Recarga1;
		private JButton btn_Recarga2;
		private JLabel lbl_IMGSerie1;
		private JLabel lbl_IMGSerie2;
		private JLabel lbl_IMGSerie3;
		private JLabel lbl_IMGSerie4;
		private JLabel lbl_IMGSerie5;
		private JLabel lbl_IMGSerie6;
		private JLabel lbl_IMGSerie7;
		private JLabel lbl_IMGSerie8;
		private JLabel lbl_IMGSerie9;
		private JLabel lbl_IMGSerie10;
		private JPanel Panel_ZafiroStandar;
		private JLabel lbl_LoMasNuevo;
		private JLabel lbl_TOP5;
	// ----------------------------------------------------------------------------------------
	// GETTERS AND SETTERS
	// ----------------------------------------------------------------------------------------
		public JPanel getPanel_ZafiroStandar() {
			return Panel_ZafiroStandar;
		}
	
		public void setPanel_ZafiroStandar(JPanel panel_ZafiroStandar) {
			Panel_ZafiroStandar = panel_ZafiroStandar;
		}
	// ----------------------------------------------------------------------------------------
	// METODO MAIN
	// ----------------------------------------------------------------------------------------
		/**
		 *  En el método main ejecutamos la ventana principal Inicio_ZafiroStandar2.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						inicio_ZafiroStandar2 frame = new inicio_ZafiroStandar2();
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
		 * En el constructor Inicio_ZafiroStandar2() están todos los atributos y métodos necesarios para cuando creemos el objeto tenga toda la funcionalidades.
		 */
		public inicio_ZafiroStandar2() {
			setResizable(false);
			setType(Type.UTILITY);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 1145, 703);
			contentPane = new JPanel();
	//------------------------------------------------------------------------------------------------------------	
	//PANEL ZAFIRO STANDAR
	//------------------------------------------------------------------------------------------------------------	
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//------------------------------------------------------------------------------------------------------------	
		// Panel Administrador
		//------------------------------------------------------------------------------------------------------------	
		Panel_ZafiroStandar = new JPanel();
		Panel_ZafiroStandar.setBounds(0, 0, 1130, 663);
		contentPane.add(Panel_ZafiroStandar);
		Panel_ZafiroStandar.setLayout(null);
	//------------------------------------------------------------------------------------------------------------	
	//TITULOS SERIES
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
		lbl_LoMasNuevo.setBounds(180, 50, 853, 30);
		// ----------------------------------------------------------------------------------------
		// lbl_TOP10 TIENE EL TEXTO DE -TOP 5 ÚLTIMO MES-
		// ----------------------------------------------------------------------------------------
		lbl_TOP5 = new JLabel("TOP 5 ÚLTIMO MES");
		lbl_TOP5.setOpaque(true);
		lbl_TOP5.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_TOP5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_TOP5.setBorder(new LineBorder(new Color(211, 211, 211)));
		lbl_TOP5.setBackground(new Color(204, 255, 204));
		lbl_TOP5.setBounds(180, 345, 853, 30);
	//------------------------------------------------------------------------------------------------------------	
	//SERIES
	//------------------------------------------------------------------------------------------------------------	
		//------------------------------------------------------------------------------------------------------------	
		//lbl_IMGSerie10 TIENE LA IMAGEN DE LA SERIE QUE SE VA A REPRODUCIR
		//------------------------------------------------------------------------------------------------------------
		lbl_IMGSerie10 = new JLabel("Mandalorian IMG");
		lbl_IMGSerie10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			lbl_IMGSerie10.setBounds(881, 416, 142, 182);
		// AJUSTAR IMAGEN AL CONTENIDO
		ImageIcon Mandalorian= new ImageIcon(getClass().getResource("/inicio_ZafiroStandarCod/imagenes/IMG_Serie_10.jpg")); // CREACIÓN NUEVO OBJETO CON LA RUTA DE LA IMAGEN
		ImageIcon imgMandalorian = new ImageIcon(Mandalorian.getImage().getScaledInstance(lbl_IMGSerie10.getWidth(), lbl_IMGSerie10.getHeight(), Image.SCALE_SMOOTH)); // CREAMOS OTRO OBJETO PARA QUE SE AJUSTE AUTOMATICAMENTE LA IMAGEN
		lbl_IMGSerie10.setIcon(imgMandalorian);
		//------------------------------------------------------------------------------------------------------------	
		//lbl_IMGSerie10 TIENE LA IMAGEN DE LA SERIE QUE SE VA A REPRODUCIR
		//------------------------------------------------------------------------------------------------------------
		lbl_IMGSerie9 = new JLabel("The Last of Us IMG");
		lbl_IMGSerie9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_IMGSerie9.setBounds(711, 416, 142, 182);
		// AJUSTAR IMAGEN AL CONTENIDO
		ImageIcon lastofus = new ImageIcon(getClass().getResource("/inicio_ZafiroStandarCod/imagenes/IMG_Serie_9.jpg")); // CREACIÓN NUEVO OBJETO CON LA RUTA DE LA IMAGEN
		ImageIcon imglastofus = new ImageIcon(lastofus.getImage().getScaledInstance(lbl_IMGSerie9.getWidth(), lbl_IMGSerie9.getHeight(), Image.SCALE_SMOOTH)); // CREAMOS OTRO OBJETO PARA QUE SE AJUSTE AUTOMATICAMENTE LA IMAGEN
		lbl_IMGSerie9.setIcon(imglastofus);
		//------------------------------------------------------------------------------------------------------------	
		//lbl_IMGSerie10 TIENE LA IMAGEN DE LA SERIE QUE SE VA A REPRODUCIR
		//------------------------------------------------------------------------------------------------------------
		lbl_IMGSerie8 = new JLabel("Cronicas Vampiricas IMG");
		lbl_IMGSerie8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_IMGSerie8.setBounds(539, 416, 142, 182);
		// AJUSTAR IMAGEN AL CONTENIDO
		ImageIcon cronicasvampiricas = new ImageIcon(getClass().getResource("/inicio_ZafiroStandarCod/imagenes/IMG_Serie_8.jpg")); // CREACIÓN NUEVO OBJETO CON LA RUTA DE LA IMAGEN
		ImageIcon imgcronicasvampiricas = new ImageIcon(cronicasvampiricas.getImage().getScaledInstance(lbl_IMGSerie8.getWidth(), lbl_IMGSerie8.getHeight(), Image.SCALE_SMOOTH)); // CREAMOS OTRO OBJETO PARA QUE SE AJUSTE AUTOMATICAMENTE LA IMAGEN
		lbl_IMGSerie8.setIcon(imgcronicasvampiricas);
		//------------------------------------------------------------------------------------------------------------	
		//lbl_IMGSerie10 TIENE LA IMAGEN DE LA SERIE QUE SE VA A REPRODUCIR
		//------------------------------------------------------------------------------------------------------------
		lbl_IMGSerie7 = new JLabel("Stranger Things");
		lbl_IMGSerie7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_IMGSerie7.setBounds(367, 416, 142, 182);
		// AJUSTAR IMAGEN AL CONTENIDO
		ImageIcon strangerthings = new ImageIcon(getClass().getResource("/inicio_ZafiroStandarCod/imagenes/IMG_Serie_7.jpg")); // CREACIÓN NUEVO OBJETO CON LA RUTA DE LA IMAGEN
		ImageIcon imgstrangerthings = new ImageIcon(strangerthings.getImage().getScaledInstance(lbl_IMGSerie7.getWidth(), lbl_IMGSerie7.getHeight(), Image.SCALE_SMOOTH)); // CREAMOS OTRO OBJETO PARA QUE SE AJUSTE AUTOMATICAMENTE LA IMAGEN
		lbl_IMGSerie7.setIcon(imgstrangerthings);
		//------------------------------------------------------------------------------------------------------------	
		//lbl_IMGSerie10 TIENE LA IMAGEN DE LA SERIE QUE SE VA A REPRODUCIR
		//------------------------------------------------------------------------------------------------------------
		lbl_IMGSerie6 = new JLabel("Friends IMG");
		lbl_IMGSerie6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_IMGSerie6.setBounds(195, 416, 142, 182);
		// AJUSTAR IMAGEN AL CONTENIDO
		ImageIcon friends = new ImageIcon(getClass().getResource("/inicio_ZafiroStandarCod/imagenes/IMG_Serie_6.jpg")); // CREACIÓN NUEVO OBJETO CON LA RUTA DE LA IMAGEN
		ImageIcon imgfriends = new ImageIcon(friends.getImage().getScaledInstance(lbl_IMGSerie6.getWidth(), lbl_IMGSerie6.getHeight(), Image.SCALE_SMOOTH)); // CREAMOS OTRO OBJETO PARA QUE SE AJUSTE AUTOMATICAMENTE LA IMAGEN
		lbl_IMGSerie6.setIcon(imgfriends);
		//------------------------------------------------------------------------------------------------------------	
		//lbl_IMGSerie10 TIENE LA IMAGEN DE LA SERIE QUE SE VA A REPRODUCIR
		//------------------------------------------------------------------------------------------------------------
		lbl_IMGSerie5 = new JLabel("Superstore IMG");
		lbl_IMGSerie5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_IMGSerie5.setBounds(881, 121, 142, 182);
		// AJUSTAR IMAGEN AL CONTENIDO
		ImageIcon superstore = new ImageIcon(getClass().getResource("/inicio_ZafiroStandarCod/imagenes/IMG_Serie_5.jpg")); // CREACIÓN NUEVO OBJETO CON LA RUTA DE LA IMAGEN
		ImageIcon imgsuperstore = new ImageIcon(superstore.getImage().getScaledInstance(lbl_IMGSerie5.getWidth(), lbl_IMGSerie5.getHeight(), Image.SCALE_SMOOTH)); // CREAMOS OTRO OBJETO PARA QUE SE AJUSTE AUTOMATICAMENTE LA IMAGEN
		lbl_IMGSerie5.setIcon(imgsuperstore);
		//------------------------------------------------------------------------------------------------------------	
		//lbl_IMGSerie10 TIENE LA IMAGEN DE LA SERIE QUE SE VA A REPRODUCIR
		//------------------------------------------------------------------------------------------------------------
		lbl_IMGSerie4 = new JLabel("And Just Like That IMG");
		lbl_IMGSerie4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_IMGSerie4.setBounds(711, 121, 142, 182);
		// AJUSTAR IMAGEN AL CONTENIDO
		ImageIcon andjustlikethat = new ImageIcon(getClass().getResource("/inicio_ZafiroStandarCod/imagenes/IMG_Serie_4.jpg")); // CREACIÓN NUEVO OBJETO CON LA RUTA DE LA IMAGEN
		ImageIcon imgandjustlikethat = new ImageIcon(andjustlikethat.getImage().getScaledInstance(lbl_IMGSerie4.getWidth(), lbl_IMGSerie4.getHeight(), Image.SCALE_SMOOTH)); // CREAMOS OTRO OBJETO PARA QUE SE AJUSTE AUTOMATICAMENTE LA IMAGEN
		lbl_IMGSerie4.setIcon(imgandjustlikethat);
		//------------------------------------------------------------------------------------------------------------	
		//lbl_IMGSerie10 TIENE LA IMAGEN DE LA SERIE QUE SE VA A REPRODUCIR
		//------------------------------------------------------------------------------------------------------------
		lbl_IMGSerie3 = new JLabel("Dos chicas sin Blanca IMG");
		lbl_IMGSerie3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_IMGSerie3.setBounds(539, 121, 142, 182);
		// AJUSTAR IMAGEN AL CONTENIDO
		ImageIcon doschicassinblanca = new ImageIcon(getClass().getResource("/inicio_ZafiroStandarCod/imagenes/IMG_Serie_3.jpg")); // CREACIÓN NUEVO OBJETO CON LA RUTA DE LA IMAGEN
		ImageIcon imgdoschicassinblanca = new ImageIcon(doschicassinblanca.getImage().getScaledInstance(lbl_IMGSerie3.getWidth(), lbl_IMGSerie3.getHeight(), Image.SCALE_SMOOTH)); // CREAMOS OTRO OBJETO PARA QUE SE AJUSTE AUTOMATICAMENTE LA IMAGEN
		lbl_IMGSerie3.setIcon(imgdoschicassinblanca);
		//------------------------------------------------------------------------------------------------------------	
		//lbl_IMGSerie10 TIENE LA IMAGEN DE LA SERIE QUE SE VA A REPRODUCIR
		//------------------------------------------------------------------------------------------------------------
		lbl_IMGSerie2 = new JLabel("The Office IMG");
		lbl_IMGSerie2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_IMGSerie2.setBounds(367, 121, 142, 182);
		// AJUSTAR IMAGEN AL CONTENIDO
		ImageIcon theoffice = new ImageIcon(getClass().getResource("/inicio_ZafiroStandarCod/imagenes/IMG_Serie_2.jpg")); // CREACIÓN NUEVO OBJETO CON LA RUTA DE LA IMAGEN
		ImageIcon imgtheoffice = new ImageIcon(theoffice.getImage().getScaledInstance(lbl_IMGSerie2.getWidth(), lbl_IMGSerie2.getHeight(), Image.SCALE_SMOOTH)); // CREAMOS OTRO OBJETO PARA QUE SE AJUSTE AUTOMATICAMENTE LA IMAGEN
		lbl_IMGSerie2.setIcon(imgtheoffice);
		//------------------------------------------------------------------------------------------------------------	
		//lbl_IMGSerie10 TIENE LA IMAGEN DE LA SERIE QUE SE VA A REPRODUCIR
		//------------------------------------------------------------------------------------------------------------
		lbl_IMGSerie1 = new JLabel("La Señora Maisel IMG");
		lbl_IMGSerie1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_IMGSerie1.setBounds(195, 121, 142, 182);
		// AJUSTAR IMAGEN AL CONTENIDO
		ImageIcon señoramaisel = new ImageIcon(getClass().getResource("/inicio_ZafiroStandarCod/imagenes/IMG_Serie_1.jpg")); // CREACIÓN NUEVO OBJETO CON LA RUTA DE LA IMAGEN
		ImageIcon imgseñoramaisel = new ImageIcon(señoramaisel.getImage().getScaledInstance(lbl_IMGSerie1.getWidth(), lbl_IMGSerie1.getHeight(), Image.SCALE_SMOOTH)); // CREAMOS OTRO OBJETO PARA QUE SE AJUSTE AUTOMATICAMENTE LA IMAGEN
		lbl_IMGSerie1.setIcon(imgseñoramaisel);
	//------------------------------------------------------------------------------------------------------------	
	// IMAGEN DE FONDO DE LA VENTANA ZAFIRO STANDAR
	//------------------------------------------------------------------------------------------------------------		
		JLabel lblFondo_Azul = new JLabel();
		lblFondo_Azul.setBounds(0, 0, 1280, 664);
		ImageIcon fondo1 = new ImageIcon(getClass().getResource("/Trilogy_imagenes/azulyverde.jpg"));// DIRECCION DE LA IMAGEN QUE QUIERO AJUSTAR
		ImageIcon imgfondo = new ImageIcon(fondo1.getImage().getScaledInstance(lblFondo_Azul.getWidth(), lblFondo_Azul.getHeight(), Image.SCALE_SMOOTH)); // CREAMOS OTRO OBJETO PARA QUE SE AJUSTE AUTOMATICAMENTE LA IMAGEN AL LABEL
		lblFondo_Azul.setIcon(imgfondo);
	//------------------------------------------------------------------------------------------------------------	
	// BOTONES DE ACTUALIZACIÓN DEL CONTENIDO
	//------------------------------------------------------------------------------------------------------------	
		//------------------------------------------------------------------------------------------------------------
		//btn_Recarga1 CAMBIA LAS SERIES DE -LO MÁS NUEVO-
		//------------------------------------------------------------------------------------------------------------
		btn_Recarga1 = new JButton("");
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
		});
		btn_Recarga1.setContentAreaFilled(false);
		btn_Recarga1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_Recarga1.setBorderPainted(false);
		btn_Recarga1.setBounds(69, 171, 50, 50);
		// AJUSTAR IMAGEN AL CONTENIDO
		ImageIcon recarga1 = new ImageIcon(getClass().getResource("/Trilogy_imagenes/actualizacion.png")); // CREACIÓN NUEVO OBJETO CON LA RUTA DE LA IMAGEN
		ImageIcon imgRecarga1 = new ImageIcon(recarga1.getImage().getScaledInstance(btn_Recarga1.getWidth(), btn_Recarga1.getHeight(), Image.SCALE_SMOOTH)); // CREAMOS OTRO OBJETO PARA QUE SE AJUSTE AUTOMATICAMENTE LA IMAGEN
		btn_Recarga1.setIcon(imgRecarga1);
		//------------------------------------------------------------------------------------------------------------
		//btn_Recarga2 CAMBIA LAS SERIES DE -TOP 5 ÚLTIMO MES-
		//------------------------------------------------------------------------------------------------------------	
		btn_Recarga2 = new JButton("");
		btn_Recarga2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_Recarga2.setContentAreaFilled(true);
				btn_Recarga2.setBackground(new Color(255, 255, 255, 160));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btn_Recarga2.setContentAreaFilled(false);
			}
		});
		btn_Recarga2.setContentAreaFilled(false);
		btn_Recarga2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_Recarga2.setBorderPainted(false);
		btn_Recarga2.setBounds(69, 467, 50, 50);
		// AJUSTAR IMAGEN AL CONTENIDO
		ImageIcon recarga2 = new ImageIcon(getClass().getResource("/Trilogy_imagenes/actualizacion.png")); // CREACIÓN NUEVO OBJETO CON LA RUTA DE LA IMAGEN
		ImageIcon imgRecarga2 = new ImageIcon(recarga2.getImage().getScaledInstance(btn_Recarga2.getWidth(), btn_Recarga2.getHeight(), Image.SCALE_SMOOTH)); // CREAMOS OTRO OBJETO PARA QUE SE AJUSTE AUTOMATICAMENTE LA IMAGEN
		btn_Recarga2.setIcon(imgRecarga2);
	// ----------------------------------------------------------------------------------------
	// GERARQUÍA DEL panel_contenedor
	// ----------------------------------------------------------------------------------------
		Panel_ZafiroStandar.add(btn_Recarga2);
		Panel_ZafiroStandar.add(btn_Recarga1);
		Panel_ZafiroStandar.add(lbl_LoMasNuevo);
		Panel_ZafiroStandar.add(lbl_TOP5);
		Panel_ZafiroStandar.add(lbl_IMGSerie10);
		Panel_ZafiroStandar.add(lbl_IMGSerie9);
		Panel_ZafiroStandar.add(lbl_IMGSerie8);
		Panel_ZafiroStandar.add(lbl_IMGSerie7);
		Panel_ZafiroStandar.add(lbl_IMGSerie6);
		Panel_ZafiroStandar.add(lbl_IMGSerie5);
		Panel_ZafiroStandar.add(lbl_IMGSerie4);
		Panel_ZafiroStandar.add(lbl_IMGSerie3);
		Panel_ZafiroStandar.add(lbl_IMGSerie2);
		Panel_ZafiroStandar.add(lbl_IMGSerie1);
		Panel_ZafiroStandar.add(lblFondo_Azul);
	}
}