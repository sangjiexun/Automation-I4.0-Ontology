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
 * Source Class: DefaultStandardOrganization <br>
 * @version generated on Fri Feb 26 14:35:08 COT 2021 by santiago
 */
public class DefaultStandardOrganization extends WrappedIndividualImpl implements StandardOrganization {

    public DefaultStandardOrganization(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#isVirtualizedIn
     */
     
    public Collection<? extends Admin_Shell> getIsVirtualizedIn() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_ISVIRTUALIZEDIN,
                                               DefaultAdmin_Shell.class);
    }

    public boolean hasIsVirtualizedIn() {
	   return !getIsVirtualizedIn().isEmpty();
    }

    public void addIsVirtualizedIn(Admin_Shell newIsVirtualizedIn) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_ISVIRTUALIZEDIN,
                                       newIsVirtualizedIn);
    }

    public void removeIsVirtualizedIn(Admin_Shell oldIsVirtualizedIn) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_ISVIRTUALIZEDIN,
                                          oldIsVirtualizedIn);
    }


    /* ***************************************************
     * Object Property https://w3id.org/i40/sto#belongsTo
     */
     
    public Collection<? extends Country> getBelongs_To() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_BELONGS_TO,
                                               DefaultCountry.class);
    }

    public boolean hasBelongs_To() {
	   return !getBelongs_To().isEmpty();
    }

    public void addBelongs_To(Country newBelongs_To) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_BELONGS_TO,
                                       newBelongs_To);
    }

    public void removeBelongs_To(Country oldBelongs_To) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_BELONGS_TO,
                                          oldBelongs_To);
    }


    /* ***************************************************
     * Object Property https://w3id.org/i40/sto#hasHeadquaterIn
     */
     
    public Collection<? extends Place> getHas_Headquater_In() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HAS_HEADQUATER_IN,
                                               DefaultPlace.class);
    }

    public boolean hasHas_Headquater_In() {
	   return !getHas_Headquater_In().isEmpty();
    }

    public void addHas_Headquater_In(Place newHas_Headquater_In) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HAS_HEADQUATER_IN,
                                       newHas_Headquater_In);
    }

    public void removeHas_Headquater_In(Place oldHas_Headquater_In) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HAS_HEADQUATER_IN,
                                          oldHas_Headquater_In);
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


    /* ***************************************************
     * Data Property https://w3id.org/i40/sto#formationDate
     */
     
    public Collection<? extends Object> getHas_Formation_Date() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HAS_FORMATION_DATE, Object.class);
    }

    public boolean hasHas_Formation_Date() {
		return !getHas_Formation_Date().isEmpty();
    }

    public void addHas_Formation_Date(Object newHas_Formation_Date) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HAS_FORMATION_DATE, newHas_Formation_Date);
    }

    public void removeHas_Formation_Date(Object oldHas_Formation_Date) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HAS_FORMATION_DATE, oldHas_Formation_Date);
    }


    /* ***************************************************
     * Data Property https://w3id.org/i40/sto#orgName
     */
     
    public Collection<? extends Object> getOrg_Name() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ORG_NAME, Object.class);
    }

    public boolean hasOrg_Name() {
		return !getOrg_Name().isEmpty();
    }

    public void addOrg_Name(Object newOrg_Name) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ORG_NAME, newOrg_Name);
    }

    public void removeOrg_Name(Object oldOrg_Name) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_ORG_NAME, oldOrg_Name);
    }


}
