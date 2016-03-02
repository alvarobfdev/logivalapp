package models;
// Generated 23-feb-2016 11:32:03 by Hibernate Tools 3.4.0.CR1

/**
 * LinpedhwId generated by hbm2java
 */
public class LinpedhwId implements java.io.Serializable {

	private int nalbar;
	private short linalb;

	public LinpedhwId() {
	}

	public LinpedhwId(int nalbar, short linalb) {
		this.nalbar = nalbar;
		this.linalb = linalb;
	}

	public int getNalbar() {
		return this.nalbar;
	}

	public void setNalbar(int nalbar) {
		this.nalbar = nalbar;
	}

	public short getLinalb() {
		return this.linalb;
	}

	public void setLinalb(short linalb) {
		this.linalb = linalb;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof LinpedhwId))
			return false;
		LinpedhwId castOther = (LinpedhwId) other;

		return (this.getNalbar() == castOther.getNalbar()) && (this.getLinalb() == castOther.getLinalb());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getNalbar();
		result = 37 * result + this.getLinalb();
		return result;
	}

}