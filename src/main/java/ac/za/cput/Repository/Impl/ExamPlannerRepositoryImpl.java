package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.ExamPlanner;
import ac.za.cput.Repository.ExamPlanRepository;

import java.util.HashSet;
import java.util.Set;

public class ExamPlannerRepositoryImpl implements ExamPlanRepository {

    private static ExamPlannerRepositoryImpl repository = null;
    private Set<ExamPlanner> Eplan;

    private ExamPlannerRepositoryImpl() {
        this.Eplan = new HashSet<>();
    }

    public static ExamPlanRepository getRepository(){
        if(repository == null) repository = new ExamPlannerRepositoryImpl();
        return repository;
    }

    public ExamPlanner create(ExamPlanner Eplan){
        this.Eplan.add(Eplan);
        return Eplan;
    }

    public ExamPlanner read(String ExamId){
        
        return null;
    }

    public ExamPlanner update(ExamPlanner Eplan) {
        
        return null;
    }

    public void delete(String ExamId) {
        

    }

    public Set<ExamPlanner> getAll(){
        return this.Eplan;
    }
}
