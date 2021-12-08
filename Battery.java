
public class Battery {
String brand;
double mah;
 double volt;
public Battery(String brand, double mah, double volt) {
	super();
	this.brand = brand;
	this.mah = mah;
	this.volt = volt;
}
@Override
public String toString() {
	return "Battery [brand=" + brand + ", mah=" + mah + ", volt=" + volt + "]";
}

}
