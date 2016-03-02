package models;
// Generated 23-feb-2016 11:32:03 by Hibernate Tools 3.4.0.CR1

/**
 * WwwanulId generated by hbm2java
 */
public class WwwanulId implements java.io.Serializable {

	private short codemp;
	private short coddel;
	private short codcli;
	private char tipalb;
	private String seralb;
	private short ejerci;
	private int numalb;
	private Character envweb;
	private Character tipdoc;

	public WwwanulId() {
	}

	public WwwanulId(short codemp, short coddel, short codcli, char tipalb, String seralb, short ejerci, int numalb) {
		this.codemp = codemp;
		this.coddel = coddel;
		this.codcli = codcli;
		this.tipalb = tipalb;
		this.seralb = seralb;
		this.ejerci = ejerci;
		this.numalb = numalb;
	}

	public WwwanulId(short codemp, short coddel, short codcli, char tipalb, String seralb, short ejerci, int numalb,
			Character envweb, Character tipdoc) {
		this.codemp = codemp;
		this.coddel = coddel;
		this.codcli = codcli;
		this.tipalb = tipalb;
		this.seralb = seralb;
		this.ejerci = ejerci;
		this.numalb = numalb;
		this.envweb = envweb;
		this.tipdoc = tipdoc;
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

	public short getCodcli() {
		return this.codcli;
	}

	public void setCodcli(short codcli) {
		this.codcli = codcli;
	}

	public char getTipalb() {
		return this.tipalb;
	}

	public void setTipalb(char tipalb) {
		this.tipalb = tipalb;
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

	public Character getEnvweb() {
		return this.envweb;
	}

	public void setEnvweb(Character envweb) {
		this.envweb = envweb;
	}

	public Character getTipdoc() {
		return this.tipdoc;
	}

	public void setTipdoc(Character tipdoc) {
		this.tipdoc = tipdoc;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof WwwanulId))
			return false;
		WwwanulId castOther = (WwwanulId) other;

		return (this.getCodemp() == castOther.getCodemp()) && (this.getCoddel() == castOther.getCoddel())
				&& (this.getCodcli() == castOther.getCodcli()) && (this.getTipalb() == castOther.getTipalb())
				&& ((this.getSeralb() == castOther.getSeralb()) || (this.getSeralb() != null
						&& castOther.getSeralb() != null && this.getSeralb().equals(castOther.getSeralb())))
				&& (this.getEjerci() == castOther.getEjerci()) && (this.getNumalb() == castOther.getNumalb())
				&& ((this.getEnvweb() == castOther.getEnvweb()) || (this.getEnvweb() != null
						&& castOther.getEnvweb() != null && this.getEnvweb().equals(castOther.getEnvweb())))
				&& ((this.getTipdoc() == castOther.getTipdoc()) || (this.getTipdoc() != null
						&& castOther.getTipdoc() != null && this.getTipdoc().equals(castOther.getTipdoc())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodemp();
		result = 37 * result + this.getCoddel();
		result = 37 * result + this.getCodcli();
		result = 37 * result + this.getTipalb();
		result = 37 * result + (getSeralb() == null ? 0 : this.getSeralb().hashCode());
		result = 37 * result + this.getEjerci();
		result = 37 * result + this.getNumalb();
		result = 37 * result + (getEnvweb() == null ? 0 : this.getEnvweb().hashCode());
		result = 37 * result + (getTipdoc() == null ? 0 : this.getTipdoc().hashCode());
		return result;
	}

}
