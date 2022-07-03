package com.example.hamzabad.story;

import com.example.hamzabad.appuser.AppUser;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mysql.cj.x.protobuf.MysqlxExpr;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping(path = "/story")
@RequiredArgsConstructor
@Slf4j
public class StoryController {
    private final StoryService storyService;

    @PostMapping(path = "")
    Story addStory(HttpServletRequest request, HttpServletResponse response,@RequestBody Story story)  {
        AppUser appUser= (AppUser)request.getAttribute("user");
        story.setAppUser(appUser);
        return storyService.addStory(story);
    }

    @GetMapping()
    List<Story> getUserStories(HttpServletRequest request, HttpServletResponse response) {
        AppUser appUser= (AppUser)request.getAttribute("user");

        return storyService.getUserStories(appUser);
    }
}
