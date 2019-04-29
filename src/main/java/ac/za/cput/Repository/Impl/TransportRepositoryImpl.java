package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.Transport;
import ac.za.cput.Repository.TransportRepository;

import java.util.HashSet;
import java.util.Set;

public class TransportRepositoryImpl implements TransportRepository {

    private static TransportRepositoryImpl repository = null;
    private Set<Transport> Bplan;

    private TransportRepositoryImpl() {
        this.Bplan = new HashSet<>();
    }

    public static TransportRepository getRepository(){
        if(repository == null) repository = new TransportRepositoryImpl();
        return repository;
    }

    public Transport create(Transport Bplan){
        this.Bplan.add(Bplan);
        return Bplan;
    }

    public Transport read(String transId){
        
        return null;
    }

    public Transport update(Transport Bplan) {
        
        return null;
    }

    public void delete(String transId) {
        

    }

    public Set<Transport> getAll(){
        return this.Bplan;
    }
}
