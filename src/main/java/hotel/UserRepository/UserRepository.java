package hotel.UserRepository;

import hotel.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findUserById(long userId);

    User findUserByPhone(String phone);
}
