package by.ramok.kasbi.service;

import by.ramok.kasbi.service.properties.ServiceProps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Map;

@Service
public class DocumentsService {

    private final AuthorizationInKasbiService authorizationInKasbiService;

    private final ResourceLoader resourceLoader;

    @Autowired
    public DocumentsService(AuthorizationInKasbiService authorizationInKasbiService, ResourceLoader resourceLoader) {
        this.authorizationInKasbiService = authorizationInKasbiService;
        this.resourceLoader = resourceLoader;
    }

    public Resource getDocumentResource(int docNumber, Map<String, Integer> params) throws IOException {
        String hashUrl = authorizationInKasbiService.getHashUrl();
        StringBuilder strParams = new StringBuilder();
        for (Map.Entry<String, Integer> entry :
                params.entrySet()) {
            strParams.append("&").append(entry.getKey()).append("=").append(entry.getValue());
        }
        Resource resource = resourceLoader.getResource("url:" + ServiceProps.KASBI_REMOTE_PATH + hashUrl + "/documents.aspx?t=" + docNumber + strParams.toString());
//        if (resource.contentLength() > 0) throw new EmptyDocumentException();
        return resource;
    }

}
