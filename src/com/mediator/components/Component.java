package com.mediator.components;

import com.mediator.Mediator;

/**
 * Interface comum aos componente.
 */
public interface Component {

    void setMediator(Mediator mediator);

    String getName();
}
