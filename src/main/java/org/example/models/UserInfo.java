package org.example.models;

import java.util.List;

public class UserInfo {
    private String username;
    private String fullName;
    private List<String> groups;

    // Getters and setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<String> getGroups() {
        return groups;
    }

    public void setGroups(List<String> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "username='" + username + '\'' +
                ", fullName='" + fullName + '\'' +
                ", groups=" + groups +
                '}';
    }
}