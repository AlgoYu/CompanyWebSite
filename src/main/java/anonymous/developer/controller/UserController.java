package anonymous.developer.controller;

import anonymous.developer.common.CommonEnumException;
import anonymous.developer.common.CommonException;
import anonymous.developer.common.CommonResult;
import anonymous.developer.model.User;
import anonymous.developer.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 用户控制器
 */
@Controller
public class UserController extends BaseController{
    /**
     * 用户服务
     */
    @Autowired
    private IUserService userService;

    /**
     * 返回所有用户数据
     * @return
     */
    @GetMapping("/getAllUser")
    public CommonResult getAllUser(){
        return CommonResult.createCommonResult(userService.getAll());
    }

    /**
     * 返回分页用户数据
     * @param currentPage
     * @param pageSize
     * @return
     */
    @PostMapping("/getPageUser")
    public CommonResult getPageUser(@RequestParam("currentPage") Integer currentPage,@RequestParam("pageSize") Integer pageSize){
        return CommonResult.createCommonResult(userService.getPageUser(currentPage,pageSize));
    }

    /**
     * 返回角色所有的用户数据
     * @param roleId
     * @return
     */
    @PostMapping("/getUserByRoleId")
    public CommonResult getUserByRoleId(@RequestParam("roleId") Integer roleId){
        return CommonResult.createCommonResult(userService.getUserByRoleId(roleId));
    }

    /**
     * 返回当前主键用户
     * @param userId
     * @return
     */
    @PostMapping("/getUserById")
    public CommonResult getUserById(@RequestParam("userId") Integer userId){
        return CommonResult.createCommonResult(userService.findUserByByPrimaryKey(userId));
    }

    /**
     * 返回当前用户修改是否成功
     * @return
     */
    @PostMapping("/updateUserById")
    public CommonResult updateUserById(User user) throws CommonException {
        if(user==null || user.getUserId() == 0){
            throw new CommonException(CommonEnumException.UNKNOW_EXCEPTION);
        }
        return CommonResult.createCommonResult(userService.updateUser(user));
    }
}