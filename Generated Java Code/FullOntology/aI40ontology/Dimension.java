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
 * Source Class: Dimension <br>
 * @version generated on Mon Feb 22 13:47:49 COT 2021 by sagga
 */

public interface Dimension extends WrappedIndividual {

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
