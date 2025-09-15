package practice.notepad.user.dto;

import practice.notepad.user.UserRole;

public record UserCreateRequest(
        String email,
        String password,
        String name,
        UserRole role
) {}

