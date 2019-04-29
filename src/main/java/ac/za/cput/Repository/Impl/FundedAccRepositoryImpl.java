package ac.za.cput.Repository.Impl;

import ac.za.cput.Domain.FundedAcc;
import ac.za.cput.Repository.FundedAccRepository;

import java.util.HashSet;
import java.util.Set;

public class FundedAccRepositoryImpl implements FundedAccRepository {

    private static FundedAccRepositoryImpl repository = null;
    private Set<FundedAcc> Facc;

    private FundedAccRepositoryImpl() {
        this.Facc = new HashSet<>();
    }

    public static FundedAccRepository getRepository(){
        if(repository == null) repository = new FundedAccRepositoryImpl();
        return repository;
    }

    public FundedAcc create(FundedAcc Facc){
        this.Facc.add(Facc);
        return Facc;
    }

    public FundedAcc read(String LocationId){
        
        return null;
    }

    public FundedAcc update(FundedAcc Facc) {
        
        return null;
    }

    public void delete(String LocationId) {
        

    }

    public Set<FundedAcc> getAll(){
        return this.Facc;
    }
}
