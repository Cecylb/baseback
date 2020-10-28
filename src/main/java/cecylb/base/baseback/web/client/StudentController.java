package cecylb.base.baseback.web.client;

import cecylb.base.baseback.services.StudentService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/client/student")
public class StudentController {

    private StudentService service;

    @Autowired
    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping("/search/id/{id}")
    public ResponseEntity getStudentById(@PathVariable String id) {
        return ResponseEntity.ok(service.getStudentById(Integer.parseInt(id)));
    }

    @GetMapping("/search/name/{name}")
    public ResponseEntity getStudentByName(@PathVariable String name) {
        return ResponseEntity.ok(service.getStudentByName(name));
    }

    @GetMapping("/search/surname/{surname}")
    public ResponseEntity getStudentBySurname(@PathVariable String surname) {
        return ResponseEntity.ok(service.getStudentBySurname(surname));
    }

    @GetMapping("/search/kurs/{kurs}")
    public ResponseEntity getStudentByKurs(@PathVariable String kurs) {
        return ResponseEntity.ok(service.getStudentByKurs(Integer.parseInt(kurs)));
    }

    @GetMapping("/add")
    public ResponseEntity getStudentFields() {
        return ResponseEntity.ok(service.getStudentFields());
    }

    @PostMapping("/add")
    public void addStudent(@RequestBody String student) throws JsonProcessingException {
        service.addStudent(student);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable String id) {
        service.deleteStudent(Integer.parseInt(id));
    }
}