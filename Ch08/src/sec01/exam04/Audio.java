package sec01.exam04;

import sec01.exam03.RemoteControl;

public class Audio implements RemoteControl{
	
	private int volume;
	
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOOLUME) {
			this.volume=RemoteControl.MAX_VOOLUME;
		} else if(volume<RemoteControl.MIN_VOOLUME) {
			this.volume=RemoteControl.MIN_VOOLUME;
		} else {
			this.volume=volume;
		}
		
		System.out.println("현재 Audio 볼륨: "+this.volume);
	}
	}
