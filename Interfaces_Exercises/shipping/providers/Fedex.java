package providers;

public class Fedex implements ShippingProvider {
	@Override
	public Shipping calculateShipping(double weight, double value) {
		if (weight > 1000)
			return new Shipping(value * 0.10, getShippingProviderType());
		else
			return new Shipping(value * 0.05, getShippingProviderType());
	}

	@Override
	public ShippingProviderType getShippingProviderType() {
		return ShippingProviderType.FEDEX;
	}
}
