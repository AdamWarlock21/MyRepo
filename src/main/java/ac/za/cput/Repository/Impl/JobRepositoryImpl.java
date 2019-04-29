package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.Job;
import ac.za.cput.Repository.JobRepository;

import java.util.HashSet;
import java.util.Set;


public class JobRepositoryImpl implements JobRepository {
 
    private static JobRepositoryImpl repository = null;
    private Set<Job> job;

    private JobRepositoryImpl() {
        this.job = new HashSet<>();
    }

    public static JobRepository getRepository(){
        if(repository == null) repository = new JobRepositoryImpl();
        return repository;
    }

    public Job create(Job Bplan){
        this.job.add(Bplan);
        return Bplan;
    }

    public Job read(String BookId){
        
        return null;
    }

    public Job update(Job Bplan) {
        
        return null;
    }

    public void delete(String BookId) {
        

    }

    public Set<Job> getAll(){
        return this.job;
    }   
}
