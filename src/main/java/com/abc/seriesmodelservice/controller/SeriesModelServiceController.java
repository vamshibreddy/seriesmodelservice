package com.abc.seriesmodelservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.seriesmodelservice.entity.Model;
import com.abc.seriesmodelservice.entity.Series;


@RestController
@RequestMapping("/s")
public class SeriesModelServiceController {
	
	@GetMapping("/series")
	public List<Series> getSeries(){
		return null;
		
	}
	@GetMapping("/model/{series_id}")
	public List<Model> getModel(@PathVariable int series_id){
		return null;
		
	}

}
