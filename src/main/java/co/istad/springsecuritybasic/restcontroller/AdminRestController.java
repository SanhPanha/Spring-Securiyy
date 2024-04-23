package co.istad.springsecuritybasic.restcontroller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/admins")
public class AdminRestController {
    @GetMapping
    public  String getALlUsers(){
        return "Get all admins from database";
    }

    @DeleteMapping("/delete/{id}")
    public  String deleteUser(@PathVariable String id){
        return "Delete admin by id";
    }
}
