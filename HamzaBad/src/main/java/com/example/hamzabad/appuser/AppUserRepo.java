package com.example.hamzabad.appuser;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepo extends JpaRepository<AppUser,Long> {
    AppUser findAppUserByEmail(String email);
    AppUser findAppUserByUsername(String username);
}
