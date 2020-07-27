/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mpalaResearch.Datalayer;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author mutub
 */
@Entity
@Table(name = "PostGL")
@NamedQueries({
    @NamedQuery(name = "PostGL.findAll", query = "SELECT p FROM PostGL p")})
public class PostGL implements Serializable {

    @Lob
    @Column(name = "PostGL_Checksum")
    private byte[] postGLChecksum;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "AutoIdx")
    private Long autoIdx;
    @Column(name = "TxDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date txDate;
    @Basic(optional = false)
    @Column(name = "Id")
    private String id;
    @Column(name = "AccountLink")
    private Integer accountLink;
    @Column(name = "TrCodeID")
    private Integer trCodeID;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Debit")
    private Double debit;
    @Column(name = "Credit")
    private Double credit;
    @Column(name = "iCurrencyID")
    private Integer iCurrencyID;
    @Column(name = "fExchangeRate")
    private Double fExchangeRate;
    @Column(name = "fForeignDebit")
    private Double fForeignDebit;
    @Column(name = "fForeignCredit")
    private Double fForeignCredit;
    @Column(name = "Description")
    private String description;
    @Column(name = "TaxTypeID")
    private Integer taxTypeID;
    @Column(name = "Reference")
    private String reference;
    @Column(name = "Order_No")
    private String orderNo;
    @Column(name = "ExtOrderNum")
    private String extOrderNum;
    @Column(name = "cAuditNumber")
    private String cAuditNumber;
    @Column(name = "Tax_Amount")
    private Double taxAmount;
    @Column(name = "fForeignTax")
    private Double fForeignTax;
    @Column(name = "Project")
    private Integer project;
    @Column(name = "Period")
    private Integer period;
    @Column(name = "DrCrAccount")
    private Integer drCrAccount;
    @Column(name = "JobCodeLink")
    private Integer jobCodeLink;
    @Column(name = "CRCCheck")
    private Double cRCCheck;
    @Column(name = "DTStamp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dTStamp;
    @Column(name = "UserName")
    private String userName;
    @Column(name = "iTaxPeriodID")
    private Integer iTaxPeriodID;
    @Column(name = "cPayeeName")
    private String cPayeeName;
    @Basic(optional = false)
    @Column(name = "bPrintCheque")
    private boolean bPrintCheque;
    @Column(name = "cReference2")
    private String cReference2;
    @Column(name = "RepID")
    private Integer repID;
    @Column(name = "fJCRepCost")
    private Double fJCRepCost;
    @Column(name = "iMFPID")
    private Integer iMFPID;
    @Basic(optional = false)
    @Column(name = "bIsJCDocLine")
    private boolean bIsJCDocLine;
    @Basic(optional = false)
    @Column(name = "bIsSTGLDocLine")
    private boolean bIsSTGLDocLine;
    @Basic(optional = false)
    @Column(name = "iInvLineID")
    private long iInvLineID;
    @Column(name = "iTxBranchID")
    private Integer iTxBranchID;
    @Column(name = "cBankRef")
    private String cBankRef;
    @Basic(optional = false)
    @Column(name = "bPBTPaid")
    private boolean bPBTPaid;
    @Column(name = "iGLTaxAccountID")
    private Integer iGLTaxAccountID;
    @Basic(optional = false)
    @Column(name = "bReconciled")
    private boolean bReconciled;
    @Column(name = "PostGL_iBranchID")
    private Integer postGLiBranchID;
    @Column(name = "PostGL_dCreatedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date postGLdCreatedDate;
    @Column(name = "PostGL_dModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date postGLdModifiedDate;
    @Column(name = "PostGL_iCreatedBranchID")
    private Integer postGLiCreatedBranchID;
    @Column(name = "PostGL_iModifiedBranchID")
    private Integer postGLiModifiedBranchID;
    @Column(name = "PostGL_iCreatedAgentID")
    private Integer postGLiCreatedAgentID;
    @Column(name = "PostGL_iModifiedAgentID")
    private Integer postGLiModifiedAgentID;
    @Column(name = "PostGL_iChangeSetID")
    private Integer postGLiChangeSetID;

    public PostGL() {
    }

    public PostGL(Long autoIdx) {
        this.autoIdx = autoIdx;
    }

    public PostGL(Long autoIdx, String id, boolean bPrintCheque, boolean bIsJCDocLine, boolean bIsSTGLDocLine, long iInvLineID, boolean bPBTPaid, boolean bReconciled) {
        this.autoIdx = autoIdx;
        this.id = id;
        this.bPrintCheque = bPrintCheque;
        this.bIsJCDocLine = bIsJCDocLine;
        this.bIsSTGLDocLine = bIsSTGLDocLine;
        this.iInvLineID = iInvLineID;
        this.bPBTPaid = bPBTPaid;
        this.bReconciled = bReconciled;
    }

    public Long getAutoIdx() {
        return autoIdx;
    }

    public void setAutoIdx(Long autoIdx) {
        this.autoIdx = autoIdx;
    }

    public Date getTxDate() {
        return txDate;
    }

    public void setTxDate(Date txDate) {
        this.txDate = txDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getAccountLink() {
        return accountLink;
    }

    public void setAccountLink(Integer accountLink) {
        this.accountLink = accountLink;
    }

    public Integer getTrCodeID() {
        return trCodeID;
    }

    public void setTrCodeID(Integer trCodeID) {
        this.trCodeID = trCodeID;
    }

    public Double getDebit() {
        return debit;
    }

    public void setDebit(Double debit) {
        this.debit = debit;
    }

    public Double getCredit() {
        return credit;
    }

    public void setCredit(Double credit) {
        this.credit = credit;
    }

    public Integer getICurrencyID() {
        return iCurrencyID;
    }

    public void setICurrencyID(Integer iCurrencyID) {
        this.iCurrencyID = iCurrencyID;
    }

    public Double getFExchangeRate() {
        return fExchangeRate;
    }

    public void setFExchangeRate(Double fExchangeRate) {
        this.fExchangeRate = fExchangeRate;
    }

    public Double getFForeignDebit() {
        return fForeignDebit;
    }

    public void setFForeignDebit(Double fForeignDebit) {
        this.fForeignDebit = fForeignDebit;
    }

    public Double getFForeignCredit() {
        return fForeignCredit;
    }

    public void setFForeignCredit(Double fForeignCredit) {
        this.fForeignCredit = fForeignCredit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getTaxTypeID() {
        return taxTypeID;
    }

    public void setTaxTypeID(Integer taxTypeID) {
        this.taxTypeID = taxTypeID;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getExtOrderNum() {
        return extOrderNum;
    }

    public void setExtOrderNum(String extOrderNum) {
        this.extOrderNum = extOrderNum;
    }

    public String getCAuditNumber() {
        return cAuditNumber;
    }

    public void setCAuditNumber(String cAuditNumber) {
        this.cAuditNumber = cAuditNumber;
    }

    public Double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public Double getFForeignTax() {
        return fForeignTax;
    }

    public void setFForeignTax(Double fForeignTax) {
        this.fForeignTax = fForeignTax;
    }

    public Integer getProject() {
        return project;
    }

    public void setProject(Integer project) {
        this.project = project;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public Integer getDrCrAccount() {
        return drCrAccount;
    }

    public void setDrCrAccount(Integer drCrAccount) {
        this.drCrAccount = drCrAccount;
    }

    public Integer getJobCodeLink() {
        return jobCodeLink;
    }

    public void setJobCodeLink(Integer jobCodeLink) {
        this.jobCodeLink = jobCodeLink;
    }

    public Double getCRCCheck() {
        return cRCCheck;
    }

    public void setCRCCheck(Double cRCCheck) {
        this.cRCCheck = cRCCheck;
    }

    public Date getDTStamp() {
        return dTStamp;
    }

    public void setDTStamp(Date dTStamp) {
        this.dTStamp = dTStamp;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getITaxPeriodID() {
        return iTaxPeriodID;
    }

    public void setITaxPeriodID(Integer iTaxPeriodID) {
        this.iTaxPeriodID = iTaxPeriodID;
    }

    public String getCPayeeName() {
        return cPayeeName;
    }

    public void setCPayeeName(String cPayeeName) {
        this.cPayeeName = cPayeeName;
    }

    public boolean getBPrintCheque() {
        return bPrintCheque;
    }

    public void setBPrintCheque(boolean bPrintCheque) {
        this.bPrintCheque = bPrintCheque;
    }

    public String getCReference2() {
        return cReference2;
    }

    public void setCReference2(String cReference2) {
        this.cReference2 = cReference2;
    }

    public Integer getRepID() {
        return repID;
    }

    public void setRepID(Integer repID) {
        this.repID = repID;
    }

    public Double getFJCRepCost() {
        return fJCRepCost;
    }

    public void setFJCRepCost(Double fJCRepCost) {
        this.fJCRepCost = fJCRepCost;
    }

    public Integer getIMFPID() {
        return iMFPID;
    }

    public void setIMFPID(Integer iMFPID) {
        this.iMFPID = iMFPID;
    }

    public boolean getBIsJCDocLine() {
        return bIsJCDocLine;
    }

    public void setBIsJCDocLine(boolean bIsJCDocLine) {
        this.bIsJCDocLine = bIsJCDocLine;
    }

    public boolean getBIsSTGLDocLine() {
        return bIsSTGLDocLine;
    }

    public void setBIsSTGLDocLine(boolean bIsSTGLDocLine) {
        this.bIsSTGLDocLine = bIsSTGLDocLine;
    }

    public long getIInvLineID() {
        return iInvLineID;
    }

    public void setIInvLineID(long iInvLineID) {
        this.iInvLineID = iInvLineID;
    }

    public Integer getITxBranchID() {
        return iTxBranchID;
    }

    public void setITxBranchID(Integer iTxBranchID) {
        this.iTxBranchID = iTxBranchID;
    }

    public String getCBankRef() {
        return cBankRef;
    }

    public void setCBankRef(String cBankRef) {
        this.cBankRef = cBankRef;
    }

    public boolean getBPBTPaid() {
        return bPBTPaid;
    }

    public void setBPBTPaid(boolean bPBTPaid) {
        this.bPBTPaid = bPBTPaid;
    }

    public Integer getIGLTaxAccountID() {
        return iGLTaxAccountID;
    }

    public void setIGLTaxAccountID(Integer iGLTaxAccountID) {
        this.iGLTaxAccountID = iGLTaxAccountID;
    }

    public boolean getBReconciled() {
        return bReconciled;
    }

    public void setBReconciled(boolean bReconciled) {
        this.bReconciled = bReconciled;
    }

    public Integer getPostGLiBranchID() {
        return postGLiBranchID;
    }

    public void setPostGLiBranchID(Integer postGLiBranchID) {
        this.postGLiBranchID = postGLiBranchID;
    }

    public Date getPostGLdCreatedDate() {
        return postGLdCreatedDate;
    }

    public void setPostGLdCreatedDate(Date postGLdCreatedDate) {
        this.postGLdCreatedDate = postGLdCreatedDate;
    }

    public Date getPostGLdModifiedDate() {
        return postGLdModifiedDate;
    }

    public void setPostGLdModifiedDate(Date postGLdModifiedDate) {
        this.postGLdModifiedDate = postGLdModifiedDate;
    }

    public Integer getPostGLiCreatedBranchID() {
        return postGLiCreatedBranchID;
    }

    public void setPostGLiCreatedBranchID(Integer postGLiCreatedBranchID) {
        this.postGLiCreatedBranchID = postGLiCreatedBranchID;
    }

    public Integer getPostGLiModifiedBranchID() {
        return postGLiModifiedBranchID;
    }

    public void setPostGLiModifiedBranchID(Integer postGLiModifiedBranchID) {
        this.postGLiModifiedBranchID = postGLiModifiedBranchID;
    }

    public Integer getPostGLiCreatedAgentID() {
        return postGLiCreatedAgentID;
    }

    public void setPostGLiCreatedAgentID(Integer postGLiCreatedAgentID) {
        this.postGLiCreatedAgentID = postGLiCreatedAgentID;
    }

    public Integer getPostGLiModifiedAgentID() {
        return postGLiModifiedAgentID;
    }

    public void setPostGLiModifiedAgentID(Integer postGLiModifiedAgentID) {
        this.postGLiModifiedAgentID = postGLiModifiedAgentID;
    }

    public Integer getPostGLiChangeSetID() {
        return postGLiChangeSetID;
    }

    public void setPostGLiChangeSetID(Integer postGLiChangeSetID) {
        this.postGLiChangeSetID = postGLiChangeSetID;
    }

    public byte[] getPostGLChecksum() {
        return postGLChecksum;
    }

    public void setPostGLChecksum(byte[] postGLChecksum) {
        this.postGLChecksum = postGLChecksum;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (autoIdx != null ? autoIdx.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PostGL)) {
            return false;
        }
        PostGL other = (PostGL) object;
        if ((this.autoIdx == null && other.autoIdx != null) || (this.autoIdx != null && !this.autoIdx.equals(other.autoIdx))) {
            return false;
        }
        return true;
    }

  
}
