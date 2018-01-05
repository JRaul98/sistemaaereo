package negocio;

public class avion {
	private Integer avinumeroavion;
	private String aviMarca;
	private String aviModdelo;
	private Integer aviCapacidadPasajero;
	private Integer aviNumeroHelices;
	private Integer aviDistanciaAsientos;
	/**
	 * 
	 */
	public avion() {
	}
	public avion(Integer avinumeroavion, String aviMarca, String aviModdelo, Integer aviCapacidadPasajero,
			Integer aviNumeroHelices, Integer aviDistanciaAsientos) {
		this.avinumeroavion = avinumeroavion;
		this.aviMarca = aviMarca;
		this.aviModdelo = aviModdelo;
		this.aviCapacidadPasajero = aviCapacidadPasajero;
		this.aviNumeroHelices = aviNumeroHelices;
		this.aviDistanciaAsientos = aviDistanciaAsientos;
	}
	public Integer getAvinumeroavion() {
		return avinumeroavion;
	}
	public void setAvinumeroavion(Integer avinumeroavion) {
		this.avinumeroavion = avinumeroavion;
	}
	public String getAviMarca() {
		return aviMarca;
	}
	public void setAviMarca(String aviMarca) {
		this.aviMarca = aviMarca;
	}
	public String getAviModdelo() {
		return aviModdelo;
	}
	public void setAviModdelo(String aviModdelo) {
		this.aviModdelo = aviModdelo;
	}
	public Integer getAviCapacidadPasajero() {
		return aviCapacidadPasajero;
	}
	public void setAviCapacidadPasajero(Integer aviCapacidadPasajero) {
		this.aviCapacidadPasajero = aviCapacidadPasajero;
	}
	public Integer getAviNumeroHelices() {
		return aviNumeroHelices;
	}
	public void setAviNumeroHelices(Integer aviNumeroHelices) {
		this.aviNumeroHelices = aviNumeroHelices;
	}
	public Integer getAviDistanciaAsientos() {
		return aviDistanciaAsientos;
	}
	public void setAviDistanciaAsientos(Integer aviDistanciaAsientos) {
		this.aviDistanciaAsientos = aviDistanciaAsientos;
	}
	@Override
	public String toString() {
		return "avion [avinumeroavion=" + avinumeroavion + ", aviMarca=" + aviMarca + ", aviModdelo=" + aviModdelo
				+ ", aviCapacidadPasajero=" + aviCapacidadPasajero + ", aviNumeroHelices=" + aviNumeroHelices
				+ ", aviDistanciaAsientos=" + aviDistanciaAsientos + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aviCapacidadPasajero == null) ? 0 : aviCapacidadPasajero.hashCode());
		result = prime * result + ((aviDistanciaAsientos == null) ? 0 : aviDistanciaAsientos.hashCode());
		result = prime * result + ((aviMarca == null) ? 0 : aviMarca.hashCode());
		result = prime * result + ((aviModdelo == null) ? 0 : aviModdelo.hashCode());
		result = prime * result + ((aviNumeroHelices == null) ? 0 : aviNumeroHelices.hashCode());
		result = prime * result + ((avinumeroavion == null) ? 0 : avinumeroavion.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		avion other = (avion) obj;
		if (aviCapacidadPasajero == null) {
			if (other.aviCapacidadPasajero != null)
				return false;
		} else if (!aviCapacidadPasajero.equals(other.aviCapacidadPasajero))
			return false;
		if (aviDistanciaAsientos == null) {
			if (other.aviDistanciaAsientos != null)
				return false;
		} else if (!aviDistanciaAsientos.equals(other.aviDistanciaAsientos))
			return false;
		if (aviMarca == null) {
			if (other.aviMarca != null)
				return false;
		} else if (!aviMarca.equals(other.aviMarca))
			return false;
		if (aviModdelo == null) {
			if (other.aviModdelo != null)
				return false;
		} else if (!aviModdelo.equals(other.aviModdelo))
			return false;
		if (aviNumeroHelices == null) {
			if (other.aviNumeroHelices != null)
				return false;
		} else if (!aviNumeroHelices.equals(other.aviNumeroHelices))
			return false;
		if (avinumeroavion == null) {
			if (other.avinumeroavion != null)
				return false;
		} else if (!avinumeroavion.equals(other.avinumeroavion))
			return false;
		return true;
	}
		
	

}
