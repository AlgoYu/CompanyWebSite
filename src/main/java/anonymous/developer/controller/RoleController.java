package anonymous.developer.controller;

import anonymous.developer.common.CommonResult;
import anonymous.developer.model.Role;
import anonymous.developer.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 角色控制器
 * 作者:阿宇
 * QQ794763733
 */
@RestController
public class RoleController extends BaseController{
    /**
     * 角色服务
     */
    @Autowired
    private RoleService roleService;

    /**
     * 返回所有的角色数据
     * @return
     */
    @GetMapping("/getAllRole")
    public CommonResult getAllRole(){
        return CommonResult.createCommonResult(roleService.getAll());
    }

    /**
     * 返回用户所有的角色
     * @param userId
     * @return
     */
    @PostMapping("/getRoleByUserId")
    public CommonResult getRoleByUserId(@RequestParam("userId") Integer userId){
        return CommonResult.createCommonResult(roleService.getRoleByUserId(userId));
    }

    /**
     * 返回分页角色数据
     * @param currentPage
     * @param pageSize
     * @return
     */
    @PostMapping("/getPageRole")
    public CommonResult getPageRole(@RequestParam("currentPage") Integer currentPage,@RequestParam("pageSize") Integer pageSize){
        return CommonResult.createCommonResult(roleService.getPageRole(currentPage,pageSize));
    }

    /**
     * 返回主键查找到的角色数据
     * @param roleId
     * @return
     */
    @PostMapping("/getRoleById")
    public CommonResult getRoleById(@RequestParam("roleId") Integer roleId){
        return CommonResult.createCommonResult(roleService.findRoleByPrimaryKey(roleId));
    }

    /**
     * 更新角色数据
     * @param role
     * @return
     */
    @PostMapping("/updateRoleById")
    public CommonResult updateRoleById(@RequestBody Role role){
        return CommonResult.createCommonResult(roleService.updateRoleByPrimaryKey(role));
    }

    /**
     * 删除角色数据
     * @param roleId
     * @return
     */
    @PostMapping("/deleteRoleById")
    public CommonResult deleteRoleById(@RequestParam("roleId")Integer roleId){
        return CommonResult.createCommonResult(roleService.deleteRoleByPrimaryKey(roleId));
    }
}