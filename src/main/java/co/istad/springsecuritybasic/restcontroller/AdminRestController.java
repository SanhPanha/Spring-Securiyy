package co.istad.springsecuritybasic.restcontroller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/admins")
public class AdminRestController {


    @GetMapping
    public  String getALlAdmins(){
        return "Get all admins from database";
    }

    @DeleteMapping("/delete/{id}")
    public  String deleteAdminById(@PathVariable String id){
        return "Delete admin by id";
    }
}
