package kjwon.mytoy.busalarm.controller;

import kjwon.mytoy.busalarm.model.MemberInput;
import kjwon.mytoy.busalarm.service.MemberService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@Controller
public class MainController {

    private final MemberService memberService;

    @GetMapping("/")
    public String index(){

        return "index";
    }

    @GetMapping("/member/login")
    public String login(){

        return "member/login";
    }

    @GetMapping("/member/register")
    public String register(){

        return "member/register";
    }

    @PostMapping("/member/register")
    public String registerSubmit(MemberInput parameter){
        System.out.println("test");

        System.out.println(parameter.getUserName());

        boolean result = memberService.register(parameter);

        return "index";
    }

    @GetMapping("/member/userInfo")
    public String userInfo(){

        return "member/userInfo";
    }
}
