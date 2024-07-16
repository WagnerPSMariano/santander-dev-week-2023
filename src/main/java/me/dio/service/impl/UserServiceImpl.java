package me.dio.service.impl;

import me.dio.domain.model.User;
import me.dio.domain.model.repository.UserRepository;
import me.dio.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public void UserRepository(UserRepository userRepository){
        UserRepository UserRepository = null;
        this.userRepository = UserRepository;
    }

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())){
            throw new IllegalArgumentException("This user Account number already exits. ");
        }
        return userRepository.save(userToCreate);
    }
}
