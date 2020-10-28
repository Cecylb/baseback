package cecylb.base.baseback.services;

import cecylb.base.baseback.model.LecturerRepository;
import cecylb.base.baseback.model.entities.Lecturer;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class LecturerService {

    private LecturerRepository lecturerRepository;

    public Lecturer getLecturerById(int id) {
        return lecturerRepository.findById(id);
    }

}
