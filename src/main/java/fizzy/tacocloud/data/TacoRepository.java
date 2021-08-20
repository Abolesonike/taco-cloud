package fizzy.tacocloud.data;

import fizzy.tacocloud.entity.Taco;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository extends CrudRepository<Taco, Long> {
}
