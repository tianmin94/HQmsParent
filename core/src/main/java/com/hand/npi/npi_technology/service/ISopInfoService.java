package com.hand.npi.npi_technology.service;

import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;
import com.hand.npi.npi_technology.dto.SopInfo;

public interface ISopInfoService extends IBaseService<SopInfo>, ProxySelf<ISopInfoService>{
	
	String queryFilePath(SopInfo dto);

}