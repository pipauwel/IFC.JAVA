// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain;

import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MaxLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("367339a3-2c53-452e-880f-d16b0575c0c3")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcStructuralActivity extends com.buildingsmart.tech.ifc.IfcKernel.IfcProduct
{
	@JacksonXmlProperty(isAttribute=false, localName = "AppliedLoad")
	@Description("Load or result resource object which defines the load type, direction, and load values.    <p>In case of activities which are variably distributed over curves or surfaces, <em>IfcStructuralLoadConfiguration</em> is used which provides a list of load samples and their locations within the load distribution, measured in local coordinates of the curve or surface on which this activity acts.  The contents of this load or result distribution may be further restricted by definitions at subtypes of <em>IfcStructuralActivity</em>.</p>")
	@Required()
	@Guid("8a68177b-4c60-4eb6-8903-ae9366cb2ac7")
	private com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcStructuralLoad appliedLoad;

	@JacksonXmlProperty(isAttribute=true, localName = "GlobalOrLocal")
	@Description("Indicates whether the load directions refer to the global coordinate system (global to  the analysis model, i.e. as established by <em>IfcStructuralAnalysisModel.SharedPlacement</em>)  or to the local coordinate system (local to the activity or connected item, as established by  an explicit or implied representation and its parameter space).    <blockquote class=\"note\">NOTE, the informal definition of  <em>IfcRepresentationResource.IfcGlobalOrLocalEnum</em> doe s not distinguish between  &quot;global coordinate system&quot; and &quot;world coordinate system&quot;.  On the other hand, this distinction is necessary in the <em>IfcStructuralAnalysisDomain</em>  where the shared &quot;global&quot; coordinate system of an analysis model may very well  not be the same as the project-wide world coordinate system.</blockquote>    <blockquote class=\"note\">NOTE&nbsp; In the scope of <em>IfcStructuralActivity.GlobalOrLocal</em>,  the meaning of GLOBAL_COORDS is therefore not to be taken as world coordinate system  but as the analysis model specific shared coordinate system.  In contrast, LOCAL_COORDS  is to be taken as coordinates which are local to individual structural items and activities,  as established by subclass-specific geometry use definitions.</blockquote>")
	@Required()
	@Guid("830a06f0-c7f3-4922-adc8-1ae743e63028")
	private com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcGlobalOrLocalEnum globalOrLocal;

	@Description("Reference to the <em>IfcRelConnectsStructuralActivity</em> relationship by which activities are connected with structural items.")
	@MaxLength(1)
	@Guid("972e6dd1-44d3-4eae-8b18-92babea8b77f")
	private Set<com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcRelConnectsStructuralActivity> assignedToStructuralItem = new HashSet<com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcRelConnectsStructuralActivity>();


	public IfcStructuralActivity()
	{
	}

	public IfcStructuralActivity(String globalId, com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcStructuralLoad appliedLoad, com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcGlobalOrLocalEnum globalOrLocal)
	{
		super(globalId);
		this.appliedLoad = appliedLoad;
		this.globalOrLocal = globalOrLocal;
	}

	public com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcStructuralLoad getAppliedLoad() {
		return this.appliedLoad;
	}

	public void setAppliedLoad(com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcStructuralLoad appliedLoad) {
		this.appliedLoad = appliedLoad;
	}

	public com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcGlobalOrLocalEnum getGlobalOrLocal() {
		return this.globalOrLocal;
	}

	public void setGlobalOrLocal(com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcGlobalOrLocalEnum globalOrLocal) {
		this.globalOrLocal = globalOrLocal;
	}

	public Set<com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcRelConnectsStructuralActivity> getAssignedToStructuralItem() {
		return this.assignedToStructuralItem;
	}


}

