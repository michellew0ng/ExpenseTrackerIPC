module com.expenseTracker {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.expenseTracker to javafx.fxml;
    exports com.expenseTracker;
}
