package anonymous.developer.common;

/**
 * 异常枚举类
 */
public enum CommonEnumException implements ICommonException{
    /**
     * 通用异常枚举
     */
    UNKNOW_EXCEPTION(99999,"未知错误"),
    /**
     * 用10000开始都是用户错误
     */
    USER_IS_NOT_EXIST(10001,"用户不存在"),
    /**
     * 用20000开始的都是参数错误
     */
    PARAMETER_IS_ERROR(20001,"参数错误")
    ;
    private int exceptionCode;
    private String exceptionMessage;

    /**
     * 异常枚举类的构造方法
     * @param exceptionCode 异常代码
     * @param exceptionMessage 异常信息
     */
    CommonEnumException(int exceptionCode, String exceptionMessage) {
        this.exceptionCode = exceptionCode;
        this.exceptionMessage = exceptionMessage;
    }

    /***
     * 得到当前对象的异常代码
     * @return 异常代码
     */
    @Override
    public int getExceptionCode() {
        return exceptionCode;
    }

    /**
     * 得到当前对象的异常信息
     * @return 异常信息
     */
    @Override
    public String getExceptionMessage() {
        return exceptionMessage;
    }

    /**
     * 设置当前对象的异常信息
     * @param message 需要修改的异常信息
     * @return 当前对象
     */
    @Override
    public ICommonException setExceptionMessage(String message) {
        this.exceptionMessage = message;
        return this;
    }
}