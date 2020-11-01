package com.example.demo.abass;

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
@Table(name="AbbassPort")
@Setter
@Getter
@ToString
public class ContinerAbass {

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
	
	@Column(name="abassDischargDate")
	private String abassDischargDate;
	
	@Column(name="abassLoadDate")
	private String abassLoadDate;
	
	@Column(name="islamQala")
	private String islamQala;
	
	@Column(name="borderPassDate")
	private String borderPassDate;
	
	@Column(name="customHaratNimros")
	private String customHaratNimros;
	
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
	
	@Column(name="iraniAgent")
	private String iraniAgent; 
	
	
	@Column(name="customJawaz")
	private String customJawaz;
	
	@Column(name="accdNumber")
	private String accdNumber;
	
	@Column(name="iraniDriverName")
	private String iraniDriverName;
	
	@Column(name="iraniDviverNumber")
	private String iraniDviverNumber;
	
	@Column(name="iraniTrackNumbert")
	private String iraniTrackNumbert;
	
	@Column(name="afgDriverName")
	private String afgDriverName;
	
	
	@Column(name="afgDviverNumber")
	private String afgDviverNumber;
	
	@Column(name="afgTrackNumber")
	private String afgTrackNumber;
	
	
	
	
	
	public ContinerAbass() {  super();  }





	public ContinerAbass(int id, String conNumber, String bilNumber, String sealNumber, String contSize,
			String contPackage, String contWidth, String shipDate, String abassDischargDate, String abassLoadDate,
			String islamQala, String borderPassDate, String customHaratNimros, String customEnteryDate,
			String customOutDate, String kblDistchedDate, String biltyList, String privateSundry, String iraniAgent,
			String customJawaz, String accdNumber, String iraniDriverName, String iraniDviverNumber,
			String iraniTrackNumbert, String afgDriverName, String afgDviverNumber, String afgTrackNumber) {
		super();
		this.id = id;
		this.conNumber = conNumber;
		this.bilNumber = bilNumber;
		this.sealNumber = sealNumber;
		this.contSize = contSize;
		this.contPackage = contPackage;
		this.contWidth = contWidth;
		this.shipDate = shipDate;
		this.abassDischargDate = abassDischargDate;
		this.abassLoadDate = abassLoadDate;
		this.islamQala = islamQala;
		this.borderPassDate = borderPassDate;
		this.customHaratNimros = customHaratNimros;
		this.customEnteryDate = customEnteryDate;
		this.customOutDate = customOutDate;
		this.kblDistchedDate = kblDistchedDate;
		this.biltyList = biltyList;
		PrivateSundry = privateSundry;
		this.iraniAgent = iraniAgent;
		this.customJawaz = customJawaz;
		this.accdNumber = accdNumber;
		this.iraniDriverName = iraniDriverName;
		this.iraniDviverNumber = iraniDviverNumber;
		this.iraniTrackNumbert = iraniTrackNumbert;
		this.afgDriverName = afgDriverName;
		this.afgDviverNumber = afgDviverNumber;
		this.afgTrackNumber = afgTrackNumber;
	}

	
	
	
	
	
}
