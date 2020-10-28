package cecylb.base.baseback.model;

import cecylb.base.baseback.model.entities.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, String> {
}
