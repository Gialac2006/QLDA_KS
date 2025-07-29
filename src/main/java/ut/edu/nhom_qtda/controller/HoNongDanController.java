package ut.edu.nhom_qtda.controller;
import ut.edu.nhom_qtda.models.HoNongDan;
import ut.edu.nhom_qtda.service.HoNongDanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/honongdan")
@CrossOrigin(origins = "*") // Cho phép gọi từ frontend
public class HoNongDanController {
    @Autowired
    private HoNongDanService service;

    // GET all
    @GetMapping
    public List<HoNongDan> getAll() {
        return service.getAll();
    }

    // GET by id
    @GetMapping("/{id}")
    public Optional<HoNongDan> getById(@PathVariable Long id) {
        return service.getById(id);
    }

    // POST - thêm mới
    @PostMapping
    public HoNongDan add(@RequestBody HoNongDan hoNongDan) {
        return service.save(hoNongDan);
    }

    // PUT - cập nhật
    @PutMapping("/{id}")
    public HoNongDan update(@PathVariable Long id, @RequestBody HoNongDan hoNongDan) {
        hoNongDan.setId(id);
        return service.save(hoNongDan);
    }

    // DELETE - xóa
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}

