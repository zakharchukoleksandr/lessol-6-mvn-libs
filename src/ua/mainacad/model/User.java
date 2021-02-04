package ua.mainacad.model;

import lombok.*;
import lombok.extern.java.Log;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Builder(toBuilder = true)
@Log

public class User {
    private String login;
    private String password;
    private String firstName;
    private String lastName;

}
