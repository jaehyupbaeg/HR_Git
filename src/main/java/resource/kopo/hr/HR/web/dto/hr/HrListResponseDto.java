package resource.kopo.hr.HR.web.dto.hr;

import lombok.Getter;
import lombok.NoArgsConstructor;
import resource.kopo.hr.HR.domain.hr.HR;
import resource.kopo.hr.HR.domain.hr.MarriageType;
import resource.kopo.hr.HR.domain.user.User;

import java.util.Date;

@Getter
@NoArgsConstructor
public class HrListResponseDto {

    private Long id;
    private String jumin;
    private String bankId;
    private String bankName;
    private String nationality;
    private String position;
    private MarriageType married;
    private Date hiredDate;
    private Date registeredDate;
    private User user;

    public HrListResponseDto(HR entity) {
        this.id = entity.getId();
        this.jumin = entity.getJumin();
        this.bankId = entity.getBankId();
        this.bankName = entity.getBankName();
        this.nationality = entity.getNationality();
        this.position = entity.getPosition();
        this.married = entity.getMarried();
        this.hiredDate = entity.getHiredDate();
        this.registeredDate = entity.getRegisteredDate();
        this.user = entity.getUser();
    }
}
