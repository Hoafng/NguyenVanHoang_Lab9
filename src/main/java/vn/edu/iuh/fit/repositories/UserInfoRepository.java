package vn.edu.iuh.fit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.models.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {
}
