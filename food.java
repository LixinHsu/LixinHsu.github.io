package Model;

public class food {
	private Integer foodId;
	private Integer rstrId;
	private String foodName;
	public food() {
		super();
		
	}
	
	public food(Integer rstrId, String foodName) {
		super();
		this.rstrId = rstrId;
		this.foodName = foodName;
	}

	public Integer getFoodId() {
		return foodId;
	}
	public void setFoodId(Integer foodId) {
		this.foodId = foodId;
	}
	public Integer getRstrId() {
		return rstrId;
	}
	public void setRstrId(Integer rstrId) {
		this.rstrId = rstrId;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	
	
}
