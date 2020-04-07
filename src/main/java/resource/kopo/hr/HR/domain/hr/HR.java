package resource.kopo.hr.HR.domain.hr;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import resource.kopo.hr.HR.domain.user.User;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@NoArgsConstructor
@Entity
public class HR {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "HR_ID")
    private Long id;

    // 이거 유니트 문제가 있는지 다 만든다음에 확인하자.
    @Column(length = 100, unique = true)
    private String jumin;

    @Column(length = 100)
    private String bankId;

    @Column(length = 100)
    private String bankName;

    @Column(length = 100)
    private String nationality;

    @Column(length = 100)
    private String position;

    // 이 Enum 값은 어떻게 입력하는지 확인하자.
    @Enumerated(EnumType.STRING)
    private MarriageType married;

    @Column
    private Date hiredDate;

    @Column
    private Date registeredDate;

    @OneToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "USER_ID")
    private User user;

    @OneToMany(mappedBy = "hr")
    private List<PE> peList = new ArrayList<>();

    @OneToMany(mappedBy = "hr")
    private List<EQ> eqList = new ArrayList<>();

    @OneToMany(mappedBy = "hr")
    private List<LIC> licList = new ArrayList<>();

    @Builder
    public HR(String jumin, String bankId, String bankName, String nationality,
                   String position, MarriageType married, Date hiredDate, Date registeredDate, User user) {
        this.jumin = jumin;
        this.bankId = bankId;
        this.bankName = bankName;
        this.nationality = nationality;
        this.position = position;
        this.married = married;
        this.hiredDate = hiredDate;
        this.registeredDate = registeredDate;
        this.user = user;
    }

    public void update(String jumin, String bankId, String bankName, String nationality,
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
