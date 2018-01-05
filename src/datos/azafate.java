/**
 * 
 */
package datos;

/**
 * @author RAUL
 *
 */
public class azafate extends personadecabina{
	 private String idioma_manejo;

	/**
	 * 
	 */
	public azafate() {
		super();
	}

	/**
	 * @param perRut
	 */
	public azafate(String perRut) {
		super(perRut);
	}

	/**
	 * @param perRut
	 * @param perNombre
	 * @param perApePaterno
	 * @param perApeMaterno
	 * @param perNnacionalidad
	 * @param perEdad
	 * @param idioma_manejo
	 */
	public azafate(String perRut, String perNombre, String perApePaterno, String perApeMaterno, String perNnacionalidad,
			int perEdad, String idioma_manejo) {
		super(perRut, perNombre, perApePaterno, perApeMaterno, perNnacionalidad, perEdad);
		this.idioma_manejo = idioma_manejo;
	}

	public String isIdioma_manejo() {
		return idioma_manejo;
	}

	public void setIdioma_manejo(String idioma_manejo) {
		this.idioma_manejo = idioma_manejo;
	}

	@Override
	public String toString() {
		return "azafate [idioma_manejo=" + idioma_manejo + ", perRut=" + perRut + ", perNombre=" + perNombre
				+ ", perApePaterno=" + perApePaterno + ", perApeMaterno=" + perApeMaterno + ", perNacionalidad="
				+ perNacionalidad + ", perEdad=" + perEdad + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((idioma_manejo == null) ? 0 : idioma_manejo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		azafate other = (azafate) obj;
		if (idioma_manejo == null) {
			if (other.idioma_manejo != null)
				return false;
		} else if (!idioma_manejo.equals(other.idioma_manejo))
			return false;
		return true;
	}

}
