//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.30 at 11:56:43 AM ICT 
//


package org.opencps.api.datatempmgt.model;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="dictItemId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="modifiedDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemNameEN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="level" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sibling" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="treeIndex" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{}ParentItemModel" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}DictGroupTempModel" maxOccurs="unbounded" minOccurs="0"/>
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
    "dictItemId",
    "createDate",
    "modifiedDate",
    "itemCode",
    "itemName",
    "itemNameEN",
    "itemDescription",
    "level",
    "sibling",
    "treeIndex",
    "parentItemModel",
    "dictGroupTempModel"
})
@XmlRootElement(name = "DictItemTempDetailModel")
public class DictItemTempDetailModel {

    protected long dictItemId;
    @XmlElement(required = true)
    protected String createDate;
    @XmlElement(required = true)
    protected String modifiedDate;
    @XmlElement(required = true)
    protected String itemCode;
    @XmlElement(required = true)
    protected String itemName;
    @XmlElement(required = true)
    protected String itemNameEN;
    @XmlElement(required = true)
    protected String itemDescription;
    protected int level;
    protected int sibling;
    @XmlElement(required = true)
    protected String treeIndex;
    @XmlElement(name = "ParentItemModel")
    protected List<ParentItemModel> parentItemModel;
    @XmlElement(name = "DictGroupTempModel")
    protected List<DictGroupTempModel> dictGroupTempModel;

    /**
     * Gets the value of the dictItemId property.
     * 
     */
    public long getDictItemId() {
        return dictItemId;
    }

    /**
     * Sets the value of the dictItemId property.
     * 
     */
    public void setDictItemId(long value) {
        this.dictItemId = value;
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateDate(String value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the modifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedDate() {
        return modifiedDate;
    }

    /**
     * Sets the value of the modifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedDate(String value) {
        this.modifiedDate = value;
    }

    /**
     * Gets the value of the itemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * Sets the value of the itemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemCode(String value) {
        this.itemCode = value;
    }

    /**
     * Gets the value of the itemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * Sets the value of the itemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemName(String value) {
        this.itemName = value;
    }

    /**
     * Gets the value of the itemNameEN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemNameEN() {
        return itemNameEN;
    }

    /**
     * Sets the value of the itemNameEN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemNameEN(String value) {
        this.itemNameEN = value;
    }

    /**
     * Gets the value of the itemDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemDescription() {
        return itemDescription;
    }

    /**
     * Sets the value of the itemDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemDescription(String value) {
        this.itemDescription = value;
    }

    /**
     * Gets the value of the level property.
     * 
     */
    public int getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     */
    public void setLevel(int value) {
        this.level = value;
    }

    /**
     * Gets the value of the sibling property.
     * 
     */
    public int getSibling() {
        return sibling;
    }

    /**
     * Sets the value of the sibling property.
     * 
     */
    public void setSibling(int value) {
        this.sibling = value;
    }

    /**
     * Gets the value of the treeIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTreeIndex() {
        return treeIndex;
    }

    /**
     * Sets the value of the treeIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTreeIndex(String value) {
        this.treeIndex = value;
    }

    /**
     * Gets the value of the parentItemModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parentItemModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParentItemModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParentItemModel }
     * 
     * 
     */
    public List<ParentItemModel> getParentItemModel() {
        if (parentItemModel == null) {
            parentItemModel = new ArrayList<ParentItemModel>();
        }
        return this.parentItemModel;
    }

    /**
     * Gets the value of the dictGroupTempModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dictGroupTempModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDictGroupTempModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DictGroupTempModel }
     * 
     * 
     */
    public List<DictGroupTempModel> getDictGroupTempModel() {
        if (dictGroupTempModel == null) {
            dictGroupTempModel = new ArrayList<DictGroupTempModel>();
        }
        return this.dictGroupTempModel;
    }

}
