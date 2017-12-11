/*
*Wendy Mei
*CISC 3150
*Homework 10
* Plugin One
*/
import java.util.*;
public class PluginOne extends myplugin{
	public PluginOne(){}
	@Override
	public void whoSaysHello(){
		System.out.println("plugin one says hello");
	}
	@Override
        public void whoSaysBye(){
		System.out.println("plugin one says bye");
	}
}
