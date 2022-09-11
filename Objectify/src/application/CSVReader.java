package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVReader {

	File file = new File("src/files/sample.csv");
	Scanner scan = new Scanner(System.in);

	public String printCSV() {
		try {
			scan = new Scanner(file);
			String line = "";

			while (scan.hasNext()) {
				ArrayList<String> row = new ArrayList<String>();
				row.add(scan.nextLine());

				for (var order : row) {
					line += "[" + order + "]" + "\n";
				}

			}

			return line;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	// Order Date
	public ArrayList<String> getOrderDate() {
		try {
			scan = new Scanner(file);
			ArrayList<String> Orderdate = new ArrayList<String>();
			while (scan.hasNext()) {
				ArrayList<String> row = new ArrayList<String>();
				row.add(scan.nextLine());

				for (var order : row) {
					String[] arr = order.split(",");
					String orderDate = arr[0];
					Orderdate.add(orderDate);
				}
			}
			return Orderdate;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	// Region
	public ArrayList<String> getRegion() {
		try {
			scan = new Scanner(file);
			ArrayList<String> Region = new ArrayList<String>();
			while (scan.hasNext()) {
				ArrayList<String> row = new ArrayList<String>();
				row.add(scan.nextLine());

				for (var order : row) {
					String[] arr = order.split(",");
					String region = arr[1];
					Region.add(region);
				}
			}
			return Region;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	// Rep1
	public ArrayList<String> getRep1() {
		try {
			scan = new Scanner(file);
			ArrayList<String> Rep1 = new ArrayList<String>();
			while (scan.hasNext()) {
				ArrayList<String> row = new ArrayList<String>();
				row.add(scan.nextLine());

				for (var order : row) {
					String[] arr = order.split(",");
					String rep1 = arr[2];
					Rep1.add(rep1);
				}
			}
			return Rep1;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	// Rep2
	public ArrayList<String> getRep2() {
		try {
			scan = new Scanner(file);
			ArrayList<String> Rep2 = new ArrayList<String>();
			while (scan.hasNext()) {
				ArrayList<String> row = new ArrayList<String>();
				row.add(scan.nextLine());

				for (var order : row) {
					String[] arr = order.split(",");
					String rep2 = arr[3];
					Rep2.add(rep2);
				}
			}
			return Rep2;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	// Item
	public ArrayList<String> getItem() {
		try {
			scan = new Scanner(file);
			ArrayList<String> Item = new ArrayList<String>();
			while (scan.hasNext()) {
				ArrayList<String> row = new ArrayList<String>();
				row.add(scan.nextLine());

				for (var order : row) {
					String[] arr = order.split(",");
					String item = arr[4];
					Item.add(item);
				}
			}
			return Item;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	// Units
	public ArrayList<String> getUnits() {
		try {
			scan = new Scanner(file);
			ArrayList<String> Units = new ArrayList<String>();
			while (scan.hasNext()) {
				ArrayList<String> row = new ArrayList<String>();
				row.add(scan.nextLine());

				for (var order : row) {
					String[] arr = order.split(",");
					String units = arr[5];
					Units.add(units);
				}
			}
			return Units;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	// Unit Cost
	public ArrayList<String> getUnitCost() {
		try {
			scan = new Scanner(file);
			ArrayList<String> Unitcost = new ArrayList<String>();
			while (scan.hasNext()) {
				ArrayList<String> row = new ArrayList<String>();
				row.add(scan.nextLine());

				for (var order : row) {
					String[] arr = order.split(",");
					String unitcost = arr[6];
					Unitcost.add(unitcost);
				}
			}
			return Unitcost;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	// Total
	public ArrayList<String> getTotal() {
		try {
			scan = new Scanner(file);
			ArrayList<String> Total = new ArrayList<String>();
			while (scan.hasNext()) {
				ArrayList<String> row = new ArrayList<String>();
				row.add(scan.nextLine());

				for (var order : row) {
					String[] arr = order.split(",", 8);
					String total = arr[7];
					total = total.replaceAll("\"", "");
					total = total.replaceAll(",", ".");
					Total.add(total);
				}
			}
			return Total;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
}
