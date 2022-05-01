package edu.miu.cs544.paweni.jobsearchapplication.controller;

import edu.miu.cs544.paweni.jobsearchapplication.entity.Job;
import edu.miu.cs544.paweni.jobsearchapplication.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class JobController {

    @Autowired
    JobService jobService;

    @GetMapping("/jobs")
    public List<Job> getJobs(){
        return jobService.findAll();
    }

    @GetMapping("/jobs/{job_id}")
    public Job getJob(@PathVariable long job_id){
        System.out.println("here" + job_id);
        return jobService.findOne(job_id);
    }

    @PostMapping("/jobs")
    public ResponseEntity<Job> addJob(@RequestBody Job job){
        Job savedJob = this.jobService.save(job);
        long savedJobId = savedJob.getId();
        URI savedJobURI = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{job_id}").buildAndExpand(savedJobId).toUri();
        return ResponseEntity.created(savedJobURI).build();
    }

    @DeleteMapping("/jobs/{job_id}")
    public void deleteJob(@PathVariable Long job_id){
         jobService.delete(job_id);
    }
}
