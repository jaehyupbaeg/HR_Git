package resource.kopo.hr.HR.web.dto.eq;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@NoArgsConstructor
public class EQUpdateRequestDto {

    private String school;
    private String degree;
    private String grade;
    private Date acceptedDate;
    private Date graduatedDate;
    private String location;

    @Builder
    public EQUpdateRequestDto(String school, String degree, String grade,
                              Date acceptedDate, Date graduatedDate, String location) {
        this.school = school;
        this.degree = degree;
        this.grade = grade;
        this.acceptedDate = acceptedDate;
        this.graduatedDate = graduatedDate;
        this.location = location;
    }
}
