package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.TravelPlan;
import ac.za.cput.Repository.TravelPlanRepository;

import java.util.HashSet;
import java.util.Set;

public class TravelPlanRepositoryImpl implements TravelPlanRepository {

    private static TravelPlanRepositoryImpl repository = null;
    private Set<TravelPlan> Bplan;

    private TravelPlanRepositoryImpl() {
        this.Bplan = new HashSet<>();
    }

    public static TravelPlanRepository getRepository(){
        if(repository == null) repository = new TravelPlanRepositoryImpl();
        return repository;
    }

    public TravelPlan create(TravelPlan Bplan){
        this.Bplan.add(Bplan);
        return Bplan;
    }

    public TravelPlan read(String PlanId){
        
        return null;
    }

    public TravelPlan update(TravelPlan Bplan) {
        
        return null;
    }

    public void delete(String PlanId) {
        

    }

    public Set<TravelPlan> getAll(){
        return this.Bplan;
    }
}