package personal;

import personal.controllers.UserController;
import personal.model.*;
import personal.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("/oop_java/homeworks/HW05/src/personal/users.md");
        System.out.println(pathFile);
//        FileOperation fileOperation = new FileOperationImpl("users.txt");
        FileOperation fileOperation = new FileOperationImplMd(pathFile);
        Repository repository = new RepositoryFile(fileOperation);
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}
