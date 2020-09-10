package qualifiers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class WorkBackupService {
    @Autowired
    @OracleDao
    private Dao oracleDao;

    @Autowired
    @DerbyDao
    private Dao derbyDao;


    @Scheduled(fixedDelay = 1000)
    public void doWork() {
        oracleDao.save();
    }

    @Scheduled(fixedDelay = 3000)
    public void doBackup() {
        derbyDao.save();
    }
}
