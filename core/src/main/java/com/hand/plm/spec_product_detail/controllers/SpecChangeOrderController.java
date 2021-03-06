package com.hand.plm.spec_product_detail.controllers;

import org.springframework.stereotype.Controller;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.dto.ResponseData;
import com.hand.plm.spec_product_detail.dto.SpecChangeOrder;
import com.hand.plm.spec_product_detail.service.ISpecChangeOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import org.springframework.validation.BindingResult;
import java.util.List;

    @Controller
    public class SpecChangeOrderController extends BaseController{

    @Autowired
    private ISpecChangeOrderService service;


    @RequestMapping(value = "/plm/spec/change/order/query")
    @ResponseBody
    public ResponseData query(SpecChangeOrder dto, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
        @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pageSize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        return new ResponseData(service.queryAll(requestContext,dto,page,pageSize));
    }

    @RequestMapping(value = "/plm/spec/change/order/submit")
    @ResponseBody
    public ResponseData update(@RequestBody List<SpecChangeOrder> dto, BindingResult result, HttpServletRequest request){
        getValidator().validate(dto, result);
        if (result.hasErrors()) {
        ResponseData responseData = new ResponseData(false);
        responseData.setMessage(getErrorMessage(result, request));
        return responseData;
        }
        IRequest requestCtx = createRequestContext(request);
        return new ResponseData(service.batchUpdate(requestCtx, dto));
    }

    @RequestMapping(value = "/plm/spec/change/order/remove")
    @ResponseBody
    public ResponseData delete(HttpServletRequest request,@RequestBody List<SpecChangeOrder> dto){
        service.batchDelete(dto);
        return new ResponseData();
    }
    }