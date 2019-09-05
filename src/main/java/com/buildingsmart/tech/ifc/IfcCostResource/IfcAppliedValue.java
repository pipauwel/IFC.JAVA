// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcCostResource;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("878e7c12-556c-42e6-a62a-feef9a77b4f9")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcAppliedValue implements com.buildingsmart.tech.ifc.IfcConstraintResource.IfcMetricValueSelect, com.buildingsmart.tech.ifc.IfcPropertyResource.IfcObjectReferenceSelect, com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceObjectSelect
{
	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	@Description("A name or additional clarification given to a cost value.")
	@Guid("f1f7e181-7ab7-42ee-8419-312a8e441f5e")
	private String name;

	@JacksonXmlProperty(isAttribute=true, localName = "Description")
	@Description("The description that may apply additional information about a cost value.")
	@Guid("aca5297a-4f05-4828-a377-84262bd54980")
	private String description;

	@Description("The extent or quantity or amount of an applied value.")
	@Guid("f569f893-d02e-4d0c-b8aa-eada1af92d01")
	private com.buildingsmart.tech.ifc.IfcCostResource.IfcAppliedValueSelect appliedValue;

	@JacksonXmlProperty(isAttribute=false, localName = "UnitBasis")
	@Description("The number and unit of measure on which the unit cost is based.    Note: As well as the normally expected units of measure such as length, area, volume etc., costs may be based on units of measure which need to be defined e.g. sack, drum, pallet, item etc. Unit costs may be based on quantities greater (or lesser) than a unitary value of the basis measure. For instance, timber may have a unit cost rate per X meters where X > 1; similarly for cable, piping and many other items. The basis number may be either an integer or a real value.    Note: This attribute should be asserted for all circumstances where the cost to be applied is per unit quantity. It may be asserted even for circumstances where an item price is used, in which case the unit cost basis should be by item (or equivalent definition).")
	@Guid("e93a6586-03c9-491a-b750-61a192bc3068")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcMeasureWithUnit unitBasis;

	@JacksonXmlProperty(isAttribute=true, localName = "ApplicableDate")
	@Description("The date on or from which an applied value is applicable.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE Type changed from IfcDateTimeSelect.</blockquote>")
	@Guid("607a3336-5a2c-4366-a5a4-4ecde56ea7f9")
	private String applicableDate;

	@JacksonXmlProperty(isAttribute=true, localName = "FixedUntilDate")
	@Description("The date until which applied value is applicable.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE Type changed from IfcDateTimeSelect.</blockquote>")
	@Guid("44cc2615-38d3-4a6e-a478-efc5cbd2cefa")
	private String fixedUntilDate;

	@JacksonXmlProperty(isAttribute=true, localName = "Category")
	@Description("Specification of the type of cost used.    <blockquote class=\"note\">NOTE&nbsp; There are many possible types of cost value that may be identified. Whilst there is a broad understanding of the meaning of names that may be assigned to different types of costs, there is no general standard for naming cost types nor are there any broadly defined classifications. To allow for any type of cost value, the <i>IfcLabel</i> datatype is assigned.</blockquote>     In the absence of any well defined standard, it is recommended that local agreements should be made to define allowable and understandable cost value types within a project or region.")
	@Guid("1d4e4998-3ebe-4e3c-b6b0-11ac5c1adf89")
	private String category;

	@JacksonXmlProperty(isAttribute=true, localName = "Condition")
	@Description("The condition under which a cost value applies.      For example, within the context of a bid submission, this may refer to an option that may or may not be elected.")
	@Guid("9ce0493d-c35a-4110-9bfc-895871328d4e")
	private String condition;

	@JacksonXmlProperty(isAttribute=true, localName = "ArithmeticOperator")
	@Description("The arithmetic operator applied to component values.")
	@Guid("013ba33b-dca3-439e-b21f-103713eb82f8")
	private com.buildingsmart.tech.ifc.IfcCostResource.IfcArithmeticOperatorEnum arithmeticOperator;

	@Description("Optional component values from which <i>AppliedValue</i> is calculated.")
	@MinLength(1)
	@Guid("8a17c585-267a-48a6-9598-35c3c8393e76")
	private List<com.buildingsmart.tech.ifc.IfcCostResource.IfcAppliedValue> components = new ArrayList<com.buildingsmart.tech.ifc.IfcCostResource.IfcAppliedValue>();

	@Description("Reference to an external reference, e.g. library, classification, or document information, that is associated to the IfcAppliedValue.   <blockquote class=\"change-ifc2x4\">IFC4 CHANGE New inverse attribute.</blockquote>")
	@Guid("fa44a5a5-d30c-49f6-bfee-252224ac5db6")
	private Set<com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcExternalReferenceRelationship> hasExternalReference = new HashSet<com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcExternalReferenceRelationship>();


	public IfcAppliedValue()
	{
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public com.buildingsmart.tech.ifc.IfcCostResource.IfcAppliedValueSelect getAppliedValue() {
		return this.appliedValue;
	}

	public void setAppliedValue(com.buildingsmart.tech.ifc.IfcCostResource.IfcAppliedValueSelect appliedValue) {
		this.appliedValue = appliedValue;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcMeasureWithUnit getUnitBasis() {
		return this.unitBasis;
	}

	public void setUnitBasis(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcMeasureWithUnit unitBasis) {
		this.unitBasis = unitBasis;
	}

	public String getApplicableDate() {
		return this.applicableDate;
	}

	public void setApplicableDate(String applicableDate) {
		this.applicableDate = applicableDate;
	}

	public String getFixedUntilDate() {
		return this.fixedUntilDate;
	}

	public void setFixedUntilDate(String fixedUntilDate) {
		this.fixedUntilDate = fixedUntilDate;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCondition() {
		return this.condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public com.buildingsmart.tech.ifc.IfcCostResource.IfcArithmeticOperatorEnum getArithmeticOperator() {
		return this.arithmeticOperator;
	}

	public void setArithmeticOperator(com.buildingsmart.tech.ifc.IfcCostResource.IfcArithmeticOperatorEnum arithmeticOperator) {
		this.arithmeticOperator = arithmeticOperator;
	}

	public List<com.buildingsmart.tech.ifc.IfcCostResource.IfcAppliedValue> getComponents() {
		return this.components;
	}

	public Set<com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcExternalReferenceRelationship> getHasExternalReference() {
		return this.hasExternalReference;
	}


}

