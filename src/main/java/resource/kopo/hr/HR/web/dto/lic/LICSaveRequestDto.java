package resource.kopo.hr.HR.web.dto.lic;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import resource.kopo.hr.HR.domain.hr.HR;
import resource.kopo.hr.HR.domain.hr.LIC;

import java.util.Date;

@Getter
@NoArgsConstructor
public class LICSaveRequestDto {

    private String code;
    private String issueGroup;
    private Date gainedDate;
    private HR hr;

    @Builder
    public LICSaveRequestDto(String code, String issueGroup, Date gainedDate, HR hr) {
        this.code = code;
        this.issueGroup = issueGroup;
        this.gainedDate = gainedDate;
        this.hr = hr;
    }

    public LIC toEntity(){
        return LIC.builder()
                .code(code)
                .issueGroup(issueGroup)
                .gainedDate(gainedDate)
                .hr(hr)
                .build();
    }
}
