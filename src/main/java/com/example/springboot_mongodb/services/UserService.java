package com.example.springboot_mongodb.services;

import com.example.springboot_mongodb.domain.User;
import com.example.springboot_mongodb.dto.UserDTO;
import com.example.springboot_mongodb.exception.ObjectNotFoundException;
import com.example.springboot_mongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(String id) {
        Optional<User> user = userRepository.findById(id);
        return user.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
    public User insert(User user) {
        return userRepository.insert(user);
    }
    public void deleteById(String id) {
        findById(id);
        userRepository.deleteById(id);
    }
    public User update(User obj) {
        Optional<User> obj1 = userRepository.findById(obj.getId());
        User newObj = obj1.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
        updateData(newObj, obj);

        return userRepository.save(newObj);
    }

    private void updateData(User newObj, User obj) {
        newObj.setName(obj.getName());
        newObj.setEmail(obj.getEmail());
    }
    public User fromDTO(UserDTO dto) {
        return new User(dto.getId(), dto.getName(), dto.getEmail());
    }
}
