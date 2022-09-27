package clasesesWithAttribute;

public class Product {

	public Product(int id, String name, String description, double price, int stockAmount, String renk ) {
		System.out.println("Yapıcı blok çalıştı");
		this._id = id;
		this._renk = renk;
		this._name = name;
		this._price = price;
		this._description = description;
		this._stockAmount = stockAmount;
	}
	
	public Product() {
		
	}
	
	
	// attribute | field
	private int _id;
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	private String _renk;
	private String _kod;
	
	// Getter
	public int get_id() {
		return _id;
	}
	//Setter
	public void set_id(int _id) {
		this._id = _id;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public String get_description() {
		return _description;
	}

	public void set_description(String _description) {
		this._description = _description;
	}

	public double get_price() {
		return _price;
	}

	public void set_price(double _price) {
		this._price = _price;
	}

	public int get_stockAmount() {
		return _stockAmount;
	}

	public void set_stockAmount(int _stockAmount) {
		this._stockAmount = _stockAmount;
	}

	public String get_renk() {
		return _renk;
	}

	public void set_renk(String _renk) {
		this._renk = _renk;
	}

	public String get_kod() {
		return this._name.substring(0,1) + _id;
	}

	public void set_kod(String _kod) {
		this._kod = _kod;
	}

}
