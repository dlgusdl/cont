package shop.mtcoding.customer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/loginForm")
    public String loginForm() {
        return "user/loginForm";
    }

}
