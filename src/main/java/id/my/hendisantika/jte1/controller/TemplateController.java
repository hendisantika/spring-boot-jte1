package id.my.hendisantika.jte1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-jte1
 * User: hendisantika
 * Link: s.id/hendisantika
 * Email: hendisantika@yahoo.co.id
 * Telegram : @hendisantika34
 * Date: 07/04/25
 * Time: 08.31
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class TemplateController {
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("username", "John Doe");
        return "pages/home";
    }
}
