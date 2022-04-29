package com.lw.jobsearch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lw.jobsearch.entity.Job;
import com.lw.jobsearch.service.JobService;

@RestController
@RequestMapping("/job")
public class JobController {
	
	private JobService service;
	
	@Autowired
	public JobController(JobService service) {
		this.service = service;
	}
	
	@PostMapping("/create")
	public ResponseEntity<Job> createJob(@RequestBody Job job){
		return new ResponseEntity<Job>(this.service.create(job), HttpStatus.CREATED);
	}
	
	@GetMapping("/readAll")
	public ResponseEntity<List<Job>> readAllJobs(){
		return new ResponseEntity<List<Job>>(this.service.readAll(), HttpStatus.OK);
	}
	
	@GetMapping("/readById/{id}")
	public ResponseEntity<Job> readById(@PathVariable long id){
		return new ResponseEntity<Job>(this.service.readById(id), HttpStatus.OK);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Job> updateJob(@PathVariable long id, @RequestBody Job job){
		return new ResponseEntity<Job>(this.service.update(id, job), HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Boolean> deleteJob(@PathVariable long id){
		return(this.service.delete(id))? new ResponseEntity<Boolean>(HttpStatus.NO_CONTENT):
			new ResponseEntity<Boolean>(HttpStatus.NOT_FOUND);
	}


}
