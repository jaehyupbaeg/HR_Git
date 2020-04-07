package resource.kopo.hr.HR.web.dto.user;

import lombok.Getter;
import lombok.NoArgsConstructor;
import resource.kopo.hr.HR.domain.user.GenderType;
import resource.kopo.hr.HR.domain.user.User;

import java.util.Date;

@Getter
@NoArgsConstructor
public class UserResponseDto {

    private Long id;
    private String userHrId;
    private String username;
    private String tel;
    private GenderType gender;
    private String address;
    private String zipcode;
    private String email;
    private Date birth;

    public UserResponseDto(User entity){
        this.id = entity.getId();
        this.userHrId = entity.getUserHrId();
        this.username = entity.getUsername();
        this.tel = entity.getTel();
        this.gender = entity.getGender();
        this.address = entity.getAddress();
        this.zipcode = entity.getZipcode();
        this.email = entity.getEmail();
        this.birth = entity.getBirth();
    }
}
