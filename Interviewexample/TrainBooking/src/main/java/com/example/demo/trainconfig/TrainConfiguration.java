package com.example.demo.trainconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entitys.SeatEntity;
import com.example.demo.entitys.SectionEntity;
import com.example.demo.entitys.TrainEntity;
import com.example.demo.repos.SeatEntityRepo;
import com.example.demo.repos.SectionEntityRepo;
import com.example.demo.repos.TrainEntityRepo;

@Component
public class TrainConfiguration {

	@Autowired
	private SeatEntityRepo seatEntityRepo;

	@Autowired
	private SectionEntityRepo sectionEntityRepo;

	@Autowired
	private TrainEntityRepo trainEntityRepo;

	public void createTrain() {

		SectionEntity sectionEntityA = new SectionEntity();
		sectionEntityA.setSectionName("SectionA");
		sectionEntityRepo.save(sectionEntityA);

		SectionEntity sectionEntityB = new SectionEntity();
		sectionEntityB.setSectionName("SectionB");
		sectionEntityRepo.save(sectionEntityB);

		createNumberOfSeats(10, sectionEntityA);
		createNumberOfSeats(20, sectionEntityB);

		TrainEntity trainEntity = new TrainEntity();
		trainEntity.setTrainNumber("17250");
		trainEntity.setFromStation("london");
		trainEntity.setToStation("france");
		trainEntity.setSectionA(sectionEntityA);
		trainEntity.setSectionB(sectionEntityB);
		trainEntityRepo.save(trainEntity);

	}

	public void createNumberOfSeats(Integer noOfSeats, SectionEntity secontion) {

		for (int i = 1; i <= noOfSeats; i++) {
			SeatEntity seatEntity = new SeatEntity();
			seatEntity.setSeatNumber(i);
			seatEntity.setSectionEntity(secontion);
			seatEntityRepo.save(seatEntity);

		}

	}

}
