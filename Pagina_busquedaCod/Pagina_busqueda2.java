package Pagina_busquedaCod;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import java.awt.Cursor;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
/**
 * En la página de Página Búsqueda podrás buscar el contenido audiovisual (Películas,Seria o Música) según tu suscripción mensual, 
 * aparecen varios anuncios con contenido audiovisual propio como sugerencia.
 * @param contentPane CONTIENE TODOS LOS ATRIBUTOS DE LA PÁGINA.
 * @param panel_Pagina_busqueda CONTIENE TODOS LOS ATRIBUTOS PARA PODER INTERCAMBIAR PANELES SIN COMPLICACIÓN.
 * @param lblTexto_informativo TEXTO INFORMATIVO SOBRE LA PÁGINA DE BUSQUEDA.
 * @param lblTexto_informativo TEXTO ANUNCIO.
 * @param lblEnlace_Anuncio1 SUGERENCIA DE ANUNCIO 1.
 * @param lblEnlace_Anuncio2 SUGERENCIA DE ANUNCIO 2.
 * @param lblEnlace_Anuncio3 SUGERENCIA DE ANUNCIO 3.
 * @param lblEnlace_Anuncio4 SUGERENCIA DE ANUNCIO 3.
 * @param lblEnlace_Anuncio5 SUGERENCIA DE ANUNCIO 3.
 * @param comboBox_Ordenar TIPOS DE ORDENACIÓN AL REALIZAR LA BÚSQUEDA.
 * @param btnBuscar EL BOTÓN DE BUSCAR.
 * @param text_Barra_busqueda BARRA DE BÚSQUEDA.
 * @param lbl_Logo NUESTRO LOGO DE TRILOGY.
 * @param lblBordeSuperior BARRA VERDE SUPERIOR.
 * @param lblFondo_Verde FONDO COLOR VERDE.
 * @author TRILOGY. Miembros: Adrian Leal Vacas, Gonzalo Amo Cano y Raul Senso Montojo.
 */
public class Pagina_busqueda2 extends JFrame {
	/**
	 * Es la versión número 2 de la página del contenido audiovisual del Página Búsqueda.
	 */
		private static final long serialVersionUID = 1L;
	// ----------------------------------------------------------------------------------------
	// ATRIBUTOS
	// ----------------------------------------------------------------------------------------
		private JPanel contentPane;
		private JPanel panel_Pagina_busqueda;
		private JComboBox<String> comboBox_Ordenar;
		private JLabel lbl_Logo;
		private JLabel lblBordeSuperior;
		private JLabel lblFondo_Verde;
		private JLabel lblEnlace_Anuncio2;
		private JLabel lblEnlace_Anuncio3;
		private JLabel lblTexto_informativo;
		private JLabel lblTexto_Anuncio;
		private JLabel lblEnlace_Anuncio1;
		private JLabel lblEnlace_Anuncio4;
		private JLabel lblEnlace_Anuncio5;
		private JTextField text_Barra_Busqueda;
		private JButton btnBuscar;
	// ----------------------------------------------------------------------------------------
	// GETTERS AND SETTERS
	// ----------------------------------------------------------------------------------------
		public JPanel getPanel_Pagina_busqueda() {
			return panel_Pagina_busqueda;
		}
		public void setPanel_Pagina_busqueda(JPanel panel_Pagina_busqueda) {
			this.panel_Pagina_busqueda = panel_Pagina_busqueda;
		}
	// ----------------------------------------------------------------------------------------
	// MÉTODO MAIN
	// ----------------------------------------------------------------------------------------
		/**
	 	* En el método main ejecutamos la ventana principal Pagina_busqueda.
	 	*/
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Pagina_busqueda2 frame = new Pagina_busqueda2();
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
		 * En el constructor Pagina_busqueda2() están todos los atributos y métodos necesarios para cuando creemos el objeto tenga toda la funcionalidades.
		 */
		public Pagina_busqueda2() {
			setResizable(false);
			setType(Type.UTILITY);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 1145, 703);
			contentPane = new JPanel();
	//---------------------------------------------------------------------------------------------------------
	//PANEL PÁGINA DE BÚSQUEDA 2
	//---------------------------------------------------------------------------------------------------------	
		setContentPane(contentPane);
		panel_Pagina_busqueda = new JPanel();
		panel_Pagina_busqueda.setBounds(0, 0, 1130, 663);
	//---------------------------------------------------------------------------------------------------------
	//btnBuscar EL BOTÓN DE BUSCAR
	//---------------------------------------------------------------------------------------------------------
		btnBuscar = new JButton("BUSCAR");
		btnBuscar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBuscar.setBounds(990, 76, 104, 28);
	//---------------------------------------------------------------------------------------------------------
	//comboBox_Ordenar TIPOS DE ORDENACIÓN AL REALIZAR LA BÚSQUEDA
	//---------------------------------------------------------------------------------------------------------
		comboBox_Ordenar = new JComboBox<String>();
		comboBox_Ordenar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		comboBox_Ordenar.setBounds(973, 116, 121, 20);
		comboBox_Ordenar.setModel(new DefaultComboBoxModel<String>(new String[] {"- Más Popular", "- Más Relevante"})); //ARRAY QUE CONTIENE LAS DISTINTAS OPCIONES
	//---------------------------------------------------------------------------------------------------------
	//text_Barra_Busqueda BARRA DE BÚSQUEDA
	//---------------------------------------------------------------------------------------------------------
		text_Barra_Busqueda = new JTextField();
		text_Barra_Busqueda.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		text_Barra_Busqueda.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(text_Barra_Busqueda.getText().equalsIgnoreCase("¿Qué quieres buscar?...")) { //CONDICIÓN PARA QUE SE MANTENGA EL TEXTO DEL USUARIO SI LO HAN ESCRITO
					text_Barra_Busqueda.setText("");//SI EL TEXTO ESTÁ VACÍO
					text_Barra_Busqueda.setForeground(new Color( 0, 0, 0)); //COLOR NEGRO
					text_Barra_Busqueda.setBackground(new Color(255,255,255));//COLOR BLANCO
					}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (text_Barra_Busqueda.getText().length() == 0) { //CONDICIÓN PARA QUE SE MANTENGA EL TEXTO 
					text_Barra_Busqueda.setForeground(new Color(192, 192, 192));
					text_Barra_Busqueda.setText("¿Qué quieres buscar?...");
					text_Barra_Busqueda.setBackground(UIManager.getColor("TextField.background"));
					}
			}
		});
		text_Barra_Busqueda.setColumns(10);
		text_Barra_Busqueda.setBounds(493, 76, 502, 29);
	//---------------------------------------------------------------------------------------------------------
	//lblTexto_informativo TEXTO INFORMATIVO SOBRE LA PÁGINA DE BÚSQUEDA
	//---------------------------------------------------------------------------------------------------------
		lblTexto_informativo = new JLabel("<html><p style=\"color: #000000;\"> ¿Buscas un programa o una película en particular?<br>" //USO DE HTML PARA DARLE FORMA AL TEXTO, AÑADIMOS EL COLOR NEGRO PARA QUE SEA MÁS INTENSO
			       + " Si sabes lo que quieres ver, puedes usar la<br>" 
			       + " función de búsqueda. Selecciona el icono:BUSCAR<br>"
			       + " y escribe cualquiera de las siguientes opciones:<br>"
			       + "<br><br>" 
			       + " ►El nombre de una serie<br>"
			       + "<br>"
			       + " ►El título de una película<br>"
			       + "<br>"
			       + " ►El nombre de una cancíon o álbum<br>"
			       + "<br><br>" 
			       + " Si un perfil no tiene comprados los niveles superiores,<br>"
			       + " los resultados de la búsqueda podrán excluir las series y películas<br>"
			       + " que el perfil tiene permitido ver.</p>");
		lblTexto_informativo.setBounds(82, 233, 334, 386);
		lblTexto_informativo.setOpaque(true);//FONDO OPACO Y NO TRANSPARENTE QUE ES EL DE POR DEFECTO, ASÍ PODEMOS DARLE COLOR
		lblTexto_informativo.setBackground(new Color(153, 255, 153));//NUESTRO COLOR VERDE TRILOGY DE FONDO DEL CUADRO
		lblTexto_informativo.setFont(new Font("Helvetica", Font.ITALIC, 14));
		lblTexto_informativo.setBorder(BorderFactory.createLineBorder(Color.yellow,2));//BORDE DEL CUADRO DE TEXTO DE COLOR AMARILLO
	//------------------------------------------------------------------------------------------------------------	
	//lblTexto_informativo TEXTO ANUNCIO
	//------------------------------------------------------------------------------------------------------------		
		lblTexto_Anuncio = new JLabel("<html><p style=\"color: #000000, text-align:center;\"> ¿No sabes que ver?<br>"//USO DE HTML PARA DARLE FORMA AL TEXTO
				+ "Te sugerimos que mires...</p>");
		lblTexto_Anuncio.setBounds(481, 233, 436, 168);
		lblTexto_Anuncio.setOpaque(true);//FONDO OPACO Y NO TRANSPARENTE QUE ES EL DE POR DEFECTO, ASÍ PODEMOS DARLE COLOR
		lblTexto_Anuncio.setHorizontalAlignment(SwingConstants.CENTER);//TEXTO CENTRADO
		lblTexto_Anuncio.setFont(new Font("SansSerif", Font.PLAIN, 20));
		lblTexto_Anuncio.setBorder(BorderFactory.createLineBorder(Color.yellow,2));//BORDE DEL CUADRO DE TEXTO DE COLOR AMARILLO
		lblTexto_Anuncio.setBackground(new Color(153, 255, 153));	//NUESTRO COLOR VERDE TRILOGY DE FONDO DEL CUADRO
	//------------------------------------------------------------------------------------------------------------	
	//ANUNCIOS IMÁGENES
	//------------------------------------------------------------------------------------------------------------		
		//------------------------------------------------------------------------------------------------------------	
		//lblEnlace_Anuncio1 SUGERENCIA DE ANUNCIO 1
		//------------------------------------------------------------------------------------------------------------
		lblEnlace_Anuncio1 = new JLabel("Anuncio 1");
		lblEnlace_Anuncio1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblEnlace_Anuncio1.setBounds(481, 451, 130, 168);
		lblEnlace_Anuncio1.setOpaque(true);//FONDO OPACO Y NO TRANSPARENTE QUE ES EL DE POR DEFECTO, ASÍ PODEMOS DARLE COLOR(SE ELIMINA CUANDO TENGAMOS IMAGEN DEL ANUNCIO)
		lblEnlace_Anuncio1.setFont(new Font("SansSerif", Font.ITALIC, 14));
		lblEnlace_Anuncio1.setBackground(new Color(153, 255, 153));//NUESTRO COLOR VERDE TRILOGY DE FONDO DEL CUADRO(SE ELIMINA CUANDO TENGAMOS IMAGEN DEL ANUNCIO)
		//------------------------------------------------------------------------------------------------------------	
		//lblEnlace_Anuncio2 SUGERENCIA DE ANUNCIO 1
		//------------------------------------------------------------------------------------------------------------	
		lblEnlace_Anuncio2 = new JLabel("Anuncio 2");
		lblEnlace_Anuncio2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblEnlace_Anuncio2.setBounds(634, 451, 130, 168);
		lblEnlace_Anuncio2.setOpaque(true);
		lblEnlace_Anuncio2.setFont(new Font("SansSerif", Font.ITALIC, 14));
		lblEnlace_Anuncio2.setBackground(new Color(153, 255, 153));
		//------------------------------------------------------------------------------------------------------------	
		//lblEnlace_Anuncio3 SUGERENCIA DE ANUNCIO 1
		//------------------------------------------------------------------------------------------------------------
		lblEnlace_Anuncio3 = new JLabel("Anuncio 3");
		lblEnlace_Anuncio3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblEnlace_Anuncio3.setBounds(787, 451, 130, 168);
		lblEnlace_Anuncio3.setOpaque(true);
		lblEnlace_Anuncio3.setFont(new Font("SansSerif", Font.ITALIC, 14));
		lblEnlace_Anuncio3.setBackground(new Color(153, 255, 153));
		//------------------------------------------------------------------------------------------------------------	
		//lblEnlace_Anuncio4 SUGERENCIA DE ANUNCIO 1
		//------------------------------------------------------------------------------------------------------------
		lblEnlace_Anuncio4 = new JLabel("Anuncio 4");
		lblEnlace_Anuncio4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblEnlace_Anuncio4.setOpaque(true);
		lblEnlace_Anuncio4.setFont(new Font("SansSerif", Font.ITALIC, 14));
		lblEnlace_Anuncio4.setBackground(new Color(153, 255, 153));
		lblEnlace_Anuncio4.setBounds(938, 451, 130, 168);
		//------------------------------------------------------------------------------------------------------------	
		//lblEnlace_Anuncio5 SUGERENCIA DE ANUNCIO 1
		//------------------------------------------------------------------------------------------------------------
		lblEnlace_Anuncio5 = new JLabel("Anuncio 5");
		lblEnlace_Anuncio5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblEnlace_Anuncio5.setOpaque(true);
		lblEnlace_Anuncio5.setFont(new Font("SansSerif", Font.ITALIC, 14));
		lblEnlace_Anuncio5.setBackground(new Color(153, 255, 153));
		lblEnlace_Anuncio5.setBounds(938, 233, 130, 168);
	//---------------------------------------------------------------------------------------------------------
	//lblBordeSuperior BARRA COLOR VERDE SUPERIOR
	//---------------------------------------------------------------------------------------------------------	
		lblBordeSuperior = new JLabel();
		lblBordeSuperior.setBounds(0, 31, 1129, 124);
		lblBordeSuperior.setOpaque(true);
		lblBordeSuperior.setBackground(new Color(153, 255, 153)); //NUESTRO COLOR VERDE TRILOGY DE FONDO DEL CUADRO
	//---------------------------------------------------------------------------------------------------------
	//lblFondo_Verde FONDO COLOR VERDE
	//---------------------------------------------------------------------------------------------------------	
		lblFondo_Verde = new JLabel();
		lblFondo_Verde.setBounds(0, 0, 1130, 663);
		ImageIcon fondoverde = new ImageIcon(getClass().getResource("/Trilogy_imagenes/Fondo_Formulario.png"));// DIRECCIÓN DE LA IMAGEN QUE QUIERO AJUSTAR
		ImageIcon imgfondo = new ImageIcon(fondoverde.getImage().getScaledInstance(lblFondo_Verde.getWidth(), lblFondo_Verde.getHeight(), Image.SCALE_SMOOTH)); // CREAMOS OTRO OBJETO PARA QUE SE AJUSTE AUTOMATICAMENTE LA IMAGEN AL LABEL
		lblFondo_Verde.setIcon(imgfondo);
		contentPane.setLayout(null);
		panel_Pagina_busqueda.setLayout(null);
	//---------------------------------------------------------------------------------------------------------
	//lbl_Logo NUESTRO LOGO DE TRILOGY
	//---------------------------------------------------------------------------------------------------------				
		lbl_Logo = new JLabel();
		lbl_Logo.setBounds(65, 61, 408, 108);
		ImageIcon logo1 = new ImageIcon(getClass().getResource("/Trilogy_imagenes/LogoTrilogy.jpg"));// DIRECCIÓN DE LA IMAGEN QUE QUIERO AJUSTAR
		ImageIcon imgfondologo = new ImageIcon(logo1.getImage().getScaledInstance(lbl_Logo.getWidth(), lbl_Logo.getHeight(), Image.SCALE_SMOOTH));// CREAMOS OTRO OBJETO PARA QUE SE AJUSTE AUTOMATICAMENTE LA IMAGEN AL LABEL
		lbl_Logo.setIcon(imgfondologo);
	// ----------------------------------------------------------------------------------------
	// GERARQUÍA DEL panel_contenedor
	// ----------------------------------------------------------------------------------------	
		panel_Pagina_busqueda.add(lblEnlace_Anuncio5);
		panel_Pagina_busqueda.add(lblEnlace_Anuncio4);
		panel_Pagina_busqueda.add(lblEnlace_Anuncio3);
		panel_Pagina_busqueda.add(lblEnlace_Anuncio2);
		panel_Pagina_busqueda.add(lblEnlace_Anuncio1);
		panel_Pagina_busqueda.add(lblTexto_Anuncio);
		panel_Pagina_busqueda.add(lblTexto_informativo);
		panel_Pagina_busqueda.add(btnBuscar);
		panel_Pagina_busqueda.add(text_Barra_Busqueda);
		panel_Pagina_busqueda.add(comboBox_Ordenar);
		panel_Pagina_busqueda.add(lbl_Logo);
		panel_Pagina_busqueda.add(lblBordeSuperior);
		panel_Pagina_busqueda.add(lblFondo_Verde);
		contentPane.add(panel_Pagina_busqueda);
	}
}