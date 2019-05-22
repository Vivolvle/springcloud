package com.vivolvle.user.basic;

import com.vivolvle.user.error.BusinessException;
import com.vivolvle.user.response.ServerResponce;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: weilz
 * @Date: 2019/5/22 9:45
 */
@ControllerAdvice(annotations = RestController.class)
@ResponseBody
public class ExceptionHandlerAdvice {

    // 定义exceptionhandler解决未被controller层吸收的exception
    @ExceptionHandler(BusinessException.class)
    public ServerResponce handlerException(BusinessException businessException) {
        return ServerResponce.createByErrorCodeMessage(businessException.getErrorCode(), businessException.getErrorMsg());
    }
}
