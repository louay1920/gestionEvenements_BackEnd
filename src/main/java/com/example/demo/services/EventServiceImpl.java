package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.EventDto;
import com.example.demo.models.EventEntity;
import com.example.demo.repositories.EventRepo;

@Service
public class EventServiceImpl implements EventService {
	
	private EventRepo repoEvent;
	private ModelMapper mapper;
	
	@Autowired
	public EventServiceImpl(EventRepo repoEvent, ModelMapper mapper) {
		super();
		this.repoEvent = repoEvent;
		this.mapper = mapper;
	}

	@Override
	public List<EventDto> getAllEventEntity() {
		//return repoEvent.findAll();
		
		List<EventDto> listEventDTO = new ArrayList<>();
		List<EventEntity> listEntity = repoEvent.findAll();
		
		for(EventEntity eventEntity : listEntity)
		{
			listEventDTO.add(mapper.map(eventEntity, EventDto.class));
		}
		return listEventDTO;
	}
	
	@Override
	public EventDto  getEventById(int id)
	{
		List<EventEntity> all = repoEvent.findAll();
		EventEntity filtred = null;
		
		for (EventEntity e : all)
		{
			if (e.getId()==id)
			{
				filtred = e;
			}
		}
		return (mapper.map(filtred, EventDto.class));
	}

	@Override
	public List<EventEntity> getEventByType(String type) {
		List<EventEntity> all = repoEvent.findAll();
		List<EventEntity> filtred = new ArrayList();
		
		for (EventEntity e : all) {
			if (e.getType().toString().equals(type))
			{
				filtred.add(e);
			}
			
		}
		return filtred;
	}

}
