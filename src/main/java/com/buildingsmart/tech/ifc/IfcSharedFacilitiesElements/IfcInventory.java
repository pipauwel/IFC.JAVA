// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedFacilitiesElements;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.ifc.IfcActorResource.IfcActorSelect;
import com.buildingsmart.tech.ifc.IfcActorResource.IfcPerson;
import com.buildingsmart.tech.ifc.IfcCostResource.IfcCostValue;
import com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcDate;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Set;

@Guid("73471cd5-1296-4091-bcc3-f7f5e32ff3de")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcInventory extends com.buildingsmart.tech.ifc.IfcKernel.IfcGroup
{
	@Description("A list of the types of inventories from which that required may be selected.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE Attribute made optional.</blockquote>")
	@DataMember(Order = 0)
	@Guid("8dedffaa-456f-48c2-a583-e63978378160")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcInventoryTypeEnum predefinedType;

	@Description("The organizational unit to which the inventory is applicable.")
	@DataMember(Order = 1)
	@Guid("6f479fad-d27e-4644-876a-6711e2ff021c")
	@JacksonXmlProperty(isAttribute=true, localName = "jurisdiction")
	private IfcActorSelect jurisdiction;

	@Description("Persons who are responsible for the inventory.")
	@DataMember(Order = 2)
	@Guid("d23c5d1f-1727-46f3-968f-018a51799fa6")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcPerson")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "responsiblePersons")
	private Set<IfcPerson> responsiblePersons;

	@Description("<p>The date on which the last update of the inventory was carried out.</p>  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE Type changed from IfcDateTimeSelect.</blockquote>")
	@DataMember(Order = 3)
	@Guid("fe41de34-a4d1-4bcb-ab62-89f0068aaf9c")
	@JacksonXmlProperty(isAttribute=false, localName = "lastUpdateDate")
	private IfcDate lastUpdateDate;

	@Description("An estimate of the current cost value of the inventory.")
	@DataMember(Order = 4)
	@Guid("264bcae7-f4a5-4147-9961-fc38405ff8b6")
	@JacksonXmlProperty(isAttribute=false, localName = "currentValue")
	private IfcCostValue currentValue;

	@Description("An estimate of the original cost value of the inventory.")
	@DataMember(Order = 5)
	@Guid("412fe95f-936f-4dde-a82c-f8e9f305b952")
	@JacksonXmlProperty(isAttribute=false, localName = "originalValue")
	private IfcCostValue originalValue;


	public IfcInventory()
	{
	}

	public IfcInventory(String globalId)
	{
		super(globalId);
	}

	public IfcInventoryTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcInventoryTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}

	public IfcActorSelect getJurisdiction() {
		return this.jurisdiction;
	}

	public void setJurisdiction(IfcActorSelect jurisdiction) {
		this.jurisdiction = jurisdiction;
	}

	public Set<IfcPerson> getResponsiblePersons() {
		return this.responsiblePersons;
	}

	public IfcDate getLastUpdateDate() {
		return this.lastUpdateDate;
	}

	public void setLastUpdateDate(IfcDate lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public IfcCostValue getCurrentValue() {
		return this.currentValue;
	}

	public void setCurrentValue(IfcCostValue currentValue) {
		this.currentValue = currentValue;
	}

	public IfcCostValue getOriginalValue() {
		return this.originalValue;
	}

	public void setOriginalValue(IfcCostValue originalValue) {
		this.originalValue = originalValue;
	}


}

