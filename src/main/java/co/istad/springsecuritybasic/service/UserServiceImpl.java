package co.istad.springsecuritybasic.service;

import co.istad.springsecuritybasic.mapper.UserMapper;
import co.istad.springsecuritybasic.model.Role;
import co.istad.springsecuritybasic.model.dto.UserRequest;
import co.istad.springsecuritybasic.model.dto.UserResponse;
import co.istad.springsecuritybasic.repository.RoleRepository;
import co.istad.springsecuritybasic.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;
    private final RoleRepository roleRepository;
    private final UserRepository userRepository;

    @Override
    public UserResponse createUser(UserRequest userRequest) {
// Check for existing email
        if (userRepository.existsByEmail(userRequest.email())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Email already exists");

        }

//        check for existing roles
        Set<Role> roles = new HashSet<>();
        userRequest.roles().forEach(
                r -> {
                    var roleObject = roleRepository
                            .findByName(r)
                            .orElseThrow(
                                    () -> new ResponseStatusException(
                                            HttpStatus.BAD_REQUEST,
                                            "Role " + r + " not " + "found"
                                    )
                            );
                    roles.add(roleObject);
                }
        );

        return null;
    }
}
