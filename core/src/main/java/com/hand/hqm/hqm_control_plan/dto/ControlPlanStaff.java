package com.hand.hqm.hqm_control_plan.dto;

/**Auto Generated By Hap Code Generator**/
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Length;

import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import com.hand.hap.system.dto.BaseDTO;
@ExtensionAttribute(disable=true)
@Table(name = "HQM_CONTROL_PLAN_STAFF")
public class ControlPlanStaff extends BaseDTO {
     @Id
     @GeneratedValue
     private Long staffId;

     private Long employeeId;

     @Length(max = 30)
     private String employeeName;

     private Long controlPlanId;

	public Long getStaffId() {
		return staffId;
	}

	public void setStaffId(Long staffId) {
		this.staffId = staffId;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Long getControlPlanId() {
		return controlPlanId;
	}

	public void setControlPlanId(Long controlPlanId) {
		this.controlPlanId = controlPlanId;
	}


     }
