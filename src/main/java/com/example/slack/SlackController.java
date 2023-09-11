package com.example.slack;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

@RestController
//@RequestMapping("/api/slack")
public class SlackController {

        @GetMapping("/api")
        public SlackModel getInfo(@RequestParam("slack_name") String slack_name, @RequestParam("track") String track) {
            // Validate input parameters
            if (slack_name == null || track == null) {
                throw new IllegalArgumentException("slack_name and track are required parameters");
            }

            // Get current day of the week
            String currentDay = OffsetDateTime.now(ZoneOffset.UTC).getDayOfWeek().toString();
            String formattedDay = currentDay.substring(0, 1).toUpperCase() + currentDay.substring(1).toLowerCase();


            // Get current UTC time with a +/-2 minute window
//            DateTimeFormatter formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
//            String currentUtcTime = OffsetDateTime.now(ZoneOffset.UTC).minusMinutes(2).format(formatter);
            Instant currentTime = Instant.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
            String currentUtcTime = currentTime.atOffset(ZoneOffset.UTC).format(formatter);


            // GitHub URLs
            String githubFileUrl = "https://github.com/Ghedonieval/Slack/tree/main/src/main/java/com/example/slack";
            String githubRepoUrl = "https://github.com/Ghedonieval/Slack";

            return new SlackModel(slack_name, formattedDay, currentUtcTime, track, githubFileUrl, githubRepoUrl, 200);
        }
}
