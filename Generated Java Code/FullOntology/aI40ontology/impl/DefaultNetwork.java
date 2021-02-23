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
 * Source Class: DefaultNetwork <br>
 * @version generated on Mon Feb 22 13:47:49 COT 2021 by sagga
 */
public class DefaultNetwork extends WrappedIndividualImpl implements Network {

    public DefaultNetwork(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#spreads
     */
     
    public Collection<? extends Service> getSpreads() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_SPREADS,
                                               DefaultService.class);
    }

    public boolean hasSpreads() {
	   return !getSpreads().isEmpty();
    }

    public void addSpreads(Service newSpreads) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_SPREADS,
                                       newSpreads);
    }

    public void removeSpreads(Service oldSpreads) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_SPREADS,
                                          oldSpreads);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#transmits
     */
     
    public Collection<? extends Data> getTransmits() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_TRANSMITS,
                                               DefaultData.class);
    }

    public boolean hasTransmits() {
	   return !getTransmits().isEmpty();
    }

    public void addTransmits(Data newTransmits) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_TRANSMITS,
                                       newTransmits);
    }

    public void removeTransmits(Data oldTransmits) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_TRANSMITS,
                                          oldTransmits);
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


}
