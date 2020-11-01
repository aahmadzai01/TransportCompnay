package com.example.demo.istanbul;

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
@Table(name="IstanbulPort")
@Setter
@Getter
@ToString
public class IstanbulPort {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="trackNumber")
	private String trackNumber;
	
	@Column(name="driverNumber")
	private String driverNumber;
	
	@Column(name="agent")
	private String agent;
		
	@Column(name="contSize")
	private String contSize;
	
	@Column(name="contPackage")
	private String contPackage;
	
	@Column(name="contWidth")
	private String contWidth;
		
	@Column(name="entryBorder")
	private String entryBorder;
	
	@Column(name="borderPass")
	private String borderPass;
	
	@Column(name="customHarat")
	private String customHarat;
	
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

	public IstanbulPort() {
		super();
	}

	public IstanbulPort(int id, String trackNumber, String driverNumber, String agent, String contSize,
			String contPackage, String contWidth, String entryBorder, String borderPass, String customHarat,
			String customEnteryDate, String customOutDate, String kblDistchedDate, String biltyList,
			String privateSundry, String customJawaz, String accdNumber, String afgDriverName, String afgDviverNumber,
			String afgTrackNumber, String comment) {
		super();
		this.id = id;
		this.trackNumber = trackNumber;
		this.driverNumber = driverNumber;
		this.agent = agent;
		this.contSize = contSize;
		this.contPackage = contPackage;
		this.contWidth = contWidth;
		this.entryBorder = entryBorder;
		this.borderPass = borderPass;
		this.customHarat = customHarat;
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
