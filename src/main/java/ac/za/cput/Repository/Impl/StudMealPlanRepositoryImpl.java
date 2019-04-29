package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.StudMealPlan;
import ac.za.cput.Repository.StudMealPlanRepository;

import java.util.HashSet;
import java.util.Set;

public class StudMealPlanRepositoryImpl implements StudMealPlanRepository{

private static StudMealPlanRepositoryImpl repository = null;
    private Set<StudMealPlan> Mplan;

    private StudMealPlanRepositoryImpl() {
        this.Mplan = new HashSet<>();
    }

    public static StudMealPlanRepository getRepository(){
        if(repository == null) repository = new StudMealPlanRepositoryImpl();
        return repository;
    }

    public StudMealPlan create(StudMealPlan Mplan){
        this.Mplan.add(Mplan);
        return Mplan;
    }

    public StudMealPlan read(String MealPlanId){
        
        return null;
    }

    public StudMealPlan update(StudMealPlan Mplan) {
        
        return null;
    }

    public void delete(String MealPlanId) {
        

    }

    public Set<StudMealPlan> getAll(){
        return this.Mplan;
    }    
}
