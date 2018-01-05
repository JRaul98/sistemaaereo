/**
 * 
 */
package datos;

/**
 * @author RAUL
 *
 */
public class piloto extends personadecabina{
	private int pilHorasVuelo;

	/**
	 * 
	 */
	public piloto() {
	}

	/**
	 * @param perRut
	 */
	public piloto(String perRut) {
		super(perRut);
	}

	/**
	 * @param perRut
	 * @param perNombre
	 * @param perApePaterno
	 * @param perApeMaterno
	 * @param perNnacionalidad
	 * @param perEdad
	 * @param pilHorasVuelo
	 */
	public piloto(String perRut, String perNombre, String perApePaterno, String perApeMaterno, String perNnacionalidad,
			int perEdad, int pilHorasVuelo) {
		super(perRut, perNombre, perApePaterno, perApeMaterno, perNnacionalidad, perEdad);
		this.pilHorasVuelo = pilHorasVuelo;
	}
	
	public int getPilHorasVuelo() {
		return pilHorasVuelo;
	}

	public void setPilHorasVuelo(int pilHorasVuelo) {
		this.pilHorasVuelo = pilHorasVuelo;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "piloto [pilHorasVuelo=" + pilHorasVuelo + ", perRut=" + perRut + ", perNombre=" + perNombre
				+ ", perApePaterno=" + perApePaterno + ", perApeMaterno=" + perApeMaterno + ", perNacionalidad="
				+ perNacionalidad + ", perEdad=" + perEdad + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + pilHorasVuelo;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		piloto other = (piloto) obj;
		if (pilHorasVuelo != other.pilHorasVuelo)
			return false;
		return true;
	}

	
	
	
}
