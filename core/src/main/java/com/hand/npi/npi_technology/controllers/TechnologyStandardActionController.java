package com.hand.npi.npi_technology.controllers;

import org.springframework.stereotype.Controller;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.dto.ResponseData;
import com.hand.npi.npi_technology.dto.TechnologySpec;
import com.hand.npi.npi_technology.dto.TechnologyStandardAction;
import com.hand.npi.npi_technology.service.ITechnologyStandardActionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import org.springframework.validation.BindingResult;
import java.util.List;

    @Controller
    public class TechnologyStandardActionController extends BaseController{

    @Autowired
    private ITechnologyStandardActionService service;


    @RequestMapping(value = "/hqm/technology/standard/action/query")
    @ResponseBody
    public ResponseData query(TechnologyStandardAction dto, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
        @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pageSize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        return new ResponseData(service.select(requestContext,dto,page,pageSize));
    }

    @RequestMapping(value = "/hqm/technology/standard/action/submit")
    @ResponseBody
    public ResponseData update(@RequestBody List<TechnologyStandardAction> dto, BindingResult result, HttpServletRequest request){
        getValidator().validate(dto, result);
        if (result.hasErrors()) {
        ResponseData responseData = new ResponseData(false);
        responseData.setMessage(getErrorMessage(result, request));
        return responseData;
        }
        IRequest requestCtx = createRequestContext(request);
        return new ResponseData(service.batchUpdate(requestCtx, dto));
    }

    @RequestMapping(value = "/hqm/technology/standard/action/remove")
    @ResponseBody
    public ResponseData delete(HttpServletRequest request,@RequestBody List<TechnologyStandardAction> dto){
        service.batchDelete(dto);
        return new ResponseData();
    }
    
    @RequestMapping(value = "/hqm/technology/standard/action/add")
    @ResponseBody
    public ResponseData add(@RequestBody List<TechnologyStandardAction> dto, BindingResult result, HttpServletRequest request){
        getValidator().validate(dto, result);
        if (result.hasErrors()) {
        ResponseData responseData = new ResponseData(false);
        responseData.setMessage(getErrorMessage(result, request));
        return responseData;
        }
        IRequest requestCtx = createRequestContext(request);
        for (TechnologyStandardAction technologyStandardAction : dto) {
        	service.addNewTechnologyStandardAction(technologyStandardAction, requestCtx, request);
		}
        return  new ResponseData();
    }
    }