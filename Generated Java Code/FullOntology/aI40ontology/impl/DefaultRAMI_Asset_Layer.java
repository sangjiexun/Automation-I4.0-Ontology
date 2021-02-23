package aI40ontology.impl;

import aI40ontology.*;


import java.net.URI;
import java.util.Collection;
import javax.xml.datatype.XMLGregorianCalendar;

import org.protege.owl.codegeneration.WrappedIndividual;
import org.protege.owl.codegeneration.impl.WrappedIndividualImpl;

import org.protege.owl.codegeneration.inference.CodeGenerationInference;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;


/**
 * Generated by Protege (http://protege.stanford.edu).<br>
 * Source Class: DefaultRAMI_Asset_Layer <br>
 * @version generated on Mon Feb 22 13:47:49 COT 2021 by sagga
 */
public class DefaultRAMI_Asset_Layer extends WrappedIndividualImpl implements RAMI_Asset_Layer {

    public DefaultRAMI_Asset_Layer(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://www.loa-cnr.it/ontologies/DUL.owl#isPartOf
     */
     
    public Collection<? extends RAMI_Asset_Layer> getIs_Part_Of() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_IS_PART_OF,
                                               DefaultRAMI_Asset_Layer.class);
    }

    public boolean hasIs_Part_Of() {
	   return !getIs_Part_Of().isEmpty();
    }

    public void addIs_Part_Of(RAMI_Asset_Layer newIs_Part_Of) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_IS_PART_OF,
                                       newIs_Part_Of);
    }

    public void removeIs_Part_Of(RAMI_Asset_Layer oldIs_Part_Of) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_IS_PART_OF,
                                          oldIs_Part_Of);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#isCarriedOutIn
     */
     
    public Collection<? extends ProcessO> getIsCarriedOutIn() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_ISCARRIEDOUTIN,
                                               DefaultProcessO.class);
    }

    public boolean hasIsCarriedOutIn() {
	   return !getIsCarriedOutIn().isEmpty();
    }

    public void addIsCarriedOutIn(ProcessO newIsCarriedOutIn) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_ISCARRIEDOUTIN,
                                       newIsCarriedOutIn);
    }

    public void removeIsCarriedOutIn(ProcessO oldIsCarriedOutIn) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_ISCARRIEDOUTIN,
                                          oldIsCarriedOutIn);
    }


    /* ***************************************************
     * Object Property https://w3id.org/i40/rami#assetIdentificationModel
     */
     
    public Collection<? extends Submodel> getHas_Asset_Identification_Model() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HAS_ASSET_IDENTIFICATION_MODEL,
                                               DefaultSubmodel.class);
    }

    public boolean hasHas_Asset_Identification_Model() {
	   return !getHas_Asset_Identification_Model().isEmpty();
    }

    public void addHas_Asset_Identification_Model(Submodel newHas_Asset_Identification_Model) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HAS_ASSET_IDENTIFICATION_MODEL,
                                       newHas_Asset_Identification_Model);
    }

    public void removeHas_Asset_Identification_Model(Submodel oldHas_Asset_Identification_Model) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HAS_ASSET_IDENTIFICATION_MODEL,
                                          oldHas_Asset_Identification_Model);
    }


    /* ***************************************************
     * Object Property https://w3id.org/i40/rami#hasSubmodel
     */
     
    public Collection<? extends Submodel> getHas_Submodel() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HAS_SUBMODEL,
                                               DefaultSubmodel.class);
    }

    public boolean hasHas_Submodel() {
	   return !getHas_Submodel().isEmpty();
    }

    public void addHas_Submodel(Submodel newHas_Submodel) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HAS_SUBMODEL,
                                       newHas_Submodel);
    }

    public void removeHas_Submodel(Submodel oldHas_Submodel) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HAS_SUBMODEL,
                                          oldHas_Submodel);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#hasDescription
     */
     
    public Collection<? extends String> getHasDescription() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASDESCRIPTION, String.class);
    }

    public boolean hasHasDescription() {
		return !getHasDescription().isEmpty();
    }

    public void addHasDescription(String newHasDescription) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASDESCRIPTION, newHasDescription);
    }

    public void removeHasDescription(String oldHasDescription) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASDESCRIPTION, oldHasDescription);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#hasRelatedOntology
     */
     
    public Collection<? extends Object> getHasRelatedOntology() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASRELATEDONTOLOGY, Object.class);
    }

    public boolean hasHasRelatedOntology() {
		return !getHasRelatedOntology().isEmpty();
    }

    public void addHasRelatedOntology(Object newHasRelatedOntology) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASRELATEDONTOLOGY, newHasRelatedOntology);
    }

    public void removeHasRelatedOntology(Object oldHasRelatedOntology) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASRELATEDONTOLOGY, oldHasRelatedOntology);
    }


    /* ***************************************************
     * Data Property https://w3id.org/i40/rami#assetId
     */
     
    public Collection<? extends Object> getId() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ID, Object.class);
    }

    public boolean hasId() {
		return !getId().isEmpty();
    }

    public void addId(Object newId) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ID, newId);
    }

    public void removeId(Object oldId) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ID, oldId);
    }


    /* ***************************************************
     * Data Property https://w3id.org/i40/sto#abbreviation
     */
     
    public Collection<? extends Object> getHas_Abbreviated_Name() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HAS_ABBREVIATED_NAME, Object.class);
    }

    public boolean hasHas_Abbreviated_Name() {
		return !getHas_Abbreviated_Name().isEmpty();
    }

    public void addHas_Abbreviated_Name(Object newHas_Abbreviated_Name) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HAS_ABBREVIATED_NAME, newHas_Abbreviated_Name);
    }

    public void removeHas_Abbreviated_Name(Object oldHas_Abbreviated_Name) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HAS_ABBREVIATED_NAME, oldHas_Abbreviated_Name);
    }


}
