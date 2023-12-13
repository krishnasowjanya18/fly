package com.flyaway.simplilearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.flyaway.simplilearn.entity.UserClass;

import jakarta.transaction.Transactional;
@Repository
public interface UserRepository extends JpaRepository<UserClass, Integer>{
	
	@Query(value = "select u from UserClass u where u.userName=:username")
	public UserClass getAdmin(@Param("username") String username);
	
	@Transactional
	@Modifying
	@Query(value = "update UserClass u set u.password = :newpassword where u.userName=:username")
	public void adminChangePassword(@Param("username") String username, @Param("newpassword") String newpassword);
}
