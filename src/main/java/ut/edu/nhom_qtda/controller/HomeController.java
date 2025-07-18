package ut.edu.nhom_qtda.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {
    @GetMapping("/home")
    public String home() { return "index";}
    @GetMapping("/giaodien")
    public String giaodien() { return "giaodien"; }

}
