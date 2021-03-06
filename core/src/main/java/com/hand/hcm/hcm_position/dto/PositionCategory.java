package com.hand.hcm.hcm_position.dto;

/**
 * Auto Generated By Hap Code Generator
 **/

import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import com.hand.hap.system.dto.BaseDTO;
import groovy.transform.ToString;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@ExtensionAttribute(disable = true)
@Table(name = "HCM_POSITION_CATEGORY")
@ToString
public class PositionCategory extends BaseDTO {

    public static final String FIELD_KID = "kid";
    public static final String FIELD_POSITION_ID = "positionId";
    public static final String FIELD_CATEGORY_FIRST_ID = "categoryFirstId";
    public static final String FIELD_CATEGORY_SECOND_ID = "categorySecondId";
    public static final String FIELD_CATEGORY_THIRD_ID = "categoryThirdId";


    @Id
    @GeneratedValue
    private Long kid;

    private Long positionId;

    private Long categoryFirstId;

    private Long categorySecondId;

    private Long categoryThirdId;

    public Long getKid() {
        return kid;
    }

    public void setKid(Long kid) {
        this.kid = kid;
    }

    public Long getPositionId() {
        return positionId;
    }

    public void setPositionId(Long positionId) {
        this.positionId = positionId;
    }

    public Long getCategoryFirstId() {
        return categoryFirstId;
    }

    public void setCategoryFirstId(Long categoryFirstId) {
        this.categoryFirstId = categoryFirstId;
    }

    public Long getCategorySecondId() {
        return categorySecondId;
    }

    public void setCategorySecondId(Long categorySecondId) {
        this.categorySecondId = categorySecondId;
    }

    public Long getCategoryThirdId() {
        return categoryThirdId;
    }

    public void setCategoryThirdId(Long categoryThirdId) {
        this.categoryThirdId = categoryThirdId;
    }
}
