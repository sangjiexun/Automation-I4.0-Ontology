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
 * Source Class: RAMI_Asset_Layer <br>
 * @version generated on Fri Feb 26 14:35:08 COT 2021 by santiago
 */

public interface RAMI_Asset_Layer extends Has_Data_Specification, Has_Kind, Identifiable {

    /* ***************************************************
     * Property http://www.loa-cnr.it/ontologies/DUL.owl#isPartOf
     */
     
    /**
     * Gets all property values for the is_Part_Of property.<p>
     * 
     * @returns a collection of values for the is_Part_Of property.
     */
    Collection<? extends RAMI_Asset_Layer> getIs_Part_Of();

    /**
     * Checks if the class has a is_Part_Of property value.<p>
     * 
     * @return true if there is a is_Part_Of property value.
     */
    boolean hasIs_Part_Of();

    /**
     * Adds a is_Part_Of property value.<p>
     * 
     * @param newIs_Part_Of the is_Part_Of property value to be added
     */
    void addIs_Part_Of(RAMI_Asset_Layer newIs_Part_Of);

    /**
     * Removes a is_Part_Of property value.<p>
     * 
     * @param oldIs_Part_Of the is_Part_Of property value to be removed.
     */
    void removeIs_Part_Of(RAMI_Asset_Layer oldIs_Part_Of);


    /* ***************************************************
     * Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#isCarriedOutIn
     */
     
    /**
     * Gets all property values for the isCarriedOutIn property.<p>
     * 
     * @returns a collection of values for the isCarriedOutIn property.
     */
    Collection<? extends ProcessO> getIsCarriedOutIn();

    /**
     * Checks if the class has a isCarriedOutIn property value.<p>
     * 
     * @return true if there is a isCarriedOutIn property value.
     */
    boolean hasIsCarriedOutIn();

    /**
     * Adds a isCarriedOutIn property value.<p>
     * 
     * @param newIsCarriedOutIn the isCarriedOutIn property value to be added
     */
    void addIsCarriedOutIn(ProcessO newIsCarriedOutIn);

    /**
     * Removes a isCarriedOutIn property value.<p>
     * 
     * @param oldIsCarriedOutIn the isCarriedOutIn property value to be removed.
     */
    void removeIsCarriedOutIn(ProcessO oldIsCarriedOutIn);


    /* ***************************************************
     * Property http://www.semanticweb.org/santiago/Automation-I4.0-Ontology#isVirtualizedIn
     */
     
    /**
     * Gets all property values for the isVirtualizedIn property.<p>
     * 
     * @returns a collection of values for the isVirtualizedIn property.
     */
    Collection<? extends Admin_Shell> getIsVirtualizedIn();

    /**
     * Checks if the class has a isVirtualizedIn property value.<p>
     * 
     * @return true if there is a isVirtualizedIn property value.
     */
    boolean hasIsVirtualizedIn();

    /**
     * Adds a isVirtualizedIn property value.<p>
     * 
     * @param newIsVirtualizedIn the isVirtualizedIn property value to be added
     */
    void addIsVirtualizedIn(Admin_Shell newIsVirtualizedIn);

    /**
     * Removes a isVirtualizedIn property value.<p>
     * 
     * @param oldIsVirtualizedIn the isVirtualizedIn property value to be removed.
     */
    void removeIsVirtualizedIn(Admin_Shell oldIsVirtualizedIn);


    /* ***************************************************
     * Property https://w3id.org/i40/rami#assetIdentificationModel
     */
     
    /**
     * Gets all property values for the has_Asset_Identification_Model property.<p>
     * 
     * @returns a collection of values for the has_Asset_Identification_Model property.
     */
    Collection<? extends Submodel> getHas_Asset_Identification_Model();

    /**
     * Checks if the class has a has_Asset_Identification_Model property value.<p>
     * 
     * @return true if there is a has_Asset_Identification_Model property value.
     */
    boolean hasHas_Asset_Identification_Model();

    /**
     * Adds a has_Asset_Identification_Model property value.<p>
     * 
     * @param newHas_Asset_Identification_Model the has_Asset_Identification_Model property value to be added
     */
    void addHas_Asset_Identification_Model(Submodel newHas_Asset_Identification_Model);

    /**
     * Removes a has_Asset_Identification_Model property value.<p>
     * 
     * @param oldHas_Asset_Identification_Model the has_Asset_Identification_Model property value to be removed.
     */
    void removeHas_Asset_Identification_Model(Submodel oldHas_Asset_Identification_Model);


    /* ***************************************************
     * Property https://w3id.org/i40/rami#hasSubmodel
     */
     
    /**
     * Gets all property values for the has_Submodel property.<p>
     * 
     * @returns a collection of values for the has_Submodel property.
     */
    Collection<? extends Submodel> getHas_Submodel();

    /**
     * Checks if the class has a has_Submodel property value.<p>
     * 
     * @return true if there is a has_Submodel property value.
     */
    boolean hasHas_Submodel();

    /**
     * Adds a has_Submodel property value.<p>
     * 
     * @param newHas_Submodel the has_Submodel property value to be added
     */
    void addHas_Submodel(Submodel newHas_Submodel);

    /**
     * Removes a has_Submodel property value.<p>
     * 
     * @param oldHas_Submodel the has_Submodel property value to be removed.
     */
    void removeHas_Submodel(Submodel oldHas_Submodel);


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
     * Property https://w3id.org/i40/rami#assetId
     */
     
    /**
     * Gets all property values for the id property.<p>
     * 
     * @returns a collection of values for the id property.
     */
    Collection<? extends Object> getId();

    /**
     * Checks if the class has a id property value.<p>
     * 
     * @return true if there is a id property value.
     */
    boolean hasId();

    /**
     * Adds a id property value.<p>
     * 
     * @param newId the id property value to be added
     */
    void addId(Object newId);

    /**
     * Removes a id property value.<p>
     * 
     * @param oldId the id property value to be removed.
     */
    void removeId(Object oldId);



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
