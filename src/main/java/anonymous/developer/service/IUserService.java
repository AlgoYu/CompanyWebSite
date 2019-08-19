package anonymous.developer.service;

import anonymous.developer.model.User;

import java.util.List;

public interface IUserService {
    List<User> getAll();
    List<User> getPageUser(Integer startRow,Integer pageSize);
    List<User> getUserByRoleId(Integer roleId);
    User findUserByByPrimaryKey(int userId);
    Boolean updateUser(User user);
    Boolean deleteUser(Integer userId);
}
