package com.netocampana.workshopmongodb.services;

import com.netocampana.workshopmongodb.dto.UserDTO;
import com.netocampana.workshopmongodb.entities.User;
import com.netocampana.workshopmongodb.repositories.UserRepository;
import com.netocampana.workshopmongodb.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(String id){
        Optional<User> obj = userRepository.findById(id);
        return obj.orElseThrow(()
                -> new ObjectNotFoundException("Objecto não encontrado"));

    }

    public User insertUser(User obj){
        return userRepository.insert(obj);
    }

    public void delete(String id){
        findById(id);
        userRepository.deleteById(id);
    }

    public User update(User obj){
        User newObj = findById(obj.getId());
        updateData(newObj, obj);
        return userRepository.save(newObj);

    }

    private void updateData(User newObj, User obj) {
        newObj.setName(obj.getName());
        newObj.setEmail(obj.getEmail());

    }

    public User fromDTO(UserDTO objDto){
        return new User(objDto.getId(),objDto.getName(), objDto.getEmail());
    }




}
