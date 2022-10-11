module Plantilla {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	requires java.logging;
	requires java.desktop;
	
	opens controller to javafx.fxml;
	opens application to javafx.graphics, javafx.fxml;
}
