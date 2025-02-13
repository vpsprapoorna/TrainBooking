package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entitys.TrainEntity;

public interface TrainEntityRepo extends JpaRepository<TrainEntity, Integer>{

	
	
	public List<TrainEntity>findByFromStationAndToStation(String fromStation,String toStation);
}
