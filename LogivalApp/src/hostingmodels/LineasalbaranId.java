package hostingmodels;
// Generated 02-mar-2016 10:43:18 by Hibernate Tools 3.4.0.CR1

/**
 * LineasalbaranId generated by hbm2java
 */
public class LineasalbaranId implements java.io.Serializable {

	private short codcli;
	private String tipalb;
	private String seralb;
	private short ejerci;
	private int numalb;
	private short numlin;

	public LineasalbaranId() {
	}

	public LineasalbaranId(short codcli, String tipalb, String seralb, short ejerci, int numalb, short numlin) {
		this.codcli = codcli;
		this.tipalb = tipalb;
		this.seralb = seralb;
		this.ejerci = ejerci;
		this.numalb = numalb;
		this.numlin = numlin;
	}

	public short getCodcli() {
		return this.codcli;
	}

	public void setCodcli(short codcli) {
		this.codcli = codcli;
	}

	public String getTipalb() {
		return this.tipalb;
	}

	public void setTipalb(String tipalb) {
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

	public short getNumlin() {
		return this.numlin;
	}

	public void setNumlin(short numlin) {
		this.numlin = numlin;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof LineasalbaranId))
			return false;
		LineasalbaranId castOther = (LineasalbaranId) other;

		return (this.getCodcli() == castOther.getCodcli())
				&& ((this.getTipalb() == castOther.getTipalb()) || (this.getTipalb() != null
						&& castOther.getTipalb() != null && this.getTipalb().equals(castOther.getTipalb())))
				&& ((this.getSeralb() == castOther.getSeralb()) || (this.getSeralb() != null
						&& castOther.getSeralb() != null && this.getSeralb().equals(castOther.getSeralb())))
				&& (this.getEjerci() == castOther.getEjerci()) && (this.getNumalb() == castOther.getNumalb())
				&& (this.getNumlin() == castOther.getNumlin());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodcli();
		result = 37 * result + (getTipalb() == null ? 0 : this.getTipalb().hashCode());
		result = 37 * result + (getSeralb() == null ? 0 : this.getSeralb().hashCode());
		result = 37 * result + this.getEjerci();
		result = 37 * result + this.getNumalb();
		result = 37 * result + this.getNumlin();
		return result;
	}

}