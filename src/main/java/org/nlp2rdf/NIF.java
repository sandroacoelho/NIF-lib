package org.nlp2rdf;


import com.hp.hpl.jena.rdf.model.Model;

public interface NIF {

    Model getModel();

    String getNTriples();

    String getRDFxml();

    String getTurtle();

    String getJSONLD(String context);

}
