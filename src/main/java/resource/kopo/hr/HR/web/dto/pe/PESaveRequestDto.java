package resource.kopo.hr.HR.web.dto.pe;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import resource.kopo.hr.HR.domain.hr.EQ;
import resource.kopo.hr.HR.domain.hr.HR;
import resource.kopo.hr.HR.domain.hr.PE;

import java.util.Date;

@Getter
@NoArgsConstructor
public class PESaveRequestDto {

    private String company;
    private String position;
    private String department;
    private Date hiredDate;
    private Date resignedDate;
    private String content;
    private HR hr;

    @Builder
    public PESaveRequestDto(String company, String position, String department,
                            Date hiredDate, Date resignedDate, String content, HR hr) {
        this.company = company;
        this.position = position;
        this.department = department;
        this.hiredDate = hiredDate;
        this.resignedDate = resignedDate;
        this.content = content;
        this.hr = hr;
    }

    public PE toEntity(){
        return PE.builder()
                .company(company)
                .position(position)
                .department(department)
                .hiredDate(hiredDate)
                .resignedDate(resignedDate)
                .content(content)
                .hr(hr)
                .build();
    }
}
