package resource.kopo.hr.HR.web.dto.eq;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import resource.kopo.hr.HR.domain.hr.EQ;
import resource.kopo.hr.HR.domain.hr.HR;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Getter
@NoArgsConstructor
public class EQSaveRequestDto {

    private String school;
    private String degree;
    private String grade;
    private Date acceptedDate;
    private Date graduatedDate;
    private String location;
    private HR hr;

    @Builder
    public EQSaveRequestDto(String school, String degree, String grade, Date acceptedDate,
                            Date graduatedDate, String location, HR hr) {
        this.school = school;
        this.degree = degree;
        this.grade = grade;
        this.acceptedDate = acceptedDate;
        this.graduatedDate = graduatedDate;
        this.location = location;
        this.hr = hr;
    }

    public EQ toEntity(){
        return EQ.builder()
                .school(school)
                .degree(degree)
                .grade(grade)
                .acceptedDate(acceptedDate)
                .graduatedDate(graduatedDate)
                .location(location)
                .hr(hr)
                .build();
    }
}
