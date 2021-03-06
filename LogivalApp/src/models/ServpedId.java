package models;
// Generated 23-feb-2016 11:32:03 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * ServpedId generated by hbm2java
 */
public class ServpedId implements java.io.Serializable {

	private Short ntermi;
	private Short codcli;
	private Short norden;
	private Date fecped;
	private Date fecent;
	private String serped;
	private Short ejeped;
	private Integer numped;
	private Character reserv;
	private Character indser;
	private Character servok;

	public ServpedId() {
	}

	public ServpedId(Short ntermi, Short codcli, Short norden, Date fecped, Date fecent, String serped, Short ejeped,
			Integer numped, Character reserv, Character indser, Character servok) {
		this.ntermi = ntermi;
		this.codcli = codcli;
		this.norden = norden;
		this.fecped = fecped;
		this.fecent = fecent;
		this.serped = serped;
		this.ejeped = ejeped;
		this.numped = numped;
		this.reserv = reserv;
		this.indser = indser;
		this.servok = servok;
	}

	public Short getNtermi() {
		return this.ntermi;
	}

	public void setNtermi(Short ntermi) {
		this.ntermi = ntermi;
	}

	public Short getCodcli() {
		return this.codcli;
	}

	public void setCodcli(Short codcli) {
		this.codcli = codcli;
	}

	public Short getNorden() {
		return this.norden;
	}

	public void setNorden(Short norden) {
		this.norden = norden;
	}

	public Date getFecped() {
		return this.fecped;
	}

	public void setFecped(Date fecped) {
		this.fecped = fecped;
	}

	public Date getFecent() {
		return this.fecent;
	}

	public void setFecent(Date fecent) {
		this.fecent = fecent;
	}

	public String getSerped() {
		return this.serped;
	}

	public void setSerped(String serped) {
		this.serped = serped;
	}

	public Short getEjeped() {
		return this.ejeped;
	}

	public void setEjeped(Short ejeped) {
		this.ejeped = ejeped;
	}

	public Integer getNumped() {
		return this.numped;
	}

	public void setNumped(Integer numped) {
		this.numped = numped;
	}

	public Character getReserv() {
		return this.reserv;
	}

	public void setReserv(Character reserv) {
		this.reserv = reserv;
	}

	public Character getIndser() {
		return this.indser;
	}

	public void setIndser(Character indser) {
		this.indser = indser;
	}

	public Character getServok() {
		return this.servok;
	}

	public void setServok(Character servok) {
		this.servok = servok;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ServpedId))
			return false;
		ServpedId castOther = (ServpedId) other;

		return ((this.getNtermi() == castOther.getNtermi()) || (this.getNtermi() != null
				&& castOther.getNtermi() != null && this.getNtermi().equals(castOther.getNtermi())))
				&& ((this.getCodcli() == castOther.getCodcli()) || (this.getCodcli() != null
						&& castOther.getCodcli() != null && this.getCodcli().equals(castOther.getCodcli())))
				&& ((this.getNorden() == castOther.getNorden()) || (this.getNorden() != null
						&& castOther.getNorden() != null && this.getNorden().equals(castOther.getNorden())))
				&& ((this.getFecped() == castOther.getFecped()) || (this.getFecped() != null
						&& castOther.getFecped() != null && this.getFecped().equals(castOther.getFecped())))
				&& ((this.getFecent() == castOther.getFecent()) || (this.getFecent() != null
						&& castOther.getFecent() != null && this.getFecent().equals(castOther.getFecent())))
				&& ((this.getSerped() == castOther.getSerped()) || (this.getSerped() != null
						&& castOther.getSerped() != null && this.getSerped().equals(castOther.getSerped())))
				&& ((this.getEjeped() == castOther.getEjeped()) || (this.getEjeped() != null
						&& castOther.getEjeped() != null && this.getEjeped().equals(castOther.getEjeped())))
				&& ((this.getNumped() == castOther.getNumped()) || (this.getNumped() != null
						&& castOther.getNumped() != null && this.getNumped().equals(castOther.getNumped())))
				&& ((this.getReserv() == castOther.getReserv()) || (this.getReserv() != null
						&& castOther.getReserv() != null && this.getReserv().equals(castOther.getReserv())))
				&& ((this.getIndser() == castOther.getIndser()) || (this.getIndser() != null
						&& castOther.getIndser() != null && this.getIndser().equals(castOther.getIndser())))
				&& ((this.getServok() == castOther.getServok()) || (this.getServok() != null
						&& castOther.getServok() != null && this.getServok().equals(castOther.getServok())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getNtermi() == null ? 0 : this.getNtermi().hashCode());
		result = 37 * result + (getCodcli() == null ? 0 : this.getCodcli().hashCode());
		result = 37 * result + (getNorden() == null ? 0 : this.getNorden().hashCode());
		result = 37 * result + (getFecped() == null ? 0 : this.getFecped().hashCode());
		result = 37 * result + (getFecent() == null ? 0 : this.getFecent().hashCode());
		result = 37 * result + (getSerped() == null ? 0 : this.getSerped().hashCode());
		result = 37 * result + (getEjeped() == null ? 0 : this.getEjeped().hashCode());
		result = 37 * result + (getNumped() == null ? 0 : this.getNumped().hashCode());
		result = 37 * result + (getReserv() == null ? 0 : this.getReserv().hashCode());
		result = 37 * result + (getIndser() == null ? 0 : this.getIndser().hashCode());
		result = 37 * result + (getServok() == null ? 0 : this.getServok().hashCode());
		return result;
	}

}
