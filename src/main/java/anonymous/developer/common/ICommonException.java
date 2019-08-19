package anonymous.developer.common;

/**
 * 异常接口类
 * 作者:阿宇
 * QQ794763733
 */
public interface ICommonException {
    int getExceptionCode();
    String getExceptionMessage();
    ICommonException setExceptionMessage(String message);
}