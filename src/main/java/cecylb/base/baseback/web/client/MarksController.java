package cecylb.base.baseback.web.client;

import cecylb.base.baseback.services.MarksService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/client/marks")
public class MarksController {

    MarksService service;

    MarksController(MarksService service) {
        this.service = service;
    }

    @GetMapping("/search/id/{id}")
    public ResponseEntity getMarksById(@PathVariable String id) {
        return ResponseEntity.ok(service.getMarksById(Integer.parseInt(id)));
    }

    @GetMapping("/search/mark/{mark}")
    public ResponseEntity getMarksByMark(@PathVariable String mark) {
        return ResponseEntity.ok(service.getMarksByMark(Integer.parseInt(mark)));
    }
}
