package com.example.demo;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserSiteRepositry extends JpaRepository<UserSite,Long> {
    UserSite findByUserName(String userName);
}
