package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {

			// JSON AND CSV ADD
			CSVReader csvReader = new CSVReader();
			JSONReader jsonReader = new JSONReader();
			XMLReader xmlReader = new XMLReader();

			// BUTTONS ADD
			Button b1 = new Button("Load CSV");
			Button b2 = new Button("Load XML");
			Button b3 = new Button("Load JSON");


			// LOADING CSV
			EventHandler<ActionEvent> event1 = new EventHandler<ActionEvent>() {
				public void handle(ActionEvent e) {

					BorderPane root = new BorderPane();

					TableView<CSVBean> table = new TableView<CSVBean>();
					TableColumn<CSVBean, String> orderDateCol = new TableColumn<CSVBean, String>("ORDERDATE");
					orderDateCol.setCellValueFactory(new PropertyValueFactory<CSVBean, String>("orderDate"));

					TableColumn<CSVBean, String> regionCol = new TableColumn<CSVBean, String>("REGION");
					regionCol.setCellValueFactory(new PropertyValueFactory<CSVBean, String>("region"));

					TableColumn<CSVBean, String> rep1Col = new TableColumn<CSVBean, String>("REP1");
					rep1Col.setCellValueFactory(new PropertyValueFactory<CSVBean, String>("rep1"));

					TableColumn<CSVBean, String> rep2Col = new TableColumn<CSVBean, String>("REP2");
					rep2Col.setCellValueFactory(new PropertyValueFactory<CSVBean, String>("rep2"));

					TableColumn<CSVBean, String> itemCol = new TableColumn<CSVBean, String>("ITEM");
					itemCol.setCellValueFactory(new PropertyValueFactory<CSVBean, String>("item"));

					TableColumn<CSVBean, Integer> unitsCol = new TableColumn<CSVBean, Integer>("UNITS");
					unitsCol.setCellValueFactory(new PropertyValueFactory<CSVBean, Integer>("units"));

					TableColumn<CSVBean, String> unitCostCol = new TableColumn<CSVBean, String>("UNITCOST");
					unitCostCol.setCellValueFactory(new PropertyValueFactory<CSVBean, String>("unitCost"));

					TableColumn<CSVBean, String> totalCol = new TableColumn<CSVBean, String>("TOTAL");
					totalCol.setCellValueFactory(new PropertyValueFactory<CSVBean, String>("total"));

					table.getColumns().add(orderDateCol);
					table.getColumns().add(regionCol);
					table.getColumns().add(rep1Col);
					table.getColumns().add(rep2Col);
					table.getColumns().add(itemCol);
					table.getColumns().add(unitsCol);
					table.getColumns().add(unitCostCol);
					table.getColumns().add(totalCol);

					table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

					for (int i = 1; i <= csvReader.getOrderDate().size() - 1; i++) {
						int unitsInt = Integer.parseInt(csvReader.getUnits().get(i));

						table.getItems().add(new CSVBean(csvReader.getOrderDate().get(i), csvReader.getRegion().get(i),
								csvReader.getRep1().get(i), csvReader.getRep2().get(i), csvReader.getItem().get(i),
								unitsInt, csvReader.getUnitCost().get(i), csvReader.getTotal().get(i)));
					}

					root.setCenter(table);

					Scene scene = new Scene(root, 600, 600);
					primaryStage.setTitle("CSV TABLE");
					primaryStage.setScene(scene);
					primaryStage.show();

				}

			};
			
			
			// LOADING XML
			EventHandler<ActionEvent> event2 = new EventHandler<ActionEvent>() {
				public void handle(ActionEvent e) {
					BorderPane root = new BorderPane();

					TableView<XMLBean> table = new TableView<XMLBean>();
					TableColumn<XMLBean, String> orderDateCol = new TableColumn<XMLBean, String>("ORDERDATE");
					orderDateCol.setCellValueFactory(new PropertyValueFactory<XMLBean, String>("orderDate"));

					TableColumn<XMLBean, String> regionCol = new TableColumn<XMLBean, String>("REGION");
					regionCol.setCellValueFactory(new PropertyValueFactory<XMLBean, String>("region"));

					TableColumn<XMLBean, String> rep1Col = new TableColumn<XMLBean, String>("REP1");
					rep1Col.setCellValueFactory(new PropertyValueFactory<XMLBean, String>("rep1"));

					TableColumn<XMLBean, String> rep2Col = new TableColumn<XMLBean, String>("REP2");
					rep2Col.setCellValueFactory(new PropertyValueFactory<XMLBean, String>("rep2"));

					TableColumn<XMLBean, String> itemCol = new TableColumn<XMLBean, String>("ITEM");
					itemCol.setCellValueFactory(new PropertyValueFactory<XMLBean, String>("item"));

					TableColumn<XMLBean, Integer> unitsCol = new TableColumn<XMLBean, Integer>("UNITS");
					unitsCol.setCellValueFactory(new PropertyValueFactory<XMLBean, Integer>("units"));

					TableColumn<XMLBean, String> unitCostCol = new TableColumn<XMLBean, String>("UNITCOST");
					unitCostCol.setCellValueFactory(new PropertyValueFactory<XMLBean, String>("unitCost"));

					TableColumn<XMLBean, String> totalCol = new TableColumn<XMLBean, String>("TOTAL");
					totalCol.setCellValueFactory(new PropertyValueFactory<XMLBean, String>("total"));

					table.getColumns().add(orderDateCol);
					table.getColumns().add(regionCol);
					table.getColumns().add(rep1Col);
					table.getColumns().add(rep2Col);
					table.getColumns().add(itemCol);
					table.getColumns().add(unitsCol);
					table.getColumns().add(unitCostCol);
					table.getColumns().add(totalCol);

					table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

					for (int i = 1; i <= xmlReader.getOrderDate().size() - 1; i++) {
						int unitsInt = Integer.parseInt(xmlReader.getUnits().get(i));

						table.getItems()
								.add(new XMLBean(jsonReader.getOrderDate().get(i), xmlReader.getRegion().get(i),
										xmlReader.getRep1().get(i), xmlReader.getRep2().get(i),
										xmlReader.getItem().get(i), unitsInt, xmlReader.getUnitCost().get(i),
										xmlReader.getTotal().get(i)));
					}

					root.setCenter(table);

					Scene scene = new Scene(root, 600, 600);
					primaryStage.setTitle("XML TABLE");
					primaryStage.setScene(scene);
					primaryStage.show();

				}
			};

			// LOADING JSON
			EventHandler<ActionEvent> event3 = new EventHandler<ActionEvent>() {
				public void handle(ActionEvent e) {
					BorderPane root = new BorderPane();

					TableView<JSONBean> table = new TableView<JSONBean>();
					TableColumn<JSONBean, String> orderDateCol = new TableColumn<JSONBean, String>("ORDERDATE");
					orderDateCol.setCellValueFactory(new PropertyValueFactory<JSONBean, String>("orderDate"));

					TableColumn<JSONBean, String> regionCol = new TableColumn<JSONBean, String>("REGION");
					regionCol.setCellValueFactory(new PropertyValueFactory<JSONBean, String>("region"));

					TableColumn<JSONBean, String> rep1Col = new TableColumn<JSONBean, String>("REP1");
					rep1Col.setCellValueFactory(new PropertyValueFactory<JSONBean, String>("rep1"));

					TableColumn<JSONBean, String> rep2Col = new TableColumn<JSONBean, String>("REP2");
					rep2Col.setCellValueFactory(new PropertyValueFactory<JSONBean, String>("rep2"));

					TableColumn<JSONBean, String> itemCol = new TableColumn<JSONBean, String>("ITEM");
					itemCol.setCellValueFactory(new PropertyValueFactory<JSONBean, String>("item"));

					TableColumn<JSONBean, Integer> unitsCol = new TableColumn<JSONBean, Integer>("UNITS");
					unitsCol.setCellValueFactory(new PropertyValueFactory<JSONBean, Integer>("units"));

					TableColumn<JSONBean, String> unitCostCol = new TableColumn<JSONBean, String>("UNITCOST");
					unitCostCol.setCellValueFactory(new PropertyValueFactory<JSONBean, String>("unitCost"));

					TableColumn<JSONBean, String> totalCol = new TableColumn<JSONBean, String>("TOTAL");
					totalCol.setCellValueFactory(new PropertyValueFactory<JSONBean, String>("total"));

					table.getColumns().add(orderDateCol);
					table.getColumns().add(regionCol);
					table.getColumns().add(rep1Col);
					table.getColumns().add(rep2Col);
					table.getColumns().add(itemCol);
					table.getColumns().add(unitsCol);
					table.getColumns().add(unitCostCol);
					table.getColumns().add(totalCol);

					table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

					for (int i = 1; i <= jsonReader.getOrderDate().size() - 1; i++) {
						int unitsInt = Integer.parseInt(csvReader.getUnits().get(i));

						table.getItems()
								.add(new JSONBean(jsonReader.getOrderDate().get(i), jsonReader.getRegion().get(i),
										jsonReader.getRep1().get(i), jsonReader.getRep2().get(i),
										jsonReader.getItem().get(i), unitsInt, jsonReader.getUnitCost().get(i),
										jsonReader.getTotal().get(i)));
					}

					root.setCenter(table);

					Scene scene = new Scene(root, 600, 600);
					primaryStage.setTitle("JSON TABLE");
					primaryStage.setScene(scene);
					primaryStage.show();

				}
			};
			
			b1.setLayoutX(0);
			b2.setLayoutX(100);
			b3.setLayoutX(200);

			b1.setOnAction(event1);
			b2.setOnAction(event2);
			b3.setOnAction(event3);

	
			primaryStage.setTitle("CSV, JSON & XML READER");
			Group root = new Group();
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);

			// BUTTONS
			root.getChildren().add(b1);
			root.getChildren().add(b2);
			root.getChildren().add(b3);


			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		launch(args);

	}
}
