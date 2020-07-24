package dev.com.andre.restapi.domain.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
public class ResponseResult<T> {

    private static final String STATUS_SUCCESS = "SUCCESS";
    private static final String STATUS_ERROR = "ERROR";

    private String code;
    private String status;
    private String description;
    private T data;

    public static <T> ResponseResult<T> fail(String code, String description, T data) {
        return new ResponseResult<>(code, STATUS_ERROR, description, data);
    }

    public static <T> ResponseResult<T> fail(String code, String description) {
        return new ResponseResult<>(code, STATUS_ERROR, description, null);
    }

    public static <T> ResponseResult<T> success(T data) {
        return new ResponseResult<>(HttpStatus.OK.toString(), STATUS_SUCCESS, null, data);
    }

    public static <T> ResponseResult<T> success(String description, T data) {
        return new ResponseResult<>(HttpStatus.OK.toString(), STATUS_SUCCESS, description,
                data);
    }

}
