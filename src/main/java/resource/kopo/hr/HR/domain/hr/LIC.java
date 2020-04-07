package resource.kopo.hr.HR.domain.hr;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Getter
@NoArgsConstructor
@Entity
public class LIC {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LIC_ID")
    private Long id;

    @Column(length = 100, nullable = false)
    private String code;

    @Column(length = 100, nullable = false)
    private String issueGroup;

    @Column(nullable = false)
    private Date gainedDate;

    @ManyToOne
    @JoinColumn(name = "HR_ID")
    private HR hr;

    @Builder
    public LIC(String code, String issueGroup, Date gainedDate, HR hr) {
        this.code = code;
        this.issueGroup = issueGroup;
        this.gainedDate = gainedDate;
        this.hr = hr;
    }

    public void update(String code, String issueGroup, Date gainedDate) {
        this.code = code;
        this.issueGroup = issueGroup;
        this.gainedDate = gainedDate;
    }
}
