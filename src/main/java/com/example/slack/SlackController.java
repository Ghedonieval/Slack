package com.example.slack;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping("/api/slack")
public class SlackController {

        @GetMapping("/info")
        public SlackModel getInfo(@RequestParam("slack_name") String slack_name, @RequestParam("track") String track) {
            // Validate input parameters
            if (slack_name == null || track == null) {
                throw new IllegalArgumentException("slack_name and track are required parameters");
            }

            // Get current day of the week
            String currentDay = OffsetDateTime.now(ZoneOffset.UTC).getDayOfWeek().toString();

            // Get current UTC time with a +/-2 minute window
            DateTimeFormatter formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
            String currentUtcTime = OffsetDateTime.now(ZoneOffset.UTC).minusMinutes(2).format(formatter);

            // GitHub URLs
            String githubFileUrl = "https://github.com/username/repo/blob/main/file_name.ext";
            String githubRepoUrl = "https://github.com/username/repo";

            return new SlackModel(slack_name, currentDay, currentUtcTime, track, githubFileUrl, githubRepoUrl, 200);
        }
}
