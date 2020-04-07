package resource.kopo.hr.HR.web.dto.pe;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@NoArgsConstructor
public class PEUpdateRequestDto {

    private String company;
    private String position;
    private String department;
    private Date hiredDate;
    private Date resignedDate;
    private String content;

    @Builder
    public PEUpdateRequestDto(String company, String position, String department,
                              Date hiredDate, Date resignedDate, String content) {
        this.company = company;
        this.position = position;
        this.department = department;
        this.hiredDate = hiredDate;
        this.resignedDate = resignedDate;
        this.content = content;
    }
}
