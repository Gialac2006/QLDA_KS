package ut.edu.nhom_qtda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ut.edu.nhom_qtda.models.User;
import ut.edu.nhom_qtda.service.UserService;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Map<String, Object> register(@RequestBody Map<String, String> body) {
        String username = body.get("username");
        String email = body.get("email");
        String password = body.get("password");
        Map<String, Object> res = new HashMap<>();
        if (userService.usernameExists(username)) {
            res.put("status", "error");
            res.put("message", "Tên đăng nhập đã tồn tại");
            return res;
        }
        if (userService.emailExists(email)) {
            res.put("status", "error");
            res.put("message", "Email đã tồn tại");
            return res;
        }
        User user = new User();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password); // thực tế nên mã hóa!
        user.setRole("USER");
        userService.saveUser(user);
        res.put("status", "success");
        res.put("message", "Đăng ký thành công");
        return res;
    }

    @PostMapping("/login")
    public Map<String, Object> login(@RequestBody Map<String, String> body) {
        String username = body.get("username");
        String password = body.get("password");
        Map<String, Object> res = new HashMap<>();
        Optional<User> userOpt = userService.findByUsername(username);
        if (userOpt.isPresent() && userOpt.get().getPassword().equals(password)) {
            res.put("status", "success");
            res.put("message", "Đăng nhập thành công");
            res.put("user", userOpt.get());
        } else {
            res.put("status", "error");
            res.put("message", "Sai tên đăng nhập hoặc mật khẩu");
        }
        return res;
    }
}
