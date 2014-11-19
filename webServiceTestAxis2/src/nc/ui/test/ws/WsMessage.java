package nc.ui.test.ws;

import org.apache.axis2.wsdl.WSDL2Java;

public class WsMessage {
	public static void main(String[] args) {
//		String wsdl = "http://10.10.8.85/uapws/service/nc.pubitf.tjufitf.basicitf.pub.IDataReceipt?wsdl";
		String wsdl = "http://10.9.7.30:8080/oms/dwzl?wsdl";
		try {
			WSDL2Java.main(new String[] { "-ssi", "-ap", "f", "--noBuildXML",
					"-uri", wsdl });
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	}
