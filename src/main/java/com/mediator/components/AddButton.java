package com.mediator.components;

import com.mediator.Mediator;
import com.mediator.Note;
import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Os componentes concretos não conversam entre si. Eles têm apenas um canal de
 * comunicação – envio de solicitações ao mediador.
 */
public class AddButton extends JButton implements Component {

    private Mediator mediator;

    public AddButton() {
        super("Add");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.addNewNote(new Note());
    }

    @Override
    public String getName() {
        return "AddButton";
    }
}
