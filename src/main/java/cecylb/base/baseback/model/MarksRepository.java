package cecylb.base.baseback.model;

import cecylb.base.baseback.model.entities.Marks;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MarksRepository extends JpaRepository<Marks, String> {

    List<Marks> findById(int id);

    List<Marks> findByMark(int mark);
}
