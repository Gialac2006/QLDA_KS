package ut.edu.nhom_qtda.repository;
import ut.edu.nhom_qtda.models.HoNongDan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HoNongDanRepository extends JpaRepository<HoNongDan, Long> {
    // có thể thêm hàm tìm kiếm theo nhu cầu
}
