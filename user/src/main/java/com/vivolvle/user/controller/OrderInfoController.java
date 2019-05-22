package com.vivolvle.user.controller;

import com.vivolvle.user.entity.OrderInfo;
import com.vivolvle.user.response.ServerResponce;
import com.vivolvle.user.service.OrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: weilz
 * @Date: 2019/5/22 16:13
 */
@RestController
@RequestMapping("/order")
public class OrderInfoController {
    @Autowired
    private OrderInfoService orderInfoService;
    @GetMapping("/create")
    public ServerResponce create(@RequestParam("name") String name, @RequestParam("number") Integer number) {
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setName(name);
        orderInfo.setNumber(number);
        OrderInfo resultOrderInfo = orderInfoService.insert(orderInfo);
        return ServerResponce.createBySuccess(resultOrderInfo);
    }
    @GetMapping("/finish/{id}")
    public ServerResponce finish(@PathVariable("id") Integer id) {
        int result = orderInfoService.update(id);
        if (1 == result) {
            return ServerResponce.createBySuccessMessage("修改成功");
        }
        return ServerResponce.createByErrorMessage("修改失败");
    }
}
