package com.mediator.components;

import com.mediator.Mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Os componentes de concreto não conversam entre si. Eles têm apenas um canal
 * de comunicação – envio de solicitações ao mediador.
 */
public class SaveButton extends JButton implements Component {

    private Mediator mediator;

    public SaveButton() {
        super("Save");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.saveChanges();
    }

    @Override
    public String getName() {
        return "SaveButton";
    }
}
