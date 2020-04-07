package resource.kopo.hr.HR.service.lic;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import resource.kopo.hr.HR.domain.hr.LIC;
import resource.kopo.hr.HR.domain.hr.PE;
import resource.kopo.hr.HR.domain.hr.repo.LICRepository;
import resource.kopo.hr.HR.domain.hr.repo.PERepository;
import resource.kopo.hr.HR.web.dto.lic.LICSaveRequestDto;
import resource.kopo.hr.HR.web.dto.lic.LICUpdateRequestDto;
import resource.kopo.hr.HR.web.dto.pe.PESaveRequestDto;
import resource.kopo.hr.HR.web.dto.pe.PEUpdateRequestDto;

@RequiredArgsConstructor
@Service
public class LICServiceImpl {

    private final LICRepository licRepository;

    @Transactional
    public Long saveLIC(LICSaveRequestDto requestDto){
        return licRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long updateLIC(Long id, LICUpdateRequestDto requestDto){
        LIC lic = licRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 내용은 수정할 수 없습니다"));

        lic.update(requestDto.getCode(), requestDto.getIssueGroup(), requestDto.getGainedDate());

        return id;
    }

    @Transactional
    public void deleteLIC(Long id){
        LIC lic = licRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 내용을 삭제할 수 없습니다."));

        licRepository.delete(lic);
    }
}
