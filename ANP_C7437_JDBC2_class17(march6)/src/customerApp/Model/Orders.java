package customerApp.Model;

public class Orders {
	private int orderId;
	
	private String orderName;
	
	private double orderValue;
	
	private int cusId;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public double getOrderValue() {
		return orderValue;
	}

	public void setOrderValue(double orderValue) {
		this.orderValue = orderValue;
	}

	public int getCusId() {
		return cusId;
	}

	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	
	public Orders()
	{
		
	}

//	public Orders(int orderId, String orderName, double orderValue, int cusId) {
	public Orders(String orderName, double orderValue, int cusId) {
		super();
//		this.orderId = orderId;
		this.orderName = orderName;
		this.orderValue = orderValue;
		this.cusId = cusId;
	}

	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", orderName=" + orderName + ", orderValue=" + orderValue + ", cusId="
				+ cusId + "]";
	}
	
	
}
