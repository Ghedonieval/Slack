package com.example.slack.Controller;

import com.example.slack.Service.SlackService;
import com.example.slack.entity.SlackModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api/slack")
public class SlackController {

    public final SlackService slackService;

    public SlackController(SlackService slackService) {
        this.slackService = slackService;
    }

    @GetMapping("/api")
    public ResponseEntity<SlackModel> getInfo(@RequestParam("slack_name") String slack_name, @RequestParam("track") String track) {
        //var response = slackService.getInfo(slack_name,track);
        //return ResponseEntity.ok(response);
        return new ResponseEntity<>(slackService.getInfo(slack_name,track), HttpStatus.OK);
    }
}
