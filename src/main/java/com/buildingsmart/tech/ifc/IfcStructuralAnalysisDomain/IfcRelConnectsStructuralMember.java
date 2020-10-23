// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcAxis2Placement3D;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLengthMeasure;
import com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcBoundaryCondition;
import com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcStructuralConnectionCondition;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("a3f65142-e263-40a0-a199-116ed79dd647")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcRelConnectsWithEccentricity.class, name = "IfcRelConnectsWithEccentricity"))
public class IfcRelConnectsStructuralMember extends com.buildingsmart.tech.ifc.IfcKernel.IfcRelConnects
{
	@Description("Reference to an instance of IfcStructuralMember (or its subclasses) which is connected to the specified structural connection.")
	@DataMember(Order = 0)
	@Required()
	@Guid("29dc8e83-1a71-402e-a494-06876f1f1bae")
	@JacksonXmlProperty(isAttribute=false, localName = "relatingStructuralMember")
	private IfcStructuralMember relatingStructuralMember;

	@Description("Reference to an instance of IfcStructuralConnection (or its subclasses) which is connected to the specified structural member.")
	@DataMember(Order = 1)
	@Required()
	@Guid("1303e4ee-2a6a-4635-899a-6f5f6d8e392c")
	@JacksonXmlProperty(isAttribute=false, localName = "relatedStructuralConnection")
	private IfcStructuralConnection relatedStructuralConnection;

	@Description("Conditions which define the connections properties.  Connection conditions are often called &quot;release&quot; but are not only used to define mechanisms like hinges but also rigid, elastic, and other conditions.")
	@DataMember(Order = 2)
	@Guid("3425bba1-6c03-4452-ad27-7f2e007714cd")
	@JacksonXmlProperty(isAttribute=false, localName = "appliedCondition")
	private IfcBoundaryCondition appliedCondition;

	@Description("Describes additional connection properties.")
	@DataMember(Order = 3)
	@Guid("ea1f2763-53b0-4484-886d-5941951ce053")
	@JacksonXmlProperty(isAttribute=false, localName = "additionalConditions")
	private IfcStructuralConnectionCondition additionalConditions;

	@Description("Defines the 'supported length' of this structural connection. See Fig. for more detail.")
	@DataMember(Order = 4)
	@Guid("15d0e2e1-462a-4cb4-8425-9aeac6fdd59d")
	@JacksonXmlProperty(isAttribute=false, localName = "supportedLength")
	private IfcLengthMeasure supportedLength;

	@Description("Defines a coordinate system used for the description of the connection properties in <em>ConnectionCondition</em> relative to the local coordinate system of <em>RelatingStructuralMember</em>.  If left unspecified, the placement <em>IfcAxis2Placement3D</em>((x,y,z), ?, ?) is implied with x,y,z being the local member coordinates where the connection is made and the default axes directions being in parallel with the local axes of <em>RelatingStructuralMember</em>.")
	@DataMember(Order = 5)
	@Guid("4d84ca74-7ceb-4d98-bea7-c5f06d1b43d1")
	@JacksonXmlProperty(isAttribute=false, localName = "conditionCoordinateSystem")
	private IfcAxis2Placement3D conditionCoordinateSystem;


	public IfcRelConnectsStructuralMember()
	{
	}

	public IfcRelConnectsStructuralMember(String globalId, IfcStructuralMember relatingStructuralMember, IfcStructuralConnection relatedStructuralConnection)
	{
		super(globalId);
		this.relatingStructuralMember = relatingStructuralMember;
		this.relatedStructuralConnection = relatedStructuralConnection;
	}

	public IfcStructuralMember getRelatingStructuralMember() {
		return this.relatingStructuralMember;
	}

	public void setRelatingStructuralMember(IfcStructuralMember relatingStructuralMember) {
		this.relatingStructuralMember = relatingStructuralMember;
	}

	public IfcStructuralConnection getRelatedStructuralConnection() {
		return this.relatedStructuralConnection;
	}

	public void setRelatedStructuralConnection(IfcStructuralConnection relatedStructuralConnection) {
		this.relatedStructuralConnection = relatedStructuralConnection;
	}

	public IfcBoundaryCondition getAppliedCondition() {
		return this.appliedCondition;
	}

	public void setAppliedCondition(IfcBoundaryCondition appliedCondition) {
		this.appliedCondition = appliedCondition;
	}

	public IfcStructuralConnectionCondition getAdditionalConditions() {
		return this.additionalConditions;
	}

	public void setAdditionalConditions(IfcStructuralConnectionCondition additionalConditions) {
		this.additionalConditions = additionalConditions;
	}

	public IfcLengthMeasure getSupportedLength() {
		return this.supportedLength;
	}

	public void setSupportedLength(IfcLengthMeasure supportedLength) {
		this.supportedLength = supportedLength;
	}

	public IfcAxis2Placement3D getConditionCoordinateSystem() {
		return this.conditionCoordinateSystem;
	}

	public void setConditionCoordinateSystem(IfcAxis2Placement3D conditionCoordinateSystem) {
		this.conditionCoordinateSystem = conditionCoordinateSystem;
	}


}

