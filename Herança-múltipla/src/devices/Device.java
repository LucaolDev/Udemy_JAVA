package devices;

public abstract class Device {

	public String serialNumber;

	public Device(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public abstract void processDoc(String doc);
}
