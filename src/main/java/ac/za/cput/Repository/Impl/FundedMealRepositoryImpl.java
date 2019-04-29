package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.FundedMealPlan;
import ac.za.cput.Repository.FundedMealPlanRepository;

import java.util.HashSet;
import java.util.Set;

public class FundedMealRepositoryImpl implements FundedMealPlanRepository{
    private static FundedMealRepositoryImpl repository = null;
    private Set<FundedMealPlan> FMealPlan;

    private FundedMealRepositoryImpl() {
        this.FMealPlan = new HashSet<>();
    }

    public static FundedMealRepositoryImpl getRepository(){
        if(repository == null) repository = new FundedMealRepositoryImpl();
        return repository;
    }

    public FundedMealPlan create(FundedMealPlan FMealPlan){
        this.FMealPlan.add(FMealPlan);
        return FMealPlan;
    }

    public FundedMealPlan read(String LocationId){
        
        return null;
    }

    public FundedMealPlan update(FundedMealPlan FMealPlan) {
        
        return null;
    }

    public void delete(String LocationId) {
        

    }

    public Set<FundedMealPlan> getAll(){
        return this.FMealPlan;
    } 
}
