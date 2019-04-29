package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.StudPlanner;
import ac.za.cput.Repository.StudPlannerRepository;

import java.util.HashSet;
import java.util.Set;

public class StudPlannerRepositoryImpl implements StudPlannerRepository{

private static StudPlannerRepositoryImpl repository = null;
    private Set<StudPlanner> Mplan;

    private StudPlannerRepositoryImpl() {
        this.Mplan = new HashSet<>();
    }

    public static StudPlannerRepository getRepository(){
        if(repository == null) repository = new StudPlannerRepositoryImpl();
        return repository;
    }

    public StudPlanner create(StudPlanner Mplan){
        this.Mplan.add(Mplan);
        return Mplan;
    }

    public StudPlanner read(String StudCourseId){
        
        return null;
    }

    public StudPlanner update(StudPlanner Mplan) {
        
        return null;
    }

    public void delete(String StudCourseId) {
        

    }

    public Set<StudPlanner> getAll(){
        return this.Mplan;
    }    
}
