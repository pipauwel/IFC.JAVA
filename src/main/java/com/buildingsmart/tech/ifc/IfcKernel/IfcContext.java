// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcUnitAssignment;
import com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcRepresentationContext;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Set;

@Guid("2ef4dae0-8e0d-4c3e-a179-bf7d2f279492")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcProject.class, name = "IfcProject"), @JsonSubTypes.Type(value = IfcProjectLibrary.class, name = "IfcProjectLibrary")})
public abstract class IfcContext extends IfcObjectDefinition
{
	@Description("The object type denotes a particular type that indicates the object further. The use has to be established at the level of instantiable subtypes.   <blockquote class=\"note\">  NOTE&nbsp; Subtypes of <em>IfcContext</em> do not introduce a <em>PredefinedType</em> attribute, therefore the usage of <em>ObjectType</em> is not bound to the selection of USERDEFINED within the <em>PredefinedType</em> enumaration.  </blockquote>")
	@DataMember(Order = 0)
	@Guid("bb969c4a-579c-4aa1-be1f-9fb4bd873fad")
	@JacksonXmlProperty(isAttribute=false, localName = "objectType")
	private IfcLabel objectType;

	@Description("Long name for the context as used for reference purposes.")
	@DataMember(Order = 1)
	@Guid("14b49397-1ce3-4799-8ead-ec46f5364256")
	@JacksonXmlProperty(isAttribute=false, localName = "longName")
	private IfcLabel longName;

	@Description("Current project phase, or life-cycle phase of this project. Applicable values have to be agreed upon by view definitions or implementer agreements.")
	@DataMember(Order = 2)
	@Guid("2f21a5c2-8ff3-40c7-9331-101a0cca4c61")
	@JacksonXmlProperty(isAttribute=false, localName = "phase")
	private IfcLabel phase;

	@Description("Context of the representations used within the context. When the context is a project and it includes shape representations for its components, one or several geometric representation contexts need to be included that define e.g. the world coordinate system, the coordinate space dimensions, and/or the precision factor.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute has been changed to be optional. Change made with upward compatibility for file based exchange.</blockquote>")
	@DataMember(Order = 3)
	@Guid("e9ef241b-a738-4ab4-b2cd-7041784d5749")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcRepresentationContext")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "representationContexts")
	private Set<IfcRepresentationContext> representationContexts;

	@Description("Units globally assigned to measure types used within the context.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute has been changed to be optional. Change made with upward compatibility for file based exchange.</blockquote>")
	@DataMember(Order = 4)
	@Guid("59787a75-222f-48ec-a8d6-73733cf7c004")
	@JacksonXmlProperty(isAttribute=false, localName = "unitsInContext")
	private IfcUnitAssignment unitsInContext;

	@Description("Set of relationships to property set definitions attached to this context. Those statically or dynamically defined properties contain alphanumeric information content that further defines the context.   <blockquote class=\"change-ifc2x4\">  IFC4 CHANGE&nbsp; The data type has been changed from <em>IfcRelDefines</em> to <em>IfcRelDefinesByProperties</em> with upward compatibility for file based exchange.  </blockquote>")
	@InverseProperty(InverseProp = "relatedObjects", Range = "IfcRelDefinesByProperties")
	@Guid("7e8b25d6-0e9c-4e04-bc16-e08eea08f8ec")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcRelDefinesByProperties")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "isDefinedBy")
	private Set<IfcRelDefinesByProperties> isDefinedBy;

	@Description("Reference to the <em>IfcRelDeclares</em> relationship that assigns the uppermost entities of includes hierarchies to this context instance.  <blockquote class=\"note\">NOTE&nbsp; The spatial hiearchy is assigned to <em>IfcProject</em> using the <em>IfcRelAggregates</em> relationship. This is a single exception due to compatibility reasons with earlier releases.</blockquote>")
	@InverseProperty(InverseProp = "relatingContext", Range = "IfcRelDeclares")
	@Guid("cd34747d-186f-4fe1-9267-19625144c9e6")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcRelDeclares")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "declares")
	private Set<IfcRelDeclares> declares;


	public IfcContext()
	{
	}

	public IfcContext(String globalId)
	{
		super(globalId);
	}

	public IfcLabel getObjectType() {
		return this.objectType;
	}

	public void setObjectType(IfcLabel objectType) {
		this.objectType = objectType;
	}

	public IfcLabel getLongName() {
		return this.longName;
	}

	public void setLongName(IfcLabel longName) {
		this.longName = longName;
	}

	public IfcLabel getPhase() {
		return this.phase;
	}

	public void setPhase(IfcLabel phase) {
		this.phase = phase;
	}

	public Set<IfcRepresentationContext> getRepresentationContexts() {
		return this.representationContexts;
	}

	public IfcUnitAssignment getUnitsInContext() {
		return this.unitsInContext;
	}

	public void setUnitsInContext(IfcUnitAssignment unitsInContext) {
		this.unitsInContext = unitsInContext;
	}

	public Set<IfcRelDefinesByProperties> getIsDefinedBy() {
		return this.isDefinedBy;
	}

	public Set<IfcRelDeclares> getDeclares() {
		return this.declares;
	}


}

