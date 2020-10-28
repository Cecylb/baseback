package cecylb.base.baseback.web.client;

import cecylb.base.baseback.services.LecturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/client/lecturer")
public class LecturerController {

    LecturerService service;

    @Autowired
    public LecturerController(LecturerService service) {
        this.service = service;
    }

    @RequestMapping("/search/{id}")
    public ResponseEntity getLecturer(@PathVariable String id) {
        return ResponseEntity.ok(service.getLecturerById(Integer.parseInt(id)));
    }
}
