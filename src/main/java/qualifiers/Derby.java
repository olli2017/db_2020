package qualifiers;

import org.springframework.stereotype.Component;

@Component
@DerbyDao
public class Derby implements Dao {
    @Override
    public void save() {
        System.out.println("Derby");
    }
}
