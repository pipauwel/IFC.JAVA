// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedBldgElements;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("644f260a-0347-4e6a-84b2-be14f6c42b87")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcDoorType extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcBuildingElementType
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Description("Identifies the predefined types of a door element from which the type required may be set.")
	@Required()
	@Guid("f36db3f7-2cec-48d9-8e81-6fa01a860509")
	private com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcDoorTypeEnum predefinedType;

	@JacksonXmlProperty(isAttribute=true, localName = "OperationType")
	@Description("Type defining the general layout and operation of the door type in terms of the partitioning of panels and panel operations.")
	@Required()
	@Guid("479b13b8-14cd-4731-b8a1-5d03729e2a42")
	private com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcDoorTypeOperationEnum operationType;

	@JacksonXmlProperty(isAttribute=true, localName = "ParameterTakesPrecedence")
	@Description("The Boolean value reflects, whether the parameter given in the attached lining and panel properties exactly define the geometry (TRUE), or whether the attached style shape take precedence (FALSE). In the last case the parameter have only informative value. If not provided, no such information can be infered.")
	@Guid("1adc3f57-5b13-4887-a1d4-b5788991afd9")
	private Boolean parameterTakesPrecedence;

	@JacksonXmlProperty(isAttribute=true, localName = "UserDefinedOperationType")
	@Description("Designator for the user defined operation type, shall only be provided, if the value of <em>OperationType</em> is set to USERDEFINED.")
	@Guid("8995c9e7-f0e4-4226-afd6-3c8b4dd3a0a0")
	private String userDefinedOperationType;


	public IfcDoorType()
	{
	}

	public IfcDoorType(String globalId, com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcDoorTypeEnum predefinedType, com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcDoorTypeOperationEnum operationType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
		this.operationType = operationType;
	}

	public com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcDoorTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcDoorTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}

	public com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcDoorTypeOperationEnum getOperationType() {
		return this.operationType;
	}

	public void setOperationType(com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcDoorTypeOperationEnum operationType) {
		this.operationType = operationType;
	}

	public Boolean getParameterTakesPrecedence() {
		return this.parameterTakesPrecedence;
	}

	public void setParameterTakesPrecedence(Boolean parameterTakesPrecedence) {
		this.parameterTakesPrecedence = parameterTakesPrecedence;
	}

	public String getUserDefinedOperationType() {
		return this.userDefinedOperationType;
	}

	public void setUserDefinedOperationType(String userDefinedOperationType) {
		this.userDefinedOperationType = userDefinedOperationType;
	}


}

