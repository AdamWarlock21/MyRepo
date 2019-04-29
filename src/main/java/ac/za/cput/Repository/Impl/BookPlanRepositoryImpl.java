package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.BookPlan;
import ac.za.cput.Repository.BookPlanRepository;

import java.util.HashSet;
import java.util.Set;

public class BookPlanRepositoryImpl implements BookPlanRepository {

    private static BookPlanRepositoryImpl repository = null;
    private Set<BookPlan> Bplan;

    private BookPlanRepositoryImpl() {
        this.Bplan = new HashSet<>();
    }

    public static BookPlanRepository getRepository(){
        if(repository == null) repository = new BookPlanRepositoryImpl();
        return repository;
    }

    public BookPlan create(BookPlan Bplan){
        this.Bplan.add(Bplan);
        return Bplan;
    }

    public BookPlan read(String BookId){
        
        return null;
    }

    public BookPlan update(BookPlan Bplan) {
        
        return null;
    }

    public void delete(String BookId) {
        

    }

    public Set<BookPlan> getAll(){
        return this.Bplan;
    }
}
