package anonymous.developer.common;

/***
 * 异常类
 * 作者:阿宇
 * QQ794763733
 */
public class CommonException extends Exception implements ICommonException{
    /**
     * 异常枚举类
     */
    private ICommonException commonException;

    /**
     * 异常类构造方法
     * @param commonException 异常枚举类
     */
    public CommonException(ICommonException commonException) {
        super();
        this.commonException = commonException;
    }

    /**
     * 异常类构造方法
     * @param commonException 异常枚举类
     * @param message 需要修改的异常信息
     */
    public CommonException(ICommonException commonException,String message){
        this.commonException = commonException.setExceptionMessage(message);
    }

    @Override
    public int getExceptionCode() {
        return commonException.getExceptionCode();
    }

    @Override
    public String getExceptionMessage() {
        return commonException.getExceptionMessage();
    }

    @Override
    public ICommonException setExceptionMessage(String message) {
        this.commonException.setExceptionMessage(message);
        return this;
    }
}