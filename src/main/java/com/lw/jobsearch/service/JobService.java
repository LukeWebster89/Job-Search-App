package com.lw.jobsearch.service;

import java.util.List;
import java.util.Optional;

import com.lw.jobsearch.entity.Job;
import com.lw.jobsearch.repo.JobRepo;

public class JobService implements ServiceMethods<Job>{
	
	private JobRepo repo;
	
	public JobService (JobRepo repo) {
		this.repo = repo;
	}
	
	@Override
	public Job create(Job job) {
		
		return this.repo.save(job);
	}
	
	@Override
	public List<Job> readAll(){
		
		return this.repo.findAll();
		
	}
	
	@Override
	public Job readById(long id) {
		Optional<Job> getJob = this.repo.findById(id);
		if(getJob.isPresent()) {
			
			return getJob.get();
		}
		return null;
	}
	
	@Override
	public Job update(long id, Job job) {
		Optional<Job> existingJob = this.repo.findById(id);
		if(existingJob.isPresent()) {
			Job exists = existingJob.get();
			exists.setCompanyName(job.getCompanyName());
			exists.setJobTitle(job.getJobTitle());
			exists.setDateApplied(job.getDateApplied());
			exists.setInterview(job.isInterview());
			exists.setOfferMade(job.isOfferMade());
			exists.setStatus(job.getStatus());
			
			return this.repo.saveAndFlush(exists);
		}
		return null;
	}
	
	@Override
	public boolean delete(long id) {
		this.repo.deleteById(id);
		
		return !this.repo.existsById(id);
	}

}
