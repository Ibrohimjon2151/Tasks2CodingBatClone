package com.example.tasks2codingbatclone.service;

import com.example.tasks2codingbatclone.entity.ApiResponce;
import com.example.tasks2codingbatclone.entity.LanguageCategory;
import com.example.tasks2codingbatclone.entity.Stars;
import com.example.tasks2codingbatclone.entity.User;
import com.example.tasks2codingbatclone.peliod.UserDTO;
import com.example.tasks2codingbatclone.repository.LanguageRepository;
import com.example.tasks2codingbatclone.repository.StarsRepository;
import com.example.tasks2codingbatclone.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    StarsRepository starsRepository;

    @Autowired
    LanguageRepository languageRepository;

    public ApiResponce addElement(UserDTO userDTO){
        User user = new User();
        return getApiResponce(userDTO, user);
    }
    public List<User> getAll(){
        List<User> all = userRepository.findAll();
        return all;
    }

    public ApiResponce getById(Integer id) {
        Optional<User> optionalSupplier = userRepository.findById(id);
        return optionalSupplier.map(user -> new ApiResponce(true, user)).orElseGet(() -> new ApiResponce(false, "NOT FOUND"));
    }

    public ApiResponce update(Integer id, UserDTO userDTO) {
        Optional<User> optionalUser = userRepository.findById(id);
        User user = optionalUser.get();
        return getApiResponce(userDTO, user);
    }

    private ApiResponce getApiResponce(UserDTO userDTO, User user) {
        user.setPassword(userDTO.getPassword());
        user.setNameOrText(userDTO.getName());

        Optional<Stars> optionalStars = starsRepository.findById(userDTO.getStarsId());
        Stars stars = optionalStars.get();

        user.setStars(stars);

        Optional<LanguageCategory> repository = languageRepository.findById(userDTO.getLanguageCategoryId());
        user.setLanguageCategory(repository.get());

        User save = userRepository.save(user);

        return new ApiResponce(true , save);
    }

    public ApiResponce deleteById(int id){
        Optional<User> userRepositoryById = userRepository.findById(id);
        userRepository.deleteById(id);
        return new ApiResponce(true,userRepositoryById.get());
    }

}
