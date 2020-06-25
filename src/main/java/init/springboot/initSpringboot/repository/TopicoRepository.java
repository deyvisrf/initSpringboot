package init.springboot.initSpringboot.repository;

import init.springboot.initSpringboot.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
}
