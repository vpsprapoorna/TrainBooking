package com.example.demo.repos;


import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entitys.TicketEntity;
import com.example.demo.entitys.TrainEntity;
import com.example.demo.entitys.UserEntity;

public interface TicketRepo extends JpaRepository<TicketEntity, Integer>{
	
	
	public List<TicketEntity> findByDateOfJourneyAndTrainDetailsAndTicketExpired(Date doj,TrainEntity entity,boolean ticketExpired);
	public List<TicketEntity> findByUserEntity(UserEntity user);
	public List<TicketEntity> findByUserEntityAndTicketExpired(UserEntity user,boolean ticketExpired);
	
	@Query("from TicketEntity te where te.seatDetails.seatEntityId IN (select se.seatEntityId from SeatEntity se where se.sectionEntity.sectionName=:section) and te.ticketExpired=false")
	public List<TicketEntity> findBySectionName(String section);
	
	

	
}