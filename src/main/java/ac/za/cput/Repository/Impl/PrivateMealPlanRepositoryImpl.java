package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.PrivateMealPlan;
import ac.za.cput.Repository.PrivateMealPlanRepository;

import java.util.HashSet;
import java.util.Set;

public class PrivateMealPlanRepositoryImpl implements PrivateMealPlanRepository{
    
     private static PrivateMealPlanRepositoryImpl repository = null;
    private Set<PrivateMealPlan> PrivMeal;

    private PrivateMealPlanRepositoryImpl() {
        this.PrivMeal = new HashSet<>();
    }

    public static PrivateMealPlanRepository getRepository(){
        if(repository == null) repository = new PrivateMealPlanRepositoryImpl();
        return repository;
    }

    public PrivateMealPlan create(PrivateMealPlan PrivMeal){
        this.PrivMeal.add(PrivMeal);
        return PrivMeal;
    }

    public PrivateMealPlan read(String LocationId){
        
        return null;
    }

    public PrivateMealPlan update(PrivateMealPlan PrivMeal) {
        
        return null;
    }

    public void delete(String LocationId) {
        

    }

    public Set<PrivateMealPlan> getAll(){
        return this.PrivMeal;
    }
}
