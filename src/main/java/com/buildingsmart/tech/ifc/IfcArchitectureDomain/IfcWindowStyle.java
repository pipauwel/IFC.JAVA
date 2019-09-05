// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcArchitectureDomain;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("db2eb89c-05a5-4166-8f16-149189ed3bfa")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcWindowStyle extends com.buildingsmart.tech.ifc.IfcKernel.IfcTypeProduct
{
	@JacksonXmlProperty(isAttribute=true, localName = "ConstructionType")
	@Description("Type defining the basic construction and material type of the window.")
	@Required()
	@Guid("86bdb583-d724-4564-b54a-856d36c09ea1")
	private com.buildingsmart.tech.ifc.IfcArchitectureDomain.IfcWindowStyleConstructionEnum constructionType;

	@JacksonXmlProperty(isAttribute=true, localName = "OperationType")
	@Description("Type defining the general layout and operation of the window style.")
	@Required()
	@Guid("c8dfa2e1-92d3-45c7-888c-3f33602acb59")
	private com.buildingsmart.tech.ifc.IfcArchitectureDomain.IfcWindowStyleOperationEnum operationType;

	@JacksonXmlProperty(isAttribute=true, localName = "ParameterTakesPrecedence")
	@Description("The Boolean value reflects, whether the parameter given in the attached lining and panel properties exactly define the geometry (TRUE), or whether the attached style shape take precedence (FALSE). In the last case the parameter have only informative value.")
	@Required()
	@Guid("bc8f77be-3d4e-481b-b869-19bd68f29427")
	private Boolean parameterTakesPrecedence;

	@JacksonXmlProperty(isAttribute=true, localName = "Sizeable")
	@Description("The Boolean indicates, whether the attached ShapeStyle can be sized (using scale factor of transformation), or not (FALSE). If not, the ShapeStyle should be inserted by the IfcWindow (using IfcMappedItem) with the scale factor = 1.")
	@Required()
	@Guid("b8e166df-8b37-41bc-b78c-9ba0be8ce237")
	private Boolean sizeable;


	public IfcWindowStyle()
	{
	}

	public IfcWindowStyle(String globalId, com.buildingsmart.tech.ifc.IfcArchitectureDomain.IfcWindowStyleConstructionEnum constructionType, com.buildingsmart.tech.ifc.IfcArchitectureDomain.IfcWindowStyleOperationEnum operationType, Boolean parameterTakesPrecedence, Boolean sizeable)
	{
		super(globalId);
		this.constructionType = constructionType;
		this.operationType = operationType;
		this.parameterTakesPrecedence = parameterTakesPrecedence;
		this.sizeable = sizeable;
	}

	public com.buildingsmart.tech.ifc.IfcArchitectureDomain.IfcWindowStyleConstructionEnum getConstructionType() {
		return this.constructionType;
	}

	public void setConstructionType(com.buildingsmart.tech.ifc.IfcArchitectureDomain.IfcWindowStyleConstructionEnum constructionType) {
		this.constructionType = constructionType;
	}

	public com.buildingsmart.tech.ifc.IfcArchitectureDomain.IfcWindowStyleOperationEnum getOperationType() {
		return this.operationType;
	}

	public void setOperationType(com.buildingsmart.tech.ifc.IfcArchitectureDomain.IfcWindowStyleOperationEnum operationType) {
		this.operationType = operationType;
	}

	public Boolean getParameterTakesPrecedence() {
		return this.parameterTakesPrecedence;
	}

	public void setParameterTakesPrecedence(Boolean parameterTakesPrecedence) {
		this.parameterTakesPrecedence = parameterTakesPrecedence;
	}

	public Boolean getSizeable() {
		return this.sizeable;
	}

	public void setSizeable(Boolean sizeable) {
		this.sizeable = sizeable;
	}


}

