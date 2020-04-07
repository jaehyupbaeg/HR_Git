package resource.kopo.hr.HR.service.hr;

import resource.kopo.hr.HR.web.dto.hr.HrAllResponseDto;
import resource.kopo.hr.HR.web.dto.hr.HrListResponseDto;
import resource.kopo.hr.HR.web.dto.hr.HrResponseDto;
import resource.kopo.hr.HR.web.dto.hr.HrUpdateRequestDto;

import java.util.List;

public interface HRService {

    public Long updateHr(Long id, HrUpdateRequestDto requestDto);
    public void deleteHr(Long id);
    public List<HrListResponseDto> findAll();
    public HrResponseDto findHrById(Long id);
    public HrAllResponseDto provideAllInformation(Long id);
}
