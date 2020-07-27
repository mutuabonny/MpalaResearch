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
@Table(name = "Accounts")
public class Accounts implements Serializable {

    @Lob
    @Column(name = "Accounts_Checksum")
    private byte[] accountsChecksum;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "AccountLink")
    private Integer accountLink;
    @Column(name = "Master_Sub_Account")
    private String masterSubAccount;
    @Column(name = "AccountLevel")
    private Integer accountLevel;
    @Column(name = "Account")
    private String account;
    @Basic(optional = false)
    @Column(name = "iAccountType")
    private int iAccountType;
    @Column(name = "SubAccOfLink")
    private Integer subAccOfLink;
    @Column(name = "Dept")
    private String dept;
    @Column(name = "Brch")
    private String brch;
    @Basic(optional = false)
    @Column(name = "Jr")
    private boolean jr;
    @Column(name = "Description")
    private String description;
    @Column(name = "CaseAcc")
    private String caseAcc;
    @Basic(optional = false)
    @Column(name = "ActiveAccount")
    private boolean activeAccount;
    @Column(name = "dAccountsTimeStamp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dAccountsTimeStamp;
    @Column(name = "cNextChequeNum")
    private String cNextChequeNum;
    @Column(name = "iGLSegment0ID")
    private Integer iGLSegment0ID;
    @Column(name = "iGLSegment1ID")
    private Integer iGLSegment1ID;
    @Column(name = "iGLSegment2ID")
    private Integer iGLSegment2ID;
    @Column(name = "iGLSegment3ID")
    private Integer iGLSegment3ID;
    @Column(name = "iGLSegment4ID")
    private Integer iGLSegment4ID;
    @Column(name = "iGLSegment5ID")
    private Integer iGLSegment5ID;
    @Column(name = "iGLSegment6ID")
    private Integer iGLSegment6ID;
    @Column(name = "iGLSegment7ID")
    private Integer iGLSegment7ID;
    @Column(name = "iGLSegment8ID")
    private Integer iGLSegment8ID;
    @Column(name = "iGLSegment9ID")
    private Integer iGLSegment9ID;
    @Column(name = "iReportCategoryID")
    private Integer iReportCategoryID;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "fBankStatementBalance")
    private Double fBankStatementBalance;
    @Column(name = "cExtDescription")
    private String cExtDescription;
    @Column(name = "iTaxTypeINVID")
    private Integer iTaxTypeINVID;
    @Column(name = "iTaxTypeCRNID")
    private Integer iTaxTypeCRNID;
    @Column(name = "iTaxTypeGRVID")
    private Integer iTaxTypeGRVID;
    @Column(name = "iTaxTypeRTSID")
    private Integer iTaxTypeRTSID;
    @Basic(optional = false)
    @Column(name = "iAllowICSales")
    private boolean iAllowICSales;
    @Basic(optional = false)
    @Column(name = "iAllowICPurchases")
    private boolean iAllowICPurchases;
    @Column(name = "iMBReportingCategoryID")
    private Integer iMBReportingCategoryID;
    @Column(name = "iMBCashFlowCategoryID")
    private Integer iMBCashFlowCategoryID;
    @Basic(optional = false)
    @Column(name = "bMBIsAsset")
    private boolean bMBIsAsset;
    @Basic(optional = false)
    @Column(name = "bMBIsGrant")
    private boolean bMBIsGrant;
    @Column(name = "iMBAssetClassificationID")
    private Integer iMBAssetClassificationID;
    @Column(name = "iMBAssetCategoryID")
    private Integer iMBAssetCategoryID;
    @Column(name = "iMBAssetTypeID")
    private Integer iMBAssetTypeID;
    @Column(name = "iMBGrantLevel1TypeID")
    private Integer iMBGrantLevel1TypeID;
    @Column(name = "iMBGrantLevel2TypeID")
    private Integer iMBGrantLevel2TypeID;
    @Column(name = "iMBGrantLevel3TypeID")
    private Integer iMBGrantLevel3TypeID;
    @Basic(optional = false)
    @Column(name = "bIsBranchLoanAccount")
    private boolean bIsBranchLoanAccount;
    @Basic(optional = false)
    @Column(name = "bForeignBankAcc")
    private boolean bForeignBankAcc;
    @Column(name = "iForeignBankCurrencyID")
    private Integer iForeignBankCurrencyID;
    @Column(name = "iForeignBankPEXAccID")
    private Integer iForeignBankPEXAccID;
    @Column(name = "iForeignBankLEXAccID")
    private Integer iForeignBankLEXAccID;
    @Basic(optional = false)
    @Column(name = "bRevalueWithSellingRate")
    private boolean bRevalueWithSellingRate;
    @Basic(optional = false)
    @Column(name = "bPaymentsBasedTax")
    private boolean bPaymentsBasedTax;
    @Column(name = "cBankName")
    private String cBankName;
    @Column(name = "cBankAccountName")
    private String cBankAccountName;
    @Column(name = "cBankCode")
    private String cBankCode;
    @Column(name = "cBankAccountNumber")
    private String cBankAccountNumber;
    @Column(name = "cBranchName")
    private String cBranchName;
    @Column(name = "cSEPABranchCode")
    private String cSEPABranchCode;
    @Column(name = "cBankRefNr")
    private String cBankRefNr;
    @Column(name = "Accounts_iBranchID")
    private Integer accountsiBranchID;
    @Column(name = "Accounts_dCreatedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date accountsdCreatedDate;
    @Column(name = "Accounts_dModifiedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date accountsdModifiedDate;
    @Column(name = "Accounts_iCreatedBranchID")
    private Integer accountsiCreatedBranchID;
    @Column(name = "Accounts_iModifiedBranchID")
    private Integer accountsiModifiedBranchID;
    @Column(name = "Accounts_iCreatedAgentID")
    private Integer accountsiCreatedAgentID;
    @Column(name = "Accounts_iModifiedAgentID")
    private Integer accountsiModifiedAgentID;
    @Column(name = "Accounts_iChangeSetID")
    private Integer accountsiChangeSetID;
    @Column(name = "ulGLSector1")
    private String ulGLSector1;
    @Column(name = "ulGLSector2")
    private String ulGLSector2;
    @Column(name = "ulGLSector3")
    private String ulGLSector3;
    @Column(name = "ulGLSector4")
    private String ulGLSector4;
    @Column(name = "ulGLSector5")
    private String ulGLSector5;
    @Column(name = "ulGLSector6")
    private String ulGLSector6;
    @Column(name = "ulGLSector7")
    private String ulGLSector7;
    @Column(name = "ulGLSector8")
    private String ulGLSector8;
    @Column(name = "ulGLSector9")
    private String ulGLSector9;
    @Column(name = "ulGLSector10")
    private String ulGLSector10;
    @Column(name = "ulGLCostCentre")
    private String ulGLCostCentre;

    public Accounts() {
    }

    public Accounts(Integer accountLink) {
        this.accountLink = accountLink;
    }

    public Accounts(Integer accountLink, int iAccountType, boolean jr, boolean activeAccount, boolean iAllowICSales, boolean iAllowICPurchases, boolean bMBIsAsset, boolean bMBIsGrant, boolean bIsBranchLoanAccount, boolean bForeignBankAcc, boolean bRevalueWithSellingRate, boolean bPaymentsBasedTax) {
        this.accountLink = accountLink;
        this.iAccountType = iAccountType;
        this.jr = jr;
        this.activeAccount = activeAccount;
        this.iAllowICSales = iAllowICSales;
        this.iAllowICPurchases = iAllowICPurchases;
        this.bMBIsAsset = bMBIsAsset;
        this.bMBIsGrant = bMBIsGrant;
        this.bIsBranchLoanAccount = bIsBranchLoanAccount;
        this.bForeignBankAcc = bForeignBankAcc;
        this.bRevalueWithSellingRate = bRevalueWithSellingRate;
        this.bPaymentsBasedTax = bPaymentsBasedTax;
    }

    public Integer getAccountLink() {
        return accountLink;
    }

    public void setAccountLink(Integer accountLink) {
        this.accountLink = accountLink;
    }

    public String getMasterSubAccount() {
        return masterSubAccount;
    }

    public void setMasterSubAccount(String masterSubAccount) {
        this.masterSubAccount = masterSubAccount;
    }

    public Integer getAccountLevel() {
        return accountLevel;
    }

    public void setAccountLevel(Integer accountLevel) {
        this.accountLevel = accountLevel;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getIAccountType() {
        return iAccountType;
    }

    public void setIAccountType(int iAccountType) {
        this.iAccountType = iAccountType;
    }

    public Integer getSubAccOfLink() {
        return subAccOfLink;
    }

    public void setSubAccOfLink(Integer subAccOfLink) {
        this.subAccOfLink = subAccOfLink;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getBrch() {
        return brch;
    }

    public void setBrch(String brch) {
        this.brch = brch;
    }

    public boolean getJr() {
        return jr;
    }

    public void setJr(boolean jr) {
        this.jr = jr;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCaseAcc() {
        return caseAcc;
    }

    public void setCaseAcc(String caseAcc) {
        this.caseAcc = caseAcc;
    }

    public boolean getActiveAccount() {
        return activeAccount;
    }

    public void setActiveAccount(boolean activeAccount) {
        this.activeAccount = activeAccount;
    }

    public Date getDAccountsTimeStamp() {
        return dAccountsTimeStamp;
    }

    public void setDAccountsTimeStamp(Date dAccountsTimeStamp) {
        this.dAccountsTimeStamp = dAccountsTimeStamp;
    }

    public String getCNextChequeNum() {
        return cNextChequeNum;
    }

    public void setCNextChequeNum(String cNextChequeNum) {
        this.cNextChequeNum = cNextChequeNum;
    }

    public Integer getIGLSegment0ID() {
        return iGLSegment0ID;
    }

    public void setIGLSegment0ID(Integer iGLSegment0ID) {
        this.iGLSegment0ID = iGLSegment0ID;
    }

    public Integer getIGLSegment1ID() {
        return iGLSegment1ID;
    }

    public void setIGLSegment1ID(Integer iGLSegment1ID) {
        this.iGLSegment1ID = iGLSegment1ID;
    }

    public Integer getIGLSegment2ID() {
        return iGLSegment2ID;
    }

    public void setIGLSegment2ID(Integer iGLSegment2ID) {
        this.iGLSegment2ID = iGLSegment2ID;
    }

    public Integer getIGLSegment3ID() {
        return iGLSegment3ID;
    }

    public void setIGLSegment3ID(Integer iGLSegment3ID) {
        this.iGLSegment3ID = iGLSegment3ID;
    }

    public Integer getIGLSegment4ID() {
        return iGLSegment4ID;
    }

    public void setIGLSegment4ID(Integer iGLSegment4ID) {
        this.iGLSegment4ID = iGLSegment4ID;
    }

    public Integer getIGLSegment5ID() {
        return iGLSegment5ID;
    }

    public void setIGLSegment5ID(Integer iGLSegment5ID) {
        this.iGLSegment5ID = iGLSegment5ID;
    }

    public Integer getIGLSegment6ID() {
        return iGLSegment6ID;
    }

    public void setIGLSegment6ID(Integer iGLSegment6ID) {
        this.iGLSegment6ID = iGLSegment6ID;
    }

    public Integer getIGLSegment7ID() {
        return iGLSegment7ID;
    }

    public void setIGLSegment7ID(Integer iGLSegment7ID) {
        this.iGLSegment7ID = iGLSegment7ID;
    }

    public Integer getIGLSegment8ID() {
        return iGLSegment8ID;
    }

    public void setIGLSegment8ID(Integer iGLSegment8ID) {
        this.iGLSegment8ID = iGLSegment8ID;
    }

    public Integer getIGLSegment9ID() {
        return iGLSegment9ID;
    }

    public void setIGLSegment9ID(Integer iGLSegment9ID) {
        this.iGLSegment9ID = iGLSegment9ID;
    }

    public Integer getIReportCategoryID() {
        return iReportCategoryID;
    }

    public void setIReportCategoryID(Integer iReportCategoryID) {
        this.iReportCategoryID = iReportCategoryID;
    }

    public Double getFBankStatementBalance() {
        return fBankStatementBalance;
    }

    public void setFBankStatementBalance(Double fBankStatementBalance) {
        this.fBankStatementBalance = fBankStatementBalance;
    }

    public String getCExtDescription() {
        return cExtDescription;
    }

    public void setCExtDescription(String cExtDescription) {
        this.cExtDescription = cExtDescription;
    }

    public Integer getITaxTypeINVID() {
        return iTaxTypeINVID;
    }

    public void setITaxTypeINVID(Integer iTaxTypeINVID) {
        this.iTaxTypeINVID = iTaxTypeINVID;
    }

    public Integer getITaxTypeCRNID() {
        return iTaxTypeCRNID;
    }

    public void setITaxTypeCRNID(Integer iTaxTypeCRNID) {
        this.iTaxTypeCRNID = iTaxTypeCRNID;
    }

    public Integer getITaxTypeGRVID() {
        return iTaxTypeGRVID;
    }

    public void setITaxTypeGRVID(Integer iTaxTypeGRVID) {
        this.iTaxTypeGRVID = iTaxTypeGRVID;
    }

    public Integer getITaxTypeRTSID() {
        return iTaxTypeRTSID;
    }

    public void setITaxTypeRTSID(Integer iTaxTypeRTSID) {
        this.iTaxTypeRTSID = iTaxTypeRTSID;
    }

    public boolean getIAllowICSales() {
        return iAllowICSales;
    }

    public void setIAllowICSales(boolean iAllowICSales) {
        this.iAllowICSales = iAllowICSales;
    }

    public boolean getIAllowICPurchases() {
        return iAllowICPurchases;
    }

    public void setIAllowICPurchases(boolean iAllowICPurchases) {
        this.iAllowICPurchases = iAllowICPurchases;
    }

    public Integer getIMBReportingCategoryID() {
        return iMBReportingCategoryID;
    }

    public void setIMBReportingCategoryID(Integer iMBReportingCategoryID) {
        this.iMBReportingCategoryID = iMBReportingCategoryID;
    }

    public Integer getIMBCashFlowCategoryID() {
        return iMBCashFlowCategoryID;
    }

    public void setIMBCashFlowCategoryID(Integer iMBCashFlowCategoryID) {
        this.iMBCashFlowCategoryID = iMBCashFlowCategoryID;
    }

    public boolean getBMBIsAsset() {
        return bMBIsAsset;
    }

    public void setBMBIsAsset(boolean bMBIsAsset) {
        this.bMBIsAsset = bMBIsAsset;
    }

    public boolean getBMBIsGrant() {
        return bMBIsGrant;
    }

    public void setBMBIsGrant(boolean bMBIsGrant) {
        this.bMBIsGrant = bMBIsGrant;
    }

    public Integer getIMBAssetClassificationID() {
        return iMBAssetClassificationID;
    }

    public void setIMBAssetClassificationID(Integer iMBAssetClassificationID) {
        this.iMBAssetClassificationID = iMBAssetClassificationID;
    }

    public Integer getIMBAssetCategoryID() {
        return iMBAssetCategoryID;
    }

    public void setIMBAssetCategoryID(Integer iMBAssetCategoryID) {
        this.iMBAssetCategoryID = iMBAssetCategoryID;
    }

    public Integer getIMBAssetTypeID() {
        return iMBAssetTypeID;
    }

    public void setIMBAssetTypeID(Integer iMBAssetTypeID) {
        this.iMBAssetTypeID = iMBAssetTypeID;
    }

    public Integer getIMBGrantLevel1TypeID() {
        return iMBGrantLevel1TypeID;
    }

    public void setIMBGrantLevel1TypeID(Integer iMBGrantLevel1TypeID) {
        this.iMBGrantLevel1TypeID = iMBGrantLevel1TypeID;
    }

    public Integer getIMBGrantLevel2TypeID() {
        return iMBGrantLevel2TypeID;
    }

    public void setIMBGrantLevel2TypeID(Integer iMBGrantLevel2TypeID) {
        this.iMBGrantLevel2TypeID = iMBGrantLevel2TypeID;
    }

    public Integer getIMBGrantLevel3TypeID() {
        return iMBGrantLevel3TypeID;
    }

    public void setIMBGrantLevel3TypeID(Integer iMBGrantLevel3TypeID) {
        this.iMBGrantLevel3TypeID = iMBGrantLevel3TypeID;
    }

    public boolean getBIsBranchLoanAccount() {
        return bIsBranchLoanAccount;
    }

    public void setBIsBranchLoanAccount(boolean bIsBranchLoanAccount) {
        this.bIsBranchLoanAccount = bIsBranchLoanAccount;
    }

    public boolean getBForeignBankAcc() {
        return bForeignBankAcc;
    }

    public void setBForeignBankAcc(boolean bForeignBankAcc) {
        this.bForeignBankAcc = bForeignBankAcc;
    }

    public Integer getIForeignBankCurrencyID() {
        return iForeignBankCurrencyID;
    }

    public void setIForeignBankCurrencyID(Integer iForeignBankCurrencyID) {
        this.iForeignBankCurrencyID = iForeignBankCurrencyID;
    }

    public Integer getIForeignBankPEXAccID() {
        return iForeignBankPEXAccID;
    }

    public void setIForeignBankPEXAccID(Integer iForeignBankPEXAccID) {
        this.iForeignBankPEXAccID = iForeignBankPEXAccID;
    }

    public Integer getIForeignBankLEXAccID() {
        return iForeignBankLEXAccID;
    }

    public void setIForeignBankLEXAccID(Integer iForeignBankLEXAccID) {
        this.iForeignBankLEXAccID = iForeignBankLEXAccID;
    }

    public boolean getBRevalueWithSellingRate() {
        return bRevalueWithSellingRate;
    }

    public void setBRevalueWithSellingRate(boolean bRevalueWithSellingRate) {
        this.bRevalueWithSellingRate = bRevalueWithSellingRate;
    }

    public boolean getBPaymentsBasedTax() {
        return bPaymentsBasedTax;
    }

    public void setBPaymentsBasedTax(boolean bPaymentsBasedTax) {
        this.bPaymentsBasedTax = bPaymentsBasedTax;
    }

    public String getCBankName() {
        return cBankName;
    }

    public void setCBankName(String cBankName) {
        this.cBankName = cBankName;
    }

    public String getCBankAccountName() {
        return cBankAccountName;
    }

    public void setCBankAccountName(String cBankAccountName) {
        this.cBankAccountName = cBankAccountName;
    }

    public String getCBankCode() {
        return cBankCode;
    }

    public void setCBankCode(String cBankCode) {
        this.cBankCode = cBankCode;
    }

    public String getCBankAccountNumber() {
        return cBankAccountNumber;
    }

    public void setCBankAccountNumber(String cBankAccountNumber) {
        this.cBankAccountNumber = cBankAccountNumber;
    }

    public String getCBranchName() {
        return cBranchName;
    }

    public void setCBranchName(String cBranchName) {
        this.cBranchName = cBranchName;
    }

    public String getCSEPABranchCode() {
        return cSEPABranchCode;
    }

    public void setCSEPABranchCode(String cSEPABranchCode) {
        this.cSEPABranchCode = cSEPABranchCode;
    }

    public String getCBankRefNr() {
        return cBankRefNr;
    }

    public void setCBankRefNr(String cBankRefNr) {
        this.cBankRefNr = cBankRefNr;
    }

    public Integer getAccountsiBranchID() {
        return accountsiBranchID;
    }

    public void setAccountsiBranchID(Integer accountsiBranchID) {
        this.accountsiBranchID = accountsiBranchID;
    }

    public Date getAccountsdCreatedDate() {
        return accountsdCreatedDate;
    }

    public void setAccountsdCreatedDate(Date accountsdCreatedDate) {
        this.accountsdCreatedDate = accountsdCreatedDate;
    }

    public Date getAccountsdModifiedDate() {
        return accountsdModifiedDate;
    }

    public void setAccountsdModifiedDate(Date accountsdModifiedDate) {
        this.accountsdModifiedDate = accountsdModifiedDate;
    }

    public Integer getAccountsiCreatedBranchID() {
        return accountsiCreatedBranchID;
    }

    public void setAccountsiCreatedBranchID(Integer accountsiCreatedBranchID) {
        this.accountsiCreatedBranchID = accountsiCreatedBranchID;
    }

    public Integer getAccountsiModifiedBranchID() {
        return accountsiModifiedBranchID;
    }

    public void setAccountsiModifiedBranchID(Integer accountsiModifiedBranchID) {
        this.accountsiModifiedBranchID = accountsiModifiedBranchID;
    }

    public Integer getAccountsiCreatedAgentID() {
        return accountsiCreatedAgentID;
    }

    public void setAccountsiCreatedAgentID(Integer accountsiCreatedAgentID) {
        this.accountsiCreatedAgentID = accountsiCreatedAgentID;
    }

    public Integer getAccountsiModifiedAgentID() {
        return accountsiModifiedAgentID;
    }

    public void setAccountsiModifiedAgentID(Integer accountsiModifiedAgentID) {
        this.accountsiModifiedAgentID = accountsiModifiedAgentID;
    }

    public Integer getAccountsiChangeSetID() {
        return accountsiChangeSetID;
    }

    public void setAccountsiChangeSetID(Integer accountsiChangeSetID) {
        this.accountsiChangeSetID = accountsiChangeSetID;
    }

    public byte[] getAccountsChecksum() {
        return accountsChecksum;
    }

    public void setAccountsChecksum(byte[] accountsChecksum) {
        this.accountsChecksum = accountsChecksum;
    }

    public String getUlGLSector1() {
        return ulGLSector1;
    }

    public void setUlGLSector1(String ulGLSector1) {
        this.ulGLSector1 = ulGLSector1;
    }

    public String getUlGLSector2() {
        return ulGLSector2;
    }

    public void setUlGLSector2(String ulGLSector2) {
        this.ulGLSector2 = ulGLSector2;
    }

    public String getUlGLSector3() {
        return ulGLSector3;
    }

    public void setUlGLSector3(String ulGLSector3) {
        this.ulGLSector3 = ulGLSector3;
    }

    public String getUlGLSector4() {
        return ulGLSector4;
    }

    public void setUlGLSector4(String ulGLSector4) {
        this.ulGLSector4 = ulGLSector4;
    }

    public String getUlGLSector5() {
        return ulGLSector5;
    }

    public void setUlGLSector5(String ulGLSector5) {
        this.ulGLSector5 = ulGLSector5;
    }

    public String getUlGLSector6() {
        return ulGLSector6;
    }

    public void setUlGLSector6(String ulGLSector6) {
        this.ulGLSector6 = ulGLSector6;
    }

    public String getUlGLSector7() {
        return ulGLSector7;
    }

    public void setUlGLSector7(String ulGLSector7) {
        this.ulGLSector7 = ulGLSector7;
    }

    public String getUlGLSector8() {
        return ulGLSector8;
    }

    public void setUlGLSector8(String ulGLSector8) {
        this.ulGLSector8 = ulGLSector8;
    }

    public String getUlGLSector9() {
        return ulGLSector9;
    }

    public void setUlGLSector9(String ulGLSector9) {
        this.ulGLSector9 = ulGLSector9;
    }

    public String getUlGLSector10() {
        return ulGLSector10;
    }

    public void setUlGLSector10(String ulGLSector10) {
        this.ulGLSector10 = ulGLSector10;
    }

    public String getUlGLCostCentre() {
        return ulGLCostCentre;
    }

    public void setUlGLCostCentre(String ulGLCostCentre) {
        this.ulGLCostCentre = ulGLCostCentre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accountLink != null ? accountLink.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Accounts)) {
            return false;
        }
        Accounts other = (Accounts) object;
        if ((this.accountLink == null && other.accountLink != null) || (this.accountLink != null && !this.accountLink.equals(other.accountLink))) {
            return false;
        }
        return true;
    }

}
