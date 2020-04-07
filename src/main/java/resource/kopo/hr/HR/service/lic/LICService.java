package resource.kopo.hr.HR.service.lic;

import resource.kopo.hr.HR.web.dto.lic.LICSaveRequestDto;
import resource.kopo.hr.HR.web.dto.lic.LICUpdateRequestDto;

public interface LICService {

    public Long saveLIC(LICSaveRequestDto requestDto);
    public Long updateLIC(Long id, LICUpdateRequestDto requestDto);
    public void deleteLIC(Long id);
}
