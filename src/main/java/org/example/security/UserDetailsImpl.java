package org.example.security;

import org.example.Entity.User;
import org.example.models.UserInfo;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class UserDetailsImpl implements UserDetails {

    private final UserInfo userInfo;
    private final List<String> roleNames;

    public UserDetailsImpl(UserInfo userInfo, List<String> roleNames) {
        this.userInfo = userInfo;
        this.roleNames = roleNames;
    }

    public UserDetailsImpl(User user) {
        this.userInfo = new UserInfo();
        this.userInfo.setUsername(user.getUsername());
        this.userInfo.setFullName(user.getFullName());
        this.userInfo.setGroups(user.getGroups());
        this.roleNames = null; // or set a default value
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return userInfo.getGroups().stream()
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return null; // No password for this example
    }

    @Override
    public String getUsername() {
        return userInfo.getUsername();
    }

    public String getFullName() {
        return userInfo.getFullName();
    }

    public List<String> getRoleNames() {
        return roleNames;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}