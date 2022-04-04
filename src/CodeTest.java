import java.util.ArrayList;
import java.util.Collections;

public class CodeTest {
	
	public static void main(String[] args) {
		
		// 4, 16, 1, 1
		int critical = 4;
		int high = 16;
		int medium = 1;
		int low = 1;
		
		// TEST : all zero
//		critical=0; high=0; medium=0; low=0;
		
		test(critical, high, medium, low);
	}
	
	
	public static void test(int critical, int high, int medium, int low) {
		int total = critical + high + medium + low;
		double criticalRatio = (double)critical/(double)total*100.0;
		double highRatio = (double)high/(double)total*100.0;
		double mediumRatio = (double)medium/(double)total*100.0;
		double lowRatio = (double)low/(double)total*100.0;
		
		System.out.println(criticalRatio + " / " + highRatio + " / " + mediumRatio + " / " + lowRatio);
		System.out.println(String.format("%.1f", criticalRatio) + " / " + String.format("%.1f", highRatio) + " / " + String.format("%.1f", mediumRatio) + " / " + String.format("%.1f", lowRatio));
		System.out.println((int)criticalRatio + " / " + (int)highRatio + " / " + (int)mediumRatio + " / " + (int)lowRatio);
		
		int gap = 100 - ((int)criticalRatio + (int)highRatio + (int)mediumRatio + (int)lowRatio);
		System.out.println("gap : " + gap);
		
		// TEST
//		gap = 2;
		
		double add = gap / 4.0;
		System.out.println("add : " + add);
		System.out.println();
		
		criticalRatio = (int)criticalRatio + add;
		highRatio = (int)highRatio + add;
		mediumRatio = (int)mediumRatio + add;
		lowRatio = (int)lowRatio + add;
//		System.out.println((int)criticalRatio + " / " + (int)highRatio + " / " + (int)mediumRatio + " / " + (int)lowRatio);
		System.out.println(String.format("%.2f", criticalRatio) + " / " + String.format("%.2f", highRatio) + " / " + String.format("%.2f", mediumRatio) + " / " + String.format("%.2f", lowRatio));
		System.out.println(Double.parseDouble(String.format("%.2f", criticalRatio)) + Double.parseDouble(String.format("%.2f", highRatio)) + Double.parseDouble(String.format("%.2f", mediumRatio)) + Double.parseDouble(String.format("%.2f", lowRatio)));
		System.out.println("취약점 갯수 : " + total + String.format(" (Critical: %s%%, High: %s%%, Medium %s%%, Low: %s%%)\n"
    			,String.format("%.2f", criticalRatio)
    			,String.format("%.2f", highRatio)
    			,String.format("%.2f", mediumRatio)
    			,String.format("%.2f", lowRatio)
    			));
	}
	
	
//	public static void test(int critical, int high, int medium, int low) {
//		int total = critical + high + medium + low;
//		
//		ArrayList<VulnLevelModel> arrLevellist = new ArrayList<VulnLevelModel>();
//		
//		VulnLevelModel criticalModel = new VulnLevelModel();
//		VulnLevelModel highModel = new VulnLevelModel();
//		VulnLevelModel mediumModel = new VulnLevelModel();
//		VulnLevelModel lowModel = new VulnLevelModel();
//		
//		criticalModel.setLevel("Critical");
//		highModel.setLevel("High");
//		mediumModel.setLevel("Medium");
//		lowModel.setLevel("Low");
//		
//		criticalModel.setCnt(critical);
//		highModel.setCnt(high);
//		mediumModel.setCnt(medium);
//		lowModel.setCnt(low);
//		
//		criticalModel.setRatio((double)critical / (double)total * 100);
//		highModel.setRatio((double)high / (double)total * 100);
//		mediumModel.setRatio((double)medium / (double)total * 100);
//		lowModel.setRatio((double)low / (double)total * 100);
//		
//		double critical_ratio = ((double)critical / (double)total * 100);
//		double high_ratio = ((double)high / (double)total * 100);
//		double medium_ratio = ((double)medium / (double)total * 100);
//		double low_ratio = ((double)low / (double)total * 100);
//		
//		
//		String criticalRatioStr = String.format("%f", critical_ratio);
//		String hithRatioStr = String.format("%f", high_ratio);
//		String mediumRatioStr = String.format("%f", medium_ratio);
//		String lowRatioStr = String.format("%f", low_ratio);
//		
//		criticalModel.setOrderPoint( Integer.parseInt(String.valueOf(criticalRatioStr.charAt(criticalRatioStr.indexOf(".") + 1))) );
//		highModel.setOrderPoint( Integer.parseInt(String.valueOf(hithRatioStr.charAt(hithRatioStr.indexOf(".") + 1))) );
//		mediumModel.setOrderPoint( Integer.parseInt(String.valueOf(mediumRatioStr.charAt(mediumRatioStr.indexOf(".") + 1))) );
//		lowModel.setOrderPoint( Integer.parseInt(String.valueOf(lowRatioStr.charAt(lowRatioStr.indexOf(".") + 1))) );
//		
//		System.out.println(criticalModel.getOrderPoint());
//		System.out.println(highModel.getOrderPoint());
//		System.out.println(mediumModel.getOrderPoint());
//		System.out.println(lowModel.getOrderPoint());
//		
//		arrLevellist.add(criticalModel);
//		arrLevellist.add(highModel);
//		arrLevellist.add(mediumModel);
//		arrLevellist.add(lowModel);
//		
//		Collections.sort(arrLevellist);
//		
//		for(VulnLevelModel m : arrLevellist) {
//			System.out.println(m.getLevel() + " / " + m.getOrderPoint());
//		}
//		System.out.println("\nBEFORE ===========================================");
//		System.out.println(String.format("%f, %f, %f, %f", criticalModel.getRatio(), highModel.getRatio(), mediumModel.getRatio(), lowModel.getRatio()));
//		System.out.println(String.format("%d%% %d%%, %d%%, %d%%", (int)criticalModel.getRatio(), (int)highModel.getRatio(), (int)mediumModel.getRatio(), (int)lowModel.getRatio()) + " (" + ((int)criticalModel.getRatio() + (int)highModel.getRatio() + (int)mediumModel.getRatio() + (int)lowModel.getRatio()) + ")");
//		
//		System.out.println("\nAFTER ===========================================");
//		int gap = 100 - ((int)critical_ratio + (int)high_ratio + (int)medium_ratio + (int)low_ratio);
//		System.out.println("gap : " + gap);
//		for(int i=0; i<gap; i++) {
//			VulnLevelModel m = arrLevellist.get(i);
//			m.setRatio((int)m.getRatio() + 1);
//		}
//		for(VulnLevelModel m : arrLevellist) {
//			System.out.print(m.getLevel() + ":" + (int)m.getRatio() + " / ");
//		}
//	}

}
