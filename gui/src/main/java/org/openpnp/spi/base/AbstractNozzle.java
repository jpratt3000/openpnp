package org.openpnp.spi.base;

import org.openpnp.spi.Head;
import org.openpnp.spi.Nozzle;
import org.simpleframework.xml.Attribute;

public abstract class AbstractNozzle implements Nozzle {
	@Attribute
    protected String id;
    
    protected Head head;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public Head getHead() {
        return head;
    }

    @Override
    public void setHead(Head head) {
        this.head = head;
    }

}
