package models;
// Generated 23-feb-2016 11:32:03 by Hibernate Tools 3.4.0.CR1

/**
 * SisloginsId generated by hbm2java
 */
public class SisloginsId implements java.io.Serializable {

	private String clogin;
	private String contra;
	private Character captur;
	private Character enviar;
	private String sislog;
	private String nombre;
	private String dirlec;
	private String diresc;

	public SisloginsId() {
	}

	public SisloginsId(String clogin, String nombre) {
		this.clogin = clogin;
		this.nombre = nombre;
	}

	public SisloginsId(String clogin, String contra, Character captur, Character enviar, String sislog, String nombre,
			String dirlec, String diresc) {
		this.clogin = clogin;
		this.contra = contra;
		this.captur = captur;
		this.enviar = enviar;
		this.sislog = sislog;
		this.nombre = nombre;
		this.dirlec = dirlec;
		this.diresc = diresc;
	}

	public String getClogin() {
		return this.clogin;
	}

	public void setClogin(String clogin) {
		this.clogin = clogin;
	}

	public String getContra() {
		return this.contra;
	}

	public void setContra(String contra) {
		this.contra = contra;
	}

	public Character getCaptur() {
		return this.captur;
	}

	public void setCaptur(Character captur) {
		this.captur = captur;
	}

	public Character getEnviar() {
		return this.enviar;
	}

	public void setEnviar(Character enviar) {
		this.enviar = enviar;
	}

	public String getSislog() {
		return this.sislog;
	}

	public void setSislog(String sislog) {
		this.sislog = sislog;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDirlec() {
		return this.dirlec;
	}

	public void setDirlec(String dirlec) {
		this.dirlec = dirlec;
	}

	public String getDiresc() {
		return this.diresc;
	}

	public void setDiresc(String diresc) {
		this.diresc = diresc;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SisloginsId))
			return false;
		SisloginsId castOther = (SisloginsId) other;

		return ((this.getClogin() == castOther.getClogin()) || (this.getClogin() != null
				&& castOther.getClogin() != null && this.getClogin().equals(castOther.getClogin())))
				&& ((this.getContra() == castOther.getContra()) || (this.getContra() != null
						&& castOther.getContra() != null && this.getContra().equals(castOther.getContra())))
				&& ((this.getCaptur() == castOther.getCaptur()) || (this.getCaptur() != null
						&& castOther.getCaptur() != null && this.getCaptur().equals(castOther.getCaptur())))
				&& ((this.getEnviar() == castOther.getEnviar()) || (this.getEnviar() != null
						&& castOther.getEnviar() != null && this.getEnviar().equals(castOther.getEnviar())))
				&& ((this.getSislog() == castOther.getSislog()) || (this.getSislog() != null
						&& castOther.getSislog() != null && this.getSislog().equals(castOther.getSislog())))
				&& ((this.getNombre() == castOther.getNombre()) || (this.getNombre() != null
						&& castOther.getNombre() != null && this.getNombre().equals(castOther.getNombre())))
				&& ((this.getDirlec() == castOther.getDirlec()) || (this.getDirlec() != null
						&& castOther.getDirlec() != null && this.getDirlec().equals(castOther.getDirlec())))
				&& ((this.getDiresc() == castOther.getDiresc()) || (this.getDiresc() != null
						&& castOther.getDiresc() != null && this.getDiresc().equals(castOther.getDiresc())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getClogin() == null ? 0 : this.getClogin().hashCode());
		result = 37 * result + (getContra() == null ? 0 : this.getContra().hashCode());
		result = 37 * result + (getCaptur() == null ? 0 : this.getCaptur().hashCode());
		result = 37 * result + (getEnviar() == null ? 0 : this.getEnviar().hashCode());
		result = 37 * result + (getSislog() == null ? 0 : this.getSislog().hashCode());
		result = 37 * result + (getNombre() == null ? 0 : this.getNombre().hashCode());
		result = 37 * result + (getDirlec() == null ? 0 : this.getDirlec().hashCode());
		result = 37 * result + (getDiresc() == null ? 0 : this.getDiresc().hashCode());
		return result;
	}

}
