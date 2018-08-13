package by.ramok.kasbi.controllers.api.v1_0;

import by.ramok.kasbi.controllers.api.Props;
import by.ramok.kasbi.service.DocumentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping(Props.API_V1_0 + "/docs")
public class DocumentsController {

    @Autowired
    DocumentsService documentsService;


    @RequestMapping(value = "/akt_repair_realization", method = RequestMethod.GET)
    public ResponseEntity getDoc(@RequestParam int h, @RequestParam int g, @RequestParam int c) throws IOException {

        Resource documentConnection = documentsService.getDocumentConnection(h, g, c);
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + "akt_repair_realization.doc" + "\"")
                .contentType(MediaType.parseMediaType("application/msword"))
                .body(documentConnection);
    }
}
