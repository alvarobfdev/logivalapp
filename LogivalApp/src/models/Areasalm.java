package models;
// Generated 23-feb-2016 11:32:03 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;

/**
 * Areasalm generated by hbm2java
 */
public class Areasalm implements java.io.Serializable {

	private AreasalmId id;
	private String descri;
	private BigDecimal udsalm;
	private String basalm;
	private String tipzon;

	public Areasalm() {
	}

	public Areasalm(AreasalmId id) {
		this.id = id;
	}

	public Areasalm(AreasalmId id, String descri, BigDecimal udsalm, String basalm, String tipzon) {
		this.id = id;
		this.descri = descri;
		this.udsalm = udsalm;
		this.basalm = basalm;
		this.tipzon = tipzon;
	}

	public AreasalmId getId() {
		return this.id;
	}

	public void setId(AreasalmId id) {
		this.id = id;
	}

	public String getDescri() {
		return this.descri;
	}

	public void setDescri(String descri) {
		this.descri = descri;
	}

	public BigDecimal getUdsalm() {
		return this.udsalm;
	}

	public void setUdsalm(BigDecimal udsalm) {
		this.udsalm = udsalm;
	}

	public String getBasalm() {
		return this.basalm;
	}

	public void setBasalm(String basalm) {
		this.basalm = basalm;
	}

	public String getTipzon() {
		return this.tipzon;
	}

	public void setTipzon(String tipzon) {
		this.tipzon = tipzon;
	}

}
