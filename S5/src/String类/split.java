package String类;

public class split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("jianfaifjaskjfafj");
		String[] s_new = s1.split("f");					//按照字符“f”切割，不限制次数
		for(String x : s_new){
			System.out.println(x);
		}
		
		
		System.out.println();
		String[] s_new2 = s1.split("f",3);				//按照字符“f”分割，限制切3次
		for(String x : s_new2){
			System.out.println(x);
		}
	}

}
