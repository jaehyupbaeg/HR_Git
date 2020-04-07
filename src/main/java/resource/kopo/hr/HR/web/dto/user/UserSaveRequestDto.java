package resource.kopo.hr.HR.web.dto.user;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import resource.kopo.hr.HR.domain.user.GenderType;
import resource.kopo.hr.HR.domain.user.User;

import java.util.Date;

@Getter
@NoArgsConstructor
public class UserSaveRequestDto {

    private String userHrId;
    private String username;
    private String tel;
    private GenderType gender;
    private String address;
    private String zipcode;
    private String email;
    private Date birth;

    @Builder
    public UserSaveRequestDto(String userHrId, String username, String tel, GenderType gender,
                              String address, String zipcode, String email, Date birth) {
        this.userHrId = userHrId;
        this.username = username;
        this.tel = tel;
        this.gender = gender;
        this.address = address;
        this.zipcode = zipcode;
        this.email = email;
        this.birth = birth;
    }

    public User toEntity(){
        return User.builder()
                .userHrId(userHrId)
                .username(username)
                .tel(tel)
                .gender(gender)
                .address(address)
                .zipcode(zipcode)
                .email(email)
                .birth(birth)
                .build();
    }
}
