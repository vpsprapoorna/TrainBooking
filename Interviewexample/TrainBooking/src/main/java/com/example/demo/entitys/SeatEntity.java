package com.example.demo.entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class SeatEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer seatEntityId;
	private Integer seatNumber;
	
	
	@ManyToOne
	@JoinColumn(name = "SECTION_ENTITY_ID")
	private SectionEntity sectionEntity;

	public Integer getSeatEntityId() {
		return seatEntityId;
	}

	public void setSeatEntityId(Integer seatEntityId) {
		this.seatEntityId = seatEntityId;
	}

	public Integer getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(Integer seatNumber) {
		this.seatNumber = seatNumber;
	}

	public SectionEntity getSectionEntity() {
		return sectionEntity;
	}

	public void setSectionEntity(SectionEntity sectionEntity) {
		this.sectionEntity = sectionEntity;
	}

	
	
}
