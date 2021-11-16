package com.example.demo.endpoints;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.EventDto;
import com.example.demo.models.EventEntity;
import com.example.demo.services.EventService;

@RestController
@RequestMapping(("/api/events"))
public class EventRest {
	private EventService service;
	
	public EventRest(EventService service)
	{
		super();
		this.service= service;
		
	}
	
	@GetMapping
	public List<EventDto> getAllEvent()
	{
		return service.getAllEventEntity();
	}
	
	@GetMapping("{id}")
	public EventDto getEventById(@PathVariable("id")int id)
	{
		return service.getEventById(id);
	}
	

}
