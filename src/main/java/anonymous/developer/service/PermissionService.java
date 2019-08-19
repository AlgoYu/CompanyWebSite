package anonymous.developer.service;

import anonymous.developer.mapper.PermissionMapper;
import anonymous.developer.model.Permission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 权限服务
 */
@Service
public class PermissionService {
    @Autowired
    private PermissionMapper permissionMapper;

    /**
     * 增加权限数据
     * @return 增加是否成功
     */
    public Boolean addPermission(Permission permission){
        if(permissionMapper.insert(permission)>0){
            return true;
        }else{
            return false;
        }
    }
    /**
     * 返回所有权限数据
     * @return 所有权限数据
     */
    public List<Permission> getAll(){
        return permissionMapper.selectAll();
    }

    /**
     * 返回分页权限数据
     * @param startRow 起始行
     * @param pageSize 分页大小
     * @return 权限数据
     */
    public List<Permission> getPagePermission(Integer startRow,Integer pageSize){
        startRow = (startRow-1)*pageSize;
        pageSize = startRow+pageSize;
        return permissionMapper.selectLimit(startRow,pageSize);
    }

    /**
     * 通过角色主键返回该角色所有权限数据
     * @param id 角色主键
     * @return 角色权限数据
     */
    public List<Permission> getPermissionByRoleId(Integer id){
        return permissionMapper.selectByRoleId(id);
    }
    /**
     * 通过主键ID查找权限
     * @param id
     * @return 权限数据
     */
    public Permission findPermissionByPrimaryKey(Integer id){
        return permissionMapper.selectByPrimaryKey(id);
    }

    /**
     * 通过主键ID修改权限
     * @param permission
     * @return 修改是否成功
     */
    public Boolean updatePermissionByPrimaryKey(Permission permission){
        if (permissionMapper.updateByPrimaryKey(permission)>0){
            return true;
        }else{
            return false;
        }
    }

    /**
     * 通过主键ID删除权限
     * @param id
     * @return 删除是否成功
     */
    public Boolean deletePermissionByPrimaryKey(Integer id){
        if(permissionMapper.deleteByPrimaryKey(id)>0){
            return true;
        }else{
            return false;
        }
    }
}