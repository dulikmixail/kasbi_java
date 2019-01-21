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
import java.util.HashMap;

@RestController
@RequestMapping(Props.API_V1_0 + "/docs")
public class DocumentsController {

    private final DocumentsService documentsService;

    @Autowired
    public DocumentsController(DocumentsService documentsService) {
        this.documentsService = documentsService;
    }

    @RequestMapping(value = "/akt_repair_realization", method = RequestMethod.GET)
    public ResponseEntity getAktRepairRealization(@RequestParam int h, @RequestParam int g, @RequestParam int c) throws IOException {

        HashMap<String, Integer> params = new HashMap<>();
        params.put("h", h);
        params.put("g", g);
        params.put("c", c);

        Resource documentConnection = documentsService.getDocumentResource(32, params);
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + "akt_repair_realization.doc" + "\"")
                .contentType(MediaType.parseMediaType("application/msword"))
                .body(documentConnection);
    }

    @RequestMapping(value = "/akt_of_to_and_dolg", method = RequestMethod.GET)
    public ResponseEntity getAktTO(@RequestParam int g, @RequestParam int d) throws IOException {

        HashMap<String, Integer> params = new HashMap<>();
        params.put("g", g);
        params.put("d", d);

        Resource documentConnection = documentsService.getDocumentResource(60, params);
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + "akt_of_to_and_dolg.doc" + "\"")
                .contentType(MediaType.parseMediaType("application/msword"))
                .body(documentConnection);
    }


}
