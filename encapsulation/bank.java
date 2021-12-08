package encapsulation;

public class bank {
 private String name;
 private long acc_num;
 private String ifsc_code;
 public void getName()
 {
	 
 }
 public void setName(String name)
 {
	 this.name=name;
 }
 public void getAcc_num()
 {
	
 }
 public void setAcc_num(long acc_num)
 {
	 this.acc_num=acc_num;
 }
 public void getIfsc_code()
 {
	 
 }
 public void setIfsc_code(String ifsc_code)
 {
	 this.ifsc_code=ifsc_code;
 }
 public String toString()
 {
	 return name+"\t"+acc_num+"\t"+ifsc_code;
 }
 public static void main(String[] args) {
	bank b=new bank();
	b.setName("chandu");
	b.setAcc_num(52525252);
	b.setIfsc_code("ndgdg12321");
	b.getName();
	b.getAcc_num();
	b.getIfsc_code();
	bank b1=new bank();
	b1.setName("sam");
	b1.setAcc_num(525252);
	b1.setIfsc_code("ndg12321");
	b1.getName();
	b1.getAcc_num();
	b1.getIfsc_code();
	bank[] x={b,b1};
	System.out.println("name"+"\t"+"accountnumber"+"\t"+"ifsccode");
	for(int i=0;i<x.length;i++)
	{
		System.out.println(x[i]);
	}
}
}
