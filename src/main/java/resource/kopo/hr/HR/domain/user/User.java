package resource.kopo.hr.HR.domain.user;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import resource.kopo.hr.HR.domain.hr.HR;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@NoArgsConstructor
@Entity
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private Long id;

    @Column(length = 100, unique = true)
    private String userHrId;

    @Column(length = 100)
    private String username;

    @Column(length = 100)
    private String tel;

    @Enumerated(EnumType.STRING)
    private GenderType gender;

    @Column(length = 200)
    private String address;

    @Column(length = 100)
    private String zipcode;

    @Column(length = 100)
    private String email;

    @Column
    private Date birth;

    @Column
    private LocalDateTime created;

    @OneToOne(mappedBy = "user")
    private HR hr;

    @Builder
    public User(String userHrId, String username, String tel, GenderType gender,
                String address, String zipcode, String email, Date birth) {
        this.userHrId = userHrId;
        this.username = username;
        this.tel = tel;
        this.gender = gender;
        this.address = address;
        this.zipcode = zipcode;
        this.email = email;
        this.birth = birth;
    }

    public void update(String username, String tel, GenderType gender,
                String address, String zipcode, String email, Date birth) {
        this.username = username;
        this.tel = tel;
        this.gender = gender;
        this.address = address;
        this.zipcode = zipcode;
        this.email = email;
        this.birth = birth;
    }
}
