package util;

/**
 * Created by 투덜이2 on 2017-02-14.
 */
//서버에서 파라미터 받을 때
public class RetrofitRepo {
    public String getMethod() {
        return method;
    }

    public String getResult() {
        return result;
    }

    public String getMessage() {
        return message;
    }

    public String getToken() {
        return token;
    }

    public String getPhone() {
        return phone;
    }

    String method;
    String result;
    String message;
    String token;
    String phone;
    String uuid;

    public String getUuid() {
        return uuid;
    }
}
