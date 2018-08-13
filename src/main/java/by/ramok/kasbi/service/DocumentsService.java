package by.ramok.kasbi.service;

import by.ramok.kasbi.exceptions.EmptyDocumentException;
import by.ramok.kasbi.service.properties.ServiceProps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class DocumentsService {

    @Autowired
    AuthorizationInKasbiService authorizationInKasbiService;

    @Autowired
    private ResourceLoader resourceLoader;

    public Resource getDocumentConnection(int cashHistoriesSysId, int goodSysId, int customerSysId) throws IOException {
        String hashUrl = authorizationInKasbiService.getHashUrl();
        System.out.println(hashUrl);
        Resource resource = resourceLoader.getResource("url:" + ServiceProps.KASBI_REMOTE_PATH + hashUrl + "/documents.aspx?t=32&h=" + cashHistoriesSysId + "&g=" + goodSysId + "&c=" + customerSysId);
        if(resource.contentLength()>0) throw new EmptyDocumentException();
        return resource;
    }

}
