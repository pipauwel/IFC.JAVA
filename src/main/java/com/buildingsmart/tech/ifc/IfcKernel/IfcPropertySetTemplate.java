// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcIdentifier;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Guid("a7b77ff0-78ea-4751-af7d-edca24e4a5db")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPropertySetTemplate extends IfcPropertyTemplateDefinition
{
	@Description("Property set type defining whether the property set is applicable to a type (subtypes of <em>IfcTypeObject</em>), to an occurrence (subtypes of <em>IfcObject</em>), or as a special case to a performance history.<br><br>  The attribute <em>ApplicableEntity</em> may further refine the applicability to a single or multiple entity type(s).")
	@DataMember(Order = 0)
	@Guid("753bf92e-30ff-44b4-be5a-452aa32a8948")
	@JacksonXmlProperty(isAttribute=true, localName = "templateType")
	private IfcPropertySetTemplateTypeEnum templateType;

	@Description("The attribute optionally defines the data type of the applicable type or occurrence object, to which the assigned property set template can relate. If not present, no instruction is given to which type or occurrence object the property set template is applicable. The following conventions are used:  <ul>    <li>The IFC entity name of the applicable entity using the IFC naming convention, CamelCase with IFC prefix</li>    <li>It can be optionally followed by the predefined type after the separator \"/\" (forward slash), using upper case</li>    <li>If a performance history object of a particular distribution object is attributes by the property set template, then the entity name (and potentially amended by the predefined type) is expanded by adding '[PerformanceHistory]'    <li>If one property set template is applicable to many type and/or occurrence objects, then those object names should be separate by comma \",\" forming a comma separated string.  </ul>  <blockquote class=\"example\">EXAMPLE  Refering to a boiler type as applicable entity would be expressed as 'IfcBoilerType', refering to a steam boiler type as applicable entity would be expressed as 'IfcBoilerType/STEAM', refering to a wall and wall standard case and a wall type would be expressed as 'IfcWall, IfcWallStandardCase, IfcWallType'. An applicable <em>IfcPerformanceHistory</em> assigned to an occurrence or type object would be indicated by IfcBoilerType[PerformanceHistory], or respectively IfcBoilerType/STEAM[PerformanceHistory].</blockquote>")
	@DataMember(Order = 1)
	@Guid("05ff2edb-46a7-4fe8-86a8-b263a876a203")
	@JacksonXmlProperty(isAttribute=false, localName = "applicableEntity")
	private IfcIdentifier applicableEntity;

	@Description("Set of <em>IfcPropertyTemplate</em>'s that are defined within the scope of the <em>IfcPropertySetTemplate</em>.")
	@DataMember(Order = 2)
	@Required()
	@Guid("3171afcc-c2c1-4425-9f1e-a9220a12bca4")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcPropertyTemplate")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "hasPropertyTemplates")
	private Set<IfcPropertyTemplate> hasPropertyTemplates;

	@Description("Relation to the property sets, via the objectified relationship <em>IfcRelDefinesByTemplate</em>, that, if given, utilize the definition template.")
	@InverseProperty(InverseProp = "relatingTemplate", Range = "IfcRelDefinesByTemplate")
	@Guid("db32070f-d0f6-4577-af3d-c45820e5b332")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcRelDefinesByTemplate")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "defines")
	private Set<IfcRelDefinesByTemplate> defines;


	public IfcPropertySetTemplate()
	{
	}

	public IfcPropertySetTemplate(String globalId, IfcPropertyTemplate[] hasPropertyTemplates)
	{
		super(globalId);
		this.hasPropertyTemplates = new HashSet<>(Arrays.asList(hasPropertyTemplates));
	}

	public IfcPropertySetTemplateTypeEnum getTemplateType() {
		return this.templateType;
	}

	public void setTemplateType(IfcPropertySetTemplateTypeEnum templateType) {
		this.templateType = templateType;
	}

	public IfcIdentifier getApplicableEntity() {
		return this.applicableEntity;
	}

	public void setApplicableEntity(IfcIdentifier applicableEntity) {
		this.applicableEntity = applicableEntity;
	}

	public Set<IfcPropertyTemplate> getHasPropertyTemplates() {
		return this.hasPropertyTemplates;
	}

	public Set<IfcRelDefinesByTemplate> getDefines() {
		return this.defines;
	}


}

