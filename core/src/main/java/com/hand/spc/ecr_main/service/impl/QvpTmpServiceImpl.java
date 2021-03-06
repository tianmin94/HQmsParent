package com.hand.spc.ecr_main.service.impl;

import com.hand.hap.system.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.hand.spc.ecr_main.dto.QvpTmp;
import com.hand.spc.ecr_main.service.IQvpTmpService;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class QvpTmpServiceImpl extends BaseServiceImpl<QvpTmp> implements IQvpTmpService{

}