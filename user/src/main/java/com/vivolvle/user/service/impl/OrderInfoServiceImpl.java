package com.vivolvle.user.service.impl;

import com.vivolvle.user.entity.OrderInfo;
import com.vivolvle.user.repository.OrderInfoRepository;
import com.vivolvle.user.service.OrderInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: weilz
 * @Date: 2019/5/22 16:12
 */
@Service
@Slf4j
public class OrderInfoServiceImpl implements OrderInfoService {
    @Autowired
    private OrderInfoRepository orderInfoRepository;

    @Override
    public OrderInfo insert(OrderInfo orderInfo) {
        OrderInfo result = orderInfoRepository.save(orderInfo);
        return result;
    }

    @Override
    @Transactional
    public int update(Integer id) {
        try {
            OrderInfo orderInfo = orderInfoRepository.findById(id).get();
            orderInfo.setStatus((byte) 1);
            orderInfoRepository.save(orderInfo);
        } catch (Exception e) {
            log.info("", e);
            return 0;
        }
        return 1;
    }
}
