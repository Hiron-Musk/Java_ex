package sec01.exam04;

public class SupersonicAirplane extends Airplane{
	public static final int NOMAL=1;
	public static final int SUPERSONOIC=2;
	
	public int flyMode=NOMAL;
	
	@Override
	public void fly() {
		if(flyMode==SUPERSONOIC) {
			System.out.println("초음속비행합니다.");
		}else {
			super.fly();
		}
		
	}
	

}
