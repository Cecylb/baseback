package cecylb.base.baseback.services;

import cecylb.base.baseback.model.*;
import cecylb.base.baseback.model.entities.Student;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class StudentService {
    private StudentRepository studentRepository;
    private ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudentById(int id) {
        Student student = studentRepository.findById(id);
        return new ArrayList<>() {{ add(student); }};
    }

    public List<Student> getStudentByName(String name) {
        return studentRepository.findByName(name);
    }

    public List<Student> getStudentBySurname(String surname) { return studentRepository.findBySurname(surname); }

    public List<Student> getStudentByKurs(int kurs) { return studentRepository.findByKurs(kurs); }

    public List<String> getStudentFields() {
        List<String> array = new ArrayList<>();
        array.add("id");
        array.add("name");
        array.add("surname");
        array.add("kurs");
        array.add("stipend");
        array.add("city");
        array.add("birthday");
        array.add("univ_id");
        return array;
    }

    public void addStudent(String student) throws JsonProcessingException {
        Student newStudent = objectMapper.readValue(student, Student.class);
        studentRepository.save(newStudent);
    }

    //ToDo не работает
    public void deleteStudent(int id) {
        studentRepository.deleteById(id);
    }

    public void updateStudent(Student updatedStudent) {
        studentRepository.save(updatedStudent);
    }
}
