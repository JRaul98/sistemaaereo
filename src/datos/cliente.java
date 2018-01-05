/**
 * 
 */
package datos;

/**
 * @author RAUL
 *
 */
public final class cliente extends persona{

	/**
	 * 
	 */
	public cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param perRut
	 */
	public cliente(String perRut) {
		super(perRut);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param perRut
	 * @param perNombre
	 */
	public cliente(String perRut, String perNombre) {
		super(perRut, perNombre);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "cliente [perRut=" + perRut + ", perNombre=" + perNombre + "]";
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