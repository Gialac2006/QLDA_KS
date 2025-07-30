package ut.edu.nhom_qtda.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class AdminController {

    // Trang chính của Admin (đã chuyển vào thư mục admin)
    @GetMapping("/admin")
    public String showAdminDashboard() {
        return "admin/admin";  // Trả về trang "admin.html" trong thư mục admin
    }

    // Trang con "Hộ Nông Dân" (đã chuyển vào thư mục layout_admin)
    @GetMapping("/admin/honongdan")
    public String showFarmerPage() {
        return "layout_admin/honongdan";  // Trả về trang "honongdan.html" trong thư mục layout_admin
    }
}
