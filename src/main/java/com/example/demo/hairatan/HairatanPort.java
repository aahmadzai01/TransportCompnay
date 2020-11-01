package com.example.demo.hairatan;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="HairatanPort")
@Setter
@Getter
@ToString
public class HairatanPort {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="conNumber")
	private String conNumber;
	
	@Column(name="bilNumber")
	private String bilNumber;
	
	@Column(name="sealNumber")
	private String sealNumber;
	
	@Column(name="contSize")
	private String contSize;
	
	@Column(name="contPackage")
	private String contPackage;
	
	@Column(name="contWidth")
	private String contWidth;
		
	@Column(name="shipDate")
	private String shipDate;
	
	@Column(name="karchiDischargDate")
	private String DischargDate;
	
	@Column(name="karchiLoadDate")
	private String LoadDate;
	
	@Column(name="customJaQand")
	private String customHairatan;
	
	@Column(name="customEnteryDate")
	private String customEnteryDate;
	
	@Column(name="customOutDate")
	private String customOutDate;
	
	@Column(name="kblDistchedDate")
	private String kblDistchedDate;
	
	@Column(name="biltyList")
	private String biltyList;
	
	@Column(name="PrivateSundry")
	private String PrivateSundry;
		
	@Column(name="customJawaz")
	private String customJawaz;
	
	@Column(name="accdNumber")
	private String accdNumber;
	
	@Column(name="afgDriverName")
	private String afgDriverName;
	
	
	@Column(name="afgDviverNumber")
	private String afgDviverNumber;
	
	@Column(name="afgTrackNumber")
	private String afgTrackNumber;
	
	@Column(name="comment")
	private String comment;

	public HairatanPort() {
		super();
	}

	public HairatanPort(int id, String conNumber, String bilNumber, String sealNumber, String contSize,
			String contPackage, String contWidth, String shipDate, String dischargDate, String loadDate,
			String customHairatan, String customEnteryDate, String customOutDate, String kblDistchedDate,
			String biltyList, String privateSundry, String customJawaz, String accdNumber, String afgDriverName,
			String afgDviverNumber, String afgTrackNumber, String comment) {
		super();
		this.id = id;
		this.conNumber = conNumber;
		this.bilNumber = bilNumber;
		this.sealNumber = sealNumber;
		this.contSize = contSize;
		this.contPackage = contPackage;
		this.contWidth = contWidth;
		this.shipDate = shipDate;
		DischargDate = dischargDate;
		LoadDate = loadDate;
		this.customHairatan = customHairatan;
		this.customEnteryDate = customEnteryDate;
		this.customOutDate = customOutDate;
		this.kblDistchedDate = kblDistchedDate;
		this.biltyList = biltyList;
		PrivateSundry = privateSundry;
		this.customJawaz = customJawaz;
		this.accdNumber = accdNumber;
		this.afgDriverName = afgDriverName;
		this.afgDviverNumber = afgDviverNumber;
		this.afgTrackNumber = afgTrackNumber;
		this.comment = comment;
	}
	
	
	
	
	
	

}
