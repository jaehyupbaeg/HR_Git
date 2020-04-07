package resource.kopo.hr.HR.service.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import resource.kopo.hr.HR.domain.hr.HR;
import resource.kopo.hr.HR.domain.hr.repo.HRRepository;
import resource.kopo.hr.HR.domain.user.User;
import resource.kopo.hr.HR.domain.user.repo.UserRepository;
import resource.kopo.hr.HR.web.dto.hr.HrAllResponseDto;
import resource.kopo.hr.HR.web.dto.user.UserListResponseDto;
import resource.kopo.hr.HR.web.dto.user.UserResponseDto;
import resource.kopo.hr.HR.web.dto.user.UserSaveRequestDto;
import resource.kopo.hr.HR.web.dto.user.UserUpdateRequestDto;


import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final HRRepository hrRepository;

    @Transactional
    public Long saveUser(UserSaveRequestDto requestDto){
        Long id;
        id = userRepository.save(requestDto.toEntity()).getId();

        HR hr = HR.builder()
                .user(requestDto.toEntity())
                .build();

        hrRepository.save(hr);

        return id;
    }

    @Transactional
    public Long updateUser(Long id, UserUpdateRequestDto requestDto){
        User user = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다."));

        user.update(requestDto.getUsername(), requestDto.getTel(), requestDto.getGender(),
                requestDto.getAddress(), requestDto.getZipcode(), requestDto.getEmail(),
                requestDto.getBirth());

        return id;
    }

    @Transactional
    public void deleteUser(Long id){
        User user = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다."));

        userRepository.delete(user);
    }

    @Transactional(readOnly = true)
    public UserResponseDto findUserById(Long id){
        User entity = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 사용자가 없습니다."));
        
        return new UserResponseDto(entity);
    }
    
    @Transactional(readOnly = true)
    public List<UserListResponseDto> findAllUserDesc(){
        List<UserListResponseDto> collect = userRepository.findAll().stream()
                .map(UserListResponseDto::new)
                .collect(Collectors.toList());
        return collect;
    }
}
