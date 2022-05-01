package edu.miu.cs544.paweni.jobsearchapplication.repository;

import edu.miu.cs544.paweni.jobsearchapplication.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {
    public Job id(long job_id);
}
