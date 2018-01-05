package vista;

import java.io.ObjectInputStream.GetField;
import java.util.HashMap;
import java.util.HashSet;

import javax.swing.JOptionPane;

import datos.azafate;
import datos.cliente;
import datos.pasaje;
import datos.piloto;
import negocio.avion;
import negocio.vuelo;

public class main {

	public static void main(String[] args) {
		HashMap<String, cliente> clientes = new HashMap<String, cliente>();
		HashMap<String, piloto> pilotos = new HashMap<String, piloto>();
		HashMap<String, azafate> azafatas = new HashMap<String, azafate>();
		HashMap<cliente, pasaje> pasajes = new HashMap<cliente, pasaje>();
		HashMap<Integer, avion> aviones = new HashMap<Integer, avion>();
		HashMap<Integer, vuelo> vuelos = new HashMap<Integer, vuelo>();
		Object eo, oi, oa, ou;
		char nomChar;
		int nomInt;
		String n = "", r = "", na = "", ap = "", idi = "", am = "";
		Integer hdv = -1;
		int e = -1;
		do {

			Object[] opciones = new Object[] { "1.- Registrar Cliente", "2.- Registrar Personal de Cabina",
					"3.- Registrar Pasaje", "4.-Registrar Avion", "5.-Añadir Vuelo" };
			Object[] opcionespc = new Object[] { "1.-Ingresar un Piloto", "2.-Ingresar una Azafata" };
			Object[] opcionesvt = new Object[] { "1.-Piloto", "2.-Azafata" };
			Object[] opcionesv = new Object[] { "1.-Registrar vuelo", "2.-Ingresar Tripulantes de cabina",
					"3.-Ingresar pasajeros" };
			String[] options = { "Economico", "Ejecutivo" };

			eo = JOptionPane.showInputDialog(null, "Escoje la Opcion", "Sistema Aereo", JOptionPane.INFORMATION_MESSAGE,
					null, opciones, "1.-Registrar Cliente");
			switch (String.valueOf(eo).charAt(0)) {
			case '1':
				cliente cli = new cliente();
				while (r.equals("")) {
					r = JOptionPane.showInputDialog("Ingrese el Rut del Cliente");
					cli.setPerRut(r);
				}
				while (n.equals("")) {
					n = JOptionPane.showInputDialog("Ingrese el Nombre del Cliente");
					for (int i = 0; i < n.length(); i++) {
						nomChar = String.valueOf(n).charAt(i);
						nomInt = (int) nomChar;
						if (nomInt < 65 || nomInt > 122) {
							n = "";
							break;
						}
					}
					cli.setPerNombre(n);
				}
				JOptionPane.showMessageDialog(null,
						"Rut del Cliente: " + cli.getPerRut() + "\n Nombre del Cliente: " + cli.getPerNombre(),
						"Datos del Cliente", JOptionPane.DEFAULT_OPTION);
				clientes.put(r, cli);
				System.out.println(clientes);
				r = "";
				n = "";
				break;
			case '2':
				oi = JOptionPane.showInputDialog(null, "Seleccione Opcion", "Sistema Aereo",
						JOptionPane.INFORMATION_MESSAGE, null, opcionespc, "1.-Ingresar Piloto");
				switch (String.valueOf(oi).charAt(0)) {
				case '1':
					piloto pil = new piloto();
					while (r.equals("")) {
						r = JOptionPane.showInputDialog("Ingrese el Rut del Pilito");
						pil.setPerRut(r);
					}
					while (n.equals("")) {
						n = JOptionPane.showInputDialog("Ingrese El Nombre del Piloto");
						for (int i = 0; i < n.length(); i++) {
							nomChar = String.valueOf(n).charAt(i);
							nomInt = (int) nomChar;
							if (nomInt < 65 || nomInt > 122) {
								n = "";
								break;
							}
						}
						pil.setPerNombre(n);
					}
					while (ap.equals("")) {
						ap = JOptionPane.showInputDialog("Ingrese Apellido Paterno del Piloto");
						for (int i = 0; i < n.length(); i++) {
							nomChar = String.valueOf(ap).charAt(i);
							nomInt = (int) nomChar;
							if (nomInt < 65 || nomInt > 122) {
								ap = "";
								break;
							}
						}
						pil.setPerApePaterno(ap);
					}
					while (am.equals("")) {
						am = JOptionPane.showInputDialog("Ingrese Apellido Materno del Piloto");
						for (int i = 0; i < n.length(); i++) {
							nomChar = String.valueOf(am).charAt(i);
							nomInt = (int) nomChar;
							if (nomInt < 65 || nomInt > 122) {
								am = "";
								break;
							}
						}
						pil.setPerApeMaterno(am);
					}

					while (na.equals("")) {
						na = JOptionPane.showInputDialog("Ingrese su Nacionalidad");
						pil.setPerNacionalidad(na);
					}
					while (e < 21) {
						e = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Edad"));
						pil.setPerEdad(e);
					}
					while (hdv < 400) {
						hdv = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las Horas de Vuelo"));
						pil.setPilHorasVuelo(hdv);
					}
					pilotos.put(r, pil);
					System.out.println(pilotos);
					r = "";
					n = "";
					ap = "";
					am = "";
					na = "";
					e = -1;
					hdv = -1;
					break;

				case '2':
					azafate aza = new azafate();
					while (r.equals("")) {
						r = JOptionPane.showInputDialog("Ingrese el Rut de la Azafata");
						aza.setPerRut(r);
					}
					while (n.equals("")) {
						n = JOptionPane.showInputDialog("Ingrese El Nombre de la Azafata");
						for (int i = 0; i < n.length(); i++) {
							nomChar = String.valueOf(n).charAt(i);
							nomInt = (int) nomChar;
							if (nomInt < 65 || nomInt > 122) {
								n = "";
								break;
							}
						}
						aza.setPerNombre(n);
					}
					while (ap.equals("")) {
						ap = JOptionPane.showInputDialog("Ingrese Apellido del Piloto");
						for (int i = 0; i < n.length(); i++) {
							nomChar = String.valueOf(ap).charAt(i);
							nomInt = (int) nomChar;
							if (nomInt < 65 || nomInt > 122) {
								ap = "";
								break;
							}
						}
						aza.setPerApePaterno(ap);
					}
					while (am.equals("")) {
						am = JOptionPane.showInputDialog("Ingrese Apellido del Piloto");
						for (int i = 0; i < n.length(); i++) {
							nomChar = String.valueOf(am).charAt(i);
							nomInt = (int) nomChar;
							if (nomInt < 65 || nomInt > 122) {
								am = "";
								break;
							}
						}
						aza.setPerApeMaterno(am);
					}
					while (na.equals("")) {
						na = JOptionPane.showInputDialog("Ingrese su Nacionalidad");
						aza.setPerNacionalidad(na);
					}
					while (e < 21) {
						e = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Edad"));
						aza.setPerEdad(e);
					}
					while (idi.equals("")) {
						idi = JOptionPane.showInputDialog("Ingrese los Idiomas que Maneje");
						aza.setIdioma_manejo(idi);
					}
					azafatas.put(r, aza);
					System.out.println(azafatas);
					r = "";
					n = "";
					ap = "";
					am = "";
					na = "";
					e = -1;
					idi = "";
					break;
				}
				break;

			case '3':
				String des, fv, hv, nas, nv, v;
				pasaje pas = new pasaje(null);
				String rut = JOptionPane.showInputDialog("Ingrese el Rut del Cliente");
				if (clientes.containsKey(rut)) {
					pas.setCli(clientes.get(rut));
				} else {
					System.out.println("RUT incorrecto.");
					break;
				}

				int cat = JOptionPane.showOptionDialog(null, "Seleccione Categoria", "Sistema Aereo",
						JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, null);
				if (cat == 0) {
					pas.setPasClase("economico");
					des = JOptionPane.showInputDialog("Ingrese Destino del Vuelo");
					fv = JOptionPane.showInputDialog("Ingrese Fecha de Vuelo");
					hv = JOptionPane.showInputDialog("Ingresa la Hora del Vuelo");
					nas = JOptionPane.showInputDialog("Ingrese el Numero de Asiento");
					nv = JOptionPane.showInputDialog("Ingrese el Numero de Vuelo");
					v = JOptionPane.showInputDialog("Ingrese el Valor del Pasaje");
					pas.setPasDestino(des);
					pas.setPasFecVuelo(fv);
					pas.setPasHoraVuelo(hv);
					pas.setPasNumAsiento(Integer.parseInt(nas));
					pas.setPasNumeroVuelo(Integer.parseInt(nv));
					pas.setPasValor(Integer.parseInt(v));
					pasajes.put(pas.getCli(), pas);
					System.out.println(pasajes);
					des = "";
					fv = "";
					hv = "";
					nas = "";
					nv = "";
					v = "";
				}
				if (cat == 1) {
					pas.setPasClase("ejecutivo");
					des = JOptionPane.showInputDialog("Ingrese Destino del Vuelo");
					fv = JOptionPane.showInputDialog("Ingrese Fecha de Vuelo");
					hv = JOptionPane.showInputDialog("Ingresa la Hora del Vuelo");
					nas = JOptionPane.showInputDialog("Ingrese el Numero de Asiento");
					nv = JOptionPane.showInputDialog("Ingrese el Numero de Vuelo");
					v = JOptionPane.showInputDialog("Ingrese el Valor del Pasaje");
					pas.setPasDestino(des);
					pas.setPasFecVuelo(fv);
					pas.setPasHoraVuelo(hv);
					pas.setPasNumAsiento(Integer.parseInt(nas));
					pas.setPasNumeroVuelo(Integer.parseInt(nv));
					pas.setPasValor(Integer.parseInt(v));
					pasajes.put(pas.getCli(), pas);
					System.out.println(pasajes);
					des = "";
					fv = "";
					hv = "";
					nas = "";
					nv = "";
					v = "";
				}
				System.out.println(pas.toString());
				break;
			case '4':
				avion avi = new avion();
				Integer nda = -1, cdp = -1, ndh = -1, dda = -1;
				String mar = "", mo = "";
				nda = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de avion"));
				mar = JOptionPane.showInputDialog("Ingrese la marca del avion");
				mo = JOptionPane.showInputDialog("Ingrese el modelo del avion");
				cdp = Integer.parseInt(JOptionPane.showInputDialog("Indique la capacidad de pasajero"));
				ndh = Integer.parseInt(JOptionPane.showInputDialog("Indique el numero de helices"));
				dda = Integer.parseInt(JOptionPane.showInputDialog("Indique la distancias de asientos"));
				avi.setAvinumeroavion(nda);
				avi.setAviMarca(mar);
				avi.setAviModdelo(mo);
				avi.setAviCapacidadPasajero(cdp);
				avi.setAviNumeroHelices(ndh);
				avi.setAviDistanciaAsientos(dda);
				aviones.put(nda, avi);
				System.out.println(aviones);
				break;
			case '5':
				vuelo vue = new vuelo();
				Integer ndv = -1;
				String dest = "";
				oa = JOptionPane.showInputDialog(null, "Escoje la Opcion", "Sistema Aereo",
						JOptionPane.INFORMATION_MESSAGE, null, opcionesv, "1.-Registar vuelo");
				switch (String.valueOf(oa).charAt(0)) {
				case '1':
					ndv = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de avion"));
					dest = JOptionPane.showInputDialog("Ingrese el destino del vuelo");
					vue.setVueNumeroVuelo(ndv);
					vue.setVueDestino(dest);
					vuelos.put(ndv, vue);
					System.out.println(vuelos);

					break;
				case '2':
					ou = JOptionPane.showInputDialog(null, "Seleccione Opcion", "Sistema Aereo",
							JOptionPane.INFORMATION_MESSAGE, null, opcionesvt, "1.-Piloto");
					switch (String.valueOf(ou).charAt(0)) {
					case '1':
						String rutx = JOptionPane.showInputDialog("Ingrese el rut del piloto");
						if (pilotos.containsKey(rutx)) {
							vue.setPiloto(pilotos.get(rutx));
						} else {
							System.out.println("No existe piloto");
						}
						vue.setPiloto(pilotos.get(rutx));
						vuelos.put(ndv, vue);
						System.out.println(vuelos);
						break;

					case '2':
						String rutxx = JOptionPane.showInputDialog("Ingrese el rut de la Azafata");
						if (azafatas.containsKey(rutxx)) {
							vue.setAzafate(azafatas.get(rutxx));
						} else {
							System.out.println("No existe azafata");
						}
						vue.setAzafate(azafatas.get(rutxx));
						vuelos.put(ndv, vue);
						System.out.println(vuelos);
						break;
					}

					break;
				case '3':
					clientes.values();
					break;

				}

				break;
			}
		} while (eo != null);
	}
}
