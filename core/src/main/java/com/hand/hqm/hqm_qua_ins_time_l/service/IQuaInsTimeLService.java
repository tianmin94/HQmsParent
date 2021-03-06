package com.hand.hqm.hqm_qua_ins_time_l.service;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

import com.hand.hap.core.IRequest;
import com.hand.hap.core.ProxySelf;
import com.hand.hap.core.exception.DatabaseException;
import com.hand.hap.system.service.IBaseService;
import com.hand.hqm.hqm_qua_ins_time_l.dto.QuaInsTimeL;
import com.hand.hqm.hqm_standard_op_ins_l.dto.StandardOpInspectionL;

public interface IQuaInsTimeLService extends IBaseService<QuaInsTimeL>, ProxySelf<IQuaInsTimeLService>{
	/**
     * 保存头行表数据
     * @param dto 查询内容
     * @param request 请求
     * @return 结果集
     */
	 List<QuaInsTimeL> saveHeadLine(IRequest requestContext, List<QuaInsTimeL> dto) throws Exception;
	 /**
	     * 行表数据查询
	     * @param dto 查询内容
	     * @param page 页码
	     * @param pageSize 页大小
	     * @param request 请求
	     * @return 结果集
	     */
	 List<QuaInsTimeL>  myselect(IRequest requestContext,QuaInsTimeL dto,int page, int pageSize); 
	 
	 /**
	     * 行表数据查询
	     * @param dto 查询内容
	     * @param page 页码
	     * @param pageSize 页大小
	     * @param request 请求
	     * @return 结果集
	     */
	 List<QuaInsTimeL>  groupbyselect(QuaInsTimeL dto); 
}