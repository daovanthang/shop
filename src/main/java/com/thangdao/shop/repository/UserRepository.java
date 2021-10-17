package com.thangdao.shop.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.thangdao.shop.dto.UserDto;
import com.thangdao.shop.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	@Query("SELECT u FROM User u") // JPQL
	List<UserDto> findAllUserDto();

	int countByUsername(String username);

	int countByEmail(String email);

	@Query("SELECT u FROM User u LEFT JOIN FETCH u.role WHERE u.username = ?1")
	Optional<User> findByUsernameWithRole(String username);

	//	@Query("SELECT p.name AS name, p.method AS method, p.path AS path FROM User u JOIN u.groups g JOIN g.roles r JOIN r.programs p WHERE u.username = ?1")
//	List<UserProgramDto> findAllProgramsByUsername(String username);

	
}
