package springAni.dia12challegeRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springAni.dia12challegeModel.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}