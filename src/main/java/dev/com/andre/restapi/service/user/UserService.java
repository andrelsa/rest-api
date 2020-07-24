package dev.com.andre.restapi.service.user;

import dev.com.andre.restapi.domain.entity.User;
import dev.com.andre.restapi.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserService {

    private final UserRepository userRepository;


    public User detail(long id) {
        return userRepository.findById(id).orElse(null);
    }


}
