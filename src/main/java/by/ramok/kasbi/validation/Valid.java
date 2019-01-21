package by.ramok.kasbi.validation;


import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class Valid {
    public void isEmpty(Page pageable, RuntimeException e){
        if (pageable.getContent().size()==0) throw e;
    }
    public void isEmpty(List list, RuntimeException e){
        if (list.size()==0) throw e;
    }
}
