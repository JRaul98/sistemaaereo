/**
 * 
 */
package datos;

/**
 * @author RAUL
 *
 */
public class pasaje {
	private cliente cli;
	private int pasNumeroVuelo;
	private String pasFecVuelo;
	private String pasHoraVuelo;
	private String pasDestino;
	private int pasNumAsiento;
	private String pasClase;
	private int pasValor;
	
	/**
	 * 
	 */
	public pasaje() {
	}
	
	/**
	 * @param cli
	 */
	public pasaje(cliente cli) {
		this.cli = cli;
	}

	/**
	 * @param cli
	 * @param pasNumeroVuelo
	 * @param pasFecVuelo
	 * @param pasHoraVuelo
	 * @param pasDestino
	 * @param pasNumAsiento
	 * @param pasClase
	 * @param pasValor
	 */
	public pasaje(cliente cli, int pasNumeroVuelo, String pasFecVuelo, String pasHoraVuelo, String pasDestino,
			int pasNumAsiento, String pasClase, int pasValor) {
		this.cli = cli;
		this.pasNumeroVuelo = pasNumeroVuelo;
		this.pasFecVuelo = pasFecVuelo;
		this.pasHoraVuelo = pasHoraVuelo;
		this.pasDestino = pasDestino;
		this.pasNumAsiento = pasNumAsiento;
		this.pasClase = pasClase;
		this.pasValor = pasValor;
	}

	public cliente getCli() {
		return cli;
	}

	public void setCli(cliente cli) {
		this.cli = cli;
	}

	public int getPasNumeroVuelo() {
		return pasNumeroVuelo;
	}

	public void setPasNumeroVuelo(int pasNumeroVuelo) {
		this.pasNumeroVuelo = pasNumeroVuelo;
	}

	public String getPasFecVuelo() {
		return pasFecVuelo;
	}

	public void setPasFecVuelo(String pasFecVuelo) {
		this.pasFecVuelo = pasFecVuelo;
	}

	public String getPasHoraVuelo() {
		return pasHoraVuelo;
	}

	public void setPasHoraVuelo(String pasHoraVuelo) {
		this.pasHoraVuelo = pasHoraVuelo;
	}

	public String getPasDestino() {
		return pasDestino;
	}

	public void setPasDestino(String pasDestino) {
		this.pasDestino = pasDestino;
	}

	public int getPasNumAsiento() {
		return pasNumAsiento;
	}

	public void setPasNumAsiento(int pasNumAsiento) {
		this.pasNumAsiento = pasNumAsiento;
	}

	public String getPasClase() {
		return pasClase;
	}

	public void setPasClase(String pasClase) {
		this.pasClase = pasClase;
	}

	public int getPasValor() {
		return pasValor;
	}

	public void setPasValor(int pasValor) {
		this.pasValor = pasValor;
	}

	@Override
	public String toString() {
		return "pasaje [cli=" + cli + ", pasNumeroVuelo=" + pasNumeroVuelo + ", pasFecVuelo=" + pasFecVuelo
				+ ", pasHoraVuelo=" + pasHoraVuelo + ", pasDestino=" + pasDestino + ", pasNumAsiento=" + pasNumAsiento
				+ ", pasClase=" + pasClase + ", pasValor=" + pasValor + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cli == null) ? 0 : cli.hashCode());
		result = prime * result + ((pasClase == null) ? 0 : pasClase.hashCode());
		result = prime * result + ((pasDestino == null) ? 0 : pasDestino.hashCode());
		result = prime * result + ((pasFecVuelo == null) ? 0 : pasFecVuelo.hashCode());
		result = prime * result + ((pasHoraVuelo == null) ? 0 : pasHoraVuelo.hashCode());
		result = prime * result + pasNumAsiento;
		result = prime * result + pasNumeroVuelo;
		result = prime * result + pasValor;
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
		pasaje other = (pasaje) obj;
		if (cli == null) {
			if (other.cli != null)
				return false;
		} else if (!cli.equals(other.cli))
			return false;
		if (pasClase == null) {
			if (other.pasClase != null)
				return false;
		} else if (!pasClase.equals(other.pasClase))
			return false;
		if (pasDestino == null) {
			if (other.pasDestino != null)
				return false;
		} else if (!pasDestino.equals(other.pasDestino))
			return false;
		if (pasFecVuelo == null) {
			if (other.pasFecVuelo != null)
				return false;
		} else if (!pasFecVuelo.equals(other.pasFecVuelo))
			return false;
		if (pasHoraVuelo == null) {
			if (other.pasHoraVuelo != null)
				return false;
		} else if (!pasHoraVuelo.equals(other.pasHoraVuelo))
			return false;
		if (pasNumAsiento != other.pasNumAsiento)
			return false;
		if (pasNumeroVuelo != other.pasNumeroVuelo)
			return false;
		if (pasValor != other.pasValor)
			return false;
		return true;
	}
	
	
	
}
