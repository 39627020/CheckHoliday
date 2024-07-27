package com.jzd1997.checkholiday.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jzd1997.checkholiday.domain.Result;

@ControllerAdvice
public class WebExceptionHandler {
    Logger logger = LoggerFactory.getLogger(WebExceptionHandler.class);
    @ExceptionHandler(CustomException.class)
    @ResponseBody
    public Result customException(CustomException e) {
        Result result = Result.error(e);
        return result;
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result exception(Exception e) {
        Result result = Result.error(new CustomException(CustomExceptionType.OTHER_ERROR));
        return result;
    }

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseBody
    public Result illegalArgumentException(IllegalArgumentException e) {
        Result result = Result.error(new CustomException(CustomExceptionType.USER_INPUT_ERROR));
        return result;
    }
}
