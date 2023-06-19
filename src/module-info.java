module Test_Deploy {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens application to javafx.graphics, javafx.fxml;
}
