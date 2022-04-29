package com.lw.jobsearch.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lw.jobsearch.entity.Job;

@Repository
public interface JobRepo extends JpaRepository<Job, Long>{

}
