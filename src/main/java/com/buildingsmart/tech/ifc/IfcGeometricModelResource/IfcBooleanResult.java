// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

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
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.*;
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcBooleanClippingResult;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcGeometricRepresentationItem;
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcBooleanOperator;
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcBooleanOperand;

@Guid("d78312f8-1bcd-4504-890e-d6fcdaab653c")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcBooleanClippingResult.class, name = "IfcBooleanClippingResult"))
public class IfcBooleanResult extends com.buildingsmart.tech.ifc.IfcGeometryResource.IfcGeometricRepresentationItem implements IfcBooleanOperand, IfcCsgSelect
{
	@Description("The Boolean operator used in the operation to create the result.")
	@Required()
	@Guid("970f0683-6cee-4eb2-9e10-0b31f03b0528")
	@JacksonXmlProperty(isAttribute=true, localName = "Operator")
	private IfcBooleanOperator operator;

	@Description("The first operand to be operated upon by the Boolean operation.")
	@Required()
	@Guid("f51c36f8-0f38-4082-92d9-b168edd7afc6")
	@JacksonXmlProperty(isAttribute=true, localName = "FirstOperand")
	private IfcBooleanOperand firstOperand;

	@Description("The second operand specified for the operation.")
	@Required()
	@Guid("aca2312f-8b6b-4323-9475-e793e362a83f")
	@JacksonXmlProperty(isAttribute=true, localName = "SecondOperand")
	private IfcBooleanOperand secondOperand;


	public IfcBooleanResult()
	{
	}

	public IfcBooleanResult(IfcBooleanOperator _operator, IfcBooleanOperand firstOperand, IfcBooleanOperand secondOperand)
	{
		this.operator = _operator;
		this.firstOperand = firstOperand;
		this.secondOperand = secondOperand;
	}

	public IfcBooleanOperator getOperator() {
		return this.operator;
	}

	public void setOperator(IfcBooleanOperator operator) {
		this.operator = operator;
	}

	public IfcBooleanOperand getFirstOperand() {
		return this.firstOperand;
	}

	public void setFirstOperand(IfcBooleanOperand firstOperand) {
		this.firstOperand = firstOperand;
	}

	public IfcBooleanOperand getSecondOperand() {
		return this.secondOperand;
	}

	public void setSecondOperand(IfcBooleanOperand secondOperand) {
		this.secondOperand = secondOperand;
	}

	public int getDim() {
		return 0;
	}


}

