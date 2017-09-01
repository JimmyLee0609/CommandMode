package com.java.jikexueyuan.commandmode.command;

import com.java.jikexueyuan.commandmode.device.Stereo;

public class StereoSubVolCommand implements Command {
	private Stereo setreo;
	public StereoSubVolCommand(Stereo setreo)
	{
		this.setreo=setreo;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
	int vol=	setreo.GetVol();
	if(vol>0)
	{
		setreo.SetVol(--vol);
	}
		
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
	int vol=	setreo.GetVol();
	if(vol<11)
	{
		setreo.SetVol(++vol);
	}
		
	}

}
