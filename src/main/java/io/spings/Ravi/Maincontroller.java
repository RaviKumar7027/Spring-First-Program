package io.spings.Ravi;

import io.spings.Ravi.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController  // ये Spring Boot को बताएगा कि यह एक Controller है
public class Maincontroller {

    @GetMapping("/")  // जब कोई '/' URL खोलेगा, तो ये method चलेगा
    public String home() {
        return "Welcome to my Spring Boot application!";
    }

    @PostMapping("/add")
    public String createUser(@RequestBody User user) {
        return "Welcome to my Spring Boot application!";
//        System.out.println("gfgdgdg");
        //        return userService.createUser(user.getId(), user.getName(), user.getEmail());  // Call the service to save user
    }
}


