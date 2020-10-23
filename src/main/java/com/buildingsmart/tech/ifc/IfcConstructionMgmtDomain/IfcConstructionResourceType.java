// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcConstructionMgmtDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.ifc.IfcCostResource.IfcAppliedValue;
import com.buildingsmart.tech.ifc.IfcQuantityResource.IfcPhysicalQuantity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

@Guid("c642ffe1-4447-43e7-935a-fa0b8f9420ed")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcConstructionEquipmentResourceType.class, name = "IfcConstructionEquipmentResourceType"), @JsonSubTypes.Type(value = IfcConstructionMaterialResourceType.class, name = "IfcConstructionMaterialResourceType"), @JsonSubTypes.Type(value = IfcConstructionProductResourceType.class, name = "IfcConstructionProductResourceType"), @JsonSubTypes.Type(value = IfcCrewResourceType.class, name = "IfcCrewResourceType"), @JsonSubTypes.Type(value = IfcLaborResourceType.class, name = "IfcLaborResourceType"), @JsonSubTypes.Type(value = IfcSubContractResourceType.class, name = "IfcSubContractResourceType")})
public abstract class IfcConstructionResourceType extends com.buildingsmart.tech.ifc.IfcKernel.IfcTypeResource
{
	@Description("Indicates the unit costs and environmental impacts for which accrued amounts should be calculated.  Such unit costs may be split into <em>Name</em> designations (e.g. 'Standard', 'Overtime'), and may contain a hierarchy of cost values that apply at different dates (using <em>IfcCostValue.ApplicableDate</em> and <em>IfcCostValue.FixedUntilDate</em>).    <p></p>")
	@DataMember(Order = 0)
	@Guid("fab31804-3e6a-456a-bae2-2138c73e4b1f")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcAppliedValue")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "baseCosts")
	private List<IfcAppliedValue> baseCosts;

	@Description("Identifies the quantity for which the <em>BaseQuantityProduced</em> applies.  The <em>Name</em> of the <em>IfcPhysicalQuantity</em> identifies the quantity definition being measured, e.g. \"GrossVolume\".  For production-based resources (e.g. carpentry labor), this value refers to quantities on <em>IfcProduct</em>(s) to which the assigned <em>IfcTask</em> is assigned.  For duration-based resources (e.g. safety inspector, fuel for equipment), this value refers to quantities that may be assigned to occurrences of the assigned <em>IfcTaskType</em>.    <p></p>")
	@DataMember(Order = 1)
	@Guid("e52f14a1-d244-46eb-8c1f-d7685c63d749")
	@JacksonXmlProperty(isAttribute=false, localName = "baseQuantity")
	private IfcPhysicalQuantity baseQuantity;


	public IfcConstructionResourceType()
	{
	}

	public IfcConstructionResourceType(String globalId)
	{
		super(globalId);
	}

	public List<IfcAppliedValue> getBaseCosts() {
		return this.baseCosts;
	}

	public IfcPhysicalQuantity getBaseQuantity() {
		return this.baseQuantity;
	}

	public void setBaseQuantity(IfcPhysicalQuantity baseQuantity) {
		this.baseQuantity = baseQuantity;
	}


}

