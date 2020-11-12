package com.macnellServer;

import javax.ejb.Local;

@Local
public interface ExampleServerLocal {
	public String getMsg();
}
