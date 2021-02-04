package ua.mainacad;

import lombok.Builder;
import ua.mainacad.model.User;

@Builder

public class AppRunner {
    public static void main(String[] args) {
        //create user with 2 fields
        User user = User.builder()
                .login("qwerty")
                .password("12345")
                .build();
        System.out.println(user);
        User user2 = user.toBuilder().login("new login").build();
        System.out.println(user2);
    }
}
