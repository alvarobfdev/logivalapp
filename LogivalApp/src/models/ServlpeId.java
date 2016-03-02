package models;
// Generated 23-feb-2016 11:32:03 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;

/**
 * ServlpeId generated by hbm2java
 */
public class ServlpeId implements java.io.Serializable {

	private Short ntermi;
	private Short codcli;
	private String serped;
	private Short ejeped;
	private Integer numped;
	private Short numlin;
	private String codart;
	private BigDecimal canped;
	private BigDecimal canrsv;
	private BigDecimal canstk;
	private Character servok;

	public ServlpeId() {
	}

	public ServlpeId(Short ntermi, Short codcli, String serped, Short ejeped, Integer numped, Short numlin,
			String codart, BigDecimal canped, BigDecimal canrsv, BigDecimal canstk, Character servok) {
		this.ntermi = ntermi;
		this.codcli = codcli;
		this.serped = serped;
		this.ejeped = ejeped;
		this.numped = numped;
		this.numlin = numlin;
		this.codart = codart;
		this.canped = canped;
		this.canrsv = canrsv;
		this.canstk = canstk;
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

	public Short getNumlin() {
		return this.numlin;
	}

	public void setNumlin(Short numlin) {
		this.numlin = numlin;
	}

	public String getCodart() {
		return this.codart;
	}

	public void setCodart(String codart) {
		this.codart = codart;
	}

	public BigDecimal getCanped() {
		return this.canped;
	}

	public void setCanped(BigDecimal canped) {
		this.canped = canped;
	}

	public BigDecimal getCanrsv() {
		return this.canrsv;
	}

	public void setCanrsv(BigDecimal canrsv) {
		this.canrsv = canrsv;
	}

	public BigDecimal getCanstk() {
		return this.canstk;
	}

	public void setCanstk(BigDecimal canstk) {
		this.canstk = canstk;
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
		if (!(other instanceof ServlpeId))
			return false;
		ServlpeId castOther = (ServlpeId) other;

		return ((this.getNtermi() == castOther.getNtermi()) || (this.getNtermi() != null
				&& castOther.getNtermi() != null && this.getNtermi().equals(castOther.getNtermi())))
				&& ((this.getCodcli() == castOther.getCodcli()) || (this.getCodcli() != null
						&& castOther.getCodcli() != null && this.getCodcli().equals(castOther.getCodcli())))
				&& ((this.getSerped() == castOther.getSerped()) || (this.getSerped() != null
						&& castOther.getSerped() != null && this.getSerped().equals(castOther.getSerped())))
				&& ((this.getEjeped() == castOther.getEjeped()) || (this.getEjeped() != null
						&& castOther.getEjeped() != null && this.getEjeped().equals(castOther.getEjeped())))
				&& ((this.getNumped() == castOther.getNumped()) || (this.getNumped() != null
						&& castOther.getNumped() != null && this.getNumped().equals(castOther.getNumped())))
				&& ((this.getNumlin() == castOther.getNumlin()) || (this.getNumlin() != null
						&& castOther.getNumlin() != null && this.getNumlin().equals(castOther.getNumlin())))
				&& ((this.getCodart() == castOther.getCodart()) || (this.getCodart() != null
						&& castOther.getCodart() != null && this.getCodart().equals(castOther.getCodart())))
				&& ((this.getCanped() == castOther.getCanped()) || (this.getCanped() != null
						&& castOther.getCanped() != null && this.getCanped().equals(castOther.getCanped())))
				&& ((this.getCanrsv() == castOther.getCanrsv()) || (this.getCanrsv() != null
						&& castOther.getCanrsv() != null && this.getCanrsv().equals(castOther.getCanrsv())))
				&& ((this.getCanstk() == castOther.getCanstk()) || (this.getCanstk() != null
						&& castOther.getCanstk() != null && this.getCanstk().equals(castOther.getCanstk())))
				&& ((this.getServok() == castOther.getServok()) || (this.getServok() != null
						&& castOther.getServok() != null && this.getServok().equals(castOther.getServok())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getNtermi() == null ? 0 : this.getNtermi().hashCode());
		result = 37 * result + (getCodcli() == null ? 0 : this.getCodcli().hashCode());
		result = 37 * result + (getSerped() == null ? 0 : this.getSerped().hashCode());
		result = 37 * result + (getEjeped() == null ? 0 : this.getEjeped().hashCode());
		result = 37 * result + (getNumped() == null ? 0 : this.getNumped().hashCode());
		result = 37 * result + (getNumlin() == null ? 0 : this.getNumlin().hashCode());
		result = 37 * result + (getCodart() == null ? 0 : this.getCodart().hashCode());
		result = 37 * result + (getCanped() == null ? 0 : this.getCanped().hashCode());
		result = 37 * result + (getCanrsv() == null ? 0 : this.getCanrsv().hashCode());
		result = 37 * result + (getCanstk() == null ? 0 : this.getCanstk().hashCode());
		result = 37 * result + (getServok() == null ? 0 : this.getServok().hashCode());
		return result;
	}

}
