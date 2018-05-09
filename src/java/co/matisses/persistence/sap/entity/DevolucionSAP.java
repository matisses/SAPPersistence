package co.matisses.persistence.sap.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author ygil
 */
@Entity
@Table(name = "ORIN")
public class DevolucionSAP implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DocEntry")
    private Integer docEntry;
    @Column(name = "DocNum")
    private Integer docNum;
    @Column(name = "DocType")
    private Character docType;
    @Column(name = "CANCELED")
    private Character canceled;
    @Column(name = "Handwrtten")
    private Character handwrtten;
    @Column(name = "Printed")
    private Character printed;
    @Column(name = "DocStatus")
    private Character docStatus;
    @Column(name = "InvntSttus")
    private Character invntSttus;
    @Column(name = "Transfered")
    private Character transfered;
    @Column(name = "ObjType")
    private String objType;
    @Column(name = "DocDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date docDate;
    @Column(name = "DocDueDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date docDueDate;
    @Column(name = "CardCode")
    private String cardCode;
    @Column(name = "CardName")
    private String cardName;
    @Column(name = "Address")
    private String address;
    @Column(name = "NumAtCard")
    private String numAtCard;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VatPercent")
    private BigDecimal vatPercent;
    @Column(name = "VatSum")
    private BigDecimal vatSum;
    @Column(name = "VatSumFC")
    private BigDecimal vatSumFC;
    @Column(name = "DiscPrcnt")
    private BigDecimal discPrcnt;
    @Column(name = "DiscSum")
    private BigDecimal discSum;
    @Column(name = "DiscSumFC")
    private BigDecimal discSumFC;
    @Column(name = "DocCur")
    private String docCur;
    @Column(name = "DocRate")
    private BigDecimal docRate;
    @Column(name = "DocTotal")
    private BigDecimal docTotal;
    @Column(name = "DocTotalFC")
    private BigDecimal docTotalFC;
    @Column(name = "PaidToDate")
    private BigDecimal paidToDate;
    @Column(name = "PaidFC")
    private BigDecimal paidFC;
    @Column(name = "GrosProfit")
    private BigDecimal grosProfit;
    @Column(name = "GrosProfFC")
    private BigDecimal grosProfFC;
    @Column(name = "Ref1")
    private String ref1;
    @Column(name = "Ref2")
    private String ref2;
    @Column(name = "Comments")
    private String comments;
    @Column(name = "JrnlMemo")
    private String jrnlMemo;
    @Column(name = "TransId")
    private Integer transId;
    @Column(name = "ReceiptNum")
    private Integer receiptNum;
    @Column(name = "GroupNum")
    private Short groupNum;
    @Column(name = "DocTime")
    private Short docTime;
    @Column(name = "SlpCode")
    private Integer slpCode;
    @Column(name = "TrnspCode")
    private Short trnspCode;
    @Column(name = "PartSupply")
    private Character partSupply;
    @Column(name = "Confirmed")
    private Character confirmed;
    @Column(name = "GrossBase")
    private Short grossBase;
    @Column(name = "ImportEnt")
    private Integer importEnt;
    @Column(name = "CreateTran")
    private Character createTran;
    @Column(name = "SummryType")
    private Character summryType;
    @Column(name = "UpdInvnt")
    private Character updInvnt;
    @Column(name = "UpdCardBal")
    private Character updCardBal;
    @Column(name = "Instance")
    private Short instance;
    @Column(name = "Flags")
    private Integer flags;
    @Column(name = "InvntDirec")
    private Character invntDirec;
    @Column(name = "CntctCode")
    private Integer cntctCode;
    @Column(name = "ShowSCN")
    private Character showSCN;
    @Column(name = "FatherCard")
    private String fatherCard;
    @Column(name = "SysRate")
    private BigDecimal sysRate;
    @Column(name = "CurSource")
    private Character curSource;
    @Column(name = "VatSumSy")
    private BigDecimal vatSumSy;
    @Column(name = "DiscSumSy")
    private BigDecimal discSumSy;
    @Column(name = "DocTotalSy")
    private BigDecimal docTotalSy;
    @Column(name = "PaidSys")
    private BigDecimal paidSys;
    @Column(name = "FatherType")
    private Character fatherType;
    @Column(name = "GrosProfSy")
    private BigDecimal grosProfSy;
    @Column(name = "UpdateDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDate;
    @Column(name = "IsICT")
    private Character isICT;
    @Column(name = "CreateDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Column(name = "Volume")
    private BigDecimal volume;
    @Column(name = "VolUnit")
    private Short volUnit;
    @Column(name = "Weight")
    private BigDecimal weight;
    @Column(name = "WeightUnit")
    private Short weightUnit;
    @Column(name = "Series")
    private Short series;
    @Column(name = "TaxDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date taxDate;
    @Column(name = "Filler")
    private String filler;
    @Column(name = "DataSource")
    private Character dataSource;
    @Column(name = "StampNum")
    private String stampNum;
    @Column(name = "isCrin")
    private Character isCrin;
    @Column(name = "FinncPriod")
    private Integer finncPriod;
    @Column(name = "UserSign")
    private Short userSign;
    @Column(name = "selfInv")
    private Character selfInv;
    @Column(name = "VatPaid")
    private BigDecimal vatPaid;
    @Column(name = "VatPaidFC")
    private BigDecimal vatPaidFC;
    @Column(name = "VatPaidSys")
    private BigDecimal vatPaidSys;
    @Column(name = "UserSign2")
    private Short userSign2;
    @Column(name = "WddStatus")
    private Character wddStatus;
    @Column(name = "draftKey")
    private Integer draftKey;
    @Column(name = "TotalExpns")
    private BigDecimal totalExpns;
    @Column(name = "TotalExpFC")
    private BigDecimal totalExpFC;
    @Column(name = "TotalExpSC")
    private BigDecimal totalExpSC;
    @Column(name = "DunnLevel")
    private Integer dunnLevel;
    @Column(name = "Address2")
    private String address2;
    @Column(name = "LogInstanc")
    private Integer logInstanc;
    @Column(name = "Exported")
    private Character exported;
    @Column(name = "StationID")
    private Integer stationID;
    @Column(name = "Indicator")
    private String indicator;
    @Column(name = "NetProc")
    private Character netProc;
    @Column(name = "AqcsTax")
    private BigDecimal aqcsTax;
    @Column(name = "AqcsTaxFC")
    private BigDecimal aqcsTaxFC;
    @Column(name = "AqcsTaxSC")
    private BigDecimal aqcsTaxSC;
    @Column(name = "CashDiscPr")
    private BigDecimal cashDiscPr;
    @Column(name = "CashDiscnt")
    private BigDecimal cashDiscnt;
    @Column(name = "CashDiscFC")
    private BigDecimal cashDiscFC;
    @Column(name = "CashDiscSC")
    private BigDecimal cashDiscSC;
    @Column(name = "ShipToCode")
    private String shipToCode;
    @Column(name = "LicTradNum")
    private String licTradNum;
    @Column(name = "PaymentRef")
    private String paymentRef;
    @Column(name = "WTSum")
    private BigDecimal wTSum;
    @Column(name = "WTSumFC")
    private BigDecimal wTSumFC;
    @Column(name = "WTSumSC")
    private BigDecimal wTSumSC;
    @Column(name = "RoundDif")
    private BigDecimal roundDif;
    @Column(name = "RoundDifFC")
    private BigDecimal roundDifFC;
    @Column(name = "RoundDifSy")
    private BigDecimal roundDifSy;
    @Column(name = "CheckDigit")
    private Character checkDigit;
    @Column(name = "Form1099")
    private Integer form1099;
    @Column(name = "Box1099")
    private String box1099;
    @Column(name = "submitted")
    private Character submitted;
    @Column(name = "PoPrss")
    private Character poPrss;
    @Column(name = "Rounding")
    private Character rounding;
    @Column(name = "RevisionPo")
    private Character revisionPo;
    @Column(name = "Segment")
    private Short segment;
    @Column(name = "ReqDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date reqDate;
    @Column(name = "CancelDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cancelDate;
    @Column(name = "PickStatus")
    private Character pickStatus;
    @Column(name = "Pick")
    private Character pick;
    @Column(name = "BlockDunn")
    private Character blockDunn;
    @Column(name = "PeyMethod")
    private String peyMethod;
    @Column(name = "PayBlock")
    private Character payBlock;
    @Column(name = "PayBlckRef")
    private Integer payBlckRef;
    @Column(name = "MaxDscn")
    private Character maxDscn;
    @Column(name = "Reserve")
    private Character reserve;
    @Column(name = "Max1099")
    private BigDecimal max1099;
    @Column(name = "CntrlBnk")
    private String cntrlBnk;
    @Column(name = "PickRmrk")
    private String pickRmrk;
    @Column(name = "ISRCodLine")
    private String iSRCodLine;
    @Column(name = "ExpAppl")
    private BigDecimal expAppl;
    @Column(name = "ExpApplFC")
    private BigDecimal expApplFC;
    @Column(name = "ExpApplSC")
    private BigDecimal expApplSC;
    @Column(name = "Project")
    private String project;
    @Column(name = "DeferrTax")
    private Character deferrTax;
    @Column(name = "LetterNum")
    private String letterNum;
    @Column(name = "FromDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;
    @Column(name = "ToDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date toDate;
    @Column(name = "WTApplied")
    private BigDecimal wTApplied;
    @Column(name = "WTAppliedF")
    private BigDecimal wTAppliedF;
    @Column(name = "BoeReserev")
    private Character boeReserev;
    @Column(name = "AgentCode")
    private String agentCode;
    @Column(name = "WTAppliedS")
    private BigDecimal wTAppliedS;
    @Column(name = "EquVatSum")
    private BigDecimal equVatSum;
    @Column(name = "EquVatSumF")
    private BigDecimal equVatSumF;
    @Column(name = "EquVatSumS")
    private BigDecimal equVatSumS;
    @Column(name = "Installmnt")
    private Short installmnt;
    @Column(name = "VATFirst")
    private Character vATFirst;
    @Column(name = "NnSbAmnt")
    private BigDecimal nnSbAmnt;
    @Column(name = "NnSbAmntSC")
    private BigDecimal nnSbAmntSC;
    @Column(name = "NbSbAmntFC")
    private BigDecimal nbSbAmntFC;
    @Column(name = "ExepAmnt")
    private BigDecimal exepAmnt;
    @Column(name = "ExepAmntSC")
    private BigDecimal exepAmntSC;
    @Column(name = "ExepAmntFC")
    private BigDecimal exepAmntFC;
    @Column(name = "VatDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date vatDate;
    @Column(name = "CorrExt")
    private String corrExt;
    @Column(name = "CorrInv")
    private Integer corrInv;
    @Column(name = "NCorrInv")
    private Integer nCorrInv;
    @Column(name = "CEECFlag")
    private Character cEECFlag;
    @Column(name = "BaseAmnt")
    private BigDecimal baseAmnt;
    @Column(name = "BaseAmntSC")
    private BigDecimal baseAmntSC;
    @Column(name = "BaseAmntFC")
    private BigDecimal baseAmntFC;
    @Column(name = "CtlAccount")
    private String ctlAccount;
    @Column(name = "BPLId")
    private Integer bPLId;
    @Column(name = "BPLName")
    private String bPLName;
    @Column(name = "VATRegNum")
    private String vATRegNum;
    @Column(name = "TxInvRptNo")
    private String txInvRptNo;
    @Column(name = "TxInvRptDt")
    @Temporal(TemporalType.TIMESTAMP)
    private Date txInvRptDt;
    @Column(name = "KVVATCode")
    private String kVVATCode;
    @Column(name = "WTDetails")
    private String wTDetails;
    @Column(name = "SumAbsId")
    private Integer sumAbsId;
    @Column(name = "SumRptDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sumRptDate;
    @Column(name = "PIndicator")
    private String pIndicator;
    @Column(name = "ManualNum")
    private String manualNum;
    @Column(name = "UseShpdGd")
    private Character useShpdGd;
    @Column(name = "BaseVtAt")
    private BigDecimal baseVtAt;
    @Column(name = "BaseVtAtSC")
    private BigDecimal baseVtAtSC;
    @Column(name = "BaseVtAtFC")
    private BigDecimal baseVtAtFC;
    @Column(name = "NnSbVAt")
    private BigDecimal nnSbVAt;
    @Column(name = "NnSbVAtSC")
    private BigDecimal nnSbVAtSC;
    @Column(name = "NbSbVAtFC")
    private BigDecimal nbSbVAtFC;
    @Column(name = "ExptVAt")
    private BigDecimal exptVAt;
    @Column(name = "ExptVAtSC")
    private BigDecimal exptVAtSC;
    @Column(name = "ExptVAtFC")
    private BigDecimal exptVAtFC;
    @Column(name = "LYPmtAt")
    private BigDecimal lYPmtAt;
    @Column(name = "LYPmtAtSC")
    private BigDecimal lYPmtAtSC;
    @Column(name = "LYPmtAtFC")
    private BigDecimal lYPmtAtFC;
    @Column(name = "ExpAnSum")
    private BigDecimal expAnSum;
    @Column(name = "ExpAnSys")
    private BigDecimal expAnSys;
    @Column(name = "ExpAnFrgn")
    private BigDecimal expAnFrgn;
    @Column(name = "DocSubType")
    private String docSubType;
    @Column(name = "DpmStatus")
    private Character dpmStatus;
    @Column(name = "DpmAmnt")
    private BigDecimal dpmAmnt;
    @Column(name = "DpmAmntSC")
    private BigDecimal dpmAmntSC;
    @Column(name = "DpmAmntFC")
    private BigDecimal dpmAmntFC;
    @Column(name = "DpmDrawn")
    private Character dpmDrawn;
    @Column(name = "DpmPrcnt")
    private BigDecimal dpmPrcnt;
    @Column(name = "PaidSum")
    private BigDecimal paidSum;
    @Column(name = "PaidSumFc")
    private BigDecimal paidSumFc;
    @Column(name = "PaidSumSc")
    private BigDecimal paidSumSc;
    @Column(name = "FolioPref")
    private String folioPref;
    @Column(name = "FolioNum")
    private Integer folioNum;
    @Column(name = "DpmAppl")
    private BigDecimal dpmAppl;
    @Column(name = "DpmApplFc")
    private BigDecimal dpmApplFc;
    @Column(name = "DpmApplSc")
    private BigDecimal dpmApplSc;
    @Column(name = "LPgFolioN")
    private Integer lPgFolioN;
    @Column(name = "Header")
    private String header;
    @Column(name = "Footer")
    private String footer;
    @Column(name = "Posted")
    private Character posted;
    @Column(name = "OwnerCode")
    private Integer ownerCode;
    @Column(name = "BPChCode")
    private String bPChCode;
    @Column(name = "BPChCntc")
    private Integer bPChCntc;
    @Column(name = "PayToCode")
    private String payToCode;
    @Column(name = "IsPaytoBnk")
    private Character isPaytoBnk;
    @Column(name = "BnkCntry")
    private String bnkCntry;
    @Column(name = "BankCode")
    private String bankCode;
    @Column(name = "BnkAccount")
    private String bnkAccount;
    @Column(name = "BnkBranch")
    private String bnkBranch;
    @Column(name = "isIns")
    private Character isIns;
    @Column(name = "TrackNo")
    private String trackNo;
    @Column(name = "VersionNum")
    private String versionNum;
    @Column(name = "LangCode")
    private Integer langCode;
    @Column(name = "BPNameOW")
    private Character bPNameOW;
    @Column(name = "BillToOW")
    private Character billToOW;
    @Column(name = "ShipToOW")
    private Character shipToOW;
    @Column(name = "RetInvoice")
    private Character retInvoice;
    @Column(name = "ClsDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date clsDate;
    @Column(name = "MInvNum")
    private Integer mInvNum;
    @Column(name = "MInvDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mInvDate;
    @Column(name = "SeqCode")
    private Short seqCode;
    @Column(name = "Serial")
    private Integer serial;
    @Column(name = "SeriesStr")
    private String seriesStr;
    @Column(name = "SubStr")
    private String subStr;
    @Column(name = "Model")
    private String model;
    @Column(name = "TaxOnExp")
    private BigDecimal taxOnExp;
    @Column(name = "TaxOnExpFc")
    private BigDecimal taxOnExpFc;
    @Column(name = "TaxOnExpSc")
    private BigDecimal taxOnExpSc;
    @Column(name = "TaxOnExAp")
    private BigDecimal taxOnExAp;
    @Column(name = "TaxOnExApF")
    private BigDecimal taxOnExApF;
    @Column(name = "TaxOnExApS")
    private BigDecimal taxOnExApS;
    @Column(name = "LastPmnTyp")
    private Character lastPmnTyp;
    @Column(name = "LndCstNum")
    private Integer lndCstNum;
    @Column(name = "UseCorrVat")
    private Character useCorrVat;
    @Column(name = "BlkCredMmo")
    private Character blkCredMmo;
    @Column(name = "OpenForLaC")
    private Character openForLaC;
    @Column(name = "Excised")
    private Character excised;
    @Column(name = "ExcRefDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date excRefDate;
    @Column(name = "ExcRmvTime")
    private String excRmvTime;
    @Column(name = "SrvGpPrcnt")
    private BigDecimal srvGpPrcnt;
    @Column(name = "DepositNum")
    private Integer depositNum;
    @Column(name = "CertNum")
    private String certNum;
    @Column(name = "DutyStatus")
    private Character dutyStatus;
    @Column(name = "AutoCrtFlw")
    private Character autoCrtFlw;
    @Column(name = "FlwRefDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date flwRefDate;
    @Column(name = "FlwRefNum")
    private String flwRefNum;
    @Column(name = "VatJENum")
    private Integer vatJENum;
    @Column(name = "DpmVat")
    private BigDecimal dpmVat;
    @Column(name = "DpmVatFc")
    private BigDecimal dpmVatFc;
    @Column(name = "DpmVatSc")
    private BigDecimal dpmVatSc;
    @Column(name = "DpmAppVat")
    private BigDecimal dpmAppVat;
    @Column(name = "DpmAppVatF")
    private BigDecimal dpmAppVatF;
    @Column(name = "DpmAppVatS")
    private BigDecimal dpmAppVatS;
    @Column(name = "InsurOp347")
    private Character insurOp347;
    @Column(name = "IgnRelDoc")
    private Character ignRelDoc;
    @Column(name = "BuildDesc")
    private String buildDesc;
    @Column(name = "ResidenNum")
    private Character residenNum;
    @Column(name = "Checker")
    private Integer checker;
    @Column(name = "Payee")
    private Integer payee;
    @Column(name = "CopyNumber")
    private Integer copyNumber;
    @Column(name = "SSIExmpt")
    private Character sSIExmpt;
    @Column(name = "PQTGrpSer")
    private Short pQTGrpSer;
    @Column(name = "PQTGrpNum")
    private Integer pQTGrpNum;
    @Column(name = "PQTGrpHW")
    private Character pQTGrpHW;
    @Column(name = "ReopOriDoc")
    private Character reopOriDoc;
    @Column(name = "ReopManCls")
    private Character reopManCls;
    @Column(name = "DocManClsd")
    private Character docManClsd;
    @Column(name = "ClosingOpt")
    private Short closingOpt;
    @Column(name = "SpecDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date specDate;
    @Column(name = "Ordered")
    private Character ordered;
    @Column(name = "NTSApprov")
    private Character nTSApprov;
    @Column(name = "NTSWebSite")
    private Short nTSWebSite;
    @Column(name = "NTSeTaxNo")
    private String nTSeTaxNo;
    @Column(name = "NTSApprNo")
    private String nTSApprNo;
    @Column(name = "PayDuMonth")
    private Character payDuMonth;
    @Column(name = "ExtraMonth")
    private Short extraMonth;
    @Column(name = "ExtraDays")
    private Short extraDays;
    @Column(name = "CdcOffset")
    private Short cdcOffset;
    @Column(name = "SignMsg")
    private String signMsg;
    @Column(name = "SignDigest")
    private String signDigest;
    @Column(name = "CertifNum")
    private String certifNum;
    @Column(name = "KeyVersion")
    private Integer keyVersion;
    @Column(name = "EDocGenTyp")
    private Character eDocGenTyp;
    @Column(name = "ESeries")
    private Short eSeries;
    @Column(name = "EDocNum")
    private String eDocNum;
    @Column(name = "EDocExpFrm")
    private Integer eDocExpFrm;
    @Column(name = "OnlineQuo")
    private Character onlineQuo;
    @Column(name = "POSEqNum")
    private String pOSEqNum;
    @Column(name = "POSManufSN")
    private String pOSManufSN;
    @Column(name = "POSCashN")
    private Integer pOSCashN;
    @Column(name = "EDocStatus")
    private Character eDocStatus;
    @Column(name = "EDocCntnt")
    private String eDocCntnt;
    @Column(name = "EDocProces")
    private Character eDocProces;
    @Column(name = "EDocErrCod")
    private String eDocErrCod;
    @Column(name = "EDocErrMsg")
    private String eDocErrMsg;
    @Column(name = "EDocCancel")
    private Character eDocCancel;
    @Column(name = "EDocTest")
    private Character eDocTest;
    @Column(name = "EDocPrefix")
    private String eDocPrefix;
    @Column(name = "CUP")
    private Integer cup;
    @Column(name = "CIG")
    private Integer cig;
    @Column(name = "DpmAsDscnt")
    private Character dpmAsDscnt;
    @Column(name = "Attachment")
    private String attachment;
    @Column(name = "AtcEntry")
    private Integer atcEntry;
    @Column(name = "SupplCode")
    private String supplCode;
    @Column(name = "GTSRlvnt")
    private Character gTSRlvnt;
    @Column(name = "BaseDisc")
    private BigDecimal baseDisc;
    @Column(name = "BaseDiscSc")
    private BigDecimal baseDiscSc;
    @Column(name = "BaseDiscFc")
    private BigDecimal baseDiscFc;
    @Column(name = "BaseDiscPr")
    private BigDecimal baseDiscPr;
    @Column(name = "CreateTS")
    private Integer createTS;
    @Column(name = "UpdateTS")
    private Integer updateTS;
    @Column(name = "SrvTaxRule")
    private Character srvTaxRule;
    @Column(name = "AnnInvDecR")
    private Integer annInvDecR;
    @Column(name = "Supplier")
    private String supplier;
    @Column(name = "Releaser")
    private Integer releaser;
    @Column(name = "Receiver")
    private Integer receiver;
    @Column(name = "ToWhsCode")
    private String toWhsCode;
    @Column(name = "AssetDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date assetDate;
    @Column(name = "Requester")
    private String requester;
    @Column(name = "ReqName")
    private String reqName;
    @Column(name = "Branch")
    private Short branch;
    @Column(name = "Department")
    private Short department;
    @Column(name = "Email")
    private String email;
    @Column(name = "Notify")
    private Character notify;
    @Column(name = "ReqType")
    private Integer reqType;
    @Column(name = "OriginType")
    private Character originType;
    @Column(name = "IsReuseNum")
    private Character isReuseNum;
    @Column(name = "IsReuseNFN")
    private Character isReuseNFN;
    @Column(name = "DocDlvry")
    private Character docDlvry;
    @Column(name = "PaidDpm")
    private BigDecimal paidDpm;
    @Column(name = "PaidDpmF")
    private BigDecimal paidDpmF;
    @Column(name = "PaidDpmS")
    private BigDecimal paidDpmS;
    @Column(name = "EnvTypeNFe")
    private Integer envTypeNFe;
    @Column(name = "AgrNo")
    private Integer agrNo;
    @Column(name = "IsAlt")
    private Character isAlt;
    @Column(name = "AltBaseTyp")
    private Integer altBaseTyp;
    @Column(name = "AltBaseEnt")
    private Integer altBaseEnt;
    @Column(name = "AuthCode")
    private String authCode;
    @Column(name = "StDlvDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date stDlvDate;
    @Column(name = "StDlvTime")
    private Integer stDlvTime;
    @Column(name = "EndDlvDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDlvDate;
    @Column(name = "EndDlvTime")
    private Integer endDlvTime;
    @Column(name = "VclPlate")
    private String vclPlate;
    @Column(name = "ElCoStatus")
    private String elCoStatus;
    @Column(name = "AtDocType")
    private String atDocType;
    @Column(name = "ElCoMsg")
    private String elCoMsg;
    @Column(name = "PrintSEPA")
    private Character printSEPA;
    @Column(name = "FreeChrg")
    private BigDecimal freeChrg;
    @Column(name = "FreeChrgFC")
    private BigDecimal freeChrgFC;
    @Column(name = "FreeChrgSC")
    private BigDecimal freeChrgSC;
    @Column(name = "NfeValue")
    private BigDecimal nfeValue;
    @Column(name = "FiscDocNum")
    private String fiscDocNum;
    @Column(name = "RelatedTyp")
    private Integer relatedTyp;
    @Column(name = "RelatedEnt")
    private Integer relatedEnt;
    @Column(name = "CCDEntry")
    private Integer cCDEntry;
    @Column(name = "NfePrntFo")
    private Integer nfePrntFo;
    @Column(name = "ZrdAbs")
    private Integer zrdAbs;
    @Column(name = "POSRcptNo")
    private Integer pOSRcptNo;
    @Column(name = "FoCTax")
    private BigDecimal foCTax;
    @Column(name = "FoCTaxFC")
    private BigDecimal foCTaxFC;
    @Column(name = "FoCTaxSC")
    private BigDecimal foCTaxSC;
    @Column(name = "TpCusPres")
    private Integer tpCusPres;
    @Column(name = "ExcDocDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date excDocDate;
    @Column(name = "U_Autorret")
    private Character uAutorret;
    @Column(name = "U_BPCOST")
    private String uBpcost;
    @Column(name = "U_WUID")
    private String uWuid;
    @Column(name = "U_TipoNota")
    private Character uTipoNota;
    @Column(name = "U_Retefue")
    private Character uRetefue;
    @Column(name = "U_ReteIca")
    private Character uReteIca;
    @Column(name = "U_OK1_IVAPA")
    private Character uOk1Ivapa;
    @Column(name = "U_OK1_IFRS")
    private Character uOk1Ifrs;
    @Column(name = "U_Diseno")
    private String uDiseno;
    @Column(name = "U_diseno2")
    private String udiseno2;
    @Column(name = "U_comdeco1")
    private Integer ucomdeco1;
    @Column(name = "U_comdeco2")
    private Integer ucomdeco2;
    @Column(name = "U_Vendedor1")
    private String uVendedor1;
    @Column(name = "U_Vendedor2")
    private String uVendedor2;
    @Column(name = "U_Vendedor3")
    private String uVendedor3;
    @Column(name = "U_Vendedor4")
    private String uVendedor4;
    @Column(name = "U_Vendedor5")
    private String uVendedor5;
    @Column(name = "U_Factor")
    private Integer uFactor;
    @Column(name = "U_NWR_PicS")
    private String uNWRPicS;
    @Column(name = "U_NWR_BRet")
    private String uNWRBRet;
    @Column(name = "U_nwr_PAut")
    private Short unwrPAut;
    @Column(name = "U_nwr_Note")
    private String unwrNote;
    @Column(name = "U_nwr_Tag")
    private String unwrTag;
    @Column(name = "U_nwr_Frgt")
    private BigDecimal unwrFrgt;
    @Column(name = "U_NWR_NORM")
    private String uNwrNorm;
    @Column(name = "U_TypeExped")
    private String uTypeExped;
    @Column(name = "U_CreaNC")
    private String uCreaNC;
    @Column(name = "U_NumFact")
    private String uNumFact;
    @Column(name = "U_Aprobado")
    private String uAprobado;
    @Column(name = "U_ComVend1")
    private String uComVend1;
    @Column(name = "U_ComVend2")
    private String uComVend2;
    @Column(name = "U_ComVend3")
    private String uComVend3;
    @Column(name = "U_ComVend4")
    private String uComVend4;
    @Column(name = "U_ComVend5")
    private String uComVend5;
    @Column(name = "U_Act_Costo")
    private Character uActCosto;
    @Column(name = "U_DocEntryLeg")
    private Integer uDocEntryLeg;
    @Column(name = "U_idLineLeg")
    private String uidLineLeg;
    @Column(name = "U_serieLeg")
    private Integer userieLeg;
    @Column(name = "U_EsIndep")
    private Character uEsIndep;
    @Column(name = "U_firma")
    private String ufirma;
    @Column(name = "U_cedula")
    private String ucedula;
    @Column(name = "U_CatRet")
    private String uCatRet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "detalleDevolucionSAPPK.docEntry", fetch = FetchType.EAGER)
    private List<DetalleDevolucionSAP> detalle;

    public DevolucionSAP() {
    }

    public DevolucionSAP(Integer docEntry) {
        this.docEntry = docEntry;
    }

    public Integer getDocEntry() {
        return docEntry;
    }

    public void setDocEntry(Integer docEntry) {
        this.docEntry = docEntry;
    }

    public Integer getDocNum() {
        return docNum;
    }

    public void setDocNum(Integer docNum) {
        this.docNum = docNum;
    }

    public Character getDocType() {
        return docType;
    }

    public void setDocType(Character docType) {
        this.docType = docType;
    }

    public Character getCanceled() {
        return canceled;
    }

    public void setCanceled(Character canceled) {
        this.canceled = canceled;
    }

    public Character getHandwrtten() {
        return handwrtten;
    }

    public void setHandwrtten(Character handwrtten) {
        this.handwrtten = handwrtten;
    }

    public Character getPrinted() {
        return printed;
    }

    public void setPrinted(Character printed) {
        this.printed = printed;
    }

    public Character getDocStatus() {
        return docStatus;
    }

    public void setDocStatus(Character docStatus) {
        this.docStatus = docStatus;
    }

    public Character getInvntSttus() {
        return invntSttus;
    }

    public void setInvntSttus(Character invntSttus) {
        this.invntSttus = invntSttus;
    }

    public Character getTransfered() {
        return transfered;
    }

    public void setTransfered(Character transfered) {
        this.transfered = transfered;
    }

    public String getObjType() {
        return objType;
    }

    public void setObjType(String objType) {
        this.objType = objType;
    }

    public Date getDocDate() {
        return docDate;
    }

    public void setDocDate(Date docDate) {
        this.docDate = docDate;
    }

    public Date getDocDueDate() {
        return docDueDate;
    }

    public void setDocDueDate(Date docDueDate) {
        this.docDueDate = docDueDate;
    }

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumAtCard() {
        return numAtCard;
    }

    public void setNumAtCard(String numAtCard) {
        this.numAtCard = numAtCard;
    }

    public BigDecimal getVatPercent() {
        return vatPercent;
    }

    public void setVatPercent(BigDecimal vatPercent) {
        this.vatPercent = vatPercent;
    }

    public BigDecimal getVatSum() {
        return vatSum;
    }

    public void setVatSum(BigDecimal vatSum) {
        this.vatSum = vatSum;
    }

    public BigDecimal getVatSumFC() {
        return vatSumFC;
    }

    public void setVatSumFC(BigDecimal vatSumFC) {
        this.vatSumFC = vatSumFC;
    }

    public BigDecimal getDiscPrcnt() {
        return discPrcnt;
    }

    public void setDiscPrcnt(BigDecimal discPrcnt) {
        this.discPrcnt = discPrcnt;
    }

    public BigDecimal getDiscSum() {
        return discSum;
    }

    public void setDiscSum(BigDecimal discSum) {
        this.discSum = discSum;
    }

    public BigDecimal getDiscSumFC() {
        return discSumFC;
    }

    public void setDiscSumFC(BigDecimal discSumFC) {
        this.discSumFC = discSumFC;
    }

    public String getDocCur() {
        return docCur;
    }

    public void setDocCur(String docCur) {
        this.docCur = docCur;
    }

    public BigDecimal getDocRate() {
        return docRate;
    }

    public void setDocRate(BigDecimal docRate) {
        this.docRate = docRate;
    }

    public BigDecimal getDocTotal() {
        return docTotal;
    }

    public void setDocTotal(BigDecimal docTotal) {
        this.docTotal = docTotal;
    }

    public BigDecimal getDocTotalFC() {
        return docTotalFC;
    }

    public void setDocTotalFC(BigDecimal docTotalFC) {
        this.docTotalFC = docTotalFC;
    }

    public BigDecimal getPaidToDate() {
        return paidToDate;
    }

    public void setPaidToDate(BigDecimal paidToDate) {
        this.paidToDate = paidToDate;
    }

    public BigDecimal getPaidFC() {
        return paidFC;
    }

    public void setPaidFC(BigDecimal paidFC) {
        this.paidFC = paidFC;
    }

    public BigDecimal getGrosProfit() {
        return grosProfit;
    }

    public void setGrosProfit(BigDecimal grosProfit) {
        this.grosProfit = grosProfit;
    }

    public BigDecimal getGrosProfFC() {
        return grosProfFC;
    }

    public void setGrosProfFC(BigDecimal grosProfFC) {
        this.grosProfFC = grosProfFC;
    }

    public String getRef1() {
        return ref1;
    }

    public void setRef1(String ref1) {
        this.ref1 = ref1;
    }

    public String getRef2() {
        return ref2;
    }

    public void setRef2(String ref2) {
        this.ref2 = ref2;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getJrnlMemo() {
        return jrnlMemo;
    }

    public void setJrnlMemo(String jrnlMemo) {
        this.jrnlMemo = jrnlMemo;
    }

    public Integer getTransId() {
        return transId;
    }

    public void setTransId(Integer transId) {
        this.transId = transId;
    }

    public Integer getReceiptNum() {
        return receiptNum;
    }

    public void setReceiptNum(Integer receiptNum) {
        this.receiptNum = receiptNum;
    }

    public Short getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(Short groupNum) {
        this.groupNum = groupNum;
    }

    public Short getDocTime() {
        return docTime;
    }

    public void setDocTime(Short docTime) {
        this.docTime = docTime;
    }

    public Integer getSlpCode() {
        return slpCode;
    }

    public void setSlpCode(Integer slpCode) {
        this.slpCode = slpCode;
    }

    public Short getTrnspCode() {
        return trnspCode;
    }

    public void setTrnspCode(Short trnspCode) {
        this.trnspCode = trnspCode;
    }

    public Character getPartSupply() {
        return partSupply;
    }

    public void setPartSupply(Character partSupply) {
        this.partSupply = partSupply;
    }

    public Character getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(Character confirmed) {
        this.confirmed = confirmed;
    }

    public Short getGrossBase() {
        return grossBase;
    }

    public void setGrossBase(Short grossBase) {
        this.grossBase = grossBase;
    }

    public Integer getImportEnt() {
        return importEnt;
    }

    public void setImportEnt(Integer importEnt) {
        this.importEnt = importEnt;
    }

    public Character getCreateTran() {
        return createTran;
    }

    public void setCreateTran(Character createTran) {
        this.createTran = createTran;
    }

    public Character getSummryType() {
        return summryType;
    }

    public void setSummryType(Character summryType) {
        this.summryType = summryType;
    }

    public Character getUpdInvnt() {
        return updInvnt;
    }

    public void setUpdInvnt(Character updInvnt) {
        this.updInvnt = updInvnt;
    }

    public Character getUpdCardBal() {
        return updCardBal;
    }

    public void setUpdCardBal(Character updCardBal) {
        this.updCardBal = updCardBal;
    }

    public Short getInstance() {
        return instance;
    }

    public void setInstance(Short instance) {
        this.instance = instance;
    }

    public Integer getFlags() {
        return flags;
    }

    public void setFlags(Integer flags) {
        this.flags = flags;
    }

    public Character getInvntDirec() {
        return invntDirec;
    }

    public void setInvntDirec(Character invntDirec) {
        this.invntDirec = invntDirec;
    }

    public Integer getCntctCode() {
        return cntctCode;
    }

    public void setCntctCode(Integer cntctCode) {
        this.cntctCode = cntctCode;
    }

    public Character getShowSCN() {
        return showSCN;
    }

    public void setShowSCN(Character showSCN) {
        this.showSCN = showSCN;
    }

    public String getFatherCard() {
        return fatherCard;
    }

    public void setFatherCard(String fatherCard) {
        this.fatherCard = fatherCard;
    }

    public BigDecimal getSysRate() {
        return sysRate;
    }

    public void setSysRate(BigDecimal sysRate) {
        this.sysRate = sysRate;
    }

    public Character getCurSource() {
        return curSource;
    }

    public void setCurSource(Character curSource) {
        this.curSource = curSource;
    }

    public BigDecimal getVatSumSy() {
        return vatSumSy;
    }

    public void setVatSumSy(BigDecimal vatSumSy) {
        this.vatSumSy = vatSumSy;
    }

    public BigDecimal getDiscSumSy() {
        return discSumSy;
    }

    public void setDiscSumSy(BigDecimal discSumSy) {
        this.discSumSy = discSumSy;
    }

    public BigDecimal getDocTotalSy() {
        return docTotalSy;
    }

    public void setDocTotalSy(BigDecimal docTotalSy) {
        this.docTotalSy = docTotalSy;
    }

    public BigDecimal getPaidSys() {
        return paidSys;
    }

    public void setPaidSys(BigDecimal paidSys) {
        this.paidSys = paidSys;
    }

    public Character getFatherType() {
        return fatherType;
    }

    public void setFatherType(Character fatherType) {
        this.fatherType = fatherType;
    }

    public BigDecimal getGrosProfSy() {
        return grosProfSy;
    }

    public void setGrosProfSy(BigDecimal grosProfSy) {
        this.grosProfSy = grosProfSy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Character getIsICT() {
        return isICT;
    }

    public void setIsICT(Character isICT) {
        this.isICT = isICT;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public Short getVolUnit() {
        return volUnit;
    }

    public void setVolUnit(Short volUnit) {
        this.volUnit = volUnit;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public Short getWeightUnit() {
        return weightUnit;
    }

    public void setWeightUnit(Short weightUnit) {
        this.weightUnit = weightUnit;
    }

    public Short getSeries() {
        return series;
    }

    public void setSeries(Short series) {
        this.series = series;
    }

    public Date getTaxDate() {
        return taxDate;
    }

    public void setTaxDate(Date taxDate) {
        this.taxDate = taxDate;
    }

    public String getFiller() {
        return filler;
    }

    public void setFiller(String filler) {
        this.filler = filler;
    }

    public Character getDataSource() {
        return dataSource;
    }

    public void setDataSource(Character dataSource) {
        this.dataSource = dataSource;
    }

    public String getStampNum() {
        return stampNum;
    }

    public void setStampNum(String stampNum) {
        this.stampNum = stampNum;
    }

    public Character getIsCrin() {
        return isCrin;
    }

    public void setIsCrin(Character isCrin) {
        this.isCrin = isCrin;
    }

    public Integer getFinncPriod() {
        return finncPriod;
    }

    public void setFinncPriod(Integer finncPriod) {
        this.finncPriod = finncPriod;
    }

    public Short getUserSign() {
        return userSign;
    }

    public void setUserSign(Short userSign) {
        this.userSign = userSign;
    }

    public Character getSelfInv() {
        return selfInv;
    }

    public void setSelfInv(Character selfInv) {
        this.selfInv = selfInv;
    }

    public BigDecimal getVatPaid() {
        return vatPaid;
    }

    public void setVatPaid(BigDecimal vatPaid) {
        this.vatPaid = vatPaid;
    }

    public BigDecimal getVatPaidFC() {
        return vatPaidFC;
    }

    public void setVatPaidFC(BigDecimal vatPaidFC) {
        this.vatPaidFC = vatPaidFC;
    }

    public BigDecimal getVatPaidSys() {
        return vatPaidSys;
    }

    public void setVatPaidSys(BigDecimal vatPaidSys) {
        this.vatPaidSys = vatPaidSys;
    }

    public Short getUserSign2() {
        return userSign2;
    }

    public void setUserSign2(Short userSign2) {
        this.userSign2 = userSign2;
    }

    public Character getWddStatus() {
        return wddStatus;
    }

    public void setWddStatus(Character wddStatus) {
        this.wddStatus = wddStatus;
    }

    public Integer getDraftKey() {
        return draftKey;
    }

    public void setDraftKey(Integer draftKey) {
        this.draftKey = draftKey;
    }

    public BigDecimal getTotalExpns() {
        return totalExpns;
    }

    public void setTotalExpns(BigDecimal totalExpns) {
        this.totalExpns = totalExpns;
    }

    public BigDecimal getTotalExpFC() {
        return totalExpFC;
    }

    public void setTotalExpFC(BigDecimal totalExpFC) {
        this.totalExpFC = totalExpFC;
    }

    public BigDecimal getTotalExpSC() {
        return totalExpSC;
    }

    public void setTotalExpSC(BigDecimal totalExpSC) {
        this.totalExpSC = totalExpSC;
    }

    public Integer getDunnLevel() {
        return dunnLevel;
    }

    public void setDunnLevel(Integer dunnLevel) {
        this.dunnLevel = dunnLevel;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public Integer getLogInstanc() {
        return logInstanc;
    }

    public void setLogInstanc(Integer logInstanc) {
        this.logInstanc = logInstanc;
    }

    public Character getExported() {
        return exported;
    }

    public void setExported(Character exported) {
        this.exported = exported;
    }

    public Integer getStationID() {
        return stationID;
    }

    public void setStationID(Integer stationID) {
        this.stationID = stationID;
    }

    public String getIndicator() {
        return indicator;
    }

    public void setIndicator(String indicator) {
        this.indicator = indicator;
    }

    public Character getNetProc() {
        return netProc;
    }

    public void setNetProc(Character netProc) {
        this.netProc = netProc;
    }

    public BigDecimal getAqcsTax() {
        return aqcsTax;
    }

    public void setAqcsTax(BigDecimal aqcsTax) {
        this.aqcsTax = aqcsTax;
    }

    public BigDecimal getAqcsTaxFC() {
        return aqcsTaxFC;
    }

    public void setAqcsTaxFC(BigDecimal aqcsTaxFC) {
        this.aqcsTaxFC = aqcsTaxFC;
    }

    public BigDecimal getAqcsTaxSC() {
        return aqcsTaxSC;
    }

    public void setAqcsTaxSC(BigDecimal aqcsTaxSC) {
        this.aqcsTaxSC = aqcsTaxSC;
    }

    public BigDecimal getCashDiscPr() {
        return cashDiscPr;
    }

    public void setCashDiscPr(BigDecimal cashDiscPr) {
        this.cashDiscPr = cashDiscPr;
    }

    public BigDecimal getCashDiscnt() {
        return cashDiscnt;
    }

    public void setCashDiscnt(BigDecimal cashDiscnt) {
        this.cashDiscnt = cashDiscnt;
    }

    public BigDecimal getCashDiscFC() {
        return cashDiscFC;
    }

    public void setCashDiscFC(BigDecimal cashDiscFC) {
        this.cashDiscFC = cashDiscFC;
    }

    public BigDecimal getCashDiscSC() {
        return cashDiscSC;
    }

    public void setCashDiscSC(BigDecimal cashDiscSC) {
        this.cashDiscSC = cashDiscSC;
    }

    public String getShipToCode() {
        return shipToCode;
    }

    public void setShipToCode(String shipToCode) {
        this.shipToCode = shipToCode;
    }

    public String getLicTradNum() {
        return licTradNum;
    }

    public void setLicTradNum(String licTradNum) {
        this.licTradNum = licTradNum;
    }

    public String getPaymentRef() {
        return paymentRef;
    }

    public void setPaymentRef(String paymentRef) {
        this.paymentRef = paymentRef;
    }

    public BigDecimal getwTSum() {
        return wTSum;
    }

    public void setwTSum(BigDecimal wTSum) {
        this.wTSum = wTSum;
    }

    public BigDecimal getwTSumFC() {
        return wTSumFC;
    }

    public void setwTSumFC(BigDecimal wTSumFC) {
        this.wTSumFC = wTSumFC;
    }

    public BigDecimal getwTSumSC() {
        return wTSumSC;
    }

    public void setwTSumSC(BigDecimal wTSumSC) {
        this.wTSumSC = wTSumSC;
    }

    public BigDecimal getRoundDif() {
        return roundDif;
    }

    public void setRoundDif(BigDecimal roundDif) {
        this.roundDif = roundDif;
    }

    public BigDecimal getRoundDifFC() {
        return roundDifFC;
    }

    public void setRoundDifFC(BigDecimal roundDifFC) {
        this.roundDifFC = roundDifFC;
    }

    public BigDecimal getRoundDifSy() {
        return roundDifSy;
    }

    public void setRoundDifSy(BigDecimal roundDifSy) {
        this.roundDifSy = roundDifSy;
    }

    public Character getCheckDigit() {
        return checkDigit;
    }

    public void setCheckDigit(Character checkDigit) {
        this.checkDigit = checkDigit;
    }

    public Integer getForm1099() {
        return form1099;
    }

    public void setForm1099(Integer form1099) {
        this.form1099 = form1099;
    }

    public String getBox1099() {
        return box1099;
    }

    public void setBox1099(String box1099) {
        this.box1099 = box1099;
    }

    public Character getSubmitted() {
        return submitted;
    }

    public void setSubmitted(Character submitted) {
        this.submitted = submitted;
    }

    public Character getPoPrss() {
        return poPrss;
    }

    public void setPoPrss(Character poPrss) {
        this.poPrss = poPrss;
    }

    public Character getRounding() {
        return rounding;
    }

    public void setRounding(Character rounding) {
        this.rounding = rounding;
    }

    public Character getRevisionPo() {
        return revisionPo;
    }

    public void setRevisionPo(Character revisionPo) {
        this.revisionPo = revisionPo;
    }

    public Short getSegment() {
        return segment;
    }

    public void setSegment(Short segment) {
        this.segment = segment;
    }

    public Date getReqDate() {
        return reqDate;
    }

    public void setReqDate(Date reqDate) {
        this.reqDate = reqDate;
    }

    public Date getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(Date cancelDate) {
        this.cancelDate = cancelDate;
    }

    public Character getPickStatus() {
        return pickStatus;
    }

    public void setPickStatus(Character pickStatus) {
        this.pickStatus = pickStatus;
    }

    public Character getPick() {
        return pick;
    }

    public void setPick(Character pick) {
        this.pick = pick;
    }

    public Character getBlockDunn() {
        return blockDunn;
    }

    public void setBlockDunn(Character blockDunn) {
        this.blockDunn = blockDunn;
    }

    public String getPeyMethod() {
        return peyMethod;
    }

    public void setPeyMethod(String peyMethod) {
        this.peyMethod = peyMethod;
    }

    public Character getPayBlock() {
        return payBlock;
    }

    public void setPayBlock(Character payBlock) {
        this.payBlock = payBlock;
    }

    public Integer getPayBlckRef() {
        return payBlckRef;
    }

    public void setPayBlckRef(Integer payBlckRef) {
        this.payBlckRef = payBlckRef;
    }

    public Character getMaxDscn() {
        return maxDscn;
    }

    public void setMaxDscn(Character maxDscn) {
        this.maxDscn = maxDscn;
    }

    public Character getReserve() {
        return reserve;
    }

    public void setReserve(Character reserve) {
        this.reserve = reserve;
    }

    public BigDecimal getMax1099() {
        return max1099;
    }

    public void setMax1099(BigDecimal max1099) {
        this.max1099 = max1099;
    }

    public String getCntrlBnk() {
        return cntrlBnk;
    }

    public void setCntrlBnk(String cntrlBnk) {
        this.cntrlBnk = cntrlBnk;
    }

    public String getPickRmrk() {
        return pickRmrk;
    }

    public void setPickRmrk(String pickRmrk) {
        this.pickRmrk = pickRmrk;
    }

    public String getiSRCodLine() {
        return iSRCodLine;
    }

    public void setiSRCodLine(String iSRCodLine) {
        this.iSRCodLine = iSRCodLine;
    }

    public BigDecimal getExpAppl() {
        return expAppl;
    }

    public void setExpAppl(BigDecimal expAppl) {
        this.expAppl = expAppl;
    }

    public BigDecimal getExpApplFC() {
        return expApplFC;
    }

    public void setExpApplFC(BigDecimal expApplFC) {
        this.expApplFC = expApplFC;
    }

    public BigDecimal getExpApplSC() {
        return expApplSC;
    }

    public void setExpApplSC(BigDecimal expApplSC) {
        this.expApplSC = expApplSC;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public Character getDeferrTax() {
        return deferrTax;
    }

    public void setDeferrTax(Character deferrTax) {
        this.deferrTax = deferrTax;
    }

    public String getLetterNum() {
        return letterNum;
    }

    public void setLetterNum(String letterNum) {
        this.letterNum = letterNum;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public BigDecimal getwTApplied() {
        return wTApplied;
    }

    public void setwTApplied(BigDecimal wTApplied) {
        this.wTApplied = wTApplied;
    }

    public BigDecimal getwTAppliedF() {
        return wTAppliedF;
    }

    public void setwTAppliedF(BigDecimal wTAppliedF) {
        this.wTAppliedF = wTAppliedF;
    }

    public Character getBoeReserev() {
        return boeReserev;
    }

    public void setBoeReserev(Character boeReserev) {
        this.boeReserev = boeReserev;
    }

    public String getAgentCode() {
        return agentCode;
    }

    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode;
    }

    public BigDecimal getwTAppliedS() {
        return wTAppliedS;
    }

    public void setwTAppliedS(BigDecimal wTAppliedS) {
        this.wTAppliedS = wTAppliedS;
    }

    public BigDecimal getEquVatSum() {
        return equVatSum;
    }

    public void setEquVatSum(BigDecimal equVatSum) {
        this.equVatSum = equVatSum;
    }

    public BigDecimal getEquVatSumF() {
        return equVatSumF;
    }

    public void setEquVatSumF(BigDecimal equVatSumF) {
        this.equVatSumF = equVatSumF;
    }

    public BigDecimal getEquVatSumS() {
        return equVatSumS;
    }

    public void setEquVatSumS(BigDecimal equVatSumS) {
        this.equVatSumS = equVatSumS;
    }

    public Short getInstallmnt() {
        return installmnt;
    }

    public void setInstallmnt(Short installmnt) {
        this.installmnt = installmnt;
    }

    public Character getvATFirst() {
        return vATFirst;
    }

    public void setvATFirst(Character vATFirst) {
        this.vATFirst = vATFirst;
    }

    public BigDecimal getNnSbAmnt() {
        return nnSbAmnt;
    }

    public void setNnSbAmnt(BigDecimal nnSbAmnt) {
        this.nnSbAmnt = nnSbAmnt;
    }

    public BigDecimal getNnSbAmntSC() {
        return nnSbAmntSC;
    }

    public void setNnSbAmntSC(BigDecimal nnSbAmntSC) {
        this.nnSbAmntSC = nnSbAmntSC;
    }

    public BigDecimal getNbSbAmntFC() {
        return nbSbAmntFC;
    }

    public void setNbSbAmntFC(BigDecimal nbSbAmntFC) {
        this.nbSbAmntFC = nbSbAmntFC;
    }

    public BigDecimal getExepAmnt() {
        return exepAmnt;
    }

    public void setExepAmnt(BigDecimal exepAmnt) {
        this.exepAmnt = exepAmnt;
    }

    public BigDecimal getExepAmntSC() {
        return exepAmntSC;
    }

    public void setExepAmntSC(BigDecimal exepAmntSC) {
        this.exepAmntSC = exepAmntSC;
    }

    public BigDecimal getExepAmntFC() {
        return exepAmntFC;
    }

    public void setExepAmntFC(BigDecimal exepAmntFC) {
        this.exepAmntFC = exepAmntFC;
    }

    public Date getVatDate() {
        return vatDate;
    }

    public void setVatDate(Date vatDate) {
        this.vatDate = vatDate;
    }

    public String getCorrExt() {
        return corrExt;
    }

    public void setCorrExt(String corrExt) {
        this.corrExt = corrExt;
    }

    public Integer getCorrInv() {
        return corrInv;
    }

    public void setCorrInv(Integer corrInv) {
        this.corrInv = corrInv;
    }

    public Integer getnCorrInv() {
        return nCorrInv;
    }

    public void setnCorrInv(Integer nCorrInv) {
        this.nCorrInv = nCorrInv;
    }

    public Character getcEECFlag() {
        return cEECFlag;
    }

    public void setcEECFlag(Character cEECFlag) {
        this.cEECFlag = cEECFlag;
    }

    public BigDecimal getBaseAmnt() {
        return baseAmnt;
    }

    public void setBaseAmnt(BigDecimal baseAmnt) {
        this.baseAmnt = baseAmnt;
    }

    public BigDecimal getBaseAmntSC() {
        return baseAmntSC;
    }

    public void setBaseAmntSC(BigDecimal baseAmntSC) {
        this.baseAmntSC = baseAmntSC;
    }

    public BigDecimal getBaseAmntFC() {
        return baseAmntFC;
    }

    public void setBaseAmntFC(BigDecimal baseAmntFC) {
        this.baseAmntFC = baseAmntFC;
    }

    public String getCtlAccount() {
        return ctlAccount;
    }

    public void setCtlAccount(String ctlAccount) {
        this.ctlAccount = ctlAccount;
    }

    public Integer getbPLId() {
        return bPLId;
    }

    public void setbPLId(Integer bPLId) {
        this.bPLId = bPLId;
    }

    public String getbPLName() {
        return bPLName;
    }

    public void setbPLName(String bPLName) {
        this.bPLName = bPLName;
    }

    public String getvATRegNum() {
        return vATRegNum;
    }

    public void setvATRegNum(String vATRegNum) {
        this.vATRegNum = vATRegNum;
    }

    public String getTxInvRptNo() {
        return txInvRptNo;
    }

    public void setTxInvRptNo(String txInvRptNo) {
        this.txInvRptNo = txInvRptNo;
    }

    public Date getTxInvRptDt() {
        return txInvRptDt;
    }

    public void setTxInvRptDt(Date txInvRptDt) {
        this.txInvRptDt = txInvRptDt;
    }

    public String getkVVATCode() {
        return kVVATCode;
    }

    public void setkVVATCode(String kVVATCode) {
        this.kVVATCode = kVVATCode;
    }

    public String getwTDetails() {
        return wTDetails;
    }

    public void setwTDetails(String wTDetails) {
        this.wTDetails = wTDetails;
    }

    public Integer getSumAbsId() {
        return sumAbsId;
    }

    public void setSumAbsId(Integer sumAbsId) {
        this.sumAbsId = sumAbsId;
    }

    public Date getSumRptDate() {
        return sumRptDate;
    }

    public void setSumRptDate(Date sumRptDate) {
        this.sumRptDate = sumRptDate;
    }

    public String getpIndicator() {
        return pIndicator;
    }

    public void setpIndicator(String pIndicator) {
        this.pIndicator = pIndicator;
    }

    public String getManualNum() {
        return manualNum;
    }

    public void setManualNum(String manualNum) {
        this.manualNum = manualNum;
    }

    public Character getUseShpdGd() {
        return useShpdGd;
    }

    public void setUseShpdGd(Character useShpdGd) {
        this.useShpdGd = useShpdGd;
    }

    public BigDecimal getBaseVtAt() {
        return baseVtAt;
    }

    public void setBaseVtAt(BigDecimal baseVtAt) {
        this.baseVtAt = baseVtAt;
    }

    public BigDecimal getBaseVtAtSC() {
        return baseVtAtSC;
    }

    public void setBaseVtAtSC(BigDecimal baseVtAtSC) {
        this.baseVtAtSC = baseVtAtSC;
    }

    public BigDecimal getBaseVtAtFC() {
        return baseVtAtFC;
    }

    public void setBaseVtAtFC(BigDecimal baseVtAtFC) {
        this.baseVtAtFC = baseVtAtFC;
    }

    public BigDecimal getNnSbVAt() {
        return nnSbVAt;
    }

    public void setNnSbVAt(BigDecimal nnSbVAt) {
        this.nnSbVAt = nnSbVAt;
    }

    public BigDecimal getNnSbVAtSC() {
        return nnSbVAtSC;
    }

    public void setNnSbVAtSC(BigDecimal nnSbVAtSC) {
        this.nnSbVAtSC = nnSbVAtSC;
    }

    public BigDecimal getNbSbVAtFC() {
        return nbSbVAtFC;
    }

    public void setNbSbVAtFC(BigDecimal nbSbVAtFC) {
        this.nbSbVAtFC = nbSbVAtFC;
    }

    public BigDecimal getExptVAt() {
        return exptVAt;
    }

    public void setExptVAt(BigDecimal exptVAt) {
        this.exptVAt = exptVAt;
    }

    public BigDecimal getExptVAtSC() {
        return exptVAtSC;
    }

    public void setExptVAtSC(BigDecimal exptVAtSC) {
        this.exptVAtSC = exptVAtSC;
    }

    public BigDecimal getExptVAtFC() {
        return exptVAtFC;
    }

    public void setExptVAtFC(BigDecimal exptVAtFC) {
        this.exptVAtFC = exptVAtFC;
    }

    public BigDecimal getlYPmtAt() {
        return lYPmtAt;
    }

    public void setlYPmtAt(BigDecimal lYPmtAt) {
        this.lYPmtAt = lYPmtAt;
    }

    public BigDecimal getlYPmtAtSC() {
        return lYPmtAtSC;
    }

    public void setlYPmtAtSC(BigDecimal lYPmtAtSC) {
        this.lYPmtAtSC = lYPmtAtSC;
    }

    public BigDecimal getlYPmtAtFC() {
        return lYPmtAtFC;
    }

    public void setlYPmtAtFC(BigDecimal lYPmtAtFC) {
        this.lYPmtAtFC = lYPmtAtFC;
    }

    public BigDecimal getExpAnSum() {
        return expAnSum;
    }

    public void setExpAnSum(BigDecimal expAnSum) {
        this.expAnSum = expAnSum;
    }

    public BigDecimal getExpAnSys() {
        return expAnSys;
    }

    public void setExpAnSys(BigDecimal expAnSys) {
        this.expAnSys = expAnSys;
    }

    public BigDecimal getExpAnFrgn() {
        return expAnFrgn;
    }

    public void setExpAnFrgn(BigDecimal expAnFrgn) {
        this.expAnFrgn = expAnFrgn;
    }

    public String getDocSubType() {
        return docSubType;
    }

    public void setDocSubType(String docSubType) {
        this.docSubType = docSubType;
    }

    public Character getDpmStatus() {
        return dpmStatus;
    }

    public void setDpmStatus(Character dpmStatus) {
        this.dpmStatus = dpmStatus;
    }

    public BigDecimal getDpmAmnt() {
        return dpmAmnt;
    }

    public void setDpmAmnt(BigDecimal dpmAmnt) {
        this.dpmAmnt = dpmAmnt;
    }

    public BigDecimal getDpmAmntSC() {
        return dpmAmntSC;
    }

    public void setDpmAmntSC(BigDecimal dpmAmntSC) {
        this.dpmAmntSC = dpmAmntSC;
    }

    public BigDecimal getDpmAmntFC() {
        return dpmAmntFC;
    }

    public void setDpmAmntFC(BigDecimal dpmAmntFC) {
        this.dpmAmntFC = dpmAmntFC;
    }

    public Character getDpmDrawn() {
        return dpmDrawn;
    }

    public void setDpmDrawn(Character dpmDrawn) {
        this.dpmDrawn = dpmDrawn;
    }

    public BigDecimal getDpmPrcnt() {
        return dpmPrcnt;
    }

    public void setDpmPrcnt(BigDecimal dpmPrcnt) {
        this.dpmPrcnt = dpmPrcnt;
    }

    public BigDecimal getPaidSum() {
        return paidSum;
    }

    public void setPaidSum(BigDecimal paidSum) {
        this.paidSum = paidSum;
    }

    public BigDecimal getPaidSumFc() {
        return paidSumFc;
    }

    public void setPaidSumFc(BigDecimal paidSumFc) {
        this.paidSumFc = paidSumFc;
    }

    public BigDecimal getPaidSumSc() {
        return paidSumSc;
    }

    public void setPaidSumSc(BigDecimal paidSumSc) {
        this.paidSumSc = paidSumSc;
    }

    public String getFolioPref() {
        return folioPref;
    }

    public void setFolioPref(String folioPref) {
        this.folioPref = folioPref;
    }

    public Integer getFolioNum() {
        return folioNum;
    }

    public void setFolioNum(Integer folioNum) {
        this.folioNum = folioNum;
    }

    public BigDecimal getDpmAppl() {
        return dpmAppl;
    }

    public void setDpmAppl(BigDecimal dpmAppl) {
        this.dpmAppl = dpmAppl;
    }

    public BigDecimal getDpmApplFc() {
        return dpmApplFc;
    }

    public void setDpmApplFc(BigDecimal dpmApplFc) {
        this.dpmApplFc = dpmApplFc;
    }

    public BigDecimal getDpmApplSc() {
        return dpmApplSc;
    }

    public void setDpmApplSc(BigDecimal dpmApplSc) {
        this.dpmApplSc = dpmApplSc;
    }

    public Integer getlPgFolioN() {
        return lPgFolioN;
    }

    public void setlPgFolioN(Integer lPgFolioN) {
        this.lPgFolioN = lPgFolioN;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getFooter() {
        return footer;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    public Character getPosted() {
        return posted;
    }

    public void setPosted(Character posted) {
        this.posted = posted;
    }

    public Integer getOwnerCode() {
        return ownerCode;
    }

    public void setOwnerCode(Integer ownerCode) {
        this.ownerCode = ownerCode;
    }

    public String getbPChCode() {
        return bPChCode;
    }

    public void setbPChCode(String bPChCode) {
        this.bPChCode = bPChCode;
    }

    public Integer getbPChCntc() {
        return bPChCntc;
    }

    public void setbPChCntc(Integer bPChCntc) {
        this.bPChCntc = bPChCntc;
    }

    public String getPayToCode() {
        return payToCode;
    }

    public void setPayToCode(String payToCode) {
        this.payToCode = payToCode;
    }

    public Character getIsPaytoBnk() {
        return isPaytoBnk;
    }

    public void setIsPaytoBnk(Character isPaytoBnk) {
        this.isPaytoBnk = isPaytoBnk;
    }

    public String getBnkCntry() {
        return bnkCntry;
    }

    public void setBnkCntry(String bnkCntry) {
        this.bnkCntry = bnkCntry;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBnkAccount() {
        return bnkAccount;
    }

    public void setBnkAccount(String bnkAccount) {
        this.bnkAccount = bnkAccount;
    }

    public String getBnkBranch() {
        return bnkBranch;
    }

    public void setBnkBranch(String bnkBranch) {
        this.bnkBranch = bnkBranch;
    }

    public Character getIsIns() {
        return isIns;
    }

    public void setIsIns(Character isIns) {
        this.isIns = isIns;
    }

    public String getTrackNo() {
        return trackNo;
    }

    public void setTrackNo(String trackNo) {
        this.trackNo = trackNo;
    }

    public String getVersionNum() {
        return versionNum;
    }

    public void setVersionNum(String versionNum) {
        this.versionNum = versionNum;
    }

    public Integer getLangCode() {
        return langCode;
    }

    public void setLangCode(Integer langCode) {
        this.langCode = langCode;
    }

    public Character getbPNameOW() {
        return bPNameOW;
    }

    public void setbPNameOW(Character bPNameOW) {
        this.bPNameOW = bPNameOW;
    }

    public Character getBillToOW() {
        return billToOW;
    }

    public void setBillToOW(Character billToOW) {
        this.billToOW = billToOW;
    }

    public Character getShipToOW() {
        return shipToOW;
    }

    public void setShipToOW(Character shipToOW) {
        this.shipToOW = shipToOW;
    }

    public Character getRetInvoice() {
        return retInvoice;
    }

    public void setRetInvoice(Character retInvoice) {
        this.retInvoice = retInvoice;
    }

    public Date getClsDate() {
        return clsDate;
    }

    public void setClsDate(Date clsDate) {
        this.clsDate = clsDate;
    }

    public Integer getmInvNum() {
        return mInvNum;
    }

    public void setmInvNum(Integer mInvNum) {
        this.mInvNum = mInvNum;
    }

    public Date getmInvDate() {
        return mInvDate;
    }

    public void setmInvDate(Date mInvDate) {
        this.mInvDate = mInvDate;
    }

    public Short getSeqCode() {
        return seqCode;
    }

    public void setSeqCode(Short seqCode) {
        this.seqCode = seqCode;
    }

    public Integer getSerial() {
        return serial;
    }

    public void setSerial(Integer serial) {
        this.serial = serial;
    }

    public String getSeriesStr() {
        return seriesStr;
    }

    public void setSeriesStr(String seriesStr) {
        this.seriesStr = seriesStr;
    }

    public String getSubStr() {
        return subStr;
    }

    public void setSubStr(String subStr) {
        this.subStr = subStr;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public BigDecimal getTaxOnExp() {
        return taxOnExp;
    }

    public void setTaxOnExp(BigDecimal taxOnExp) {
        this.taxOnExp = taxOnExp;
    }

    public BigDecimal getTaxOnExpFc() {
        return taxOnExpFc;
    }

    public void setTaxOnExpFc(BigDecimal taxOnExpFc) {
        this.taxOnExpFc = taxOnExpFc;
    }

    public BigDecimal getTaxOnExpSc() {
        return taxOnExpSc;
    }

    public void setTaxOnExpSc(BigDecimal taxOnExpSc) {
        this.taxOnExpSc = taxOnExpSc;
    }

    public BigDecimal getTaxOnExAp() {
        return taxOnExAp;
    }

    public void setTaxOnExAp(BigDecimal taxOnExAp) {
        this.taxOnExAp = taxOnExAp;
    }

    public BigDecimal getTaxOnExApF() {
        return taxOnExApF;
    }

    public void setTaxOnExApF(BigDecimal taxOnExApF) {
        this.taxOnExApF = taxOnExApF;
    }

    public BigDecimal getTaxOnExApS() {
        return taxOnExApS;
    }

    public void setTaxOnExApS(BigDecimal taxOnExApS) {
        this.taxOnExApS = taxOnExApS;
    }

    public Character getLastPmnTyp() {
        return lastPmnTyp;
    }

    public void setLastPmnTyp(Character lastPmnTyp) {
        this.lastPmnTyp = lastPmnTyp;
    }

    public Integer getLndCstNum() {
        return lndCstNum;
    }

    public void setLndCstNum(Integer lndCstNum) {
        this.lndCstNum = lndCstNum;
    }

    public Character getUseCorrVat() {
        return useCorrVat;
    }

    public void setUseCorrVat(Character useCorrVat) {
        this.useCorrVat = useCorrVat;
    }

    public Character getBlkCredMmo() {
        return blkCredMmo;
    }

    public void setBlkCredMmo(Character blkCredMmo) {
        this.blkCredMmo = blkCredMmo;
    }

    public Character getOpenForLaC() {
        return openForLaC;
    }

    public void setOpenForLaC(Character openForLaC) {
        this.openForLaC = openForLaC;
    }

    public Character getExcised() {
        return excised;
    }

    public void setExcised(Character excised) {
        this.excised = excised;
    }

    public Date getExcRefDate() {
        return excRefDate;
    }

    public void setExcRefDate(Date excRefDate) {
        this.excRefDate = excRefDate;
    }

    public String getExcRmvTime() {
        return excRmvTime;
    }

    public void setExcRmvTime(String excRmvTime) {
        this.excRmvTime = excRmvTime;
    }

    public BigDecimal getSrvGpPrcnt() {
        return srvGpPrcnt;
    }

    public void setSrvGpPrcnt(BigDecimal srvGpPrcnt) {
        this.srvGpPrcnt = srvGpPrcnt;
    }

    public Integer getDepositNum() {
        return depositNum;
    }

    public void setDepositNum(Integer depositNum) {
        this.depositNum = depositNum;
    }

    public String getCertNum() {
        return certNum;
    }

    public void setCertNum(String certNum) {
        this.certNum = certNum;
    }

    public Character getDutyStatus() {
        return dutyStatus;
    }

    public void setDutyStatus(Character dutyStatus) {
        this.dutyStatus = dutyStatus;
    }

    public Character getAutoCrtFlw() {
        return autoCrtFlw;
    }

    public void setAutoCrtFlw(Character autoCrtFlw) {
        this.autoCrtFlw = autoCrtFlw;
    }

    public Date getFlwRefDate() {
        return flwRefDate;
    }

    public void setFlwRefDate(Date flwRefDate) {
        this.flwRefDate = flwRefDate;
    }

    public String getFlwRefNum() {
        return flwRefNum;
    }

    public void setFlwRefNum(String flwRefNum) {
        this.flwRefNum = flwRefNum;
    }

    public Integer getVatJENum() {
        return vatJENum;
    }

    public void setVatJENum(Integer vatJENum) {
        this.vatJENum = vatJENum;
    }

    public BigDecimal getDpmVat() {
        return dpmVat;
    }

    public void setDpmVat(BigDecimal dpmVat) {
        this.dpmVat = dpmVat;
    }

    public BigDecimal getDpmVatFc() {
        return dpmVatFc;
    }

    public void setDpmVatFc(BigDecimal dpmVatFc) {
        this.dpmVatFc = dpmVatFc;
    }

    public BigDecimal getDpmVatSc() {
        return dpmVatSc;
    }

    public void setDpmVatSc(BigDecimal dpmVatSc) {
        this.dpmVatSc = dpmVatSc;
    }

    public BigDecimal getDpmAppVat() {
        return dpmAppVat;
    }

    public void setDpmAppVat(BigDecimal dpmAppVat) {
        this.dpmAppVat = dpmAppVat;
    }

    public BigDecimal getDpmAppVatF() {
        return dpmAppVatF;
    }

    public void setDpmAppVatF(BigDecimal dpmAppVatF) {
        this.dpmAppVatF = dpmAppVatF;
    }

    public BigDecimal getDpmAppVatS() {
        return dpmAppVatS;
    }

    public void setDpmAppVatS(BigDecimal dpmAppVatS) {
        this.dpmAppVatS = dpmAppVatS;
    }

    public Character getInsurOp347() {
        return insurOp347;
    }

    public void setInsurOp347(Character insurOp347) {
        this.insurOp347 = insurOp347;
    }

    public Character getIgnRelDoc() {
        return ignRelDoc;
    }

    public void setIgnRelDoc(Character ignRelDoc) {
        this.ignRelDoc = ignRelDoc;
    }

    public String getBuildDesc() {
        return buildDesc;
    }

    public void setBuildDesc(String buildDesc) {
        this.buildDesc = buildDesc;
    }

    public Character getResidenNum() {
        return residenNum;
    }

    public void setResidenNum(Character residenNum) {
        this.residenNum = residenNum;
    }

    public Integer getChecker() {
        return checker;
    }

    public void setChecker(Integer checker) {
        this.checker = checker;
    }

    public Integer getPayee() {
        return payee;
    }

    public void setPayee(Integer payee) {
        this.payee = payee;
    }

    public Integer getCopyNumber() {
        return copyNumber;
    }

    public void setCopyNumber(Integer copyNumber) {
        this.copyNumber = copyNumber;
    }

    public Character getsSIExmpt() {
        return sSIExmpt;
    }

    public void setsSIExmpt(Character sSIExmpt) {
        this.sSIExmpt = sSIExmpt;
    }

    public Short getpQTGrpSer() {
        return pQTGrpSer;
    }

    public void setpQTGrpSer(Short pQTGrpSer) {
        this.pQTGrpSer = pQTGrpSer;
    }

    public Integer getpQTGrpNum() {
        return pQTGrpNum;
    }

    public void setpQTGrpNum(Integer pQTGrpNum) {
        this.pQTGrpNum = pQTGrpNum;
    }

    public Character getpQTGrpHW() {
        return pQTGrpHW;
    }

    public void setpQTGrpHW(Character pQTGrpHW) {
        this.pQTGrpHW = pQTGrpHW;
    }

    public Character getReopOriDoc() {
        return reopOriDoc;
    }

    public void setReopOriDoc(Character reopOriDoc) {
        this.reopOriDoc = reopOriDoc;
    }

    public Character getReopManCls() {
        return reopManCls;
    }

    public void setReopManCls(Character reopManCls) {
        this.reopManCls = reopManCls;
    }

    public Character getDocManClsd() {
        return docManClsd;
    }

    public void setDocManClsd(Character docManClsd) {
        this.docManClsd = docManClsd;
    }

    public Short getClosingOpt() {
        return closingOpt;
    }

    public void setClosingOpt(Short closingOpt) {
        this.closingOpt = closingOpt;
    }

    public Date getSpecDate() {
        return specDate;
    }

    public void setSpecDate(Date specDate) {
        this.specDate = specDate;
    }

    public Character getOrdered() {
        return ordered;
    }

    public void setOrdered(Character ordered) {
        this.ordered = ordered;
    }

    public Character getnTSApprov() {
        return nTSApprov;
    }

    public void setnTSApprov(Character nTSApprov) {
        this.nTSApprov = nTSApprov;
    }

    public Short getnTSWebSite() {
        return nTSWebSite;
    }

    public void setnTSWebSite(Short nTSWebSite) {
        this.nTSWebSite = nTSWebSite;
    }

    public String getnTSeTaxNo() {
        return nTSeTaxNo;
    }

    public void setnTSeTaxNo(String nTSeTaxNo) {
        this.nTSeTaxNo = nTSeTaxNo;
    }

    public String getnTSApprNo() {
        return nTSApprNo;
    }

    public void setnTSApprNo(String nTSApprNo) {
        this.nTSApprNo = nTSApprNo;
    }

    public Character getPayDuMonth() {
        return payDuMonth;
    }

    public void setPayDuMonth(Character payDuMonth) {
        this.payDuMonth = payDuMonth;
    }

    public Short getExtraMonth() {
        return extraMonth;
    }

    public void setExtraMonth(Short extraMonth) {
        this.extraMonth = extraMonth;
    }

    public Short getExtraDays() {
        return extraDays;
    }

    public void setExtraDays(Short extraDays) {
        this.extraDays = extraDays;
    }

    public Short getCdcOffset() {
        return cdcOffset;
    }

    public void setCdcOffset(Short cdcOffset) {
        this.cdcOffset = cdcOffset;
    }

    public String getSignMsg() {
        return signMsg;
    }

    public void setSignMsg(String signMsg) {
        this.signMsg = signMsg;
    }

    public String getSignDigest() {
        return signDigest;
    }

    public void setSignDigest(String signDigest) {
        this.signDigest = signDigest;
    }

    public String getCertifNum() {
        return certifNum;
    }

    public void setCertifNum(String certifNum) {
        this.certifNum = certifNum;
    }

    public Integer getKeyVersion() {
        return keyVersion;
    }

    public void setKeyVersion(Integer keyVersion) {
        this.keyVersion = keyVersion;
    }

    public Character geteDocGenTyp() {
        return eDocGenTyp;
    }

    public void seteDocGenTyp(Character eDocGenTyp) {
        this.eDocGenTyp = eDocGenTyp;
    }

    public Short geteSeries() {
        return eSeries;
    }

    public void seteSeries(Short eSeries) {
        this.eSeries = eSeries;
    }

    public String geteDocNum() {
        return eDocNum;
    }

    public void seteDocNum(String eDocNum) {
        this.eDocNum = eDocNum;
    }

    public Integer geteDocExpFrm() {
        return eDocExpFrm;
    }

    public void seteDocExpFrm(Integer eDocExpFrm) {
        this.eDocExpFrm = eDocExpFrm;
    }

    public Character getOnlineQuo() {
        return onlineQuo;
    }

    public void setOnlineQuo(Character onlineQuo) {
        this.onlineQuo = onlineQuo;
    }

    public String getpOSEqNum() {
        return pOSEqNum;
    }

    public void setpOSEqNum(String pOSEqNum) {
        this.pOSEqNum = pOSEqNum;
    }

    public String getpOSManufSN() {
        return pOSManufSN;
    }

    public void setpOSManufSN(String pOSManufSN) {
        this.pOSManufSN = pOSManufSN;
    }

    public Integer getpOSCashN() {
        return pOSCashN;
    }

    public void setpOSCashN(Integer pOSCashN) {
        this.pOSCashN = pOSCashN;
    }

    public Character geteDocStatus() {
        return eDocStatus;
    }

    public void seteDocStatus(Character eDocStatus) {
        this.eDocStatus = eDocStatus;
    }

    public String geteDocCntnt() {
        return eDocCntnt;
    }

    public void seteDocCntnt(String eDocCntnt) {
        this.eDocCntnt = eDocCntnt;
    }

    public Character geteDocProces() {
        return eDocProces;
    }

    public void seteDocProces(Character eDocProces) {
        this.eDocProces = eDocProces;
    }

    public String geteDocErrCod() {
        return eDocErrCod;
    }

    public void seteDocErrCod(String eDocErrCod) {
        this.eDocErrCod = eDocErrCod;
    }

    public String geteDocErrMsg() {
        return eDocErrMsg;
    }

    public void seteDocErrMsg(String eDocErrMsg) {
        this.eDocErrMsg = eDocErrMsg;
    }

    public Character geteDocCancel() {
        return eDocCancel;
    }

    public void seteDocCancel(Character eDocCancel) {
        this.eDocCancel = eDocCancel;
    }

    public Character geteDocTest() {
        return eDocTest;
    }

    public void seteDocTest(Character eDocTest) {
        this.eDocTest = eDocTest;
    }

    public String geteDocPrefix() {
        return eDocPrefix;
    }

    public void seteDocPrefix(String eDocPrefix) {
        this.eDocPrefix = eDocPrefix;
    }

    public Integer getCup() {
        return cup;
    }

    public void setCup(Integer cup) {
        this.cup = cup;
    }

    public Integer getCig() {
        return cig;
    }

    public void setCig(Integer cig) {
        this.cig = cig;
    }

    public Character getDpmAsDscnt() {
        return dpmAsDscnt;
    }

    public void setDpmAsDscnt(Character dpmAsDscnt) {
        this.dpmAsDscnt = dpmAsDscnt;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    public Integer getAtcEntry() {
        return atcEntry;
    }

    public void setAtcEntry(Integer atcEntry) {
        this.atcEntry = atcEntry;
    }

    public String getSupplCode() {
        return supplCode;
    }

    public void setSupplCode(String supplCode) {
        this.supplCode = supplCode;
    }

    public Character getgTSRlvnt() {
        return gTSRlvnt;
    }

    public void setgTSRlvnt(Character gTSRlvnt) {
        this.gTSRlvnt = gTSRlvnt;
    }

    public BigDecimal getBaseDisc() {
        return baseDisc;
    }

    public void setBaseDisc(BigDecimal baseDisc) {
        this.baseDisc = baseDisc;
    }

    public BigDecimal getBaseDiscSc() {
        return baseDiscSc;
    }

    public void setBaseDiscSc(BigDecimal baseDiscSc) {
        this.baseDiscSc = baseDiscSc;
    }

    public BigDecimal getBaseDiscFc() {
        return baseDiscFc;
    }

    public void setBaseDiscFc(BigDecimal baseDiscFc) {
        this.baseDiscFc = baseDiscFc;
    }

    public BigDecimal getBaseDiscPr() {
        return baseDiscPr;
    }

    public void setBaseDiscPr(BigDecimal baseDiscPr) {
        this.baseDiscPr = baseDiscPr;
    }

    public Integer getCreateTS() {
        return createTS;
    }

    public void setCreateTS(Integer createTS) {
        this.createTS = createTS;
    }

    public Integer getUpdateTS() {
        return updateTS;
    }

    public void setUpdateTS(Integer updateTS) {
        this.updateTS = updateTS;
    }

    public Character getSrvTaxRule() {
        return srvTaxRule;
    }

    public void setSrvTaxRule(Character srvTaxRule) {
        this.srvTaxRule = srvTaxRule;
    }

    public Integer getAnnInvDecR() {
        return annInvDecR;
    }

    public void setAnnInvDecR(Integer annInvDecR) {
        this.annInvDecR = annInvDecR;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public Integer getReleaser() {
        return releaser;
    }

    public void setReleaser(Integer releaser) {
        this.releaser = releaser;
    }

    public Integer getReceiver() {
        return receiver;
    }

    public void setReceiver(Integer receiver) {
        this.receiver = receiver;
    }

    public String getToWhsCode() {
        return toWhsCode;
    }

    public void setToWhsCode(String toWhsCode) {
        this.toWhsCode = toWhsCode;
    }

    public Date getAssetDate() {
        return assetDate;
    }

    public void setAssetDate(Date assetDate) {
        this.assetDate = assetDate;
    }

    public String getRequester() {
        return requester;
    }

    public void setRequester(String requester) {
        this.requester = requester;
    }

    public String getReqName() {
        return reqName;
    }

    public void setReqName(String reqName) {
        this.reqName = reqName;
    }

    public Short getBranch() {
        return branch;
    }

    public void setBranch(Short branch) {
        this.branch = branch;
    }

    public Short getDepartment() {
        return department;
    }

    public void setDepartment(Short department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Character getNotify() {
        return notify;
    }

    public void setNotify(Character notify) {
        this.notify = notify;
    }

    public Integer getReqType() {
        return reqType;
    }

    public void setReqType(Integer reqType) {
        this.reqType = reqType;
    }

    public Character getOriginType() {
        return originType;
    }

    public void setOriginType(Character originType) {
        this.originType = originType;
    }

    public Character getIsReuseNum() {
        return isReuseNum;
    }

    public void setIsReuseNum(Character isReuseNum) {
        this.isReuseNum = isReuseNum;
    }

    public Character getIsReuseNFN() {
        return isReuseNFN;
    }

    public void setIsReuseNFN(Character isReuseNFN) {
        this.isReuseNFN = isReuseNFN;
    }

    public Character getDocDlvry() {
        return docDlvry;
    }

    public void setDocDlvry(Character docDlvry) {
        this.docDlvry = docDlvry;
    }

    public BigDecimal getPaidDpm() {
        return paidDpm;
    }

    public void setPaidDpm(BigDecimal paidDpm) {
        this.paidDpm = paidDpm;
    }

    public BigDecimal getPaidDpmF() {
        return paidDpmF;
    }

    public void setPaidDpmF(BigDecimal paidDpmF) {
        this.paidDpmF = paidDpmF;
    }

    public BigDecimal getPaidDpmS() {
        return paidDpmS;
    }

    public void setPaidDpmS(BigDecimal paidDpmS) {
        this.paidDpmS = paidDpmS;
    }

    public Integer getEnvTypeNFe() {
        return envTypeNFe;
    }

    public void setEnvTypeNFe(Integer envTypeNFe) {
        this.envTypeNFe = envTypeNFe;
    }

    public Integer getAgrNo() {
        return agrNo;
    }

    public void setAgrNo(Integer agrNo) {
        this.agrNo = agrNo;
    }

    public Character getIsAlt() {
        return isAlt;
    }

    public void setIsAlt(Character isAlt) {
        this.isAlt = isAlt;
    }

    public Integer getAltBaseTyp() {
        return altBaseTyp;
    }

    public void setAltBaseTyp(Integer altBaseTyp) {
        this.altBaseTyp = altBaseTyp;
    }

    public Integer getAltBaseEnt() {
        return altBaseEnt;
    }

    public void setAltBaseEnt(Integer altBaseEnt) {
        this.altBaseEnt = altBaseEnt;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public Date getStDlvDate() {
        return stDlvDate;
    }

    public void setStDlvDate(Date stDlvDate) {
        this.stDlvDate = stDlvDate;
    }

    public Integer getStDlvTime() {
        return stDlvTime;
    }

    public void setStDlvTime(Integer stDlvTime) {
        this.stDlvTime = stDlvTime;
    }

    public Date getEndDlvDate() {
        return endDlvDate;
    }

    public void setEndDlvDate(Date endDlvDate) {
        this.endDlvDate = endDlvDate;
    }

    public Integer getEndDlvTime() {
        return endDlvTime;
    }

    public void setEndDlvTime(Integer endDlvTime) {
        this.endDlvTime = endDlvTime;
    }

    public String getVclPlate() {
        return vclPlate;
    }

    public void setVclPlate(String vclPlate) {
        this.vclPlate = vclPlate;
    }

    public String getElCoStatus() {
        return elCoStatus;
    }

    public void setElCoStatus(String elCoStatus) {
        this.elCoStatus = elCoStatus;
    }

    public String getAtDocType() {
        return atDocType;
    }

    public void setAtDocType(String atDocType) {
        this.atDocType = atDocType;
    }

    public String getElCoMsg() {
        return elCoMsg;
    }

    public void setElCoMsg(String elCoMsg) {
        this.elCoMsg = elCoMsg;
    }

    public Character getPrintSEPA() {
        return printSEPA;
    }

    public void setPrintSEPA(Character printSEPA) {
        this.printSEPA = printSEPA;
    }

    public BigDecimal getFreeChrg() {
        return freeChrg;
    }

    public void setFreeChrg(BigDecimal freeChrg) {
        this.freeChrg = freeChrg;
    }

    public BigDecimal getFreeChrgFC() {
        return freeChrgFC;
    }

    public void setFreeChrgFC(BigDecimal freeChrgFC) {
        this.freeChrgFC = freeChrgFC;
    }

    public BigDecimal getFreeChrgSC() {
        return freeChrgSC;
    }

    public void setFreeChrgSC(BigDecimal freeChrgSC) {
        this.freeChrgSC = freeChrgSC;
    }

    public BigDecimal getNfeValue() {
        return nfeValue;
    }

    public void setNfeValue(BigDecimal nfeValue) {
        this.nfeValue = nfeValue;
    }

    public String getFiscDocNum() {
        return fiscDocNum;
    }

    public void setFiscDocNum(String fiscDocNum) {
        this.fiscDocNum = fiscDocNum;
    }

    public Integer getRelatedTyp() {
        return relatedTyp;
    }

    public void setRelatedTyp(Integer relatedTyp) {
        this.relatedTyp = relatedTyp;
    }

    public Integer getRelatedEnt() {
        return relatedEnt;
    }

    public void setRelatedEnt(Integer relatedEnt) {
        this.relatedEnt = relatedEnt;
    }

    public Integer getcCDEntry() {
        return cCDEntry;
    }

    public void setcCDEntry(Integer cCDEntry) {
        this.cCDEntry = cCDEntry;
    }

    public Integer getNfePrntFo() {
        return nfePrntFo;
    }

    public void setNfePrntFo(Integer nfePrntFo) {
        this.nfePrntFo = nfePrntFo;
    }

    public Integer getZrdAbs() {
        return zrdAbs;
    }

    public void setZrdAbs(Integer zrdAbs) {
        this.zrdAbs = zrdAbs;
    }

    public Integer getpOSRcptNo() {
        return pOSRcptNo;
    }

    public void setpOSRcptNo(Integer pOSRcptNo) {
        this.pOSRcptNo = pOSRcptNo;
    }

    public BigDecimal getFoCTax() {
        return foCTax;
    }

    public void setFoCTax(BigDecimal foCTax) {
        this.foCTax = foCTax;
    }

    public BigDecimal getFoCTaxFC() {
        return foCTaxFC;
    }

    public void setFoCTaxFC(BigDecimal foCTaxFC) {
        this.foCTaxFC = foCTaxFC;
    }

    public BigDecimal getFoCTaxSC() {
        return foCTaxSC;
    }

    public void setFoCTaxSC(BigDecimal foCTaxSC) {
        this.foCTaxSC = foCTaxSC;
    }

    public Integer getTpCusPres() {
        return tpCusPres;
    }

    public void setTpCusPres(Integer tpCusPres) {
        this.tpCusPres = tpCusPres;
    }

    public Date getExcDocDate() {
        return excDocDate;
    }

    public void setExcDocDate(Date excDocDate) {
        this.excDocDate = excDocDate;
    }

    public Character getuAutorret() {
        return uAutorret;
    }

    public void setuAutorret(Character uAutorret) {
        this.uAutorret = uAutorret;
    }

    public String getuBpcost() {
        return uBpcost;
    }

    public void setuBpcost(String uBpcost) {
        this.uBpcost = uBpcost;
    }

    public String getuWuid() {
        return uWuid;
    }

    public void setuWuid(String uWuid) {
        this.uWuid = uWuid;
    }

    public Character getuTipoNota() {
        return uTipoNota;
    }

    public void setuTipoNota(Character uTipoNota) {
        this.uTipoNota = uTipoNota;
    }

    public Character getuRetefue() {
        return uRetefue;
    }

    public void setuRetefue(Character uRetefue) {
        this.uRetefue = uRetefue;
    }

    public Character getuReteIca() {
        return uReteIca;
    }

    public void setuReteIca(Character uReteIca) {
        this.uReteIca = uReteIca;
    }

    public Character getuOk1Ivapa() {
        return uOk1Ivapa;
    }

    public void setuOk1Ivapa(Character uOk1Ivapa) {
        this.uOk1Ivapa = uOk1Ivapa;
    }

    public Character getuOk1Ifrs() {
        return uOk1Ifrs;
    }

    public void setuOk1Ifrs(Character uOk1Ifrs) {
        this.uOk1Ifrs = uOk1Ifrs;
    }

    public String getuDiseno() {
        return uDiseno;
    }

    public void setuDiseno(String uDiseno) {
        this.uDiseno = uDiseno;
    }

    public String getUdiseno2() {
        return udiseno2;
    }

    public void setUdiseno2(String udiseno2) {
        this.udiseno2 = udiseno2;
    }

    public Integer getUcomdeco1() {
        return ucomdeco1;
    }

    public void setUcomdeco1(Integer ucomdeco1) {
        this.ucomdeco1 = ucomdeco1;
    }

    public Integer getUcomdeco2() {
        return ucomdeco2;
    }

    public void setUcomdeco2(Integer ucomdeco2) {
        this.ucomdeco2 = ucomdeco2;
    }

    public String getuVendedor1() {
        return uVendedor1;
    }

    public void setuVendedor1(String uVendedor1) {
        this.uVendedor1 = uVendedor1;
    }

    public String getuVendedor2() {
        return uVendedor2;
    }

    public void setuVendedor2(String uVendedor2) {
        this.uVendedor2 = uVendedor2;
    }

    public String getuVendedor3() {
        return uVendedor3;
    }

    public void setuVendedor3(String uVendedor3) {
        this.uVendedor3 = uVendedor3;
    }

    public String getuVendedor4() {
        return uVendedor4;
    }

    public void setuVendedor4(String uVendedor4) {
        this.uVendedor4 = uVendedor4;
    }

    public String getuVendedor5() {
        return uVendedor5;
    }

    public void setuVendedor5(String uVendedor5) {
        this.uVendedor5 = uVendedor5;
    }

    public Integer getuFactor() {
        return uFactor;
    }

    public void setuFactor(Integer uFactor) {
        this.uFactor = uFactor;
    }

    public String getuNWRPicS() {
        return uNWRPicS;
    }

    public void setuNWRPicS(String uNWRPicS) {
        this.uNWRPicS = uNWRPicS;
    }

    public String getuNWRBRet() {
        return uNWRBRet;
    }

    public void setuNWRBRet(String uNWRBRet) {
        this.uNWRBRet = uNWRBRet;
    }

    public Short getUnwrPAut() {
        return unwrPAut;
    }

    public void setUnwrPAut(Short unwrPAut) {
        this.unwrPAut = unwrPAut;
    }

    public String getUnwrNote() {
        return unwrNote;
    }

    public void setUnwrNote(String unwrNote) {
        this.unwrNote = unwrNote;
    }

    public String getUnwrTag() {
        return unwrTag;
    }

    public void setUnwrTag(String unwrTag) {
        this.unwrTag = unwrTag;
    }

    public BigDecimal getUnwrFrgt() {
        return unwrFrgt;
    }

    public void setUnwrFrgt(BigDecimal unwrFrgt) {
        this.unwrFrgt = unwrFrgt;
    }

    public String getuNwrNorm() {
        return uNwrNorm;
    }

    public void setuNwrNorm(String uNwrNorm) {
        this.uNwrNorm = uNwrNorm;
    }

    public String getuTypeExped() {
        return uTypeExped;
    }

    public void setuTypeExped(String uTypeExped) {
        this.uTypeExped = uTypeExped;
    }

    public String getuCreaNC() {
        return uCreaNC;
    }

    public void setuCreaNC(String uCreaNC) {
        this.uCreaNC = uCreaNC;
    }

    public String getuNumFact() {
        return uNumFact;
    }

    public void setuNumFact(String uNumFact) {
        this.uNumFact = uNumFact;
    }

    public String getuAprobado() {
        return uAprobado;
    }

    public void setuAprobado(String uAprobado) {
        this.uAprobado = uAprobado;
    }

    public String getuComVend1() {
        return uComVend1;
    }

    public void setuComVend1(String uComVend1) {
        this.uComVend1 = uComVend1;
    }

    public String getuComVend2() {
        return uComVend2;
    }

    public void setuComVend2(String uComVend2) {
        this.uComVend2 = uComVend2;
    }

    public String getuComVend3() {
        return uComVend3;
    }

    public void setuComVend3(String uComVend3) {
        this.uComVend3 = uComVend3;
    }

    public String getuComVend4() {
        return uComVend4;
    }

    public void setuComVend4(String uComVend4) {
        this.uComVend4 = uComVend4;
    }

    public String getuComVend5() {
        return uComVend5;
    }

    public void setuComVend5(String uComVend5) {
        this.uComVend5 = uComVend5;
    }

    public Character getuActCosto() {
        return uActCosto;
    }

    public void setuActCosto(Character uActCosto) {
        this.uActCosto = uActCosto;
    }

    public Integer getuDocEntryLeg() {
        return uDocEntryLeg;
    }

    public void setuDocEntryLeg(Integer uDocEntryLeg) {
        this.uDocEntryLeg = uDocEntryLeg;
    }

    public String getUidLineLeg() {
        return uidLineLeg;
    }

    public void setUidLineLeg(String uidLineLeg) {
        this.uidLineLeg = uidLineLeg;
    }

    public Integer getUserieLeg() {
        return userieLeg;
    }

    public void setUserieLeg(Integer userieLeg) {
        this.userieLeg = userieLeg;
    }

    public Character getuEsIndep() {
        return uEsIndep;
    }

    public void setuEsIndep(Character uEsIndep) {
        this.uEsIndep = uEsIndep;
    }

    public String getUfirma() {
        return ufirma;
    }

    public void setUfirma(String ufirma) {
        this.ufirma = ufirma;
    }

    public String getUcedula() {
        return ucedula;
    }

    public void setUcedula(String ucedula) {
        this.ucedula = ucedula;
    }

    public String getuCatRet() {
        return uCatRet;
    }

    public void setuCatRet(String uCatRet) {
        this.uCatRet = uCatRet;
    }

    public List<DetalleDevolucionSAP> getDetalle() {
        return detalle;
    }

    public void setDetalle(List<DetalleDevolucionSAP> detalle) {
        this.detalle = detalle;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (docEntry != null ? docEntry.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DevolucionSAP)) {
            return false;
        }
        DevolucionSAP other = (DevolucionSAP) object;
        if ((this.docEntry == null && other.docEntry != null) || (this.docEntry != null && !this.docEntry.equals(other.docEntry))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.matisses.sap.entity.DevolucionSAP[ docEntry=" + docEntry + " ]";
    }
}
