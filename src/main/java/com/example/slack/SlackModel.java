package com.example.slack;

import java.util.Objects;

public class SlackModel {
    private String slackName;
    private String currentDayOfWeek;
    private String currentUtcTime;
    private String track;
    private String githubFileUrl;
    private String githubSourceUrl;
    private int statusCode;

    public SlackModel() {
    }

    public SlackModel(String slackName, String currentDayOfWeek, String currentUtcTime, String track, String githubFileUrl, String githubSourceUrl, int statusCode) {
        this.slackName = slackName;
        this.currentDayOfWeek = currentDayOfWeek;
        this.currentUtcTime = currentUtcTime;
        this.track = track;
        this.githubFileUrl = githubFileUrl;
        this.githubSourceUrl = githubSourceUrl;
        this.statusCode = statusCode;
    }

    public String getSlackName() {
        return slackName;
    }

    public void setSlackName(String slackName) {
        this.slackName = slackName;
    }

    public String getCurrentDayOfWeek() {
        return currentDayOfWeek;
    }

    public void setCurrentDayOfWeek(String currentDayOfWeek) {
        this.currentDayOfWeek = currentDayOfWeek;
    }

    public String getCurrentUtcTime() {
        return currentUtcTime;
    }

    public void setCurrentUtcTime(String currentUtcTime) {
        this.currentUtcTime = currentUtcTime;
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public String getGithubFileUrl() {
        return githubFileUrl;
    }

    public void setGithubFileUrl(String githubFileUrl) {
        this.githubFileUrl = githubFileUrl;
    }

    public String getGithubSourceUrl() {
        return githubSourceUrl;
    }

    public void setGithubSourceUrl(String githubSourceUrl) {
        this.githubSourceUrl = githubSourceUrl;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SlackModel that = (SlackModel) o;
        return statusCode == that.statusCode && Objects.equals(slackName, that.slackName) && Objects.equals(currentDayOfWeek, that.currentDayOfWeek) && Objects.equals(currentUtcTime, that.currentUtcTime) && Objects.equals(track, that.track) && Objects.equals(githubFileUrl, that.githubFileUrl) && Objects.equals(githubSourceUrl, that.githubSourceUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(slackName, currentDayOfWeek, currentUtcTime, track, githubFileUrl, githubSourceUrl, statusCode);
    }

    @Override
    public String toString() {
        return "SlackModel{" +
                "slackName='" + slackName + '\'' +
                ", currentDayOfWeek='" + currentDayOfWeek + '\'' +
                ", currentUtcTime='" + currentUtcTime + '\'' +
                ", track='" + track + '\'' +
                ", githubFileUrl='" + githubFileUrl + '\'' +
                ", githubSourceUrl='" + githubSourceUrl + '\'' +
                ", statusCode=" + statusCode +
                '}';
    }
}
