package com.kenny.springcloud.controller;

import com.kenny.springcloud.entities.CommonResult;
import com.kenny.springcloud.entities.Payment;
import com.kenny.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author Kenny
 * @create 2020/5/31 20:14
 * @Classname PaymentController
 * @Description TODO
 */
@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/create")
    public CommonResult<?> create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("插入成功" + result);
        return result > 0 ? new CommonResult<>(200, "插入数据库成功", result) : new CommonResult<>(444, "插入数据库失败", result);
    }

    @GetMapping(value = "/get/{id}")
    public CommonResult<?> create(@PathVariable(name = "id") Long id) {
        Payment result = paymentService.getPaymentById(id);
        log.info("插入成功" + result);
        return result != null ? new CommonResult<>(200, "查询成功", result) : new CommonResult<>(444, "查询失败", null);
    }

}
