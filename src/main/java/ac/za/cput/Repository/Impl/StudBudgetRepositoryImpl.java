package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.StudBudget;
import ac.za.cput.Repository.StudBudgetRepository;

import java.util.HashSet;
import java.util.Set;

public class StudBudgetRepositoryImpl implements StudBudgetRepository{

private static StudBudgetRepositoryImpl repository = null;
    private Set<StudBudget> StudB;

    private StudBudgetRepositoryImpl() {
        this.StudB = new HashSet<>();
    }

    public static StudBudgetRepository getRepository(){
        if(repository == null) repository = new StudBudgetRepositoryImpl();
        return repository;
    }

    public StudBudget create(StudBudget StudB){
        this.StudB.add(StudB);
        return StudB;
    }

    public StudBudget read(String BudgetId){
        
        return null;
    }

    public StudBudget update(StudBudget Bplan) {
        
        return null;
    }

    public void delete(String BudgetId) {
        

    }

    public Set<StudBudget> getAll(){
        return this.StudB;
    }    
}
