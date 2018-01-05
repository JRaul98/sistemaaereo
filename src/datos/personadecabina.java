/**
 * 
 */
package datos;

/**
 * @author RAUL
 *
 */
public class personadecabina extends persona{

	/**
	 * 
	 */
	public personadecabina() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param perRut
	 * @param perNombre
	 * @param perApePaterno
	 * @param perApeMaterno
	 * @param perNnacionalidad
	 * @param perEdad
	 */
	public personadecabina(String perRut, String perNombre, String perApePaterno, String perApeMaterno,
			String perNnacionalidad, int perEdad) {
		super(perRut, perNombre, perApePaterno, perApeMaterno, perNnacionalidad, perEdad);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param perRut
	 */
	public personadecabina(String perRut) {
		super(perRut);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "personadecabina [perRut=" + perRut + ", perNombre=" + perNombre + ", perApePaterno=" + perApePaterno
				+ ", perApeMaterno=" + perApeMaterno + ", perNnacionalidad=" + perNacionalidad + ", perEdad=" + perEdad
				+ "]";
	}

	/* (non-Javadoc)
	 * @see datos.persona#hashCode()
	 */
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	/* (non-Javadoc)
	 * @see datos.persona#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
}
