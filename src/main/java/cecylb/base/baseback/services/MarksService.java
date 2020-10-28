package cecylb.base.baseback.services;

import cecylb.base.baseback.model.MarksRepository;
import cecylb.base.baseback.model.entities.Marks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class MarksService {

    private MarksRepository marksRepository;

    @Autowired
    public MarksService(MarksRepository marksRepository) {
        this.marksRepository = marksRepository;
    }


    public List<Marks> getMarksById(int id) {
        return marksRepository.findById(id);
    }

    public List<Marks> getMarksByMark(int mark) {
        return marksRepository.findByMark(mark);
    }
}
