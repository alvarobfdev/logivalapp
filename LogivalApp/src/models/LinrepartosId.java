package models;
// Generated 23-feb-2016 11:32:03 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;

/**
 * LinrepartosId generated by hbm2java
 */
public class LinrepartosId implements java.io.Serializable {

	private short codemp;
	private short coddel;
	private short ejevue;
	private int numero;
	private short numlin;
	private short codcli;
	private String seralb;
	private short ejerci;
	private int numalb;
	private BigDecimal reembo;
	private Character estado;
	private String observ;
	private Character tipalb;

	public LinrepartosId() {
	}

	public LinrepartosId(short codemp, short coddel, short ejevue, int numero, short numlin, short codcli,
			String seralb, short ejerci, int numalb) {
		this.codemp = codemp;
		this.coddel = coddel;
		this.ejevue = ejevue;
		this.numero = numero;
		this.numlin = numlin;
		this.codcli = codcli;
		this.seralb = seralb;
		this.ejerci = ejerci;
		this.numalb = numalb;
	}

	public LinrepartosId(short codemp, short coddel, short ejevue, int numero, short numlin, short codcli,
			String seralb, short ejerci, int numalb, BigDecimal reembo, Character estado, String observ,
			Character tipalb) {
		this.codemp = codemp;
		this.coddel = coddel;
		this.ejevue = ejevue;
		this.numero = numero;
		this.numlin = numlin;
		this.codcli = codcli;
		this.seralb = seralb;
		this.ejerci = ejerci;
		this.numalb = numalb;
		this.reembo = reembo;
		this.estado = estado;
		this.observ = observ;
		this.tipalb = tipalb;
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

	public short getEjevue() {
		return this.ejevue;
	}

	public void setEjevue(short ejevue) {
		this.ejevue = ejevue;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public short getNumlin() {
		return this.numlin;
	}

	public void setNumlin(short numlin) {
		this.numlin = numlin;
	}

	public short getCodcli() {
		return this.codcli;
	}

	public void setCodcli(short codcli) {
		this.codcli = codcli;
	}

	public String getSeralb() {
		return this.seralb;
	}

	public void setSeralb(String seralb) {
		this.seralb = seralb;
	}

	public short getEjerci() {
		return this.ejerci;
	}

	public void setEjerci(short ejerci) {
		this.ejerci = ejerci;
	}

	public int getNumalb() {
		return this.numalb;
	}

	public void setNumalb(int numalb) {
		this.numalb = numalb;
	}

	public BigDecimal getReembo() {
		return this.reembo;
	}

	public void setReembo(BigDecimal reembo) {
		this.reembo = reembo;
	}

	public Character getEstado() {
		return this.estado;
	}

	public void setEstado(Character estado) {
		this.estado = estado;
	}

	public String getObserv() {
		return this.observ;
	}

	public void setObserv(String observ) {
		this.observ = observ;
	}

	public Character getTipalb() {
		return this.tipalb;
	}

	public void setTipalb(Character tipalb) {
		this.tipalb = tipalb;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof LinrepartosId))
			return false;
		LinrepartosId castOther = (LinrepartosId) other;

		return (this.getCodemp() == castOther.getCodemp()) && (this.getCoddel() == castOther.getCoddel())
				&& (this.getEjevue() == castOther.getEjevue()) && (this.getNumero() == castOther.getNumero())
				&& (this.getNumlin() == castOther.getNumlin()) && (this.getCodcli() == castOther.getCodcli())
				&& ((this.getSeralb() == castOther.getSeralb()) || (this.getSeralb() != null
						&& castOther.getSeralb() != null && this.getSeralb().equals(castOther.getSeralb())))
				&& (this.getEjerci() == castOther.getEjerci()) && (this.getNumalb() == castOther.getNumalb())
				&& ((this.getReembo() == castOther.getReembo()) || (this.getReembo() != null
						&& castOther.getReembo() != null && this.getReembo().equals(castOther.getReembo())))
				&& ((this.getEstado() == castOther.getEstado()) || (this.getEstado() != null
						&& castOther.getEstado() != null && this.getEstado().equals(castOther.getEstado())))
				&& ((this.getObserv() == castOther.getObserv()) || (this.getObserv() != null
						&& castOther.getObserv() != null && this.getObserv().equals(castOther.getObserv())))
				&& ((this.getTipalb() == castOther.getTipalb()) || (this.getTipalb() != null
						&& castOther.getTipalb() != null && this.getTipalb().equals(castOther.getTipalb())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodemp();
		result = 37 * result + this.getCoddel();
		result = 37 * result + this.getEjevue();
		result = 37 * result + this.getNumero();
		result = 37 * result + this.getNumlin();
		result = 37 * result + this.getCodcli();
		result = 37 * result + (getSeralb() == null ? 0 : this.getSeralb().hashCode());
		result = 37 * result + this.getEjerci();
		result = 37 * result + this.getNumalb();
		result = 37 * result + (getReembo() == null ? 0 : this.getReembo().hashCode());
		result = 37 * result + (getEstado() == null ? 0 : this.getEstado().hashCode());
		result = 37 * result + (getObserv() == null ? 0 : this.getObserv().hashCode());
		result = 37 * result + (getTipalb() == null ? 0 : this.getTipalb().hashCode());
		return result;
	}

}
