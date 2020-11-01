package com.example.demo.karachi;

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
@Table(name="karchiport")
@Setter
@Getter
@ToString
public class KarachiPort {

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
	private String karchiDischargDate;
	
	@Column(name="karchiLoadDate")
	private String karchiLoadDate;
	
	@Column(name="toorkhamWish")
	private String toorkhamWish;
	
	@Column(name="borderPassDate")
	private String borderPassDate;
	
	@Column(name="customJaQand")
	private String customJaQand;
	
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
	
	@Column(name="pakAgent")
	private String pakAgent; 
	
	
	@Column(name="customJawaz")
	private String customJawaz;
	
	@Column(name="accdNumber")
	private String accdNumber;
	
	@Column(name="pakDriverName")
	private String pakDriverName;
	
	@Column(name="pakDviverNumber")
	private String pakDviverNumber;
	
	@Column(name="pakTrackNumbert")
	private String pakTrackNumbert;
	
	@Column(name="afgDriverName")
	private String afgDriverName;
	
	
	@Column(name="afgDviverNumber")
	private String afgDviverNumber;
	
	@Column(name="afgTrackNumber")
	private String afgTrackNumber;
	
	@Column(name="comment")
	private String comment;

	public KarachiPort() {
		super();
	}
	
	public KarachiPort(int id, String conNumber, String bilNumber, String sealNumber, String contSize,
			String contPackage, String contWidth, String shipDate, String karchiDischargDate, String karchiLoadDate,
			String toorkhamWish, String borderPassDate, String customJaQand, String customEnteryDate,
			String customOutDate, String kblDistchedDate, String biltyList, String privateSundry, String pakAgent,
			String customJawaz, String accdNumber, String pakDriverName, String pakDviverNumber, String pakTrackNumbert,
			String afgDriverName, String afgDviverNumber, String afgTrackNumber, String comment) {
		super();
		this.id = id;
		this.conNumber = conNumber;
		this.bilNumber = bilNumber;
		this.sealNumber = sealNumber;
		this.contSize = contSize;
		this.contPackage = contPackage;
		this.contWidth = contWidth;
		this.shipDate = shipDate;
		this.karchiDischargDate = karchiDischargDate;
		this.karchiLoadDate = karchiLoadDate;
		this.toorkhamWish = toorkhamWish;
		this.borderPassDate = borderPassDate;
		this.customJaQand = customJaQand;
		this.customEnteryDate = customEnteryDate;
		this.customOutDate = customOutDate;
		this.kblDistchedDate = kblDistchedDate;
		this.biltyList = biltyList;
		PrivateSundry = privateSundry;
		this.pakAgent = pakAgent;
		this.customJawaz = customJawaz;
		this.accdNumber = accdNumber;
		this.pakDriverName = pakDriverName;
		this.pakDviverNumber = pakDviverNumber;
		this.pakTrackNumbert = pakTrackNumbert;
		this.afgDriverName = afgDriverName;
		this.afgDviverNumber = afgDviverNumber;
		this.afgTrackNumber = afgTrackNumber;
		this.comment = comment;
	}
	
	
	
	

}
