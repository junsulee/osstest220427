
public class VulnLevelModel implements Comparable<VulnLevelModel> {
	
	// Vulneravility Level
	String level;
	// vuln. count
	int cnt;
	// ratio by total
	double ratio;
	int orderPoint;
	int order;
	
	
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public double getRatio() {
		return ratio;
	}
	public void setRatio(double ratio) {
		this.ratio = ratio;
	}
	public int getOrderPoint() {
		return orderPoint;
	}
	public void setOrderPoint(int orderPoint) {
		this.orderPoint = orderPoint;
	}
	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}
	
	
	@Override
	public int compareTo(VulnLevelModel vulnModel) {
		return vulnModel.getOrderPoint() - getOrderPoint();
	}
}
