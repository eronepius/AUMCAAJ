package io.anton.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@CrossOrigin
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository uRepository;

    @GetMapping("/")
    List<User> getAllUsersMarks() {
        return uRepository.findAll();
    }

    @GetMapping("/{id}")
    User getUserMark(@PathVariable String id) {
        return uRepository.findById(id).orElse(null);
    }

    @PostMapping("/")
    User postUserMark(@RequestBody User user) {
        return uRepository.save(user);
    }

    @PutMapping("/{id}")
    User putUserMark(@PathVariable String id, @RequestBody User user) {
        User olduser = uRepository.findById(id).orElse(null);
        olduser.setName(user.getName());
        return uRepository.save(user);
    }

    @DeleteMapping("/{id}")
    String deleteUserMark(@PathVariable String id) {
        uRepository.deleteById(id);
        return id;
    }
}
