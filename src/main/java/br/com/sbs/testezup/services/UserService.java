package br.com.sbs.testezup.services;

import br.com.sbs.testezup.exceptions.DataIntegrityViolationException;
import br.com.sbs.testezup.exceptions.UserNotFoundException;
import br.com.sbs.testezup.entities.User;
import br.com.sbs.testezup.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    public UserRepository userRepository;

    public User findById(Integer id) {
        Optional<User> user = userRepository.findById(id);
        return user.orElseThrow(() -> new UserNotFoundException(
                "Object not found. - Id: "+ id +", Type: " + (User.class.getName())));
    }

    public User insertUser(User user){
        Optional<User> objEmail = Optional.ofNullable(userRepository.findByEmail(user.getEmail()));
        Optional<User> objCpf = Optional.ofNullable(userRepository.findByCpf(user.getCpf()));
        if (objEmail.isEmpty() && objCpf.isEmpty()){
            return userRepository.save(user);
        } else {
            throw new DataIntegrityViolationException("Cpf or email already in use by another user.");
        }
    }

}
