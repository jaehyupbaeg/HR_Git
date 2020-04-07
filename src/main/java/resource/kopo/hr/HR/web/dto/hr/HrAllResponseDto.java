package resource.kopo.hr.HR.web.dto.hr;

import lombok.Getter;
import lombok.NoArgsConstructor;
import resource.kopo.hr.HR.domain.hr.EQ;
import resource.kopo.hr.HR.domain.hr.HR;
import resource.kopo.hr.HR.domain.hr.LIC;
import resource.kopo.hr.HR.domain.hr.PE;

import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
public class HrAllResponseDto {

    private HR hr;
    private List<EQ> eqList = new ArrayList<>();
    private List<LIC> licList = new ArrayList<>();
    private List<PE> peList = new ArrayList<>();

    public HrAllResponseDto(HR hr, List<EQ> eqList, List<LIC> licList, List<PE> peList) {
        this.hr = hr;
        this.eqList = eqList;
        this.licList = licList;
        this.peList = peList;
    }
}
