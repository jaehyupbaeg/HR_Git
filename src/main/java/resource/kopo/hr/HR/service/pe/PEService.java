package resource.kopo.hr.HR.service.pe;

import resource.kopo.hr.HR.web.dto.pe.PESaveRequestDto;
import resource.kopo.hr.HR.web.dto.pe.PEUpdateRequestDto;

import java.util.Date;

public interface PEService {

    public Long savePE(PESaveRequestDto requestDto);
    public Long updatePE(Long id, PEUpdateRequestDto requestDto);
    public void deletePE(Long id);

}
