package resource.kopo.hr.HR.service.eq;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import resource.kopo.hr.HR.domain.hr.EQ;
import resource.kopo.hr.HR.domain.hr.repo.EQRepository;
import resource.kopo.hr.HR.web.dto.eq.EQSaveRequestDto;
import resource.kopo.hr.HR.web.dto.eq.EQUpdateRequestDto;

import java.util.Date;

@RequiredArgsConstructor
@Service
public class EQServiceImpl implements EQService {

    private final EQRepository eqRepository;

    @Transactional
    public Long saveEQ(EQSaveRequestDto reqeustDto){
        return eqRepository.save(reqeustDto.toEntity()).getId();
    }

    @Transactional
    public Long updateEQ(Long id, EQUpdateRequestDto requestDto){
        EQ eq = eqRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 내용은 수정할 수 없습니다."));

        eq.update(requestDto.getSchool(), requestDto.getDegree(), requestDto.getGrade(), requestDto.getAcceptedDate(),
                requestDto.getGraduatedDate(), requestDto.getLocation());

        return id;
    }

    @Transactional
    public void deleteEQ(Long id){
        EQ eq = eqRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 내용을 삭제할 수 없습니다."));

        eqRepository.delete(eq);
    }
}
