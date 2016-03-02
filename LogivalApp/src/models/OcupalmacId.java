package models;
// Generated 23-feb-2016 11:32:03 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;

/**
 * OcupalmacId generated by hbm2java
 */
public class OcupalmacId implements java.io.Serializable {

	private short codemp;
	private short coddel;
	private String horizo;
	private short vertic;
	private short codcli;
	private String codart;
	private Date fcaduc;
	private String lotefb;
	private BigDecimal udsart;

	public OcupalmacId() {
	}

	public OcupalmacId(short codemp, short coddel, String horizo, short vertic, short codcli, String codart) {
		this.codemp = codemp;
		this.coddel = coddel;
		this.horizo = horizo;
		this.vertic = vertic;
		this.codcli = codcli;
		this.codart = codart;
	}

	public OcupalmacId(short codemp, short coddel, String horizo, short vertic, short codcli, String codart,
			Date fcaduc, String lotefb, BigDecimal udsart) {
		this.codemp = codemp;
		this.coddel = coddel;
		this.horizo = horizo;
		this.vertic = vertic;
		this.codcli = codcli;
		this.codart = codart;
		this.fcaduc = fcaduc;
		this.lotefb = lotefb;
		this.udsart = udsart;
	}

	public short getCodemp() {
		return this.codemp;
	}

	public void setCodemp(short codemp) {
		this.codemp = codemp;
	}

	public short getCoddel() {
		return this.coddel;
	}

	public void setCoddel(short coddel) {
		this.coddel = coddel;
	}

	public String getHorizo() {
		return this.horizo;
	}

	public void setHorizo(String horizo) {
		this.horizo = horizo;
	}

	public short getVertic() {
		return this.vertic;
	}

	public void setVertic(short vertic) {
		this.vertic = vertic;
	}

	public short getCodcli() {
		return this.codcli;
	}

	public void setCodcli(short codcli) {
		this.codcli = codcli;
	}

	public String getCodart() {
		return this.codart;
	}

	public void setCodart(String codart) {
		this.codart = codart;
	}

	public Date getFcaduc() {
		return this.fcaduc;
	}

	public void setFcaduc(Date fcaduc) {
		this.fcaduc = fcaduc;
	}

	public String getLotefb() {
		return this.lotefb;
	}

	public void setLotefb(String lotefb) {
		this.lotefb = lotefb;
	}

	public BigDecimal getUdsart() {
		return this.udsart;
	}

	public void setUdsart(BigDecimal udsart) {
		this.udsart = udsart;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof OcupalmacId))
			return false;
		OcupalmacId castOther = (OcupalmacId) other;

		return (this.getCodemp() == castOther.getCodemp()) && (this.getCoddel() == castOther.getCoddel())
				&& ((this.getHorizo() == castOther.getHorizo()) || (this.getHorizo() != null
						&& castOther.getHorizo() != null && this.getHorizo().equals(castOther.getHorizo())))
				&& (this.getVertic() == castOther.getVertic()) && (this.getCodcli() == castOther.getCodcli())
				&& ((this.getCodart() == castOther.getCodart()) || (this.getCodart() != null
						&& castOther.getCodart() != null && this.getCodart().equals(castOther.getCodart())))
				&& ((this.getFcaduc() == castOther.getFcaduc()) || (this.getFcaduc() != null
						&& castOther.getFcaduc() != null && this.getFcaduc().equals(castOther.getFcaduc())))
				&& ((this.getLotefb() == castOther.getLotefb()) || (this.getLotefb() != null
						&& castOther.getLotefb() != null && this.getLotefb().equals(castOther.getLotefb())))
				&& ((this.getUdsart() == castOther.getUdsart()) || (this.getUdsart() != null
						&& castOther.getUdsart() != null && this.getUdsart().equals(castOther.getUdsart())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodemp();
		result = 37 * result + this.getCoddel();
		result = 37 * result + (getHorizo() == null ? 0 : this.getHorizo().hashCode());
		result = 37 * result + this.getVertic();
		result = 37 * result + this.getCodcli();
		result = 37 * result + (getCodart() == null ? 0 : this.getCodart().hashCode());
		result = 37 * result + (getFcaduc() == null ? 0 : this.getFcaduc().hashCode());
		result = 37 * result + (getLotefb() == null ? 0 : this.getLotefb().hashCode());
		result = 37 * result + (getUdsart() == null ? 0 : this.getUdsart().hashCode());
		return result;
	}

}
