// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedFacilitiesElements;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcActorResource.IfcActorSelect;
import com.buildingsmart.tech.ifc.IfcActorResource.IfcPerson;
import com.buildingsmart.tech.ifc.IfcCostResource.IfcCostValue;
import com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcDate;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcIdentifier;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("e1ef998e-9c7f-4969-9371-b17f2cb38f14")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcAsset extends com.buildingsmart.tech.ifc.IfcKernel.IfcGroup
{
	@Description("A unique identification assigned to an asset that enables its differentiation from other assets.  <blockquote class=\"note\">NOTE&nbsp; The asset identifier is unique within the asset register. It differs from the globally unique id assigned to the instance of an entity populating a database.</blockquote>")
	@DataMember(Order = 0)
	@Guid("a895f5bf-79c8-4a70-aac0-62ab5c5c23c9")
	@JacksonXmlProperty(isAttribute=false, localName = "identification")
	private IfcIdentifier identification;

	@Description("The cost value of the asset at the time of purchase.")
	@DataMember(Order = 1)
	@Guid("a71d0d19-98f1-45a6-b969-987c11871490")
	@JacksonXmlProperty(isAttribute=false, localName = "originalValue")
	private IfcCostValue originalValue;

	@Description("The current cost value of the asset.")
	@DataMember(Order = 2)
	@Guid("20597429-b166-489f-a555-6871d7823028")
	@JacksonXmlProperty(isAttribute=false, localName = "currentValue")
	private IfcCostValue currentValue;

	@Description("The total cost of replacement of the asset.")
	@DataMember(Order = 3)
	@Guid("e3041417-cdab-498d-b22e-23d72641b6dc")
	@JacksonXmlProperty(isAttribute=false, localName = "totalReplacementCost")
	private IfcCostValue totalReplacementCost;

	@Description("The name of the person or organization that 'owns' the asset.")
	@DataMember(Order = 4)
	@Guid("1806a557-2b88-40fb-bde4-033918957e73")
	@JacksonXmlProperty(isAttribute=true, localName = "owner")
	private IfcActorSelect owner;

	@Description("The name of the person or organization that 'uses' the asset.")
	@DataMember(Order = 5)
	@Guid("15065989-6bb5-469b-b866-bb7f6b13e835")
	@JacksonXmlProperty(isAttribute=true, localName = "user")
	private IfcActorSelect user;

	@Description("The person designated to be responsible for the asset.  <blockquote class=\"note\">NOTE&nbsp; In some regulations (for example, UK Health and Safety at Work Act, Electricity at Work Regulations), management of assets must have a person identified as being responsible and to whom regulatory, insurance and other organizations communicate. In places where there is not a legal requirement, the responsible person would be the asset manager but would not have a legal status.</blockquote>")
	@DataMember(Order = 6)
	@Guid("e9346cf1-5817-44f0-a5c8-81c1cd269a96")
	@JacksonXmlProperty(isAttribute=false, localName = "responsiblePerson")
	private IfcPerson responsiblePerson;

	@Description("The date on which an asset was incorporated into the works, installed, constructed, erected or completed.  <blockquote class=\"note\">NOTE&nbsp; This is the date on which an asset is considered to start depreciating.</blockquote>  <blockquote class=\"history\">IFC4 CHANGE&nbsp; Type changed from IfcDateTimeSelect.</blockquote>")
	@DataMember(Order = 7)
	@Guid("f0e297f7-a0bb-4cc4-8035-b24e8703ddac")
	@JacksonXmlProperty(isAttribute=false, localName = "incorporationDate")
	private IfcDate incorporationDate;

	@Description("The current value of an asset within the accounting rules and procedures of an organization.")
	@DataMember(Order = 8)
	@Guid("5660c0e1-c55b-44c7-b6c2-a63fbaa28609")
	@JacksonXmlProperty(isAttribute=false, localName = "depreciatedValue")
	private IfcCostValue depreciatedValue;


	public IfcAsset()
	{
	}

	public IfcAsset(String globalId)
	{
		super(globalId);
	}

	public IfcIdentifier getIdentification() {
		return this.identification;
	}

	public void setIdentification(IfcIdentifier identification) {
		this.identification = identification;
	}

	public IfcCostValue getOriginalValue() {
		return this.originalValue;
	}

	public void setOriginalValue(IfcCostValue originalValue) {
		this.originalValue = originalValue;
	}

	public IfcCostValue getCurrentValue() {
		return this.currentValue;
	}

	public void setCurrentValue(IfcCostValue currentValue) {
		this.currentValue = currentValue;
	}

	public IfcCostValue getTotalReplacementCost() {
		return this.totalReplacementCost;
	}

	public void setTotalReplacementCost(IfcCostValue totalReplacementCost) {
		this.totalReplacementCost = totalReplacementCost;
	}

	public IfcActorSelect getOwner() {
		return this.owner;
	}

	public void setOwner(IfcActorSelect owner) {
		this.owner = owner;
	}

	public IfcActorSelect getUser() {
		return this.user;
	}

	public void setUser(IfcActorSelect user) {
		this.user = user;
	}

	public IfcPerson getResponsiblePerson() {
		return this.responsiblePerson;
	}

	public void setResponsiblePerson(IfcPerson responsiblePerson) {
		this.responsiblePerson = responsiblePerson;
	}

	public IfcDate getIncorporationDate() {
		return this.incorporationDate;
	}

	public void setIncorporationDate(IfcDate incorporationDate) {
		this.incorporationDate = incorporationDate;
	}

	public IfcCostValue getDepreciatedValue() {
		return this.depreciatedValue;
	}

	public void setDepreciatedValue(IfcCostValue depreciatedValue) {
		this.depreciatedValue = depreciatedValue;
	}


}

