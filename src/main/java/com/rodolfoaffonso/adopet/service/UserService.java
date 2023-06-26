package com.rodolfoaffonso.adopet.service;



import com.rodolfoaffonso.adopet.domain.Role;
import com.rodolfoaffonso.adopet.domain.User;
import com.rodolfoaffonso.adopet.dto.UserDTO;
import com.rodolfoaffonso.adopet.exceptions.ExistingEmailException;
import com.rodolfoaffonso.adopet.exceptions.NoneUserFoundException;
import com.rodolfoaffonso.adopet.exceptions.NotExistUserException;
import com.rodolfoaffonso.adopet.mapper.UserMapper;
import com.rodolfoaffonso.adopet.repository.UserRepository;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper mapper;

    public UserDTO create(@Valid UserDTO userDTO,Role role) {
        User userEmail = userRepository.findByEmail(userDTO.getEmail());
        if (userEmail != null) {
            throw new ExistingEmailException();
        } else {
            userDTO.setRole(role.name());
            User user = mapper.mapper(userDTO);
            User userSave = userRepository.save(user);
            return mapper.mapper(userSave);
        }

    }

    public UserDTO update(Long id, UserDTO userDTO) {
        Optional<User> optional = userRepository.findById(id);
        optional.orElseThrow(NotExistUserException::new);
        userDTO.setId(id);
        User user = mapper.mapper(userDTO);
        User userSave = userRepository.save(user);
        return mapper.mapper(userSave);
    }

    public List<UserDTO> search(Role role) {
        List<User> tutors = userRepository.findByRole(role);
        if (tutors.isEmpty()) {
            throw new NoneUserFoundException();

        } else {
            return tutors.stream()
                    .map(mapper::mapper)
                    .collect(Collectors.toList());
        }
    }

    public UserDTO searchById(Long id) {
        Optional<User> optional = userRepository.findById(id);
        optional.orElseThrow(NotExistUserException::new);
        return mapper.mapper(optional.get());
    }


    public UserDTO deleteById(Long id) {
        Optional<User> optional = userRepository.findById(id);
        optional.orElseThrow(NotExistUserException::new);
        userRepository.deleteById(optional.get().getId());
        return mapper.mapper(optional.get());

    }
}
