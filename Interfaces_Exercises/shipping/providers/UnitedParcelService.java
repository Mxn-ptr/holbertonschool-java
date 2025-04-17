package providers;

public class UnitedParcelService implements ShippingProvider {
	@Override
	public Shipping calculateShipping(double weight, double value) {
		if (weight > 2000)
			return new Shipping(value * 0.07, getShippingProviderType());
		else
			return new Shipping(value * 0.045, getShippingProviderType());
	}

	@Override
	public ShippingProviderType getShippingProviderType() {
		return ShippingProviderType.UPS;
	}
}
