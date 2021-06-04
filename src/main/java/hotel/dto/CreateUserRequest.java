package hotel.dto;

import hotel.UserRole;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUserRequest {

    private String phone;

    private String password;

    private String firstName;

    private String lastName;

    private UserRole role;

}
