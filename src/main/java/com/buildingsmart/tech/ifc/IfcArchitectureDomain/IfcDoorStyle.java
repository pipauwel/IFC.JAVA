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

@Guid("3e42e773-d2e7-4b27-8517-e04c42c4b1de")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcDoorStyle extends com.buildingsmart.tech.ifc.IfcKernel.IfcTypeProduct
{
	@Description("Type defining the general layout and operation of the door style.  <br>")
	@DataMember(Order = 0)
	@Required()
	@Guid("53c1ee77-bf85-4e79-b986-160b301e66cd")
	@JacksonXmlProperty(isAttribute=true, localName = "operationType")
	private IfcDoorStyleOperationEnum operationType;

	@Description("Type defining the basic construction and material type of the door.  <br>")
	@DataMember(Order = 1)
	@Required()
	@Guid("0e3d909f-3016-4ab1-8e19-3c866572fecf")
	@JacksonXmlProperty(isAttribute=true, localName = "constructionType")
	private IfcDoorStyleConstructionEnum constructionType;

	@Description("The Boolean value reflects, whether the parameter given in the attached lining and panel properties exactly define the geometry (TRUE), or whether the attached style shape take precedence (FALSE). In the last case the parameter have only informative value.  <br>")
	@DataMember(Order = 2)
	@Required()
	@Guid("0e6f7b46-22a9-4d01-bf4c-1b07bfbdb032")
	@JacksonXmlProperty(isAttribute=false, localName = "parameterTakesPrecedence")
	private IfcBoolean parameterTakesPrecedence;

	@Description("The Boolean indicates, whether the attached <em>IfcMappedRepresentation</em> (if given) can be sized (using scale factor of transformation), or not (FALSE). If not, the <em>IfcMappedRepresentation</em> should be <em>IfcShapeRepresentation</em> of the <em>IfcDoor</em> (using <em>IfcMappedItem</em> as the <em>Item</em>) with the scale factor = 1.  <br>")
	@DataMember(Order = 3)
	@Required()
	@Guid("5decf5b4-3ba0-40f3-a31a-3d1b826b143b")
	@JacksonXmlProperty(isAttribute=false, localName = "sizeable")
	private IfcBoolean sizeable;


	public IfcDoorStyle()
	{
	}

	public IfcDoorStyle(String globalId, IfcDoorStyleOperationEnum operationType, IfcDoorStyleConstructionEnum constructionType, IfcBoolean parameterTakesPrecedence, IfcBoolean sizeable)
	{
		super(globalId);
		this.operationType = operationType;
		this.constructionType = constructionType;
		this.parameterTakesPrecedence = parameterTakesPrecedence;
		this.sizeable = sizeable;
	}

	public IfcDoorStyleOperationEnum getOperationType() {
		return this.operationType;
	}

	public void setOperationType(IfcDoorStyleOperationEnum operationType) {
		this.operationType = operationType;
	}

	public IfcDoorStyleConstructionEnum getConstructionType() {
		return this.constructionType;
	}

	public void setConstructionType(IfcDoorStyleConstructionEnum constructionType) {
		this.constructionType = constructionType;
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

