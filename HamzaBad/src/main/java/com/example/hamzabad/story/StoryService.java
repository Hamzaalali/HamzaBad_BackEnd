package com.example.hamzabad.story;

import com.example.hamzabad.appuser.AppUser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class StoryService {
    private final StoryRepo storyRepo;

    public Story addStory(Story story){
       return storyRepo.save(story);
    }

    public List<Story> getUserStories(AppUser appUser){
        return storyRepo.findStoriesByAppUser(appUser);

    }
}
