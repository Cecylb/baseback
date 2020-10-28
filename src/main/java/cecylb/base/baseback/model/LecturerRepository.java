package cecylb.base.baseback.model;

import cecylb.base.baseback.model.entities.Lecturer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LecturerRepository extends JpaRepository<Lecturer, String> {

    Lecturer findById(int id);
}
