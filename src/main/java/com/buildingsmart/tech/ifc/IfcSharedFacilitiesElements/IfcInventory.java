// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedFacilitiesElements;

import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("73471cd5-1296-4091-bcc3-f7f5e32ff3de")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcInventory extends com.buildingsmart.tech.ifc.IfcKernel.IfcGroup
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Description("A list of the types of inventories from which that required may be selected.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE Attribute made optional.</blockquote>")
	@Guid("8dedffaa-456f-48c2-a583-e63978378160")
	private com.buildingsmart.tech.ifc.IfcSharedFacilitiesElements.IfcInventoryTypeEnum predefinedType;

	@Description("The organizational unit to which the inventory is applicable.")
	@Guid("6f479fad-d27e-4644-876a-6711e2ff021c")
	private com.buildingsmart.tech.ifc.IfcActorResource.IfcActorSelect jurisdiction;

	@Description("Persons who are responsible for the inventory.")
	@MinLength(1)
	@Guid("d23c5d1f-1727-46f3-968f-018a51799fa6")
	private Set<com.buildingsmart.tech.ifc.IfcActorResource.IfcPerson> responsiblePersons = new HashSet<com.buildingsmart.tech.ifc.IfcActorResource.IfcPerson>();

	@JacksonXmlProperty(isAttribute=true, localName = "LastUpdateDate")
	@Description("<p>The date on which the last update of the inventory was carried out.</p>  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE Type changed from IfcDateTimeSelect.</blockquote>")
	@Guid("fe41de34-a4d1-4bcb-ab62-89f0068aaf9c")
	private String lastUpdateDate;

	@JacksonXmlProperty(isAttribute=false, localName = "CurrentValue")
	@Description("An estimate of the current cost value of the inventory.")
	@Guid("264bcae7-f4a5-4147-9961-fc38405ff8b6")
	private com.buildingsmart.tech.ifc.IfcCostResource.IfcCostValue currentValue;

	@JacksonXmlProperty(isAttribute=false, localName = "OriginalValue")
	@Description("An estimate of the original cost value of the inventory.")
	@Guid("412fe95f-936f-4dde-a82c-f8e9f305b952")
	private com.buildingsmart.tech.ifc.IfcCostResource.IfcCostValue originalValue;


	public IfcInventory()
	{
	}

	public IfcInventory(String globalId)
	{
		super(globalId);
	}

	public com.buildingsmart.tech.ifc.IfcSharedFacilitiesElements.IfcInventoryTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcSharedFacilitiesElements.IfcInventoryTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}

	public com.buildingsmart.tech.ifc.IfcActorResource.IfcActorSelect getJurisdiction() {
		return this.jurisdiction;
	}

	public void setJurisdiction(com.buildingsmart.tech.ifc.IfcActorResource.IfcActorSelect jurisdiction) {
		this.jurisdiction = jurisdiction;
	}

	public Set<com.buildingsmart.tech.ifc.IfcActorResource.IfcPerson> getResponsiblePersons() {
		return this.responsiblePersons;
	}

	public String getLastUpdateDate() {
		return this.lastUpdateDate;
	}

	public void setLastUpdateDate(String lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public com.buildingsmart.tech.ifc.IfcCostResource.IfcCostValue getCurrentValue() {
		return this.currentValue;
	}

	public void setCurrentValue(com.buildingsmart.tech.ifc.IfcCostResource.IfcCostValue currentValue) {
		this.currentValue = currentValue;
	}

	public com.buildingsmart.tech.ifc.IfcCostResource.IfcCostValue getOriginalValue() {
		return this.originalValue;
	}

	public void setOriginalValue(com.buildingsmart.tech.ifc.IfcCostResource.IfcCostValue originalValue) {
		this.originalValue = originalValue;
	}


}

