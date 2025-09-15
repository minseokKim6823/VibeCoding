package practice.notepad.user.dto;

import practice.notepad.user.UserRole;

public record UserUpdateRequest(
        String name,
        String password,
        UserRole role
) {}

