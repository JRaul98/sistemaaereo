package negocio;

import java.util.HashMap;

public class vuelo {
	
	private Integer vueNumeroVuelo;
	private String vueDestino;
	private avion avion;
	private datos.piloto piloto;
	private datos.pasaje pasaje;
	private datos.azafate azafate;
	private boolean vueCargaAnimal;
	
	
	public vuelo() {
	}
	
	public vuelo(Integer vueNumeroVuelo, String vueDestino, negocio.avion avion, datos.piloto piloto,
			datos.pasaje pasaje, datos.azafate azafate, boolean vueCargaAnimal) {
		this.vueNumeroVuelo = vueNumeroVuelo;
		this.vueDestino = vueDestino;
		this.avion = avion;
		this.piloto = piloto;
		this.pasaje = pasaje;
		this.azafate = azafate;
		this.vueCargaAnimal = vueCargaAnimal;
	}

	public Integer getVueNumeroVuelo() {
		return vueNumeroVuelo;
	}

	public void setVueNumeroVuelo(Integer vueNumeroVuelo) {
		this.vueNumeroVuelo = vueNumeroVuelo;
	}

	public String getVueDestino() {
		return vueDestino;
	}

	public void setVueDestino(String vueDestino) {
		this.vueDestino = vueDestino;
	}

	public avion getAvion() {
		return avion;
	}

	public void setAvion(avion avion) {
		this.avion = avion;
	}

	public datos.piloto getPiloto() {
		return piloto;
	}

	public void setPiloto(datos.piloto piloto) {
		this.piloto = piloto;
	}

	public datos.pasaje getPasaje() {
		return pasaje;
	}

	public void setPasaje(datos.pasaje pasaje) {
		this.pasaje = pasaje;
	}

	public datos.azafate getAzafate() {
		return azafate;
	}

	public void setAzafate(datos.azafate azafate) {
		this.azafate = azafate;
	}

	public boolean isVueCargaAnimal() {
		return vueCargaAnimal;
	}

	public void setVueCargaAnimal(boolean vueCargaAnimal) {
		this.vueCargaAnimal = vueCargaAnimal;
	}

	@Override
	public String toString() {
		return "vuelo [vueNumeroVuelo=" + vueNumeroVuelo + ", vueDestino=" + vueDestino + ", avion=" + avion
				+ ", piloto=" + piloto + ", pasaje=" + pasaje + ", azafate=" + azafate + ", vueCargaAnimal="
				+ vueCargaAnimal + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((avion == null) ? 0 : avion.hashCode());
		result = prime * result + ((azafate == null) ? 0 : azafate.hashCode());
		result = prime * result + ((pasaje == null) ? 0 : pasaje.hashCode());
		result = prime * result + ((piloto == null) ? 0 : piloto.hashCode());
		result = prime * result + (vueCargaAnimal ? 1231 : 1237);
		result = prime * result + ((vueDestino == null) ? 0 : vueDestino.hashCode());
		result = prime * result + ((vueNumeroVuelo == null) ? 0 : vueNumeroVuelo.hashCode());
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
		vuelo other = (vuelo) obj;
		if (avion == null) {
			if (other.avion != null)
				return false;
		} else if (!avion.equals(other.avion))
			return false;
		if (azafate == null) {
			if (other.azafate != null)
				return false;
		} else if (!azafate.equals(other.azafate))
			return false;
		if (pasaje == null) {
			if (other.pasaje != null)
				return false;
		} else if (!pasaje.equals(other.pasaje))
			return false;
		if (piloto == null) {
			if (other.piloto != null)
				return false;
		} else if (!piloto.equals(other.piloto))
			return false;
		if (vueCargaAnimal != other.vueCargaAnimal)
			return false;
		if (vueDestino == null) {
			if (other.vueDestino != null)
				return false;
		} else if (!vueDestino.equals(other.vueDestino))
			return false;
		if (vueNumeroVuelo == null) {
			if (other.vueNumeroVuelo != null)
				return false;
		} else if (!vueNumeroVuelo.equals(other.vueNumeroVuelo))
			return false;
		return true;
	}
	
	
	
	
	
	
}
