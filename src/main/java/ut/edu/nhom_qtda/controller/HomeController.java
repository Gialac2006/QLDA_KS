package ut.edu.nhom_qtda.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String home() { return "index";}

    @GetMapping("/giaodien")
    public String giaodien() { return "giaodien"; }

    @GetMapping("/honongdan")
    public String honongdan() { return "honongdan"; }

    @GetMapping("/admin") // <-- XÓA HÀM NÀY
    public String giaodienadmin() { return "giaodienadmin"; }

    @GetMapping("/aboutus")
    public String aboutus() { return "aboutus"; }




}

