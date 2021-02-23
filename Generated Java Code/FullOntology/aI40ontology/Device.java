package aI40ontology;

import java.net.URI;
import java.util.Collection;
import javax.xml.datatype.XMLGregorianCalendar;

import org.protege.owl.codegeneration.WrappedIndividual;

import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * 
 * <p>
 * Generated by Protege (http://protege.stanford.edu). <br>
 * Source Class: Device <br>
 * @version generated on Mon Feb 22 13:47:49 COT 2021 by sagga
 */

public interface Device extends Foaf:Agent {

    /* ***************************************************
     * Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#executes
     */
     
    /**
     * Gets all property values for the executes property.<p>
     * 
     * @returns a collection of values for the executes property.
     */
    Collection<? extends Function> getExecutes();

    /**
     * Checks if the class has a executes property value.<p>
     * 
     * @return true if there is a executes property value.
     */
    boolean hasExecutes();

    /**
     * Adds a executes property value.<p>
     * 
     * @param newExecutes the executes property value to be added
     */
    void addExecutes(Function newExecutes);

    /**
     * Removes a executes property value.<p>
     * 
     * @param oldExecutes the executes property value to be removed.
     */
    void removeExecutes(Function oldExecutes);


    /* ***************************************************
     * Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#generates
     */
     
    /**
     * Gets all property values for the generates property.<p>
     * 
     * @returns a collection of values for the generates property.
     */
    Collection<? extends Data> getGenerates();

    /**
     * Checks if the class has a generates property value.<p>
     * 
     * @return true if there is a generates property value.
     */
    boolean hasGenerates();

    /**
     * Adds a generates property value.<p>
     * 
     * @param newGenerates the generates property value to be added
     */
    void addGenerates(Data newGenerates);

    /**
     * Removes a generates property value.<p>
     * 
     * @param oldGenerates the generates property value to be removed.
     */
    void removeGenerates(Data oldGenerates);


    /* ***************************************************
     * Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#interactsWith
     */
     
    /**
     * Gets all property values for the interactsWith property.<p>
     * 
     * @returns a collection of values for the interactsWith property.
     */
    Collection<? extends Actor> getInteractsWith();

    /**
     * Checks if the class has a interactsWith property value.<p>
     * 
     * @return true if there is a interactsWith property value.
     */
    boolean hasInteractsWith();

    /**
     * Adds a interactsWith property value.<p>
     * 
     * @param newInteractsWith the interactsWith property value to be added
     */
    void addInteractsWith(Actor newInteractsWith);

    /**
     * Removes a interactsWith property value.<p>
     * 
     * @param oldInteractsWith the interactsWith property value to be removed.
     */
    void removeInteractsWith(Actor oldInteractsWith);


    /* ***************************************************
     * Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#offers
     */
     
    /**
     * Gets all property values for the offers property.<p>
     * 
     * @returns a collection of values for the offers property.
     */
    Collection<? extends Service> getOffers();

    /**
     * Checks if the class has a offers property value.<p>
     * 
     * @return true if there is a offers property value.
     */
    boolean hasOffers();

    /**
     * Adds a offers property value.<p>
     * 
     * @param newOffers the offers property value to be added
     */
    void addOffers(Service newOffers);

    /**
     * Removes a offers property value.<p>
     * 
     * @param oldOffers the offers property value to be removed.
     */
    void removeOffers(Service oldOffers);


    /* ***************************************************
     * Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#receives
     */
     
    /**
     * Gets all property values for the receives property.<p>
     * 
     * @returns a collection of values for the receives property.
     */
    Collection<? extends Data> getReceives();

    /**
     * Checks if the class has a receives property value.<p>
     * 
     * @return true if there is a receives property value.
     */
    boolean hasReceives();

    /**
     * Adds a receives property value.<p>
     * 
     * @param newReceives the receives property value to be added
     */
    void addReceives(Data newReceives);

    /**
     * Removes a receives property value.<p>
     * 
     * @param oldReceives the receives property value to be removed.
     */
    void removeReceives(Data oldReceives);


    /* ***************************************************
     * Property http://xmlns.com/foaf/0.1/mbox
     */
     
    /**
     * Gets all property values for the mbox property.<p>
     * 
     * @returns a collection of values for the mbox property.
     */
    Collection<? extends Foaf:thing> getMbox();

    /**
     * Checks if the class has a mbox property value.<p>
     * 
     * @return true if there is a mbox property value.
     */
    boolean hasMbox();

    /**
     * Adds a mbox property value.<p>
     * 
     * @param newMbox the mbox property value to be added
     */
    void addMbox(Foaf:thing newMbox);

    /**
     * Removes a mbox property value.<p>
     * 
     * @param oldMbox the mbox property value to be removed.
     */
    void removeMbox(Foaf:thing oldMbox);


    /* ***************************************************
     * Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#belongsToArchitectureLayer
     */
     
    /**
     * Gets all property values for the belongsToArchitectureLayer property.<p>
     * 
     * @returns a collection of values for the belongsToArchitectureLayer property.
     */
    Collection<? extends Object> getBelongsToArchitectureLayer();

    /**
     * Checks if the class has a belongsToArchitectureLayer property value.<p>
     * 
     * @return true if there is a belongsToArchitectureLayer property value.
     */
    boolean hasBelongsToArchitectureLayer();

    /**
     * Adds a belongsToArchitectureLayer property value.<p>
     * 
     * @param newBelongsToArchitectureLayer the belongsToArchitectureLayer property value to be added
     */
    void addBelongsToArchitectureLayer(Object newBelongsToArchitectureLayer);

    /**
     * Removes a belongsToArchitectureLayer property value.<p>
     * 
     * @param oldBelongsToArchitectureLayer the belongsToArchitectureLayer property value to be removed.
     */
    void removeBelongsToArchitectureLayer(Object oldBelongsToArchitectureLayer);



    /* ***************************************************
     * Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#hasDescription
     */
     
    /**
     * Gets all property values for the hasDescription property.<p>
     * 
     * @returns a collection of values for the hasDescription property.
     */
    Collection<? extends String> getHasDescription();

    /**
     * Checks if the class has a hasDescription property value.<p>
     * 
     * @return true if there is a hasDescription property value.
     */
    boolean hasHasDescription();

    /**
     * Adds a hasDescription property value.<p>
     * 
     * @param newHasDescription the hasDescription property value to be added
     */
    void addHasDescription(String newHasDescription);

    /**
     * Removes a hasDescription property value.<p>
     * 
     * @param oldHasDescription the hasDescription property value to be removed.
     */
    void removeHasDescription(String oldHasDescription);



    /* ***************************************************
     * Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#hasFeature
     */
     
    /**
     * Gets all property values for the hasFeature property.<p>
     * 
     * @returns a collection of values for the hasFeature property.
     */
    Collection<? extends String> getHasFeature();

    /**
     * Checks if the class has a hasFeature property value.<p>
     * 
     * @return true if there is a hasFeature property value.
     */
    boolean hasHasFeature();

    /**
     * Adds a hasFeature property value.<p>
     * 
     * @param newHasFeature the hasFeature property value to be added
     */
    void addHasFeature(String newHasFeature);

    /**
     * Removes a hasFeature property value.<p>
     * 
     * @param oldHasFeature the hasFeature property value to be removed.
     */
    void removeHasFeature(String oldHasFeature);



    /* ***************************************************
     * Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#hasIdentifier
     */
     
    /**
     * Gets all property values for the hasIdentifier property.<p>
     * 
     * @returns a collection of values for the hasIdentifier property.
     */
    Collection<? extends Integer> getHasIdentifier();

    /**
     * Checks if the class has a hasIdentifier property value.<p>
     * 
     * @return true if there is a hasIdentifier property value.
     */
    boolean hasHasIdentifier();

    /**
     * Adds a hasIdentifier property value.<p>
     * 
     * @param newHasIdentifier the hasIdentifier property value to be added
     */
    void addHasIdentifier(Integer newHasIdentifier);

    /**
     * Removes a hasIdentifier property value.<p>
     * 
     * @param oldHasIdentifier the hasIdentifier property value to be removed.
     */
    void removeHasIdentifier(Integer oldHasIdentifier);



    /* ***************************************************
     * Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#hasInteroperabilityDegree
     */
     
    /**
     * Gets all property values for the hasInteroperabilityDegree property.<p>
     * 
     * @returns a collection of values for the hasInteroperabilityDegree property.
     */
    Collection<? extends String> getHasInteroperabilityDegree();

    /**
     * Checks if the class has a hasInteroperabilityDegree property value.<p>
     * 
     * @return true if there is a hasInteroperabilityDegree property value.
     */
    boolean hasHasInteroperabilityDegree();

    /**
     * Adds a hasInteroperabilityDegree property value.<p>
     * 
     * @param newHasInteroperabilityDegree the hasInteroperabilityDegree property value to be added
     */
    void addHasInteroperabilityDegree(String newHasInteroperabilityDegree);

    /**
     * Removes a hasInteroperabilityDegree property value.<p>
     * 
     * @param oldHasInteroperabilityDegree the hasInteroperabilityDegree property value to be removed.
     */
    void removeHasInteroperabilityDegree(String oldHasInteroperabilityDegree);



    /* ***************************************************
     * Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#hasRelatedOntology
     */
     
    /**
     * Gets all property values for the hasRelatedOntology property.<p>
     * 
     * @returns a collection of values for the hasRelatedOntology property.
     */
    Collection<? extends Object> getHasRelatedOntology();

    /**
     * Checks if the class has a hasRelatedOntology property value.<p>
     * 
     * @return true if there is a hasRelatedOntology property value.
     */
    boolean hasHasRelatedOntology();

    /**
     * Adds a hasRelatedOntology property value.<p>
     * 
     * @param newHasRelatedOntology the hasRelatedOntology property value to be added
     */
    void addHasRelatedOntology(Object newHasRelatedOntology);

    /**
     * Removes a hasRelatedOntology property value.<p>
     * 
     * @param oldHasRelatedOntology the hasRelatedOntology property value to be removed.
     */
    void removeHasRelatedOntology(Object oldHasRelatedOntology);



    /* ***************************************************
     * Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#supportsProtocol
     */
     
    /**
     * Gets all property values for the supportsProtocol property.<p>
     * 
     * @returns a collection of values for the supportsProtocol property.
     */
    Collection<? extends String> getSupportsProtocol();

    /**
     * Checks if the class has a supportsProtocol property value.<p>
     * 
     * @return true if there is a supportsProtocol property value.
     */
    boolean hasSupportsProtocol();

    /**
     * Adds a supportsProtocol property value.<p>
     * 
     * @param newSupportsProtocol the supportsProtocol property value to be added
     */
    void addSupportsProtocol(String newSupportsProtocol);

    /**
     * Removes a supportsProtocol property value.<p>
     * 
     * @param oldSupportsProtocol the supportsProtocol property value to be removed.
     */
    void removeSupportsProtocol(String oldSupportsProtocol);



    /* ***************************************************
     * Property https://w3id.org/i40/sto#abbreviation
     */
     
    /**
     * Gets all property values for the has_Abbreviated_Name property.<p>
     * 
     * @returns a collection of values for the has_Abbreviated_Name property.
     */
    Collection<? extends Object> getHas_Abbreviated_Name();

    /**
     * Checks if the class has a has_Abbreviated_Name property value.<p>
     * 
     * @return true if there is a has_Abbreviated_Name property value.
     */
    boolean hasHas_Abbreviated_Name();

    /**
     * Adds a has_Abbreviated_Name property value.<p>
     * 
     * @param newHas_Abbreviated_Name the has_Abbreviated_Name property value to be added
     */
    void addHas_Abbreviated_Name(Object newHas_Abbreviated_Name);

    /**
     * Removes a has_Abbreviated_Name property value.<p>
     * 
     * @param oldHas_Abbreviated_Name the has_Abbreviated_Name property value to be removed.
     */
    void removeHas_Abbreviated_Name(Object oldHas_Abbreviated_Name);



    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
