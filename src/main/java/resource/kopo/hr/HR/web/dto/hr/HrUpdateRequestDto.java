package resource.kopo.hr.HR.web.dto.hr;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import resource.kopo.hr.HR.domain.hr.MarriageType;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.Date;

@Getter
@NoArgsConstructor
public class HrUpdateRequestDto {

    private String jumin;
    private String bankId;
    private String bankName;
    private String nationality;
    private String position;
    private MarriageType married;
    private Date hiredDate;
    private Date registeredDate;

    @Builder
    public HrUpdateRequestDto(String jumin, String bankId, String bankName, String nationality,
                              String position, MarriageType married, Date hiredDate, Date registeredDate) {
        this.jumin = jumin;
        this.bankId = bankId;
        this.bankName = bankName;
        this.nationality = nationality;
        this.position = position;
        this.married = married;
        this.hiredDate = hiredDate;
        this.registeredDate = registeredDate;
    }
}
