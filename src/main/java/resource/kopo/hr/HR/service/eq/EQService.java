package resource.kopo.hr.HR.service.eq;

import resource.kopo.hr.HR.web.dto.eq.EQSaveRequestDto;
import resource.kopo.hr.HR.web.dto.eq.EQUpdateRequestDto;

public interface EQService {

    public Long saveEQ(EQSaveRequestDto reqeustDto);
    public Long updateEQ(Long id, EQUpdateRequestDto requestDto);
    public void deleteEQ(Long id);

}
