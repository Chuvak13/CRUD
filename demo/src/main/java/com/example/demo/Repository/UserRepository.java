package com.example.demo.Repository;

import com.example.demo.Entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface UserRepository extends JpaRepository <Users,Long>{
// List<Users> findUsersById(Long id);
}
