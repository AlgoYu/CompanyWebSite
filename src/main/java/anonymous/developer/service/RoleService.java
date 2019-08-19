package anonymous.developer.service;

import anonymous.developer.mapper.RoleMapper;
import anonymous.developer.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    @Autowired
    private RoleMapper roleMapper;

    /**
     * 返回所有角色数据
     * @return 角色数据
     */
    public List<Role> getAll(){
        return roleMapper.selectAll();
    }

    /**
     * 返回分页角色数据
     * @param startRow 起始行
     * @param pageSize 结束行
     * @return 分页角色数据
     */
    public List<Role> getPageRole(Integer startRow,Integer pageSize){
        startRow = (startRow-1)*pageSize;
        pageSize = startRow+pageSize;
        return roleMapper.selectLimit(startRow,pageSize);
    }

    /**
     * 通过用户ID得到所有角色数据
     * @param userId
     * @return
     */
    public List<Role> getRoleByUserId(Integer userId){
        return roleMapper.selectByUserId(userId);
    }

    /**
     * 通过主键ID查找角色
     * @param id
     * @return 角色数据
     */
    public Role findRoleByPrimaryKey(Integer id){
        return roleMapper.selectByPrimaryKey(id);
    }

    /**
     * 通过主键ID修改角色
     * @return 修改是否成功
     */
    public Boolean updateRoleByPrimaryKey(Role role){
        if(roleMapper.updateByPrimaryKey(role)>0){
            return true;
        }else{
            return false;
        }
    }

    /**
     * 通过主键ID删除角色
     * @return 删除是否成功
     */
    public Boolean deleteRoleByPrimaryKey(Integer id){
        if(roleMapper.deleteByPrimaryKey(id)>0){
            return true;
        }else{
            return false;
        }
    }
}