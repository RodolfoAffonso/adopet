package com.rodolfoaffonso.adopet.repository;

import com.rodolfoaffonso.adopet.domain.Role;
import com.rodolfoaffonso.adopet.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long>  {

    User findByEmail(String email);

   List<User> findByRole(Role role);

}
