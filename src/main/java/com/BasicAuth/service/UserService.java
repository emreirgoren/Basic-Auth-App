package com.BasicAuth.service;

import com.BasicAuth.dto.CreateUserRequest;
import com.BasicAuth.model.User;
import com.BasicAuth.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, BCryptPasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    //Dto Kullan
    public Optional<User> getByUsername(String username){
        return userRepository.findByUsername(username);
    }

    /*public User createUser(CreateUserRequest request){
        User newUser = User.builder()
                .name(request.getName())
                .username(request.getUsername())
                .password(passwordEncoder.encode(request.getPassword()))
                .authorities(request.getAuthorities())
                .accountNonExpired(true)
                .credentialsNonExpired(true)
                .isEnabled(true)
                .accountNonLocked(true)

                .build();
        return userRepository.save(newUser);
    }*/


    public User createUser(CreateUserRequest request){

        try {

            User newUser = User.builder()
                    .name(request.name())
                    .username(request.username())
                    .password(passwordEncoder.encode(request.password()))
                    .authorities(request.authorities())
                    .accountNonExpired(true)
                    .credentialsNonExpired(true)
                    .isEnabled(true)
                    .accountNonLocked(true)
                    .build();

            return userRepository.save(newUser);

        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("Kullanıcı olusturulurken hata olustu");
        }

        }





}
