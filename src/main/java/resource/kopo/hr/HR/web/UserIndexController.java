package resource.kopo.hr.HR.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import resource.kopo.hr.HR.service.user.UserServiceImpl;

@RequiredArgsConstructor
@Controller
public class UserIndexController {

    private final UserServiceImpl userService;

    @GetMapping("/")
    public String index(Model model){

        model.addAttribute("users", userService.findAllUserDesc());

        return "index";
    }

}
