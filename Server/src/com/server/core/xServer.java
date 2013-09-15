package com.server.core;

public class xServer {

	private IServerMonitor mMonitor;
	private IServerManager mManager;
	
	public void Start()
	{
		mMonitor.OnServerStart();
		mManager.OnServerStart();
	}
	
	public void Stop()
	{
		mMonitor.OnServerStop();
		mManager.OnServerStop();
	}
	
	public void Restart()
	{
		mMonitor.OnServerRestart();
		mManager.OnServerRestart();
	}
	
	
}
