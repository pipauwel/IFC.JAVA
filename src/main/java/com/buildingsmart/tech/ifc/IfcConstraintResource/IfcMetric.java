// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcConstraintResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("80e1bafe-6a4a-46c1-9f7d-1c432b1ad3f8")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcMetric extends IfcConstraint
{
	@JacksonXmlProperty(isAttribute=true, localName = "Benchmark")
	@Description("Enumeration that identifies the type of benchmark data.")
	@Required()
	@Guid("f6bf2afd-66d2-4ca3-8497-049c6de0448b")
	private com.buildingsmart.tech.ifc.IfcConstraintResource.IfcBenchmarkEnum benchmark;

	@JacksonXmlProperty(isAttribute=true, localName = "ValueSource")
	@Description("Reference source for data values.     If <i>DataValue</i> refers to an <i>IfcTable</i>, this attribute identifies the relevent column identified by <i>IfcTableColumn</i>.<i>Identifier</i>.")
	@Guid("b72c1003-2c12-4c5f-89f0-a650f7725700")
	private String valueSource;

	@Description("The value to be compared on associated objects. A null value indicates comparison to null.  <blockquote class=\"change-ifc4\">IFC4 ADD1 CHANGE&nbsp;  This attribute is now optional.</blockquote>")
	@Guid("23f467e3-d669-4627-b39a-f3ea04867950")
	private com.buildingsmart.tech.ifc.IfcConstraintResource.IfcMetricValueSelect dataValue;

	@JacksonXmlProperty(isAttribute=false, localName = "ReferencePath")
	@Description("Optional path to an attribute to be constrained on associated objects.  If provided, the metric may be validated by resolving the path to the current value on associated object(s), and comparing such value with <i>DataValue</i> according to the <i>Benchmark</i>.")
	@Guid("78456c1f-276f-4b88-807b-5f5009c06e6d")
	private com.buildingsmart.tech.ifc.IfcConstraintResource.IfcReference referencePath;


	public IfcMetric()
	{
	}

	public IfcMetric(String name, com.buildingsmart.tech.ifc.IfcConstraintResource.IfcConstraintEnum constraintGrade, com.buildingsmart.tech.ifc.IfcConstraintResource.IfcBenchmarkEnum benchmark)
	{
		super(name, constraintGrade);
		this.benchmark = benchmark;
	}

	public com.buildingsmart.tech.ifc.IfcConstraintResource.IfcBenchmarkEnum getBenchmark() {
		return this.benchmark;
	}

	public void setBenchmark(com.buildingsmart.tech.ifc.IfcConstraintResource.IfcBenchmarkEnum benchmark) {
		this.benchmark = benchmark;
	}

	public String getValueSource() {
		return this.valueSource;
	}

	public void setValueSource(String valueSource) {
		this.valueSource = valueSource;
	}

	public com.buildingsmart.tech.ifc.IfcConstraintResource.IfcMetricValueSelect getDataValue() {
		return this.dataValue;
	}

	public void setDataValue(com.buildingsmart.tech.ifc.IfcConstraintResource.IfcMetricValueSelect dataValue) {
		this.dataValue = dataValue;
	}

	public com.buildingsmart.tech.ifc.IfcConstraintResource.IfcReference getReferencePath() {
		return this.referencePath;
	}

	public void setReferencePath(com.buildingsmart.tech.ifc.IfcConstraintResource.IfcReference referencePath) {
		this.referencePath = referencePath;
	}


}

