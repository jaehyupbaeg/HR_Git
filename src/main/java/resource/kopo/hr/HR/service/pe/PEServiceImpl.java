package resource.kopo.hr.HR.service.pe;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import resource.kopo.hr.HR.domain.hr.PE;
import resource.kopo.hr.HR.domain.hr.repo.PERepository;
import resource.kopo.hr.HR.web.dto.pe.PESaveRequestDto;
import resource.kopo.hr.HR.web.dto.pe.PEUpdateRequestDto;

import java.util.Date;

@RequiredArgsConstructor
@Service
public class PEServiceImpl implements PEService {

    private PERepository peRepository;

    @Transactional
    public Long savePE(PESaveRequestDto requestDto){
        return peRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long updatePE(Long id, PEUpdateRequestDto requestDto){
        PE pe = peRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 내용은 수정할 수 없습니다."));

        pe.update(requestDto.getCompany(), requestDto.getPosition(), requestDto.getDepartment(),
                requestDto.getHiredDate(), requestDto.getResignedDate(), requestDto.getContent());

        return id;
    }

    @Transactional
    public void deletePE(Long id){
        PE pe = peRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 내용을 삭제할 수 없습니다."));

        peRepository.delete(pe);
    }
}
