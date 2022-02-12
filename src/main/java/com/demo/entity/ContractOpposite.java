package com.demo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author 武晓光
 * @since 2022-01-26
 */
@Getter
@Setter
@TableName("LAS_CONTRACT_OPPOSITE")
@ApiModel(value = "ContractOpposite对象")
public class ContractOpposite implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private BigDecimal id;

    @TableField("OPPOSITE_CHARACTER")
    private String oppositeCharacter;

    @TableField("CREDIR_CODE")
    private String credirCode;

    @TableField("FULL_NAME")
    private String fullName;

    @TableField("NAME_ABBREVIATION")
    private String nameAbbreviation;

    @TableField("LEGAL_PERSON_ID")
    private BigDecimal legalPersonId;

    @TableField("LEGAL_PERSON_NAME")
    private String legalPersonName;

    @TableField("LEGAL_PERSON_ACCOUNT")
    private String legalPersonAccount;

    @TableField("LEGAL_PERSON_CARD_ID")
    private String legalPersonCardId;

    @TableField("COUNTRY")
    private String country;

    @TableField("CITY")
    private String city;

    @TableField("ADDRESS")
    private String address;

    @TableField("POSTCODE")
    private String postcode;

    @TableField("PHONE")
    private String phone;

    @TableField("FAX")
    private String fax;

    @TableField("REGISTERED_CAPITAL")
    private BigDecimal registeredCapital;

    @TableField("WEBSITE")
    private String website;

    @TableField("IS_SHARE")
    private Long isShare;

    @TableField("SHARE_SCOPE")
    private String shareScope;

    @TableField("OPPOSITE_CODE")
    private String oppositeCode;

    @TableField("OPPOSITE_STATUS")
    private String oppositeStatus;

    @TableField("OPPOSITE_INTRODUTION")
    private String oppositeIntrodution;

    @TableField("SOURCE")
    private String source;

    @TableField("CERTIFICATE_TYPE")
    private String certificateType;

    @TableField("CERTIFICATE_NUM")
    private String certificateNum;

    @TableField("CREATOR_ID")
    private BigDecimal creatorId;

    @TableField("CREATOR_NAME")
    private String creatorName;

    @TableField("CREATOR_ACCOUNT")
    private String creatorAccount;

    @TableField("MODIFY_EMP_ID")
    private String modifyEmpId;

    @TableField("MODIFY_EMP_ACCOUNT")
    private String modifyEmpAccount;

    @TableField("MODIFY_EMP_NAME")
    private String modifyEmpName;

    @TableField("CREATE_DEPT_ID")
    private String createDeptId;

    @TableField("CREATE_DEPT_CODE")
    private String createDeptCode;

    @TableField("CREATE_DEPT_NAME")
    private String createDeptName;

    @TableField("MODIFY_DEPT_ID")
    private String modifyDeptId;

    @TableField("MODIFY_DEPT_CODE")
    private String modifyDeptCode;

    @TableField("MODIFY_DEPT_NAME")
    private String modifyDeptName;

    @TableField("CREATION_TIME")
    private LocalDateTime creationTime;

    @TableField("LAST_MODIFIED_TIME")
    private LocalDateTime lastModifiedTime;

    @TableField("DELETED")
    @TableLogic
    private Long deleted;

    @TableField("EDIT_DESCRIPTION")
    private String editDescription;

    @TableField("IS_END")
    private Long isEnd;

    @TableField("EX_OPPOSITE_ID")
    private BigDecimal exOppositeId;

    @TableField("IS_CURRENT")
    private Long isCurrent;

    @TableField("OPERATE_CODE")
    private String operateCode;

    @TableField("TIN_CODE")
    private String tinCode;

    @TableField("COMMENTS")
    private String comments;

    @TableField("ABROAD_CODE")
    private String abroadCode;

    @TableField("LEGAL_PERSON_CARD_NAME")
    private String legalPersonCardName;

    @TableField("IS_ADMIN_CREATE")
    private Long isAdminCreate;

    @TableField("COUNTRY_NAME")
    private String countryName;

    @TableField("IS_INTER_UNIT")
    private Long isInterUnit;

    @TableField("IS_RELATE_TRANSACTION")
    private Long isRelateTransaction;

    @TableField("INPUT_PERSON_ID")
    private BigDecimal inputPersonId;

    @TableField("INPUT_PERSON_NAME")
    private String inputPersonName;

    @TableField("INPUT_PERSON_CODE")
    private String inputPersonCode;

    @TableField("BUINESS_LICENSE_ID")
    private String buinessLicenseId;

    @TableField("BUINESS_LICENSE_START_TIME")
    private LocalDateTime buinessLicenseStartTime;

    @TableField("BUINESS_LICENSE_END_TIME")
    private LocalDateTime buinessLicenseEndTime;

    @TableField("INPUT_PERSON_PHONE")
    private String inputPersonPhone;

    @TableField("BAD_RECORD")
    private String badRecord;

    @TableField("FULL_STATUS")
    private String fullStatus;


}
