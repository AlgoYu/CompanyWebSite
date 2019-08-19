package anonymous.developer.service;

import anonymous.developer.mapper.UserMapper;
import anonymous.developer.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService{
    @Autowired
    private UserMapper userMapper;

    /**
     * 返回所有用户数据
     * @return 所有用户数据
     */
    public List<User> getAll(){
        return userMapper.selectAll();
    }

    /**
     * 返回分页用户数据
     * @param startRow 起始行
     * @param pageSize 分页大小
     * @return 分页用户数据
     */
    public List<User> getPageUser(Integer startRow,Integer pageSize){
        startRow = (startRow-1)*pageSize;
        pageSize = startRow+pageSize;
        return userMapper.selectLimit(startRow,pageSize);
    }

    /**
     * 通过角色ID返回所属用户
     * @param roleId 角色ID
     * @return 所属该角色的用户
     */
    public List<User> getUserByRoleId(Integer roleId){
        return userMapper.selectByRoleId(roleId);
    }

    /**
     * 根据主键ID查找用户
     * @param userId
     * @return 用户
     */
    public User findUserByByPrimaryKey(int userId){
        return userMapper.selectByPrimaryKey(userId);
    }

    /**
     * 根据主键ID修改用户
     * @return 修改是否成功
     */
    public Boolean updateUser(User user){
        if(userMapper.updateByPrimaryKey(user)>0){
            return true;
        }else{
            return false;
        }
    }

    /**
     * 根据主键ID删除用户
     * @return 删除是否成功
     */
    public Boolean deleteUser(Integer userId){
        if(userMapper.deleteByPrimaryKey(userId) > 0){
            return true;
        }else{
            return false;
        }
    }
}