package com.vivolvle.user.service;

import com.vivolvle.user.entity.OrderInfo;

/**
 * @Author: weilz
 * @Date: 2019/5/22 16:12
 */
public interface OrderInfoService {
    OrderInfo insert(OrderInfo orderInfo);
    int update(Integer id);
}
