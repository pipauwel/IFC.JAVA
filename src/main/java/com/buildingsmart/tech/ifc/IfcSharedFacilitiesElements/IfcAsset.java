// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedFacilitiesElements;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("e1ef998e-9c7f-4969-9371-b17f2cb38f14")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcAsset extends com.buildingsmart.tech.ifc.IfcKernel.IfcGroup
{
	@JacksonXmlProperty(isAttribute=true, localName = "Identification")
	@Description("A unique identification assigned to an asset that enables its differentiation from other assets.  <blockquote class=\"note\">NOTE&nbsp; The asset identifier is unique within the asset register. It differs from the globally unique id assigned to the instance of an entity populating a database.</blockquote>")
	@Guid("a895f5bf-79c8-4a70-aac0-62ab5c5c23c9")
	private String identification;

	@JacksonXmlProperty(isAttribute=false, localName = "OriginalValue")
	@Description("The cost value of the asset at the time of purchase.")
	@Guid("a71d0d19-98f1-45a6-b969-987c11871490")
	private com.buildingsmart.tech.ifc.IfcCostResource.IfcCostValue originalValue;

	@JacksonXmlProperty(isAttribute=false, localName = "CurrentValue")
	@Description("The current cost value of the asset.")
	@Guid("20597429-b166-489f-a555-6871d7823028")
	private com.buildingsmart.tech.ifc.IfcCostResource.IfcCostValue currentValue;

	@JacksonXmlProperty(isAttribute=false, localName = "TotalReplacementCost")
	@Description("The total cost of replacement of the asset.")
	@Guid("e3041417-cdab-498d-b22e-23d72641b6dc")
	private com.buildingsmart.tech.ifc.IfcCostResource.IfcCostValue totalReplacementCost;

	@Description("The name of the person or organization that 'owns' the asset.")
	@Guid("1806a557-2b88-40fb-bde4-033918957e73")
	private com.buildingsmart.tech.ifc.IfcActorResource.IfcActorSelect owner;

	@Description("The name of the person or organization that 'uses' the asset.")
	@Guid("15065989-6bb5-469b-b866-bb7f6b13e835")
	private com.buildingsmart.tech.ifc.IfcActorResource.IfcActorSelect user;

	@JacksonXmlProperty(isAttribute=false, localName = "ResponsiblePerson")
	@Description("The person designated to be responsible for the asset.  <blockquote class=\"note\">NOTE&nbsp; In some regulations (for example, UK Health and Safety at Work Act, Electricity at Work Regulations), management of assets must have a person identified as being responsible and to whom regulatory, insurance and other organizations communicate. In places where there is not a legal requirement, the responsible person would be the asset manager but would not have a legal status.</blockquote>")
	@Guid("e9346cf1-5817-44f0-a5c8-81c1cd269a96")
	private com.buildingsmart.tech.ifc.IfcActorResource.IfcPerson responsiblePerson;

	@JacksonXmlProperty(isAttribute=true, localName = "IncorporationDate")
	@Description("The date on which an asset was incorporated into the works, installed, constructed, erected or completed.  <blockquote class=\"note\">NOTE&nbsp; This is the date on which an asset is considered to start depreciating.</blockquote>  <blockquote class=\"history\">IFC4 CHANGE&nbsp; Type changed from IfcDateTimeSelect.</blockquote>")
	@Guid("f0e297f7-a0bb-4cc4-8035-b24e8703ddac")
	private String incorporationDate;

	@JacksonXmlProperty(isAttribute=false, localName = "DepreciatedValue")
	@Description("The current value of an asset within the accounting rules and procedures of an organization.")
	@Guid("5660c0e1-c55b-44c7-b6c2-a63fbaa28609")
	private com.buildingsmart.tech.ifc.IfcCostResource.IfcCostValue depreciatedValue;


	public IfcAsset()
	{
	}

	public IfcAsset(String globalId)
	{
		super(globalId);
	}

	public String getIdentification() {
		return this.identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public com.buildingsmart.tech.ifc.IfcCostResource.IfcCostValue getOriginalValue() {
		return this.originalValue;
	}

	public void setOriginalValue(com.buildingsmart.tech.ifc.IfcCostResource.IfcCostValue originalValue) {
		this.originalValue = originalValue;
	}

	public com.buildingsmart.tech.ifc.IfcCostResource.IfcCostValue getCurrentValue() {
		return this.currentValue;
	}

	public void setCurrentValue(com.buildingsmart.tech.ifc.IfcCostResource.IfcCostValue currentValue) {
		this.currentValue = currentValue;
	}

	public com.buildingsmart.tech.ifc.IfcCostResource.IfcCostValue getTotalReplacementCost() {
		return this.totalReplacementCost;
	}

	public void setTotalReplacementCost(com.buildingsmart.tech.ifc.IfcCostResource.IfcCostValue totalReplacementCost) {
		this.totalReplacementCost = totalReplacementCost;
	}

	public com.buildingsmart.tech.ifc.IfcActorResource.IfcActorSelect getOwner() {
		return this.owner;
	}

	public void setOwner(com.buildingsmart.tech.ifc.IfcActorResource.IfcActorSelect owner) {
		this.owner = owner;
	}

	public com.buildingsmart.tech.ifc.IfcActorResource.IfcActorSelect getUser() {
		return this.user;
	}

	public void setUser(com.buildingsmart.tech.ifc.IfcActorResource.IfcActorSelect user) {
		this.user = user;
	}

	public com.buildingsmart.tech.ifc.IfcActorResource.IfcPerson getResponsiblePerson() {
		return this.responsiblePerson;
	}

	public void setResponsiblePerson(com.buildingsmart.tech.ifc.IfcActorResource.IfcPerson responsiblePerson) {
		this.responsiblePerson = responsiblePerson;
	}

	public String getIncorporationDate() {
		return this.incorporationDate;
	}

	public void setIncorporationDate(String incorporationDate) {
		this.incorporationDate = incorporationDate;
	}

	public com.buildingsmart.tech.ifc.IfcCostResource.IfcCostValue getDepreciatedValue() {
		return this.depreciatedValue;
	}

	public void setDepreciatedValue(com.buildingsmart.tech.ifc.IfcCostResource.IfcCostValue depreciatedValue) {
		this.depreciatedValue = depreciatedValue;
	}


}

