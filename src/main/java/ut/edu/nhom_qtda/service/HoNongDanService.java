package ut.edu.nhom_qtda.service;
import ut.edu.nhom_qtda.models.HoNongDan;
import ut.edu.nhom_qtda.repository.HoNongDanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HoNongDanService {
    @Autowired
    private HoNongDanRepository repo;

    public List<HoNongDan> getAll() {
        return repo.findAll();
    }

    public Optional<HoNongDan> getById(Long id) {
        return repo.findById(id);
    }

    public HoNongDan save(HoNongDan hoNongDan) {
        return repo.save(hoNongDan);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
