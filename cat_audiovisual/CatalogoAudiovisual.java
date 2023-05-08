package cat_audiovisual;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import java.awt.Image;
import java.util.ArrayList;

public class CatalogoAudiovisual {
	// ATRIBUTO
	private static ArrayList<String> RUTAS_IMAGENES_PELI = new ArrayList<String>() {
		/**
		 * @since 19/04/2023
		 */
		private static final long serialVersionUID = 1L;
		{
			add("/diamante_premium/peliculas/megan.jpg");
			add("/diamante_premium/peliculas/Black_Adam.jpg");
			add("/diamante_premium/peliculas/escuadron_suicida.jpg");
			add("/diamante_premium/peliculas/fast_furious_hobbs_shaw.jpg");
			add("/diamante_premium/peliculas/jungla_de_cristal.jpg");
			add("/diamante_premium/peliculas/avatar_agua.jpg");
			add("/diamante_premium/peliculas/oso_vicioso.jpg");
			add("/diamante_premium/peliculas/super_mario_bros.jpg");
			add("/diamante_premium/peliculas/65.jpg");
			add("/diamante_premium/peliculas/dungeons_and_dragons.jpg");
			add("/diamante_premium/peliculas/el_exorcista_del_papa.jpg");
			add("/diamante_premium/peliculas/fast_and_furious_x.jpg");
			add("/diamante_premium/peliculas/gato_con_botas.jpg");
			add("/diamante_premium/peliculas/john_wick_4.jpg");
			add("/diamante_premium/peliculas/maridos.jpg");
		}};
		private static ArrayList<String> RUTAS_IMAGENES_CAPITULOS = new ArrayList<String>() {
			/**
			 * @since 19/04/2023
			 */
			private static final long serialVersionUID = 1L;
			{
				add("/diamante_premium/peliculas/megan.jpg");
				add("/diamante_premium/peliculas/Black_Adam.jpg");
				add("/diamante_premium/peliculas/escuadron_suicida.jpg");
				add("/diamante_premium/peliculas/fast_furious_hobbs_shaw.jpg");
				add("/diamante_premium/peliculas/jungla_de_cristal.jpg");
				add("/diamante_premium/peliculas/avatar_agua.jpg");
				add("/diamante_premium/peliculas/oso_vicioso.jpg");
				add("/diamante_premium/peliculas/super_mario_bros.jpg");
				add("/diamante_premium/peliculas/65.jpg");
				add("/diamante_premium/peliculas/dungeons_and_dragons.jpg");
				add("/diamante_premium/peliculas/el_exorcista_del_papa.jpg");
				add("/diamante_premium/peliculas/fast_and_furious_x.jpg");
				add("/diamante_premium/peliculas/gato_con_botas.jpg");
				add("/diamante_premium/peliculas/john_wick_4.jpg");
				add("/diamante_premium/peliculas/maridos.jpg");
			}};
			private static ArrayList<String> RUTAS_IMAGENES_MUSICA = new ArrayList<String>() {
				/**
				 * @since 19/04/2023
				 */
				private static final long serialVersionUID = 1L;
				{
					add("/Cristal_Basic/Portadas/Despechá.png");
					add("/Cristal_Basic/Portadas/PlayaDelInglés.png");
					add("/Cristal_Basic/Portadas/LaInocente.png");
					add("/Cristal_Basic/Portadas/tqg.png");
					add("/Cristal_Basic/Portadas/Cupido.png");
					add("/Cristal_Basic/Portadas/SouceBoyz.png");
					add("/Cristal_Basic/Portadas/LykeMike.png");
					add("/Cristal_Basic/Portadas/Unveranosinti.png");
					add("/Cristal_Basic/Portadas/dondequieroestar.png");
					add("/Cristal_Basic/Portadas/caminando_por_la_vida.jpg");
					add("/Cristal_Basic/Portadas/soldadito_marinero.jpg");
					add("/Cristal_Basic/Portadas/una_vaina_loca.jpg");
					add("/Cristal_Basic/Portadas/3men2_kbrn.jpg");
					add("/Cristal_Basic/Portadas/jijantes.jpg");
					add("/Cristal_Basic/Portadas/mi_estralla_blanca.jpg");
				}};
				private static ArrayList<String> RUTAS_IMAGENES_ALBUM = new ArrayList<String>() {
					/**
					 * @since 19/04/2023
					 */
					private static final long serialVersionUID = 1L;
					{
						add("/Cristal_Basic/Portadas/dondequieroestar.png");
						add("/Cristal_Basic/Portadas/Paraiso.png");
						add("/Cristal_Basic/Portadas/LykeMike.png");
						add("/Cristal_Basic/Portadas/YHLQMDLG.png");
						add("/Cristal_Basic/Portadas/SouceBoyz.png");
						add("/Cristal_Basic/Portadas/feliz_cumpleaños_ferxxo.jpg");
						add("/Cristal_Basic/Portadas/las_leyendas_nunca_mueren.jpg");
						add("/Cristal_Basic/Portadas/Unveranosinti.png");
						add("/Cristal_Basic/Portadas/la_vida_es_una.jpg");
						add("/Cristal_Basic/Portadas/rr.jpg");
						add("/Cristal_Basic/Portadas/motomami.jpg");
						add("/Cristal_Basic/Portadas/bien_o_mal.jpg");
						add("/Cristal_Basic/Portadas/3men2_kbrn.jpg");
						add("/Cristal_Basic/Portadas/energia.jpg");
						add("/Cristal_Basic/Portadas/barrio_fino.jpg");
					}};
					private static ArrayList<String> nombre_canciones=new ArrayList<String>() {
						private static final long serialVersionUID = 1L;
						{
							add("DESPECHÁ");
							add("PLAYA DEL INGLÉS");
							add("LA INOCENTE");
							add("TQG");
							add("CUPIDO");
							add("SIN FRENOS");
							add("MÍRENME AHORA");
							add("TITÍ ME PREGUNTÓ");
							add("APA");
							add("CAMINANDO POR LA VIDA");
							add("SOLDADITO MARINERO");
							add("UNA VAINA LOCA");
							add("SI SALIMOS");
							add("HIMNO JIJANTES");
							add("MI ESTRELLA BLANCA");

						}};
						private static ArrayList<String> nombre_albumes=new ArrayList<String>() {
							private static final long serialVersionUID = 1L;
							{
								add("DONDE QUIERO ESTAR");
								add("PARAISO");
								add("LYKE MIKE");
								add("YHLQMDLG");
								add("SAUCE BOYZ");
								add("FELIZ CUMPLEAÑOS FERXXO");
								add("LAS LEYENDAS NUNCA MUEREN");
								add("UN VERANO SIN TI");
								add("LA VIDA ES UNA");
								add("RR");
								add("MOTOMAMI");
								add("BIEN O MAL");
								add("3MEN2 KBRN");
								add("ENERGÍA");
								add("BARRIO FINO");

							}};
							// METODOS
							public static void  obtenerTextoAlbum(int indice, JLabel label) {
								String texto = nombre_albumes.get(indice);
								label.setText(texto);
							}
							//ASIGNAR NOMBRE CANCION
							public static void  obtenerTextoCancion(int indice, JLabel label) {
								String texto = nombre_canciones.get(indice);
								label.setText(texto);
							}
							// DEVOLVER IMAGENICON PELI
							public static ImageIcon obtenerImagenPelicula(int indice, int width, int height) {
								ImageIcon imagen = new ImageIcon(CatalogoAudiovisual.class.getResource(RUTAS_IMAGENES_PELI.get(indice)));
								return new ImageIcon(imagen.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
							}
							// DEVOLVER IMAGENICON CAPITULOS
							public static ImageIcon obtenerImagenCapitulo(int indice, int width, int height) {
								ImageIcon imagen = new ImageIcon(CatalogoAudiovisual.class.getResource(RUTAS_IMAGENES_CAPITULOS.get(indice)));
								return new ImageIcon(imagen.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
							}
							// DEVOLVER IMAGENICON MÚSICA
							public static ImageIcon obtenerImagenMusica(int indice, int width, int height) {
								ImageIcon imagen = new ImageIcon(CatalogoAudiovisual.class.getResource(RUTAS_IMAGENES_MUSICA.get(indice)));
								return new ImageIcon(imagen.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
							}
							// DEVOLVER IMAGENICON ALBUM
							public static ImageIcon obtenerImagenAlbum(int indice, int width, int height) {
								ImageIcon imagen = new ImageIcon(CatalogoAudiovisual.class.getResource(RUTAS_IMAGENES_ALBUM.get(indice)));
								return new ImageIcon(imagen.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
							}
							// DEVOLVER RUTA PELI
							public static String devolverRutaPeli(int indice) {
								return RUTAS_IMAGENES_PELI.get(indice);
							}
							// DEVOLVER RUTA ALBUM
							public static String devolverRutaAlbum(int indice) {
								return RUTAS_IMAGENES_ALBUM.get(indice);
							}
							// DEVOLVER RUTA CAPITULO
							public static String devolverRutaCapitulo(int indice) {
								return RUTAS_IMAGENES_PELI.get(indice);
							}
							// DEVOLVER RUTA MUSICA
							public static String devolverRutaMusica(int indice) {
								return RUTAS_IMAGENES_PELI.get(indice);
							}
							// AGREGAR RUTA PELI
							public static void addStringPeli (String ruta) {
								RUTAS_IMAGENES_PELI.add(ruta);
							}
							// AGREGAR RUTA CAPITULO
							public static void addStringCapitulo (String ruta) {
								RUTAS_IMAGENES_PELI.add(ruta);
							}
							// AGREGAR RUTA MÚSICA
							public static void addStringMusica (String ruta) {
								RUTAS_IMAGENES_PELI.add(ruta);
							}
							// DEVOLVER POSICION +1 DEL ARRAYLIST
							public static String devolverID (String ruta) {
								String id_peli="P_";
								int id= RUTAS_IMAGENES_PELI.indexOf(ruta);
								if ((id+1)<=9) {
									id_peli+="00"+(id+1);
								} else if ((id+1)>=10 && id<=99) {
									id_peli+="0"+(id+1);
								} else {
									id_peli+=(id+1);
								}
								return id_peli;
							}
							// DEVOLVER POSICION +1 DEL ARRAYLIST num
							public static int devolverID_number (String ruta) {
								int id= RUTAS_IMAGENES_PELI.indexOf(ruta);
								return id;
							}
							public static int devolverID_number_album (String ruta) {
								int id= RUTAS_IMAGENES_ALBUM.indexOf(ruta);
								return id+1;
							}
							public static int devolverID_array (String ruta) {
								int id= RUTAS_IMAGENES_ALBUM.indexOf(ruta);
								return id;
							}
}