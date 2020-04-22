// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcConstraintResource;

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
import com.buildingsmart.tech.ifc.IfcConstraintResource.*;
import com.buildingsmart.tech.ifc.IfcConstraintResource.IfcConstraint;
import com.buildingsmart.tech.ifc.IfcConstraintResource.IfcConstraintEnum;
import com.buildingsmart.tech.ifc.IfcConstraintResource.IfcBenchmarkEnum;

@Guid("80e1bafe-6a4a-46c1-9f7d-1c432b1ad3f8")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcMetric extends IfcConstraint
{
	@Description("Enumeration that identifies the type of benchmark data.")
	@DataMember(Order = 0)
	@Required()
	@Guid("f6bf2afd-66d2-4ca3-8497-049c6de0448b")
	@JacksonXmlProperty(isAttribute=true, localName = "Benchmark")
	private IfcBenchmarkEnum benchmark;

	@Description("Reference source for data values.     If <i>DataValue</i> refers to an <i>IfcTable</i>, this attribute identifies the relevent column identified by <i>IfcTableColumn</i>.<i>Identifier</i>.")
	@DataMember(Order = 1)
	@Guid("b72c1003-2c12-4c5f-89f0-a650f7725700")
	@JacksonXmlProperty(isAttribute=true, localName = "ValueSource")
	private String valueSource;

	@Description("The value to be compared on associated objects. A null value indicates comparison to null.  <blockquote class=\"change-ifc4\">IFC4 ADD1 CHANGE&nbsp;  This attribute is now optional.</blockquote>")
	@DataMember(Order = 2)
	@Guid("23f467e3-d669-4627-b39a-f3ea04867950")
	@JacksonXmlProperty(isAttribute=true, localName = "DataValue")
	private IfcMetricValueSelect dataValue;

	@Description("Optional path to an attribute to be constrained on associated objects.  If provided, the metric may be validated by resolving the path to the current value on associated object(s), and comparing such value with <i>DataValue</i> according to the <i>Benchmark</i>.")
	@DataMember(Order = 3)
	@Guid("78456c1f-276f-4b88-807b-5f5009c06e6d")
	@JacksonXmlProperty(isAttribute=false, localName = "ReferencePath")
	private IfcReference referencePath;


	public IfcMetric()
	{
	}

	public IfcMetric(String name, IfcConstraintEnum constraintGrade, IfcBenchmarkEnum benchmark)
	{
		super(name, constraintGrade);
		this.benchmark = benchmark;
	}

	public IfcBenchmarkEnum getBenchmark() {
		return this.benchmark;
	}

	public void setBenchmark(IfcBenchmarkEnum benchmark) {
		this.benchmark = benchmark;
	}

	public String getValueSource() {
		return this.valueSource;
	}

	public void setValueSource(String valueSource) {
		this.valueSource = valueSource;
	}

	public IfcMetricValueSelect getDataValue() {
		return this.dataValue;
	}

	public void setDataValue(IfcMetricValueSelect dataValue) {
		this.dataValue = dataValue;
	}

	public IfcReference getReferencePath() {
		return this.referencePath;
	}

	public void setReferencePath(IfcReference referencePath) {
		this.referencePath = referencePath;
	}


}

