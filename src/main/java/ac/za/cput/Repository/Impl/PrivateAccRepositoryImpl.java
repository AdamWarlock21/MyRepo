package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.PrivateAcc;
import ac.za.cput.Repository.PrivateAccRepository;

import java.util.HashSet;
import java.util.Set;

public class PrivateAccRepositoryImpl implements PrivateAccRepository{
private static PrivateAccRepositoryImpl repository = null;
    private Set<PrivateAcc> Acc;

    private PrivateAccRepositoryImpl() {
        this.Acc = new HashSet<>();
    }

    public static PrivateAccRepository getRepository(){
        if(repository == null) repository = new PrivateAccRepositoryImpl();
        return repository;
    }

    public PrivateAcc create(PrivateAcc Acc){
        this.Acc.add(Acc);
        return Acc;
    }

    public PrivateAcc read(String AccId){
        
        return null;
    }

    public PrivateAcc update(PrivateAcc Acc) {
        
        return null;
    }

    public void delete(String AccId) {
        

    }

    public Set<PrivateAcc> getAll(){
        return this.Acc;
    }    
}
