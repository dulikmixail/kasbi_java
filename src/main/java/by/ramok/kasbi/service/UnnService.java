package by.ramok.kasbi.service;

import by.ramok.kasbi.entities.Unn;
import by.ramok.kasbi.exceptions.ResourceNotFoundException;
import by.ramok.kasbi.exceptions.WrongParameters;
import by.ramok.kasbi.repository.UnnRepository;
import by.ramok.kasbi.service.impl.UnnServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class UnnService implements UnnServiceImpl {

    private final UnnRepository unnRepository;

    @Autowired
    public UnnService(UnnRepository unnRepository) {
        this.unnRepository = unnRepository;
    }


    @Override
    public Page<Unn> getAllUnns(Pageable pageable) {
        Page<Unn> unnPage = unnRepository.findAll(pageable);
        if (unnPage.getContent().size() == 0) throw new WrongParameters();
        return unnPage;
    }

    @Override
    public Unn getDebtById(int id) {
        return unnRepository.findById(id).orElseThrow(ResourceNotFoundException::new);
    }

    @Override
    public Page<Unn> getDebtByUnn(Unn unn, Pageable pageable) {
        ExampleMatcher exampleMatcher = ExampleMatcher.matching().withIgnoreNullValues();
        Example<Unn> example = Example.of(unn, exampleMatcher);
        Page<Unn> unnPage = unnRepository.findAll(example, pageable);
        if (unnPage.getContent().size() == 0) throw new ResourceNotFoundException();
        return unnPage;
    }

    @Override
    public Unn getDebtByUnn(String unn) {
        return unnRepository.getTopByUnn(unn);
    }

    @Override
    public Unn getDebtByUnn(Unn unn) {
        ExampleMatcher exampleMatcher = ExampleMatcher.matching().withIgnoreNullValues();
        Example<Unn> example = Example.of(unn, exampleMatcher);
        return unnRepository.findOne(example).orElseThrow(ResourceNotFoundException::new);
    }
}
