import controllers.SwitcherController;
import models.Switcher;
import views.SwitcherView;


public class Main {

    public static void main(String[] args) {

        Switcher model = new Switcher();
        SwitcherView view = new SwitcherView(model);
        SwitcherController controller = new SwitcherController(model, view);
        controller.runApp();

    }
}
