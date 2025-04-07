package id.my.hendisantika.jte1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

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

    @GetMapping("/team")
    public String team(Model model) {
        List<String> teamMembers = List.of("Alice", "Bob", "Charlie", "David");
        model.addAttribute("teamMembers", teamMembers);
        return "pages/team";
    }

    @GetMapping("/projects")
    public String projects(Model model) {
        List<String> projects = List.of("Project 1", "Project 2", "Project 3", "Project 4");
        model.addAttribute("username", "John Doe");
        model.addAttribute("projects", projects);
        return "pages/projects";
    }
}
