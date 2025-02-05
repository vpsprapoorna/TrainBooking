package com.example.demo.entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class TrainEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer TrainEntityId;
	
	@ManyToOne
	@JoinColumn(name = "SECTION_ENTITY_ID_A")
	private SectionEntity sectionA;
	
	@ManyToOne
	@JoinColumn(name = "SECTION_ENTITY_ID_B")
	private SectionEntity sectionB;
	
	
	private String trainNumber;
	private String fromStation;
	private String toStation;

	public Integer getTrainEntityId() {
		return TrainEntityId;
	}

	public void setTrainEntityId(Integer trainEntityId) {
		TrainEntityId = trainEntityId;
	}

	public SectionEntity getSectionA() {
		return sectionA;
	}

	public void setSectionA(SectionEntity sectionA) {
		this.sectionA = sectionA;
	}

	public SectionEntity getSectionB() {
		return sectionB;
	}

	public void setSectionB(SectionEntity sectionB) {
		this.sectionB = sectionB;
	}

	public String getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}

	public String getFromStation() {
		return fromStation;
	}

	public void setFromStation(String fromStation) {
		this.fromStation = fromStation;
	}

	public String getToStation() {
		return toStation;
	}

	public void setToStation(String toStation) {
		this.toStation = toStation;
	}

	
}
