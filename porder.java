package Model;

public class porder {
	private Integer porderId;
	private Integer memberId;
	private Integer rstrId;
	private Integer foodId;
	//private Integer sum;
	public porder() {
		super();
		
	}
	
	public porder(Integer memberId, Integer rstrId, Integer foodId) {
		super();
		this.memberId = memberId;
		this.rstrId = rstrId;
		this.foodId = foodId;
		
		
	}

	public Integer getPorderId() {
		return porderId;
	}

	public void setPorderId(Integer porderId) {
		this.porderId = porderId;
	}

	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public Integer getRstrId() {
		return rstrId;
	}

	public void setRstrId(Integer rstrId) {
		this.rstrId = rstrId;
	}

	public Integer getFoodId() {
		return foodId;
	}

	public void setFoodId(Integer foodId) {
		this.foodId = foodId;
	}

	/*public Integer getSum() {
		return sum;
	}

	public void setSum(Integer sum) {
		this.sum = sum;
	}*/

	
	
	
}
