package anonymous.developer.common;

/**
 * JSON返回类
 * 作者:阿宇
 * QQ794763733
 */
public class CommonResult {
    private int code;
    private String message;
    private Object data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static CommonResult createCommonResult(int code, String message, Object data){
        CommonResult commonResult = new CommonResult();
        commonResult.code = code;
        commonResult.message = message;
        commonResult.data = data;
        return commonResult;
    }

    public static CommonResult createCommonResult(String message, Object data){
        return createCommonResult(200,message,data);
    }

    public static CommonResult createCommonResult(Object data){
        return createCommonResult(200,"请求成功",data);
    }
}