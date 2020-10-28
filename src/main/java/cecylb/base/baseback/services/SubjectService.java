package cecylb.base.baseback.services;

import cecylb.base.baseback.model.SubjectRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class SubjectService {

    private SubjectRepository subjectRepository;
}
