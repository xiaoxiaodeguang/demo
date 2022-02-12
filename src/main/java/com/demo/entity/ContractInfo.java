package com.demo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
@TableName("LAS_CONTRACT_INFO")
@ApiModel(value = "ContractInfo对象")
public class ContractInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private BigDecimal id;

    @TableField("CONTRACT_SOURCE")
    private String contractSource;

    @TableField("CONTRACT_NAME")
    private String contractName;

    @TableField("CONTRACT_TYPE")
    private BigDecimal contractType;

    @TableField("CONTRACT_PERIOD")
    private String contractPeriod;

    @TableField("VALUATION_MODE")
    private String valuationMode;

    @TableField("EXCHANGE_RATE")
    private BigDecimal exchangeRate;

    @TableField("CURRENCY_NAME")
    private String currencyName;

    @TableField("START_TIME")
    private LocalDateTime startTime;

    @TableField("END_TIME")
    private LocalDateTime endTime;

    @TableField("CONTRACT_TEXT")
    private String contractText;

    @TableField("CONTRACT_AMOUNT")
    private BigDecimal contractAmount;

    @TableField("CONTRACT_SUBJECT")
    private String contractSubject;

    @TableField("RELATED_PROJECT")
    private BigDecimal relatedProject;

    @TableField("PAYMENT_DIRECTION")
    private String paymentDirection;

    @TableField("IS_IMPORTANT")
    private String isImportant;

    @TableField("IS_TEXT")
    private String isText;

    @TableField("RELATED_TEMPLATE")
    private BigDecimal relatedTemplate;

    @TableField("SIGNING_SUBJECT_ID")
    private BigDecimal signingSubjectId;

    @TableField("SIGNING_SUBJECT_CODE")
    private String signingSubjectCode;

    @TableField("SIGNING_SUBJECT_NAME")
    private String signingSubjectName;

    @TableField("CONTACT_INFORMATION")
    private String contactInformation;

    @TableField("PRIMARY_CONTENT")
    private String primaryContent;

    @TableField("DELEGATION_ID")
    private BigDecimal delegationId;

    @TableField("DELEGATION_TYPE")
    private String delegationType;

    @TableField("CREATOR_ID")
    private String creatorId;

    @TableField("CREATOR_ACCOUNT")
    private String creatorAccount;

    @TableField("CREATOR_NAME")
    private String creatorName;

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

    @TableField("MODIFY_EMP_ID")
    private String modifyEmpId;

    @TableField("MODIFY_EMP_ACCOUNT")
    private String modifyEmpAccount;

    @TableField("MODIFY_EMP_NAME")
    private String modifyEmpName;

    @TableField("DELETED")
    @TableLogic
    private Long deleted;

    @TableField("CREATION_TIME")
    private LocalDateTime creationTime;

    @TableField("LAST_MODIFIED_TIME")
    private LocalDateTime lastModifiedTime;

    @TableField("CONTRACT_CODE")
    private BigDecimal contractCode;

    @TableField("CONTRACT_STATUS")
    private String contractStatus;

    @TableField("CONTRACT_TYPE_NAME")
    private String contractTypeName;

    @TableField("RELATED_TEMPLATE_NAME")
    private String relatedTemplateName;

    @TableField("RELATED_PROJECT_NAME")
    private String relatedProjectName;

    @TableField("RMB_AMOUNT")
    private String rmbAmount;

    @TableField("RMB_AMOUNT_CAPITAL")
    private String rmbAmountCapital;

    @TableField("CONTRACT_AMOUNT_FORSHOW")
    private String contractAmountForshow;

    @TableField("RMB_AMOUNT_FORSHOW")
    private String rmbAmountForshow;

    @TableField("CONTRACT_SELF_CODE")
    private String contractSelfCode;

    @TableField("ITEM_NAME")
    private String itemName;

    @TableField("BODY_SUMMARY")
    private String bodySummary;

    @TableField("AMOUNT_EXPLAIN")
    private String amountExplain;

    @TableField("ACC_NATURE_NAME")
    private String accNatureName;

    @TableField("STAMP_CATEGORY_NAME")
    private String stampCategoryName;

    @TableField("IS_RELATED_PARTY")
    private Long isRelatedParty;

    @TableField("IS_RELATED_DEAL")
    private Long isRelatedDeal;

    @TableField("IS_BATCH_APPROVE")
    private Long isBatchApprove;

    @TableField("WORKFLOW_CODE")
    private String workflowCode;

    @TableField("CONTRACT_NATURE")
    private String contractNature;

    @TableField("CONTRACT_GIST")
    private String contractGist;

    @TableField("ARCHIVE_STATUS")
    private String archiveStatus;

    @TableField("UPDATE_STATUS")
    private String updateStatus;

    @TableField("ORIGINAL_CONTRACT_ID")
    private BigDecimal originalContractId;

    @TableField("OLD_STATUS")
    private String oldStatus;

    @TableField("IS_PERFORMS")
    private String isPerforms;

    @TableField("EXECUTOR_NAME")
    private String executorName;

    @TableField("CREATE_UNIT_ID")
    private BigDecimal createUnitId;

    @TableField("EXECUTOR_UNIT_ID")
    private BigDecimal executorUnitId;

    @TableField("EXECUTOR_DEPT_ID")
    private BigDecimal executorDeptId;

    @TableField("EXECUTOR_ID")
    private BigDecimal executorId;

    @TableField("APPROVE_TIME")
    private LocalDateTime approveTime;

    @TableField("HAS_WARRANTY_PERIOD")
    private String hasWarrantyPeriod;

    @TableField("HAS_SCHEDULE")
    private String hasSchedule;

    @TableField("HAS_GOODS")
    private String hasGoods;

    @TableField("ORI_CT_TEXT")
    private String oriCtText;

    @ApiModelProperty("是否招标")
    @TableField("IS_TENDER")
    private Long isTender;

    @ApiModelProperty("招标编号")
    @TableField("TENDER_NO")
    private String tenderNo;

    @ApiModelProperty("范本类型 ")
    @TableField("TEMPLATE_TYPE")
    private String templateType;

    @ApiModelProperty("附件类型 ")
    @TableField("ATTACHMENT_TYPE")
    private String attachmentType;

    @ApiModelProperty("合同类别")
    @TableField("CONTRACT_CATEGORY")
    private String contractCategory;

    @ApiModelProperty("是否境外 ")
    @TableField("IS_OVERSEAS")
    private Long isOverseas;

    @ApiModelProperty("是否需要法务审核 ")
    @TableField("IS_NEEDLEGAL_REVIEW")
    private Long isNeedlegalReview;

    @ApiModelProperty("代扣代缴税金")
    @TableField("PAY_TAX")
    private BigDecimal payTax;

    @ApiModelProperty("是否重大合同显示")
    @TableField("IS_IMPORTANT_SHOW")
    private Long isImportantShow;

    @ApiModelProperty("合同类型父ID")
    @TableField("CONTRACT_PARENT_TYPE")
    private BigDecimal contractParentType;

    @ApiModelProperty("是否内部单位")
    @TableField("IS_INTERNAL_UNIT")
    private Long isInternalUnit;

    @ApiModelProperty("合同扫描件")
    @TableField("CONTRACT_SCAN_FILE")
    private String contractScanFile;

    @ApiModelProperty("执行人公司编码")
    @TableField("EXECUTOR_UNIT_CODE")
    private String executorUnitCode;

    @ApiModelProperty("执行人部门编码")
    @TableField("EXECUTOR_DEPT_CODE")
    private String executorDeptCode;

    @ApiModelProperty("执行人编码")
    @TableField("EXECUTOR_CODE")
    private String executorCode;

    @ApiModelProperty("经办单位编码")
    @TableField("HANDLE_UNIT_CODE")
    private String handleUnitCode;

    @ApiModelProperty("经办单位名称")
    @TableField("HANDLE_UNIT_NAME")
    private String handleUnitName;

    @ApiModelProperty("经办部门编码 ")
    @TableField("HANDLE_DEPT_CODE")
    private String handleDeptCode;

    @ApiModelProperty("经办部门名称")
    @TableField("HANDLE_DEPT_NAME")
    private String handleDeptName;

    @ApiModelProperty("导入原因")
    @TableField("IMPORT_REASON")
    private String importReason;

    @TableField("IS_SIGN")
    private String isSign;

    @TableField("IS_HANDOVER")
    private String isHandover;

    @TableField("OUTER_SOURCE")
    private String outerSource;

    @ApiModelProperty("风险确认提示语")
    @TableField("RISK_CONFIRM")
    private String riskConfirm;

    @TableField("ISIMPORT")
    private String isimport;

    @TableField("ATTACHMENT")
    private String attachment;

    @TableField("PERIOD_EXPLAIN")
    private String periodExplain;

    @ApiModelProperty("律师服务类型")
    @TableField("LAWYER_SERVICE_TYPE")
    private String lawyerServiceType;


}
