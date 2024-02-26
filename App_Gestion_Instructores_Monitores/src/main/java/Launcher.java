
import java.sql.SQLException;

import Controller.MainViewController;
import View.MainView;

public class Launcher {
        public static void main(String[] args) throws SQLException {
                MainView mainView = new MainView();
                MainViewController c = new MainViewController(mainView);
                c.start();
        }
}
