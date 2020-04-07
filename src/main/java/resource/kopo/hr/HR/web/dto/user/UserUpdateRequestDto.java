package resource.kopo.hr.HR.web.dto.user;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import resource.kopo.hr.HR.domain.user.GenderType;
import resource.kopo.hr.HR.domain.user.User;

import java.util.Date;

@Getter
@NoArgsConstructor
public class UserUpdateRequestDto {

    private String username;
    private String tel;
    private GenderType gender;
    private String address;
    private String zipcode;
    private String email;
    private Date birth;

    @Builder
    public UserUpdateRequestDto(String username, String tel, GenderType gender,
                                String address, String zipcode, String email, Date birth) {
        this.username = username;
        this.tel = tel;
        this.gender = gender;
        this.address = address;
        this.zipcode = zipcode;
        this.email = email;
        this.birth = birth;
    }
}
