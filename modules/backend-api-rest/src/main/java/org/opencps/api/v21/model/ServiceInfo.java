//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.20 at 03:42:52 PM ICT 
//


package org.opencps.api.v21.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="serviceName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="processText">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="methodText">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dossierText">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="conditionText">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="durationText">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="applicantText">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="resultText">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="regularText">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="feeText">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="administrationCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="administrationName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="domainCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="domainName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="maxLevel" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element ref="{}fileTemplates"/>
 *         &lt;element ref="{}configs"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "serviceCode",
    "serviceName",
    "processText",
    "methodText",
    "dossierText",
    "conditionText",
    "durationText",
    "applicantText",
    "resultText",
    "regularText",
    "feeText",
    "administrationCode",
    "administrationName",
    "domainCode",
    "domainName",
    "maxLevel",
    "fileTemplates",
    "configs"
})
@XmlRootElement(name = "ServiceInfo")
public class ServiceInfo {

    @XmlElement(required = true)
    protected String serviceCode;
    @XmlElement(required = true)
    protected String serviceName;
    @XmlElement(required = true)
    protected String processText;
    @XmlElement(required = true)
    protected String methodText;
    @XmlElement(required = true)
    protected String dossierText;
    @XmlElement(required = true)
    protected String conditionText;
    @XmlElement(required = true)
    protected String durationText;
    @XmlElement(required = true)
    protected String applicantText;
    @XmlElement(required = true)
    protected String resultText;
    @XmlElement(required = true)
    protected String regularText;
    @XmlElement(required = true)
    protected String feeText;
    @XmlElement(required = true)
    protected String administrationCode;
    @XmlElement(required = true)
    protected String administrationName;
    @XmlElement(required = true)
    protected String domainCode;
    @XmlElement(required = true)
    protected String domainName;
    protected Integer maxLevel;
    @XmlElement(required = true)
    protected FileTemplates fileTemplates;
    @XmlElement(required = true)
    protected Configs configs;

    /**
     * Gets the value of the serviceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * Sets the value of the serviceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCode(String value) {
        this.serviceCode = value;
    }

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the processText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessText() {
        return processText;
    }

    /**
     * Sets the value of the processText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessText(String value) {
        this.processText = value;
    }

    /**
     * Gets the value of the methodText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethodText() {
        return methodText;
    }

    /**
     * Sets the value of the methodText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethodText(String value) {
        this.methodText = value;
    }

    /**
     * Gets the value of the dossierText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDossierText() {
        return dossierText;
    }

    /**
     * Sets the value of the dossierText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDossierText(String value) {
        this.dossierText = value;
    }

    /**
     * Gets the value of the conditionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionText() {
        return conditionText;
    }

    /**
     * Sets the value of the conditionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionText(String value) {
        this.conditionText = value;
    }

    /**
     * Gets the value of the durationText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurationText() {
        return durationText;
    }

    /**
     * Sets the value of the durationText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurationText(String value) {
        this.durationText = value;
    }

    /**
     * Gets the value of the applicantText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicantText() {
        return applicantText;
    }

    /**
     * Sets the value of the applicantText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicantText(String value) {
        this.applicantText = value;
    }

    /**
     * Gets the value of the resultText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultText() {
        return resultText;
    }

    /**
     * Sets the value of the resultText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultText(String value) {
        this.resultText = value;
    }

    /**
     * Gets the value of the regularText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegularText() {
        return regularText;
    }

    /**
     * Sets the value of the regularText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegularText(String value) {
        this.regularText = value;
    }

    /**
     * Gets the value of the feeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeText() {
        return feeText;
    }

    /**
     * Sets the value of the feeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeText(String value) {
        this.feeText = value;
    }

    /**
     * Gets the value of the administrationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdministrationCode() {
        return administrationCode;
    }

    /**
     * Sets the value of the administrationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdministrationCode(String value) {
        this.administrationCode = value;
    }

    /**
     * Gets the value of the administrationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdministrationName() {
        return administrationName;
    }

    /**
     * Sets the value of the administrationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdministrationName(String value) {
        this.administrationName = value;
    }

    /**
     * Gets the value of the domainCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainCode() {
        return domainCode;
    }

    /**
     * Sets the value of the domainCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainCode(String value) {
        this.domainCode = value;
    }

    /**
     * Gets the value of the domainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * Sets the value of the domainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainName(String value) {
        this.domainName = value;
    }

    /**
     * Gets the value of the maxLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxLevel() {
        return maxLevel;
    }

    /**
     * Sets the value of the maxLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxLevel(Integer value) {
        this.maxLevel = value;
    }

    /**
     * Gets the value of the fileTemplates property.
     * 
     * @return
     *     possible object is
     *     {@link FileTemplates }
     *     
     */
    public FileTemplates getFileTemplates() {
        return fileTemplates;
    }

    /**
     * Sets the value of the fileTemplates property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileTemplates }
     *     
     */
    public void setFileTemplates(FileTemplates value) {
        this.fileTemplates = value;
    }

    /**
     * Gets the value of the configs property.
     * 
     * @return
     *     possible object is
     *     {@link Configs }
     *     
     */
    public Configs getConfigs() {
        return configs;
    }

    /**
     * Sets the value of the configs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Configs }
     *     
     */
    public void setConfigs(Configs value) {
        this.configs = value;
    }

}
