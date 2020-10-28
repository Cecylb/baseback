package cecylb.base.baseback.services;

import cecylb.base.baseback.model.UniversityRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UniversityService {


    private UniversityRepository universityRepository;
}
