package edu.miu.cs544.paweni.jobsearchapplication.service;

import edu.miu.cs544.paweni.jobsearchapplication.entity.Job;
import edu.miu.cs544.paweni.jobsearchapplication.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    JobRepository jobRepository;

    public List<Job> findAll(){
        return jobRepository.findAll();
    }

    public Job findOne(Long job_id){
        return jobRepository.id(job_id);
    }

    public Job save(Job job){
        jobRepository.save(job);
        return job;
    }

    public void delete(Long job_id){
        jobRepository.deleteById(job_id);
    }
}
