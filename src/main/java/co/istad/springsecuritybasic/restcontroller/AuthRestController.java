package co.istad.springsecuritybasic.restcontroller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthRestController {

    @GetMapping("/login")
    public String login() {
        return "Successfully login";
    }

    @GetMapping("/sign-up")
    public String signUp() {
        return "Successfully sign up";
    }
}
