package qualifiers;

import org.springframework.stereotype.Component;

@Component
@OracleDao
public class Oracle implements Dao {
    @Override
    public void save() {
        System.out.println("Oracle");
    }
}
