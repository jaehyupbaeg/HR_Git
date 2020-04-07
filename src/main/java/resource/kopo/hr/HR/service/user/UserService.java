package resource.kopo.hr.HR.service.user;

import resource.kopo.hr.HR.web.dto.user.UserListResponseDto;
import resource.kopo.hr.HR.web.dto.user.UserResponseDto;
import resource.kopo.hr.HR.web.dto.user.UserSaveRequestDto;
import resource.kopo.hr.HR.web.dto.user.UserUpdateRequestDto;

import java.util.List;

public interface UserService {
    public Long saveUser(UserSaveRequestDto requestDto);
    public Long updateUser(Long id, UserUpdateRequestDto requestDto);
    public void deleteUser(Long id);
    public UserResponseDto findUserById(Long id);
    public List<UserListResponseDto> findAllUserDesc();
}
