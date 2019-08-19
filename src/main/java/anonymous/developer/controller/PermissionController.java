package anonymous.developer.controller;

import anonymous.developer.common.CommonEnumException;
import anonymous.developer.common.CommonException;
import anonymous.developer.common.CommonResult;
import anonymous.developer.model.Permission;
import anonymous.developer.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 权限控制器
 * 作者:阿宇
 * QQ794763733
 */
@RestController
public class PermissionController extends BaseController{
    /**
     * 权限服务
     */
    @Autowired
    private PermissionService permissionService;

    /**
     * 返回所有的权限数据
     * @return
     */
    @GetMapping("/getAllPermission")
    public CommonResult getAllPermission(){
        return CommonResult.createCommonResult(permissionService.getAll());
    }

    /**
     * 返回角色所有的权限数据
     * @param roleId
     * @return
     */
    @PostMapping("/getPermissionByRoleId")
    public CommonResult getPermissionByRoleId(Integer roleId){
        return CommonResult.createCommonResult(permissionService.getPermissionByRoleId(roleId));
    }

    /**
     * 返回分页权限数据
     * @param currentPage
     * @param pageSize
     * @return
     */
    @PostMapping("/getPagePermission")
    public CommonResult getPagePermission(Integer currentPage,Integer pageSize){
        return CommonResult.createCommonResult(permissionService.getPagePermission(currentPage,pageSize));
    }

    /**
     * 增加权限数据
     * @param permission
     * @return
     * @throws CommonException
     */
    @PostMapping("/addPermission")
    public CommonResult addPermission(Permission permission) throws CommonException {
        if(permission == null){
            throw new CommonException(CommonEnumException.PARAMETER_IS_ERROR);
        }
        return CommonResult.createCommonResult(permissionService);
    }

    /**
     * 删除权限数据
     * @param id
     * @return
     */
    @PostMapping("/deletePermissionByPrimaryKey")
    public CommonResult deletePermissionByPrimaryKey(Integer id){
        return CommonResult.createCommonResult(permissionService.deletePermissionByPrimaryKey(id));
    }

    /**
     * 更新权限数据
     * @param permission
     * @return
     * @throws CommonException
     */
    @PostMapping("/updatePermissionByPrimaryKey")
    public CommonResult updatePermissionByPrimaryKey(Permission permission) throws CommonException {
        if(permission == null || permission.getPermissionId() == 0){
            throw new CommonException(CommonEnumException.PARAMETER_IS_ERROR);
        }
        return CommonResult.createCommonResult(permissionService.updatePermissionByPrimaryKey(permission));
    }
}