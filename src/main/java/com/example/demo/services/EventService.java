package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.EventDto;
import com.example.demo.models.EventEntity;

public interface EventService {

	public List<EventDto> getAllEventEntity();
	
	public List<EventEntity> getEventByType(String type);
	
	public EventDto  getEventById(int id);
}
