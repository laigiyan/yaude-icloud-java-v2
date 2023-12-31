package com.yaude.modules.demo.test.service;

import java.util.List;

import com.yaude.modules.demo.test.entity.JeecgOrderCustomer;

import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @Description: 訂單客戶
 * @Author: jeecg-boot
 * @Date:  2019-02-15
 * @Version: V1.0
 */
public interface IJeecgOrderCustomerService extends IService<JeecgOrderCustomer> {
	
	public List<JeecgOrderCustomer> selectCustomersByMainId(String mainId);
}
