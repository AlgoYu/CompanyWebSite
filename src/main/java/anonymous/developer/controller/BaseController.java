package anonymous.developer.controller;

import anonymous.developer.common.CommonEnumException;
import anonymous.developer.common.CommonException;
import anonymous.developer.common.CommonResult;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

/**
 * 基础控制类
 */
public class BaseController {
    /**
     * 异常处理方法
     * @param request HTTP请求
     * @param exception 程序所抛的异常
     * @return 根据判断是否为CommonException的实例化来返回不同的异常信息
     */
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Object CommonExceptionHandle(HttpServletRequest request,Exception exception){
        HashMap<String,Object> exceptionInformation = new HashMap<>();
        if(exception instanceof CommonException){
            CommonException commonException = (CommonException) exception;
            exceptionInformation.put("exceptionCode",commonException.getExceptionCode());
            exceptionInformation.put("exceptionMessage",commonException.getExceptionMessage());
        }else{
            exceptionInformation.put("exceptionCode", CommonEnumException.UNKNOW_EXCEPTION.getExceptionCode());
            exceptionInformation.put("exceptionMessage",CommonEnumException.UNKNOW_EXCEPTION.getExceptionMessage());
        }
        return CommonResult.createCommonResult(exceptionInformation);
    }
}