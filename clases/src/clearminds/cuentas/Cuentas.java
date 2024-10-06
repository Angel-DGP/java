package clearminds.cuentas;

public class Cuentas {
	private String Id;
	private String Tipo;
	private double Saldo;
	
	public String getId() {
		return Id;
	}
	
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	public double getSaldo() {
		return Saldo;
	}
	public void setSaldo(double saldo) {
		Saldo = saldo;
	}
	
	public Cuentas(String Id) {
		this.Id = Id;
		this.Tipo = "A";
	}
	
	public Cuentas(String Id, String Tipo, double Saldo) {
		this.Id = Id;
		setTipo(Tipo);
		setSaldo(Saldo);
	}
	
	public void ImprimirCuentas() {
		System.out.println("");
		System.out.println("**************");
		System.out.println("CUENTA");
		System.out.println("**************");
		System.out.println("Numero de cuenta: " + getId());
		System.out.println("Tipo: " + getTipo());
		System.out.println("Saldo: USD " + getSaldo());
		System.out.println("**************");
		System.out.println("");
	}
	public void ImprimirConMiEstilo() {
		System.out.println("");
		System.out.println("---------------");
		System.out.println("DATOS DE CUENTA");
		System.out.println("---------------");
		System.out.println("Numero de cuenta: " + getId());
		System.out.println("Tipo: " + getTipo());
		System.out.println("Saldo: " + getSaldo() + "$");
		System.out.println("---------------");
		System.out.println("");
	}
}
