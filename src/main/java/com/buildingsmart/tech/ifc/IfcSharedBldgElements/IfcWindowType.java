// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedBldgElements;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcBoolean;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("0b5e3044-5232-4561-be29-c49fef5969d5")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcWindowType extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcBuildingElementType
{
	@Description("Identifies the predefined types of a window element from which the type required may be set.")
	@DataMember(Order = 0)
	@Required()
	@Guid("39e590f0-e4d6-474b-b669-31d5c0b0ecd1")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcWindowTypeEnum predefinedType;

	@Description("Type defining the general layout of the window type in terms of the partitioning of panels.")
	@DataMember(Order = 1)
	@Required()
	@Guid("c6634212-c392-4071-bc8b-80093ab368e2")
	@JacksonXmlProperty(isAttribute=true, localName = "partitioningType")
	private IfcWindowTypePartitioningEnum partitioningType;

	@Description("The Boolean value reflects, whether the parameter given in the attached lining and panel properties exactly define the geometry (TRUE), or whether the attached style shape take precedence (FALSE). In the last case the parameter have only informative value. If not provided, no such information can be infered.")
	@DataMember(Order = 2)
	@Guid("fd185249-9123-4a84-95eb-c2d6323477c5")
	@JacksonXmlProperty(isAttribute=false, localName = "parameterTakesPrecedence")
	private IfcBoolean parameterTakesPrecedence;

	@Description("Designator for the user defined partitioning type, shall only be provided, if the value of <em>PartitioningType</em> is set to USERDEFINED.")
	@DataMember(Order = 3)
	@Guid("3364027c-7696-47fe-93c8-4996a958bb20")
	@JacksonXmlProperty(isAttribute=false, localName = "userDefinedPartitioningType")
	private IfcLabel userDefinedPartitioningType;


	public IfcWindowType()
	{
	}

	public IfcWindowType(String globalId, IfcWindowTypeEnum predefinedType, IfcWindowTypePartitioningEnum partitioningType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
		this.partitioningType = partitioningType;
	}

	public IfcWindowTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcWindowTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}

	public IfcWindowTypePartitioningEnum getPartitioningType() {
		return this.partitioningType;
	}

	public void setPartitioningType(IfcWindowTypePartitioningEnum partitioningType) {
		this.partitioningType = partitioningType;
	}

	public IfcBoolean getParameterTakesPrecedence() {
		return this.parameterTakesPrecedence;
	}

	public void setParameterTakesPrecedence(IfcBoolean parameterTakesPrecedence) {
		this.parameterTakesPrecedence = parameterTakesPrecedence;
	}

	public IfcLabel getUserDefinedPartitioningType() {
		return this.userDefinedPartitioningType;
	}

	public void setUserDefinedPartitioningType(IfcLabel userDefinedPartitioningType) {
		this.userDefinedPartitioningType = userDefinedPartitioningType;
	}


}

