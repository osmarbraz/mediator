
import com.mediator.components.AddButton;
import com.mediator.components.DeleteButton;
import com.mediator.Editor;
import com.mediator.components.Filter;
import com.mediator.components.List;
import com.mediator.Mediator;
import com.mediator.components.SaveButton;
import com.mediator.components.TextBox;
import com.mediator.components.Title;
import javax.swing.DefaultListModel;

public class Principal {

    public static void main(String[] args) {
        //Istancia o editor
        Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }

}
