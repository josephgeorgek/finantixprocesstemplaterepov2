package com.myspace.onboarding;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ApprovalDocument implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("ID or Password")
	private java.lang.Boolean idPass;
	@org.kie.api.definition.type.Label("Birth Certificate")
	private java.lang.Boolean birth_cert;
	@org.kie.api.definition.type.Label("Basic Info")
	private java.lang.Boolean info;

	@org.kie.api.definition.type.Label("AccountType")
	private java.lang.String accountType;

	@org.kie.api.definition.type.Label("Role")
	private java.lang.String role;

	@org.kie.api.definition.type.Label("Domicile")
	private java.lang.String domicile;

	@org.kie.api.definition.type.Label("Proof Of Residence")
	private java.lang.Boolean proofOfResidence;

	private java.lang.String birthCert_url;

	private java.lang.String info_url;

	private java.lang.String idPass_url;

	private java.lang.String proofOfResidence_url;

	@org.kie.api.definition.type.Label("firstName")
	private java.lang.String firstName;

	@org.kie.api.definition.type.Label("lastName")
	private java.lang.String lastName;

	@org.kie.api.definition.type.Label("reviewid")
	private java.lang.String reviewid;

	@org.kie.api.definition.type.Label("link")
	private java.lang.String link;

	@org.kie.api.definition.type.Label("riskInfo")
	private java.lang.String riskInfo;

	@org.kie.api.definition.type.Label("isNew")
	private java.lang.Boolean isNew;

	@org.kie.api.definition.type.Label(value = "id")
	private java.lang.String id;

	public ApprovalDocument() {
	}

	public java.lang.Boolean getIdPass() {
		return this.idPass;
	}

	public void setIdPass(java.lang.Boolean idPass) {
		this.idPass = idPass;
	}

	public java.lang.Boolean getBirth_cert() {
		return this.birth_cert;
	}

	public void setBirth_cert(java.lang.Boolean birth_cert) {
		this.birth_cert = birth_cert;
	}

	public java.lang.Boolean getInfo() {
		return this.info;
	}

	public void setInfo(java.lang.Boolean info) {
		this.info = info;
	}

	public java.lang.String getAccountType() {
		return this.accountType;
	}

	public void setAccountType(java.lang.String accountType) {
		this.accountType = accountType;
	}

	public java.lang.String getRole() {
		return this.role;
	}

	public void setRole(java.lang.String role) {
		this.role = role;
	}

	public java.lang.String getDomicile() {
		return this.domicile;
	}

	public void setDomicile(java.lang.String domicile) {
		this.domicile = domicile;
	}

	public java.lang.Boolean getProofOfResidence() {
		return this.proofOfResidence;
	}

	public void setProofOfResidence(java.lang.Boolean proofOfResidence) {
		this.proofOfResidence = proofOfResidence;
	}

	public java.lang.String getBirthCert_url() {
		return this.birthCert_url;
	}

	public void setBirthCert_url(java.lang.String birthCert_url) {
		this.birthCert_url = birthCert_url;
	}

	public java.lang.String getInfo_url() {
		return this.info_url;
	}

	public void setInfo_url(java.lang.String info_url) {
		this.info_url = info_url;
	}

	public java.lang.String getIdPass_url() {
		return this.idPass_url;
	}

	public void setIdPass_url(java.lang.String idPass_url) {
		this.idPass_url = idPass_url;
	}

	public java.lang.String getProofOfResidence_url() {
		return this.proofOfResidence_url;
	}

	public void setProofOfResidence_url(java.lang.String proofOfResidence_url) {
		this.proofOfResidence_url = proofOfResidence_url;
	}

	public java.lang.String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(java.lang.String firstName) {
		this.firstName = firstName;
	}

	public java.lang.String getLastName() {
		return this.lastName;
	}

	public void setLastName(java.lang.String lastName) {
		this.lastName = lastName;
	}

	public java.lang.String getReviewid() {
		return this.reviewid;
	}

	public void setReviewid(java.lang.String reviewid) {
		this.reviewid = reviewid;
	}

	public java.lang.String getLink() {
		return this.link;
	}

	public void setLink(java.lang.String link) {
		this.link = link;
	}

	public java.lang.String getRiskInfo() {
		return this.riskInfo;
	}

	public void setRiskInfo(java.lang.String riskInfo) {
		this.riskInfo = riskInfo;
	}

	public java.lang.Boolean getIsNew() {
		return this.isNew;
	}

	public void setIsNew(java.lang.Boolean isNew) {
		this.isNew = isNew;
	}

	public java.lang.String getId() {
		return this.id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}

	public ApprovalDocument(java.lang.Boolean idPass,
			java.lang.Boolean birth_cert, java.lang.Boolean info,
			java.lang.String accountType, java.lang.String role,
			java.lang.String domicile, java.lang.Boolean proofOfResidence,
			java.lang.String birthCert_url, java.lang.String info_url,
			java.lang.String idPass_url, java.lang.String proofOfResidence_url,
			java.lang.String firstName, java.lang.String lastName,
			java.lang.String reviewid, java.lang.String link,
			java.lang.String riskInfo, java.lang.Boolean isNew,
			java.lang.String id) {
		this.idPass = idPass;
		this.birth_cert = birth_cert;
		this.info = info;
		this.accountType = accountType;
		this.role = role;
		this.domicile = domicile;
		this.proofOfResidence = proofOfResidence;
		this.birthCert_url = birthCert_url;
		this.info_url = info_url;
		this.idPass_url = idPass_url;
		this.proofOfResidence_url = proofOfResidence_url;
		this.firstName = firstName;
		this.lastName = lastName;
		this.reviewid = reviewid;
		this.link = link;
		this.riskInfo = riskInfo;
		this.isNew = isNew;
		this.id = id;
	}

}