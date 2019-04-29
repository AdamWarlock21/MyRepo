package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.Accomodation;
import ac.za.cput.Repository.AccomRepository;

import java.util.HashSet;
import java.util.Set;

public class AccomodationImpl implements AccomRepository {

    private static AccomodationImpl repository = null;
    private Set<Accomodation> accom;

    private AccomodationImpl() {
        this.accom = new HashSet<>();
    }

    public static AccomodationImpl getRepository(){
        if(repository == null) repository = new AccomodationImpl();
        return repository;
    }

    public Accomodation create(Accomodation accom){
        this.accom.add(accom);
        return accom;
    }

    public Accomodation read(String AccId){
        
        return null;
    }

    public Accomodation update(Accomodation accom) {
        
        return null;
    }

    public void delete(String AccId) {
        

    }

    public Set<Accomodation> getAll(){
        return this.accom;
    }
}

