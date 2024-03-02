package com.Ecommerceapplication.ecommerce.Controller;

//import com.Ecommerceapplication.ecommerce.DTO.UserReqDTO;
import com.Ecommerceapplication.ecommerce.Repository.UserRepo;
import com.Ecommerceapplication.ecommerce.Service.UserService;
import com.Ecommerceapplication.ecommerce.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    UserRepo userRepo;
    @PostMapping("/add-user")
    public ResponseEntity<String> addUser(@RequestBody User u){
        userService.addUser(u);
//        User user = new User();
//        user.setId(userDto.getId());
//        user.setName((userDto.getName()));
//        user.setEmail(userDto.getEmail());
//        user.setPassword(userDto.getPassword());
//        userRepo.save(user);
        return new ResponseEntity<>("User added successfully", HttpStatus.OK);
    }

}
