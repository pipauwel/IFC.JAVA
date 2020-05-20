// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcExternalReferenceResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.InverseProperty;
import com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssociatesLibrary;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcText;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Set;

@Guid("739c22f8-9791-4f05-b25d-70ddc3ed443f")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcLibraryReference extends IfcExternalReference implements IfcLibrarySelect
{
	@Description("Additional description provided for the library reference.  <blockquote class=\"change-ifc2x4\">    IFC4 CHANGE&nbsp; New attribute added at the end of the attribute list.  </blockquote>")
	@DataMember(Order = 0)
	@Guid("c36f2056-db4c-4e1e-b01c-a5a7d5794c09")
	@JacksonXmlProperty(isAttribute=false, localName = "description")
	private IfcText description;

	@Description("The language in which a library reference is expressed.  <blockquote class=\"change-ifc2x4\">    IFC4 CHANGE&nbsp; New attribute added at the end of the attribute list.  </blockquote>")
	@DataMember(Order = 1)
	@Guid("48d70f10-19be-4364-a36d-d32efe9e72de")
	@JacksonXmlProperty(isAttribute=false, localName = "language")
	private IfcLanguageId language;

	@Description("The library information that is being referenced.")
	@DataMember(Order = 2)
	@Guid("0ddfeb57-9edd-46aa-8369-dff55be36456")
	@JacksonXmlProperty(isAttribute=false, localName = "referencedLibrary")
	private IfcLibraryInformation referencedLibrary;

	@Description("The library reference with which objects are associated.  <blockquote class=\"change-ifc2x4\">    IFC4 CHANGE&nbsp; New inverse attribute.  </blockquote>")
	@InverseProperty(InverseProp = "relatingLibrary", Range = "IfcRelAssociatesLibrary")
	@Guid("369a8e6b-21f9-42f6-82fc-0feec6c5a0fe")
	/*@JacksonXmlProperty(isAttribute = false, localName = "IfcRelAssociatesLibrary")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "libraryRefForObjects")*/
	@JsonIgnore
	private Set<IfcRelAssociatesLibrary> libraryRefForObjects;


	public IfcLibraryReference()
	{
	}

	public IfcText getDescription() {
		return this.description;
	}

	public void setDescription(IfcText description) {
		this.description = description;
	}

	public IfcLanguageId getLanguage() {
		return this.language;
	}

	public void setLanguage(IfcLanguageId language) {
		this.language = language;
	}

	public IfcLibraryInformation getReferencedLibrary() {
		return this.referencedLibrary;
	}

	public void setReferencedLibrary(IfcLibraryInformation referencedLibrary) {
		this.referencedLibrary = referencedLibrary;
	}

	public Set<IfcRelAssociatesLibrary> getLibraryRefForObjects() {
		return this.libraryRefForObjects;
	}


}

