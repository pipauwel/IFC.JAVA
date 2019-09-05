// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("d78312f8-1bcd-4504-890e-d6fcdaab653c")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcBooleanResult extends com.buildingsmart.tech.ifc.IfcGeometryResource.IfcGeometricRepresentationItem implements IfcBooleanOperand, IfcCsgSelect
{
	@JacksonXmlProperty(isAttribute=true, localName = "Operator")
	@Description("The Boolean operator used in the operation to create the result.")
	@Required()
	@Guid("970f0683-6cee-4eb2-9e10-0b31f03b0528")
	private com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcBooleanOperator operator;

	@Description("The first operand to be operated upon by the Boolean operation.")
	@Required()
	@Guid("f51c36f8-0f38-4082-92d9-b168edd7afc6")
	private com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcBooleanOperand firstOperand;

	@Description("The second operand specified for the operation.")
	@Required()
	@Guid("aca2312f-8b6b-4323-9475-e793e362a83f")
	private com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcBooleanOperand secondOperand;


	public IfcBooleanResult()
	{
	}

	public IfcBooleanResult(com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcBooleanOperator _operator, com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcBooleanOperand firstOperand, com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcBooleanOperand secondOperand)
	{
		this.operator = _operator;
		this.firstOperand = firstOperand;
		this.secondOperand = secondOperand;
	}

	public com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcBooleanOperator getOperator() {
		return this.operator;
	}

	public void setOperator(com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcBooleanOperator operator) {
		this.operator = operator;
	}

	public com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcBooleanOperand getFirstOperand() {
		return this.firstOperand;
	}

	public void setFirstOperand(com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcBooleanOperand firstOperand) {
		this.firstOperand = firstOperand;
	}

	public com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcBooleanOperand getSecondOperand() {
		return this.secondOperand;
	}

	public void setSecondOperand(com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcBooleanOperand secondOperand) {
		this.secondOperand = secondOperand;
	}

	public int getDim() {
		return 0;
	}


}

