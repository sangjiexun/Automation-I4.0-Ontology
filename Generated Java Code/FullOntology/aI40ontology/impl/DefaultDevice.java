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
 * Source Class: DefaultDevice <br>
 * @version generated on Fri Feb 26 14:35:08 COT 2021 by santiago
 */
public class DefaultDevice extends WrappedIndividualImpl implements Device {

    public DefaultDevice(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#executes
     */
     
    public Collection<? extends Function> getExecutes() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_EXECUTES,
                                               DefaultFunction.class);
    }

    public boolean hasExecutes() {
	   return !getExecutes().isEmpty();
    }

    public void addExecutes(Function newExecutes) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_EXECUTES,
                                       newExecutes);
    }

    public void removeExecutes(Function oldExecutes) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_EXECUTES,
                                          oldExecutes);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#generates
     */
     
    public Collection<? extends Data> getGenerates() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_GENERATES,
                                               DefaultData.class);
    }

    public boolean hasGenerates() {
	   return !getGenerates().isEmpty();
    }

    public void addGenerates(Data newGenerates) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_GENERATES,
                                       newGenerates);
    }

    public void removeGenerates(Data oldGenerates) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_GENERATES,
                                          oldGenerates);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#interactsWith
     */
     
    public Collection<? extends Actor> getInteractsWith() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_INTERACTSWITH,
                                               DefaultActor.class);
    }

    public boolean hasInteractsWith() {
	   return !getInteractsWith().isEmpty();
    }

    public void addInteractsWith(Actor newInteractsWith) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_INTERACTSWITH,
                                       newInteractsWith);
    }

    public void removeInteractsWith(Actor oldInteractsWith) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_INTERACTSWITH,
                                          oldInteractsWith);
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
     * Object Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#offers
     */
     
    public Collection<? extends Service> getOffers() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_OFFERS,
                                               DefaultService.class);
    }

    public boolean hasOffers() {
	   return !getOffers().isEmpty();
    }

    public void addOffers(Service newOffers) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_OFFERS,
                                       newOffers);
    }

    public void removeOffers(Service oldOffers) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_OFFERS,
                                          oldOffers);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#receives
     */
     
    public Collection<? extends Data> getReceives() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_RECEIVES,
                                               DefaultData.class);
    }

    public boolean hasReceives() {
	   return !getReceives().isEmpty();
    }

    public void addReceives(Data newReceives) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_RECEIVES,
                                       newReceives);
    }

    public void removeReceives(Data oldReceives) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_RECEIVES,
                                          oldReceives);
    }


    /* ***************************************************
     * Object Property http://xmlns.com/foaf/0.1/mbox
     */
     
    public Collection<? extends Thing> getMbox() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_MBOX,
                                               DefaultThing.class);
    }

    public boolean hasMbox() {
	   return !getMbox().isEmpty();
    }

    public void addMbox(Thing newMbox) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_MBOX,
                                       newMbox);
    }

    public void removeMbox(Thing oldMbox) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_MBOX,
                                          oldMbox);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#belongsToArchitectureLayer
     */
     
    public Collection<? extends Object> getBelongsToArchitectureLayer() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_BELONGSTOARCHITECTURELAYER, Object.class);
    }

    public boolean hasBelongsToArchitectureLayer() {
		return !getBelongsToArchitectureLayer().isEmpty();
    }

    public void addBelongsToArchitectureLayer(Object newBelongsToArchitectureLayer) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_BELONGSTOARCHITECTURELAYER, newBelongsToArchitectureLayer);
    }

    public void removeBelongsToArchitectureLayer(Object oldBelongsToArchitectureLayer) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_BELONGSTOARCHITECTURELAYER, oldBelongsToArchitectureLayer);
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
     * Data Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#hasFeature
     */
     
    public Collection<? extends String> getHasFeature() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASFEATURE, String.class);
    }

    public boolean hasHasFeature() {
		return !getHasFeature().isEmpty();
    }

    public void addHasFeature(String newHasFeature) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASFEATURE, newHasFeature);
    }

    public void removeHasFeature(String oldHasFeature) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASFEATURE, oldHasFeature);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#hasIdentifier
     */
     
    public Collection<? extends Integer> getHasIdentifier() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASIDENTIFIER, Integer.class);
    }

    public boolean hasHasIdentifier() {
		return !getHasIdentifier().isEmpty();
    }

    public void addHasIdentifier(Integer newHasIdentifier) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASIDENTIFIER, newHasIdentifier);
    }

    public void removeHasIdentifier(Integer oldHasIdentifier) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASIDENTIFIER, oldHasIdentifier);
    }


    /* ***************************************************
     * Data Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#hasInteroperabilityDegree
     */
     
    public Collection<? extends String> getHasInteroperabilityDegree() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASINTEROPERABILITYDEGREE, String.class);
    }

    public boolean hasHasInteroperabilityDegree() {
		return !getHasInteroperabilityDegree().isEmpty();
    }

    public void addHasInteroperabilityDegree(String newHasInteroperabilityDegree) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASINTEROPERABILITYDEGREE, newHasInteroperabilityDegree);
    }

    public void removeHasInteroperabilityDegree(String oldHasInteroperabilityDegree) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASINTEROPERABILITYDEGREE, oldHasInteroperabilityDegree);
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
     * Data Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#supportsProtocol
     */
     
    public Collection<? extends String> getSupportsProtocol() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_SUPPORTSPROTOCOL, String.class);
    }

    public boolean hasSupportsProtocol() {
		return !getSupportsProtocol().isEmpty();
    }

    public void addSupportsProtocol(String newSupportsProtocol) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_SUPPORTSPROTOCOL, newSupportsProtocol);
    }

    public void removeSupportsProtocol(String oldSupportsProtocol) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_SUPPORTSPROTOCOL, oldSupportsProtocol);
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
