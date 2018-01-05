/**
 * 
 */
package datos;

/**
 * @author RAUL
 *
 */
public class persona {
	protected String perRut;
	protected String perNombre;
	protected String perApePaterno;
	protected String perApeMaterno;	
	protected String perNacionalidad;
	protected int perEdad;
	/**
	 * constructor vacio
	 */
	public persona() {
	}
	/**
	 * constructor con un parametro
	 */
	public persona(String perRut) {
		this.perRut = perRut;
	}
	/**
	 * constructor para la clase cliente 
	 */
	public persona(String perRut, String perNombre) {
		this.perRut = perRut;
		this.perNombre = perNombre;
	}
	/**
	 * Constructor con todos los paremetros
	 */
	public persona(String perRut, String perNombre, String perApePaterno, String perApeMaterno, String perNnacionalidad,
			int perEdad) {
		this.perRut = perRut;
		this.perNombre = perNombre;
		this.perApePaterno = perApePaterno;
		this.perApeMaterno = perApeMaterno;
		this.perNacionalidad = perNnacionalidad;
		this.perEdad = perEdad;
	}
	public String getPerRut() {
		return perRut;
	}
	public void setPerRut(String perRut) {
		this.perRut = perRut;
	}
	public String getPerNombre() {
		return perNombre;
	}
	public void setPerNombre(String perNombre) {
		this.perNombre = perNombre.toUpperCase();
	}
	public String getPerApePaterno() {
		return perApePaterno;
	}
	public void setPerApePaterno(String perApePaterno) {
		this.perApePaterno = perApePaterno;
	}
	public String getPerApeMaterno() {
		return perApeMaterno;
	}
	public void setPerApeMaterno(String perApeMaterno) {
		this.perApeMaterno = perApeMaterno;
	}
		
	public String getPerNacionalidad() {
		return perNacionalidad;
	}
	public void setPerNacionalidad(String perNacionalidad) {
		this.perNacionalidad = perNacionalidad;
	}
	public int getPerEdad() {
		return perEdad;
	}
	public void setPerEdad(int perEdad) {
		this.perEdad = perEdad;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "persona [perRut=" + perRut + ", perNombre=" + perNombre + ", perApePaterno=" + perApePaterno
				+ ", perApeMaterno=" + perApeMaterno + ", perNacionalidad=" + perNacionalidad + ", perEdad=" + perEdad
				+ "]";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((perApeMaterno == null) ? 0 : perApeMaterno.hashCode());
		result = prime * result + ((perApePaterno == null) ? 0 : perApePaterno.hashCode());
		result = prime * result + perEdad;
		result = prime * result + ((perNacionalidad == null) ? 0 : perNacionalidad.hashCode());
		result = prime * result + ((perNombre == null) ? 0 : perNombre.hashCode());
		result = prime * result + ((perRut == null) ? 0 : perRut.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		persona other = (persona) obj;
		if (perApeMaterno == null) {
			if (other.perApeMaterno != null)
				return false;
		} else if (!perApeMaterno.equals(other.perApeMaterno))
			return false;
		if (perApePaterno == null) {
			if (other.perApePaterno != null)
				return false;
		} else if (!perApePaterno.equals(other.perApePaterno))
			return false;
		if (perEdad != other.perEdad)
			return false;
		if (perNacionalidad == null) {
			if (other.perNacionalidad != null)
				return false;
		} else if (!perNacionalidad.equals(other.perNacionalidad))
			return false;
		if (perNombre == null) {
			if (other.perNombre != null)
				return false;
		} else if (!perNombre.equals(other.perNombre))
			return false;
		if (perRut == null) {
			if (other.perRut != null)
				return false;
		} else if (!perRut.equals(other.perRut))
			return false;
		return true;
	}
	
	
}