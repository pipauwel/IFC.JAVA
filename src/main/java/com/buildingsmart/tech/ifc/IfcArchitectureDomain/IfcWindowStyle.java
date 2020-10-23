// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcArchitectureDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcBoolean;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("db2eb89c-05a5-4166-8f16-149189ed3bfa")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcWindowStyle extends com.buildingsmart.tech.ifc.IfcKernel.IfcTypeProduct
{
	@Description("Type defining the basic construction and material type of the window.")
	@DataMember(Order = 0)
	@Required()
	@Guid("86bdb583-d724-4564-b54a-856d36c09ea1")
	@JacksonXmlProperty(isAttribute=true, localName = "constructionType")
	private IfcWindowStyleConstructionEnum constructionType;

	@Description("Type defining the general layout and operation of the window style.")
	@DataMember(Order = 1)
	@Required()
	@Guid("c8dfa2e1-92d3-45c7-888c-3f33602acb59")
	@JacksonXmlProperty(isAttribute=true, localName = "operationType")
	private IfcWindowStyleOperationEnum operationType;

	@Description("The Boolean value reflects, whether the parameter given in the attached lining and panel properties exactly define the geometry (TRUE), or whether the attached style shape take precedence (FALSE). In the last case the parameter have only informative value.")
	@DataMember(Order = 2)
	@Required()
	@Guid("bc8f77be-3d4e-481b-b869-19bd68f29427")
	@JacksonXmlProperty(isAttribute=false, localName = "parameterTakesPrecedence")
	private IfcBoolean parameterTakesPrecedence;

	@Description("The Boolean indicates, whether the attached ShapeStyle can be sized (using scale factor of transformation), or not (FALSE). If not, the ShapeStyle should be inserted by the IfcWindow (using IfcMappedItem) with the scale factor = 1.")
	@DataMember(Order = 3)
	@Required()
	@Guid("b8e166df-8b37-41bc-b78c-9ba0be8ce237")
	@JacksonXmlProperty(isAttribute=false, localName = "sizeable")
	private IfcBoolean sizeable;


	public IfcWindowStyle()
	{
	}

	public IfcWindowStyle(String globalId, IfcWindowStyleConstructionEnum constructionType, IfcWindowStyleOperationEnum operationType, IfcBoolean parameterTakesPrecedence, IfcBoolean sizeable)
	{
		super(globalId);
		this.constructionType = constructionType;
		this.operationType = operationType;
		this.parameterTakesPrecedence = parameterTakesPrecedence;
		this.sizeable = sizeable;
	}

	public IfcWindowStyleConstructionEnum getConstructionType() {
		return this.constructionType;
	}

	public void setConstructionType(IfcWindowStyleConstructionEnum constructionType) {
		this.constructionType = constructionType;
	}

	public IfcWindowStyleOperationEnum getOperationType() {
		return this.operationType;
	}

	public void setOperationType(IfcWindowStyleOperationEnum operationType) {
		this.operationType = operationType;
	}

	public IfcBoolean getParameterTakesPrecedence() {
		return this.parameterTakesPrecedence;
	}

	public void setParameterTakesPrecedence(IfcBoolean parameterTakesPrecedence) {
		this.parameterTakesPrecedence = parameterTakesPrecedence;
	}

	public IfcBoolean getSizeable() {
		return this.sizeable;
	}

	public void setSizeable(IfcBoolean sizeable) {
		this.sizeable = sizeable;
	}


}

