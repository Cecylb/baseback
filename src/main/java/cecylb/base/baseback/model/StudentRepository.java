package cecylb.base.baseback.model;

import cecylb.base.baseback.model.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    Student findById(int id);

    List<Student> findByName(String name);

    List<Student> findBySurname(String surname);

    List<Student> findByKurs(int kurs);

}
