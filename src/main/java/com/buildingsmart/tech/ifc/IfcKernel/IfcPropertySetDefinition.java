// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.InverseProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Set;

@Guid("dc96d6f9-b8ed-4899-979b-8cc86974ea2d")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcPreDefinedPropertySet.class, name = "IfcPreDefinedPropertySet"), @JsonSubTypes.Type(value = IfcPropertySet.class, name = "IfcPropertySet"), @JsonSubTypes.Type(value = IfcQuantitySet.class, name = "IfcQuantitySet")})
public abstract class IfcPropertySetDefinition extends IfcPropertyDefinition implements IfcPropertySetDefinitionSelect
{
	@Description("The type object to which the property set is assigned. The property set acts as a shared property set to all occurrences of the type object.  <blockquote class=\"note\">  NOTE&nbsp; The relationship between the <em>IfcPropertySetDefinition</em> and the <em>IfcTypeObject</em> is a direct relationship, not utilizing <em>IfcRelDefinesByProperties</em>, for maintaining compatibility with earlier releases of this standard.  </blockquote>  <blockquote class=\"change-ifc2x4\">  IFC4 CHANGE&nbsp;  The cardinality has been changed from 0:1 to 0:? with upward compatibility for file based exchange.  </blockquote>")
	@InverseProperty(InverseProp = "hasPropertySets", Range = "IfcTypeObject")
	@Guid("5aee7ab3-dcb7-4abe-8fa5-d2b2f2c37083")
	/*@JacksonXmlProperty(isAttribute = false, localName = "IfcTypeObject")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "definesType")*/
	@JsonIgnore
	private Set<IfcTypeObject> definesType;

	@Description("Relation to the property set template, via the objectified relationship <em>IfcRelDefinesByTemplate</em>, that, if given, provides the definition template for the property set or quantity set and its properties.   <blockquote class=\"change-ifc2x4\">  IFC4 CHANGE&nbsp; New inverse relationship, change made with upward compatibility for file based exchange.  </blockquote>")
	@InverseProperty(InverseProp = "relatedPropertySets", Range = "IfcRelDefinesByTemplate")
	@Guid("e9541680-618c-49dc-a052-7d13de3fd336")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcRelDefinesByTemplate")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "isDefinedBy")
	private Set<IfcRelDefinesByTemplate> isDefinedBy;

	@Description("Reference to the relation to one or many object occurrences that are characterized by the property set definition. A single property set can be assigned to multiple object occurrences using the objectified relationship <em>IfcRefDefinesByProperties</em>.  <blockquote class=\"change-ifc2x4\">  IFC4 CHANGE Inverse attribute renamed from PropertyDefinitionOf with upward compatibility for file-based exchange.  </blockquote>")
	@InverseProperty(InverseProp = "relatingPropertyDefinition", Range = "IfcRelDefinesByProperties")
	@Guid("74a32a1f-15b3-4366-a7ac-3776403dd4dd")
	/*@JacksonXmlProperty(isAttribute = false, localName = "IfcRelDefinesByProperties")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "definesOccurrence")*/
	@JsonIgnore
	private Set<IfcRelDefinesByProperties> definesOccurrence;


	public IfcPropertySetDefinition()
	{
	}

	public IfcPropertySetDefinition(String globalId)
	{
		super(globalId);
	}

	public Set<IfcTypeObject> getDefinesType() {
		return this.definesType;
	}

	public Set<IfcRelDefinesByTemplate> getIsDefinedBy() {
		return this.isDefinedBy;
	}

	public Set<IfcRelDefinesByProperties> getDefinesOccurrence() {
		return this.definesOccurrence;
	}


}

