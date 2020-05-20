// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcCostResource;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcExternalReferenceRelationship;
import com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcDate;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcMeasureWithUnit;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcText;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;
import java.util.Set;

@Guid("878e7c12-556c-42e6-a62a-feef9a77b4f9")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcCostValue.class, name = "IfcCostValue"))
public class IfcAppliedValue implements com.buildingsmart.tech.ifc.IfcConstraintResource.IfcMetricValueSelect, com.buildingsmart.tech.ifc.IfcPropertyResource.IfcObjectReferenceSelect, com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceObjectSelect
{
	@Description("A name or additional clarification given to a cost value.")
	@DataMember(Order = 0)
	@Guid("f1f7e181-7ab7-42ee-8419-312a8e441f5e")
	@JacksonXmlProperty(isAttribute=false, localName = "name")
	private IfcLabel name;

	@Description("The description that may apply additional information about a cost value.")
	@DataMember(Order = 1)
	@Guid("aca5297a-4f05-4828-a377-84262bd54980")
	@JacksonXmlProperty(isAttribute=false, localName = "description")
	private IfcText description;

	@Description("The extent or quantity or amount of an applied value.")
	@DataMember(Order = 2)
	@Guid("f569f893-d02e-4d0c-b8aa-eada1af92d01")
	@JacksonXmlProperty(isAttribute=true, localName = "appliedValue")
	private IfcAppliedValueSelect appliedValue;

	@Description("The number and unit of measure on which the unit cost is based.    Note: As well as the normally expected units of measure such as length, area, volume etc., costs may be based on units of measure which need to be defined e.g. sack, drum, pallet, item etc. Unit costs may be based on quantities greater (or lesser) than a unitary value of the basis measure. For instance, timber may have a unit cost rate per X meters where X > 1; similarly for cable, piping and many other items. The basis number may be either an integer or a real value.    Note: This attribute should be asserted for all circumstances where the cost to be applied is per unit quantity. It may be asserted even for circumstances where an item price is used, in which case the unit cost basis should be by item (or equivalent definition).")
	@DataMember(Order = 3)
	@Guid("e93a6586-03c9-491a-b750-61a192bc3068")
	@JacksonXmlProperty(isAttribute=false, localName = "unitBasis")
	private IfcMeasureWithUnit unitBasis;

	@Description("The date on or from which an applied value is applicable.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE Type changed from IfcDateTimeSelect.</blockquote>")
	@DataMember(Order = 4)
	@Guid("607a3336-5a2c-4366-a5a4-4ecde56ea7f9")
	@JacksonXmlProperty(isAttribute=false, localName = "applicableDate")
	private IfcDate applicableDate;

	@Description("The date until which applied value is applicable.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE Type changed from IfcDateTimeSelect.</blockquote>")
	@DataMember(Order = 5)
	@Guid("44cc2615-38d3-4a6e-a478-efc5cbd2cefa")
	@JacksonXmlProperty(isAttribute=false, localName = "fixedUntilDate")
	private IfcDate fixedUntilDate;

	@Description("Specification of the type of cost used.    <blockquote class=\"note\">NOTE&nbsp; There are many possible types of cost value that may be identified. Whilst there is a broad understanding of the meaning of names that may be assigned to different types of costs, there is no general standard for naming cost types nor are there any broadly defined classifications. To allow for any type of cost value, the <i>IfcLabel</i> datatype is assigned.</blockquote>     In the absence of any well defined standard, it is recommended that local agreements should be made to define allowable and understandable cost value types within a project or region.")
	@DataMember(Order = 6)
	@Guid("1d4e4998-3ebe-4e3c-b6b0-11ac5c1adf89")
	@JacksonXmlProperty(isAttribute=false, localName = "category")
	private IfcLabel category;

	@Description("The condition under which a cost value applies.      For example, within the context of a bid submission, this may refer to an option that may or may not be elected.")
	@DataMember(Order = 7)
	@Guid("9ce0493d-c35a-4110-9bfc-895871328d4e")
	@JacksonXmlProperty(isAttribute=false, localName = "condition")
	private IfcLabel condition;

	@Description("The arithmetic operator applied to component values.")
	@DataMember(Order = 8)
	@Guid("013ba33b-dca3-439e-b21f-103713eb82f8")
	@JacksonXmlProperty(isAttribute=true, localName = "arithmeticOperator")
	private IfcArithmeticOperatorEnum arithmeticOperator;

	@Description("Optional component values from which <i>AppliedValue</i> is calculated.")
	@DataMember(Order = 9)
	@Guid("8a17c585-267a-48a6-9598-35c3c8393e76")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcAppliedValue")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "components")
	private List<IfcAppliedValue> components;

	@Description("Reference to an external reference, e.g. library, classification, or document information, that is associated to the IfcAppliedValue.   <blockquote class=\"change-ifc2x4\">IFC4 CHANGE New inverse attribute.</blockquote>")
	@InverseProperty(InverseProp = "relatedResourceObjects", Range = "IfcExternalReferenceRelationship")
	@Guid("fa44a5a5-d30c-49f6-bfee-252224ac5db6")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcExternalReferenceRelationship")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "hasExternalReference")
	private Set<IfcExternalReferenceRelationship> hasExternalReference;


	public IfcAppliedValue()
	{
	}

	public IfcLabel getName() {
		return this.name;
	}

	public void setName(IfcLabel name) {
		this.name = name;
	}

	public IfcText getDescription() {
		return this.description;
	}

	public void setDescription(IfcText description) {
		this.description = description;
	}

	public IfcAppliedValueSelect getAppliedValue() {
		return this.appliedValue;
	}

	public void setAppliedValue(IfcAppliedValueSelect appliedValue) {
		this.appliedValue = appliedValue;
	}

	public IfcMeasureWithUnit getUnitBasis() {
		return this.unitBasis;
	}

	public void setUnitBasis(IfcMeasureWithUnit unitBasis) {
		this.unitBasis = unitBasis;
	}

	public IfcDate getApplicableDate() {
		return this.applicableDate;
	}

	public void setApplicableDate(IfcDate applicableDate) {
		this.applicableDate = applicableDate;
	}

	public IfcDate getFixedUntilDate() {
		return this.fixedUntilDate;
	}

	public void setFixedUntilDate(IfcDate fixedUntilDate) {
		this.fixedUntilDate = fixedUntilDate;
	}

	public IfcLabel getCategory() {
		return this.category;
	}

	public void setCategory(IfcLabel category) {
		this.category = category;
	}

	public IfcLabel getCondition() {
		return this.condition;
	}

	public void setCondition(IfcLabel condition) {
		this.condition = condition;
	}

	public IfcArithmeticOperatorEnum getArithmeticOperator() {
		return this.arithmeticOperator;
	}

	public void setArithmeticOperator(IfcArithmeticOperatorEnum arithmeticOperator) {
		this.arithmeticOperator = arithmeticOperator;
	}

	public List<IfcAppliedValue> getComponents() {
		return this.components;
	}

	public Set<IfcExternalReferenceRelationship> getHasExternalReference() {
		return this.hasExternalReference;
	}


}

