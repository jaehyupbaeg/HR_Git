package resource.kopo.hr.HR.domain.hr;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Getter
@NoArgsConstructor
@Entity
public class EQ {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EQ_ID")
    private Long id;

    @Column(length = 100, nullable = false)
    private String school;

    @Column(length = 100)
    private String degree;

    @Column(length = 100, nullable = false)
    private String grade;

    @Column(nullable = false)
    private Date acceptedDate;

    @Column
    private Date graduatedDate;

    @Column(length = 200, nullable = false)
    private String location;

    @ManyToOne
    @JoinColumn(name = "HR_ID")
    private HR hr;

    @Builder
    public EQ(String school, String degree, String grade,
              Date acceptedDate, Date graduatedDate, String location, HR hr) {
        this.school = school;
        this.degree = degree;
        this.grade = grade;
        this.acceptedDate = acceptedDate;
        this.graduatedDate = graduatedDate;
        this.location = location;
        this.hr = hr;
    }

    public void update(String school, String degree, String grade,
              Date acceptedDate, Date graduatedDate, String location) {
        this.school = school;
        this.degree = degree;
        this.grade = grade;
        this.acceptedDate = acceptedDate;
        this.graduatedDate = graduatedDate;
        this.location = location;
    }
}
