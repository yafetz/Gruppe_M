package Server.Repository;

import Server.Modell.Lehrmaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface LehrmaterialRepository extends JpaRepository<Lehrmaterial, Long> {





}
