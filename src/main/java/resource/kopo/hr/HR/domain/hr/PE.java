package resource.kopo.hr.HR.domain.hr;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Getter
@NoArgsConstructor
@Entity
public class PE {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PE_ID")
    private Long id;

    @Column(length = 100, nullable = false)
    private String company;

    @Column(length = 100, nullable = false)
    private String position;

    @Column(length = 100, nullable = false)
    private String department;

    @Column(nullable = false)
    private Date hiredDate;

    @Column(nullable = false)
    private Date resignedDate;

    @Column(length = 300)
    private String content;

    @ManyToOne
    @JoinColumn(name = "HR_ID")
    private HR hr;

    @Builder
    public PE(String company, String position, String department,
              Date hiredDate, Date resignedDate, String content, HR hr) {
        this.company = company;
        this.position = position;
        this.department = department;
        this.hiredDate = hiredDate;
        this.resignedDate = resignedDate;
        this.content = content;
        this.hr = hr;
    }

    public void update(String company, String position, String department,
              Date hiredDate, Date resignedDate, String content) {
        this.company = company;
        this.position = position;
        this.department = department;
        this.hiredDate = hiredDate;
        this.resignedDate = resignedDate;
        this.content = content;
    }
}
