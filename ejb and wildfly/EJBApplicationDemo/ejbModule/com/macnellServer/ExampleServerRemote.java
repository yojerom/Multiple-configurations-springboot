package com.macnellServer;

import javax.ejb.Remote;

@Remote
public interface ExampleServerRemote {
	public String getMsg();
}
