package models;
// Generated 23-feb-2016 11:32:03 by Hibernate Tools 3.4.0.CR1

/**
 * ViajesId generated by hbm2java
 */
public class ViajesId implements java.io.Serializable {

	private short codemp;
	private short coddel;
	private short ejevia;
	private int numvia;

	public ViajesId() {
	}

	public ViajesId(short codemp, short coddel, short ejevia, int numvia) {
		this.codemp = codemp;
		this.coddel = coddel;
		this.ejevia = ejevia;
		this.numvia = numvia;
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

	public short getEjevia() {
		return this.ejevia;
	}

	public void setEjevia(short ejevia) {
		this.ejevia = ejevia;
	}

	public int getNumvia() {
		return this.numvia;
	}

	public void setNumvia(int numvia) {
		this.numvia = numvia;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ViajesId))
			return false;
		ViajesId castOther = (ViajesId) other;

		return (this.getCodemp() == castOther.getCodemp()) && (this.getCoddel() == castOther.getCoddel())
				&& (this.getEjevia() == castOther.getEjevia()) && (this.getNumvia() == castOther.getNumvia());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodemp();
		result = 37 * result + this.getCoddel();
		result = 37 * result + this.getEjevia();
		result = 37 * result + this.getNumvia();
		return result;
	}

}
