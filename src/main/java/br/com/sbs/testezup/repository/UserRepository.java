package br.com.sbs.testezup.repository;

import br.com.sbs.testezup.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByEmail(String email);

    User findByCpf(String cpf);

}
