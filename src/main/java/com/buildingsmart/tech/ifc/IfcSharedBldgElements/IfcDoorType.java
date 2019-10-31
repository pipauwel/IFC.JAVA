// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedBldgElements;

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
import com.buildingsmart.tech.ifc.IfcSharedBldgElements.*;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcBuildingElementType;
import com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcDoorTypeEnum;
import com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcDoorTypeOperationEnum;

@Guid("644f260a-0347-4e6a-84b2-be14f6c42b87")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcDoorType extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcBuildingElementType
{
	@Description("Identifies the predefined types of a door element from which the type required may be set.")
	@Required()
	@Guid("f36db3f7-2cec-48d9-8e81-6fa01a860509")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcDoorTypeEnum predefinedType;

	@Description("Type defining the general layout and operation of the door type in terms of the partitioning of panels and panel operations.")
	@Required()
	@Guid("479b13b8-14cd-4731-b8a1-5d03729e2a42")
	@JacksonXmlProperty(isAttribute=true, localName = "OperationType")
	private IfcDoorTypeOperationEnum operationType;

	@Description("The Boolean value reflects, whether the parameter given in the attached lining and panel properties exactly define the geometry (TRUE), or whether the attached style shape take precedence (FALSE). In the last case the parameter have only informative value. If not provided, no such information can be infered.")
	@Guid("1adc3f57-5b13-4887-a1d4-b5788991afd9")
	@JacksonXmlProperty(isAttribute=true, localName = "ParameterTakesPrecedence")
	private Boolean parameterTakesPrecedence;

	@Description("Designator for the user defined operation type, shall only be provided, if the value of <em>OperationType</em> is set to USERDEFINED.")
	@Guid("8995c9e7-f0e4-4226-afd6-3c8b4dd3a0a0")
	@JacksonXmlProperty(isAttribute=true, localName = "UserDefinedOperationType")
	private String userDefinedOperationType;


	public IfcDoorType()
	{
	}

	public IfcDoorType(String globalId, IfcDoorTypeEnum predefinedType, IfcDoorTypeOperationEnum operationType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
		this.operationType = operationType;
	}

	public IfcDoorTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcDoorTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}

	public IfcDoorTypeOperationEnum getOperationType() {
		return this.operationType;
	}

	public void setOperationType(IfcDoorTypeOperationEnum operationType) {
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

