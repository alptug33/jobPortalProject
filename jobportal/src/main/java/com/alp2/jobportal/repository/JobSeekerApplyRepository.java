package com.alp2.jobportal.repository;

import com.alp2.jobportal.entity.JobPostActivity;
import com.alp2.jobportal.entity.JobSeekerApply;
import com.alp2.jobportal.entity.JobSeekerProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobSeekerApplyRepository extends JpaRepository<JobSeekerApply,Integer> {

    List<JobSeekerApply> findByUserId(JobSeekerProfile userId);
    List<JobSeekerApply> findByJob(JobPostActivity job);
}
