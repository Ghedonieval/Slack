package com.example.slack.entity;

import java.util.Objects;

public class SlackModel {
    private String slack_name;
    private String current_day;
    private String utc_time;
    private String track;
    private String github_file_url;
    private String github_repo_url;
    private int status_code;

    public SlackModel() {
    }

    public SlackModel(String slack_name, String current_day, String utc_time, String track, String github_file_url, String github_repo_url, int status_code) {
        this.slack_name = slack_name;
        this.current_day = current_day;
        this.utc_time = utc_time;
        this.track = track;
        this.github_file_url = github_file_url;
        this.github_repo_url = github_repo_url;
        this.status_code = status_code;
    }

    public String getSlack_name() {
        return slack_name;
    }

    public void setSlack_name(String slack_name) {
        this.slack_name = slack_name;
    }

    public String getCurrent_day() {
        return current_day;
    }

    public void setCurrent_day(String current_day) {
        this.current_day = current_day;
    }

    public String getUtc_time() {
        return utc_time;
    }

    public void setUtc_time(String utc_time) {
        this.utc_time = utc_time;
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public String getGithub_file_url() {
        return github_file_url;
    }

    public void setGithub_file_url(String github_file_url) {
        this.github_file_url = github_file_url;
    }

    public String getGithub_repo_url() {
        return github_repo_url;
    }

    public void setGithub_repo_url(String github_repo_url) {
        this.github_repo_url = github_repo_url;
    }

    public int getStatus_code() {
        return status_code;
    }

    public void setStatus_code(int status_code) {
        this.status_code = status_code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SlackModel that = (SlackModel) o;
        return status_code == that.status_code && Objects.equals(slack_name, that.slack_name) && Objects.equals(current_day, that.current_day) && Objects.equals(utc_time, that.utc_time) && Objects.equals(track, that.track) && Objects.equals(github_file_url, that.github_file_url) && Objects.equals(github_repo_url, that.github_repo_url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(slack_name, current_day, utc_time, track, github_file_url, github_repo_url, status_code);
    }

    @Override
    public String toString() {
        return "SlackModel{" +
                "slack_name='" + slack_name + '\'' +
                ", current_day='" + current_day + '\'' +
                ", utc_time='" + utc_time + '\'' +
                ", track='" + track + '\'' +
                ", github_file_url='" + github_file_url + '\'' +
                ", github_repo_url='" + github_repo_url + '\'' +
                ", status_code=" + status_code +
                '}';
    }
}
