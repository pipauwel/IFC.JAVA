// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.InverseProperty;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcSystem;
import com.buildingsmart.tech.ifc.IfcSharedFacilitiesElements.IfcAsset;
import com.buildingsmart.tech.ifc.IfcSharedFacilitiesElements.IfcInventory;
import com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralLoadGroup;
import com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralResultGroup;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Set;

@Guid("e991a118-741e-4598-a023-d9ad58f0f717")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcAsset.class, name = "IfcAsset"), @JsonSubTypes.Type(value = IfcInventory.class, name = "IfcInventory"), @JsonSubTypes.Type(value = IfcStructuralLoadGroup.class, name = "IfcStructuralLoadGroup"), @JsonSubTypes.Type(value = IfcStructuralResultGroup.class, name = "IfcStructuralResultGroup"), @JsonSubTypes.Type(value = IfcSystem.class, name = "IfcSystem")})
public class IfcGroup extends IfcObject
{
	@Description("Reference to the relationship <em>IfcRelAssignsToGroup</em> that assigns the one to many group members to the <em>IfcGroup</em> object.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The cardinality has been changed from 1..1 to 0..? in order to allow the exchange of a group concept without having already group members assigned. It now also allows the use of many instances of <em>IfcRelAssignsToGroup</em> to assign the group members. The change has been done with upward compatibility for file based exchange.</blockquote>")
	@InverseProperty(InverseProp = "relatingGroup", Range = "IfcRelAssignsToGroup")
	@Guid("d62fb122-4977-4bdd-9663-ff15e288c506")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcRelAssignsToGroup")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "isGroupedBy")
	private Set<IfcRelAssignsToGroup> isGroupedBy;


	public IfcGroup()
	{
	}

	public IfcGroup(String globalId)
	{
		super(globalId);
	}

	public Set<IfcRelAssignsToGroup> getIsGroupedBy() {
		return this.isGroupedBy;
	}


}

