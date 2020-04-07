package resource.kopo.hr.HR.service.hr;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import resource.kopo.hr.HR.domain.hr.HR;
import resource.kopo.hr.HR.domain.hr.repo.HRRepository;
import resource.kopo.hr.HR.web.dto.hr.HrAllResponseDto;
import resource.kopo.hr.HR.web.dto.hr.HrListResponseDto;
import resource.kopo.hr.HR.web.dto.hr.HrResponseDto;
import resource.kopo.hr.HR.web.dto.hr.HrUpdateRequestDto;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class HRServiceImpl implements HRService {

    private final HRRepository hrRepository;

    // HR의 데이터는 USER가 입력된 값이 나타나기에 사실상 update임.
    @Transactional
    public Long updateHr(Long id, HrUpdateRequestDto requestDto){
        HR hr = hrRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다."));

        hr.update(requestDto.getJumin(), requestDto.getBankId(), requestDto.getBankName(), requestDto.getNationality(),
                requestDto.getPosition(), requestDto.getMarried(), requestDto.getHiredDate(),
                requestDto.getRegisteredDate());

        return id;
    }

    @Transactional
    public void deleteHr(Long id){
        HR hr = hrRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다."));

        hrRepository.delete(hr);
    }

    @Transactional(readOnly = true)
    public HrResponseDto findHrById(Long id){
        HR hr = hrRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다."));

        return new HrResponseDto(hr);
    }


    @Transactional(readOnly = true)
    public List<HrListResponseDto> findAll(){
        List<HrListResponseDto> collect = hrRepository.findAll().stream()
                .map(HrListResponseDto::new)
                .collect(Collectors.toList());
        return collect;
    }

    @Transactional(readOnly = true)
    public HrAllResponseDto provideAllInformation(Long id){
        HR hr = hrRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다."));

        return new HrAllResponseDto(hr, hr.getEqList(), hr.getLicList(), hr.getPeList());
    }
}
