module workshop_javafx_jdbc {
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	requires mysql.connector.java;
	
	opens application to javafx.graphics, javafx.fxml;
	opens model.entities to javafx.graphics, javafx.fxml, javafx.base;
	opens gui to javafx.graphics,javafx.fxml;
}