package com.example.hamzabad.story;

import com.example.hamzabad.appuser.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StoryRepo extends JpaRepository<Story,Long> {

    List<Story> findStoriesByAppUser(AppUser appUser);

}
