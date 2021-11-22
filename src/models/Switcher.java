package models;

import controllers.ClientController;
import controllers.EmployeeController;
import controllers.SupplierController;
import views.ClientView;
import views.EmployeeView;
import views.SupplierView;

public class Switcher {

    private int controllerType;

    public int getControllerType() {
        return controllerType;
    }

    public void setControllerType(int controllerType) {
        this.controllerType = controllerType;
    }

    public void runClient() {
        Client model = new Client();
        ClientView view = new ClientView(model);
        ClientController controller = new ClientController(model, view);
        controller.runApp();
    }

    public void runEmployee() {
        Employee model = new Employee();
        EmployeeView view = new EmployeeView(model);
        EmployeeController controller = new EmployeeController(model, view);
        controller.runApp();
    }

    public void runSupplier() {
        Supplier model = new Supplier();
        SupplierView view = new SupplierView(model);
        SupplierController controller = new SupplierController(model, view);
        controller.runApp();
    }
}
