// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcIdentifier;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Set;

@Guid("1d05673d-0b58-4733-862e-d6626abd1efb")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcTypeProcess.class, name = "IfcTypeProcess"), @JsonSubTypes.Type(value = IfcTypeProduct.class, name = "IfcTypeProduct"), @JsonSubTypes.Type(value = IfcTypeResource.class, name = "IfcTypeResource")})
public class IfcTypeObject extends IfcObjectDefinition
{
	@Description("The attribute optionally defines the data type of the occurrence object, to which the assigned type object can relate. If not present, no instruction is given to which occurrence object the type object is applicable. The following conventions are used:  <ul>    <li>The IFC entity name of the applicable occurrence using the IFC naming convention, CamelCase with IFC prefix</li>    <li>It can be optionally followed by the predefined type after the separator \"/\" (forward slash), using uppercase</li>    <li>If one type object is applicable to many occurrence objects, then those occurrence object names should be separate by comma \",\" forming a comma separated string.  </ul>  <blockquote class=\"example\">    EXAMPLE  Refering to a furniture as applicable occurrence entity would be expressed as 'IfcFurnishingElement', refering to a brace as applicable entity would be expressed as 'IfcMember/BRACE', refering to a wall and wall standard case would be expressed as 'IfcWall, IfcWallStandardCase'.  </blockquote>")
	@DataMember(Order = 0)
	@Guid("e324aef5-b4aa-4e62-86f1-0c332beee624")
	@JacksonXmlProperty(isAttribute=false, localName = "applicableOccurrence")
	private IfcIdentifier applicableOccurrence;

	@Description("Set <strike>list</strike> of unique property sets, that are associated with the object type and are common to all object occurrences referring to this object type.  <blockquote class=\"change-ifc2x3\">IFC2x3 CHANGE&nbsp; The attribute aggregate type has been changed from LIST to SET.</blockquote>")
	@DataMember(Order = 1)
	@Guid("2513ab6d-af8f-4320-b951-1ce016a15208")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcPropertySetDefinition")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "hasPropertySets")
	private Set<IfcPropertySetDefinition> hasPropertySets;

	@Description("Reference to the relationship IfcRelDefinedByType and thus to those occurrence objects, which are defined by this type.")
	@InverseProperty(InverseProp = "relatingType", Range = "IfcRelDefinesByType")
	@Guid("b9f6a3c9-d5d6-4a7a-8d44-116f467fda32")
	@MaxLength(1)
	/*@JacksonXmlProperty(isAttribute = false, localName = "IfcRelDefinesByType")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "types")*/
	@JsonIgnore
	private Set<IfcRelDefinesByType> types;


	public IfcTypeObject()
	{
	}

	public IfcTypeObject(String globalId)
	{
		super(globalId);
	}

	public IfcIdentifier getApplicableOccurrence() {
		return this.applicableOccurrence;
	}

	public void setApplicableOccurrence(IfcIdentifier applicableOccurrence) {
		this.applicableOccurrence = applicableOccurrence;
	}

	public Set<IfcPropertySetDefinition> getHasPropertySets() {
		return this.hasPropertySets;
	}

	public Set<IfcRelDefinesByType> getTypes() {
		return this.types;
	}


}

