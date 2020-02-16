
package org.clintrorick.bggxmlapiwrapper.stuff;

import org.clintrorick.bggxmlapiwrapper.Geeklist;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the org.clintrorick.bggxmlapiwrapper package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.clintrorick.bggxmlapiwrapper
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Geeklist }
     *
     */
    public Geeklist createGeeklist() {
        return new Geeklist();
    }

    /**
     * Create an instance of {@link Geeklist.Item }
     *
     */
    public Geeklist.Item createGeeklistItem() {
        return new Geeklist.Item();
    }

}
