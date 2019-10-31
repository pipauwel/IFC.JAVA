// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedFacilitiesElements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcCostResource.*;
import com.buildingsmart.tech.ifc.IfcActorResource.*;
import com.buildingsmart.tech.ifc.IfcKernel.IfcGroup;

@Guid("e1ef998e-9c7f-4969-9371-b17f2cb38f14")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcAsset extends com.buildingsmart.tech.ifc.IfcKernel.IfcGroup
{
	@Description("A unique identification assigned to an asset that enables its differentiation from other assets.  <blockquote class=\"note\">NOTE&nbsp; The asset identifier is unique within the asset register. It differs from the globally unique id assigned to the instance of an entity populating a database.</blockquote>")
	@Guid("a895f5bf-79c8-4a70-aac0-62ab5c5c23c9")
	@JacksonXmlProperty(isAttribute=true, localName = "Identification")
	private String identification;

	@Description("The cost value of the asset at the time of purchase.")
	@Guid("a71d0d19-98f1-45a6-b969-987c11871490")
	@JacksonXmlProperty(isAttribute=false, localName = "OriginalValue")
	private IfcCostValue originalValue;

	@Description("The current cost value of the asset.")
	@Guid("20597429-b166-489f-a555-6871d7823028")
	@JacksonXmlProperty(isAttribute=false, localName = "CurrentValue")
	private IfcCostValue currentValue;

	@Description("The total cost of replacement of the asset.")
	@Guid("e3041417-cdab-498d-b22e-23d72641b6dc")
	@JacksonXmlProperty(isAttribute=false, localName = "TotalReplacementCost")
	private IfcCostValue totalReplacementCost;

	@Description("The name of the person or organization that 'owns' the asset.")
	@Guid("1806a557-2b88-40fb-bde4-033918957e73")
	@JacksonXmlProperty(isAttribute=true, localName = "Owner")
	private IfcActorSelect owner;

	@Description("The name of the person or organization that 'uses' the asset.")
	@Guid("15065989-6bb5-469b-b866-bb7f6b13e835")
	@JacksonXmlProperty(isAttribute=true, localName = "User")
	private IfcActorSelect user;

	@Description("The person designated to be responsible for the asset.  <blockquote class=\"note\">NOTE&nbsp; In some regulations (for example, UK Health and Safety at Work Act, Electricity at Work Regulations), management of assets must have a person identified as being responsible and to whom regulatory, insurance and other organizations communicate. In places where there is not a legal requirement, the responsible person would be the asset manager but would not have a legal status.</blockquote>")
	@Guid("e9346cf1-5817-44f0-a5c8-81c1cd269a96")
	@JacksonXmlProperty(isAttribute=false, localName = "ResponsiblePerson")
	private IfcPerson responsiblePerson;

	@Description("The date on which an asset was incorporated into the works, installed, constructed, erected or completed.  <blockquote class=\"note\">NOTE&nbsp; This is the date on which an asset is considered to start depreciating.</blockquote>  <blockquote class=\"history\">IFC4 CHANGE&nbsp; Type changed from IfcDateTimeSelect.</blockquote>")
	@Guid("f0e297f7-a0bb-4cc4-8035-b24e8703ddac")
	@JacksonXmlProperty(isAttribute=true, localName = "IncorporationDate")
	private String incorporationDate;

	@Description("The current value of an asset within the accounting rules and procedures of an organization.")
	@Guid("5660c0e1-c55b-44c7-b6c2-a63fbaa28609")
	@JacksonXmlProperty(isAttribute=false, localName = "DepreciatedValue")
	private IfcCostValue depreciatedValue;


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

	public String getIncorporationDate() {
		return this.incorporationDate;
	}

	public void setIncorporationDate(String incorporationDate) {
		this.incorporationDate = incorporationDate;
	}

	public IfcCostValue getDepreciatedValue() {
		return this.depreciatedValue;
	}

	public void setDepreciatedValue(IfcCostValue depreciatedValue) {
		this.depreciatedValue = depreciatedValue;
	}


}

