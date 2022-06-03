package com.example.pathology.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pathology.models.Disease;
import com.example.pathology.models.DiseasesList;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

@RestController
@RequestMapping("/pathology")
public class PathologyResource {
	
	//Hardcoded list of diseases
	private List<Disease> diseases = Arrays.asList(
		new Disease("D1", "sainaveen", "Warm water bath"),
		new Disease("D2", "somaraju", "why capsule"),
		new Disease("D3", "asgd", "askjbkajsd")
	);
	/*
	@RequestMapping("/diseases")
	public List<Disease> getDiseases() {
		return diseases;
	}*/
	
	
	//getDiseases returns a list of diseases
	@RequestMapping("/diseases")
	public DiseasesList getDiseases() {
		DiseasesList diseasesList = new DiseasesList();
		diseasesList.setDiseases(diseases);
		return diseasesList;
	}
	
	//getDiseaseById returns the disease with the given Id
	@RequestMapping("/diseases/{Id}")
	public Disease getDiseaseById(@PathVariable("Id") String Id) {
		
		Disease d = diseases.stream()
			.filter(disease -> Id.equals(disease.getId()))
			.findAny()
			.orElse(null);	
		
		return d;
	}	
}